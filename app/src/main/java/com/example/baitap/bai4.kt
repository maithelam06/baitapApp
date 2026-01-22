import kotlinx.coroutines.*
// 1. Khai báo hàm tạm ngưng
suspend fun getValue(): Double {
    delay(500) // giả lập tác vụ lâu
    return 10.5
}

// 2. Gọi hàm tạm ngưng từ một hàm tạm ngưng khác
suspend fun processValue() {
    val value = getValue()
    println("Processed value = ${value * 2}")
}

// 3. Khai báo một đối tượng (Singleton)
object DataProviderManager {
    fun getData(): String = "Hello from DataProviderManager"
}

// 4. Tạo một lớp enum
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

fun main() = runBlocking {

    println("---")

    // Chạy hàm suspend trong GlobalScope (demo)
    val jobGlobal: Job = GlobalScope.launch {
        val output = getValue()
        println("GlobalScope output = $output")
    }

    // Truy cập Job (tác vụ coroutine)
    val job: Job = launch {
        val output = getValue()
        println("Job output = $output")
    }

    // Hủy một tác vụ coroutine
    delay(100)
    job.cancel()
    println("Job cancelled = ${job.isCancelled}")

    // Chạy hàm suspend và chặn luồng hiện tại
    val outputBlocking = getValue()
    println("runBlocking output = $outputBlocking")

    // Chạy không đồng bộ bằng async / await
    val deferred: Deferred<Double> = async { getValue() }
    println("Output is ${deferred.await()}")

    // Gọi suspend trong suspend
    processValue()

    // Đợi GlobalScope hoàn thành
    jobGlobal.join()

    println("\n KHAC: OBJECT / TRY-CATCH / ENUM ")

    // Object (Singleton)
    println(DataProviderManager.getData())

    // Phát hiện ngoại lệ
    try {
        val x = 10 / 0
        println("x = $x")
    } catch (exception: Exception) {
        println("Caught exception: ${exception.message}")
    }

    // Truy cập enum
    val direction = Direction.NORTH

    // Kiểm tra enum bằng when
    when (direction) {
        Direction.NORTH -> println("Direction: NORTH")
        Direction.SOUTH -> println("Direction: SOUTH")
        Direction.WEST  -> println("Direction: WEST")
        Direction.EAST  -> println("Direction: EAST")
    }
}
