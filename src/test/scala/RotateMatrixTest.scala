import RotateMatrix.rotateMatrix
import org.scalatest.FunSuite

class RotateMatrixTest extends FunSuite {

  assert(rotateMatrix(Array(Array(1, 2), Array(3, 4), Array(5, 6))).deep
    == Array(Array(2, 4, 6), Array(1, 3, 5)).deep)

  assert(rotateMatrix(Array(Array(1, 2, 3, 4, 5), Array(6, 7, 8, 9, 0))).deep
    == Array(Array(5, 0), Array(4, 9), Array(3, 8), Array(2, 7), Array(1, 6)).deep)

}
