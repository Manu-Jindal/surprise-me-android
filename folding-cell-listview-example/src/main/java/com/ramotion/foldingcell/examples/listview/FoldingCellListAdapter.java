package com.ramotion.foldingcell.examples.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ramotion.foldingcell.FoldingCell;
import com.ramotion.foldingcell.examples.R;

import java.util.HashSet;
import java.util.List;

import androidx.annotation.NonNull;

/**
 * Simple example of ListAdapter for using with Folding Cell
 * Adapter holds indexes of unfolded elements for correct work with default reusable views behavior
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class FoldingCellListAdapter extends ArrayAdapter<Item> {

    private HashSet<Integer> unfoldedIndexes = new HashSet<>();
    private View.OnClickListener defaultRequestBtnClickListener;


    int listSize;

    public FoldingCellListAdapter(Context context, List<Item> objects) {
        super(context, 0, objects);
        listSize = objects.size();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // get item for selected view
        Item item = getItem(position);
        // if cell is exists - reuse it, if not - create the new one from resource
        FoldingCell cell = (FoldingCell) convertView;
        ViewHolder viewHolder;
        if (cell == null) {
            viewHolder = new ViewHolder();
            LayoutInflater vi = LayoutInflater.from(getContext());

            if(position == 0){
                cell = (FoldingCell) vi.inflate(R.layout.cell_start, parent, false);
                // binding view parts to view holder
                viewHolder.fromFlightStart = cell.findViewById(R.id.fromFlightStart);
                viewHolder.toFlightStart = cell.findViewById(R.id.toFlightStart);
                viewHolder.fromFlightAirportStart = cell.findViewById(R.id.fromFlightAirportStart);
                viewHolder.toFlightAirportStart = cell.findViewById(R.id.toFlightAirportStart);

                viewHolder.hotelNameStart = cell.findViewById(R.id.hotelNameStart);
                viewHolder.hotelAddressStart = cell.findViewById(R.id.hotelAddressStart);
                viewHolder.hotelCheckInTime = cell.findViewById(R.id.hotelCheckInTime);
                viewHolder.hotelCheckInDate = cell.findViewById(R.id.hotelCheckInDate);



                viewHolder.fromFlightStart.setText(item.getFromFlightStart());
                viewHolder.toFlightStart.setText(item.getToFlightStart());
                viewHolder.fromFlightAirportStart.setText(item.getFromFlightAirportStart());
                viewHolder.toFlightAirportStart.setText(item.getToFlightAirportStart());

                viewHolder.hotelNameStart.setText(item.getHotelNameStart());
                viewHolder.hotelAddressStart.setText(item.getHotelAddressStart());
                viewHolder.hotelCheckInTime.setText(item.getHotelCheckInTime());
                viewHolder.hotelCheckInDate.setText(item.getHotelCheckInDate());
                /*viewHolder.content_request_btn_start = cell.findViewById(R.id.content_request_btn_start);

                // set custom btn handler for list item from that item
                if (item.getRequestBtnClickListener() != null) {
                    viewHolder.content_request_btn_start.setOnClickListener(item.getRequestBtnClickListener());
                } else {
                    // (optionally) add "default" handler if no handler found in item
                    viewHolder.content_request_btn_start.setOnClickListener(defaultRequestBtnClickListener);
                }*/

            }

            else if(position == listSize -1 ){
                cell = (FoldingCell) vi.inflate(R.layout.cell_end, parent, false);

                viewHolder.fromFlightEnd = cell.findViewById(R.id.fromFlightEnd);
                viewHolder.fromFlightAirportEnd = cell.findViewById(R.id.fromFlightAirportEnd);
                viewHolder.toFlightEnd = cell.findViewById(R.id.toFlightEnd);
                viewHolder.toFlightAirportEnd = cell.findViewById(R.id.toFlightAirportEnd);

                viewHolder.hotelNameEnd = cell.findViewById(R.id.hotelNameEnd);
                viewHolder.hotelAddressEnd = cell.findViewById(R.id.hotelAddressEnd);
                viewHolder.hotelCheckOutTime = cell.findViewById(R.id.hotelCheckOutTime);
                viewHolder.hotelCheckOutDate = cell.findViewById(R.id.hotelCheckOutDate);



                viewHolder.fromFlightEnd.setText(item.getFromFlightEnd());
                viewHolder.fromFlightAirportEnd.setText(item.getFromFlightAirportEnd());
                viewHolder.toFlightEnd.setText(item.getToFlightEnd());
                viewHolder.toFlightAirportEnd.setText(item.getToFlightAirportEnd());

                viewHolder.hotelNameEnd.setText(item.getHotelNameEnd());
                viewHolder.hotelAddressEnd.setText(item.getHotelAddressEnd());
                viewHolder.hotelCheckOutTime.setText(item.getHotelCheckOutTime());
                viewHolder.hotelCheckOutDate.setText(item.getHotelCheckOutDate());
/*
                viewHolder.content_request_btn_end = cell.findViewById(R.id.content_request_btn_end);

                // set custom btn handler for list item from that item
                if (item.getRequestBtnClickListener() != null) {
                    viewHolder.content_request_btn_end.setOnClickListener(item.getRequestBtnClickListener());
                } else {
                    // (optionally) add "default" handler if no handler found in item
                    viewHolder.content_request_btn_end.setOnClickListener(defaultRequestBtnClickListener);
                }*/
            }
            else{
                cell = (FoldingCell) vi.inflate(R.layout.cell_activities, parent, false);

                viewHolder.activityTitle = cell.findViewById(R.id.activityTitle);
                viewHolder.activityDuration = cell.findViewById(R.id.activityDuration);
                viewHolder.activityImage = cell.findViewById(R.id.activityImage);

                viewHolder.dayTitleContent = cell.findViewById(R.id.dayTitleContent);

                viewHolder.activityTitle.setText(item.getActivityTitle());
                viewHolder.dayTitleContent.setText("Day " + (position));

                viewHolder.activityDuration.setText(item.getActivityDuration());
/*                viewHolder.content_request_btn_activities = cell.findViewById(R.id.content_request_btn_activities);

                if (item.getRequestBtnClickListener() != null) {
                    viewHolder.content_request_btn_activities.setOnClickListener(item.getRequestBtnClickListener());
                } else {
                    // (optionally) add "default" handler if no handler found in item
                    viewHolder.content_request_btn_activities.setOnClickListener(defaultRequestBtnClickListener);
                }*/
            }

            viewHolder.fromCity = cell.findViewById(R.id.title_from_address);
            viewHolder.toCity = cell.findViewById(R.id.title_to_address);
            viewHolder.ScratchButtonTextView = cell.findViewById(R.id.ScratchButtonTextView);

            cell.setTag(viewHolder);
        } else {
            // for existing cell set valid valid state(without animation)
            if (unfoldedIndexes.contains(position)) {
                cell.unfold(true);
            } else {
                cell.fold(true);
            }
            viewHolder = (ViewHolder) cell.getTag();
        }

        if (null == item)
            return cell;


        viewHolder.fromCity.setText(item.getFromFlightStart());
        viewHolder.toCity.setText(item.getToFlightStart());
        viewHolder.ScratchButtonTextView.setText("Click to unlock Day " + position);
        //viewHolder.activityImage = cell.findViewById(R.id.activityImage);

        return cell;
    }

    // simple methods for register cell state changes
    public void registerToggle(int position) {
        if (unfoldedIndexes.contains(position))
            registerFold(position);
        else
            registerUnfold(position);
    }

    public void registerFold(int position) {
        unfoldedIndexes.remove(position);
    }

    public void registerUnfold(int position) {
        unfoldedIndexes.add(position);
    }

    public View.OnClickListener getDefaultRequestBtnClickListener() {
        return defaultRequestBtnClickListener;
    }

    public void setDefaultRequestBtnClickListener(View.OnClickListener defaultRequestBtnClickListener) {
        this.defaultRequestBtnClickListener = defaultRequestBtnClickListener;
    }

    // View lookup cache
    private static class ViewHolder {
        TextView fromFlightStart;
        TextView toFlightStart;
        TextView fromFlightAirportStart;
        TextView toFlightAirportStart;

        TextView hotelNameStart;
        TextView hotelCheckInTime;
        TextView hotelCheckInDate;
        TextView hotelAddressStart;

        TextView activityTitle;
        TextView activityDuration;
        TextView dayTitleContent;
        ImageView activityImage;

        TextView fromFlightEnd;
        TextView fromFlightAirportEnd;
        TextView toFlightEnd;
        TextView toFlightAirportEnd;

        TextView hotelNameEnd;
        TextView hotelCheckOutTime;
        TextView hotelCheckOutDate;
        TextView hotelAddressEnd;

        TextView fromCity;
        TextView toCity;
        TextView ScratchButtonTextView;

        Button content_request_btn_start;
        Button content_request_btn_end;
        Button content_request_btn_activities;
    }
}
