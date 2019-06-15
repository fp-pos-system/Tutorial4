object q6 {
  // converting a decimal number to binary
  def main(args: Array[String]) = {
    print("Enter the decimal number : ");
    var n = scala.io.StdIn.readInt();
    var temp = n;
    var remainder = 0;
    var str: String = "";
    var binarynumber = "0";

    while(n != 0){
      remainder = n%2;
      str += remainder.toString;
      n = n/2;
    }

    if(temp != 0){
      binarynumber = "0"; binarynumber = str.reverse;
    }

    print("Binary number : " + binarynumber);

  }

}
