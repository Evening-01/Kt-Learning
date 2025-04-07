package 中级.中缀函数

// 中缀函数：infix
/*
  定义条件：
    - 必须是成员函数
    - 只有一个参数
    - 参数不能有默认值
 */

class Student(var name: String,var age: Int) {
    infix fun test(other: String): String {
        return "$name and $other"
    }
}