package example.videoclub

import scala.concurrent.Future
import scalaz._

package object services {


  type Errors = NonEmptyList[String]

  type Valid[A] = Errors \/ A

  type FutureValid[A] = EitherT[Future, Errors, A]



}
