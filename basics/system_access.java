public class system_access {
    public static void main(String[] args) {
        boolean isLOggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 2;

        if(isLOggedIn && (isAdmin || securityLevel <=2)){
            System.out.println("Access granted");
        }else{
            System.out.println("Access denied.");
        }
    }
}
