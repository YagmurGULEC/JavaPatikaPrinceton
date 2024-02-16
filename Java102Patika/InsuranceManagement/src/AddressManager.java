public class AddressManager {
    public static void addAddress(User user, IAddress address) {
        user.addresses.add(address);
    }
    public static void removeAddress(User user, IAddress address) {
        user.addresses.remove(address);
    }
    public static void main(String[] args) {
        User user = new User("John Doe", "yg@gmail.com", "password", "Software Engineer", 25);
        IAddress businessAddress= new BusinessAddress("123 Main St", "San Francisco", "CA", "94122", "USA");
        addAddress(user, businessAddress);
        IAddress homeAddress= new Address("123 Main St", "San Francisco", "CA", "94122", "USA");
        addAddress(user, homeAddress);
        System.out.println(user);
        removeAddress(user, homeAddress);
        System.out.println(user);
    }
}
