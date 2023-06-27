package StudentSystem;

public class Regeist {
    private String User;
    private String Passord;
    private String PersonNum;
    private String Num;

    public Regeist(String user, String passord, String personNum, String num) {
        User = user;
        Passord = passord;
        PersonNum = personNum;
        Num = num;
    }

    public Regeist() {
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPassord() {
        return Passord;
    }

    public void setPassord(String passord) {
        Passord = passord;
    }

    public String getPersonNum() {
        return PersonNum;
    }

    public void setPersonNum(String personNum) {
        PersonNum = personNum;
    }

    public String getNum() {
        return Num;
    }

    public void setNum(String num) {
        Num = num;
    }
}


