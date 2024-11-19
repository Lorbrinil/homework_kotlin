class BadException : Exception()

fun myFunction(test: String) {
    try {
        print("t")
        print("h")
        riskyCode(test)
        print("r")
        print("o")
    }
    catch (e: BadException) {
        print("a")
    }
    finally {
        print("w")
        print("s")

    }
}
fun riskyCode(test:String) {
    if (test == "Yes") {
        throw BadException()
    }

}

fun main(args: Array<String>) {
    val test: String = "Yes"
    myFunction(test)
}

//Ответ в учебнике
/*class BadException : Exception()
fun myFunction(test: String) {
    try {
    }
    print("t")
    riskyCode(test)
    print("o")
} catch (e: BadException) {
    print("a")
} finally {
    print("w")
    print("s")
}
fun riskyCode(test:String) {
    print("h")
    if (test == "Yes") {
        throw BadException()
    }
    print("r")
}*/