val numberList = listOf(1, 2, 3, 4, 5, 6);
val evenList = listOf(0, "A", 1, "B", 2, "C")
val oddList = listOf(0, "A", 1, "B", 2, "C", 3)

fun <T> listGroupByWithIndex(list: List<T>) = list.withIndex()
            .groupBy { it.index / 2 }
            .map { entry -> entry.value.map {it.value} }