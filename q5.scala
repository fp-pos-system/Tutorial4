object q5 {
  // reversing a string
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

    print("Inputted string : ");
    for(x <- str){
      print(x);
    }

    println();

    print("Reversed string : ");
    for(x <- strreverse){
      print(x);
    }

  }

}
