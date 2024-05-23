package com.example.lab05_se161047;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserActivity extends AppCompatActivity {
    ArrayList<User> userlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        RecyclerView rvUser = findViewById(R.id.item_user);

        userlist = new ArrayList<>();
        userlist.add(new User("VuTT", "Tong Thanh Vu", "Vutt@fpt.edu.vn"));
        userlist.add(new User("HuyenNT", "Ngoc Tran Huyen", "Huyennt@fpt.edu.vn"));
        userlist.add(new User("HieuDD", "Doan Dang Hieu", "Hieudd@fpt.edu.vn"));
        userlist.add(new User("VyCT", "Cao Thuy Vy", "Vyct@fpt.edu.vn"));
        userlist.add(new User("NgocDK", "Doan Khanh Ngoc", "Ngocdk@fpt.edu.vn"));
        userlist.add(new User("LinhBT", "Bich Thuy Linh", "Linhbt@fpt.edu.vn"));

        UserAdapter adapter = new UserAdapter(userlist);
        rvUser.setAdapter(adapter);
        rvUser.setLayoutManager(new LinearLayoutManager(this));
    }
}