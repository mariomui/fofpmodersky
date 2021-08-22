import example.Lists.*;

@main def run(): Unit =
  println(max(List(1,33,2)))
  println(sqrt(893));
def sqrt(x: Double): Double = {
  def improveGuess(guess: Double, x: Double): Double = (guess + x / guess) / 2;
  def isGoodEnough(guess: Double, x: Double): Boolean = Math.abs(guess * guess - x) < .0000000000001;
  var iter: Int = 0;
  var lastGuess = 0;
  var steps: Int = 0;
  def sqrtIter(guess: Double, originalNumber: Double): Double = {
    steps = steps + 1;
    if (guess == lastGuess) then iter = iter + 1 else iter = 0;
    if (iter > 5) then return guess;
    if (isGoodEnough(guess, x)) {
      println(s"steps: $steps");
      return guess
    };
    sqrtIter(improveGuess(guess, x),x);
  }
  sqrtIter(x, x);
}

