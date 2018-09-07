    //This is a java program to check whether three points are collinear or not

    import java.util.Scanner;

     

    class Collinear_Points

    {

        public static void main(String args[])

        {

            Scanner scan = new Scanner(System.in);

            int x, y, x1, x2, y1, y2;

            x = scan.nextInt();

            y = scan.nextInt();

            x1 = scan.nextInt();

            x2 = scan.nextInt();

            y1 = scan.nextInt();

            y2 = scan.nextInt();

     

            /*

             * System.out.println("The Equation of the line is : (" + (y2 - y1) +

             * ")x+(" + (x1 - x2) + ")y+(" + (x2 * y1 - x1 * y2) + ") = 0");

             */

     

            int s = (y2 - y1) * x + (x1 - x2) * y + (x2 * y1 - x1 * y2);

            if (s < 0)

                System.out.println("no");

            else if (s > 0)

                System.out.println("no");

            else

                System.out.println("yes");

            scan.close();

        }

    }
