public class areacircle{
    public static void main(String[] args) {
        int r=5;
        System.out.println("please enter radius");
        double pi = 3.14;
        int area=(int)(pi*r*r);
        int circumference=(int)(2*pi*r);
        System.out.println("area of the circle is :"+area);
        System.out.println("circumference of circle :"+circumference);
    }
}