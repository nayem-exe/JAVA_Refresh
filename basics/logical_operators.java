public class logical_operators {
    public static void main(String[] args) {
        int a = 200;
        int b = 300;
        int c = 500;

        // AND: Changed both to 'less than' (<) so both are true
        if(a < b && a < c){
            System.out.println("Both conditions are true.");
        }

        // OR: Changed first to 'less than' (<) so at least one is true
        if (a < b || a > c){
            System.out.println("At least one condition is true.");
        }

        // NOT: Kept the same because 200 > 300 is false, and ! makes it true
        if(!(a > b)) {
            System.out.println("a is Not greater than b");
        }
    }
}
