package DataStructure;

public class Hamilton {
    static int V = 5;


    boolean isSafe(int graph[][],int path[],int pos,int v)
    {
        if(graph[path[pos - 1]][v] == 0) {
            return false;
        }

        for(int i=0; i<pos; i++) {
            if(path[i] == v)
                return false;
        }
        return true;
    }

    boolean findcycle(int graph[][],int path[],int pos)
    {
        if(pos == V) {
            if (graph[path[pos - 1]][path[0]] == 1)
                return true;

            else
                return false;
        }


        for(int v = 1; v < V; v++)
        {
                if(isSafe(graph,path,pos,v)) {
                    path[pos] = v;

                    if(findcycle(graph,path,pos+1) == true)
                        return true;

                    path[pos] = -1;
                }
        }

        return false;
    }

    int hamilton(int graph[][])
    {
        int path[] = new int[V];

        for(int i = 0; i<V; i++)
        {
            path[i] = -1;
        }

        path[0] = 0;
        if(findcycle(graph,path,1) == false)
        {
            System.out.println("Cycle does not exist");
            return  0;
        }

        printsol(path);
        return 1;
    }

    void printsol(int path[])
    {
        System.out.println("Hamilton cycle is:");
        for (int i=0; i<V ; i++)
        {
            System.out.println(" "+path[i]);
        }
        System.out.println(" "+path[0]);
    }
    public static void main(String[] args) {
        int graph[][] =
                {
                    {0,1,0,1,0},
                    {1,0,1,1,1},
                    {0,1,0,0,1},
                    {1,1,0,0,1},
                    {0,1,1,1,0}

                };


        Hamilton h1 = new Hamilton();
        h1.hamilton(graph);
    }
}
