

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student[] students=new Student[100];

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return false; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
        int n=students.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(students[i].getGr().equals(students[j]))
                {
                    Student st;
                    st=students[i+1];
                    students[i+1]=students[j];
                    students[j]=students[i+1];
                }
            }
        }

    }

    void removeStudent(String id) {
        // TODO:
        Student st = new Student();
        for(int i=0;i<students.length;i++)
        {
            if(students[i].getSid()==id)
            {
                students[i]=st;
                st=null;
            }
        }
    }

    public static void main(String[] args) {
        // TODO:
    }
}
