class calculateTriangle
{
    public static void main(String arg[])
    {
        Triangle t = new Triangle(50, 10, 5, 10);
        System.out.println("Area = " + t.Area());
        System.out.println("Perimeter = " +
t.Perimeter());
} }
class Triangle
{
    int height;
    int base;
    int m_a;
    int m_c;
    Triangle(int q, int r,int s,int u)
    {
        this.height = q;
        this.base = r;
        this.m_a = s;
        this.m_c = u;
}
    int Area()
    {
        return (height * base)/2;
    }
    int Perimeter()
    {
        return m_a + base + m_c;
    }
}