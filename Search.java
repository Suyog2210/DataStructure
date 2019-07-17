package DataStructure;

import java.util.Scanner;

public class Search {



    void linearsearch(int arr[],int key)
    {
        int flag = 0;

        for(int i = 0;  i<arr.length;    i++)
        {
            if(arr[i] == key) {
                System.out.println("Key " + key + " is found at position " + i);
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("Key is not present");
        }
    }

    void binary(int arr[],int low,int high,int key)
    {
        int flag = 0;
        int mid = (low + high)/2;
        if(high>=low)
        {
            if (arr[mid] == key)
            {
                System.out.println("Key " + key + " is found at position " +mid);
            }
            else if (arr[mid] < key) {
                low = mid + 1;
                binary(arr, low, high, key);
            }
            else if(arr[mid] > key) {
                high = mid - 1;
                binary(arr, low, high, key);
            }
        }
        else
        {
            System.out.println("Key not found");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high)/2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key");
        int key = sc.nextInt();

        Search s1 = new Search();
        s1.linearsearch(arr,key);


        s1.binary(arr,low,high,key);




    }
}
