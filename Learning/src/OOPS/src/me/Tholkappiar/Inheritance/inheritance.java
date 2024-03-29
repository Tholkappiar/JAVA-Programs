package OOPS.src.me.Tholkappiar.Inheritance;/*
Using inheritance, one class can acquire the properties of others. Consider the following Animal class:

class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}
This class has only one method, walk. Next, we want to create a Bird class that also has a fly method.
We do this using extends keyword:

class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }
}
Finally, we can create a Bird object that can both fly and walk.

public class Solution{
   public static void occurences(String[] args){

      Bird bird = new Bird();
      bird.walk();
      bird.fly();
   }
}
The above code will out:

I am walking
I am flying
This means that a Bird object has all the properties that an Animal object has, as well as some additional 
unique properties.

The code above is provided for you in your editor. You must add a sing method to the Bird class,
then modify the occurences method accordingly so that the code prints the following lines:

I am walking
I am flying
I am singing
*/

public class inheritance {

    public static void main(String[] args) {
    bird b=new bird();
    b.walk();
    b.fly();
    b.sing();
    }
}
class sing
{
    void sing()
    {
        System.out.println("I am singing");
    }
}
class animal extends sing
{
    void walk()
    {
        System.out.println("I am walking");
    }
}
class bird extends animal
{
    void fly()
    {
        System.out.println("I am flying");
    }   
}