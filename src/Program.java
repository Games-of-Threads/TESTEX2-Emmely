import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Welcome to the triangle calculator:");


        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.print("A: ");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.print("B: ");
            int b = Integer.parseInt(scanner.nextLine());


            System.out.print("C: ");
            int c = Integer.parseInt(scanner.nextLine());

            Triangle t = new Triangle(a, b, c);
            System.out.println(t.AmITriangle());
            System.out.println(t.CalculateTriangleType());

            System.out.print("exit w q");

            String input = scanner.nextLine();

            if (doExit(input)) {
                System.out.println("Exit!");
                break;
            }
        }
        scanner.close();

    }

    private static boolean doExit(String input) {
        return "q".equals(input);
    }
}
