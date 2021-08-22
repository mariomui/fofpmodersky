import recfun.RecFun.*;

@main def run(): Unit = {
  var max = 10;
  var maxe = max;
  for row <- 0 to max do {
    for (spacing <- 0 to maxe ) {
      print(" ");
    }

    for col <- 0 to row do {
      val value: Int = pascal(col, row);
      print(s"$value ");
    }
    maxe = maxe - 1;

    println();
  }
//  println(countChange(4, List(1,2)));
  println(
    countChange(300,List(5,10,20,50,100,200,500))
  );
  println(balance("(if (zero? x) max (/ 1 x))".toList));
}
