import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

//12.5. Exercício 01: Ordene a lista de alunos do arquivo
public class Exercise01
{
    public static void main(String[] args) throws IOException
    {
        Path file = Paths.get("/tmp/docs/name_list");
        List<String> users = Files.readAllLines(file);

        User_List user_list = new User_List();

        for(int i = 0; i < users.size(); i++)
        {
            String user_name = users.get(i);

            User  user = new User();
            user.setName(user_name);
            user_list.user_add(user);
        }

        List<String> sort_user_list = new ArrayList<String>();
        for(int i = 0; i < user_list.getCurrent_size_list(); i++)
        {
            User user = user_list.getUser_list(i);
            sort_user_list.add(user.getName());
        }
        Path new_file = Paths.get("/tmp/docs/sort_name_list.txt");
        Files.write(new_file, sort_user_list);
    }
}

