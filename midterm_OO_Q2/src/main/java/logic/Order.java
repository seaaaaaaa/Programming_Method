package logic;

import java.util.ArrayList;

public class Order {
    private ArrayList<OrderItem> orderItemList;
    private static int totalOrderCount = 0;
    private int orderNumber;

    public Order() {
        // TODO
        orderNumber = totalOrderCount++;
        orderItemList = new ArrayList<>();

    }

    public OrderItem addItem(Item item, int amount) {
        // TODO
        // Loop the orderItemList to find if item of any orderItem equals to the given item
        // if there is orderItem with given item, increase that orderItem itemAmount with amount
        // and return that orderItem
        amount = Math.max(0, amount);
        boolean found = false;
        for (OrderItem orderItem : orderItemList) {
            if (orderItem.getItem().equals(item)) {
                orderItem.setItemAmount(orderItem.getItemAmount() + amount);
                found = true;
                return orderItem;
            }
        }
        if (!found) {
            OrderItem orderItem = new OrderItem(item, amount);
            orderItemList.add(orderItem);
            return orderItem;
        }

        // else create new orderItem with given item and amount, then return the new orderItem
        return null;
    }

    public int calculateOrderTotalPrice() {
        // TODO
        // Calculate total price of the order by summing total price of each orderItem in orderItemList
        int totalPrice = 0;
        for (OrderItem orderItem : orderItemList) {
            totalPrice += orderItem.calculateTotalPrice();
        }
        return totalPrice;
    }

    public static int getTotalOrderCount() {
        return totalOrderCount;
    }

    public static void resetTotalOrderCount() {
        totalOrderCount = 0;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }


}
