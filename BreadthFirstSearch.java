package DataStructure;

import java.util.LinkedList;
import java.util.ListIterator;

public class BreadthFirstSearch {

    int v;
    LinkedList<Integer> ll[];

    BreadthFirstSearch(int v)
    {
        this.v = v;
        ll = new LinkedList[v];

        for(int i = 0;  i<v; i++)
        {
            ll[i] = new LinkedList<>();
        }
    }

    void addedge(int index,int vertex)
    {
        ll[index].add(vertex);
    }

    void calbfs(int startsFrom)
    {
        LinkedList<Integer> queue = new LinkedList<>();

        boolean visited[] = new boolean[v];

        visited[startsFrom] = true;

        queue.add(startsFrom);

        while (queue.size() != 0)
        {
            startsFrom = queue.poll();
            System.out.println(startsFrom);

            ListIterator<Integer> iterator = ll[startsFrom].listIterator();

            while (iterator.hasNext())
            {
                int n = iterator.next();

                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }


    }

    public static void main(String[] args) {

        BreadthFirstSearch b = new BreadthFirstSearch(4);

        b.addedge(0,1);
        b.addedge(0,2);
        b.addedge(1,2);
        b.addedge(2,0);
        b.addedge(2,3);
        b.addedge(3,3);

        b.calbfs(2);

    }
}
