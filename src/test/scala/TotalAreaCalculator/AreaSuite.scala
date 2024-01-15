package TotalAreaCalculator
import TotalAreaCalculator.Main.Area
import org.scalatest.funsuite.AnyFunSuite

class AreaSuite extends AnyFunSuite {
  val area = new Area
  test("Approximated area of these arguments should be 21.561559772003317") {
    assert(area.apprArea(TestValuesObject.circlesTest1) == 21.561559772003317)
  }

  test("Approximated area of these arguments (if circles have no intersection) should be 11.772324") {
    assert(area.apprArea(TestValuesObject.circlesTest2) == 11.772324)
  }

  test("Approximated area of these arguments (if circles are dots without radius) should be 0") {
    assert(area.apprArea(TestValuesObject.circlesTest3) == 0.0)
  }
}

