object q2 {
  // merging 2 arrays
  def main(args: Array[String]) = {
    var arr1 = Array(1, 2, 3);
    var arr2 = Array(4, 5, 6);

    var n = arr1.length;
    var m = arr2.length;
    var p = n+m;

    var arr3 = new Array[Int](p);

    arr3 = arr1 ++ arr2;

    print("Array 1 : ");
    for(x <- arr1){
      print(" " + x + " ");
    }
    println();

    print("Array 2 : ");
    for(x <- arr2){
      print(" " + x + " ");
    }
    println();

    print("Merged array : ");
    for(x <- arr3){
      print(" " + x + " ");
    }
    println();


  }

}
