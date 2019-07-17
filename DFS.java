package DataStructure;

import java.util.LinkedList;
import java.util.ListIterator;

public class DFS {

    int v;
    LinkedList<Integer> ll[];

    DFS(int v)
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

    void caldfs(int startsFrom,boolean visited[])
    {

         visited[startsFrom] = true;

         System.out.println(startsFrom);

            ListIterator<Integer> iterator = ll[startsFrom].listIterator();

            while (iterator.hasNext())
            {
                int n = iterator.next();

                if(!visited[n]){
                    caldfs(n, visited);
                }
            }
        }

    void  dfs(int v)
    {
        boolean visited[] = new boolean[this.v];
        caldfs(v,visited);
    }


    public static void main(String[] args) {

        DFS d = new DFS(4);

        d.addedge(0,1);
        d.addedge(0,2);
        d.addedge(1,2);
        d.addedge(2,0);
        d.addedge(2,3);
        d.addedge(3,3);

        d.dfs(2);

    }
}
