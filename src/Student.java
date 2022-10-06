import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author Drumstyle92
 * class of students.
 */
public class Student {

    String StudentName;
    String StudentSurname;
    double marksAverage;

    /**
     *
     * @param name student's name.
     * @param surname student's surname.
     * @param average grade average.
     *  Student class constructor.
     */
    Student(String name, String surname, double average) {
        this.StudentName = name;
        this.StudentSurname = surname;
        this.marksAverage = average;
    }

    /**
     *
     * @param listOfMarks List of votes.
     * @return The grade point average.
     * method used to average the marks.
     */
    public static double getAverageMark(@NotNull List<? extends Number > listOfMarks) {

        return (listOfMarks.get(0).doubleValue() + listOfMarks.get(1).doubleValue()) / 2.0;
    }

    /**
     *
     * @return Output of all parameters of the Student class.
     * very effective method for printing later.
     */
    @Override
    public String toString() {
        return "Student{" +
                "\nStudentName='" + StudentName + '\'' +
                "\n StudentSurname='" + StudentSurname + '\'' +
                "\n marksAverage=" + marksAverage +
                '}';
    }
}

