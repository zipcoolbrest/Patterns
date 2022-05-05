package decorator;

import adapter.User;

public class UserWriter implements Writer{
    User user;

    public UserWriter(User user){
        this.user = user;
    }

    public void write(){
        System.out.println(user.getName());
    }

}
