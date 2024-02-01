
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the type of ski jump (normal or large):");
        String jumpType = input.nextLine().trim().toLowerCase();
        while(!jumpType.equals("normal") && !jumpType.equals("large")) {
            System.out.println("Invalid. Please enter the type of ski jump (normal or large):");
            jumpType = input.nextLine().trim().toLowerCase();
        }
        if (jumpType.equals("normal")) {
            int height = 46;
            double pointsPerMeter = 2;
            int par = 90;
        }
        
    }
}
