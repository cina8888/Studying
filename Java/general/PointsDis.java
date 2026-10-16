import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class PointsDis {
    public static void main(String[] args) {
        ArrayList<Dymension2D> space = fileStream();
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter options: \n 1. Check nearest. \n 2. Check All distance under limit. \n Enter: ");
        choice = Integer.parseInt(input.next());
        if (choice == 1) {
            Double distance = Double.MAX_VALUE;
            String nearestP = null;
            int currPoint;
            System.out.print("Please enter points to check: P");
            currPoint = input.nextInt();
            Dymension2D target = space.get(currPoint);
            for (Dymension2D entry: space) {
                if(!entry.getPoint().equals(("P"+ currPoint))) {
                    double curDis = Dymension2D.distanct2Points(target, entry);
                    if (curDis < distance) {
                        distance = curDis;
                        nearestP = entry.getPoint();
                    }
                }
            }
            System.out.println("The nearest Point to " + "P" + currPoint + " is " + nearestP + " with distance " + distance);
        } else if (choice == 2) {
            double limitDis = Double.MAX_VALUE;
            ArrayList<String> arrLimit = new ArrayList<>();
            int currPoint;
            System.out.print("Please enter points to check: P");
            currPoint = input.nextInt();
            Dymension2D target = space.get(currPoint);
            System.out.print("Please enter limit distance to check: ");
            limitDis = input.nextDouble();
            for (Dymension2D entry: space) {
                if(!entry.getPoint().equals(("P"+ currPoint))) {
                    double curDis = Dymension2D.distanct2Points(target, entry);
                    if (curDis < limitDis) {
                        arrLimit.add(entry.getPoint());
                    }
                }
            }
            if (arrLimit.isEmpty()) {
                System.out.println("No points under distance " + limitDis);
            } else {
                System.out.println("All points under " + limitDis + " is " + String.join(", ", arrLimit));
            }
        }
        input.close();
    }
    public static ArrayList<Dymension2D> fileStream() {
        ArrayList<Dymension2D> space = new ArrayList<>();
        try {
            File fileF = new File("resources/points.txt");
            Scanner sc = new Scanner(fileF);
            String point;
            int x, y;
            while (sc.hasNext()) {
                point = sc.next();
                x = sc.nextInt();
                y = sc.nextInt();
                space.add(new Dymension2D(point, x, y));
            }
            sc.close();
            return space;
        } catch (IOException e) {
            System.out.println("File not found!");
            e.printStackTrace();
            return space;
        } 
    }
}

class Dymension2D {
    private int x, y;
    private String point;
    public Dymension2D(String point, int x, int y) {
        this.point = point;
        this.x = x;
        this.y = y;
    }

    public String getPoint() {return point;}
    public int getX() {return x;}
    public int getY() {return y;}

    public static double distanct2Points(Dymension2D p1, Dymension2D p2) {
        int dx = p2.x - p1.x;
        int dy = p2.y - p1.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}
