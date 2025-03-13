import java.util.Scanner;

public class Terrain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double terrainWidth;
        double terrainLength;
        double squareMeter;

        System.out.print("Type the terrain width: ");
        terrainWidth = sc.nextDouble();

        System.out.print("Type the terrain length: ");
        terrainLength = sc.nextDouble();

        System.out.print("Type the square meter value: ");
        squareMeter = sc.nextDouble();

        double terrainArea = terrainLength * terrainWidth;

        System.out.printf("Terrain area = %.2f%n", terrainArea);

        double terrainPrice = terrainArea * squareMeter;

        System.out.printf("Terrain price = %.2f%n", terrainPrice);

        sc.close();

    }
}
