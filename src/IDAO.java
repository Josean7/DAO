/**
 * Created by Josean on 24/03/2017.
 */
public interface IDAO {

    public boolean insertUserDB(String id, String name, String pw);
    public void updateuser(String id, String newId, String newName, String newPw);
    public void selectuser (String id);
    public void selectAllUsersDB();
    public void deleteuser(String id);

}
