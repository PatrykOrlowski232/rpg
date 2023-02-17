import java.io.IOException;
import java.util.Random;


public class Weapon
{
    String objectData;
    String[] objectSplits;
    String name;
    String effectName;
    int damage;
    short weight;
    short eq;
    short price;

    boolean isMelee;


    public Weapon() throws IOException {

        objectData = Generator.objectGenerator("src/Weapon");
        objectSplits = objectData.split(";");

        name = objectSplits[0];
        isMelee = Boolean.parseBoolean(objectSplits[1]);
        weight = Short.parseShort(objectSplits[2]);

        damage = rnd.nextInt(Integer.parseInt(objectSplits[3]),Integer.parseInt(objectSplits[4]));

        int priceMulitiplier = rnd.nextInt(3,6);
        price = (short) ((damage * priceMulitiplier) + (2 * damage) + (weight * 5));

    }

    Random rnd = new Random();




    public void weaponInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("IsMelee: " + isMelee);
        System.out.println("Weigth: " + weight);
        System.out.println("DMG: " + damage);
        System.out.println("Price: " + price);
    }



}