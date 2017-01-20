/**
  * Created by User on 2017-01-20.
  */
class P6 {

}

object P6{
  def f(list:List[Any]):Boolean= {
    list match {
      case Nil => true
      case (x :: middle) :+ x2 if x == x2 => f(middle)
      case (x :: middle) :+ x2 if x != x2 => false
    }
  }

  def main(args:Array[String]): Unit ={
    println(f(List(1,2,3,3,2,1)))
    println(f(List()))
    println(f(List(2,3,1)))
  }
}
