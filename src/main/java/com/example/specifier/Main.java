
package com.example.specifier;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}
class Stringdemo{
    public static void main(String[] args) {
        String s1= "RAM";
        String s2= "RAM";
        if (s1==s2){
            System.out.println("reference are equal");
        }
        else{
            System.out.println("reference are not equal");
        }
    }
}
class demo3{
    public static void main(String[] args) {
        String s1= new String( "RAM");
        String s2= new String("RAM");
        if (s1==s2){
            System.out.println("references are equal");
        }
        else{
            System.out.println("references are not equal");
        }
    }
}
class demo2{
public static void main(String[] args) {
        String s1= "RAM";
        String s2= "RAM";
        if (s1.equals(s2)){
        System.out.println("contents are equal");
        }
        else{
        System.out.println("contents are not equal");
        }
}
}
class demo4{
    public static void main(String[] args) {
        String s1= new String("RAM");
        String s2= new String("RAM");
        if (s1.equals(s2)){
            System.out.println("contents are equal");
        }
        else{
            System.out.println("contents are not equal");
        }
    }
}
class demo5{
    public static void main(String[] args) {
        String s1= "RAM";
        String s2= new String("RAM");
        if (s1==s2){
            System.out.println("references are equal");
        }
        else{
            System.out.println("references are not equal");
        }
    }
}
class demo6{
    public static void main(String[] args) {
        String s1= "RAM";
        String s2= new String("RAM");
        if (s1.equals(s2)){
            System.out.println("contents are equal");
        }
        else{
            System.out.println("contents are not equal");
        }
    }
}
class demo7{
    public static void main(String[] args) {
        String s1= "ram";
        String s2= new String("RAM");
        if (s1.equals(s2)){
            System.out.println("contents are equal");
        }
        else{
            System.out.println("contents are not equal");
        }
    }
}
class demo8{
    public static void main(String[] args) {
        String s1= "ram";
        String s2= new String("RAM");
        if (s1.equalsIgnoreCase(s2)){
            System.out.println("contents are equal");
        }
        else{
            System.out.println("contents are not equal");
        }
    }
}
class demo9{
    public static void main(String[] args) {
        String s1= new String("RAM");
        System.out.println(s1);
        String s2= s1.concat("SITA");
        System.out.println(s1);
        System.out.println(s2);
    }
}
class demo10{
    public static void main(String[] args) {
        String s1= "RAM"+"SITA";
        String s2= "RAM"+"SITA";
        if (s1==s2){
            System.out.println("reference are equal");
        }
        else{
            System.out.println("reference are not equal");
        }
    }
}
class demo11{
    public static void main(String[] args) {
        String s1= "RAM";
        String s2= "RAM";
        String s3= s1+s2;
        String s4= s1+s2;
        if (s3==s4){
            System.out.println("reference are equal");
        }
        else{
            System.out.println("reference are not equal");
        }
    }
}
class demo12{
    public static void main(String[] args) {
        String s1= "RAM";
        String s2= "RAM";
        String s3= s1+s2;
        String s4= s1+s2;
        if (s3.equals(s4)){
            System.out.println("content are equal");
        }
        else{
            System.out.println("content are not equal");
        }
    }
}
class demo13{
    public static void main(String[] args) {
        String s1= "RAM";
        String s2= s1;
        if (s1==s2){
            System.out.println("reference are equal");
        }
        else{
            System.out.println("reference are not equal");
        }
    }
}
class demo14{
    public static void main(String[] args) {
        String s1= "RAM";
        String s2= "RITA";
        int number= s1.compareTo(s2);
        System.out.println("Ram compare to Rita"+number);
        if (number<0){
            System.out.println("s1 is smaller");
        }else if (number>0){
            System.out.println("s1 is greater");
        }
        else{
            System.out.println("s1=s2");
        }
        String a="A";
        String b="E";
        System.out.println("A compare to E:"+b.compareTo(a));
    }
}
class demo15{
    public static void main(String[] args) {
        String a = "ram";
        System.out.println(a);
        char[] array = a.toCharArray();
        System.out.println(array[2]);//displays specified character of string
    }
}
class demo17{
    public static void main(String[] args) {
        String s= "MadanKrishnaShrestha";
        System.out.println("to upper case =>"+s.toUpperCase());
        System.out.println("to lower case =>"+s.toLowerCase());
        System.out.println("Contains Krishna "+s.contains("Krishna"));
        System.out.println("Contains Kishna "+s.contains("Kishna"));
        System.out.println("Index of K "+s.indexOf("K"));
        System.out.println("First five characters exclude "+s.substring(5));
        System.out.println("From 5th index to 11th character "+s.substring(5,12));
    }
}
class demo18{
    public static void main(String[] args) {
        StringBuffer s= new StringBuffer("Madan");
        System.out.println(s);
        s.append("Krishna");
        System.out.println(s);
        System.out.println("----------------------");
        String s1= "Madan";
        System.out.println(s1);
        s1=s1+"Krishna";
        System.out.println(s1);
    }
}
class demo19{
    public static void main(String[] args) {
        StringBuilder s= new StringBuilder("Madan");
        System.out.println(s);
        s.append("Krishna");
        String s1= s.toString();
        System.out.println(s1);
    }
}
class demo20{
    public static void main(String[] args) {
        StringBuilder s= new StringBuilder();
        System.out.println("Capacity of strinfbuffer "+s.capacity());
        s.append("MadanKrishna");
        System.out.println(s);
        System.out.println("Capacity of StringBUffer"+s.capacity());
        s.append("Shrestha");
        System.out.println(s);
        System.out.println("Capacity of StringBuffer"+s.capacity());
        s.append(" is a Nepali actor");
        System.out.println(s);
        System.out.println("Capacity of stringbuffer"+s.capacity());
    }
}

class demo23{
    public static void main(String[] args) {
        String s= "Madan";
        char a[]= s.toCharArray();
        System.out.println(a[2]);
        System.out.println(a[6]);
    }
}
class demo25{
    public static void main(String[] args) {
        String s= "Suraj Gautam";
        char characterArray[]= s.toCharArray();
        String splitedArray[]= s.split("");
        String s1= "a b";
        s1.toCharArray();
        String spliteds1[]= s1.split("");
        splitedArray[0].toCharArray();
        for(int i=0;i<splitedArray.length;i++){
            System.out.println(splitedArray[i]);
        }
    }
}

