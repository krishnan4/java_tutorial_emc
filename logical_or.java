import java.util.*;
public class logical_or {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean a=sc.nextBoolean();
        boolean b=sc.nextBoolean();
        if(a||b){
            System.out.println("I will play");
        }
        else{
            System.out.println("Don't play");
        }
    }
    
}
