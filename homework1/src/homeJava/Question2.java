package homeJava;

import java.util.Scanner;

public class Question2 {
    public static void main(String [] args) {
        System.out.println("Qustion 1::: \n");
        String name = "Alia";
        String dateOfBirth = "April 4, 1994";
        String address = "2585 county Street, fremont, california, 98777";
        String email = "alia94@gmail.com";
        String degree = "law";
        String university = "Punjab University";
        int graduationYear = 2015;
        String skills = "postman,sql,java,excel,cucumber";
        String perviousJobs="5 years experience as tester";
        System.out.println("My Bio Data");
        System.out.println("My Name: "+ name);
        System.out.println("My DOB: "+ dateOfBirth);
        System.out.println("Address: "+ address);
        System.out.println("email: "+email);
        System.out.println("degree: "+degree);
        System.out.println("university: "+university);

        System.out.println("graduationYear: "+graduationYear);
        System.out.println("skills: "+skills);
        System.out.println("perviousJobs: "+perviousJobs+"\n");



        System.out.println("Qustion 2\n");
        System.out.println(" +\"\"\"\"\"+");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '_' |");
        System.out.println(" +-----+\n");

        System.out.println("Qustion 3");
        System.out.println("*     *   *     *");
        System.out.println("*    *    *    *");
        System.out.println("*   *     *   *");
        System.out.println("*  *      *  *");
        System.out.println("* *       * *");
        System.out.println("*  *      *  *");
        System.out.println("*    *    *    *");
        System.out.println("*     *   *      *");
        System.out.println("*      *  *        *\n");

        System.out.println("Question 4");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
        System.out.println("******\n");

        System.out.println("Question 5");
        System.out.println("     *   ");
        System.out.println("    * *  ");
        System.out.println("   * * *  ");
        System.out.println("  * * * *");
        System.out.println(" * * * * *");
        System.out.println("* * * * * *\n");


        System.out.println("Question 6");
        System.out.println("* * * * * * ====================================");
        System.out.println(" * * * * *  ====================================");
        System.out.println("* * * * * * ====================================");
        System.out.println(" * * * * *  ====================================");
        System.out.println("* * * * * * ====================================");
        System.out.println(" * * * * *  ====================================");
        System.out.println("* * * * * * ====================================");
        System.out.println(" * * * * *  ====================================");
        System.out.println("* * * * * * ====================================");
        System.out.println("================================================");
        System.out.println("================================================");
        System.out.println("================================================");
        System.out.println("================================================\n");


        System.out.println("Question 7");
       int a = 74;
        System.out.println(a);
        int b = 36;
        System.out.println(a+b);


        System.out.println("Question 8");
        int i = 50;
        System.out.println(50);
        int c = 3;
        System.out.println(50/3);


        System.out.println("Question 9");
        int e = -5;
        System.out.println(-5);
        int f = 8*6;
        System.out.println(-5+8*6);

        int d = (55+9)%9;
        System.out.println((55+9)%9);

        int h = 20;
        System.out.println(20);
        int j = -3*5/8;
        System.out.println(20+-3*5/8);

        int v = 5;
        System.out.println(5);
        int u = 15/3*2;
        System.out.println(5+15/3*2);
        int y = -8%3;
        System.out.println(5+15/3*2-8%3);



        System.out.println("Question 10");
        int k = 25;
        System.out.println(25);
        int s = 5;
        System.out.println(25*5);

        Scanner scannerOBj = new Scanner(System.in);
        multiply(scannerOBj);
        multiplyToANumber(scannerOBj);
        scannerOBj.close();
        System.out.println("Question 12");
        System.out.println("J a v v a");
        System.out.println("J a a v v a a");
        System.out.println("J J aaaaa V V aaaaa");
        System.out.println("JJ a a V a a\n");


        System.out.println("Question 13");
        System.out.println("Java Version: "+ System.getProperty("java.version"));
        System.out.println("java Runtime Version: "+ System.getProperty("java.runtime.version"));
        System.out.println("java Home: "+ System.getProperty("java.home"));
        System.out.println("java Vendor: "+ System.getProperty("java.vendor"));
        System.out.println("java Vendor URL: "+ System.getProperty("java.vendor.url"));
        System.out.println("java class Path: "+ System.getProperty("java.class.path"));


        System.out.println("Question 14");

        int z = 25;
        int x = 39;
        if(z != x){
            System.out.println(z+" != "+x);
        }
        if(z < x){
            System.out.println(z+"<"+x);
        }
        if(z <= x){
            System.out.println(z+"<="+x);
        }

        System.out.println("Question 15");
        String store = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        System.out.println(store);


        System.out.println("Question 16");
        double testData=((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(testData);


        System.out.println("Question 17");
        System.out.println("Twinkle, twinkle, little star,");
        System.out.println("How I wonder what you are!");
        System.out.println("Up above the world so high,");
        System.out.println("Like a diamond in the sky.");
        System.out.println("Twinkle, twinkle, little star,");
        System.out.println("How I wonder what you are!");

        System.out.println("Question 18");
        String student = "Sammy";
        int rollNumber = 25;
        String grade = "Grade 8";

        int test1=90;
        int test2=76;
        int test3=88;
        int test4=96;
        int test5= 86;
        int totalScore= test1+test2+test3+test4+test5;
        double percentScore = (double) totalScore/500 * 100;
        System.out.println("Student Name: "+ student+" ID: "+rollNumber+" Grade: "+grade);
        if(percentScore > 100){
            System.out.println("you cheated this is not possible");
        }
        if(percentScore >=90 && percentScore < 100){
            System.out.println("You got A in the class test percentage avgerage: "+percentScore);
        }
        if(percentScore >=80 && percentScore < 90){
            System.out.println("You got B in the class test percentage avgerage: "+percentScore);
        }
        if(percentScore >=70 && percentScore < 80){
            System.out.println("You got c in the class test percentage avgerage: "+percentScore);
        }
        if(percentScore < 70){

            System.out.println("You failed the class: "+percentScore);
        }

        System.out.println("Question 19");
        int integerNumber = 44;
        double doubleNumber = 545.45;
        char character = 't';

        System.out.println("Integer: " + integerNumber);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Character: " + character);


        System.out.println("Question 20");
        double addTwo=5+6.2;
        System.out.println("Number: " + addTwo);

    }

    private static void multiplyToANumber(Scanner scannerOBj) {
        System.out.println("Question11");
        System.out.println("Choose a number to multiply by and upto 10: ");
        int number1 = scannerOBj.nextInt();
        for (int n = 1; n <= 10; n++){
            System.out.println(n*number1);
        }
    }

    private static void multiply(Scanner scannerOBj) {
        System.out.println("Enter number 1 : ");
        int number1 = scannerOBj.nextInt();
        System.out.println("Enter number 2 : ");
        int inputNum2 = scannerOBj.nextInt();
        System.out.println(number1*inputNum2);

    }


}

