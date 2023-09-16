// Inheritance

// Rules for Inheritance 
// Jis class ko Inherate krna hai usko open bnana pdega(Parent class ko )
// Jis class me krna hai hai wha : dene ke bad class ka name likhna pdega(Child class me
// Parent class ka name likhna pdega   )
// 

open class Father{
    // Properties
    var car : String ="Alt 100"
    var money : Int= 10001
    // Memeber functioon 
    fun disp(){
        println("Father car :- $car")
        println("Father money :- $money")
    }
}
// Niche me ab Father class ke kis function ya properties ko access kr skte hai
class Son:Father(){
    // Properties
    var Bike :String="K 10"
    // Member function
    fun show(){
        println("Son Bike :- $Bike ")
        println("Father car after Inheritance  :- $car") // Care name ka koi properties nhi hai Son class me 
        println("Father money after Inheritance  :- $money")
        
    }
    
}

class Daughter:Father(){
    // Properties
    var Bike :String="KT 9"
    
    // Member function 
 
    fun show(){
        println("Daughter Bike :- $Bike ")
        println("Father car after Inheritance  :- $car")  
        println("Father money after Inheritance  :- $money")
        
    }
}

fun main(){

    var f1=Father()
    f1.disp()

    var s1 =Son()
    s1.show()

    /*
    Bina Inheritance kiye hue dusre class ke kisi function 
    ya properties ko acess nhi kr skte hai
    Ex:- s1.disp() >>> Ye possible nhi hai bina Inheritance kiye hue becouse 
                       disp() function Father class ka hai or iske Son class ka 
                       object access kr rha hai to error aayega 
    >>> Iske hame Inheritance krna hoga 
    */
    
    // Uper me Father ka object nhi v bnayege to kam chlega because 
    // Father class ke kisi chij ko Son class ke object se call kr skte hai 
    // Inheritance ho jane ke bad niche wala possible hai 

    println("Inheritance hone ke bad ")
    s1.disp()
    
    // Ressine v kr skte hai
    println("After ressaine")
    s1.car ="XUV"
    s1.money =500
    s1.show()
    s1.disp()
    
    
    println("Daughter Class object ke bad ")
    
    var d1=Daughter()
    d1.show() /* Iss show function me Son class ke object ke through
                 ko Father class ke properties ko ressine kiye the wo
                 wo change nhi hoga 
            >>> Becouse Son Father class ke properties ko liya to wo Son
                class ka properties ho gya islu=ye Dughter class me koi change 
                nhi hua  */
    d1.disp() // Yha v change nhi hoga becouse Doughter class ke object se call kr rhe hai
    s1.disp() // Yha change hoga becouse Son class ke object se call kr rhe hai 
}