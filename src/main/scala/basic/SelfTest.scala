package basic

/**
  * Created by zyong on 2016/11/17.
  */

/**
  * 这句相当于给this起了一个别名为self
  */
class Self {
  self =>
  //代表this指针  ，也就是说 self 就 this的别名
  val tmp = "scala"

  def foo = self.tmp + " " + this.tmp
}

/**
  * 用在有内部类的情况
  */
object Outer {
  out =>
  val v1 = "spark"

  class Inner {
    val v1 = "Inner"
    println(out.v1) // 用outer表示外部类，相当于Outer.this
    println(v1)
  }

}

trait S1

/**
  * this 不能称当别名，这里this:S1 是一个整体，就是说实例化S2时，要求S1必须混入
  */
class S2 {
  this: S1 =>
}

// 混入trait S1，强制要求 S2的实现类 去实现 S1
class S3 extends S2 with S1

trait T {
  this: S1 =>
}

object S4 extends T with S1

object SelfTest {

  def main(args: Array[String]) {
    println(new Self().foo)
    new Outer.Inner
  }


}
