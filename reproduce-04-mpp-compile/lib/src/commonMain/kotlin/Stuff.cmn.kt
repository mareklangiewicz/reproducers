package pl.mareklangiewicz.reproduce04

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.DpSize

@Composable internal expect fun HelloComposablePlatformStuff(size: DpSize?, content: @Composable () -> Unit)

// Note: comment out this usage to make compiler behave correctly again (output correct error instead of crashing)
@Composable fun SomeUsage() = HelloComposablePlatformStuff(null) {}
