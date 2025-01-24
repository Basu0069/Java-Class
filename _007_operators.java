public class _007_operators {
    public static void main(String[] args) {
        
        System.out.println("Arithmetic operators : ");
        int a = 5;
        int b= 8;

        System.out.println("Addition: " + (a+b));
        System.out.println("Subtraction: " + (a-b));
        System.out.println("Multiplication: " + (a*b));

        System.out.println("Ternary Operators : ");
        int min= (a<b)? a: b;

        System.out.println(min);

        System.out.println(min);

        System.out.println("Logical Operators : ");
        System.out.println("And Operator" +(a<5 && a<20));
        System.out.println("OR Operator" +(a<5 || a<20));
        System.out.println(!(a<5 && a<20));


        System.out.println("Relational Operatos : ");
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);


        System.out.println("UNARY Operators");
        boolean c = true;

        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(!c);


        System.out.println("Assignment Operators ");
        int d;

        System.out.println(d=a);
        System.out.println(b +=a);
        System.out.println(b -=a);
        System.out.println(b *=a);
        System.out.println(b /=a);
        System.out.println(b ^a);
        System.out.println(b %=a);
        

    }
}
