// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html

import main.scala.hello

class MySuite extends munit.FunSuite {
  test("Example Test Case") {
    hello()
    assert(1 == 1)
  }
}
