class Calculate
{
public int Add(int num1,int num2)
{
  int sum = num1+num2;
 System.out.println("Addition = " +sum);
 return sum;

}


public int Sub(int num1,int num2)
{
int sub = num1-num2;
 System.out.println("Substraction = " +sub);
 return sub;
}


public int Mul(int num1,int num2)
{
  int mul = num1*num2;
 System.out.println("multiplication = " +mul);
 return mul;
}


public int Div(int num1,int num2)
{
 int div = num1/num2;
 System.out.println("Division = " +div);
 return div;
}

public static void main(String args[])
{
Calculate c = new Calculate();
c.Add(2,4);

c.Sub(8,4);
c.Mul(7,2);
c.Div(9,3);
}
}