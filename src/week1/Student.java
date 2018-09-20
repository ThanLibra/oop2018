

public class Student {


    private String n;
    private String sid;
    private String em;
    private String gr;
    public String getGr() {
        return gr;
    }

    public void setGr(String gr) {
        this.gr = gr;
    }


    // TODO: khai báo các thuộc tính cho Student

    // TODO: khai báo các phương thức getter, setter cho Student

    /**
     * Constructor 1
     */
    Student() {
        // TODO:
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
    }

    String getInfo() {
        // TODO:
        return this.n + "\n" + this.sid + "\n" + this.em; // xóa dòng này sau khi cài đặt
    }


    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getEm() {
        return em;
    }

    public void setEm(String em) {
        this.em = em;
    }

}

