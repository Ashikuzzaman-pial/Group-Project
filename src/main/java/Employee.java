public class Employee {
    private int id;
    private String name;
    private String contact;
    private String designation;
    private Factory factory;

    public Employee() {
    }

    public Employee(int id, String name, String contact, String designation, Factory factory) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.designation = designation;
        this.factory = factory;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getContact() { return contact; }
    public String getDesignation() { return designation; }
    public Factory getFactory() { return factory; }
}
