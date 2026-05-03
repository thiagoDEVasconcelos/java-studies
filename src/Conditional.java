public class Conditional {
    public static void main (String[] args) {
        int releaseYear = 1990;
        boolean includedInPlan = false;
        double movieRating = 8.9;
        String planType = "plus";


        if (releaseYear > 2026) {
            System.out.println("Releases Customers Are Loving");
        } else {
            System.out.println("Retro movies that is worth to watch");
        }

        if (includedInPlan || planType.equals("plus")) {
            System.out.println();
        } else {
            System.out.println("Should rent the movie");
        }
    }

}
