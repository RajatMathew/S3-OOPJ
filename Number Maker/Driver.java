import java.util.Scanner;

public class Driver
{
    public static void main (String args[])
    {
        NumberMaker nm = new NumberMaker();
        Scanner scan = new Scanner(System.in);
        int x[][] = nm.createTestData();
        String s, s2;

        System.out.println("Enter the file name:");
        s = scan.nextLine();
        nm.writeData(x, s);

        System.out.println("Enter the file name to read:");
        s2 = scan.nextLine();

        System.out.println("The file contents are:");
        nm.readData(s2);
    }
}