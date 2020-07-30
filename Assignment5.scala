object Assignment5 extends App {
  
  //Exercise 1 and 2
  class Rational(x: Int, y: Int) {
    private def gcd(a: Int, b: Int): Int = if (b==0) a else gcd(b, a%b)
    val numer = x/gcd(x,y);
    def denom = y/gcd(x,y);
    
    def +(r: Rational) = new Rational(numer * r.denom + r.numer * denom, denom * r.denom);
    
    override def toString = numer + "/" + denom;
    
    //methode to get negative rational number
    def neg = new Rational(-this.numer,this.denom);
    
    def -(r: Rational) = this+r.neg;
  
  }
  
  val x = new Rational(3, 4);
  val y = new Rational(5, 8);
  val z = new Rational(2, 7);
  println(x-y-z);
  
  
  var bank:List[Account]=List();

  class Account(id:String, n: Int, b: Double) {
    val nic:String = id;
    val acnumber:Int = n;
    var balance:Double = b;
    
    //val find = (n:String, b:List[Account]) => b.filter(x=>x.nic.equals(n));
    
    override def toString = "["+nic+":"+acnumber+":"+balance+"]";
    
    def withdraw(a:Double) = this.balance = this.balance - a;
    
    def deposit(a:Double) = this.balance = this.balance + a;
    
    //def transfer(a:Account, b:Double) = 
      //this.withdraw(b); 
      //List[Account].filter(x=>x.nic.equals(a)).deposit(b);
  }
  
}