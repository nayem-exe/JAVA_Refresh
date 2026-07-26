public class nested_if {
    public static void main(String[] args) {
        int x = 12;
        int y = 15;

        if (x > 10) {
            System.out.println("X is greater than 10");

            if (y > 14) {
                System.out.println("Y is greater than 14");
            }
        }

        int age = 20;
        boolean isCitizen = true;

        if(age >= 18) {
            System.out.println("Old enough to vote.");

            if (isCitizen) {
                System.out.println("And you are a citizen, so you can vote.");

            }else{
                System.out.println("You are not a citizen, so you can't vote.");
            }
        }else{
            System.out.println("Not old enough to vote.");
        }

    
    }
}
