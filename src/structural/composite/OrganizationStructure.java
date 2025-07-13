package structural.composite;

public class OrganizationStructure {
    public static void main(String[] args) {
        Employee alice = new Employee("Alice", "Software Engineer", "Developer");
        Employee bob = new Employee("Bob", "Software Engineer", "AI Engineer");
        Employee charlie = new Employee("Charlie", "Software Engineer", "Architect");
        Employee dave = new Employee("Dave", "Designer", "UI/UX Designer");
        Employee eve = new Employee("Eve", "HR", "Recruiter");

        Department engineering = new Department("Engineering", "Handles all software development tasks");
        Department design = new Department("Design", "Responsible for UI/UX design");
        Department hr = new Department("HR", "Manages human resources and recruitment");

        // Return an exception
        try{
            alice.add(dave); // This will throw an exception because dave is not part of Department
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("\n");
        // Add employees to departments
        engineering.add(alice);
        engineering.add(bob);
        engineering.add(charlie);

        design.add(dave);

        hr.add(eve);

        Department headquarters = new Department("Headquarters", "Main office of the organization");
        headquarters.add(engineering);
        headquarters.add(design);
        headquarters.add(hr);

        System.out.println("=== Engineer Structure ===");
        engineering.display(0);

        System.out.println("\n\n=== Design Structure ===");
        System.out.println("=== Company Structure ===");
        headquarters.display(0);
    }
}
