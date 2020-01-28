public class Box {
    double h,w,d;

     Box(double width,double height,double depth)
    {
        h=height;
        w=width;
        d=depth;
    }
    double volume()
    {
        double v;
    v=h*w*d;
    return v;
    }
   
    public static void main(String[] args) {
       
    Box bx = new Box(6.5,8.3,9.6);
    System.out.println(bx.volume());

    }

}
