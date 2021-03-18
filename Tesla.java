package cars;

public class Tesla {
    private String name;
    private int mileage;

    public Tesla(String name, int mileage) throws Exception {
        this.name = name;
        setMileage(mileage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) throws Exception {
        if(mileage<0) throw  new  Exception("Mileage was under 0");
        this.mileage = mileage;
    }

    public void driveAtSpeed(int kmPerHour) throws TooFastException {
        if (kmPerHour>80) throw new TooFastException("You went too fast fam slow down");
        System.out.println("Drives at "+ kmPerHour+" per hour");
    }

    public void listenToRadio(String FM){
        int channel = Integer.parseInt(FM);
        System.out.println("lalalal");
    }
}
