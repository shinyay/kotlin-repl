fun doRun() {

    val function_definition = """
        [run definition]
        public inline fun <T, R> T.run(f: T.() -> R): R = f()

    """.trimIndent()

    println(function_definition)

    val s = "Lorem ipsum dolor sit amet".run { toUpperCase() }
    println(s)
}
