interface First {
    void method1();
    void method2();
}
interface Second {
    void method3();
    void method4();
}
interface Third {
    void method5();
    void method6();
}
interface Combined extends First, Second, Third {
    void method7();
}
class ConcreteClass {
    void baseMethod() {
        System.out.println("Base class method");
    }
}
class ImplementingClass extends ConcreteClass implements Combined {
    public void method1() {
        System.out.println("Method1");
    }
    public void method2() {
        System.out.println("Method2");
    }
    public void method3() {
        System.out.println("Method3");
    }
    public void method4() {
        System.out.println("Method4");
    }
    public void method5() {
        System.out.println("Method5");
    }
    public void method6() {
        System.out.println("Method6");
    }
    public void method7() {
        System.out.println("Method7");
    }
}
public class Q18_TestInterfaces {
    static void useFirst(First obj) {
        obj.method1();
        obj.method2();
    }
    static void useSecond(Second obj) {
        obj.method3();
        obj.method4();
    }
    static void useThird(Third obj) {
        obj.method5();
        obj.method6();
    }
    static void useCombined(Combined obj) {
        obj.method7();
    }
    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        useFirst(obj);
        useSecond(obj);
        useThird(obj);
        useCombined(obj);
    }
}
