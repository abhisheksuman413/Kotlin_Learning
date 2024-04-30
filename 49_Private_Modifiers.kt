/*
private:- The private modifier restricts visibility to the enclosing
            class or function. It means the element is only visible
            within the scope it is defined in and cannot be accessed
            from outside that scope. */


// Niche a ko private bna rhe hai iska matlab a kewal Father7 class me hi use kr skte hai


 open class Father7 {
    // Properties
    private  var a: Int = 11 // Yha a ko private kr rhe hai
    var b: Int = 32
    var c: Int = 67
    var d: Int = 112
    var e: Int = 3

    // Member function
    fun disp() {
        println("A :- $a")
        println("B :- $b")
        println("C :- $c")
        println("D :- $d")
        println("E :- $e")
    }

    fun hello() {
        println("Hello Father")
    }
}

class Son7 : Father7() {
    // Properties
    var bike: String = "KS 201"

    // Member function

    fun show() {

        // println("A using in Son class :- $a") >>> a ko yha nhi use kr skte hai becouse isko private bna diye hai Father7 class me 
        println("B using in Son class :- $b")
        println("C using in Son class :- $c")
        println("D using in Son class :- $d")
        println("E using in Son class :- $e")
        hello()
    }
}

fun main() {
    val s1 = Son7()
    s1.disp()
    s1.show()

    // s1.a = 1 >>> a ko yha v use nhi kr skte hai because isko private bna diye hai Father7 class me  
    s1.b = 2
    s1.c = 3
    s1.d = 4
    s1.e = 5
    s1.disp()
}



/*
>>> Kisi property ya function ko private bna rhe hai to 
    usko kewal usi class me use kr skte hai or khi v nhi 
    main function me v nhi 
>>> a ko Father7 class ke object bna kr v main function me access nhi kr skte hai
    because of private

*/
