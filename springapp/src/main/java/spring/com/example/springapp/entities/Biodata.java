package spring.com.example.springapp.entities;

public class Biodata {
    private long id;
    private String fname;
    private String lname;
    private int age;

    public Biodata() {
        super();
    }
    public Biodata(long id, String fname, String lname, int age) {
        super();
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Biodata{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }


}
