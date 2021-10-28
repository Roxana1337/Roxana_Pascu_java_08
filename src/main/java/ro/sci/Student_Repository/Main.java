package ro.sci.Student_Repository;

public class Main {

    public static void main(String[] args) {

        Catalog studentCatalog = new Catalog();
        Catalog studentCatalogByLastName = new Catalog();
        studentCatalog.addStudent("Stefana", "Panaite", "18/11/1997", "f", "2971118226718");
        studentCatalog.addStudent("Vasile", "Ionescu", "12/06/2001", "m", "1010612224712");
        studentCatalog.addStudent("Mariana", "Andries", "07/02/2000", "M", "2000207221165");
        studentCatalog.listCatalog();
//        studentCatalog.deleteStudentByCNP("297111822678");
        studentCatalog.deleteStudentByCNP("2971118226718");
        studentCatalog.listCatalog();
        studentCatalog.listCatalogByLastName();


    }
}
