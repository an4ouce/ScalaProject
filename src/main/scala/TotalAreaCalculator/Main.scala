package TotalAreaCalculator
import math.pow

object Main extends App {
  class Area {
    def apprArea(ls: List[Circle]): Double = {
      val x_min = ls.map(c => c.x - c.r).min
      val x_max = ls.map(c => c.x + c.r).max
      val y_min = ls.map(c => c.y - c.r).min
      val y_max = ls.map(c => c.y + c.r).max
      val box_side = 500
      val dx = (x_max - x_min) / box_side
      val dy = (y_max - y_min) / box_side

      var count = 0
      for (r <- 0 until box_side) {
        val y = y_min + r * dy
        for (c <- 0 until box_side) {
          val x = x_min + c * dx
          if (ls.exists(c => (pow(x - c.x, 2) + pow(y - c.y, 2) <= pow(c.r, 2)))) {
            count += 1
          }
        }
      }
      count * dx * dy
    }
  }
}


