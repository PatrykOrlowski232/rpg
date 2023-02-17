import java.util.Random;

public class HumanNpc
{
    String race;
    String name;
    String gender;
    int hp;
    byte level;
    int eq;
    int currentHp;

    public HumanNpc(int hp, byte level, int eq)
    {
        this.hp = hp;
        this.level = level;
        this.eq = eq;
    }

    public void giveRaceAndGenderAndName()
    {
        Random rnd = new Random();

        String[] races = {"Human", "Orc", "Dwarf", "High Elf", "Dark Elf", "Gnome", "Goblin"};
        int npcRace = rnd.nextInt(races.length);
        this.race = races[npcRace];

        String[] genders = {"male", "female"};
        int npcGender = rnd.nextInt(genders.length);
        this.gender = genders[npcGender];

        switch (npcRace)
        {
            case 0 ->
            {
                if (npcGender == 1)
                {
                    String[] humanNamesMale = {"Risto", "Kastor", "Chayne", "Elman", "Rawly", "Kayden", "Jaime", "Arminius", "Devyn", "Kilby", "Alger"};
                    int npcName = rnd.nextInt(humanNamesMale.length);
                    this.name = humanNamesMale[npcName];
                }
                else
                {
                    String[] humanNamesFemale = {"Sorren", "Laci", "Gesa", "Effi", "Bette", "Loren", "Ynes", "Odette", "Hyette", "Aubine", "Winona"};
                    int npcName = rnd.nextInt(humanNamesFemale.length);
                    this.name = humanNamesFemale[npcName];
                }
            }
            case 1 ->
            {
                if (npcGender == 1)
                {
                    String[] orcNamesMale = {"Wrukaog", "Zorhgigoth", "Komarod", "Bruigig", "Urulg", "Zuhgan", "Nahgigoth", "Vrogak", "Knaraugh", "Naghig"};
                    int npcName = rnd.nextInt(orcNamesMale.length);
                    this.name = orcNamesMale[npcName];
                }
                else
                {
                    String[] orcNamesFemale = {"Urog", "Dulug", "Bolar", "Durgat", "Yotul", "Shel", "Uloth", "Durgat", "Ushug"};
                    int npcName = rnd.nextInt(orcNamesFemale.length);
                    this.name = orcNamesFemale[npcName];
                }
            }
            case 2 ->
            {
                if (npcGender == 1)
                {
                    String[] dwarfNamesMale = {"Rughil", "Bhagnaem", "Duritur", "Daretret", "Hostud", "Gimmut", "Nurgit", "Kilick", "Ulid", "Haznir"};
                    int npcName = rnd.nextInt(dwarfNamesMale.length);
                    this.name = dwarfNamesMale[npcName];
                }
                else
                {
                    String[] dwarfNamesFemale = {"Fotmouthra", "Hastrebena", "Herdaeda", "Thirdoula", "Muleni", "Barireana", "Elnwitryd", "Gozilyn", "Moradrid"};
                    int npcName = rnd.nextInt(dwarfNamesFemale.length);
                    this.name = dwarfNamesFemale[npcName];
                }
            }
            case 3 ->
            {
                if (npcGender == 1)
                {
                    String[] highElfNamesMale = {"Keleart", "Cadhainn", "Faelobhar", "Eogaon", "Eamairian", "Faelenam", "Maodhenam", "Hinteal", "Faelos"};
                    int npcName = rnd.nextInt(highElfNamesMale.length);
                    this.name = highElfNamesMale[npcName];
                }
                else
                {
                    String[] highElfNamesFemale = {"Eilaoine", "Cealline", "Muiranon", "Aestirne", "Takinita", "Ailanne", "Donaith", "Soraith", "Taerane", "Agala"};
                    int npcName = rnd.nextInt(highElfNamesFemale.length);
                    this.name = highElfNamesFemale[npcName];
                }
            }
            case 4 ->
            {
                if (npcGender == 1)
                {
                    String[] darkElfNamesMale = {"Sordir", "Unulva", "Ghurasi", "Ibiksho", "Ivreth", "Uthryrn", "Thymlui", "Thacmic", "Abelri", "Detrai", "Undres"};
                    int npcName = rnd.nextInt(darkElfNamesMale.length);
                    this.name = darkElfNamesMale[npcName];
                }
                else
                {
                    String[] darkElfNamesFemale = {"Imrui", "Anvanu", "Iradh", "Syvi", "Kidnui", "Nendiol", "Inrare", "Hudoli", "Qedore", "Mukhibi", "Himuci"};
                    int npcName = rnd.nextInt(darkElfNamesFemale.length);
                    this.name = darkElfNamesFemale[npcName];
                }
            }
            case 5 ->
            {
                if (npcGender == 1)
                {
                    String[] gnomeNamesMale = {"Sator", "Ronfiz", "Umni", "Ormop", "Yewor", "Valben", "Jetor", "Gator", "Hismin"};
                    int npcName = rnd.nextInt(gnomeNamesMale.length);
                    this.name = gnomeNamesMale[npcName];
                }
                else
                {
                    String[] gnomeNamesFemale = {"Folli", "Tafi", "Minfi", "Weldysa", "Helfi", "Banfi", "Tribi", "Banmila"};
                    int npcName = rnd.nextInt(gnomeNamesFemale.length);
                    this.name = gnomeNamesFemale[npcName];
                }
            }
            case 6 ->
            {
                if (npcGender == 1)
                {
                    String[] goblinNamesMale = {"Zrakx", "Klaz", "Azut", "Kog", "Xekx", "Ilx", "Terk", "Plirx", "Gaq", "Rulb", "Brabs"};
                    int npcName = rnd.nextInt(goblinNamesMale.length);
                    this.name = goblinNamesMale[npcName];
                }
                else
                {
                    String[] goblinNamesFemale = {"Guisha", "Blel", "Presh", "Ulm", "Jigia", "Jixa", "Irx"};
                    int npcName = rnd.nextInt(goblinNamesFemale.length);
                    this.name = goblinNamesFemale[npcName];
                }
            }
        }
    }
}









