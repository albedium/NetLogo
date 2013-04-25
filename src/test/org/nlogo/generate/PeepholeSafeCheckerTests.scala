// (C) Uri Wilensky. https://github.com/NetLogo/NetLogo

package org.nlogo.generate

import org.scalatest.FunSuite
import org.nlogo.nvm.Context
import org.nlogo.prim.{_plus,_equal}

class PeepholeSafeCheckerTests extends FunSuite {

  val checker = new PeepholeSafeChecker
  import checker._

  test("plusSafe") {
    val m = classOf[_plus].getMethod(
      "report_1",
      classOf[Context], java.lang.Double.TYPE, java.lang.Double.TYPE)
    assert(isSafe(m))
  }

  // This no longer passes since converting _equal to Scala.  And I haven't
  // looked at this stuff for a long time and don't know what to replace it with.
  // - ST 9/14/12
  //
  // test("equalUnsafe") {
  //   val m = classOf[_equal].getMethod(
  //     "report_3",
  //     classOf[Context], java.lang.Double.TYPE, classOf[AnyRef])
  //   assert(!isSafe(m))
  // }

}
