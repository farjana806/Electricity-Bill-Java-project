public class Login {
    private String billnumber;
    private  String pass;

    public String getBillnumber()
    {
        return billnumber;
    }

    public void setBillnumber(String billnumber)
    {
        this.billnumber = billnumber;
    }

    public String getPass()
    {
        return pass;
    }

    public void setPass(String pass)
    {
        this.pass = pass;
    }

    void logindisplay()
    {
        System.out.println("invalid bill Number");
    }
}
