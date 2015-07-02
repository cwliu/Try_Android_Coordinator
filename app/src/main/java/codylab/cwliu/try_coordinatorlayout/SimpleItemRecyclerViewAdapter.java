package codylab.cwliu.try_coordinatorlayout;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class SimpleItemRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewSimpleTextViewHolder> {
    private List<User> items;

    public SimpleItemRecyclerViewAdapter(List<User> items){
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    @Override
    public RecyclerViewSimpleTextViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(android.R.layout.simple_list_item_1, viewGroup, false);

        return new RecyclerViewSimpleTextViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewSimpleTextViewHolder viewHolder, int position) {
        User user = items.get(position);
        viewHolder.getLabel().setText(position + 1 + " - " + user.name + " " + user.hometown);
    }
}
