package pl.mareklangiewicz.reproduce04

import androidx.compose.runtime.Composable

@Composable expect fun SomeComposable()

// Note: comment out this usage to make compiler behave correctly again (output correct error instead of crashing)
// @Composable fun SomeUsage() = SomeComposable()
