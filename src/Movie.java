public class Movie extends Amenity{

    private String movieName;
    private float movieLength;
    private boolean popcorn;

    public Movie(String amenityName, boolean amenityAvailability, double amenityPrice, String amenityDescription, String movieName, float movieLength, boolean popcorn) {
        super(amenityName, amenityAvailability, amenityPrice, amenityDescription);
        this.movieName = movieName;
        this.movieLength = movieLength;
        this.popcorn = popcorn;
    }

    public Movie(String movieName, float movieLength, boolean popcorn) {
        this.movieName = movieName;
        this.movieLength = movieLength;
        this.popcorn = popcorn;
    }

    public Movie() {
        this.movieName = null;
        this.movieLength = 0;
        this.popcorn = false;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public float getMovieLength() {
        return movieLength;
    }

    public void setMovieLength(float movieLength) {
        this.movieLength = movieLength;
    }

    public boolean isPopcorn() {
        return popcorn;
    }

    public void setPopcorn(boolean popcorn) {
        this.popcorn = popcorn;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "amenityName='" + getAmenityName() + '\'' +
                ", amenityAvailability=" + isAmenityAvailability() +
                ", amenityPrice=" + getAmenityPrice() +
                ", amenityDescription='" + getAmenityDescription() + '\'' +
                ", movieName='" + movieName + '\'' +
                ", movieLength=" + movieLength +
                ", popcorn=" + popcorn +
                '}';
    }
}
