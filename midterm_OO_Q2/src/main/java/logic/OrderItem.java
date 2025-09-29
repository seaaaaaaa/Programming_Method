package logic;

public class OrderItem {
    private Item item;
    private int itemAmount;

    public OrderItem(Item item, int itemAmount) {
        this.item = item;
        this.itemAmount = Math.max(0,itemAmount);
    }

    public void increaseItemAmount(int amount) {
        if (amount > 0) {
            this.itemAmount += amount;
        }
    }

    public int calculateTotalPrice() {
        return this.itemAmount*item.getPricePerPiece();
    }

    public void setItemAmount(int itemAmount) {
        this.itemAmount = Math.max(0,itemAmount);
    }

    public Item getItem() {
        return item;
    }

    public int getItemAmount() {
        return itemAmount;
    }
}
