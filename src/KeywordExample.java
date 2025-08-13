class StaticExample {
    //Static var
    static int staticVariable = 10;

    //Static method
    static void staticMethod() {
        System.out.println("Inside static Method: staticVariable = " +staticVariable);
    }
}

//AbstractExample abstract class with an abstract method
abstract class AbstractExample {
    abstract void abstractMethod();
}

//Concrete subclass of AbstractExample
class ConcreteExample extends AbstractExample {
    void abstractMethod() {
        System.out.println("Inside abstractMethod in ConcreteExample");
    }
}

class FinalExample {
    final int finalVariable = 10;

    final void finalMethod() {
        System.out.println("Inside finalMethod: finalVariable = " +finalVariable);
    }
}

public class KeywordExample {
    public static void main(String... args) {
        System.out.println("Static variable: " + StaticExample.staticVariable);
        StaticExample.staticMethod();

        //Creating an instance of ConcreteExample and calling abstractMethod
        ConcreteExample concrete = new ConcreteExample();
        concrete.abstractMethod();

        //Creating an instance of FinalExample and accessing final variable and method
        FinalExample finalexample = new FinalExample();
        System.out.println("Final Variable: " +finalexample.finalVariable);
        finalexample.finalMethod();
    }
}
