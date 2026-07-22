public class dataTypes_typeCasting {

    public static void main(String[] args) {

        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String
        
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        double myDouble = 9.78;
        int myInt = (int) myDouble;

        System.out.println(myDouble);
        System.out.println(myInt);


        int maxScore = 500;
        int userScore = 423;

        double percentage = (double) userScore / maxScore * 100.0d;

        System.out.println("User's percentage is " + percentage);


    }
    
}
