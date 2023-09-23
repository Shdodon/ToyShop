package Writer;

import java.io.IOException;
import java.io.FileWriter;

public class WriteFile {
    public WriteFile(){
    }
    public void FileWriter(String str){
        try(FileWriter writer = new FileWriter("Test.txt", true))
        {
            writer.write(str);
            writer.append('\n');
            writer.flush();
        } catch (IOException e) {
            System.out.println("Произошла ошибка записи в файл!");
        }
    }
}
