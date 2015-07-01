package codylab.cwliu.try_coordinatorlayout;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class RecyclerViewSimpleTextViewHolder extends RecyclerView.ViewHolder {
    private TextView label;

    public RecyclerViewSimpleTextViewHolder(View v) {
        super(v);
        label = (TextView) v.findViewById(android.R.id.text1);
    }

    public TextView getLabel() {
        return label;
    }

    public void setLabel(TextView label) {
        this.label = label;
    }
}
