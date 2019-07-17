package DataStructure;

import java.util.Scanner;

public class FloydAlgo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        System.out.println("Enter the matrix");
//        for (int i=0;i<5;i++)
//        {
//            for(int j=0;j<5;j++)
//            {
//                matrix[i][j] = sc.nextInt();
//
//                if(matrix[i][j]==0)
//                {
//                    matrix[i][j] = 999;
//                }
//            }
//        }

        int matrix[][] = {
                {0,   5,  999, 10},
                {999, 0,   3, 999},
                {999, 999, 0,   1},
                {999, 999, 999, 0}
        };

        for(int k=0;k<4;k++) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {

                    if(matrix[i][k] + matrix[k][j] < matrix[i][j])
                    {
                        matrix[i][j] = matrix[i][k] + matrix[k][j];
                    }

                }
            }
        }


        System.out.println("After finding shortest path");

        for (int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(matrix[i][j] == 999)
                    matrix[i][j] = 0;

                System.out.print(matrix[i][j]+"   ");
            }
            System.out.println("");
        }
    }
}
