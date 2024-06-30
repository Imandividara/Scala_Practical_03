object reverseString{
    def reverse(str:String): String = {
        if (str.isEmpty) ""
        else reverse(str.tail) + str.head
    }

    def main(args: Array[String]): Unit = {
        val inputString = "Hello World"
        val reverseString = reverse(inputString)
        println(s"The reverse of '$inputString' is '$reverseString'")
    }
}
