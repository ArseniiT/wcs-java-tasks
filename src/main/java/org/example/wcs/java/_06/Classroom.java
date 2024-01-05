package org.example.wcs.java._06;


public class Classroom {
    public static void main(String[] args) {
        Wilder wilder1 = new Wilder("Gabriel", true);
        Wilder wilder2 = new Wilder("Jade", true);
        Wilder wilder3 = new Wilder("Alba", false);

        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
        System.out.println(wilder3.whoAmI());
    }
}
