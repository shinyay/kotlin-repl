fun doApply() {

    val function_definition = """
        [apply definition]
        public inline fun <T> T.apply(f: T.() -> Unit): T { f(); return this }

    """.trimIndent()

    println(function_definition)

    val s = "Lorem ipsum dolor sit amet".apply { toUpperCase() }
    println(s)
}
