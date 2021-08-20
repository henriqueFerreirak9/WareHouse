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

    public int getCurrent_quantity() {
        return current_quantity;
    }
    public void setCurrent_quantity(int current_quantity) {
        this.current_quantity = current_quantity;
    }

    public int getId_product(){
        return id_product;
    }
    public void setId_product(int id_product){
        this.id_product = id_product;
    }

    public int getInput_quantity_product(){
        return input_quantity_product;
    }
    public void setInput_quantity_product(int input_quantity_product){
        this.input_quantity_product = input_quantity_product;
    }

    public  int getId_provider(){
        return id_provider;
    }
    public void setId_provider(int id_provider) {
        this.id_provider = id_provider;
    }

    public int getCurrent_value() {
        return current_value;
    }
    public void setCurrent_value(int current_value) {
        this.current_value = current_value;
    }
}
