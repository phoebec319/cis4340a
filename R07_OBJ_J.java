public class R07_OBJ_J {
    private static class User {
        private String username;
        private String password;
    }
    public static void main(String[] args) {
        User user = new User();
        System.out.println("Username: " + user.username);
        System.out.println("Password: " + user.password);
    }
}
