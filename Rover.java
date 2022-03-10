public class Rover{
    private Position Position;
    private Grid grid;
}

public Rover(Grid grid, Position Position){
    this.grid = grid;
    this.Position=Position;
}
public Position getposition(){
    return Position;
}
public void process(String instructions){
    instructions.chars().mapToObj( c -> (char) c ).forEach(this::process)
}

public void process(Character instruction){
    switch (instruction) {
        case 'R':
        turnRight();
         break;

         case'L':
         turnLeft();
         break;

         case'M':
         move();
         break;
    
        
    }
}

private void move(){
    if(grid.isValidMove(position.moveAhead)){
        position= Position.moveAhead();
    }
}

private void turnRight(){
    Position = Position.rotateRight();
}

private void turnleft(){
    Position = Position.rotateLeft();
}


public String toString(){
    return position.toString();
}