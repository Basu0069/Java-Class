// Local-Nested Class(Inside a method class)
// Restaurant will apply discount using local nested class


class Restaurant{
    void applyDiscount(){
        class discount{
            void show(){
                System.out.println("Discount Applied: ");
            }
        }

        new discount().show();
    }

}

public class _046_local_nested {
 
    public static void main(String[] args) {
        new Restaurant().applyDiscount();

    }
}
