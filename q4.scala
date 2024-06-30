import scala.io.StdIn.readInt

@main def main(): Unit =
    val numInts= getInput("Enter Number of Inputs: ")
    printf("Sum Of Evens = %d", sumEvens(inputIntArray(numInts)))
    
def getInput(prompt: String): Int =
    print(prompt)
    readInt()

def inputIntArray(numInts: Int): Array[Int] = 
    numInts match{
        case x if x > 1 => inputIntArray(1).concat(inputIntArray(numInts - 1))
        case 1 => Array(getInput("Enter Number: "))
    }

def sumEvens(numbers: Array[Int]): Int =
    val numLen= numbers.length
    numLen match {
        case x if x > 1 => sumEvens(Array(numbers(0))) + sumEvens(numbers.slice(1, numLen))
        case 1 if numbers(0) % 2 == 0 => numbers(0)
        case _ => 0
    }