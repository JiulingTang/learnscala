/**
  * Created by User on 2017-01-20.
  */
class P7 {

}

object P7{
  def f(list:List[Any]):List[Any]= {
    list match {
      case Nil => Nil
      case x :: tail if x.isInstanceOf[List[Any]] => f(x.asInstanceOf[List[Any]]) ::: f(tail)
      case x :: tail if !x.isInstanceOf[List[Any]] => x :: f(tail)
    }
  }
  def main(args:Array[String])={
    val l=f(List(List(1,List(2,4,1)),3,List(4)))
    for (x <- l){
      print(x+ " ")
    }
  }
}