import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int x = num.nextInt();
        int y = num.nextInt();
        
        if(x>0 && y>0)
            System.out.println("1");
        else if(x>0 && y<0)
            System.out.println("4");
        else if(x<0 && y<0)
            System.out.println("3");
        else if(x<0 && y>0)
            System.out.println("2");
    }
}
