package Square;

public class Square {
    private int side;

    public void SetSide(int x)
    {
        side=x;
    }

    public int Perimeter()
    {
        return 4*side;
    }

    public int GetSide()
    {
        return side;
    }

    public int Area()
    {
        return side*side;
    }
}
