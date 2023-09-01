fun main(){
    var a=10
    var b=21
    var total = add(a,b)
    println(total)
    var total1 = add(a) // Iss function me b ka value Default Argument se aa rha hai
    println(total1)    // Agr function define krte time b ka default value nhi diye hote to error aata
    
}

/*

Function with Default Argument >>> Hota hai jb  function call krte time koi 
                                   Parameters ka value nhi diye to jha function 
                                   define kr rhe hai wha jo Parameters ka default
                                   value diye hoge whi function me pass ho jyega  
                               >>> Agr function call krte time Parameters ka value
                                   de diye hai tb function define krte time agr 
                                   Parameters ka default value diya hoga to wo pass
                                   nhi hoga


*/

fun add(x:Int,y:Int=51):Int{
    return(x+y)
}