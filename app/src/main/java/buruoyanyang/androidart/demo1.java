package buruoyanyang.androidart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import buruoyanyang.androidart.CustomerClass.User;

public class demo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo1);


    }

    private void use() throws IOException, ClassNotFoundException {
        User user = new User(0, "jake", true);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("cache.txt"));
        out.writeObject(user);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("cache.txt"));
        User newUser = (User)in.readObject();
        in.close();
    }
}
