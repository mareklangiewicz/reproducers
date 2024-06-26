package pl.mareklangiewicz.udemo

import org.jetbrains.compose.web.testutils.*
import pl.mareklangiewicz.hello.main
import kotlin.test.*


class MainTest {

  @OptIn(ComposeWebExperimentalTestsApi::class)
  @Test
  fun mainTest() = runTest {
    main()
  }
}
