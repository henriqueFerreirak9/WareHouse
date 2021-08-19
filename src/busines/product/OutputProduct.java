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
}
