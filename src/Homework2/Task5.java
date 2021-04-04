package Homework2;

public class Task5 {
    public static void main(String[] args)
    {
        double[] arr=new double[8];
        int x=-1;
        arr[0]=13.0;
        arr[1]=arr[0]+2.25;
        arr[2]=arr[1]-5.99;
        arr[3]=arr[0]*13.564;
        arr[4]=1.0;
        arr[5]=arr[4]+533.12;
        arr[6]=arr[2]+96.4;
        arr[7]=423.56;
        do {
            ++x;
            if(arr[x]>24.12 && arr[x]<467.23)
            {
                System.out.println(arr[x]);
            }

        }
        while(x!=7);
    }

}
