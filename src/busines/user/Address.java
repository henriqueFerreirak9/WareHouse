package busines.user;

public class Address {
    private String street;
    private int number;
    private String district;


    public Address(  String street, int number, String district ) {
        this.street = street;
        this.number = number;
        this.district = district;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber(){
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
}
