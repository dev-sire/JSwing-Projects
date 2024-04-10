public class App {
    public static void main(String[] args) {

        IDandPasswords idandpasswords = new IDandPasswords();
        LoginPage loginpage = new LoginPage(idandpasswords.getLoginInfo());
    }
}