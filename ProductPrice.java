public class ProductPrice {
    public static void main(String args[]){
        String name="laptop";
        String brand="lenovo";
        String code="l23ABCD";
        int price=45000;
        int quantity=2;
        int total=(price * quantity);
        System.out.println("Product name:"+name);
        System.out.println("Product Brand:"+brand);
        System.out.println("Product code:"+code);
        System.out.println("Total Amount:"+total);
        System.out.println("Product quantity:"+quantity);
        if(total>80000)
        {
            System.out.println("Amount to be paid :"+(total * 50)/100);
        }
        else if(total>60000)
        {
            System.out.println("Amount to be paid :"+(total * 30)/100);
        }
        else if(total>40000)
        {
            System.out.println("Amount to be paid :"+(total * 10)/100);
        }
        else if(total<40000)
        {
            System.out.println("Amount to be paid :"+(total * 3)/100);
        }
        else
        {
            System.out.println(total);
        }
    }
    
}
