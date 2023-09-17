public class User_List
{
    static final Integer SIZE = 2;
    User[] user_list = new User[SIZE];
    User getUser_list(int index){
        return user_list[index];
    }
    int current_list_size = 0;
    Integer getCurrent_size_list(){
        return current_list_size;
    }
    void user_add(User new_user){
        boolean test_max_size = getCurrent_size_list().equals(SIZE);
        if(test_max_size){

            User[] new_list = new User[getCurrent_size_list() + SIZE];
            for(int i = 0; i < user_list.length; i++){
                new_list[i] = getUser_list(i);
            }
            user_list = new_list;
        }
        user_list[getCurrent_size_list()] = new_user;
        current_list_size++;
    }
    void user_removal(User user_to_removal){
        for(int i = 0; i < getCurrent_size_list(); i++)
        {
            boolean test_to_removal = user_to_removal == null || user_to_removal == getUser_list(i);
            if (test_to_removal)
            {
                user_to_removal_cal(i);
                break;
            }
            else
            {
                boolean test_null = user_to_removal == null || user_to_removal == null;
                if (test_null)
                {
                    user_to_removal_cal(i);
                    break;
                }
            }
        }
    }
    void user_to_removal_cal(int index){
        int initial_index = index + 1;
        for(int i = initial_index; i < getCurrent_size_list(); i++){
            int final_index = initial_index - 1;
            user_list[final_index] = user_list[initial_index];
        }
        current_list_size--;
        user_list[getCurrent_size_list()] = null;
    }
    void sort_list() {
        for(int i = 1; i< getCurrent_size_list(); i++)
        {
            User base_user = getUser_list(i);
            int base_index = i;

            while(base_index > 0)
            {
                int previus_index = base_index - 1;
                User previus_user = getUser_list(previus_index);

                boolean test_ahind_of = previus_user == null
                        || test_ahind_of(previus_user, base_user);
                if (test_ahind_of)
                {
                    user_list[base_index] = getUser_list(previus_index);
                    base_index--;
                }
                else {
                    break;
                }
                user_list[base_index] = base_user;
            }
        }
    }
    boolean test_ahind_of(User previus_user, User base_user){
        boolean valid_user = base_user != null;
        if (!valid_user)
        {
            return false;
        }
        return previus_user.getName().compareTo(base_user.getName()) > 0;
    }
    void print_list(){
        for(int i = 0; i < getCurrent_size_list(); i++){
            User user = getUser_list(i);

            boolean valid_user = user != null;
            if(valid_user){
                System.out.println("User " + i + ": " + user.getName());
            } else {
                System.out.println("unnamed.");
            }
        }
    }
}
