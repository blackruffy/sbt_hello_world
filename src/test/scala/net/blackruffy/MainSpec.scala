package net.blackruffy

import org.scalatest.{ WordSpec, Matchers, BeforeAndAfter, BeforeAndAfterAll }

class MainSpec extends WordSpec with Matchers with BeforeAndAfter {

  "1 + 1" should {

    "2" in {
      (1 + 1) should be (2)
    }
  }
}
