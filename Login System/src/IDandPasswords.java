import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> loginInfo = new HashMap<String,String>();

    IDandPasswords(){
        loginInfo.put("DevSire","password");
        loginInfo.put("Aman","duet");
        loginInfo.put("Developer","realmadrid");
    }

    protected HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
}
