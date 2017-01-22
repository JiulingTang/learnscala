/**
  * Created by User on 2017-01-21.
  */
class P12 {

}

object P12{
  def f(l:List[Tuple2[Int,Any]]):List[Any]={
    def p(l:List[Tuple2[Int,Any]],n:Int,sl:List[Any]):List[Any]={

      l match {
        case x::tail if n==0 =>sl:::p(tail,x._1-1,List(x._2))
        case l if n>0=>p(l,n-1,sl.head::sl)
        case Nil=>sl
      }

    }
    l match{
      case Nil=> Nil
      case x::tail=>p(tail,x._1-1,List(x._2))
    }

  }

  def main(args:Array[String]): Unit ={
    println(f(List((3,1),(2,2),(1,3))))
    println(f(List()))
  }
}
