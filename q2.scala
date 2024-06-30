import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

@main def main(): Unit = print(filteredStrings().mkString(", "))

def filteredStrings(): Array[String] = filterStrings(readStrings(readNumberOfStrings()))

def readStrings(numStrings: Int): Array[String] =
    numStrings match {
        case x if x > 1 => Array(readString()).concat(readStrings(numStrings - 1))
        case _ => Array(readString())
    }

def readString(): String = 
    print("Enter String: ")
    readLine()

def readNumberOfStrings(): Int =
    print("Enter Number of Strings: ")
    readInt()


def filterStrings(allStrings: Array[String]): Array[String] =
    val allStringsLength: Int = allStrings.length
    allStringsLength match{
        case x if x > 1  => filterStrings(Array(allStrings(0))).concat(filterStrings(allStrings.slice(1, allStringsLength)))
        case x if allStrings(0).length() > 5 => allStrings
        case _ => Array()
    }