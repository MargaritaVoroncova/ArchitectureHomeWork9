import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;

import java.util.List;

public class Main {
    private List<Order> orders;

    public static void main(String[] args) {
        Main main = new Main();
        main.orders = main.loadOrdersFromDatabase();
        main.displayOrders();

        // Реализуйте остальную логику интерфейса, например, добавление, редактирование и удаление заказов
    }

    private List<Order> loadOrdersFromDatabase() {
        // Здесь можно добавить логику для загрузки заказов из базы данных
        // Примерно так:
        // List<Order> orders = databaseService.loadOrders();
        // return orders;

        // Вместо реальной загрузки из базы данных, создадим примеры заказов
        return ImmutableList.of(
                new Order("Заказ 1", 100),
                new Order("Заказ 2", 200),
                new Order("Заказ 3", 150)
        );
    }

    private void displayOrders() {
        // Здесь можно добавить логику для фильтрации и сортировки заказов
        // Примерно так:
        // List<Order> filteredAndSortedOrders = filterAndSortOrders(orders);
        // for (Order order : filteredAndSortedOrders) {
        //     System.out.println(order);
        // }

        // Вместо фактической фильтрации и сортировки, мы просто отображаем все заказы
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    private static class Order {
        private String name;
        private int price;

        public Order(String name, int price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}