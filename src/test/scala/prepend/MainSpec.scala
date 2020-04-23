package prepend

import monix.execution.Scheduler.Implicits.global
import org.scalatest.funspec.AnyFunSpec

class MainSpec extends AnyFunSpec {

  describe("foo") {

    // this test fails intermittently
    it("returns paired elements") {
      assert(Main.intermittentFailure.runSyncUnsafe() == List((0,0),(1,1),(2,2),(3,3)))
    }

  }

}
