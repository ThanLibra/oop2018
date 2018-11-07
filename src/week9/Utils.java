package week9;

public class Utils {
   public static File findFileByName(String folderPath, String fileName) throws IOException {
        String[] paths;
        File fileChecked = new File(folderPath);
        paths = fileChecked.list();
        for (String path : paths) {
            if (path.equals(fileName)) return new File(folderPath + "\\" + fileName);
        }
        return null;

    }

    public static void writeContentToFile(String path, String string) throws IOException {
        DataInputStream fileChecked = new DataInputStream(new FileInputStream(path));

        DataOutputStream file = new DataOutputStream(new FileOutputStream(path));
        if (fileChecked.readLine() != null) {
            file.flush();
        }
        file.writeBytes(string);
        file.close();
        fileChecked.close();

    }


    public static String readContentFromFile(String path) throws IOException {

        DataInputStream in = new DataInputStream(new FileInputStream(path));
        String s = in.readLine();
        in.close();
        return s;

    }

    public static ArrayList<String> readAllContentFromFile(String path) throws IOException {

        DataInputStream in = new DataInputStream(new FileInputStream(path));
        ArrayList<String> strings = new ArrayList<>();
        String s;
        do {
            s = in.readLine();
            strings.add(s);
        } while (s != null);

        in.close();
        return strings;

    }

    public static void writeContentToFileIsConjunctive(String path, String string) throws IOException {

        DataOutputStream out = new DataOutputStream(new FileOutputStream(path));
        out.writeBytes(string);
        out.close();
    }

}
