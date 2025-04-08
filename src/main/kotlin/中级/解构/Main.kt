package 中级.解构

fun main() {
    val student = Student("小明", 18)
    val (name ,age) = student
    println("我是$name, 我今年${age}岁了")

    // lambda表达式也可以使用
    val func: (Student) -> Unit = { (name, age) ->
        println("我是$name, 我今年${age}岁了")
    }

    func(student)
}