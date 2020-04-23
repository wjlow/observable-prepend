package prepend

import cats.effect.ExitCode
import monix.eval.{Task, TaskApp}
import monix.reactive.Observable

object Main extends TaskApp {
  override def run(args: List[String]): Task[ExitCode] = {
    intermittentFailure.flatMap(x => Task(println(x.mkString("\n")))).map(_ => ExitCode.Success)
  }

  def intermittentFailure: Task[List[(Int, Int)]] = {
    val streamA = 0 +: Observable(1, 2, 3)
    val streamB = Observable(0, 1, 2, 3)
    streamA.zip(streamB).toListL
  }
}
