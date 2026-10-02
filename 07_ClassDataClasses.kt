class Contact(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

data class User(val name: String, val id: Int)

fun main() {
    val contact = Contact(1, "mary@gmail.com")

    // Prints the value of the property: email
    println(contact.email)
    // mary@gmail.com
    // Updates the value of the property: email
    contact.email = "jane@gmail.com"

    // Prints the new value of the property: email
    println(contact.email)
    // jane@gmail.com

    // Calls member function printId()
    contact.printId()
    // 1

    val user = User("Alex", 1)
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    // Secara otomatis menggunakan fungsi toString() agar output mudah dibaca
    println(user)
    // User (nama = Alex, id = 1)

    // Membandingkan User dengan User kedua
    println("user == secondUser: ${user == secondUser}")
    // user == secondUser: true
    // Membandingkan User dengan User ketiga
    println("user == thirdUser: ${user == thirdUser}")
    // user == thirdUser: false

    // Membuat salinan yang tepat dari User
    println(user.copy())
    // User (nama = Alex, id = 1)
    // Membuat salinan User dengan nama: "Max"
    println(user.copy("Max"))
    // User(nama=Max, id=1)
    // Membuat salinan User dengan id: 3
    println(user.copy(id = 3))
    // User (nama = Alex, id = 3)
}
