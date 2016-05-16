package buruoyanyang.androidart.CustomerClass;

/**
 * Created by xuhuanfeng on 16/5/16.
 */
public class User {
    private static final long serialVersionUID = 519067123721295773L;
    public int userId;
    public String userName;
    public boolean isMale;

    public User(int userId, String userName, boolean isMale) {
        this.userId = userId;
        this.userName = userName;
        this.isMale = isMale;
    }
}
