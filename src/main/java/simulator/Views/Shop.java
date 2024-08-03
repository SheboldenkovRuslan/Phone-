package simulator.Views;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.util.stream.Stream;

public class Shop extends Eldorado
{
    private String comp;
    static boolean count = false;

    static Shop shop = new Shop();
    static Scanner input = new Scanner(System.in);

    public static void AddPc(String comp){
        try (FileWriter writer = new FileWriter("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\shop.txt", true))
        {
            writer.write(comp);
            writer.append('\n');
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }

    }



    public static Object DeletePc(String comp) throws IOException {

        Path put = Paths.get("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\shop.txt");
        Path temp = Files.createTempFile("shop", ".txt");
        Stream<String> lines = Files.lines(put);
        try (BufferedWriter writer = Files.newBufferedWriter(temp))
        {
            String finalComp = comp;
            lines
                    .filter(line -> !line.startsWith(finalComp))
                    .forEach(line ->
                    {
                        try
                        {
                            writer.write(line);
                            writer.newLine();
                        } catch (IOException e)
                        {
                            throw new RuntimeException(e);
                        }
                    });

        }
        Files.move(temp, put, StandardCopyOption.REPLACE_EXISTING);

        return comp;
    }

}
