public class SparseTableLab {
    public static void main(String[] args) {
        SparseTable registerTable = new SparseTable(8000, 300);
        registerTable.addRegistration(405, 35);
        System.out.println(registerTable.studentList[405].classId);
        registerTable.addRegistration(405, 30);
        System.out.println(registerTable.studentList[405].classId);
        System.out.println(registerTable.classList[35].studentId);
        registerTable.listAllClasses(405);
    }
}