import java.util.Scanner;

public class Reading {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Get Movie
        System.out.println("Type your favorite movie");
        String movie = scanner.nextLine();
        System.out.println(movie);

        //Get Release Year
        System.out.println("Type the release year of this movie");
        int releaseYear = scanner.nextInt();
        System.out.println(releaseYear);

        //Get the movie rating from the user
        System.out.println("Type your rate for this movie");
        double movieRating = scanner.nextDouble();
        System.out.println(movieRating);
    }

}
