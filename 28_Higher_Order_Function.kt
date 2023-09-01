

fun inchtofeet(inch:Double):Double{
    return inch*0.0833
}

fun yardtofeet(yard:Double):Double{
    return yard*0.0277
}

// Niche hamlog higher order function bna rhe hai
// Niche convert eak prameter hai jo ki eak lambda function le rha hai
// convert parameter jo function as a inpute le rha wo function Double data type inpute 
// le rha hai or Double dat type hi return kr rha hai
fun  higher_order_function(convert:(Double)->Double,value :Double){

    // Yha result1 me hamlog conver function ko call kr rhe hai or usme value ko pass kr rhe hai 
    var result1 =convert(value)
    println("Result is :- $result1")

}

// Niche asa higher order function bna rhe hai jo lambda function ko return krta hai
/*  (Double)->Double   >>> Ye decide function ka return type hai becouse decide jo function
                           return(inctofeet/yardtofeet) krta hai wo eak Double value leta
                           hai or Double value hi return krta hai     */
fun decide(cheack:Boolean):(Double)->Double{
    if(cheack){
        return::inchtofeet
    }
    else{
        return::yardtofeet
    }
}

fun main() {

    /*  higher_order_function(inchtofeet() ,43) >>> Iss trh se call krege higher order 
                                                    function ko to error aayega hame 
                                                    reference ke through call krna hoga
    >>> Hame inchtofeet function ka reference pass krna hoga
    >>> Only function pass kr dene se error aata hai 
    */
    higher_order_function(::inchtofeet ,43.00) // Yha inchtofeet ka refernce pass kr rhe hai
    
    
    // Yha decide eak lambda function(ke reference) ko return kr rha hai 
    var callfunction =decide(false) //Yha decide eak lambda function return kr rha hai
    higher_order_function(callfunction,43.00)
    higher_order_function(decide(true),43.00) // Ase v call kr skte hai 




}


/*

Higher Order Function :-A function which can accept a function as 
                          parameter or can return a function

*/
  