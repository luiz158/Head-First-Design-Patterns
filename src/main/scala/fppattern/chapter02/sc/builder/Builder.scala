package fppattern.chapter02.sc.builder

/**
  * Created by zyong on 2016/11/24.
  */
object Builder extends App {

  case class UsedCar(make: String, // 1
                     model: String,
                     kmDriven: Int,
                     yearOfManufacturing: Int,
                     hasGps: Boolean = false,
                     hasAc: Boolean = false,
                     hasAirBags: Boolean = false,
                     hasAbs: Boolean = false) {

    require(yearOfManufacturing > 1970, "Incorrect year") // 2
    require(checkMakeAndModel(), "Incorrect make and model")

    def checkMakeAndModel() = if (make == "Maruti") {
      model == "alto"
    } else if (make == "Toyota") {
      model == "Corolla"
    } else {
      true
    }
  }

  val usedMaruti = UsedCar(model = "alto",
    make = "Maruti",
    kmDriven = 10000,
    yearOfManufacturing = 1980,
    hasAbs = true,
    hasAirBags = true) // 3
  println(usedMaruti)
  val usedCorolla = usedMaruti.copy(make = "Toyota", model = "Corolla")
  // 4
  println(usedCorolla)
  // val wrongModel = usedCorolla.copy(model = "alto") // throws - Incorrect make and model
}