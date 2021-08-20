package busines.product;

public class Product {
    private int id;
    private int barcode;
    private int und;
    private String provider;

    public Product(int id, int barcode, int und, String provider){
        this.id = id;
        this.barcode = barcode;
        this.und = und;
        this.provider = provider;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getBarcode() {
        return barcode;
    }
    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public int getUnd(){
        return und;
    }
    public void setUnd(int und){
        this.und = und;
    }

    public String getProvider() {
        return provider;
    }
    public void setProvider(String provider) {
        this.provider = provider;
    }
}
