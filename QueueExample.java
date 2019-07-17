package DataStructure;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExample {
    public static void main(String[] args) {
        System.out.println("Voting System");

        //Data is present in Untitled Document 1
        File file = new File("/home/perennial/Documents/Untitled Document 1");
        BufferedReader br;

        Queue<String> names = new LinkedList<>();
        ArrayList<String> arr = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        //Read the data of validate candidate from file
        try {
            br = new BufferedReader(new FileReader(file));
            String st;

            while ((st = br.readLine()) != null)
            {
                arr.add(st);
            }
        }
        catch (Exception e)
        {
            System.out.println("File not Found");
        }

        int i = 10;
        String name = null;
        int flag = 0;

        System.out.println(arr);

        //Cheching that weather your name is present in the voting list or not
        while(i>0)
        {
            System.out.println("Enter your name");
            name = sc.next();
            flag = 0;
            for(String s:arr)
            {
                if(s.equalsIgnoreCase(name))
                {
                    System.out.println("Admin:You can enter in the queue");
                    names.add(name);
                    flag = 1;
                }
            }
            if(flag == 0)
            {
                System.out.println("You are not valid candidate");
            }
            System.out.println("Admin do you want to continue?If no then press -1");

            i = sc.nextInt();

        }

        //Display and remove from the queue
        System.out.println("Candidates who done with Voting");
        while (!names.isEmpty())
        {
            System.out.println(names.remove());
        }

        System.out.println("Currently Queue Contains:"+names);


    }
}
