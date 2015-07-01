package codylab.cwliu.try_coordinatorlayout;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null) {
            actionbar.setDisplayHomeAsUpEnabled(true);
        }

        initRecycleView();

//        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
//        collapsingToolbar.setTitle("Title");
    }

    private void initRecycleView(){
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list_recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setHasFixedSize(true);

        ArrayList<User> items = new ArrayList<>();
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
