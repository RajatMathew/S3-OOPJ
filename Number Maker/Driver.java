import java.util.Scanner;

public class Driver
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        NumberMaker nm = new NumberMaker(scan);
        
        int x[][] = nm.createTestData();
        String s, s2;

        System.out.println("Enter the file name:");
        
        s = scan.next();

        nm.writeData(x, s);
        System.out.println("Enter the file name to read:");
        s2 = scan.next();

        System.out.println("The file contents are:");
        nm.readData(s2);
    }
}
