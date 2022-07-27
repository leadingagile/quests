import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyClassTest {
    @Test
    public void myMethodReturnsHelloWorld() {
        MyClass myClass = new MyClass();
        assertEquals(myClass.myMethod(),"Hello World");
    }
}
