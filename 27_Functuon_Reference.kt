

fun kilotogram(kilo:Int):Int{
    return kilo*1000
}

fun main(){
    
    // Yha ham n me kilotogram function ka result(return) store kr rhe hai 
    val n =kilotogram(21)
    println(n)

    // Yha n1 me ham kilotogram function ka reference store kr rhe hai
    // >>> Referenceka matlab hai ye n1 ko ham bad me kilotogram function ke trh use kr ske 
    // >>> reference ka matlb hua kilogram function ko n1 varible se call kr skte hai 
    // Syntax
    // :: se ham reference pass krte hai 
    // This isnot possilbe in lambda function
    
    var n1 =::kilotogram
    println("${n1(31)}")


    
}



