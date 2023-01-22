package PatternPrograms;

/**
 * Pattern Programming Technique:
 *
 * 1. Outer Loop are for rows i.e., number of lines.
 * 2. Inner loop are for columns i.e., number of columns and
 *    connect them to the rows
 * 3. Always do any print operation inside inner loop.
 * 4. Observe Symmetry (Not for all - optional)
 *
 */
public class Pattern {
    public static void main(String[] args) {
        int n = 6;

        System.out.println("Printing Pattern-1: ");
        Pattern1 p1 = new Pattern1();
        p1.printPattern(n);
        System.out.println();

        System.out.println("Printing Pattern-2: ");
        Pattern2 p2 = new Pattern2();
        p2.printPattern(n);
        System.out.println();

        System.out.println("Printing Pattern-3: ");
        Pattern3 p3 = new Pattern3();
        p3.printPattern(n);
        System.out.println();

        System.out.println("Printing Pattern-4: ");
        Pattern4 p4 = new Pattern4();
        p4.printPattern(n);
        System.out.println();

        System.out.println("Printing Pattern-5: ");
        Pattern5 p5 = new Pattern5();
        p5.printPattern(n);
        System.out.println();

        System.out.println("Printing Pattern-6: ");
        Pattern6 p6 = new Pattern6();
        p6.printPattern(n);
        System.out.println();

        System.out.println("Printing Pattern-7: ");
        Pattern7 p7 = new Pattern7();
        p7.printPattern(n);
        System.out.println();

        System.out.println("Printing Pattern-8: ");
        Pattern8 p8 = new Pattern8();
        p8.printPattern(n);
        System.out.println();

        System.out.println("Printing Pattern-9 (Combination of 7 & 8): ");
        Pattern9 p9 = new Pattern9();
        p9.printPattern(n);
        System.out.println();

        System.out.println("Printing Pattern-10: ");
        Pattern10 p10 = new Pattern10();
        p10.printPattern(n);


        System.out.println("Printing Pattern-11: ");
        Pattern11 p11 = new Pattern11();
        p11.printPattern(n);
        System.out.println();

        System.out.println("Printing Pattern-12: ");
        Pattern12 p12 = new Pattern12();
        p12.printPattern(n);
        System.out.println();

        System.out.println("Printing Pattern-13: ");
        Pattern13 p13 = new Pattern13();
        p13.printPattern(n);
        System.out.println();

        System.out.println("Printing Pattern-14: ");
        Pattern14 p14 = new Pattern14();
        p14.printPattern(n);
        System.out.println();

        System.out.println("Printing Pattern-15: ");
        Pattern15 p15 = new Pattern15();
        p15.printPattern(n);
        System.out.println();

        System.out.println("Printing Pattern-16: ");
        Pattern16 p16 = new Pattern16();
        p16.printPattern(n);
        System.out.println();

        System.out.println("Printing Pattern-17: ");
        Pattern17 p17 = new Pattern17();
        p17.printPattern(n);
        System.out.println();

        System.out.println("Printing Pattern-18: ");
        Pattern18 p18 = new Pattern18();
        p18.printPattern(n);
        System.out.println();

        System.out.println("Printing Pattern-19: ");
        Pattern19 p19 = new Pattern19();
        p19.printPattern(n);
        System.out.println();

        System.out.println("Printing Pattern-20: ");
        Pattern20 p20 = new Pattern20();
        p20.printPattern(n);
        System.out.println();

        System.out.println("Printing Pattern-21: ");
        Pattern21 p21 = new Pattern21();
        p21.printPattern(n);
        System.out.println();

        System.out.println("Printing Pattern-22: ");
        Pattern22 p22 = new Pattern22();
        p22.printPattern(n);
        System.out.println();

        System.out.println("Printing Pattern-23: ");
        Pattern23 p23 = new Pattern23();
        p23.printPattern('f');
        System.out.println();
    }
}
