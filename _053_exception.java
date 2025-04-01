/**
 *THrow exception 
 Verify if person if eligible to vote or not 
 You will use only throw exception 
 */


 class vote{
    void elgible(int age ){
        if(age<18) throw new IllegalException("NOt Eligible to vote");
    }
 }

public class _053_exception {
    public static void main(String[] args) {
        new votingSystem().checkEligibilty(9);
        
    }
}
