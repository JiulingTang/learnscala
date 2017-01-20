/**
  * Created by User on 2017-01-20.
  */
class P3 {

}

object P3{
  def f(list:List[Any],k:Int)={
    h(list,0,k)
  }

  def h(list:List[Any],n:Int,k:Int):Any={
    list match {
      case x :: tail if n == k => x
      case x :: tail if n < k => h(tail, n + 1, k)
      case _ => "no answer"
    }
  }

  def main(args:Array[String])={
    println(f(List(1,2,3,4),2))
    println(f(List(1),2))

  }
}