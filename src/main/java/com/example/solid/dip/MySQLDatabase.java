public class MySQLDatabase {
    public void saveOrder() {
        System.out.println("Guardando pedido en MySQL...");
    }
}

class OrderProcessor {
    private MySQLDatabase database;

    public OrderProcessor() {
        this.database = new MySQLDatabase();
    }

    public void processOrder() {
        System.out.println("Procesando pedido...");
        database.saveOrder();
    }
}