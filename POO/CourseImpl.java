import javax.swing.*;
public class CourseImpl {
	/** Main method */
	public static void main(String[] args) {

int opc = 0;
Course curso1 = null;
    do{
         opc = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU"
        + "\n1: Crear curso"
        + "\n2: Agregar estudiante"
        + "\n3: Eliminar estudiante"
        + "\n4: Mostrar estudiantes"
        + "\n5: Mostrar numero de estudiantes "));


        switch(opc){
          case 1:
          //crear curso
					curso1 = new Course(JOptionPane.showInputDialog(null,"Ingrese el nombre de la materia"));
          break;
          case 2:
          //agregar estudiantes
					curso1.addStudent(JOptionPane.showInputDialog(null,"Ingrese el nombre del alumno"));
          break;
          case 3:
          //eliminar estudiantes
					curso1.dropStudent(JOptionPane.showInputDialog(null,"Ingrese el alumno a eliminar"));
          break;
          case 4:
          //mostrar estudiantes
					String[] studentsIngles = curso1.getStudents();
					JOptionPane.showMessageDialog(null,"\nThe students in the course " + curso1.getCourseName() + ":");
					JOptionPane.showMessageDialog(null,studentsIngles);
          break;
          case 5:
          //mostrar numero de estudiantes
					JOptionPane.showMessageDialog(null,"Number of students in " + curso1.getCourseName() + ": " + curso1.getNumberOfStudents());
				//	System.out.println("Number of students in course1: "
				//		+ course1.getNumberOfStudents());
					studentsIngles = curso1.getStudents();
					//for (int i = 0; i < curso1.getNumberOfStudents(); i++)
					//JOptionPane.showMessageDialog(null,studentsIngles);
					//	System.out.print(studentsIngles[i] + ", ");
          break;
          default:
          //Mensaje de elija opcion correcta
					JOptionPane.showMessageDialog(null,"Que no estas viendo pendejo? Son del 1 al 5!");
          break;
        }
			}while (opc <= 5);




		// Create a course
//Course curso1 = new Course("Ingles");
		// Add three students
	//	curso1.addStudent("Kevin");
	//	curso1.addStudent("Samuel");
	//	curso1.addStudent("Angel");

		// remove one student
		//curso1.dropStudent("");

		// Displays the students in the course
  /*  JOptionPane.showMessageDialog(null,"\nThe students in the course " + curso1.getCourseName() + ":");
		String[] studentsIngles = curso1.getStudents();
    //String students = "";
		//for (int i = 0; i < curso1.getNumberOfStudents(); i++) {
    //  students += studentsIngles[i] + "\n";
  //}
  JOptionPane.showMessageDialog(null, studentsIngles);
//curso1.dropStudent(JOptionPane.showInputDialog(null,"Ingrese el alumno a eliminar"));
//curso1.dropStudent("Samuel");
//for (int i = 0; i < curso1.getNumberOfStudents(); i++) {
studentsIngles = curso1.getStudents();
JOptionPane.showMessageDialog(null, studentsIngles);
//}
Course curso2 = new Course("Programacion");
// Add three students
curso2.addStudent("Leo");
curso2.addStudent("Yessua");
curso2.addStudent("David");
JOptionPane.showMessageDialog(null,"\nThe students in the course " + curso2.getCourseName() + ":");
String[] studentsProgramacion = curso2.getStudents();
JOptionPane.showMessageDialog(null, studentsProgramacion);   */

		}
}
