package completableFuture.entity;

public class Employee {
    int id;

    public Employee(int id, String name, float sallery) {
        this.id = id;
        this.name = name;
        this.sallery = sallery;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSallery(float sallery) {
        this.sallery = sallery;
    }

    public String getName() {
        return name;
    }

    public float getSallery() {
        return sallery;
    }

    String name;
    float sallery;

}
