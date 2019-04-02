fun doWith() {

    val function_definition = """
        [with definition]
        public inline fun <T, R> with(receiver: T, f: T.() -> R): R = receiver.f()

    """.trimIndent()

    println(function_definition)

    val s = with("Lorem ipsum dolor sit amet") { this.reversed() }
    println(s)
}
