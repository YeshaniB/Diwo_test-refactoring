public class ECommerceSystem {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Pasan", "pasan@example.com", "premium", "Colombo");
        Order order = new Order(1001, customer);
        order.items.add(new OrderItem("Laptop", 2, 1200.00));
        order.items.add(new OrderItem("Mouse", 1, 30.00));

        OrderProcessorHelper processor = new OrderProcessorHelper();
        OrderParams params = new OrderParams("CARD", true, "PROMO10", "EXPRESS");
        double total = processor.extracted_calculateTotal(order, params);
        System.out.println("Order Total: " + total);
    }
}