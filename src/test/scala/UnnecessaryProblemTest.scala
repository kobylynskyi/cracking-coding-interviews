import UnnecessaryProblem.Pair
import org.scalatest.FunSuite

class UnnecessaryProblemTest extends FunSuite {

  assert(UnnecessaryProblem.findPairs(2, Set(5, 14, 1, 6, 9, 13, 17, 7, 3, 11, 8))
    .equals(Set(
      Pair(1, 3),
      Pair(3, 5),
      Pair(5, 7),
      Pair(6, 8),
      Pair(7, 9),
      Pair(9, 11),
      Pair(11, 13))))


  assert(UnnecessaryProblem.findPairs(1, Set(5, 14, 1, 6, 9, 13, 17, 7, 3, 11, 8))
    .equals(Set(
      Pair(5, 6),
      Pair(6, 7),
      Pair(7, 8),
      Pair(8, 9),
      Pair(13, 14))))

}
