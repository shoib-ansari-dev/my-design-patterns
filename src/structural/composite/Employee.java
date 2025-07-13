package structural.composite;

public class Employee extends OrganizationComponent{
    private String position;

    public Employee(String name, String description, String position) {
        super(name, description);
        this.position = position;
    }
    @Override
    public void display(int indent) {
        System.out.println(" ".repeat(indent) + "- " + name + " (" + position + ")");
    }

}
