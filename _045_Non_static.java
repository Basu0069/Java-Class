// Non-Static Inner Clsdd 
// a library class inner class BOOK. Create object of book & access it 

// This is a non static method okay 

class library{
    class book{
        void show(){
            System.out.println("BOOK display! ");

        }
    }
}



public class _045_Non_static {
    public static void main(String[] args) {
        library lib = new library();
        library.book bk = lib.new book();
        bk.show();

        
    }
}
