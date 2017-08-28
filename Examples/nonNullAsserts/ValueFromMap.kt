// nonNullAsserts/ValueFromMap.kt
import atomicTest.*

fun main(args: Array<String>) {
  val map = mapOf(1 to "one")
  map[1]!!.toUpperCase() eq "ONE"
  map.getValue(1).toUpperCase() eq "ONE"
  capture {
    map[2]!!.toUpperCase()
  } eq "KotlinNullPointerException"
  capture {
    map.getValue(2).toUpperCase()
  } eq "NoSuchElementException"
}
