public class Client {
    private String name;
    private long budget;
    private final String cnp;

    public Client(String name, long budget, String cnp) {
        this.name = name;
        this.budget =budget;
        this.cnp = cnp;
    }

    public long getBudget() {
        return budget;
    }

    /**
     * This method will update the client budget each time he purchases a car.
     * @param acquisitionValue the value of the purchased car
     */
    public void updateBudget(long acquisitionValue) {
    }

}
