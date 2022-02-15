package horodovenko;

public
    class Circle {

    private double r;

    public Circle(double r){
        this.r = r;
    }

    public Circle(Square square){
        this(Math.sqrt(square.getArea()/Math.PI));
    }

    public double getRadius() {
        return r;
    }

    public double getArea(){
        return Math.PI * (r*r);
    }

    public double getPeremiter(){
        return Math.PI * r * 2;
    }

    @Override
    public String toString() {
        return "Circle[" + r + ']';
    }

    public Square getInscribed(){
        return new Square(getRadius() * Math.sqrt(2));
    }

    public Square getCircumscribedCircle(){
        return  new Square(2*r);
    }

    public static Square[] getSquares(Circle[] arr){
        Square[] sqa = new Square[arr.length];
        for(int i=0; i < arr.length; i++)
            sqa[i] = new Square(arr[i]);
        return sqa;
    }
}
