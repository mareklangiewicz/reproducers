package pl.mareklangiewicz.reproduce07.app

import androidx.compose.ui.graphics.Color.Companion.Black

fun Any.getCompileErr(): Boolean = when {
  this is ULong -> true
  else -> false
}

fun main() {
    println("bla".getCompileErr())
    val x = Black.copy(alpha = 0.5f)
}
