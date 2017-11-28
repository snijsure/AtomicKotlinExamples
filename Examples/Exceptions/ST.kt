// Exceptions/ST.kt
// Console stack trace
import atomictest.*

fun main(args: Array<String>) {
  stacktrace {
    null!!
  } eq """
kotlin.KotlinNullPointerException
at STKt${'$'}main${'$'}1.invoke(ST.kt:7)
at STKt${'$'}main${'$'}1.invoke(ST.kt)
at atomictest
.stacktrace.invoke(AtomicTest.kt:75)
at STKt.main(ST.kt:6)
"""
}
