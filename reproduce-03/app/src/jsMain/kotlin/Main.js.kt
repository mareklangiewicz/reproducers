package pl.mareklangiewicz.reproduce03

// no issue with this type
private class MyWrapper1(val inner: Int)

// issue reproducible with this (value) type
private value class MyWrapper2(val inner: Int)

// working version (not inline)
private fun <V : Any> String.plusIfNN1(value: V?): String =
    if (value != null) { this + value } else this

// issue reproducible with this inline fun on K/JS (2.0.0-Beta1)
private inline fun <V : Any> String.plusIfNN2(value: V?): String =
    if (value != null) { this + value } else this

fun main() {
    console.log("reproduce03.main started.")
    console.log("Kotlin version: ${KotlinVersion.CURRENT}")


    // val someArg: Dp? = null // from compose.ui (has to be configured in build files first)
    // val someArg: Offset? = null from compose.ui (has to be configured in build files first)
    val someArg: MyWrapper2? = null

    // It has to be some value class to reproduce issue (like Dp or Offset or MyWrapper2).
    // Offset reproduces even better because it throws, and Dp results in "prefix-null.dp" in browser console,
    // and Wrapper2 results in "prefix2-MyWrapper2(inner=null)" instead of "prefix2-"
    // Does not reproduce (works correctly) with types like String or Int or MyWrapper1.

    // this works correctly with all types
    val result1 = "prefix1-".plusIfNN1(someArg)
    println(result1)

    // this reproduces the issue if someArg is value class like Offset or Dp or MyWrapper2
    val result2 = "prefix2-".plusIfNN2(someArg)
    println(result2)
}
