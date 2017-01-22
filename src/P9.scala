/**
  * Created by User on 2017-01-21.
  */
class P9 {

}

object P9{
  def f(list:List[Any]):List[Any]={
    list match {
      case Nil=>Nil
      case x::Nil=>List(List(x))
      case x::tail if x==tail.head => {
        val nt=f(tail)
        var h=nt.head
        val nh=x:: h.asInstanceOf[List[Any]]
        nh::nt.drop(1)
      }
      case x::tail => List(x)::f(tail)
    }
  }

  def main(args:Array[String])={
    println(f(List(1,2,2,3)))
  }
}