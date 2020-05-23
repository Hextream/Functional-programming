object Assignment extends App {
  def temperature(x:Double)=x*1.8+32
  println(temperature(35))
  
  def volume(r:Double)=(4/3)*math.Pi*r*r*r
  println(volume(5))
  
  def cost(n:Double)=n*24.95*0.6+3*50+(n-50)*0.75
  println(cost(60))
}