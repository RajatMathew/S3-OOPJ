AIM 

Create a class called NumberMaker. Give it the following methods:

public int[][] createTestData()
public void writeData(int[][] testData, String fileName)
public void readData(String fileName)
The createTestData method should return a two-dimensional array filled with numbers. The writeData method should take a two-dimensional array and a filename, and write the numbers in the array out to a text file with that name. Each line in the array should be a line in the file, and the numbers on one line should be separated with spaces.The readData method reads data from the file and displays it the output screen.
Create another class called Driver. Give it a main method that does the following:
Create an instance of NumberMaker
Obtain a two-dimensional array of numbers by calling createTestData on it.
Write out the array values to a file called numbers.txt by passing the array and the filename to its writeData method.
 Output 1

Enter the number of rows in the matrix
2
Enter the number of columns in the matrix
2
Enter the elements in the matrix:
1
2
3
4
Enter the file name:
Exp10.txt
Enter the file name to read:
Exp10.txt
The file contents are:
1 2
3 4


Output 2
Enter the number of rows in the matrix
2
Enter the number of columns in the matrix
2
Enter the elements in the matrix:
1
2
3
4
Enter the file name:
Exp10.txt
Enter the file name to read:
Exp.txt
The file contents are:
File Not Found Exception
