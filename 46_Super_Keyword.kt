// Useing Super Keyword

open class Father5 {
    // Properties
    open var car: String = "Alt 101" // Yha isme open likhe hai becouse isko override(Modify) kr rhe hai Son5 class me 
    var money: Int = 1001

    // Member function
    open fun disp() { // Yha isme open likhe hai becouse isko override(Modify) kr rhe hai Son5 class me
        println("Father car :- $car")
        println("Father money :- $money")
    }
}

class Son5 : Father5() {
    var Bike: String = "KS 301"
    // Overrideing 
    // var car: String = "Alt 101  >>> This is not possible 
   
    override var car: String = " BMW " // Yha Father5 class ke properties ko override kr rhe hai 

    // Ye uper me to ye car Son5 class ka properties ban gya but 
    // Son5 class me hi Father5 class ke original car properties ka 
    // use krna chahe to ham >>> super <<< keyword ka use krna hoga
    // Niche me wahi kr rhe hai 
    // Niche me super keyword use kiye hai 
    // Iss se override krne ke bad v access kr skte hai

    var fcar:String=super.car // Yha fcar me Father5 class ke original car properties ko store kr diye 
                             // Ab niche jha v fcar use krege wha Father5 class ke car properties use hoga 


    // Member function
    fun show() {
        println("Son Bike :- $Bike ")
        println("Father car after Inheritance  :- $car")
        println("Father money after Inheritance  :- $money")
        println("Printing Father car original properties after override :- $fcar")
    }

    
    override fun disp() { 
        println("Father car after modify disp function :- $car")
        println("Father money after modify disp function :- $money")
    }
}

fun main() {
    // Creating son class object 
    val s1 = Son5()
    s1.show()
    s1.disp() // Iss disp() me Son5 class me jo modify kiye hai wo call hoga 
             //  Becouse ye ab Son5 ka disp() function ho gya 
    
    
    // Creating father class object
    val f1 = Father5()
    f1.disp() // Iss disp() me original Father5 class wala call hoga 
             // Or ye to Father5 ka disp() function hai hi 
}
