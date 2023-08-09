import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try (FileWriter writer = new FileWriter("Hello.txt")) {
            writer.write("Махсун Кырмызгуль\n");
            writer.write("Belalim\n");
            writer.write("  YINE HASRETLI BIR GUNE,\n" +
                    "    GIRIYORUM HAYALINLE,\n" +
                    "   AKLIMDAN CIKMIYORSUN HIC.\n" +
                    "    BELALIM,\n" +
                    "    SENSIZ GECEN AKSAMLARDA\n" +
                    "    YINE BASIM BELALARDA,\n" +
                    "    MUTLU MUSUN ORALARDA\n" +
                    "   BELALIM......");
        } catch (IOException e) {
            System.out.println("ката");
        }
        FileReader fileReader = new FileReader("Hello.txt");
        Scanner scanner = new Scanner(fileReader);
        Song song = new Song();
        song.setAuthot(scanner.nextLine()+"\n");
        song.setTitle(scanner.nextLine()+"\n");
        song.setText(scanner.nextLine());
        System.out.println(song);
        while (scanner.hasNextLine())
            System.out.println(scanner.nextLine());

    }
}

