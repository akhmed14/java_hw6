package seminar6.hw1;

public class Brand {
    private String model;
    private String country;
    public Brand(String model, String country) {
        this.model = model;
        this.country = country;
    }
    public String getModel(){return model;}
    public String getCountry(){return country;}

    @Override
    public String toString(){
        return "model= " + model + ", country= " + country;
    }
}
