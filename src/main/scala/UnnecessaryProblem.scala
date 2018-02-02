import scala.collection.mutable

/**
  * Given an array of distinct integer values, count the number of pairs of integers that have difference k.
  * For example, given the array {1, 7, 5, 9, 2, 12, 3} and the difference k = 2,
  * there are four pairs with difference 2: (1, 3), (3, 5), (5, 7), (7, 9)
  */
object UnnecessaryProblem {

  def findPairs(difference: Int, numbers: Set[Int]): Set[Pair] = {
    println(s"Difference: $difference")
    println(s"Array: ${numbers.mkString(" ")}")

    val pairs: mutable.HashSet[Pair] = mutable.HashSet()
    numbers.foreach { number => {
      if (numbers.contains(number + difference))
        pairs += Pair(number, number + difference)
      else if (numbers.contains(number - difference))
        pairs += Pair(number - difference, number)
    }
    }
    pairs.foreach(println)
    pairs.toSet
  }

  case class Pair(i: Int, j: Int) {
    override def toString = s"Pair: ($i, $j)"
  }

}
