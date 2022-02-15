package horodovenko;

public
    class Square {

    private double side;

    public Square(double side){
        this.side = side;
    }

    public Square(){
        this(1.0);
    }

    public Square(Circle circle){
        this(Math.sqrt(circle.getArea()));
    }

    @Override
    public String toString() {
        return "Square[" + side + ']';
    }

    public double getSide() {
        return side;
    }

    public double getArea(){
        return side * side;
    }

    public double getDiagonal(){
        return Math.sqrt((side*side) + (side*side));
    }

    public double getPerimeter(){
        return 4 * side;
    }

    public Square getDoubled(){
        return new Square(side * 2);
    }

    public static double getTotalArea(Square[] sqs){
        double sum = 0.0;
        for(Square sq : sqs)
            sum += sq.getArea();
        return sum;
    }

    public static Square getMax(Square[] sqs){
        Square maxSq = sqs[0];
        for(Square sq : sqs)
            if(maxSq.getSide() < sq.getSide())
                maxSq = sq;
        return maxSq;
    }


    public Circle getInscribed(){
        return new Circle(side/2);
    }

    public Circle getCircumscribedCircle(){
        return  new Circle(getDiagonal()/2);
    }

}
