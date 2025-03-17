



import java.util.Scanner;
class MethodOver{
    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }
    String add(String S1,String S2){
        return S1+S2;
    }



}


public class _027_method_overlaodingg {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
       MethodOver obj = new MethodOver();
       System.out.println("Sum of nos. "+ obj.add(sc.nextInt(),sc.nextInt()));
       System.out.println("Conacatenate of String:  "+ obj.add(sc.nextLine(),sc.nextLine()));
       sc.close();
    }
        
    }
