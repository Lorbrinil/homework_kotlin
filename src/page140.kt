class TapeDeck {
    var hasRecorder = false
    fun playTape() {
        println("Tape playing")
    }
    fun recordTape() {
        if (hasRecorder) {
            println ("Tape recording")
        }
    }
}


class DVDPlayer(var hasRecorder: Boolean) {
    fun recordDVD() {
        if (hasRecorder) {
            println ("DVD recording")
        }
    }
    //добавили метод
    fun playDVD() {
        if (hasRecorder) {
            println ("DVD playing")
        }
    }
}


fun main(args: Array<String>) {
    //"Файл" А
    var t = TapeDeck() //не создали объект класса tapeDeck, так что создадим
    t.hasRecorder = true
    t.playTape()
    t.recordTape()


    //"Файл" В
    val d = DVDPlayer(true)
    d.playDVD() //отсутствовал метод playDVD, надо добавить
    d.recordDVD()
}

