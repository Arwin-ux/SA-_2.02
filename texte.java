import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class texte {
    int id;
    String chemin = "C:\\Users\\Juba Loudahi\\OneDrive - UPEC\\BUT1-Info\\S2\\SAE2.02\\App\\App\\src\\sujet1.txt";

    texte(int id, String chemin) {

    }

    public void extraire_texte() throws IOException {
        BufferedReader in;
        try {
            in = new BufferedReader(new FileReader(chemin));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}