/**
  * Created by User on 2017-01-21.
  */
class P8 {

}

object P8{
  def f(list:List[Any]):List[Any] ={
    list match {
      case Nil=>Nil
      case x::xs::tail if x==xs => f(tail)
      case x::tail =>x::f(tail)
    }
  }

  def main(args:Array[String]): Unit ={
    println(f(List(1,2,2,3,3,3,4,1)))
    println(f(List(2,3,4,1)))
  }
}