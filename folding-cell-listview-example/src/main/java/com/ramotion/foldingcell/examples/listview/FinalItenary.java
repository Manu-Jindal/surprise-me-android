package com.ramotion.foldingcell.examples.listview;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ramotion.foldingcell.FoldingCell;
import com.ramotion.foldingcell.examples.R;

import java.util.ArrayList;
import java.util.Random;

public class FinalItenary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_itenary);

        Bundle args = getIntent().getExtras();

        String finalAns = args.getString("finalAns");
        Log.i("info", finalAns);

        // get our list view
        ListView theListView = findViewById(R.id.mainListView);

        // prepare elements to display
        final ArrayList<Item> items = new ArrayList<>();


        if(finalAns.equals("mountain")){
            Random r = new Random();
            int i1 = r.nextInt(10);
            if(i1<5){
                items.add(new Item("Delhi", "Dehradun","Indira Gandhi Intl.", "Jolly Grant", "JW Marriott Mussoorie Walnut Grove Resort & Spa", "2:00 PM", "2019-12-06", "Village- Siya,Kempty Fall Road","Dehradun: Mussoorie City tour from Dehradun (Pickup from Hotel)",  "7 hours", "Cochin", "Cochin Intl.", "Delhi","Indira Gandhi Intl.", "JW Marriott Mussoorie Walnut Grove Resort & Spa", "10:00 AM", "2019-12-10", "Village- Siya,Kempty Fall Road"));
                items.add(new Item("Delhi", "Dehradun","Indira Gandhi Intl.", "Jolly Grant", "JW Marriott Mussoorie Walnut Grove Resort & Spa", "2:00 PM", "2019-12-06", "Village- Siya,Kempty Fall Road","Dehradun: Mussoorie City Tour (Pick up from Hotel)",  "7 hours", "Cochin", "Cochin Intl.", "Delhi","Indira Gandhi Intl.", "JW Marriott Mussoorie Walnut Grove Resort & Spa", "10:00 AM", "2019-12-10", "Village- Siya,Kempty Fall Road"));
                items.add(new Item("Delhi", "Dehradun","Indira Gandhi Intl.", "Jolly Grant", "JW Marriott Mussoorie Walnut Grove Resort & Spa", "2:00 PM", "2019-12-06", "Village- Siya,Kempty Fall Road","Dehradun: Dehradun City Tour (Pickup from Hotel)",  "7 hours", "Cochin", "Cochin Intl.", "Delhi","Indira Gandhi Intl.", "JW Marriott Mussoorie Walnut Grove Resort & Spa", "10:00 AM", "2019-12-10", "Village- Siya,Kempty Fall Road"));
                items.add(new Item("Delhi", "Dehradun","Indira Gandhi Intl.", "Jolly Grant", "JW Marriott Mussoorie Walnut Grove Resort & Spa", "2:00 PM", "2019-12-06", "Village- Siya,Kempty Fall Road","Dehradun: Haridwar City tour from Dehradun (Pickup from hotel)",  "7 hours", "Cochin", "Cochin Intl.", "Delhi","Indira Gandhi Intl.", "JW Marriott Mussoorie Walnut Grove Resort & Spa", "10:00 AM", "2019-12-10", "Village- Siya,Kempty Fall Road"));
                items.add(new Item("Delhi", "Dehradun","Indira Gandhi Intl.", "Jolly Grant", "JW Marriott Mussoorie Walnut Grove Resort & Spa", "2:00 PM", "2019-12-06", "Village- Siya,Kempty Fall Road","Dehradun: Local interaction and city tour",  "7 hours", "Cochin", "Cochin Intl.", "Delhi","Indira Gandhi Intl.", "JW Marriott Mussoorie Walnut Grove Resort & Spa", "10:00 AM", "2019-12-10", "Village- Siya,Kempty Fall Road"));
                items.add(new Item("Delhi", "Dehradun","Indira Gandhi Intl.", "Jolly Grant", "JW Marriott Mussoorie Walnut Grove Resort & Spa", "2:00 PM", "2019-12-06", "Village- Siya,Kempty Fall Road","Dehradun: Getting some souveniers",  "7 hours", "Cochin", "Cochin Intl.", "Delhi","Indira Gandhi Intl.", "JW Marriott Mussoorie Walnut Grove Resort & Spa", "10:00 AM", "2019-12-10", "Village- Siya,Kempty Fall Road"));
            }
            else{
                items.add(new Item("Delhi", "Kathmandu","Indira Gandhi Intl.", "Tribhuvan Intl.", "OYO 375 Chef House Resort", "2:00 PM", "2019-12-06", "Lulu International Shopping Mall","Kathmandu: Small-Group Path to a Hidden Monastery Tour",  "6 hours 30 mins", "Kathmandu", "Tribhuvan Intl.", "Delhi","Indira Gandhi Intl.", "OYO 375 Chef House Resort", "10:00 AM", "2019-12-10", "Gothatar-7"));
                items.add(new Item("Delhi", "Kathmandu","Indira Gandhi Intl.", "Tribhuvan Intl.", "OYO 375 Chef House Resort", "2:00 PM", "2019-12-06", "Lulu International Shopping Mall","Kathmandu: Small-Group Path to a Hidden Monastery Tour",  "6 hours 30 mins", "Kathmandu", "Tribhuvan Intl.", "Delhi","Indira Gandhi Intl.", "OYO 375 Chef House Resort", "10:00 AM", "2019-12-10", "Gothatar-7"));
                items.add(new Item("Delhi", "Kathmandu","Indira Gandhi Intl.", "Tribhuvan Intl.", "OYO 375 Chef House Resort", "2:00 PM", "2019-12-06", "Lulu International Shopping Mall","Kathmandu: Small-Group Kingdoms of Patan & Bhaktapur Tour",  "6 hours 30 mins", "Kathmandu", "Tribhuvan Intl.", "Delhi","Indira Gandhi Intl.", "OYO 375 Chef House Resort", "10:00 AM", "2019-12-10", "Gothatar-7"));
                items.add(new Item("Delhi", "Kathmandu","Indira Gandhi Intl.", "Tribhuvan Intl.", "OYO 375 Chef House Resort", "2:00 PM", "2019-12-06", "Lulu International Shopping Mall","From Kathmandu: Small-Group Spiritual Nepal Tour",  "4 hours 30 mins", "Kathmandu", "Tribhuvan Intl.", "Delhi","Indira Gandhi Intl.", "OYO 375 Chef House Resort", "10:00 AM", "2019-12-10", "Gothatar-7"));
                items.add(new Item("Delhi", "Kathmandu","Indira Gandhi Intl.", "Tribhuvan Intl.", "OYO 375 Chef House Resort", "2:00 PM", "2019-12-06", "Lulu International Shopping Mall","Small-Group Kathmandu Living Tour",  "5 hours 30 mins", "Kathmandu", "Tribhuvan Intl.", "Delhi","Indira Gandhi Intl.", "OYO 375 Chef House Resort", "10:00 AM", "2019-12-10", "Gothatar-7"));
                items.add(new Item("Delhi", "Kathmandu","Indira Gandhi Intl.", "Tribhuvan Intl.", "OYO 375 Chef House Resort", "2:00 PM", "2019-12-06", "Lulu International Shopping Mall","Kathmandu: Small-Group Path to a Hidden Monastery Tour",  "6 hours 30 mins", "Kathmandu", "Tribhuvan Intl.", "Delhi","Indira Gandhi Intl.", "OYO 375 Chef House Resort", "10:00 AM", "2019-12-10", "Gothatar-7"));

            }
        }
        else if(finalAns.equals("beach")){
            Random r = new Random();
            int i1 = r.nextInt(10);
            if(i1<5){
                items.add(new Item("Delhi", "Cochin","Indira Gandhi Intl.", "Cochin Intl.", "Kochi Marriott Hotel", "2:00 PM", "2019-12-06", "Lulu International Shopping Mall","Kochi: Cooking Class at Kaliveedu Small Group Tour",  "3 hours", "Cochin", "Cochin Intl.", "Delhi","Indira Gandhi Intl.", "Kochi Marriott Hotel", "10:00 AM", "2019-12-10", "Lulu International Shopping Mall"));
                items.add(new Item("Delhi", "Cochin","Indira Gandhi Intl.", "Cochin Intl.", "Kochi Marriott Hotel", "2:00 PM", "2019-12-06", "Lulu International Shopping Mall","Kochi: Cooking Class at Kaliveedu Small Group Tour",  "3 hours", "Cochin", "Cochin Intl.", "Delhi","Indira Gandhi Intl.", "Kochi Marriott Hotel", "10:00 AM", "2019-12-10", "Lulu International Shopping Mall"));
                items.add(new Item("Delhi", "Cochin","Indira Gandhi Intl.", "Cochin Intl.", "Kochi Marriott Hotel", "2:00 PM", "2019-12-06", "Lulu International Shopping Mall","Kumarakom day tour from Cochin (Pickup from Hotel)",  "7 hours", "Cochin", "Cochin Intl.", "Delhi","Indira Gandhi Intl.", "Kochi Marriott Hotel", "10:00 AM", "2019-12-10", "Lulu International Shopping Mall"));
                items.add(new Item("Delhi", "Cochin","Indira Gandhi Intl.", "Cochin Intl.", "Kochi Marriott Hotel", "2:00 PM", "2019-12-06", "Lulu International Shopping Mall","Kerala Three days holiday (Starting from Kochi)",  "3 hours", "Cochin", "Cochin Intl.", "Delhi","Indira Gandhi Intl.", "Kochi Marriott Hotel", "10:00 AM", "2019-12-10", "Lulu International Shopping Mall"));
                items.add(new Item("Delhi", "Cochin","Indira Gandhi Intl.", "Cochin Intl.", "Kochi Marriott Hotel", "2:00 PM", "2019-12-06", "Lulu International Shopping Mall","Cochin City Tour (Pickup from Hotel)",  "7 hours", "Cochin", "Cochin Intl.", "Delhi","Indira Gandhi Intl.", "Kochi Marriott Hotel", "10:00 AM", "2019-12-10", "Lulu International Shopping Mall"));
                items.add(new Item("Delhi", "Cochin","Indira Gandhi Intl.", "Cochin Intl.", "Kochi Marriott Hotel", "2:00 PM", "2019-12-06", "Lulu International Shopping Mall","Kerala Three days holiday (Starting from Kochi)",  "3 hours", "Cochin", "Cochin Intl.", "Delhi","Indira Gandhi Intl.", "Kochi Marriott Hotel", "10:00 AM", "2019-12-10", "Lulu International Shopping Mall"));
            }
            else{
                items.add(new Item("Delhi", "Mumbai","Indira Gandhi Intl.", "Chhatrapati Shivaji Intl.", "Taj Lands End", "4:00 PM", "2019-12-06", "Byramji Jeejeebhoy Road, Bandstand","Mumbai: City tour",  "7 hours", "Delhi", "Indira Gandhi Intl.", "Mumbai","Chhatrapati Shivaji Intl.", "Jaj Lands End", "11:00 AM", "2019-12-10", "Byramji Jeejeebhoy Road, Bandstand"));
                items.add(new Item("Delhi", "Mumbai","Indira Gandhi Intl.", "Chhatrapati Shivaji Intl.", "Taj Lands End", "4:00 PM", "2019-12-06", "Byramji Jeejeebhoy Road, Bandstand","Mumbai: City tour",  "7 hours", "Delhi", "Indira Gandhi Intl.", "Mumbai","Chhatrapati Shivaji Intl.", "Jaj Lands End", "11:00 AM", "2019-12-10", "Byramji Jeejeebhoy Road, Bandstand"));
                items.add(new Item("Delhi", "Mumbai","Indira Gandhi Intl.", "Chhatrapati Shivaji Intl.", "Taj Lands End", "4:00 PM", "2019-12-06", "Byramji Jeejeebhoy Road, Bandstand","Mumbai: Private Mumbai Hidden Street Eats by Train",  "7 hours", "Delhi", "Indira Gandhi Intl.", "Mumbai","Chhatrapati Shivaji Intl.", "Jaj Lands End", "11:00 AM", "2019-12-10", "Byramji Jeejeebhoy Road, Bandstand"));
                items.add(new Item("Delhi", "Mumbai","Indira Gandhi Intl.", "Chhatrapati Shivaji Intl.", "Taj Lands End", "4:00 PM", "2019-12-06", "Byramji Jeejeebhoy Road, Bandstand","Mumbai: Mumbai Bicycle Tour",  "7 hours", "Delhi", "Indira Gandhi Intl.", "Mumbai","Chhatrapati Shivaji Intl.", "Jaj Lands End", "11:00 AM", "2019-12-10", "Byramji Jeejeebhoy Road, Bandstand"));
                items.add(new Item("Delhi", "Mumbai","Indira Gandhi Intl.", "Chhatrapati Shivaji Intl.", "Taj Lands End", "4:00 PM", "2019-12-06", "Byramji Jeejeebhoy Road, Bandstand","Mumbai: South Mumbai Markets and Temples Tour",  "7 hours", "Delhi", "Indira Gandhi Intl.", "Mumbai","Chhatrapati Shivaji Intl.", "Jaj Lands End", "11:00 AM", "2019-12-10", "Byramji Jeejeebhoy Road, Bandstand"));
                items.add(new Item("Delhi", "Mumbai","Indira Gandhi Intl.", "Chhatrapati Shivaji Intl.", "Taj Lands End", "4:00 PM", "2019-12-06", "Byramji Jeejeebhoy Road, Bandstand","Mumbai: Mumbai Street Food Tour",  "7 hours", "Delhi", "Indira Gandhi Intl.", "Mumbai","Chhatrapati Shivaji Intl.", "Jaj Lands End", "11:00 AM", "2019-12-10", "Byramji Jeejeebhoy Road, Bandstand"));

            }
        }
        else{
            Random r = new Random();
            int i1 = r.nextInt(10);
            if(i1<5) {
                items.add(new Item("Delhi", "Tokyo", "Indira Gandhi Intl.", "Capital Intl.", "Hotel Gracery Shinjuku", "2:00 PM", "2019-12-06", "1-19-1 Kabukicho, Shinjuku-ku", "Tokyo: Robot Restaurant Show", "3 hours", "Delhi", "Indira Gandhi Intl.", "Tokyo", "Capital Intl.", "Hotel Gracery Shinjuku", "2:00 PM", "2019-12-10", "1-19-1 Kabukicho, Shinjuku-ku"));
                items.add(new Item("Delhi", "Tokyo", "Indira Gandhi Intl.", "Capital Intl.", "Hotel Gracery Shinjuku", "2:00 PM", "2019-12-06", "1-19-1 Kabukicho, Shinjuku-ku", "Tokyo: Full-Day Sightseeing Bus Tour in Tokyo with Cruise", "3 hours", "Delhi", "Indira Gandhi Intl.", "Tokyo", "Capital Intl.", "Hotel Gracery Shinjuku", "2:00 PM", "2019-12-10", "1-19-1 Kabukicho, Shinjuku-ku"));
                items.add(new Item("Delhi", "Tokyo", "Indira Gandhi Intl.", "Capital Intl.", "Hotel Gracery Shinjuku", "2:00 PM", "2019-12-06", "1-19-1 Kabukicho, Shinjuku-ku", "Tokyo: Full-Day Mt. Fuji Bus Tour:4D Flight Experience-Fuji Airways", "3 hours", "Delhi", "Indira Gandhi Intl.", "Tokyo", "Capital Intl.", "Hotel Gracery Shinjuku", "2:00 PM", "2019-12-10", "1-19-1 Kabukicho, Shinjuku-ku"));
                items.add(new Item("Delhi", "Tokyo", "Indira Gandhi Intl.", "Capital Intl.", "Hotel Gracery Shinjuku", "2:00 PM", "2019-12-06", "1-19-1 Kabukicho, Shinjuku-ku", "Tokyo:Mount Fuji, Lake Ashi & Hakone National Park by Bullet Train", "3 hours", "Delhi", "Indira Gandhi Intl.", "Tokyo", "Capital Intl.", "Hotel Gracery Shinjuku", "2:00 PM", "2019-12-10", "1-19-1 Kabukicho, Shinjuku-ku"));
                items.add(new Item("Delhi", "Tokyo", "Indira Gandhi Intl.", "Capital Intl.", "Hotel Gracery Shinjuku", "2:00 PM", "2019-12-06", "1-19-1 Kabukicho, Shinjuku-ku", "Tokyo: Robot Restaurant Show", "3 hours", "Delhi", "Indira Gandhi Intl.", "Tokyo", "Capital Intl.", "Hotel Gracery Shinjuku", "2:00 PM", "2019-12-10", "1-19-1 Kabukicho, Shinjuku-ku"));
                items.add(new Item("Delhi", "Tokyo", "Indira Gandhi Intl.", "Capital Intl.", "Hotel Gracery Shinjuku", "2:00 PM", "2019-12-06", "1-19-1 Kabukicho, Shinjuku-ku", "Tokyo: Robot Restaurant Show", "3 hours", "Delhi", "Indira Gandhi Intl.", "Tokyo", "Capital Intl.", "Hotel Gracery Shinjuku", "2:00 PM", "2019-12-10", "1-19-1 Kabukicho, Shinjuku-ku"));
            }
            else{
                items.add(new Item("Delhi", "Kolkata","Indira Gandhi Intl.", "Netaji Subhash Chandra Bose Intl.", "The Oberoi Grand, Kolkata", "12:00 PM", "2019-12-06", "15 Jawaharlal Nehru Road","Kolkata: Private Old Delhi 12-Taster Food Tour",  "4 hours", "Delhi", "Indira Gandhi Intl.", "Kolkata","Netaji Subhash Chandra Bose Intl.", "The Oberoi Grand, Kolkata", "12:00 PM", "2019-12-10", "15 Jawaharlal Nehru Road"));
                items.add(new Item("Delhi", "Kolkata","Indira Gandhi Intl.", "Netaji Subhash Chandra Bose Intl.", "The Oberoi Grand, Kolkata", "12:00 PM", "2019-12-06", "15 Jawaharlal Nehru Road","Kolkata: Kolkata Uptown 15-Taster Food Tour",  "4 hours", "Delhi", "Indira Gandhi Intl.", "Kolkata","Netaji Subhash Chandra Bose Intl.", "The Oberoi Grand, Kolkata", "12:00 PM", "2019-12-10", "15 Jawaharlal Nehru Road"));
                items.add(new Item("Delhi", "Kolkata","Indira Gandhi Intl.", "Netaji Subhash Chandra Bose Intl.", "The Oberoi Grand, Kolkata", "12:00 PM", "2019-12-06", "15 Jawaharlal Nehru Road","Kolkata: 2 Nights in Royal Bengal Tiger's Kingdom Sundarban",  "4 hours", "Delhi", "Indira Gandhi Intl.", "Kolkata","Netaji Subhash Chandra Bose Intl.", "The Oberoi Grand, Kolkata", "12:00 PM", "2019-12-10", "15 Jawaharlal Nehru Road"));
                items.add(new Item("Delhi", "Kolkata","Indira Gandhi Intl.", "Netaji Subhash Chandra Bose Intl.", "The Oberoi Grand, Kolkata", "12:00 PM", "2019-12-06", "15 Jawaharlal Nehru Road","Kolkata: Street Shopping Tour by Piyali - 4 Hours",  "4 hours", "Delhi", "Indira Gandhi Intl.", "Kolkata","Netaji Subhash Chandra Bose Intl.", "The Oberoi Grand, Kolkata", "12:00 PM", "2019-12-10", "15 Jawaharlal Nehru Road"));
                items.add(new Item("Delhi", "Kolkata","Indira Gandhi Intl.", "Netaji Subhash Chandra Bose Intl.", "The Oberoi Grand, Kolkata", "12:00 PM", "2019-12-06", "15 Jawaharlal Nehru Road","Kolkata: Private Old Delhi 12-Taster Food Tour",  "4 hours", "Delhi", "Indira Gandhi Intl.", "Kolkata","Netaji Subhash Chandra Bose Intl.", "The Oberoi Grand, Kolkata", "12:00 PM", "2019-12-10", "15 Jawaharlal Nehru Road"));
                items.add(new Item("Delhi", "Kolkata","Indira Gandhi Intl.", "Netaji Subhash Chandra Bose Intl.", "The Oberoi Grand, Kolkata", "12:00 PM", "2019-12-06", "15 Jawaharlal Nehru Road","Kolkata: Private Old Delhi 12-Taster Food Tour",  "4 hours", "Delhi", "Indira Gandhi Intl.", "Kolkata","Netaji Subhash Chandra Bose Intl.", "The Oberoi Grand, Kolkata", "12:00 PM", "2019-12-10", "15 Jawaharlal Nehru Road"));


            }

        }
        final FoldingCellListAdapter adapter = new FoldingCellListAdapter(this, items);
/*
        // add custom btn handler to first list item
        items.get(0).setRequestBtnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "CUSTOM HANDLER FOR FIRST BUTTON", Toast.LENGTH_SHORT).show();
            }
        });

        // create custom adapter that holds elements and their state (we need hold a id's of unfolded elements for reusable elements)

        // add default btn handler for each request btn on each item if custom handler not found
        adapter.setDefaultRequestBtnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "DEFAULT HANDLER FOR ALL BUTTONS", Toast.LENGTH_SHORT).show();
            }
        });
*/
        // set elements to adapter
        theListView.setAdapter(adapter);

        // set on click event listener to list view
        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, final View view, int pos, long l) {

                final LinearLayout dayDisplay = view.findViewById(R.id.dayDisplay);
                final LinearLayout dayDetail = view.findViewById(R.id.dayDetail);

                Log.i("info1", dayDetail.getVisibility()+"");
                Log.i("info1", View.GONE+"");
                Log.i("info1", View.VISIBLE+"");
                Log.i("info1", View.INVISIBLE+"");
                if(dayDetail.getVisibility() == View.GONE){
                    ScratchDialog dayDetailDialog = new ScratchDialog();
                    Bundle arg= new Bundle();
                    arg.putInt("position", pos);
                    dayDetailDialog.setArguments(arg);
                    dayDetailDialog.show(getSupportFragmentManager(), "Scratch Panel Dialog");
                    getSupportFragmentManager().executePendingTransactions();
                    dayDetailDialog.getDialog().setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public void onDismiss(DialogInterface dialogInterface) {
                            dayDisplay.setVisibility(View.GONE);
                            dayDetail.setVisibility(View.VISIBLE);
                            /*final ImageView imageView = view.findViewById(R.id.head_image);
                            String url = "http://i.imgur.com/DvpvklR.png";
                            Picasso.get()
                                    .load(url)
                                    .resize(50, 50)
                                    .centerCrop()
                                    .into(imageView);*/
                            //do whatever you want when dialog is dismissed
                        }
                    });

                }
                else{
                    // toggle clicked cell state
                    ((FoldingCell) view).toggle(false);
                    // register in adapter that state for selected cell is toggled
                    adapter.registerToggle(pos);
                }

            }
        });


    }
}
