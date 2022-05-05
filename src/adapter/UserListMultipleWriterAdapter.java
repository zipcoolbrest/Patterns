package adapter;

import java.util.List;

public class UserListMultipleWriterAdapter implements MultipleWriterAdapter{
    List<User> userList;

    public UserListMultipleWriterAdapter (List<User> userList){
        this.userList = userList;
    }

    @Override
    public String getByIndex(int index) {
        User u = userList.get(index);
        return u.getName() + " " + u.getSurname();
    }

    @Override
    public int getCount() {
        return userList.size();
    }
}
