package Java_OOP_Seminar_5.HomeWork.model;

/**
 * Teacher
 */
public class Teacher {

    private Integer id;
    private String name;
    
    public Teacher(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}