/**
  * Created by User on 2017-01-21.
  */
class P14 {

}

object P14{
  def f(list:List[Any]):List[Any]={
    list match{
      case Nil=>Nil
      case x::tail=>x::x::f(tail)
    }
  }

  def main(args:Array[String]): Unit ={
    println(f(List('a','b','b','c')))
  }
}