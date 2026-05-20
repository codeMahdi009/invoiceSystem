public class Product {
    //class attributesfor product details
    private String productId;
    private String productName;
    private String productDescription;
    private double purchasePrice;
    private double sellingPrice;
    private int quantity;

    //Overloaded Constructor
    public Product(String productId, String productName, String productDescription, double purchasePrice, double sellingPrice, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
    }

    // Getters and Setters for product class 
    public String getProductIdA() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public String getProductDescription() { return productDescription; }
    public void setProductDescription(String productDescription) { this.productDescription = productDescription; }

    public double getPurchasePrice() { return purchasePrice; }
    public void setPurchasePrice(double purchasePrice) { this.purchasePrice = purchasePrice; }

    public double getSellingPrice() { return sellingPrice; }
    public void setSellingPrice(double sellingPrice) { this.sellingPrice = sellingPrice; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}

