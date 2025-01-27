class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    void work() {
        System.out.println(name + " is working.");
    }
}

class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    void manage() {
        System.out.println(name + " is managing a team.");
    }
}

class ProjectManager extends Manager {
    public ProjectManager(String name) {
        super(name);
    }

    void createPlan() {
        System.out.println(name + " is creating a project plan.");
    }

    public static void main(String[] args) {
        ProjectManager pm = new ProjectManager("Alice");
        pm.work();
        pm.manage();
        pm.createPlan();
    }
}
