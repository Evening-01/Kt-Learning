package 中级.运算符重载

fun main() {
    val stu = Student("张三", 20)
    val stu2 = Student("李四", 25)
    println(stu.plus(stu2).name)
    println((stu + stu2).name)
}