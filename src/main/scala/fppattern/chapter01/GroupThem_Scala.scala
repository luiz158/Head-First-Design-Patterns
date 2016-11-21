package fppattern.chapter01

/**
  * Created by zyong on 2016/11/21.
  */
object GroupThem_Scala extends App {
  def coalesceList(list: List[Int]): List[List[Int]] = {
    def coalesce(lst: List[Int], acc: List[Int]): List[List[Int]] = lst match {
      case Nil => acc.reverse :: Nil
      case x :: xs =>
        acc match {
          case Nil => coalesce(xs, x :: acc)
          case y :: ys => (x - y) match {
            case 1 => coalesce(xs, x :: acc)
            case _ => acc.reverse :: coalesce(xs, x :: List())
          }
        }
    }
    coalesce(list, List())
  }

  println(coalesceList(List(1, 2, 3, 4, 5, 9, 11, 20, 21, 22)))
}

