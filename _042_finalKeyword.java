/*final keyword 
Ques: Wap to use final to prevent method overriding 
*/

class vehicles{
    final void display(){
        System.out.println("Final method");
    }
}

class car extends vehicles{
    void display(){
        System.out.println(display());
    }
}


public class _042_finalKeyword {
    public static void main(String[] args) {
        


    }
}
