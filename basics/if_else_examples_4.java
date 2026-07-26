public class if_else_examples_4 {
    public static void main(String[] args) {
        int age = 25;
        boolean isCitizen = false;

        if (age >= 18) {
            System.out.println("Eligable to vote.");

            if (isCitizen == true){
                System.out.println("And you are a citizen.So, You can vote.");
            }else{
                System.out.println("But you are note citizen. So You can't vote.");
            }

        }else{
            System.out.println("Not eligable to vote.");
        }

    }
}
