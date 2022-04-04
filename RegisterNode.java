import java.util.Objects;

public class RegisterNode {
    public int studentId;
    public int classId;
    public double grade;
    public RegisterNode nextStudent;
    public RegisterNode nextClass; 

    public RegisterNode() {
        this(0, 0, 4.0, null, null);
    }

    public RegisterNode(int studentId, int classId, double grade, RegisterNode nextStudent, RegisterNode nextClass) {
        this.studentId = studentId;
        this.classId = classId;
        this.grade = grade;
        this.nextStudent = nextStudent;
        this.nextClass = nextClass;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getClassId() {
        return this.classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 4.0) {
            this.grade = grade;
        }
    }

    public RegisterNode getNextStudent() {
        return this.nextStudent;
    }

    public void setNextStudent(RegisterNode nextStudent) {
        this.nextStudent = nextStudent;
    }

    public RegisterNode getNextClass() {
        return this.nextClass;
    }

    public void setNextClass(RegisterNode nextClass) {
        this.nextClass = nextClass;
    }

    public RegisterNode studentId(int studentId) {
        setStudentId(studentId);
        return this;
    }

    public RegisterNode classId(int classId) {
        setClassId(classId);
        return this;
    }

    public RegisterNode grade(double grade) {
        setGrade(grade);
        return this;
    }

    public RegisterNode nextStudent(RegisterNode nextStudent) {
        setNextStudent(nextStudent);
        return this;
    }

    public RegisterNode nextClass(RegisterNode nextClass) {
        setNextClass(nextClass);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RegisterNode)) {
            return false;
        }
        RegisterNode registerNode = (RegisterNode) o;
        return studentId == registerNode.studentId && classId == registerNode.classId && grade == registerNode.grade && Objects.equals(nextStudent, registerNode.nextStudent) && Objects.equals(nextClass, registerNode.nextClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, classId, grade, nextStudent, nextClass);
    }

    @Override
    public String toString() {
        return "{" +
            " studentId='" + getStudentId() + "'" +
            ", classId='" + getClassId() + "'" +
            ", grade='" + getGrade() + "'" +
            ", nextStudent='" + getNextStudent() + "'" +
            ", nextClass='" + getNextClass() + "'" +
            "}";
    }

}