package horodovenko;

public
    class Main {

    public static void main(String[] args) {
        {
            Square s2 = new Square(2);
            Square s1 = new Square();
            System.out.println(s2 + " " + s1);
            System.out.println("Side    " + s2.getSide());
            System.out.println("Area    " + s2.getArea());
            System.out.println("Diag    " + s2.getDiagonal());
            System.out.println("Perim   " + s2.getPerimeter());
            System.out.println("Doubled " + s2.getDoubled());
            Square[] sqs = {s1, s2, new Square(3)};
            System.out.println("Total area: " +
                    Square.getTotalArea(sqs));
            System.out.println("Greatest  : " +
                    Square.getMax(sqs));
        }
// ==================================================

        MyString ms = new MyString("abc");
        System.out.println(ms);
        ms.append(3, "def");
        System.out.println(ms);
        ms.insert(3, "ghi");
        System.out.println(ms);

//=======================================================
        Square[] sqs = {new Square(2), new Square(1),
                new Square(3), new Square(4)};
        for (Square s : sqs)
            System.out.print(s + " ");

        System.out.print("\nAreas: ");
        for (Square s : sqs)
            System.out.print(s.getArea() + " ");
        System.out.print("\nPerimeters: ");
        for (Square s : sqs)
            System.out.print(s.getPerimeter() + " ");

        Circle[] crs = {new Circle(2), new Circle(1),
                new Circle(3), new Circle(4)};
        Square[] squares = Circle.getSquares(crs);
        System.out.println( "\nAreas of squares " +
                "from circles: ");
        for (Square s : squares)
            System.out.printf("%.2f ", s.getArea());
        System.out.println();
    }

}
