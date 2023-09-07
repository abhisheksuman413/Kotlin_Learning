import java.util.*

fun main() {
    // Map or Dictionary

    /*
    1. Key-Value Pairs:

        >>> A map is fundamentally a collection of key-value pairs.
           The key is used to identify a specific value within the map.
        >>> Keys must be unique within a map. If you attempt to add
            a new key-value pair with an existing key, the new value
            will replace the previous one.
    */

    val sit = mutableMapOf(
        // Key or value kuch v datatye ke ho skte hai jb tak
        //  datatype define nhi kiye hai
        "apple" to 3,
        "banana" to 5,
        "cherry" to 2,
        5 to "Apple" 

        )
    // Printing map
    println(sit) // {} me value aayega 
    println(" ")

    // Using get function for printing
    println(sit.get("banana"))
    println(" ")

    // Using for loop for printing
    for ((name, value) in sit) {
        println("key is :- $name and value is :- $value")
    }
    println(" ")
    // Other way to printing using for loop
    for(key in sit.keys){
        println("Key is :- $key and value is :- ${sit[key]}")
    }
    println(" ")

    // Printing only keys 
    println("printing keys only :- ${sit.keys}") // [] me print hpga
    println(" ")

    // Printing value only
    println("Printing value only :- ${sit.values} ")
    println(" ")

    // Printing size of map
    println("Printing size of map sit :- ${sit.size} ")
    println(" ")


    // Accessing values using keys
    val appleCount = sit["apple"] // 3 print
    println("Printing value through key :- $appleCount")
    println(" ")

    // Adding a new entry
    sit["orange"] = 4
    for ((name, value) in sit) {
        println("key is :- $name and value is :- $value")
    }
    println(" ")

    // Modifying a value
    sit["apple"] = 6
    // Modifying a value by put function
    sit.put("banana",65)

    for ((name, value) in sit) {
        println("key is :- $name and value is :- $value")
    }
    println(" ")

    // Removing an entry
    sit.remove("banana")
    // Other way to remove by key 
    sit.keys.remove("apple")
    // Removing an entry by value 
    sit.values.remove(2)

    for ((name, value) in sit) {
        println("key is :- $name and value is :- $value")
    }
    println(" ")

    // Checking if a key exists in the map
    val cheack = "grapes" in sit // false
    println("Cheack grape key is exixts or not :- $cheack")
    println(" ")

    /*
    2. Retrieval and Lookup:

            >>> Maps are designed for efficient value retrieval based on keys. This
                means you can quickly access a value associated with a specific key
                without iterating through the entire map.
            >>> To retrieve a value from a map, you simply use the key as an index,
               like this: map[key].
    */

    /*
    3. Immutability vs. Mutability:

        * Immutable Maps:

            >>> Immutable maps, as the name suggests, cannot be modified after they
                are created. Once you've defined the key-value pairs in an immutable
                map, you cannot change them.
            >>> In Kotlin, the primary interface for immutable maps is Map. You can
                create an immutable map using one of its implementations, such as
                mapOf, linkedMapOf, or sortedMapOf

    */

    val sit1 = mapOf<String, Int>( // Yha datatype specific hai
        "Alice" to 25, 
        "Bob" to 30, 
        "Charlie" to 28
        )

    // You cannot modify the immutableMap after creation
    // immutableMap["Bob"] = 31 // This will result in a compilation error

    println(sit1["Charlie"]) // Accessing a value

    /*
        * Mutable Maps:
            >>> Mutable maps are maps that can be modified after their creation. You
                can add, update, or remove key-value pairs in a mutable map.
            >>> In Kotlin, the primary interface for mutable maps is MutableMap.
                You can create a mutable map using one of its implementations,
                such as HashMap, LinkedHashMap, or TreeMap.

            >>> mutableMapOf(): mutableMapOf() is a factory function in Kotlin for
                               creating mutable maps.
    */

    // Example :-
    val sit2 = mutableMapOf("apple" to 3, "banana" to 5, "cherry" to 2)
    for ((name, value) in sit2) {
        println("map sit2 key is :- $name and value is :- $value")
    }
    println(" ")

    /*
        >>> HashMap: A commonly used implementation of a mutable map with fast
                     lookup times. It does not guarantee any specific order of
                     key-value pairs
    */
    // Example :-
    val sit3 = HashMap<String, Int>()
    sit3["Alice"] = 25
    sit3["Bob"] = 30
    sit3["Charlie"] = 28

    for ((name, value) in sit3) {
        println("map sit3 key is :- $name and value is :- $value")
    }
    println(" ")

    /*
        >>> LinkedHashMap: A commonly used implementation of a mutable map with
                           fast lookup times. It does not guarantee any specific
                           order of key-value pair

    */

    // Example :-
    val sit4 = LinkedHashMap<String, Int>()
    sit4["Alice"] = 25
    sit4["Bob"] = 30
    sit4["Charlie"] = 28

    for ((name, value) in sit4) {
        println("map sit4 key is :- $name and value is :- $value")
    }
    println(" ")
    
    /*
    >>> TreeMap: A mutable map that sorts key-value pairs based on the natural
    order of keys or a provided comparator.
    
    */

    // Example :-
    val sit5 = TreeMap<Int,String>() // Import import java.util.*
    sit5[5] = "Alice"
    sit5[1] = "Bob"
    sit5[7] = "Charlie"
    sit5[6] = "apple"
    sit5[19]= "banana"
    sit5[9]= "cherry"
    
    for ((name, value) in sit5) {
        println("map sit5 key is :- $name and value is :- $value")
    }
    println(" ")



    /*

    4. Iterating Through a Map:
            >>> Using a for loop with destructuring: This approach allows
                us to extract both the key (student name) and value (age) 
                in each iteration.

            >>> Using the forEach function: This higher-order function is 
                applied to the map and takes a lambda expression that 
                destructures each entry into a name and age, allowing 
                us to print the information.

            >>> Iterating through keys and values separately: We also show 
            how to iterate through the keys and values separately if you 
            need to perform different operations on them.

            >>> Each iteration of the map allows you to access both the keys
                and values, making it convenient for various data processing
                tasks.

    */

    // Example:-

     // Creating a map of student names and their corresponding ages
     val studentAges = mapOf(
        "Alice" to 20,
        "Bob" to 22,
        "Charlie" to 21,
        "David" to 23,
        "Eve" to 19
    )

    // Iterating through the map using a for loop
    for ((name, age) in studentAges) {
        println(" Printing studentAges :- $name is $age years old")
    }
    println()
    
    // Iterating through the map using a forEach loop
    studentAges.forEach { (name, age) ->
        println(" Printing studentAges :- $name is $age years old")
    }
    println()
    
    // Iterating through the map using keys and values separately
    println("Names:")
    for (name in studentAges.keys) {
        println(name)
    }
    println()
    
    println("Ages:")
    for (age in studentAges.values) {
        println(age)
    }
    println()



    /*
    
    5. Use Cases:

            >>> Storing Configurations: Maps are often used to 
                store configuration settings in applications. 
                Keys represent configuration parameters, and 
                values store their corresponding values.
            
            >>> Caching: Maps can be used for caching data, where 
                keys are used to identify cached items, and values 
                are the cached data.
            
            >>> Associating Data: Maps are useful for representing 
                relationships or associations between entities. For 
                example, mapping user IDs to user profiles.
    
            >>> Counting and Aggregating: Maps can be employed to count 
                occurrences of elements in a collection or aggregate data
                based on certain criteria.

            >>> Grouping and Indexing: Maps are valuable for grouping data 
                items by a specific attribute or indexing data for efficient 
                retrieval.
    
    */
    
}
