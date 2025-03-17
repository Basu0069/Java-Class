// Method overrriding 
// Ques: Create class Bank with a method of "getInterest"
// & override it in SBI,ICICI,HDFC. 



class bank{
    double getInterest(){
        return 0;
    }
}
class SBI extends bank{
    double getInterest(){
        return 5.8;
    }
}
class ICICI extends bank{
    double getInterest(){
        return 7.8;
    }
}
class HDFC extends bank{
    double getInterest(){
        return 8.1;
    }
}



public class _040_polymorphism{



    public static void main(String[] args) {
        bank Bk = new SBI(); // dynamic method dispatch 
        System.out.println("Interest Rate : "+ Bk.getInterest()+" %");

    }
    
}
