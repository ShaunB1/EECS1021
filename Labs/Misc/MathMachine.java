package Misc;

// This class will be tested
public class MathMachine {

    // local variables
    static int classesAttended;         // +1 each: Worth 1 Positive point
    static int classesLate;             // +2/3 each: Worth 2/3 positive points
    static int classesAbsent;           // -1 each: Worth 1 Negative point

    // Constructor Initializes the class and sets the appropriate initial values
    public  MathMachine() {
        this.classesAttended = 0;   // Initializes the class attendance to 0
        this.classesLate = 0;       // Initializes the classes attended late to 0
        this.classesAbsent = 0;     // Initializes the classes missed to 0
    }

    // make changes below here.
    // --------------------------------------------------
    // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv

    // Operation: Increase Attendance
    // This is used increase the attendance count
    // Modify between { and }. You don't need a return line for this function
    public static void setClassesAttended(int newAttendance)
    {
        classesAttended = newAttendance;
    }

    // Operation: Return Attendance
    // This is used to return attendance
    // Modify between { and }. You need a return line for this function
    public int getClassesAttended()
    {
        return classesAttended; //MODIFY CODE
    }

    // Operation: Increase Late Attendance
    // This is used increase the late attedance count
    // Modify between { and }. You don't need a return line for this function
    public static void setClassesLate(int newLateAttendance)
    {
        classesLate = newLateAttendance;
    }

    // Operation: Return Late Attendance
    // This is used to return late attendance count
    // Modify between { and }. You don't need a return line for this function
    public int getClassesLate()
    {
        return classesLate; //MODIFY CODE

    }

    // Operation: Increase Late Attendance
    // This is used increase the late attedance count
    // Modify between { and }. You don't need a return line for this function
    public static void setClassesAbsent(int newAbsent)
    {
        classesAbsent = newAbsent;
    }

    // Operation: Return Late Attendance
    // This is used to return late attendance count
    // Modify between { and }. You don't need a return line for this function
    public int getClassesAbsent()
    {
        return classesAbsent; //MODIFY CODE
    }

    // Operation: Good Standing Check
    // This is used to check the standing of the student
    // Modify between { and }. You don't need a return line for this function
    public boolean goodStandingCheck()
    {
        /* A student in good standing  requires 90% "unblemished" attendances.  Points are
         * calculated as follows:
         *   Present: 1 point addition
         *   Late: 2/3 of a positive point addition
         *   Absent: 1 point reduction.
         *
         *   If a student has 90% or more as a ratio of positive days to all days then they're in
         *   good standing.
         */

        double points = classesAttended + (2/3) * classesLate - classesAbsent;
        System.out.println(points);
        double total = classesAttended + classesLate + classesAbsent;
        System.out.println(total);
        double score = points/total;
        System.out.println(score);
        return (double)points/total > 0.9;

    }

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    // ---------------------------------------------------
    // make changes above here.
}
