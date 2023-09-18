// Inheritance with Secondary Constructor


open class Father2{ 
    // Properties
    var car : String 
    var money:Int

    // Secondary constructor 
    constructor(car:String,money:Int){ // Iss constructor ko aargument Son class ka object dega
        this.money=money
        this.car=car
     }

    // Memeber functioon 
    fun disp(){
        println("Father car :- $car")
        println("Father money :- $money")
    }
}

class Son2:Father2{
    // Properties
    var Bike :String

// RULES:-

    // Father class me constructor bnaye hai uske liye yha constructor bnana pdega 
    // Iss Wale constructor me phle wo argument likhna pdega jo Father class ke constructor me hai 
    // uske bad iska aapna koi constructor ka argument hoga wo likhna pdega 
    // uske bad : dena hoga uske bad super() likhna hoga 
    // or isme Father class ke constructor ke argument ko likh dege
    // Secondary constructor me super() use krna hota hai 
    constructor(car:String,money:Int,Bike:String):super(car,money){
        this.Bike=Bike
    }


    // Member function
    fun show(){
        println("Son Bike :- $Bike ")
        println("Father car after Inheritance  :- $car") 
        println("Father money after Inheritance  :- $money") 
        
    }
}
    




fun main(){

    
    var s1 =Son2("mg 3000",501,"KS 100")
    s1.show()
  
    // Ressine v kr skte hai
    println("After ressaine")
    s1.car ="XUV"
    s1.money =500
    s1.show()
    s1.disp()
    
    
}