public enum Direction {

    EAST("E"){
        @override
        public Direction left(){
            return NORTH;
        }

        @Override
        public Direction right(){
            return SOUTH;
        }
    }, 

    WEST("W"){
        @override
        public Direction left(){
            return NORTH;
        }
        @override
        public Direction Right(){
            return SOUTH;
        }
    },

    NORTH("N"){
        @override
        public Direction left(){
            return NORTH;
        }
        @override
        public Direction Right(){
            return SOUTH;
        }
    },

    SOUTH("S"){
        @override
        public Direction left(){
            return NORTH;
        }
        @override
        public Direction Right(){
            return SOUTH;
        }
    };

    private String direction;

    Direction(String direction) {
        this.direction = direction;
    }

    public abstract Direction left();

    public abstract Direction right();

    public static Direction get(String directionSign) {
        switch (directionSign) {
            case "E":
                return EAST;
            case "W":
                return WEST;
            case "N":
                return NORTH;
            case "S":
                return SOUTH;
            default:
                throw new IllegalStateException("Unknown Direction Sign");
        }
    }

    @Override
    public String toString() {
        return direction;
    }


    
    
}