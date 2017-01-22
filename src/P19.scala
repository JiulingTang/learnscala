/**
  * Created by User on 2017-01-21.
  */
class P19 {

}
object P19{
  def f(list:List[Any],n:Int):List[Any]={
    list match {
      case x::tail if n==0 =>list
      case x::tail => f(tail:+x,n-1)
      case Nil=>Nil
    }
  }

  def main(args:Array[String])={
    println(f(List(),2))
    println(f(List(2,3,4,1),2))
  }
}
