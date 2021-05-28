public class Product{
    protected int ID_Product;
    protected String Product_Name;
    protected int Price;
    protected boolean Delivery;
    public void set_ID_Product (int ID_Product){
        this.ID_Product = ID_Product; }
    public void set_Product_Name (String Product_Name){
        this.Product_Name = Product_Name;   }
    public void set_Price (int Price){
        this.Price = Price; }
    public void set_Delivery (boolean Delivery){
        this.Delivery = Delivery;
    }
    public int get_ID_Product() {
        return ID_Product;
    }
    public String get_Product_Name() {
        return Product_Name;
    }
    public int get_Price() {
        return Price;
    }
    public boolean get_Delivery() {
        return Delivery;
    }
}