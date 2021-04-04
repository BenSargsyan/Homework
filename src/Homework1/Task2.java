package Homework1;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[16];
        int x=-1;
        do {

            arr[++x]=x*25;
            System.out.println(arr[x]);
        }
        while(x!=15);
    }
}
