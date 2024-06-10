package pl.mareklangiewicz.reproduce03

import org.jetbrains.compose.web.*
import org.jetbrains.compose.web.dom.*
import androidx.compose.runtime.*



@Composable fun <T> MySwitch(state: MutableState<T>, vararg options: Pair<String, T>) {
}

fun main() {
    console.log("reproduce05.main started.")
    console.log("Kotlin version: ${KotlinVersion.CURRENT}")


    renderComposableInBody {
        val myState = remember { mutableStateOf(0) }
        Text("Some not important text")
        MySwitch(myState)
    }
}
