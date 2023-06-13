package abstractt;

import javax.swing.*;

public interface MyClass {
    public abstract void needLaptop();
    void doAllThings();
}
interface JavaClass{
    void understandingJDK();
}

class Launcheer{
    public static void main(String[] args) {
        MyClass myClass = new Launcheer.Ebhoool();
        myClass.needLaptop();
        ((JavaClass)myClass).understandingJDK();
    }
    static class Ebhoool implements MyClass, JavaClass{
        @Override
        public void needLaptop() {

        }

        @Override
        public void doAllThings() {

        }

        @Override
        public void understandingJDK() {

        }
    }
}
