@file:Suppress("PackageDirectoryMismatch")

package pl.mareklangiewicz.hello

import androidx.compose.runtime.*
import org.jetbrains.compose.web.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.attributes.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Text

actual fun helloPlatform(): String = "Hello JS World!".also { println(it) }

fun main() {
    helloPlatform()
    renderComposableInBody { AppDom() }
}

@Composable private fun AppDom() {
    RawBla {
        Text("some text")
    }
}

@Composable public fun RawBla(
    content: @Composable () -> Unit,
) {
    Div { content() }
    // content()
}
