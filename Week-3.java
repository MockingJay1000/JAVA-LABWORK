//String Buffers

public class Main{
public static void main(String args[]){

StringBuffer sb = new StringBuffer("Hello");
sb.append(" Java");
System.out.println(sb);
}
}

/*
2)Insert( )

public class Main{
public static void main(String args[]){

StringBuffer sb = new StringBuffer("Hello ");
sb.insert(1,"Java");
System.out.println(sb);
}
}


3) Replace( )

public class Main{
public static void main(String args[]){

StringBuffer sb = new StringBuffer("Hello ");
sb.replace(1,3,"Java");
System.out.println(sb);
}
}


4) Delete( )

import java.util.Scanner;

public class Main{
public static void main(String args[]){

StringBuffer sb = new StringBuffer("Hello ");
sb.delete(1,3,"Java");
System.out.println(sb);
}
}


5) Reverse( )

public class Main{
public static void main(String args[]){

StringBuffer sb = new StringBuffer("Hello ");
sb.reverse();
System.out.println(sb);
}
}



6) Capacity( )
public class Main{
public static void main(String args[]){

StringBuffer sb = new StringBuffer();
sb.append("JAVA ");
System.out.println(sb.capacity());
sb.append(" Java is one of the best programming languages");
System.out.println(sb.capacity());
}
}


7) ensure Capacity( )

public class Main{
public static void main(String args[]){

StringBuffer sb = new StringBuffer(); //default 16
sb.append("JAVA ");
System.out.println(sb.capacity());// now 16
sb.append(" Java is one of the best programming languages");
System.out.println(sb.capacity()); // now 51
sb.ensureCapacity(10);
System.out.println(sb.capacity());//51, no change
sb.ensureCapacity(60);
System.out.println(sb.capacity());//(51*2)+2 = 104
}
}


STRING TOKENIZERS

1)

import java.util.StringTokenizer;

public class Main{
public static void main(String args[]){

StringTokenizer st = new StringTokenizer("My name is Jay","");

while(st.hasMoreTokens()){
System.out.println(st.nextToken());
}
}
}


2)

import java.util.StringTokenizer;

public class Main{
public static void main(String args[]){

StringTokenizer st = new StringTokenizer("My,name,is,Jay",",");

System.out.println("Next Token is : "+st.nextToken(","));
}
}


3)

import java.util.StringTokenizer;
public class Main{
public static void main(String args[]){

StringTokenizer st = new StringTokenizer("Demonstrating methods from String tokenizer class"," ");

while(st.hasMoreTokens()){
System.out.println(st.nextToken());
}
}
}


4)Using hasMoreElements()

import java.util.StringTokenizer;

public class Main{
public static void main(String args[]){

StringTokenizer st = new StringTokenizer("Demonstrating methods from String tokenizer class"," ");

while(st.hasMoreElements()){
System.out.println(st.nextToken());
}
}
}


5)

import java.util.StringTokenizer;

public class Main{
public static void main(String args[]){

StringTokenizer st = new StringTokenizer("Welcome to Java Programming"," ");

System.out.println("Total number of tokens are :"+st.countTokens());
}
}


ARRAYS

1) Printing elements of an array

public class Main{
public static void main(String args[]){

int[] arr = new int[5];
arr[0]=10;
arr[1]=20;
arr[2]=30;
arr[3]=40;
arr[4]=50;

for(int i=0;i<5;i++){
System.out.println("Number in index "+i+" of array is: "+arr[i]);
}

}
}


2) Using constructor

class Student{
public int roll_no;
public String name;
Student(int roll_no,String name){
this.roll_no= roll_no;
this.name =name;
}
}

public class Main{
public static void main(String args[]){

Student[] arr = new Student[3];
arr[0] = new Student(1,"Akshay");
arr[2] = new Student(3,"Aman");
arr[1] = new Student(2,"Hari");

for (int i =0;i<3;i++){
System.out.println("Element at index "+i+" of array is: "+arr[i].roll_no +","+arr[i].name);
}
}
}
*/
