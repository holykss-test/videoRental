package step1;

public class RegularMovie extends Movie {
    public RegularMovie(String title) {
        super(title, Movie.REGULAR);
    }

    double getPrice(int daysRented) {
        double thisAmount = 0;

        switch (getPriceCode()) {
        case Movie.REGULAR:
            thisAmount += 2;
            if (daysRented > 2)
                thisAmount += (daysRented - 2) * 1.5;
            break;

        case Movie.NEW_RELEASE:
            thisAmount += daysRented * 3;
            break;

        case Movie.CHILDRENS:
            thisAmount += 1.5;
            if (daysRented > 3)
                thisAmount += (daysRented - 3) * 1.5;
            break;
        }
        return thisAmount;
    }
}
