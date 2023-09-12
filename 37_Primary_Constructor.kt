// Primary Constructor synatx

// Yha constructor likhna optional hai mhi v likh skte hai
// But yha parameter ka datatype define krna jruri hai
// Yha val likhna v jruri hai nhi lkhge to var mana jyega
// Class ka object create krte hi constructor call ho jata hai

class Sit constructor(val name: String ,val  age:Int ) {

    // properties

    var gender :String = "Female"
    var hName:String
    var hAge:Int


    // Init Block >>> Object bnte hi init ke andr ka code execute ho jat hai hai

    init{
        println(" Init block start executing ")
        hName=name // Properties me jo value bnaye the usko yha set kr rhe hai 
        hAge=age
    }
    

    // Memeber function
    fun disp(){
        println("Sit class Nmae :- $name Age :- $age abd Genderm :- $gender ")
    }

}

// Niche wale me hamlog constructor nhi likhe hai
class Sit1( name: String,  age: Int) {
    // properties

    var gender :String = "Female"
    var hName:String
    var hAge:Int= age //Isko yha v ste ke skte hai bina init block ka use kiye hue 
    

    // Init Block
    init{
        println(" Init block start executing ")
        hName=name // Properties me jo value bnaye the usko yha set kr rhe hai 
        
    }

    // Memeber function

    fun disp(){
        println("Sit1 class Nmae :- $hName Age :- $hAge abd Genderm :- $gender ")
    }

}

fun main() {

    val p1 = Sit("Sonam",35)
    p1.disp()
    println(p1.name) 
    println(p1.age)
    println(p1.gender)
    
    val p2 = Sit("Rahul",35)
    p2.disp()
    
    
    val p3 = Sit("Rahul",35)
    p3.gender ="Male" // Yha hamlog gender ka value change kr de rhe hai 
    p3.disp()


    val p4 = Sit1("Ganesh",65)
    p4.disp()
}
