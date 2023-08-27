fun main() {

    /*
    Synatax >>>

        if(condation){
            // code
        }
        else{
            // code
        }
    */

    // Niche wale me if wala code run hoga becouse condation in if else is true
    if (10 > 5) {
        println("Condation in if statement is true ")
    } else {
        println("Condation in if statement is false ")
    }

    // Niche wale me else wala code run hoga becouse condation in if else is false
    if (10 < 5) {
        println("Condation in if statement is true ")
    } else {
        println("Condation in if statement is false ")
    }

    val a = 10
    val b = 5
    val c = 7

    if (a > b) {
        println("Maximun no is $a")
    } else {
        println("Maximun no is $b")
    }

    if (a < c) {
        println("Maximun no is $a")
    } else {
        println("Maximun no is not $c")
    }

    //  if else value return krta hai isliye ham isko kisi varibale me store kr skte hai
    val max =if (a > b) {
                a
            } else {
                b
            }

    val min =if (a < c) {
                a
            } else {
                c
            }
    println(max)
    println(min)

    //  Uper wale ko single line me likhne ke liye 

    val max1 = if(a>b) a else b
    println(max1)
}
