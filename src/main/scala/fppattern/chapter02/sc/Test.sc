val m = List(Some("on"), None, Some("us"), None)
for (Some(p) <- m) {
  println(p)
}

val p = m.flatten

def m(n: Option[Int]) = n.map(_ + 1)

val c1 = Some(10)
val c2 = None

m(c1)
m(c2) //So the map operation, when invoked over a None, simply did nothing return None


// Scala provides a special invocation syntax when we have a method with one argument.
None.orElse(Some(10))
None orElse Some(10)
Some(10) orElse Some(20)


val list = List.fill(5)("aa")
list.map (_.toUpperCase)

