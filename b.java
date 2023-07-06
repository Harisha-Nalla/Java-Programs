import java.util.*;
public class b {
        public static void main(String args[])
        {
            int row, col, i, j;
            int arr[][] = new int[10][10];
            Scanner r = new Scanner(System.in);
            System.out.print("Enter row for the array (max 10) : ");
            row = r.nextInt();
            System.out.print("Enter column for the array (max 10) : ");
            col = r.nextInt();
            System.out.println("Enter" + (row * col) + " Array Elements : ");
            for (i = 0; i < row; i++)
            {
                for (j = 0; j < col; j++)
                {
                    arr[i][j] = r.nextInt();
                }
            }
            System.out.print("The Array Matrix is :\n");
            for (i = 0; i < row; i++)
            {
                for (j = 0; j < col; j++)
                {
                    System.out.print(arr[i][j] + "  ");
                }
                System.out.println();
            }
        r.close();
    }
}
