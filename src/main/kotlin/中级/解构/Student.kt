package 中级.解构

class Student(var name: String, var age: Int) {
    operator fun component1() = name
    operator fun component2() = age
}