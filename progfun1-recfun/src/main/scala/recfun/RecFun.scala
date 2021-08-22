package recfun
import scala.util.control.Breaks._

object RecFun extends RecFunInterface:

  def main(args: Array[String]): Unit =
    println("Pascal's Triangle")
    for row <- 0 to 10 do
      for col <- 0 to row do
        print(s"${pascal(col, row)} ")
      println()

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if ( c == 0 &&  r == 0 ) then return 1;
    if (c == 0 && r == 1 || c == 1 && r == 1) {
      return 1;
    }
    if (c == 0 || r == c) return 1;
    if (c < 0 || c > r) return 0;
    return pascal(c - 1 , r -1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    var counter:Int = 0;

    def helperBal(chars: List[Char]): Boolean = {
      if (chars.isEmpty) return counter == 0;
      if (chars.head == ')') {
        counter = counter - 1;
      } else if (chars.head == '(') {
        counter = counter + 1;
      } else counter = counter
      if (counter < 0) return false;
      helperBal(chars.tail) && counter == 0;
    }
    helperBal(chars);
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    /* approach
      .15 [.5, .10]
           / \
          .5 .10
          / \
        .5   .10
        . 5 .5 .10
         etc etc everytime it hits money then increment the counter.
    */
    var ways: Int = 0;
    def countChangeHelper(counter: Int, agg: List[Int], coins: List[Int]): Int = {
      breakable {
        if (coins.isEmpty) return ways;
        for x <- 0 to coins.size - 1 do {
          var amt = counter + coins(x);
          if (counter == money) {
            ways = ways + 1;
            break;
          } else if (counter < money) {
            var agge = agg :+ coins(x);
            countChangeHelper(amt, agge, coins.slice(x, coins.length));
          } else {
            break;
          }
        }
      }
      return ways;
    }
    var agg = List();
    countChangeHelper(0, agg, coins);
    return ways;
  }
