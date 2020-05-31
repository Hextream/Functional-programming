object Assignment2 extends App {
  def normal(x:Int)=x*150
  def ot(x:Int)=x*75
  def netsalary(x:Int, y:Int)=(normal(x)+ot(y))*0.9
  //var a = scala.io.StdIn.readInt()
  //var b = scala.io.StdIn.readInt()
  //println(netsalary(a,b))
  println(netsalary(40,20))
  
  def attendee(t:Int)=120-(20*(t-15)/5)
  def cost(t:Int)=attendee(t)*3+500
  def revenue(t:Int)=t*attendee(t)
  def profit(t:Int)= revenue(t)-cost(t)
  //var t = scala.io.StdIn.readInt()
  //println(profit(t))
  println(profit(5),profit(10),profit(15),profit(20),profit(25),profit(30),profit(35),profit(40))
}