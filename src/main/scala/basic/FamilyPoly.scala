package basic

import scala.tools.nsc.FatalError

/**
  * Created by zyong on 2016/11/17.
  */
trait  Family {
  type M <: Mother
  type F <: Father
  type C <: Child

  class Mother(val name: String)

  class Father(val name: String) {
    def kiss(m: M) = println("Showing signs of affection towards " + m.name)
  }

  class Child(val name: String) {
    def askForHelp(m: M) = println("Screeeeemmmm at " + m.name)
  }
}

object UpperClassFamily extends Family {
  type F = Father
  type M = Mother
  type C = PoliteChild

  class Mother(name: String, val lastName: String) extends super.Mother(name)
  class PoliteChild(name: String) extends Child(name) {
    override def askForHelp(m: M) = {
      println(s"Asking ${m.name} ${m.lastName} for help")
    }
  }
}

object StandardFamily extends Family {
  type F = Father
  type M = Mother
  type C = Child
}

object FamilyPoly {

  def assignFamily(f: Family) = ()
  val father = new StandardFamily.Father("John")
  val mother = new StandardFamily.Mother("Rose")
  val upperClassMother = new UpperClassFamily.Mother("Dorthea III", "dd")

  father.kiss(mother)
  //father.kiss(upperClassMother)  // illegal

}

