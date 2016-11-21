package fppattern.chapter01

/**
  * Created by zyong on 2016/11/21.
  * Strategy Pattern
  */
object SortNumbers_Scala extends App {

  List(3, 7, 5, 2).sortWith(_ < _).foreach(println)

}
