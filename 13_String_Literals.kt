fun main() {
    // Escaped String

    println("HELLO\nworld ")
    println("hello\tworld")

    // Raw String

    // " " >>> Iske bich me jo kuch v likhte hai wo single line me likhte hai multiline nhi use kr
    // skte hai
    // val sit = " Dear sir/madam,
    //             i would like to request you  kindly "   >>> Not a valid syntax

    // Multiline likhne ke liye hamlog """  """ ke bich me likhte hai
    // Niche me agr Escaped String use kiye to usko string hi consider krega

    val sit = """ Dear sir/madam, 
                i would like to request you  kindly """.trimIndent()  
    //  trimIndent() >>> Iska use krne se proper trim ho kr print hoga

    println(sit)
}
