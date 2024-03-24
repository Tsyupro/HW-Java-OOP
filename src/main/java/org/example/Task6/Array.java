package org.example.Task6;

public class Array implements IMath,ISort {
    private int[] arr;

    public Array(int[] arr) {
        this.arr = arr;
    }

    @Override
    public int Max() {
        int max= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    @Override
    public int Min() {
        int min= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

    @Override
    public float Avg() {
        float avg = 0;
        float  x=0;
        for (int i : arr) {
            avg+=i;
            x++;

        }
        return avg /x;
    }

    @Override
    public void SortAsc() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public void SortDesc() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
}

   public void ShowArray(){
       for (int i : arr) {
           System.out.print(i + ",");

       }
       System.out.println();

   }
}
