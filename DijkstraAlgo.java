package DataStructure;

import java.util.Scanner;

public class DijkstraAlgo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[5][5];
        int distance[] = new int[5];
        int visited[] = new int[5];
        int nextnode = 0;

        int min = 999;

        System.out.println("Enter the matrix");
        for (int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                matrix[i][j] = sc.nextInt();

                if(matrix[i][j]==0)
                {
                    matrix[i][j] = 999;
                }
            }
        }

        distance = matrix[0];



        visited[0] = 1;

        for (int counter = 0;   counter < 5;    counter++)
        {
            min = 999;
            for(int i=0;    i<5;    i++)
            {
                if (min > distance[i]   &&    visited[i]!=1)
                {
                    min = distance[i];
                    nextnode = i;
                }
            }

            visited[nextnode] = 1;

            for (int i=0;i<5;i++)
            {
                if(visited[i]!=1)
                {
                    if(min + matrix[nextnode][i] < distance[i])
                    {
                        distance[i] = min   + matrix[nextnode][i];
                    }
                }
            }
        }
        System.out.println();
        for (int i=0;   i<5;    i++)
        {
            if(distance[i] == 999)
                distance[i] = 0;

            System.out.println("shortest distance from 0 to "+i+" is:"+distance[i]);
        }

    }
}
