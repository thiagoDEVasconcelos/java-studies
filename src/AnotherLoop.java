import java.util.Scanner;

public class AnotherLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double averageRating = 0;
        double rating = 0;
        int totalRatings = 0;

        while (rating != -1) {
            System.out.println("Type your rating for this movie or -1 to finish");
            rating = scanner.nextDouble();
            averageRating += rating;
            totalRatings++;
        }

        System.out.println("Average rating: " + averageRating / totalRatings);
    }
}
