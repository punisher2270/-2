class BaseClass {
    void baseMethod() {
        System.out.println("Метод базового класса");
    }
}

class DerivedClass extends BaseClass {
    void derivedMethod() {
        System.out.println("Метод производного класса");
    }
}

public class Demo {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();

        obj.baseMethod();     // метод базового класса
        obj.derivedMethod();   // метод производного класса
    }
}
