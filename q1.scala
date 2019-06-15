object q1 {
  // read and display numbers using an array
  def main(args: Array[String]) = {
    print("Enter no of digits : ");
    val n = scala.io.StdIn.readInt();
    var arr = new Array[Int](n);

    for(i <- 0 to n-1){
      print("Enter digit " + (i+1) + " : ");
      arr(i) = scala.io.StdIn.readInt();
    }

    print("Inserted numbers : ");

    for(x <- arr){
      print(" " + x + " ");
    }

  }

}