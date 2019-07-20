package structural.flyweight;

public class Client {
    public static void main(String[] args) {
        ChessFlyWeight chessFlyWeight = ChessFlyWeightFactory.getChess("黑色");
        ChessFlyWeight chessFlyWeight2 = ChessFlyWeightFactory.getChess("黑色");

        System.out.println(chessFlyWeight);
        System.out.println(chessFlyWeight2);

        chessFlyWeight.display(new Coordinate(1,3));
        chessFlyWeight2.display(new Coordinate(2,4));
    }
}
