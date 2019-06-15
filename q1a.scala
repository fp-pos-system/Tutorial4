object q1a {
  // finding the average of an array
  def main(args: Array[String]) = {
    print("Enter no of digits : ");
    val n = scala.io.StdIn.readInt();
    var arr = new Array[Int](n);
    var sum = 0.0;
    var avg = 0.0;

    for(i <- 0 to n-1){
      print("Enter digit " + (i+1) + " : ");
      arr(i) = scala.io.StdIn.readInt();
    }

    for(x <- arr){
      sum += x;
    }

    avg = sum/n;
    println("Average is : " + avg);

  }


}
