//     *****Interface*****



// Interface is similer to abstract class 
// Interface bnane ke liye intrafece keywod ka use krte hai 
// Interface ka koi object create nhi hota hai 


interface Father12 {
    // Properties 
    // var car:String= "Alt 101" >>> Interface me properties ko initlize nhi kr skte hai
                              // >>> because interface me jo v prperties hota hai wo by default 
                              // >>> abstract properties hota hai 
    var car :String   // This is a abstract properties we cannot initlize here 
                     // child class(Son12) isko initlize krega 


    // Member function 

    fun disp(){ // Member function Interface me abstract nhi hota hai
        println("Father car :-  $car")
    }

    // Agr koi function likhte hai or usko define nhi krte hai to usko by 
    // by default abstract function/method mana jayega 



    fun hello() // This is a abstract method 

}

class Son12:Father12{
    // Properties
    var bike:String="K11"

    // Implementing Father12 class abstract property
    
    override var car :String = "Altn 101"
    // Implementing Father12 class abstract method/function
    override fun hello(){
        println("Father abstract method hello ")
    }
    

    // Member function 
    fun show(){ // Member function Interface me abstract nhi hota hai
        println("Father car show function  :-  $car")
    }

}



fun main(){
    val s1 = Son12()
    s1.show()
    s1.hello()
    s1.disp()


    // val f1 = Father12() >>> This is not possible becouse Father12 is not a class this is Interface
                        // >>> Creating of Interface object is not possible 


}


