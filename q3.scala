object q3 {
  // merging 2 arrays with mixing
  def main(args: Array[String]) = {
    var array_A = Array("A", "A", "A", "A");
    var array_B = Array("B", "B", "B", "B");

    var n = array_A.length;
    var m = array_B.length;
    var p = n+m;
    var j = 0;
    var k = 0;

    var arry_AB = new Array[String](p);

    for(i <- 0 to p-1){
      var temp = i%2;
      if(temp == 0){
        arry_AB(i) = array_A(j);
        j+=1;
      }else{
        arry_AB(i) = array_B(k);
        k+=1;
      }
    }

    print("Merged array : ");
    for(x <- arry_AB){
      print(" " + x + " ");
    }

  }

}
