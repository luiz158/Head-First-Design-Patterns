package fppattern.chapter02.sc.factorymethod

/**
  * Created by zyong on 2016/11/23.
  */
trait Currency {
  def getConversionRateToIndianRupee: String
}

object CurrencyConverter extends App {

  private object EuroToRupee extends Currency {
    override def getConversionRateToIndianRupee = "82"
  }

  private object DollarToRupee extends Currency {
    override def getConversionRateToIndianRupee = "60"
  }

  private object NoIdea extends Currency {
    override def getConversionRateToIndianRupee = "No Idea"
  }

  // the currency factory method
  // Note: Scala if statement is an expression.
  def apply(s: String): Currency = {
    if (s == "Dollar") // same as s.equals("Dollar") in Java
      DollarToRupee
    else if (s == "Euro")
      EuroToRupee
    else
      NoIdea
  }

  val c = CurrencyConverter ("Dollar") // apply method in action
  println(c.getConversionRateToIndianRupee)
}




