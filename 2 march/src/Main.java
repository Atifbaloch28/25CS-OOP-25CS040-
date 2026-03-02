import java.util.Scanner;

void main() {

    int Number = 28;
    int guess = 0;

     while (guess != Number) {
         System.out.println("Guess a correct number:");
         guess = new Scanner(System.in).nextInt();

     if (guess > 250)
         System.out.println("Too high!");
     if (guess < 5)
         System.out.println("Too low!");

     if (guess < 250 & guess > 5)
             if (guess == Number) {
             System.out.println("You got it!");
             } else {
             System.out.println("Nope!");
         }
     }

}