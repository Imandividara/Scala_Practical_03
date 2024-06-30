object mean{
    def calculateMean(num1:Int,num2:Int):Double={
        val mean=(num1+num2)/2.0
        BigDecimal(mean).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    }
    def main(args: Array[String]): Unit = {
        val num1=14
        val num2=27
        val mean=calculateMean(num1,num2)
        println(f"The mean of the two numbers is $mean%.2f")
    }
}