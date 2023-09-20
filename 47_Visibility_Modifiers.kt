/*

>>>   Visibility Modifiers   <<<

In Kotlin, visibility modifiers are used to control the visibility
or accessibility of classes, functions, properties, and other 
elements within your code. Kotlin provides four visibility 
modifiers:

1) public: This is the default visibility modifier if no other 
           modifier is specified. It means that the element is 
           visible everywhere in your code, both inside and 
           outside the defining module or package.

2) internal: An internal element is visible within the same module. 
             A module in Kotlin is a set of Kotlin files compiled 
             together. This visibility modifier allows you to hide 
             the implementation details of your module while making 
             them accessible to other code within the same module.

3) protected: This modifier is used with classes and their members 
             (functions and properties). A protected element is visible 
             within the defining class and its subclasses. Unlike some 
             other languages, in Kotlin, you cannot access protected members 
             from outside the subclass.

4) private: The private modifier restricts visibility to the enclosing 
            class or function. It means the element is only visible 
            within the scope it is defined in and cannot be accessed 
            from outside that scope.
*/


