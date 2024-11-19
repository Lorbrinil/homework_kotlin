//result:
//Start try
//Start risky code
//End risky code
//End try
//Finally
//End of main
/*fun main(args: Array<String>) {
    val test: String = "No"
    try {
        println("Start try")
        riskyCode(test)
        println("End try")
    } catch (e: BadException) {
        println("Bad Exception")
    } finally {
        println("Finally")
    }
    println("End of main")
}
class BadException : Exception()
fun riskyCode(test: String) {
    println("Start risky code")
    if (test == "Yes") {
        throw BadException()
    }
    println("End risky code")
}*/


//result:
//Start try
//Start risky code
//Bad Exception
//Finally
//End of main
//fun main(args: Array<String>) {
//    val test: String = "Yes"
//    try {
//        println("Start try")
//        riskyCode(test)
//        println("End try")
//    } catch (e: BadException) {
//        println("Bad Exception")
//    } finally {
//        println("Finally")
//    }
//    println("End of main")
//}
//class BadException : Exception()
//fun riskyCode(test: String) {
//    println("Start risky code")
//    if (test == "Yes") {
//        throw BadException()
//    }
//    println("End risky code")
//}