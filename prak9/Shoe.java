package prak9;

class Shoe {
    private String name;
    private int size;
    private int stock;
    private int unitPrice;
    private int totalPrice;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setStock(int stock) {
        this.stock = stock;
        calculateTotalPrice();  // Recalculate total price when stock is set
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
        calculateTotalPrice();  // Recalculate total price when unit price is set
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getStock() {
        return stock;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    // Method to calculate the total price (stock * unit price)
    private void calculateTotalPrice() {
        this.totalPrice = this.stock * this.unitPrice;
    }

    // Method to check stock status
    public String getStockStatus() {
        return stock < 5 ? "Stok Hampir Habis" : "Stok Cukup";
    }

    // Static method to calculate the total earnings if all shoes are sold
    public static int calculateTotalEarnings(Shoe[] shoeList) {
        int total = 0;
        for (Shoe shoe : shoeList) {
            total += shoe.getTotalPrice();
        }
        return total;
    }
}
