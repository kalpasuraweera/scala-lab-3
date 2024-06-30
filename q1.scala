@main def main(): Unit =print(reverseString("UCSC"))


def reverseString(s:String): String = 
    val length: Int = s.length()
    length match{
        case 0 => s
        case _ => s(length -1) + reverseString(s.substring(0, length-1))
    }