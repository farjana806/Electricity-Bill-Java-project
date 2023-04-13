import java.util.Scanner;
public class Bill extends Login
{
    int ConsumerNo;
    String ConsumerName;
    int PrevReading;
    int CurrReading;
    int EBConn;

    int units;
    double bill;

    void input_data()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer Number: ");
        ConsumerNo = sc.nextInt();

        System.out.print("Enter Consumer Name: ");
        ConsumerName = sc.next();

        System.out.print("Enter Previous units:");
        PrevReading = sc.nextInt();

        System.out.print("Enter Current Units:");
        CurrReading = sc.nextInt();

        System.out.print("Connection Type: 1.Domestic 2.Commercial (1 or 2):");
        EBConn = sc.nextInt();

    }

    void calculate_bill()
    {
        units =  CurrReading - PrevReading;
        System.out.println("\n No of units: " + units);

        switch(EBConn)
        {
            case 1: if(units >0 && units <= 100)
                bill = units * 3;
            else if(units > 100 && units<=200)
                bill = (100*3) + ((units-100)*4.50);
            else if(units >200 && units <=500)
                bill = (100*1) + (100*4.50) + ((units-200)*5);
            else
                bill = (100*1) + (100*4.50) + (300*5) + ((units-500)*7);
                break;
            case 2: if(units>= 0 && units<= 100)
                bill = units * 4;
            else if(units >100 && units<= 200)
                bill = (100*4) + ((units-100)*5.50);
            else if(units >200 && units<=500)
                bill = (100*4) + (100*5.50) + ((units-200)*6.50);
            else
                bill = (100*4) + (100*5.50) + (300*6.50) + ((units-500)*7);
                break;
        }

    }

    void display()
    {
        System.out.println("------------------------");
        System.out.println("    ELECTRICITY BILL    ");
        System.out.println("------------------------");
        System.out.println("Consumer Number: "+ConsumerNo);
        System.out.println("Consumer Name: "+ConsumerName);
        System.out.println("Consumer Previous Reading: "+PrevReading);
        System.out.println("Consumer Current  Readung: "+CurrReading);
        System.out.println("Type of Connection: "+EBConn);
        System.out.println("------------------------");
        System.out.println("Total Bill in Rs." + bill);
    }
    void logindisplay()

    {
        System.out.println("Login Sucsussfully");
    }
}

