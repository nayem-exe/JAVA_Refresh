public class if_else {
    
    public static void main(String[] args) {
        // Every if statement must have a boolean expression in parentheses.

        boolean isJavaFun = true;

        if(isJavaFun){
            System.out.println("Java is fun!");
        } else {
            System.out.println("Java is not fun.");
        }


        /*
        
        Less than: a < b
        Less than or equal to: a <= b
        Greater than: a > b
        Greater than or equal to: a >= b
        Equal to: a == b
        Not equal to: a != b
        
        */

        if(20 > 18){
            System.out.println("20 is greater than 18");
        }



        int x = 20;
        int y = 20;

        if(x == y){
            System.out.println("x is equal to y");
        }



        
        int time = 20;

        if (time < 18) {
        System.out.println("Good day.");
        } else {
        System.out.println("Good evening.");
        }

    }
}
