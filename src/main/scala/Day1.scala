object Day1 {
  def main(args: Array[String]): Unit = {
    println("for：乘法表")
    for (i <- 1 to 9; j <- 1 to i) {
      print(j + "*" + i + "=" + j * i + " ")
      if (j == i)
        println()
    }

    println("*" * 50)

    println("while：乘法表")
    var i = 1;
    var j = 1;
    while (j < 10) {
      while (i < j + 1) {
        printf("%d*%d=%2d\t", i, j, i * j);
        i = i + 1;

      }
      println();
      i = 1;
      j = j + 1;
    }
  }

}
