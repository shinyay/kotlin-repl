import java.io.File

fun ls_R(dir: String = getCurrentDir()) {
    File(dir).walkTopDown().forEach { println(it) }
}

fun getCurrentDir() = File(".").absoluteFile.parent
