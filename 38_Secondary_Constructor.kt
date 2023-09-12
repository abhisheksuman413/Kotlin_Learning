/*
Secondary Constructor: These are defined inside the class 
                body and can have zero or more parameters. You can have 
                multiple secondary constructors in a class.

*/
// Eak bar jis name se class bna liye hai to us name se fir class nhi bna pyege 

class People{
    // Properties

    var gender:String = "Male"
    var hName:String
    var hAge:Int

    // Niche constructor keyword likhna jruri hai 
    constructor(name:String,age:Int){
        println("Constructor called ") //Ye object bnte hai run ho jyega 
        hName= name
        hAge= age

    }

    // Memeber function 

     fun disp(){
        println("Nmae :- $hName  Age:- $hAge Gender :- $gender ")
     }

}

// Niche wale constructor me this keyword use krege
// Jo name se constructor me parameter bnaye hai wahi name constructor ke properties me 
// use krna chahe to this keyword ka use krna pdta hai 
class People1{
    var gender:String = "Male"
    var name:String
    var age:Int


    constructor(name:String, age:Int ){
        // name=name >>> Age asa use krte hai to this keywod ka use krna hoga
        this.name=name
        this.age=age

    }

    fun disp(){
        println("Nmae :- $name  Age:- $age Gender :- $gender ")
     }
}



fun main(){
    val p1= People("Soman",65)
    p1.disp()
    println(p1.hName)
    println(p1.hAge)
    println(p1.gender)
    
    
    val p2= People1("Ram",65)
    p2.disp()
    println(p2.name)
    println(p2.age)
    println(p2.gender)
}