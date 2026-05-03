import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double averageRating = 0;
        double rating = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Type your rating for this movie");
            rating = scanner.nextDouble();
            averageRating += rating;
        }

        System.out.println("Average rating" + averageRating /3);

    }
}
