package codylab.cwliu.try_coordinatorlayout;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        // V1: Setup basic toolbar as actionbar in CoordinatorLayout
//        // Use <application android:theme="@style/Theme.AppCompat.NoActionBar">
//        setContentView(R.layout.activity_main_1);
//        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

//        // V2 Add recycler content and AppBarLayout to responding to Scroll Events
//        setContentView(R.layout.activity_main_2);
//        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
//        initRecycleView((RecyclerView) findViewById(R.id.list_recyclerView));

        // V3 Collapsing Effects
        setContentView(R.layout.activity_main_3);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        initRecycleView((RecyclerView) findViewById(R.id.list_recyclerView));
        ((CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar)).setTitle("CollapsingToolBar");
    }

    private void initRecycleView(RecyclerView recyclerView){
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setHasFixedSize(true);

        ArrayList<User> items = new ArrayList<>();
        items.add(new User("Buzz", "Space"));
        items.add(new User("Rob Stark", "Winterfell"));
        items.add(new User("Jon Snow", "Castle Black"));
        items.add(new User("Tyrion Lanister", "King's Landing"));
        items.add(new User("Dany Targaryen", "Valyria"));
        items.add(new User("Rob Stark", "Winterfell"));
        items.add(new User("Jon Snow", "Castle Black"));
        items.add(new User("Tyrion Lanister", "King's Landing"));
        items.add(new User("Dany Targaryen", "Valyria"));
        items.add(new User("Rob Stark", "Winterfell"));
        items.add(new User("Jon Snow", "Castle Black"));
        items.add(new User("Tyrion Lanister", "King's Landing"));
        items.add(new User("Dany Targaryen", "Valyria"));
        items.add(new User("Rob Stark", "Winterfell"));
        items.add(new User("Jon Snow", "Castle Black"));
        items.add(new User("Tyrion Lanister", "King's Landing"));
        items.add(new User("Dany Targaryen", "Valyria"));
        items.add(new User("Rob Stark", "Winterfell"));
        items.add(new User("Jon Snow", "Castle Black"));
        items.add(new User("Tyrion Lanister", "King's Landing"));
        items.add(new User("Dany Targaryen", "Valyria"));
        items.add(new User("Rob Stark", "Winterfell"));
        items.add(new User("Jon Snow", "Castle Black"));
        items.add(new User("Tyrion Lanister", "King's Landing"));
        items.add(new User("Dany Targaryen", "Valyria"));
        items.add(new User("Rob Stark", "Winterfell"));
        items.add(new User("Jon Snow", "Castle Black"));
        items.add(new User("Tyrion Lanister", "King's Landing"));
        items.add(new User("Dany Targaryen", "Valyria"));
        items.add(new User("Rob Stark", "Winterfell"));
        items.add(new User("Jon Snow", "Castle Black"));
        items.add(new User("Tyrion Lanister", "King's Landing"));

        recyclerView.setAdapter(new SimpleItemRecyclerViewAdapter(items));
    }
}
