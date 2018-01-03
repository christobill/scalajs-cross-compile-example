object Main {
  def main(args: Array[String]): Unit = {
    val functionFatArrow: Int ⇒ Int = x ⇒ x + 1
    val lib                          = new MyLibrary
    println(lib.sq(2))
  }
}
