package DataStructure;

class Merge
{

    void merge(int arr[],int low,int high,int mid)
    {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0;  i<n1;  i++)
            L[i] = arr[low + i];

        for(int j=0;j<n2;j++)
            R[j] = arr[mid + 1 + j];

        int i = 0;
        int j = 0;

        int k=low;
        while (i<n1 && j<n2)
        {
            if(L[i]<=R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i<n1)
        {
            arr[k] = L[i];
            k++;
            i++;
        }

        while (j<n2)
        {
            arr[k] = R[j];
            k++;
            j++;
        }

    }
    void sort(int arr[],int low,int high){

        if(low < high) {
            int m = (low + high) / 2;

            sort(arr, low, m);

            sort(arr, m + 1, high);

            merge(arr, low, high, m);
        }
    }

    void printarr(int arr[])
    {
        System.out.println("");
        System.out.println("Array after sorting");
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,11,13,5,6,7};

        System.out.println("Before Sorting");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }


        Merge m = new Merge();

        long starttime = System.nanoTime();
        m.sort(arr,0,arr.length-1);

        long endtime = System.nanoTime();
        long exectime = endtime - starttime;
        System.out.println("");
        System.out.println("Execution time:"+exectime);

        m.printarr(arr);

    }
}
