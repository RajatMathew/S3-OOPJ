import java.util.Scanner;

public class Driver
{
    public static void main (String args[])
    {
        NumberMaker nm = new NumberMaker();
        Scanner scan = new Scanner(System.in);
        String fileName1, fileName2;
        int testData[][] = nm.createTestData();

        System.out.println("Enter the file name:");
        fileName1 = scan.nextLine();
        nm.writeData(testData, fileName1);

        System.out.println("Enter the file name to read:");
        fileName2 = scan.nextLine();

        System.out.println("The file contents are:");
        nm.readData(fileName2);
    }
}
