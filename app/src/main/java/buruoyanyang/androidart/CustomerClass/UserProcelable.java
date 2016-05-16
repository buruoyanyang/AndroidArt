package buruoyanyang.androidart.CustomerClass;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by xuhuanfeng on 16/5/16.
 */
public class UserProcelable implements Parcelable {
    public int userId;
    public String userName;
    public boolean isMale;

    public Book book;

    public UserProcelable(int userId, String userName, boolean isMale) {
        this.userId = userId;
        this.userName = userName;
        this.isMale = isMale;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        out.writeInt(userId);
        out.writeSerializable(userName);
        out.writeInt(isMale ? 1 : 0);
        out.writeParcelable(book, 0);
    }

    public static final Parcelable.Creator<UserProcelable> CREATOR = new Parcelable.Creator<UserProcelable>() {
        public UserProcelable createFromParcel(Parcel in) {
            return new UserProcelable(in);
        }

        public UserProcelable[] newArray(int size) {
            return new UserProcelable[size];
        }
    };

    private UserProcelable(Parcel in) {
        userId = in.readInt();
        userName = in.readString();
        isMale = in.readInt() == 1;
        book = in.readParcelable(Thread.currentThread().getContextClassLoader());
    }
}
