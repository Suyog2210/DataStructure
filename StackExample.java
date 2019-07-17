package DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Character> s1 = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name");
        String name = sc.next();

        for(int i = 0; i < name.length() ; i++)
        {
            s1.push(name.charAt(i));
        }

        String RevName = "";
        System.out.println(s1);
        while(!s1.isEmpty())
        {
            RevName = RevName + s1.pop();
        }

        System.out.println(RevName);
    }
}
