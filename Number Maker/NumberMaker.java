import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberMaker
{
    Scanner scan;
    public NumberMaker(Scanner scan)
    {
        this.scan = scan;
    }
    public int[][] createTestData()
    {
        int r, c;
        
        System.out.println("Enter the number of rows in the matrix");
        r = scan.nextInt();

        System.out.println("Enter the number of columns in the matrix");
        c = scan.nextInt();

        int ar[][] = new int [r][c];

        System.out.println("Enter the elements in the matrix:");
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                ar[i][j] = scan.nextInt();

        return ar;
    }
    public void writeData(int[][] testData, String fileName)
    {
        try
        {
            File txtFile = new File(fileName);
            FileWriter fw = new FileWriter(fileName);

            for(int i=0; i<testData.length; i++)
            {
                for(int j=0; j<testData[0].length; j++)
                    fw.write(Integer.toString(testData[i][j]) + " ");
                fw.write("\n");
            }
            fw.close();

        }
        catch (IOException e)
        {
            System.out.println("An error occured.");
        }

    }

    public void readData(String fileName)
    {
        try
        {
            File txtFile = new File(fileName);
            Scanner sc = new Scanner(txtFile);
            while (sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found Exception");
        }
    }
}
