package strategy

/**
  * Created by zyong on 2016/11/7.
  */


object Caculator {

  type Strategy = (Int, Int) => Int

  val add: Strategy = _ + _
  val multiply: Strategy = _ * _
}
