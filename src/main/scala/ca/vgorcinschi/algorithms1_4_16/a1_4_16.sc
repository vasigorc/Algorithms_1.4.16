import ca.vgorcinschi.algorithms1_4_16._

import scala.util.Random

var ar = for(i <- 1 to 100) yield Random.nextDouble()*100

closestPair(ar.toArray)