/*
Exception Handling
Handle insufficient balance using try catch finally and implement
Throw Keyword wihtin Try Block
 */

 class bank{
    void withdrawl(double balance,double amount){
        try{
            if(amount>balance) throw new ArithmeticException("Insufficient");
            System.out.println("withdrawal Successful");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Transcation Complete");
        }
    }
 }


public class _052_Exception {
    public static void main(String[] args) {
        bank bk= new bank();
        bk.withdrawl(1000, 2000);

        
        
    }
}
