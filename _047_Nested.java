/**
 * Anonymous Class
 * Wap to implement Class which triggers alert 
 * 1.Create Interface 
 * 2.Implement class which override method in main method
 * 3.Call method
 */

interface alert{
    void trigger();
}



public class _047_Nested {
 public static void main(String[] args) {
    alert al = new alert(){
        public void trigger(){
            System.out.println("Warning!");
        }
    };
    al.trigger();
     
 }   
}
