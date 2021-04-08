package Test;
import Square.Square;
public class Test {
    public static void main(String[] args) {

        Square[] arr=new Square[6];
        arr[0]=new Square();
        arr[1]=new Square();
        arr[2]=new Square();
        arr[3]=new Square();
        arr[4]=new Square();
        arr[5]=new Square();

       arr[0].SetSide(4);
       arr[1].SetSide(55);
       arr[2].SetSide(21);
       arr[3].SetSide(3);
       arr[4].SetSide(12);
       arr[5].SetSide(5);

        for (int i=0;i<arr.length;++i)
        {
            for (int j=0;j<arr.length;++j)
            {
               if(arr[i].Area()<arr[j].Area())
               {
                   int tmp;
                   tmp=arr[i].GetSide();
                   arr[i].SetSide(arr[j].GetSide());
                   arr[j].SetSide(tmp);
               }
            }
        }

        for(int i=0;i<arr.length;++i)
        {
            System.out.println(arr[i].GetSide());
        }

    }
}
