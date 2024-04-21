import java.util.Scanner;
import java.io.*
class Complex{
	int a,b;
	Complex(){
	  a=b=0;
	}
	Complex(int x,int y){++
	  a=x;
	  b=y;
	}
	void set(int x,int y){
	  a=x;
	  b=y;
	}
	void read(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of a");
	this.a = sc.nextInt();
	System.out.println("Enter the value of b");
	this.b = sc.nextInt();
	}
	Complex add(Complex c){
	Complex t = new Complex();
	this.a = this.a +c.a;
	this.b = this.b +c.b;
	return t;
	}
	Complex multi(Complex c){
	Complex t = new Complex();
	this.a = this.a*c.a - this.b*c.b;
	this.b = this.b*c.a - this.a*c.b;
	  return t; 
	}
	Complex assign(Complex c){
	Complex t = new Complex();
	t.a =this.a = c.a;
	t.b =this.b = c.b;
	return t;


	}
	boolean equal(Complex c){
	if(this.a==c.a && this.b==c.b)
	       return true;
	      else
	      return false; 
	}
	Complex incr(Complex c){
	Complex t = new Complex();
	t.a = ++this.a;
	t.b = ++this.b;
	return t;
	}
	Complex decr(Complex c){
	Complex t = new Complex();
	t.a = --this.a;
	t.b = --this.b;
       return t;
	}
	double mod(){
	    double res
	    double val = (this.a*this.a) +(this.b*this.b);
	     res = math.sqrt(val);
	     return res;
	}
	}
	void display{
	  System.out.println("(" +a + "+" + "i" + b+ ")");
	} 
}
class MainComplex{
	public sttic void main(String[] args){
	Complex c1 =new Complex(10,5);
	Complex c2 =new Complex(25,10);

	System.out.println("Complex number 1:");
	c1.display();

	System.out.println("Complex number 2:");
	c2.display();

	System.out.println("Addition of Complex number:");
	c1.add(c2).display();

	System.out.println("multiplication of Complex number");
	c1.multi(c2).display();

	System.out.println("Increment of Complex numbers: ");
	c2.incr().display();
	c1.incr().display();

	System.out.println("Decrement of Complex numbers: ");
	c1.decr().display();
	c2.decr().display();

	System.out.println("Enter the value for new complex");
	Complex c4 = new Complex();
	c4.read();
	c4.display();

	boolean i;
	i = c4.equals(c2);
	System.out.println("equal or not:" +i);

	boolean j;
	j = c1.equals(c2);
	System.out.println("equal or not:" +j);

	double val = c2.mod();
	System.out.println("Mod of complex=" +val);

	Complex c5 = new Complex();
	c5 = c2.assign(c1);
	System.out.println("Value of assigned Complex= ");
	c5.display(); 
	}
}