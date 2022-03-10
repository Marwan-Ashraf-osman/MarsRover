
import java.util.ArrayList;
import java.util.Scanner;


public class Entry {
    public static void main(String[] args) {
        ArrayList<Rover> rovers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Grid grid = parseGrid(scanner.nextLine());
        while(scanner.hasNext()) {
            Rover rover = new Rover(grid, parsePosition(scanner.nextLine()));
            rovers.add(rover);
            rover.process(scanner.nextLine());
        }
        rovers.forEach(r -> System.out.println(r.getPosition()));
    }
}