package polymorphishm;

class Parent {
    public void cry() {
        System.out.println("Parent is crying");
    }

    Parent rule2(){
        return new Parent();
    }
}

//compatible
//covarient return type
