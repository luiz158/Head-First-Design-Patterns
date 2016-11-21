package headfirst.designpatterns.strategy

/**
  * Created by zyong on 2016/11/9.
  */
object Caculator {

  type Strategy = (Int, Int) => Int

  val add: Strategy = _ + _
  val multiply: Strategy = _ * _

  def main(args: Array[String]) {
    println(add(2, 3))
  }
}
