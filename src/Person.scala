/**
  * Created by User on 2017-01-22.
  */
class Person(pName:String) {
  val name:String=pName
}

class Student(pName:String) extends Person(pName){

}

object Student{
  def main(args:Array[String]): Unit ={
    var s=new Student("tt")
    println(s.name)
    println(SB.name)
    println(SB.rName)
  }
}

object SB extends Person("sb"){
  val rName="no"
}

