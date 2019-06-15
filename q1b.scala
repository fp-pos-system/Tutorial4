object q1b {
  // finding the smallest element in an array
  def main(args: Array[String]) = {
    print("Enter no of digits : ");
    val n = scala.io.StdIn.readInt();
    var arr = new Array[Int](n);
    var min = 0;
    var pos = 0;

    for(i <- 0 to n-1){
      print("Enter digit " + (i+1) + " : ");
      arr(i) = scala.io.StdIn.readInt();
    }

    min = arr(0);

    for(i <- 0 to n-1){
      if(arr(i) < min){
        min = arr(i);
        pos = i;
      }
    }

    println("Smallest number is : " + min);
    println("Position is : " + pos);

  }


}
