package cn.cache.pojo;


import java.util.Set;

public class Teacher {
    private int tid;
    private  String tname;
    private  int id;
    private Set<Teacher> teachers;
    public Teacher() {
    }

    public Teacher(int tid, String tname, int id, Set<Teacher> teachers) {
        this.tid = tid;
        this.tname = tname;
        this.id = id;
        this.teachers = teachers;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", id=" + id +
                ", teachers=" + teachers +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }




    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }
}
