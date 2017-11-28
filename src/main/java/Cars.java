public class Cars {
    private int carPowerInKw;
    private int energyConsumptionKwPerKm;
    private String manufacturer;
    private String model;
    private int productionYear;
    private boolean isNewCar;
    private boolean hasFastCharging;

    public Cars(int carPowerInKw, int energyConsumptionKwPerKm, String manufacturer, String model, int productionYear,
                boolean isNewCar, boolean hasFastCharging){
    }

    public int getCarPowerInKw() {
        return carPowerInKw;
    }

    public int getEnergyConsumptionKwPerKm() {
        return energyConsumptionKwPerKm;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public boolean getIsNewCar() {
        return isNewCar;
    }

    public boolean getHasFastCharging() {
        return hasFastCharging;
    }

}
