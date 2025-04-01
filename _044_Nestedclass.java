// Static Nested Class
// A company tracks employees.Implement static nested class inside the company and calli ts method without creating an instance of company



class Company{

    static class Employee{
        void display(){
            System.out.println("EMployee data: ");
        }
    }
}




public class _044_Nestedclass {
    public static void main(String[] args){
        Company.Employee emp = new Company.Employee();
        emp.display();
     
    }
}
