fun doAlso() {

    val function_definition = """
        [also definition]
        public inline fun <T> T.also(block: (T) -> Unit): T { block(this); return this }

    """.trimIndent()

    println(function_definition)

    val s = "Lorem ipsum dolor sit amet".also { it.toLowerCase() }
    println(s)
}
