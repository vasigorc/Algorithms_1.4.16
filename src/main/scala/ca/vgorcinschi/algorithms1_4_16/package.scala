package ca.vgorcinschi

/**
  * Created by vgorcinschi on 09/04/17.
  */
package object algorithms1_4_16 {

  /*
    find two values whose difference is no greater than
    the difference of any other pair (in absolute value).
   */
  def closestPair(doubles: Array[Double]):(Double, Double)= {
    require(doubles.isDefinedAt(1), s"The passed in array ${System.identityHashCode(doubles)}" +
      s" has less then two elements")

    val srted = doubles.sorted
    var maxDiff = Double.MaxValue
    var curClosestPair = (srted(0), srted(1))

    for{
      i <- 1 until srted.length
      if(srted(i)-srted(i-1) < maxDiff)
    } {
      maxDiff = srted(i)-srted(i-1)
      curClosestPair = (srted(i), srted(i-1))
    }
    curClosestPair
  }
}
