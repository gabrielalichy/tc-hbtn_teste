public class Person {

    private String username;
    private String password;

    public void setUser(String user) {
        this.username = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkUser() {
        return !this.username.matches(".*[^a-zA-Z0-9].*") && this.username.length() >= 8;
    }

    public boolean checkPassword() {
        boolean isValid = false;

        return this.password.matches(".*[A-Z].*") && this.password.matches(".*[0-9].*") && this.password.matches(".*[^a-zA-Z0-9].*") && this.password.length() >= 8;
    }

}
