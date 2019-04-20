val numberList = listOf(1, 2, 3, 4, 5, 6);
val evenList = listOf(0, "A", 1, "B", 2, "C")
val oddList = listOf(0, "A", 1, "B", 2, "C", 3)

fun <T> listGroupByWithIndex(list: List<T>) = list.withIndex()
            .groupBy { it.index / 2 }
            .map { entry -> entry.value
                    .map { it.value }
            }

fun <T> listChunked(list: List<T>) = list.chunked(2)

fun <T> listChunkedWithParameters(list: List<T>, size: Int) = list.chunked(size)

fun <T> listWindowed(list: List<T>, size: Int = 2, step: Int = 2, partialWindows: Boolean = false) {
    println("List.windowed(size, step, partialWindows)")
    println(list.windowed(size, step, partialWindows))
}