/**
  * Created by User on 2017-01-20.
  */
class P4 {

}

object P4{
  def f(list:List[Any]):Any={
    list match{
      case Nil=>0
      case x::tail=>  f(tail).asInstanceOf[Int]+1
      case _ =>"No answer"
    }
  }

  def main(args:Array[String])={
    println(f(List()))
    println(f(List(1,2,3)))
    println(f(List("asd",3,2)))
  }
}
