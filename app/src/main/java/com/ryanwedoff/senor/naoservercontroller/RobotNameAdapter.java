package com.ryanwedoff.senor.naoservercontroller;
/**
 * Adapter class for RobotName Activity
 */
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class RobotNameAdapter extends RecyclerView.Adapter<RobotNameAdapter.ViewHolder> {
    private final List<String> mDataset;

    //Constructor
    public RobotNameAdapter(List<String> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public RobotNameAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                          int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.robot_name_card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        return new ViewHolder((CardView) v);
    }

    @Override
    public void onBindViewHolder(RobotNameAdapter.ViewHolder holder, int position) {
        View view = holder.mCardView.getRootView();
        TextView textView = (TextView) view.findViewById(R.id.robot_name_text_view);
        textView.setText(mDataset.get(position));
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public final CardView mCardView;

        public ViewHolder(CardView v) {
            super(v);
            mCardView = v;
        }
    }
}
