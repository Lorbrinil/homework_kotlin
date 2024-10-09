data class Student(val firstName: String, val lastName: String,
                   val house: String, val year: Int = 1)

fun main(args: Array<String>) {
    val s1 = Student("Ron", "Weasley", "Gryffindor")
    val s2 = Student(lastName = "Malfoy", firstName = "Draco", year = 1) //не указан house или указать его в data class по умолчанию
    val s3 = s1.copy(firstName = "Fred")
    s3.year = 3 //не можем изменить уже созданный объект, так как val year
    val s4 = s3.copy(firstName = "George")
    val array = arrayOf(s1, s2, s3, s4)
    for (s in array) {
        println("${s.firstName} ${s.lastName} is in ${s.house} year ${s.year}")
    }
}