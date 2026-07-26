public class shorthand_if_else {
    public static void main(String[] args) {
        // Syntax : variable = (condition) ? expressionTrue : expressionFalse
        int time = 20;

        String result = (time < 18) ? "Good day" : "Good evening";
        System.out.println(result);


        // Nested

        String message = (time < 12) ? "Good Morning"
                        : (time < 18) ? "Good Evening"
                        : "Good Night";
        
        System.out.println(message);
    }
}
