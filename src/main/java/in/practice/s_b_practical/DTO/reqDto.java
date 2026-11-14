package in.practice.s_b_practical.DTO;

public class reqDto {

    private int age;
    private int rollno;
    private String email;
    private String name;

    public reqDto() {
    }

    public reqDto(int age, int rollno, String email, String name) {
        this.age = age;
        this.rollno = rollno;
        this.email = email;
        this.name = name;
    }

    public reqDto(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
