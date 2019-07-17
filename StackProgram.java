package DataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class StackProgram {
    ArrayList<Integer> arr = new ArrayList<>();

    void push(int num)
    {
        arr.add(num);
    }

    void pop()
    {
        if(underflow() == 0)
        arr.remove(arr.size() - 1);
    }

    void display()
    {
        for(Integer i:arr)
        {
            System.out.println(i);
        }
    }

    int underflow()
    {
        int flag = 0;
        if(arr.size() == 0)
        {
            System.out.println("Underflow");
            flag = 1;
        }
        else
        {
            flag = 0;
        }
        return flag;

    }
    public static void main(String[] args) {
        StackProgram s1 = new StackProgram();

        System.out.println("1.Push");
        System.out.println("2.Pop");
        System.out.println("3.Display");
        int ch;


        do {

            System.out.println("Enter your choice");

            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();


            switch (ch) {
                case 1:
                    System.out.println("Enter the number");
                    int num = sc.nextInt();
                    s1.push(num);
                    break;

                case 2:
                    s1.pop();
                    break;

                case 3:
                    s1.display();
                    break;
                case 4:
                    break;
            }

        }while (ch != 4);

    }
}
