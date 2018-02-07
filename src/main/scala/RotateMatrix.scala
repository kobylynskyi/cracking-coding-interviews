import scala.collection.mutable.ArrayBuffer

/**
  * Given an image represented an NxN matrix, where each pixel in the image is 4 bytes,
  * write a method to rotate the image by 90 degrees.
  */
object RotateMatrix {

  def rotateMatrix(matrix: Array[Array[Int]]): Array[Array[Int]] = {
    val rotatedMatrixBuffer = ArrayBuffer[ArrayBuffer[Int]]()

    matrix(0).foreach(pixel => {
      rotatedMatrixBuffer += ArrayBuffer(pixel)
    })
    for (i <- 1 until matrix.length) {
      for (j <- matrix(i).length - 1 to 0 by -1) {
        rotatedMatrixBuffer(j) += matrix(i)(j)
      }
    }

    val rotatedMatrix = ArrayBuffer[Array[Int]]()

    rotatedMatrixBuffer.reverse.foreach(matrixRow => {
      rotatedMatrix += matrixRow.toArray
      println(matrixRow)
    })
    rotatedMatrix.toArray
  }

}
