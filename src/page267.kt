class Duck(val height:Int? =  null) {
    fun quack() {
        println("Quack! Quack!")
    }
}
class MyDucks(var myDucks: Array<Duck?>) {
    fun quack() {
        for (duck in myDucks) {
            duck ?. let {
                it.quack()
            }
        }
    }
    fun totalDuckHeight(): Int {
        var h:Int = 0
            for (duck in myDucks) {
                h += duck?.height ?: 0 //прибавить к h рост утки если утка не Null и рост утки не Null, иначе прибавить 0
            }
        return h
    }
}