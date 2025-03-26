package 中级.类的定义_对象的创建与使用

fun main() {
    val stu = Student("张三", 20)
    val stu2 = Student("李四")

    stu.name = "李四"
    println(stu.name)
    println(stu.age)

    println(stu2.name)
    println(stu2.age)
}