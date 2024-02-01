
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
        int height = 70;
        double pointsPerMeter = 1.8;
        int par = 120;
        if (jumpType.equals("normal")) {
            height = 46;
            pointsPerMeter = 2;
            par = 90;
        }
        System.out.println("Please enter the jumper's speed at the end of the ramp:");
        int jumpSpeed = input.nextInt();
        double airtime = Math.sqrt((2*height)/9.8);
        System.out.println(airtime);
        double distance = airtime * jumpSpeed;
        double points = 60 + (distance - par)*pointsPerMeter;
        System.out.println("Distance: " + distance);
        System.out.println("Points: " + points);
        if (points >= 61) {
            System.out.println("Great job for doing better than par!");
        }
        else if (points < 10) {
            System.out.println("What happened??");
        }
        else {
            System.out.println("Sorry you didn’t go very far");
        }
        
    }
}
