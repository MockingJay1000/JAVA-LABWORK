import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      boolean isJavaFun = true;
      boolean isFoodTasty = false;
      System.out.println(isJavaFun);
      System.out.println(isFoodTasty);
/*
public class Main{
public static void main(String[] args){
int x =10;
int y =9;
System.out.println(x>y);
}}

public class Main{
public static void main(String[] args){
System.out.println(10==15);
}}


3)	If statements

public class Main{
public static void main(String[] args){
if (20>18){System.out.println("20 is greater than 18");}
}}

public class Main{
public static void main(String[] args){
int time=20;
if (time<18){System.out.println("Good day");}
else{System.out.println("Good Evening.");}
}}

public class Main{
public static void main(String[] args){
int time=22;
if (time<10){System.out.println("Good morning");}
else if(time<20){System.out.println("Good Day.");}
else{System.out.println("Good evening");}
}}


4)	SWITCH CASE

public class Main{
public static void main(String[] args){
int day =4;
switch(day){

case 1:
System.out.println("Monday");
break;

case 2:
System.out.println("Tuesday");
break;

case 3:
System.out.println("Wednesday");
break;

case 4:
System.out.println("Thursday");
break;

case 5:
System.out.println("Friday");
break;

case 6:
System.out.println("Saturday");
break;

case 7:
System.out.println("Sunday");
break;

default:
System.out.println("Invalid");
break;


}
}}

5)	While loop

public class Main{
public static void main(String[] args){

int i =0;
while(i<5){
System.out.println(i);
i++;
}
}}

6)	Do While Loop

public class Main{
public static void main(String[] args){

int i =0;
do{
System.out.println(i);
i++;
}
while(i<5);

}}


7)	FOR LOOPS

public class Main{
public static void main(String[] args){
for (int i=0;i<5;i++){
System.out.println(i);}

}}

8)	FOR EACH LOOP

public class Main{
public static void main(String[] args){
String[] cars ={"Volvo","BMW","Ford","Mazda"};
for(String i :cars){
System.out.println(i);}

}}


9)	CONTINUE STATEMENT

public class Main{
public static void main(String[] args){
for (int i =0;i<10;i++){

{if (i==4){continue;}}

System.out.println(i);

}
}}

10)	SCANNER OBJECT

import java.util.Scanner;

public class Main{
public static void main(String[] args){

Scanner myObj = new Scanner(System.in);

String userName;
System.out.println("Enter username");
userName= myObj.nextLine();
System.out.println("Username is "+ userName);

}}

11)	Automatic type casting

public class Main
{
public static void main(String[] args)
{
final int myInt=14;
double myDouble=myInt;//Automatic casting of int to double
System.out.print("myInt: "+myInt+"\n");
System.out.print("myDouble: "+myDouble+"\n");
}
}

12)	Explicit Type Casting

public class Main{
public static void main(String[] args){
double mydouble=7.89d;
int num=(int)mydouble;
System.out.println(mydouble);
System.out.println(" "+num);
}
}

13)	Final Keyword

public class Main
{
public static void main(String[] args)
{
final int myInt=128;
System.out.print("myInt: "+myInt+"\n");
}
}

14)	Addition

public class Main{
public static void main(String[] args){
int sum1=3;
int sum2=sum1+5;
System.out.println(sum2);
}
}

15)	Addition with operator

public class Main{
public static void main(String[] args){
String s1="One ";
String s2="two";
String s3=s1+s2;
System.out.println(s3);
}
}

16)	Ternary Operator

public class Main{
public static void main(String[] args){
int x,y;
x=20;
y=(x==1)?61:90;
System.out.println(y+"  ");
y=(x==20)?61:90;
System.out.println(y);
}
}

17)	Length of String

public class Main{
public static void main(String[] args){
String txt="Hello";
System.out.println("length of the string is: "+txt.length());
}
}

18)	Upper and lowercase

public class Main{
public static void main(String[] args){
String txt="Hello";
System.out.println(txt.toUpperCase());
System.out.println(txt.toLowerCase());
}
}

19)	INDEXOF

public class Main{
public static void main(String[] args){
String txt="Hello World!";
System.out.println(txt.indexOf("World"));
}
}

*/
    }
}
