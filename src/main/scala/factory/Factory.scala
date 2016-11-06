package factory

trait Animal
private class Dog extends Animal {
  println("Construct Dog ...")
}
private class Cat extends Animal {
  println("Construct Cat ...")
}

object AnimalFactory {
  def apply(kind: String) = kind match {
    case "dog" => new Dog()
    case "cat" => new Cat()
  }
}

object FactoryDriver {
  def main(args: Array[String]): Unit = {
    AnimalFactory("dog")
    AnimalFactory("cat")
  }
}

