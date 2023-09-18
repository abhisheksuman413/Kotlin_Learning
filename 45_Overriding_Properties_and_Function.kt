// Overriding Properties and Function

open class Father4 {
    // Properties
    open var car: String = "Alt 101" // Yha isme open likhe hai becouse isko override(Modify) kr rhe hai Son4 class me 
    var money: Int = 1001

    // Member function
    open fun disp() { // Yha isme open likhe hai becouse isko override(Modify) kr rhe hai Son4 class me
        println("Father car :- $car")
        println("Father money :- $money")
    }
}

class Son4 : Father4() {
    var Bike: String = "KS 301"
    // Overrideing 
    // var car: String = "Alt 101 >>> Yha car jo hai wo Father4 class ka properties hai usko 
                                   // iss trh se ham ressine nhi kr skte hai error aayega 
                                   // override ka kuy ki yha override kr he hai 
                                   // Yha ham drirectly likh de rhe hai ase nhi kr skte hai 
                                   // override kr ke likhna hoga  
   
    override var car: String = " BMW " // Ase override keyword likhna hoga 
                                      // Or Father4 ke jis property ko override kr rhe hai 
                                      // uske aage opne likhna hoga wo open hoga tb hi usko 
                                      // override kr skte hai 



    // Member function
    fun show() {
        println("Son Bike :- $Bike ")
        println("Father car after Inheritance  :- $car")
        println("Father money after Inheritance  :- $money")
    }

    /*
    >>> Niche me Father4 class ke member function ko override kr rhe hai 
    >>> Isliye uske aage override likhe hai
    >>> Or Father4 class me iss function ke aage open likhe hai 
    */

    override fun disp() { 
        println("Father car after modify disp function :- $car")
        println("Father money after modify disp function :- $money")
    }
}

fun main() {
    // Creating son class object 
    val s1 = Son4()
    s1.show()
    s1.disp() // Iss disp() me Son4 class me jo modify kiye hai wo call hoga 
             //  Becouse ye ab Son4 ka disp() function ho gya 
    
    
    // Creating father class object
    val f1 = Father4()
    f1.disp() // Iss disp() me original Father4 class wala call hoga 
             // Or ye to Father4 ka disp() function hai hi 
}
