package DataStructure;

public class InsertionSort {

    void sort(int arr[])
    {

        for(int i=0;i<arr.length;++i)
        {
            int j = i - 1;
            int key = arr[i];


            while(j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j - 1;
            }

            arr[j+1] = key;
        }

    }

    void Display(int arr[])
    {
        for (int i = 0; i < arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

    int arr[] = {10,5,6,1,2,3};

    System.out.println("Before Sorting");


    InsertionSort i1 = new InsertionSort();
    i1.Display(arr);
    long starttime = System.nanoTime();
    i1.sort(arr);
    long endtime = System.nanoTime();
    long exectime = endtime - starttime;
    System.out.println("");
    System.out.println("Execution time:"+exectime);

    System.out.println("");
    System.out.println("After Sorting");
    i1.Display(arr);


    }
}
