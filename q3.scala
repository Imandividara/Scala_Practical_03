object mean{
    def calculateMean(num1:Int,num2:Int):Double={
        val mean=(num1+num2)/2.0
        (math.round(mean * 100) / 100.0)
    }
    def main(args: Array[String]): Unit = {
        val num1=10
        val num2=20
        val mean=calculateMean(num1,num2)
        println(f"The mean of the two numbers is $mean%.2f")
    }
}