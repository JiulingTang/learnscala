/**
  * Created by User on 2017-03-06.
  */
class ImplicitClasses {

}

object Helpers {
  implicit class IntWithTimes(x: Int) {
    def times[A](f: => A): Unit = {
      def loop(current: Int): Unit =
        if(current > 0) {
          f
          println(f.getClass)
          loop(current - 1)
        }
      loop(x)
    }


  }
  def main(args:Array[String]): Unit ={
    5 times println("HI")
  }
}
