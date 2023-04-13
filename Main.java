import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        System.out.println("Enter the BIll Number: ");
        Scanner sc = new Scanner(System.in);
        String bill = sc.next();
        System.out.println("Enter the password: ");
        String pass = sc.next();
        Bill b = new Bill();//bill object
        b.setBillnumber("21335806");
        b.setPass("farjana");
        String x = b.getBillnumber();
        String y = b.getPass();
        int a = x.compareTo(bill);
        int c = y.compareTo(pass);
        if(a==0 && c==0)
        {
            b.logindisplay();
            b.input_data();
            b.calculate_bill();
            b.display();
        }
        else
        {
            Login l1 = new Login();
            l1.logindisplay();
        }

    }
}
