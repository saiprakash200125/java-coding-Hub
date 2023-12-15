public class LastDigit{
    public static void main(String args[]){
        int num =1758;
        int last_digit=num%10;
        if(last_digit%5==0)
        {
            System.out.println("Divisible by 5");
        }
        else
        {
            System.out.println(" not Divisible by 5");
        }
    }
    
}
