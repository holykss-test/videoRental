package step1;

public class RegularMovie extends Movie {
    public RegularMovie(String title) {
        super(title, Movie.REGULAR);
    }

    double getPrice(int daysRented) {
        double thisAmount = 0;

        thisAmount += 2;
        if (daysRented > 2)
            thisAmount += (daysRented - 2) * 1.5;
        return thisAmount;
    }
}
