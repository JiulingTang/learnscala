/**
  * Created by User on 2017-03-01.
  */
class Implicit {
  class C(val v:Int){

  }



  def f(a:Int)(implicit b:C):Int={
    return a+b.v
  }
}

object Implicit {
  val d=new Implicit()

  implicit def CtoInt(b:d.C):Int={
    return b.v
  }
  def main(args: Array[String]) = {
    val i = new Implicit()
    implicit val b=new i.C(3)
    println(i.f(2))
    val e=new d.C(4)
    println(i.f(e))
  }


}