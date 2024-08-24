interface Role{
    public String getRoleName();

    public String getResponsibility();
}

class CEO implements Role{
    public String getRoleName(){
        return "CEO";
    }

    public String getResponsibility(){
        return "Cheif Executive Officer";
    }
}

class Manager{
    public String getRoleName(){
        return "Manager";
    }

    public String getResponsibility(){
        return "Management";
    }
}


class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class Employee {
    private String name;
    private String role;

    
    public Employee(String name) {
        this.name = name;
        this.role = "Employee"; 
    }

    public void promoteToManager() {
        this.role = "Manager";
        System.out.println(this.name + " has been promoted to Manager.");
    }

    public void promoteToCeo() throws CustomException {
        if (this.role.equals("Manager")) {
            this.role = "CEO";
            System.out.println(this.name + " has been promoted to CEO.");
        } else {
            throw new CustomException(this.name + " cannot be promoted to CEO directly.");
        }
    }

}


public class question3{
    public static void main(String[] args) {
        try {
            
            Employee emp1 = new Employee("Ram");
            Employee emp2 = new Employee("Akash");

            
            emp1.promoteToManager();

            
            emp2.promoteToCeo();
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }

        
        try {
            Employee emp2 = new Employee("Akash");

           
            emp2.promoteToManager();

           
            emp2.promoteToCeo();
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}