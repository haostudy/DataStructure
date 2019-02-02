package SortMethod;

public class BubbleSort{

    public static void main(String args[]){
        int[] array = new int[]{5,2,6,3,7,9};
        BubbleSort sort = new BubbleSort();
        sort.sort(array);
    }
    public void sort(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }

        }
        showArray(array);
    }
    public void showArray(int[] array){
        for (int i: array) {
            System.out.print(i+" ");
        }
    }
}