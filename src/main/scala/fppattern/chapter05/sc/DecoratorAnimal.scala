package fppattern.chapter05.sc

/**
  * Created by zyong on 2016/12/16.
  */
object DecoratorAnimal extends App {

  trait Walks {
    def name: String

    def walk() =
      println(name + " is having a stroll now")
  }

  trait GoodsMover {
    def name: String

    def moveGoods() =
      println(name + " busy moving heavy stuff")
  }

  abstract class Animal(val rating: Int) {
    def giveInoculation(): Unit

    // abstract method
    def alreadyInoculated(): Boolean // abstract method
  }

  trait FilterOutAlreadyInoculated extends Animal {
    abstract override def giveInoculation(): Unit = // 1
      if (!alreadyInoculated()) {
        super.giveInoculation()
      }
  }

  class Horse(rating: Int, var inoculated: Boolean = false)
    extends Animal(rating) with Walks with Ordered[Animal] {

    override def giveInoculation(): Unit = {
      println(name() + " Getting inoculated")
      inoculated = true
    }

    override def alreadyInoculated(): Boolean = inoculated

    override def name(): String = "Horse"

    override def compare(that: Animal): Int = rating - that.rating
  }


  val horse = new Horse(1) with FilterOutAlreadyInoculated
  horse.giveInoculation
  horse.giveInoculation
}
