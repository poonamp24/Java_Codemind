import java.util.*;
class Operators
{
public static void main(String args[])
{
int a , b;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the First Number:");
a = sc.nextInt();

System.out.println("Enter the Second Number:");
b = sc.nextInt();

System.out.println("*********************Arithmetic Operators*****************************");

System.out.println("Addition of a and b = " +(a+b));
System.out.println("Subtraction of a and b = " +(a-b));
System.out.println("Multiplication of a and b = " +(a*b));
System.out.println("Devision of a and b = " +(a/b));
System.out.println("Modula of a and b = " +(a%b));


System.out.println("*********************Relational Operators*****************************");

System.out.println("a > b : " +(a>b));
System.out.println("a < b : " +(a<b));
System.out.println("a >= b : " +(a>=b));
System.out.println("a <= b : " +(a<=b));
System.out.println("a == b : " +(a==b));
System.out.println("a != b : " +(a!=b));

System.out.println("*********************Assignment Operators*****************************");

int p = 20;

System.out.println("Value of p = " +p);

p+= 5;
System.out.println("p+=5 : " +p);
p-= 2;
System.out.println("p-=2 : " +p);
p*= 3;
System.out.println("p*=3 : " +p);
p/= 2;
System.out.println("p/=2 : " +p);
p%= 4;
System.out.println("p%=4 : " +p);

System.out.println("*********************Ternary Operators*****************************");

int max = (a>b) ? a : b ;
System.out.println("Max value is = " +max); 

System.out.println("*********************Increment and Decrement Operators*****************************");

p=9;
System.out.println("Before Increment Value of p = " +p);
p++;
System.out.println("After Increment value of p (p++) = " +p); 

System.out.println("Before Decrement Value of p = " +p);
p--;
System.out.println("After Decrement value of p(p--) = " +p); 

System.out.println("*********************Logical Operators*****************************");

boolean c = true;
boolean d =true;
boolean r =(c && d);
boolean r1 =(c || d);
System.out.println("c && d = " +r); 
System.out.println("c || d = " +r1); 

System.out.println("*********************Betwise Operators*****************************");
int w = 2;
int f = 3;
int s1 = w & f;
int s2 = w | f;
System.out.println("w & f = " +s1); 
System.out.println("w | f = " +s2); 
}
}