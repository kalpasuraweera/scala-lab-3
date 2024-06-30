@main def main(): Unit= print(mean(5,6))

def mean(num1: Int, num2:Int): Float = 
    val meanVal = (num1 + num2)/2.0
    f"$meanVal%.2f".toFloat