package business.product;

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
}
