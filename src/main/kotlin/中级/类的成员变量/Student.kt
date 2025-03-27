package 中级.类的成员变量

class Student(var name: String, var age: Int) {
    fun hello(name: String, age: Int) {
        println("大家好，我是${name}，今年${age}岁了。")  // 这里的name和age是局部变量，不是类的成员变量,就近原则
        println("大家好，我是${this.name}，今年${this.age}岁了。")  // 这里的name和age是类的成员变量
    }
}