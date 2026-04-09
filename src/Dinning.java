public class Dinning extends Amenity{

    private String dinningType;
    private boolean foodDelivery;

    public Dinning(String amenityName, boolean amenityAvailability, float amenityPrice, String amenityDescription, String dinningType, boolean foodDelivery) {
        super(amenityName, amenityAvailability, amenityPrice, amenityDescription);
        this.dinningType = dinningType;
        this.foodDelivery = foodDelivery;
    }

    public Dinning(String dinningType, boolean foodDelivery) {
        this.dinningType = dinningType;
        this.foodDelivery = foodDelivery;
    }

    public Dinning() {
        this.dinningType = "dinningType";
        this.foodDelivery = false;
    }


    public String getDinningType() {
        return dinningType;
    }

    public void setDinningType(String dinningType) {
        this.dinningType = dinningType;
    }

    public boolean isFoodDelivery() {
        return foodDelivery;
    }

    public void setFoodDelivery(boolean foodDelivery) {
        this.foodDelivery = foodDelivery;
    }


    @Override
    public String toString() {
        return "Dinning{" +
                "amenityName='" + getAmenityName() + '\'' +
                ", amenityAvailability=" + isAmenityAvailability() +
                ", amenityPrice=" + getAmenityPrice() +
                ", amenityDescription='" + getAmenityDescription() + '\'' +
                ", dinningType='" + dinningType + '\'' +
                ", foodDelivery=" + foodDelivery +
                '}';
    }
}
