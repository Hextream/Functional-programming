object Assignment3 extends App {
  //uncomment the relevant input and function calling lines to try out different functions
  println("uncomment the relevant input and function calling lines to test different functions")

  //Function to return True for a prime number
  def prime(n:Int, q:Int):Boolean= {
	//println(q)
	if (q<1) return false
	else if (q==1) return true
	else {
		if (n%q==0) return false
		else prime(n,q-1)
	}
  }
  //var n = scala.io.StdIn.readInt()
  //println(prime(n,n-1))
  
  
  //Function to print all prime numbers below n
  def primeseq(n:Int):Any= {
	if (n>=1) {
		if (prime(n,n-1)==true) println(n)
		primeseq(n-1)
	}
  }
  //var n = scala.io.StdIn.readInt()
  //primeseq(n)
  
  
  //Function to print sum of integers from 1 to n
  def sum(n:Int):Int= {
	if (n==1) return 1
	else if (n>1) return n+sum(n-1)
	else return 0
  }
  //var n = scala.io.StdIn.readInt()
  //println(sum(n))
  
  
  //Function to determine odd and even numbers between 1 and n
  def determine(n:Int):Boolean= {
	if (n%2==0) return true
	else return false
  }
  def countdown(n:Int):Any= {
	if (n>0) {
		if (determine(n)==true) println(n, "even")
		else println(n, "odd")
		countdown(n-1)
	}
  }
  //var n = scala.io.StdIn.readInt()
  //countdown(n)
  
  
  //Function to add even numbers between 1 and n
  def evensum(n:Int):Int= {
	if (n>0) {
		if (determine(n)==true) return n+evensum(n-1)
		else return evensum(n-1)
	}
	else return 0
  }
  //var n = scala.io.StdIn.readInt()
  //println(evensum(n))
  
  
  //Function to print first n fibonacci numbers
  def fibonacci(n:Int):Int= {
	if (n<=0) return 0
	else if (n==1) return 1
	else {
		return fibonacci(n-2)+fibonacci(n-1)
	}
  }
  def printfibonacci(n:Int):Any= {
	if (n>=0) {
		printfibonacci(n-1)
		println(fibonacci(n))
	}
  }
  //var n = scala.io.StdIn.readInt()
  //printfibonacci(n-1)
}