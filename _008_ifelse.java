import java.util.Scanner;

public class _008_ifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks ");
		int a= sc.nextInt();
		
	if(a>=90) {
		System.out.println("Grade:A");	
	}
	
    else if(a<90 & a>=75){
        System.out.println("Grade: B");
    }
    else if(a<75 & a>=50){
        System.out.println("Grade: B");
    }
    else{
        System.out.println("Re-appear! Try Again");
    }
	

	}

    

}

