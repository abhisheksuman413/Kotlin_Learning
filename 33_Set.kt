fun main() {

    // Set :-

    /*
       1) Uniqueness:- Sets in Kotlin are designed to store unique elementsThis means
                      that if you try to add an element to a set that is already present
                      it won't create a duplicate; instead, it will simply update the
                      existing element. This property is particularly useful when you
                      need to ensure that a collection contains distinct values.
    */

    // Ste me index nhi hota hai 
    // Value update is not possible becouse of index

    val fruits = mutableSetOf("apple", "banana", "cherry")

    // Adding elemnt to
    fruits.add("banana") // Doesn't create a duplicate, set remains the same
    fruits.add("orange") // Adds "orange" to the set

    for (i in fruits) {
        println("printing set fruits :- $i")
    }

    /*
       2. Unordered:- Sets do not maintain any specific order of elements. Unlike lists,
                      where elements have a well-defined index and order, sets don't
                      guarantee any particular sequence. If you need to maintain order
                      along with uniqueness, you can use a LinkedHashSet, which preserves
                      the order of insertion, or sort the elements separately when necessary.
    */

    val sit = setOf(3, 1, 2, 2, 5, 7, 5, 9, 0)
    val sit6 = setOf<Int>(3, 1, 2, 2, 5, 7, 5, 9, 0)
    println(sit) // Output can be any order but not duplicate value {[3, 1, 2, 5, 7, 9, 0]}

    /*
        3. Fast Lookup:- Sets are optimized for fast membership checking. You can quickly
                         determine if a specific element is in a set by using the 'in'
                         operator, making them efficient for tasks like checking for
                         duplicates or filtering unique values from a collection.
    */

    val sit1 = setOf("apple", "banana", "cherry")
    val containsBanana = "banana" in sit1 // true
    println(containsBanana)

    /*
    4. Use Cases:

        Removing Duplicates: Sets are commonly used to eliminate duplicate elements from
                             a list or collection. You can iterate through the original
                             collection and add its elements to a set, ensuring that only
                             unique elements are retained.

        Checking for Uniqueness: When you want to verify if a collection contains only
                                 unique elements, you can convert it to a set and compare
                                 its size with the original collection's size.

        Efficient Search: If you need to perform fast lookups to check if an element is
                          present in a collection, using a set is more efficient than
                          searching through a list.

        Counting Unique Items: Sets can be used to count the number of unique items in a
                               collection.

    */

    /*
    5. Mutable vs. Immutable Sets: Depending on your requirements, you can choose between
                                   mutable and immutable sets. Immutable sets ('setOf()')
                                   are useful when you want to ensure that the set's
                                   contents remain constant, while mutable sets
                                   ('mutableSetOf()', 'HashSet', etc.) allow you to
                                   modify the set by adding or removing elements.

        >>> mutableSetOf(): Creates a mutable set that allows you to add, remove, and
                            modify elements.
        >>> HashSet: A commonly used implementation of a mutable set that provides fast
                     access times. It doesn't guarantee any specific order of elements.
        >>> LinkedHashSet: A mutable set that maintains the order of elements in which
                           they were added.
        >>> TreeSet: A mutable set that sorts elements in natural order or based on a
                     provided comparator.
    */

    // Immutable Set
    val sit2 = setOf("apple", "banana", "cherry")
    // sit2.add("orange") >>> This will result in a compilation error
    println("Printing set sit2")
    println(sit2)
    
    
    val sit3 = mutableSetOf("apple", "banana", "cherry")
    println("Printing set sit3")
    sit3.add("orange") // Adds "orange" to the mutable set
    println(sit3)
    
    // Remove elemnt from set
    // Remove not posible in immutable Set
    sit3.remove("apple")
    println("Printing set sit3 after removel ")
    println(sit3)

    // Printing size 

    // val sit6 = setOf<Int>(3, 1, 2, 2, 5, 7, 5, 9, 0)

    println("Printing size of set sit6 :- ${sit6.size}")

    
     

}
