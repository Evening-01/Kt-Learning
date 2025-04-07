package 中级.空值和空类型

fun main() {
    val student: Student? = null  // 此处不加? 编译器会报错，代表的意思为student可能为空，所以不能直接调用方法
    println(student?.name) // 调用可能为空的student的name属性，如果student为空，则输出为null（安全调用，不会空指针异常）

    println(student?.age ?: "我是空值返回的结果")  // 比如此处，如果age为空，则输出"我是空值返回的结果"，否则输出age的值

    // 编译器的智能转换
    if (student != null) {
        student.name = "Bob"  // 此处的绿色不报错是因为编译器会自动将student转换为非空类型
    }

    // 非空断言操作符：!!
    val studentNotNull: Student = student!!  // 非空断言，如果student为空，则会抛出空指针异常（java.lang.NullPointerException）
    studentNotNull.name = "Charlie"  // 这两行会报错,建议运行时注释这两行
}