import java.io.File

fun ls_R(dir: String = "src") {
    File(dir).walkTopDown().forEach { println(it) }
}
