public class R09_ACC_J {
    public static void grantAdminPrivileges(User user) {
    }

    public static void main(String[] args) {
        User user = new User();
        grantAdminPrivileges(user);
    }
    
    private static class User {
    }
}
