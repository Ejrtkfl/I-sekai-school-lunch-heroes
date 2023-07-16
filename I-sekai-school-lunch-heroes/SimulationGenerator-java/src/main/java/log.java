import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class log {

    public static StringBuilder logBuilder = new StringBuilder();

    public static void logging(int tick){
        StringBuilder log = new StringBuilder();
        log.append(String.format("t:%d\n",tick));
        for (String key : DataSlot.LocationHMAL.keySet()){
            if(DataSlot.LocationHMAL.get(key)!=null){
                for (String value : DataSlot.LocationHMAL.get(key)){
                    log.append(String.format("%s:%s\n",key,value));
                }
            }
        }
        logBuilder.append(log);
    }

    public static void saveFile(){
        try {
            File file = new File("C:\\Users\\rice\\OneDrive\\바탕 화면\\Github\\log.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(logBuilder.toString());
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
