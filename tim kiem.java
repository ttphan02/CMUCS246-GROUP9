import java.util.ArrayList;
import java.util.List;
class Customer {
    private final String name;
    private final String id;
    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
class CustomerManager {
    private final List<Customer> customers;
    public CustomerManager() {
        customers = new ArrayList<>();
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public List<Customer> searchById(String id) {
        List<Customer> result = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                result.add(customer);
            }
        }
        return result;
    }
    public List<Customer> searchByName(String name) {
        List<Customer> result = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                result.add(customer);
            }
        }
        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        CustomerManager manager = new CustomerManager();
        // Thêm khách hàng
        manager.addCustomer(new Customer("Alia", "001"));
        manager.addCustomer(new Customer("Bob", "002"));
        // Tìm kiếm khách hàng theo ID
        List<Customer> resultsById = manager.searchById("001");
        System.out.println("ket qua tim kiem theo ID:");
        for (Customer result : resultsById) {
    System.out.println("Ten: " + result.getName() + ", ID: " + result.getId());
        }
        // Tìm kiếm khách hàng theo tên
        List<Customer> resultsByName = manager.searchByName("Bob");
        System.out.println("ket qua tim kiem theo ten:");
        for (Customer result : resultsByName) {
    System.out.println("Ten: " + result.getName() + ", ID: " + result.getId());
        }
    }
}
