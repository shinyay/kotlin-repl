fun doLet() {

    val function_definition = """
        [let definition]
        public inline fun <T, R> T.let(f: (T) -> R): R = f(this)

    """.trimIndent()

    println(function_definition)

    val s = "Lorem ipsum dolor sit amet".let { it.toLowerCase() }
    println(s)
}

fun doLetNullable(arg: String? = null) {

    arg?.let{
        println("toUpperCase")
        println(it.toUpperCase())
    }

}