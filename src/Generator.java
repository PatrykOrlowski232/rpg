import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Generator
{












    public static int rollDice(int top)

    {    //metoda losująca liczbę "kostka"

        Random generator = new Random();
        int dice;
        dice = generator.nextInt(top);


        return (dice);

    }

    public static String objectGenerator(String filePath) throws FileNotFoundException , IOException {
        int line;
        File file = new File(filePath);
        Scanner in = new Scanner(file);

        int lineCount = (int) Files.lines(Paths.get(filePath), StandardCharsets.UTF_8).count();
        line = rollDice(lineCount);

        String object = null;

        for (int i = 1; i < line; i++)
            object = in.nextLine();



        return (object);
    }




}
