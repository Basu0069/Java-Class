import java.util.Scanner;

class employee1{

    String name;
    double salary;

 employee1() {
    name="not given";
    salary= 0.0;
    }



    void setDetails(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    void display(){
        System.out.println("name is : "+ name);
        System.out.println("name is : "+ salary);
    }
}

public class _025_ques {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        employee1 emp= new employee1();
        System.out.println("Enter name & salary");
        emp.setDetails(sc.nextLine(),sc.nextInt());
        emp.display();
        sc.close();
    }
}
