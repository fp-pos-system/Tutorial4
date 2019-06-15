import scala.util.control.Breaks

object q4 {
  // checking if a string is palindrome
  def main(args: Array[String]) = {
    print("Enter the string : ");
    val inputstr = scala.io.StdIn.readLine();
    var n = inputstr.length;
    var status = 1;

    var str = inputstr.toCharArray;
    var strreverse = new Array[Char](n);

    for(i <- 0 to n-1){
      strreverse(i) = str((n-1)-i);
    }

    var loop = new Breaks;

    loop.breakable{
      for(i <- 0 to n-1){
        if(str(i) != strreverse(i)){
          status = 0;
          loop.break();
        }
      }
    }

    if(status == 0){
      println("This string is not a palindrome");
    }else{
      println("This string is palindrome");
    }

  }

}
