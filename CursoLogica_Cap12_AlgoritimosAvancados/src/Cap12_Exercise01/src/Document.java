import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Document
{
    private String file_directory;
    public String getFile_directory(){
        return file_directory;
    }
    public void setFile_directory(String file_directory){
        this.file_directory = file_directory;
    }

    int get_size() throws IOException{
        List<String> document = file_text();
        return document.size();
    }
    List<String> file_text() throws  IOException{
        Path file = Paths.get(getFile_directory());
        return Files.readAllLines(file);
    }
}
