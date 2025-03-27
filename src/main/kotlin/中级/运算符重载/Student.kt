package 中级.运算符重载

class Student(var name: String, var age: Int) {
    // 重载“+”运算符
    // 两个学生对象相加，返回一个新的学生对象
    operator fun plus(another: Student) = Student(name + another.name, age + another.age)

}