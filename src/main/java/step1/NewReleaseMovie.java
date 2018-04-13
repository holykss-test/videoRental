package step1;

public class NewReleaseMovie extends Movie {
    public NewReleaseMovie(String title) {
        super(title, Movie.NEW_RELEASE);
    }

    @Override
    double getPrice(int daysRented) {
        double thisAmount = 0;

        thisAmount += 0.0;
        if (daysRented > 0)
            thisAmount += daysRented * 3;

        return thisAmount;
    }
}