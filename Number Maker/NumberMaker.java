import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberMaker
{
    public int[][] createTestData()
    {
        int row, col;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows in the matrix");
        row = sc.nextInt();

        System.out.println("Enter the number of columns in the matrix");
        col = sc.nextInt();

        int testData[][] = new int [row][col];

        System.out.println("Enter the elements in the matrix:");
        for(int i=0; i<row; i++)
            for(int j=0; j<col; j++)
                testData[i][j] = sc.nextInt();
        
        sc.close();
        return testData;
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
            System.out.println("An unknown error occured. Please try again.");
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
            sc.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found Exception");
        }
    }
}
