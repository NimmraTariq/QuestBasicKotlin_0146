fun sum(x: Int, y: Int): Int {
    return x + y
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun printMessage(message: String) {
    println(message)
    // `return Unit` or `return` is optional
}

fun uppercaseString(string: String): String {
    return string.uppercase()
}

fun main() {
    println(sum(1, 2))
    // 3

    // Uses named arguments with swapped parameter order
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    // [Log] Hello

    // Function called with both parameters
    printMessageWithPrefix("Hello", "Log")
    // [Log] Hello

    // Function called only with message parameter
    printMessageWithPrefix("Hello")
    // [Info] Hello

    printMessageWithPrefix(prefix = "Log", message = "Hello")
    // [Log] Hello

    printMessage("Hello")
    // Hello

    println(uppercaseString("hello"))
    // HELLO

    println({ string: String -> string.uppercase() }("hello"))
    // HELLO
}
