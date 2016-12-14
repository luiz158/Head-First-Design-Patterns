val num = """(\d+)([.]\d+)?""".r


"101.22" match {
  case num(decimal, fractional) => s"decimal = $decimal, fractional = $fractional"}