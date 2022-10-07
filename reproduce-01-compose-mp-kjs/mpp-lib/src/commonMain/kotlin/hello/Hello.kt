@file:Suppress("PackageDirectoryMismatch")

package pl.mareklangiewicz.hello

import androidx.compose.runtime.*
import androidx.compose.material3.*

// FIXME: MyText fun changes reported error (task jsMainClasses)
//  from: "IdSignature clash..."
//  to: "No such value argument slot..."
@Composable fun MyText() = Text("bla")

fun helloCommon(): String = "Hello Pure Common World!".also { println(it) }

expect fun helloPlatform(): String