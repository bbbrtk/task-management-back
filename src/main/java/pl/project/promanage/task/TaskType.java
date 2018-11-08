package pl.project.promanage.task;

public enum TaskType {
    MEETING("MEETEING"),
    DEVELOPMENT("DEVELOPMENT");

    private String name;

    TaskType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
