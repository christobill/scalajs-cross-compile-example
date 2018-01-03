import scala.scalajs.js

object Main extends js.JSApp {
  def main(): Unit = {
    val functionFatArrow: Int => Int = x => x+1
    val lib = new MyLibrary
    println(lib.sq(2))
  }
}
