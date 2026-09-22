public class division_algorithm{
    public static void generateTable(int a, int b)
    {
        // Initializing the variables
        // first variable start as 1 0 0 1 and q initially starts as 0
        // u3 = a and v3 = b in gcd(a,b)
        int u1 = 1;
        int v1 = 0;
        int u2 = 0;
        int v2 = 1;
        int u3 = a;
        int v3 = b;
        int q = 0;

        System.out.println("u1 | v1 | u2 | v2 | u3 | v3 | q");
        System.out.println(u1 + " | " + v1 + " | " + u2 + " | " + v2 + " | " + u3 + " | " + v3 + " | " + q);
        // interate till v3 = 0
        while (v3 != 0)
        {
            // q is the greatest integer less than or equal to the quotient of the old u3 and v3
            q = u3 / v3;

            // ui = 1 0 0 1
            int currentU1 = u1;
            int currentU2 = u2;
            int currentU3 = u3;

            // new vi = current ui - (current q)(old vi)
            int newV1 = currentU1 - (q * v1);
            int newV2 = currentU2 - (q * v2);
            int newV3 = currentU3 - (q * v3);

            // the new ui = old vi
            u1 = v1;
            u2 = v2;
            u3 = v3;

            // the new vi = new calculated vi 
            v1 = newV1;
            v2 = newV2;
            v3 = newV3;

            // print out each iteration 
            System.out.println(u1 + " | " + v1 + " | " + u2 + " | " + v2 + " | " + u3 + " | " + v3 + " | " + q);

        }

        // gcd(a,b) = u3
        String gcdResult = "gcd(" + a + ", " + b + ") = " + u3;

        // a(u1) + b(u2) = u3
        String combination = a + "(" + u1 + ") + " + b + "(" + u2 + ") = " + u3;

        //print out the gcd and the combination formula 
        System.out.println(gcdResult);
        System.out.println(combination);
    }

    // pairs to use 
    public static void main(String[] args) {

        generateTable(512224, 132128);
        generateTable(5652768, 2671776);
        generateTable(17601969, 2364768);
    }
}