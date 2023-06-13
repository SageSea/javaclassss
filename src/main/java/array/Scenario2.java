package array;

import jdk.jfr.Category;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Scenario2 {
    public static void main(String[] args) {
        /*index*/
        int i,j;
        /*statically nested array's size define */
        int arrayClass[][] = new int[3][4];


        //newClass[4] --> 1 loop -->one school ma  one class containing 4 students
        //newClass[3][4] --> 2 loop  --> one school three class each class containing 4 students
        //newClass[2][3][4] --> 3 loop  --> two school each school has 3 classes and each classes has 4 students


        Scanner scanner = new Scanner(System.in);
        for( i =0; i<arrayClass.length;i++){ //class 0,1,2
            for(j=0;j<arrayClass[i].length;j++){ // student arrayClass[0].length a 0,1,2,3
                System.out.println("Enter the marks of "+ i + " class of " + j + " student");
                //arrayClass[0][0] = value
                arrayClass[i][j] = scanner.nextInt();
                /*first 0 ==> class and second 0 => Oth class 0th student marks*/

            }
        }
        System.out.println("Marks are: ");

        for( i =0; i<arrayClass.length;i++){
            for(j=0;j<arrayClass[i].length;j++){
                System.out.print("Marks of "+ i + " class of " + j + " student === ");
                System.out.println(arrayClass[i][j]);
            }
        }
    }
}
/*
*
* real life all the classes cannot have same number of students
*
*
* for this purpose, jagged array --- > real life use array
*
*
*
* class 0 -> 4
* class 1 -> 12
* class 2 -> 7
* */



class JaggedArrayScenario2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //int classMarks[][] = new int[3][4];
        int classMarks[][][] = new int[2][][];  //NegativeArraySizeException

       // classMarks[2][1][3] = 12;  //ArrayIndexOutOfBoundsException




        for(int i =0; i< classMarks.length;i++){
            System.out.println("Enter the number of classes in school " + i);
            int x = scanner.nextInt();
            classMarks[i] = new int[x][];
        }

        for(int i =0; i< classMarks.length;i++){
            for(int j = 0; j<classMarks[i].length ; j++) {
                System.out.println("Enter the number of student in school " + i + " of class " + j);
                int x = scanner.nextInt();
                classMarks[i][j] = new int[x];
            }
        }
        /*
        * inner array initilize
        *
        * */
        //class
//        classMarks[0] = new int[2][]; // in first school we have 2 classes
//        classMarks[1] = new int[3][]; // in second school we have 3 classes

        //number of students in first school
//        classMarks[0][0] = new int[4]; //first class
//        classMarks[0][1] = new int[5]; //second class
//
//
//        //number of students in second school
//        classMarks[1][0] = new int[4];  //first class
//        classMarks[1][1] = new int[5];
//        classMarks[1][2] = new int[6];







        for(int i =0;i<classMarks.length;i++){  /*iterate class */
            for(int j=0;j<classMarks[i].length;j++){  /* iterate student*/
                for(int k = 0; k<classMarks[i][j].length;k++) {
                    System.out.println("Enter the marks of " + i + "school " + j + " class " + k + " student ");
                    classMarks[i][j][k] = scanner.nextInt();
                }
            }
        }
        

        System.out.println("Marks of student are");
        for(int i=0;i<classMarks.length;i++){
            for(int j=0;j<classMarks[i].length;j++){
                for(int k = 0; k<classMarks[i][j].length;k++) {
                    System.out.println("Class " + i + "'s school " + j + " class " + k +" marks is " + classMarks[i][j][k]);
                }
            }
        }
    }
}

/*
* case 3 ---> 3 school --> class --> student
*
* school 0 -> 2 class
*       school 0 -> class 0 -> student-> 4  [20,30,40,50]
*       school 0 -> class 1 -> student -> 2  [80,90]
*
*
* school 1 -> 3 class
*       school 1 -> class 0 -> student -> 4 [20,40,80,100]
*       school 1 -> class 1 -> student -> 2 [60,80]
*        school 1 -> class 3 -> student -> 1 [20]
*
*
* school 2 -> 1 class
        school 2 -> class 0 -> student -> 5 [10,11,12,13,14]
*
*
* and have to store the marks of those student
*
* */


class Scenario3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int school[][][] = new int[3][][];

        school[0] = new int[2][];  school[0][0] = new int[4]; school[0][1] = new int[2];
        school[1] = new int[3][];  school[1][0] = new int[4]; school[1][1] = new int[2];school[1][2] = new int[1];
        school[2] = new int[1][];  school[2][0] = new int[5];


        for(int i =0;i<school.length;i++){  /*school*/
            for(int j=0;j<school[i].length;j++) {  /*class*/
                for (int k = 0; k < school[i][j].length; k++) { /*student*/
                    System.out.println("Enter the marks of " + i + "school " + j + " class " + k + "student ");
                    school[i][j][k] = scanner.nextInt();
                }
            }
        }

            for(int i =0;i<school.length;i++){
                for(int j=0;j<school[i].length;j++) {
                    for (int k = 0; k < school[i][j].length; k++) {
                        System.out.println("Marks of " + i + "school " + j + " class " + k + "student = " + school[i][j][k] );
                    }
                }
            }
    }
}

/*
class AdmissionModel{
   List<UserData> data;
}
class AccountCategory{
    String name;
    String type;
    String image;
}

class UserData{
    String id;
    double totalPrice;
    long lastSubminssionData;
    long issueDate;
    AccountCategory category;
    Map<String,String> userFieldData;

    public static void main(String[] args) {
        Map<String,String> userFieldData = new HashMap<>();
        userFieldData.put("distance","4200");
        userFieldData.put("stop","Maitidevi");
        System.out.println(userFieldData);
    }

    String setFirstLetterCapital(String s){
       Character c =  s.toCharArray()[0];
       c.toString().toUpperCase();
    }
}*/


/*
*
* Dynamically set the nested Array Size
*
* */
class Demo11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int classMarks[][] = new int[4][];

        for(int i =0; i< classMarks.length;i++){
            System.out.println("Enter the number of sutdents in class " + i);
            classMarks[i] = new int[scanner.nextInt()];
        }
        classMarks[3][0] = 12;

        for(int i =0;i<classMarks.length;i++){  /*iterate class */
            for(int j=0;j<classMarks[i].length;j++){  /* iterate student*/
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
}















