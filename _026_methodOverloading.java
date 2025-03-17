// #Method Overloading  
// Ques: Wap to add numbers and concatenate string  
// by invoking the object of a method ;



class Student{
    public int add(int a,int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }
    public String add(String a ,String b){
        return a+b;
    }
        
    }


public class _026_methodOverloading {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Student basu = new Student();

        int sum = basu.add(5,5);
        System.out.println("THe sum is "+ sum);


        int sum3= basu.add(5,5,5);
        System.out.println("The sum of 3 number is :"+ sum3);


        String a = basu.add("happy","Birthday");
        System.out.println("the string value is this : "+a);




    }
    
}
