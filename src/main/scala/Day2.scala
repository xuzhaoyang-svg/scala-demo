object Day2 {

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6 , 7)

    // map里表达式反过来就不行
    list.map("*" * _).foreach(println(_))
  }
}
