package DataStructure;

import java.util.Scanner;

public class Queue {
    int[] arr;
    int Front = 0;
    int Rear = 0;

    void setSize(int size)
    {
        arr = new int[size];
    }

    void add(int num)
    {
        arr[Front] = num;
        Front++;
    }

    void remove()
    {
        arr[Rear] = 0;
        int index = 0;

        int tempArr[] = new int[arr.length];

        for(int i=0; i< arr.length ; i++)
        {
            if(arr[i] != 0)
            {
                tempArr[index] = arr[i];
                index++;
            }
        }

        arr = tempArr;
    }

    void display()
    {
        for(int i = 0; i<arr.length ;i++){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        System.out.println("Enter the size of queue");

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        Queue q1 = new Queue();
        q1.setSize(size);
        int ch;

        do {

            System.out.println("1 Insert");
            System.out.println("2 Remove");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter your choice?");

             ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter the number");
                    int number = sc.nextInt();
                    q1.add(number);
                    break;

                case 2:
                    q1.remove();
                    break;

                case 3:
                    q1.display();
                    break;

                case 4:
                    break;
            }

        }while (ch != 4);

    }
}
