import java.util.ArrayList;
import java.util.List;

/**
 * @author Drumstyle92
 * class that contains the core of the program.
 */
public class Test {
    /**
     *
     * @param args Useful parameter for the functionality of the class.
     * Class where we have created lists,
     * students and recalled methods which give us all
     * the required parameters including the average of the students' grades.
     *             
     */
    public static void main(String[] args){
        // Lisa's votes
        List<Double> individualMarksListLisa = new ArrayList<>();
        individualMarksListLisa.add(4.2);
        individualMarksListLisa.add(9.9);
        // Jeremy's votes
        ArrayList<Integer> projectMarksListJeremy = new ArrayList<>();
        projectMarksListJeremy.add(6);
        projectMarksListJeremy.add(8);
        // Calling the average method
        double lisaAvg = Student.getAverageMark(individualMarksListLisa);
        double jeremyAvg = Student.getAverageMark(projectMarksListJeremy);
        // Lists and creation of students
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student(" Lisa "," Stuart ",lisaAvg));
        listOfStudents.add(new Student(" Jeremy "," Green ",jeremyAvg));

        System.out.println("---------------------------Student1-------------------------");
        System.out.println(listOfStudents.get(0));
        System.out.println("---------------------------Student2-------------------------");
        System.out.println(listOfStudents.get(1));
        System.out.println("------------------------------------------------------------");



    }
}
