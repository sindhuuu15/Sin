
// Java program to find area
// of circle
     
class Test
{
    static final double PI = Math.PI;
          
    static double findArea(int r)
    {
       return PI * Math.pow(r, 2);
    }
          
    // Driver method
    public static void main(String[] args) 
    {
        System.out.println("Area is " +  findArea(5));
    }
}
