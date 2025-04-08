package 中级.类的封装

class Student(private var name: String, private var age: Int) {
    fun getName() = name
    fun getAge() = age

    fun setAge(age: Int) {
        this.age = age
    }

    fun setName(name: String) {
        this.name = name
    }
}