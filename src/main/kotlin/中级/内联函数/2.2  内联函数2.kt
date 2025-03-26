package 中级.内联函数

// 此处举出一个"非局部返回"的示例

fun main() {
    //  这是一个非局部返回的错误示例
    //  此处旧版本可以运行，新版本以被报错
    //  此处运行后后面代码将全部被返回，将不执行后续操作
    //  test { return }

    //  正确写法：
    test { return@test }
    // return@test 表示从 lambda 表达式中返回到 test 函数，而不是从 main 函数中返回。
}

private fun test(func: (String) -> Unit) {
    func("这是一个内联函数")
    println("调用内联函数之后")
}