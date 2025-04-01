/**
 * WAp to implement additons of 2 nos using lamba expression 
 * 
 * 
 */


interface operation{
    int operate(int a, int b);

}


public class _049_lambda {
    public static void main(String[] args) {
        operation op = (a,b) -> a+b;
        System.out.println("Sum: "+ op.operate(7, 9));

    }
}
