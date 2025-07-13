package structural.composite;

public abstract class OrganizationComponent {
    protected String name;
    protected String description;

    public OrganizationComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void add(OrganizationComponent component) {
        throw new UnsupportedOperationException("Cannot add to a leaf component");
    }
    public void remove(OrganizationComponent component) {
        throw new UnsupportedOperationException("Cannot remove from a leaf component");
    }
    public OrganizationComponent getChild(int index) {
        throw new UnsupportedOperationException("Cannot get child from a leaf component");
    }
    public String getName() {
        return name;
    }
    public abstract void display(int indent);
}
