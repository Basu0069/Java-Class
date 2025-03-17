/* This is refer to current class instance variable
* Display the name of student
* create a class 
* constructor to initialize the name using this keyboard
*/


class student{
String name;
student(String name){
    this.name = name;
}
void display(){
    System.out.println("THis is name: "+ this.name);
}

}


public class _029_this {
 public static void main(String[] args) {
    student Student = new student("ABCD");
    Student.display();
    //  Scanner sc = new Scanner(System.in);
    //  String p = sc.nextLine();
    //  student st = new student(s);



 }   
}
