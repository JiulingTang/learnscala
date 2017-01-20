/**
  * Created by User on 2017-01-20.
  */
class P2 {

}

object P2{
  def f(list:List[Any])={
    list match {
      case x::x2::(tail:List[Any])=>list(list.length-2)
      case _=>"Null"
    }
  }
  def main(args:Array[String]): Unit ={
    println(f(List(1,2,3)))
    println(f(List(1)))
    println(f(List()))
    println(f(List("a","adf","3")))
    println(f(List(10,9,3,4)))
  }
}