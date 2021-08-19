package busines.product;

public class InputProduct {
    private int id_product;
    private int input_quantity_product;
    private int id_provider;
    private int current_quantity;
    private int current_value;


    public InputProduct(int id_product, int input_quantity_product, int id_provider, int current_quantity, int current_value){
        this.id_product = id_product;
        this.id_provider= id_provider;
        this.input_quantity_product = input_quantity_product;
        this.current_quantity = current_quantity;
        this.current_value = current_value;

    }
}
