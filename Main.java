import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        HumanNpc npc1 = new HumanNpc(1, (byte) 1,1);
        npc1.giveRaceAndGenderAndName();
        System.out.println(npc1.race + " " + npc1.gender + ", " + npc1.name);

        Weapon weapon = new Weapon();
        weapon.weaponInfo();



    }
}