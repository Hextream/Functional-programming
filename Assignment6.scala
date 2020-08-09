object Assignment6 extends App {
  import scala.math.sqrt;

  case class Point(a: Int, b: Int) {
    def x:Int = a;
    def y:Int = b;

    //add methode
    def +(p: Point) = Point(x + p.x, y + p.y);

    //move methode
    def move(dx: Int, dy: Int) = Point(x + dx, y + dy);

    //distance methode
    def distance(p: Point) = math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y));

    //invert methode
    def invert = Point(y, x);
  }

  //predefined points
  val p1 = Point(2,3);
  val p2 = Point(5,7);

  //call add methode
  println(p1+p2);

  //call move methode
  println(p1.move(3,3));

  //call distance methode
  println(p1.distance(p2));

  //call invert methode
  println(p1.invert);
}