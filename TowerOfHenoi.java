package DataStructure;

import java.util.Stack;

public class TowerOfHenoi {
    public static void main(String[] args) {
        Stack<String> rod1 = new Stack<>();

        Stack<String> rod2 = new Stack<>();

        Stack<String> rod3 = new Stack<>();

        rod1.push("disk3");
        rod1.push("disk2");
        rod1.push("disk1");

        Stack<String> check = new Stack<>();
        check = rod1;

        System.out.println("Iteration 1");
        System.out.println(rod1 + " "+rod2+" "+rod3);


        rod2.push(rod1.pop());
        rod2.push(rod1.pop());
        rod3.push(rod1.pop());
        System.out.println("Iteration 2");
        System.out.println(rod1 + " "+rod2+" "+rod3);


        rod3.push(rod2.pop());
        rod3.push(rod2.pop());
        System.out.println("Iteration 3");
        System.out.println(rod1 + " "+rod2+" "+rod3);


    }
}
