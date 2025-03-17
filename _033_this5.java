/*Using this as an argument in constructor call 
Ques Print name of employee by taking user i/p
1.Create parametrized constructor(Pass class name in that)
2.Create another paramaetrized constructor & pass name in that 
3. Create display method 
4. Print name of employee in main using display method 
 */

import java.util.Scanner;

public class _033_this5 {
    String name;
    _033_this5(_033_this5 t){
        this.name =t.name;
    }
    _033_this5(String name){
        this.name=name;
    }
    void display(){
        System.out.println("EMployee Name"+ name);
    }




public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    new _033_this5(sc.nextLine()).display();
}    


}
