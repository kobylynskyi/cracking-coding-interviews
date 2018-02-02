import scala.collection.mutable

/**
  * Given an array of distinct integer values, count the number of pairs of integers that have difference k.
  * For example, given the array {1, 7, 5, 9, 2, 12, 3} and the difference k = 2,
  * there are four pairs with difference 2: (1, 3), (3, 5), (5, 7), (7, 9)
  */
object UnnecessaryProblem extends App {
  if (args.length < 2) throw new IllegalArgumentException("Please provide difference and the array of integers. " +
    "E.g.: '2 1 7 5 9', where 2 is the difference and 1, 7, 5, 9 are numbers for pairing")

  val difference = args(0).toInt
  val numbers = args.drop(1).map(_.toInt).toSet
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


  case class Pair(i: Int, j: Int) {
    override def toString = s"Pair: ($i, $j)"
  }

}
