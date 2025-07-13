package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a department in an organization, which can contain other components like employees or sub-departments.
 * This is composite pattern where a department can have multiple components (employees or other departments).
 */
public class Department extends OrganizationComponent{
    private List<OrganizationComponent> componentList = new ArrayList<>();

    public Department(String name, String description) {
        super(name, description);
    }

    @Override
    public void add(OrganizationComponent component) {
        componentList.add(component);
    }
    @Override
    public void remove(OrganizationComponent component) {
        componentList.remove(component);
    }
    @Override
    public OrganizationComponent getChild(int index) {
        return componentList.get(index);
    }
    @Override
    public void display(int indent) {
        System.out.println(" ".repeat(indent) + "Department: " + name + " - " + description);
        for (OrganizationComponent component : componentList) {
            component.display(indent + 2);
        }
    }
}
