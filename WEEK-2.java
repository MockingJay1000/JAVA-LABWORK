import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      char[] helloArray ={'h','e','l','l','o','.'};
      String helloString = new String(helloArray);
      System.out.println(helloString);
/*
  class HelloWorld {
    public static void main(String[] args) {
        String firstName ="John";
        String lastName= "Doe";
        System.out.println(firstName+" "+lastName);
    }
}


22)	CONCATENATION USING CONCAT

class HelloWorld {
    public static void main(String[] args) {
        String firstName ="John";
        String lastName= " Doe";
        System.out.println(firstName.concat(lastName));
    }
}


23)	USING BACKSLASH

class HelloWorld {
    public static void main(String[] args) {
        String txt ="We are the so called \"Vikings\" from the north.";
        System.out.println(txt);
    }
}



24)	MATH FUNCTIONS

class HelloWorld {
    public static void main(String[] args) {
        System.out.println(Math.max(5,10));
        System.out.println(Math.min(5,10));
        System.out.println(Math.abs(num));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.random());
    }
}



25)	Calculator program


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("ENTER THE OPERATION\n1.Addition\n2.Subtration\n3.Multiplication\n 4.Division \n5. Exit");

            int input = scanner.nextInt();

            if (input == 5) {
                continueProgram = false;
            } else {
                System.out.println("Enter the 1st number");
                double a = scanner.nextDouble();
                System.out.println("Enter the 2nd number");
                double b = scanner.nextDouble();

                switch (input) {
                    case 1:
                        System.out.println("Result: " + (a + b));
                        break;
                    case 2:
                        System.out.println("Result: " + (a - b));
                        break;
                    case 3:
                        System.out.println("Result: " + (a * b));
                        break;
                    case 4:
                        if (b != 0) {
                            System.out.println("Result: " + (a / b));
                        } else {
                            System.out.println("Error: Division by zero");
                        }
                        break;
                    default:
                        System.out.println("Invalid input..");
                }
            }
        }

    }
}*/
    }
}
