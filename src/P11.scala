/**
  * Created by User on 2017-01-21.
  */
class P11 {

}

object P11 {
  def f(list:List[Any]):List[Any]={
    list match{
      case Nil => Nil
      case x::tail=> d(tail,1,x)
    }
  }

  def d(list:List[Any],n:Int,a:Any):List[Any] = {
    list match {
      case x :: tail if x == a => d(tail, n + 1, a)
      case x :: tail => if (n==1) a:: d(tail,1,x) else (n, a) :: d(tail, 1, x)
      case Nil => if (n==1) List(a) else List((n, a))

    }
  }
  def main(args:Array[String])={
    println(f(List(1,2,2,2,3)))
    println(f(List(1,2,2,2)))
    println(f(List(1,3,3,1,2,2,4,3)))
  }
}
