@file:Suppress("PackageDirectoryMismatch")

package pl.mareklangiewicz.hello

import androidx.compose.runtime.*

fun helloCommon(): String = "Hello Pure Common World!".also { println(it) }

expect fun helloPlatform(): String