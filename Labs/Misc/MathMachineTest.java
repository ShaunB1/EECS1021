package Misc;

public class MathMachineTest {
    public static void main(String[] args) {
        MathMachine billy = new MathMachine();

        billy.setClassesAttended(200);
        System.out.println(billy.getClassesAttended());

        billy.setClassesLate(3);
        System.out.println(billy.getClassesLate());

        billy.setClassesAbsent(7);
        System.out.println(billy.getClassesAbsent());

        System.out.println(billy.goodStandingCheck());

    }
}
