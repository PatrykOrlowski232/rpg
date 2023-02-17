import java.io.IOException;
import java.util.Random;


public class Weapon
{
    String objectData;
    String[] objectSplits;
    String name;
    String effectName;
    short damage;
    short weight;
    short eq;
    short price;

    boolean isMelee;


    public Weapon() throws IOException {

        objectData = Generator.objectGenerator("src/Weapon");
        objectSplits = objectData.split(";");

        name = objectSplits[0];



    }

    Random rnd = new Random();



    public void weaponPrice()
    {
        int priceMulitiplier = rnd.nextInt(3,6);
        this.price = (short) ((damage * priceMulitiplier) + (2 * damage) + (weight * 5));

    }





}