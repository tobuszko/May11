package pl.wszib.edu.Collections.Zadanie5_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UserCollector {

    private Integer i=1;
    private Map<Integer, User> users = new HashMap();

    UserCollector(User user) {
        this.users.put(i, user);
        i++;
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public Map<Integer, User> getUsers() {
        return users;
    }

    public void setUsers(Map<Integer, User> users) {
        this.users = users;
    }

    public void addUser(User u){
        this.users.put(i,u);
        i++;
    }

    public void printUser(Integer i){
        System.out.println(users.get(i));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCollector that = (UserCollector) o;
        return Objects.equals(i, that.i) &&
                Objects.equals(users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, users);
    }


}
