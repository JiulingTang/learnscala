/**
  * Created by User on 2017-01-20.
  */
class P5 {

}

object P5{
  def f(list:List[Any]):List[Any]={
    list match{
      case Nil=>Nil
      case x::tail=>f(tail):+x
    }
  }
  def main (args:Array[String]): Unit ={
    val l1=f(List(2,3,4,1))
    for (x <- l1){
      print(x +" ")
    }
  }
}