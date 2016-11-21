package basic

/**
  * Created by zyong on 2016/11/16.
  */
object Linearization {

  trait Cell {
    def save(x: Int)

    def retrieve
  }

  class StandardCell(protected var state: Int) extends Cell {
    override def save(x: Int) = {
      state = x
    }

    override def retrieve = state
  }

  trait Similar {
    def isSimilar(x: Int): Boolean

    def isNotSimilar(x: Int): Boolean = !isSimilar(x)
  }


  trait Doubling extends Cell {
    abstract override def save(x: Int) = super.save(2 * x)
  }

  trait Max extends Cell {
    abstract override def save(x: Int) = {
      if (x > 10) throw new Exception("overflow!") else super.save(x)
    }
  }

  def main(args: Array[String]) {

    val cell = new StandardCell(3) with Similar {
      override def isSimilar(x: Int): Boolean = {
        state == x
      }
    }
    println(cell.isSimilar(3))
    println(cell.isSimilar(4))

    val cell2 = new StandardCell(3) with Doubling with Max
    cell2.save(2)
  }
}
