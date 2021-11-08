import java.util.Scanner;

abstract class Main extends Keys {
    public Main(String rquestion) {
        super(rquestion);
    }

    public static void main(String[] args) {
        Keys q;
        String possi;
        String newpossi;
        Scanner scan = new Scanner(System.in);

        System.out.println("Roll the die or Try the key?");
        possi = scan.nextLine();
        if (possi.equals("Roll the die")) {
            q = new Keys("What is the key?");
             newpossi = scan.nextLine();
            newpossi = answer;
            if (answer != q.getKey()) {
                System.out.println(q.isLocked());
            } else if (answer == q.getKey()) {
                System.out.println(q.unlock());
            }
        }






    }
}