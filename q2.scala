object filterStrings{
    def filterLongStrings(str: List[String]): List[String] = {
        str.filter(_.length>5)
    }
    def main(args: Array[String]): Unit = {
        val inputList = List("hello","world","Scala","programming")
        val filteredString = filterLongStrings(inputList)
        println(s"Input List: $inputList")
        println(s"Filtered List: $filteredString")
    }
}