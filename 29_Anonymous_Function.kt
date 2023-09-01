fun main() {
    /*
    Anonymous Function >>> Wase function ko bolte hai jiska koi name nhi hota hai
                       >>> Isko paramiter ke sath or paramite ke bina v bna skte hai
                       >>> ISme sara kam normal function ki trh hota hai 
    */

    println(addd(10, 21))

    val addd1 =
            fun(a: Int, b: Int): Int {

                println("Hello kotlin")
                return a + b
            }
    println(addd1(10, 21))
}

val addd =
        fun(a: Int, b: Int): Int {

            return a + b
        }
