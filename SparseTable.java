public class SparseTable {
    public RegisterNode[] studentList; // List of Student pointers
    public RegisterNode[] classList; // List of Class pointers

    public SparseTable(int no_students, int no_classes) {
        studentList = new RegisterNode[no_students];
        classList = new RegisterNode[no_classes];
    }

    public void addRegistration(int studentId, int classId) {
        RegisterNode newNode = new RegisterNode(studentId, classId, -1, null, null);
        if (studentList[studentId] == null || classId < studentList[studentId].classId) {
            newNode.nextClass = studentList[studentId];
            studentList[studentId] = newNode;
        } else {
            RegisterNode c;
            for (c = studentList[studentId]; c.nextClass != null && c.nextClass.classId < classId; c = c.nextClass);
            newNode.nextClass = c.nextClass;
            c.nextClass = newNode;
        }

        if (classList[classId] == null || studentId < classList[classId].studentId) {
            newNode.nextStudent = classList[classId];
            classList[classId] = newNode;
        } else {
            RegisterNode s;
            for (s = studentList[studentId]; s.nextClass != null && s.nextClass.classId < classId; s = s.nextClass);
            newNode.nextClass = s.nextClass;
            s.nextClass = newNode;
        }
    }
    public void listAllClasses(int studentId) {
        for (RegisterNode i = studentList[studentId]; i != null; i = i.nextClass) {
            System.out.print(i.classId + " ");
        }
        System.out.println();
    }
}
