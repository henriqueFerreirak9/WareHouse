package busines.product;

public class OutputProduct {
    private int id_product;
    private int out_quantity_product;
    private int id_employee;
    private int current_quantity;


    public OutputProduct(int id_product, int out_quantity_product, int id_employee, int current_quantity){
        this.id_product = id_product;
        this.id_employee = id_employee;
        this.out_quantity_product = out_quantity_product;
        this.current_quantity = current_quantity;

    }

    public int getId_product() {
        return id_product;
    }
    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getOut_quantity_product() {
        return out_quantity_product;
    }
    public void setOut_quantity_product(int out_quantity_product) {
        this.out_quantity_product = out_quantity_product;
    }

    public int getId_employee() {
        return id_employee;
    }
    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    public int getCurrent_quantity() {
        return current_quantity;
    }
    public void setCurrent_quantity(int current_quantity) {
        this.current_quantity = current_quantity;
    }
}
