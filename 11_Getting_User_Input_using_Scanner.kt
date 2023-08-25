import java.util.*

fun main() {
    println("Enter your name :- ")
    val sc = Scanner(System.`in`) // Getting User Input using Scanner
    val name = sc.next()
    println(name)
    println(name::class.simpleName)

    // Niche hamlog Float me typeconversion kr rhe hai
    print("Enter your fee :-")
    val fee = sc.nextInt() // Agr integer inpute lena hoga to next() ke bdle nextInt() use krna hoga
    println("Your roll no is :- $fee")
    println(fee::class.simpleName)

    /* >>> Baki data type ke inpute ke liye  ase hi next ke sath data type ka use kr lege
           inpute lene ke liye
       >>> Inpute lene ke liye best hai readLine() ka hi use kre  */

}
