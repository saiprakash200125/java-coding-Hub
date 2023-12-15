public class PerfectSquare {
    public static void main(String args[]){
        int num1=25;
        double num2=Math.sqrt(num1);
        if(num2==(int)Math.sqrt(num1))
        {
            System.out.println("Given number is a perfect Square:"+(int)num2);
        }
        else
        {
            System.out.println("Given number is  not a perfect Square:"+(int)num2);
        }
    }
    
}
