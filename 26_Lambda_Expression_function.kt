fun main(){
    /* 
       Lambda Expression/Function >>>  Iss function ko ham { } ke andr hi likhte hai
       */

    //    Lambda Expression
    //  Phle parameter ko likhte hai -> ke bad uske body(code) ko likhte hai kya krega 
    val add2= {a:Int,b:Int -> a+b}
    val total = add2(10,29)
    println(total)
    println(add2(10,31))

    // Another way to writing above code / Lambda Expression

    val add3:(Int,Int)->Int ={a,b->a+b} // Agr yha kuch return nhi krta to Int ke place pe Unit likh 
    println(add3(41,40)) 

    // Return type lambda fuction
    val doubleage= {age : Int -> age*2} // Yha hame return keyword likhne ka jrurt nhi hota hai 
    println(doubleage(11))
    

    // Niche me ham lambda function ko define v kiye or call v kr liye hai same line me 
    //  Iss se hamenew varible bnane ka need nhi hota hai 
    val doubleage1 : Int ={age:Int -> age*2}(41)
    println(doubleage1)


}


/*


Lambda Fumction >>>  Lambda expressions provide a shorthand syntax to 
                     write functions. You can pass function types into
                     other functions. You can return a function type 
                     from another function*/