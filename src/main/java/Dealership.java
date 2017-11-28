public class Dealership {
    private String dealerName;
    private Cars[] cars;
    private long[] carPrice;
    private int[] carStock;

    public Dealership(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getDealerName() {
        return dealerName;
    }

    public Cars getCarByIndex(int index) {
        return cars[index];
    }

    public void setCarByIndex(int index, Cars cars) {
        this.cars[index] = cars;
    }

    public long getCarPriceByIndex(int index) {
        return carPrice[index];
    }

    public void setCarPrice(int index, long carPrice) {
        this.carPrice[index] = carPrice;
    }

    public int getStockByIndex(int index) {
        return carStock[index];
    }

    public int getCarsCount() {
    }

    /**
     * If the car is not already registered than it will be added to the inventory setting the appropriate stock for it.
     * But if the care is already registered than the stock for that type of car will be increased.
     */
    public void addCarToStock() {
    }

    /**
     * When a car is sold to a client then the stock for that car will be decreased according with the number of pieces
     * that were sold.
     */
    public void removeCarFromStock() {
    }


}
