// #overriding to String Method 
// Ques: Wap to print details of book(title of book) by using toString method 

import java.util.Scanner;

class book{
    String title;
    book(String title){
        this.title=title;
    }
    public String toString(){
        return "Book: "+ title;
    }
}


public class _041_overriden {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(new book(sc.nextLine()));
        sc.close();

    }
}
