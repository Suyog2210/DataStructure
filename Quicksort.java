package DataStructure;

class Quicksort
{

    int partition(int arr[],int low,int high)
    {
        int i = low - 1;
        int pivot = arr[high];

        for(int j = low;    j<high;    j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    void sort(int arr[],int low,int high)
    {

        if(low <= high) {
            int pi = partition(arr, low, high);

            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }

    }

    void print(int arr[])
    {
        System.out.println("After sorting");
        for(int i=0;    i<arr.length;   i++)
        {
            System.out.print(arr[i]+"   ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,7,8,9,1,5};

        int n = arr.length;

        Quicksort q1 = new Quicksort();
        long starttime = System.nanoTime();
        q1.sort(arr,0,n-1);
        long endtime = System.nanoTime();
        long exectime = endtime - starttime;
        System.out.println("");
        System.out.println("Execution time:"+exectime);
        q1.print(arr);

    }
}