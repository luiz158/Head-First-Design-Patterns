/**
  * Created by zyong on 2016/12/16.
  */
object Decorator extends App {

  class A {
    def f = {
      println("A")
    }
  }

  trait DecA extends A {
    override def f = {
      println("Decrator A")
      super.f
    }
  }

  val a = new A
  a.f
  println("=================")
  val b = new A with DecA
  b.f
}
