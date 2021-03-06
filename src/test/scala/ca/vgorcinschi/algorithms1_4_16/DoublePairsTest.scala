package ca.vgorcinschi.algorithms1_4_16

import org.scalacheck.Gen
import org.scalatest.{FunSuite, Matchers}
import org.scalacheck.Prop.forAll
import org.scalatest.prop.GeneratorDrivenPropertyChecks

/**
  * Created by vgorcinschi on 10/04/17.
  */
class DoublePairsTest extends FunSuite with
                      GeneratorDrivenPropertyChecks with Matchers{

  def randDoubles = Gen.containerOf[Array, Double](
    Gen.choose(Double.MinValue, Double.MaxValue)
  ).filter(_.length > 2)

  test("Closest pair test should work for any array of size 2+"){
    forAll (randDoubles) {
      ar => val (x, y) = closestPair(ar)
      info(s"numbers are $x and $y")
      x shouldNot(equal(y))
    }
  }

  test("Farthest pair test should work for any array of size 2+"){
    forAll (randDoubles) {
      ar => val (x, y) = farthestPair(ar)
      info(s"numbers are $x and $y")
      x shouldNot(equal(y))
    }
  }
}
