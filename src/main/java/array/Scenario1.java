package array;

/*
*
* store 4 students with their marks
*
*
* */



/*
*
* a[20] = 30;
*
* array memory location  + 20 * 4
*
* a
*
* */
import variable.Variable;


import java.util.Scanner;


class Demo1{
    public static void main(String... args) {
        //int marks[] = new int[4];
        int[] marks = new int[4];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks for first student");
        marks[0] = scan.nextInt();
        System.out.println("Enter the marks for second student");
        marks[1] = scan.nextInt();
        System.out.println("Enter the marks for third student");
        marks[2] = scan.nextInt();
        System.out.println("Enter the marks for forth student");
        marks[3] = scan.nextInt();

        System.out.println("Marks are :");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
    }
}

public class Scenario1 {
    public static void main(String[] args) {

        int marks[] = new int[4];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks for first student");
        marks[0] = scan.nextInt();
        System.out.println("Enter the marks for second student");
        marks[1] = scan.nextInt();
        System.out.println("Enter the marks for third student");
        marks[2] = scan.nextInt();
        System.out.println("Enter the marks for forth student");
        marks[3] = scan.nextInt();

        System.out.println("Marks are:  ");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);


    }
}


/*
*
* input using for loop
*
* */

/*
*
* for(initlization;conditioinal;incremental){
*
* }
*
* post incremental, pre incremental
*
* i++;
*
* i = i +1;
*
* */


//import java.util.Scanner;
class InputThroughForLoop{
    public static void main(String[] args) {
        int[] a = new int[4];
        System.out.println("Length of array " + a.length);
        Scanner scanner = new Scanner(System.in);
        for(int i =0; i< a.length; i++){
            System.out.println("Enter the marks ");
            a[i] = scanner.nextInt();
        }
        System.out.println("Marks are: ");
        for(int i =0; i< a.length; i++){
            System.out.println(a[i]);
        }
    }
}

/*
*
* class through while loop
*
*
* while(condition){
*
*  }
*
* */

class InputThroughWhileLoop{
    public static void main(String[] args) {
        int[] a = new int[4];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(i<a.length){
            System.out.println("Enter the marks ");
            a[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Marks are: ");
        i=0;
        while (i<a.length){
            System.out.println(a[i]);
            i = i +1;
        }
    }
}


/*
*
* InputThroughDoWhiel
*
* pre / post paid
*
* post conditional loop
* do{
*    //work that has to done
*  }while(condition);
*
* */

class InputThroughDoWHile{
    public static void main(String[] args) {
        int[] a = new int[4];
        Scanner scanner = new Scanner(System.in);
        int i =0;
        do{
            System.out.println("Enter the marks ");
            a[i] = scanner.nextInt();
            i++;
        }while(i <= a.length-1);

        System.out.println("Marks are: ");
        i=0;
        do{
            System.out.println(a[i]);
            i++;
        }while(i<a.length);
    }
}

/*
* array properties
*
* */

class Length {
    int a,b,c,d;
    int number[]= new int[4];

    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("Length of a (Single Dimension) "+ a.length);

        //class0, class1, class2 ==> array of integer

        int newClass[][][] = new int[2][3][4];
        System.out.println("Number of school == "+ newClass.length);
        System.out.println("Number of classes in a First school  "+ newClass[0].length);
        System.out.println("Number of classes in a Second school  "+ newClass[1].length);



        System.out.println("Number of students of a First School,  First class " + newClass[0][0].length);
        System.out.println("Number of students of a First School,  Second class " + newClass[0][1].length);
        System.out.println("Number of students of a First School,  Third class " + newClass[0][2].length);

        System.out.println("Number of students of a Second School,  First class " + newClass[1][0].length);
        System.out.println("Number of students of a Second School,  Second class " + newClass[1][1].length);
        System.out.println("Number of students of a Second School,  Third class " + newClass[1][2].length);

        Scanner scanner = new Scanner(System.in);
        //newClass[][][]

        //newClass[4] --> 1 loop -->one school ma  one class containing 4 students
        //newClass[3][4] --> 2 loop  --> one school three class each class containing 4 students
        //newClass[2][3][4] --> 3 loop  --> two school each school has 3 classes and each classes has 4 students

        for(int i =0; i< newClass.length;i++){ // school
            for(int j = 0; j< newClass[i].length;j++){ // class
                for(int k = 0;k<newClass[i][j].length;k++){ //student
                    System.out.println("Enter the marks of "+ i + " school " + j + " class of" + k +" student" );
                    newClass[i][j][k] = scanner.nextInt();
                }
            }
        }

        for(int i =0; i< newClass.length;i++){ // school
            for(int j = 0; j< newClass[i].length;j++){ // class
                for(int k = 0;k<newClass[i][j].length;k++){ //student
                    System.out.println("Enter the marks of "+ i + " school " + j + " class" + k +" student  = "+ newClass[i][j][k] );

                }
            }
        }
        /*
        *
        *  [75,30,49,39]
        *  [33,3,33,33]
        *  [33,3,33,33]
        *
        * */

        int matrix[][] = new int[3][4];
        for(int i =0; i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length;j++){

                matrix[i][j] = 10;
                //[]
            }
        }






        int abc[][][] = new int[3][5][6];
        System.out.println(abc.length);
        System.out.println(abc[0].length);
        System.out.println(abc[0][0].length);



       int class0Marks[] = new int[4];
       int class1Marks[] = new int[4];
       int class2Marks[] = new int[4];
        //Scanner scanner = new Scanner(System.in);
        /*for(int i =0; i< class0Marks.length; i++){
            System.out.println("Enter the marks ");
            class0Marks[i] = scanner.nextInt();
        }
        for(int i =0; i< class1Marks.length; i++){
            System.out.println("Enter the marks ");
            class1Marks[i] = scanner.nextInt();
        }

        for(int i =0; i< class2Marks.length; i++){
            System.out.println("Enter the marks ");
            class2Marks[i] = scanner.nextInt();
        }*/

        System.out.println("Multi dimenstional array");

        int classMarks[][] = new int[3][4];

        for(int i =0;i<classMarks.length;i++){
            for(int j=0;j<classMarks[i].length;j++){
                 System.out.println("Enter the marks of "+ i + "class " + j + " student ");
                 classMarks[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Marks of student are");
        for(int i=0;i<classMarks.length;i++){
            for(int j=0;j<classMarks[i].length;j++){
                System.out.println("Class "+ i +"'s student "+ j + " marks is " + classMarks[i][j]);
            }
        }

    }


    /*
    *| [] [] [] [] []
    *| [] [] [] [] []
    *| [] [] [] [] []
    *| [] [] [] [] []
    *| [] [] [] [] []

    *
     */
}


