package com.ramotion.foldingcell.examples.listview;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Simple POJO model for example
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class Item {

    String fromFlightStart ="";
    String toFlightStart="";
    String fromFlightAirportStart="";
    String toFlightAirportStart="";

    String hotelNameStart="";
    String hotelCheckInTime="2:00 PM";
    String hotelCheckInDate="";
    String hotelAddressStart="";

    String activityTitle="";
    String activityDuration="";
    //ImageView activityImage;

    String fromFlightEnd="";
    String fromFlightAirportEnd="";
    String toFlightEnd="";
    String toFlightAirportEnd="";

    String hotelNameEnd="";
    String hotelCheckOutTime="10:00 AM";
    String hotelCheckOutDate="";
    String hotelAddressEnd=""   ;

    public String getFromFlightStart() {
        return fromFlightStart;
    }

    public void setFromFlightStart(String fromFlightStart) {
        this.fromFlightStart = fromFlightStart;
    }

    public String getToFlightStart() {
        return toFlightStart;
    }

    public void setToFlightStart(String toFlightStart) {
        this.toFlightStart = toFlightStart;
    }

    public String getFromFlightAirportStart() {
        return fromFlightAirportStart;
    }

    public void setFromFlightAirportStart(String fromFlightAirportStart) {
        this.fromFlightAirportStart = fromFlightAirportStart;
    }

    public String getToFlightAirportStart() {
        return toFlightAirportStart;
    }

    public void setToFlightAirportStart(String toFlightAirportStart) {
        this.toFlightAirportStart = toFlightAirportStart;
    }

    public String getHotelNameStart() {
        return hotelNameStart;
    }

    public void setHotelNameStart(String hotelNameStart) {
        this.hotelNameStart = hotelNameStart;
    }

    public String getHotelCheckInTime() {
        return hotelCheckInTime;
    }

    public void setHotelCheckInTime(String hotelCheckInTime) {
        this.hotelCheckInTime = hotelCheckInTime;
    }

    public String getHotelCheckInDate() {
        return hotelCheckInDate;
    }

    public void setHotelCheckInDate(String hotelCheckInDate) {
        this.hotelCheckInDate = hotelCheckInDate;
    }

    public String getHotelAddressStart() {
        return hotelAddressStart;
    }

    public void setHotelAddressStart(String hotelAddressStart) {
        this.hotelAddressStart = hotelAddressStart;
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }

    public String getActivityDuration() {
        return activityDuration;
    }

    public void setActivityDuration(String activityDuration) {
        this.activityDuration = activityDuration;
    }

    public String getFromFlightEnd() {
        return fromFlightEnd;
    }

    public void setFromFlightEnd(String fromFlightEnd) {
        this.fromFlightEnd = fromFlightEnd;
    }

    public String getFromFlightAirportEnd() {
        return fromFlightAirportEnd;
    }

    public void setFromFlightAirportEnd(String fromFlightAirportEnd) {
        this.fromFlightAirportEnd = fromFlightAirportEnd;
    }

    public String getToFlightEnd() {
        return toFlightEnd;
    }

    public void setToFlightEnd(String toFlightEnd) {
        this.toFlightEnd = toFlightEnd;
    }

    public String getToFlightAirportEnd() {
        return toFlightAirportEnd;
    }

    public void setToFlightAirportEnd(String toFlightAirportEnd) {
        this.toFlightAirportEnd = toFlightAirportEnd;
    }

    public String getHotelNameEnd() {
        return hotelNameEnd;
    }

    public void setHotelNameEnd(String hotelNameEnd) {
        this.hotelNameEnd = hotelNameEnd;
    }

    public String getHotelCheckOutTime() {
        return hotelCheckOutTime;
    }

    public void setHotelCheckOutTime(String hotelCheckOutTime) {
        this.hotelCheckOutTime = hotelCheckOutTime;
    }

    public String getHotelCheckOutDate() {
        return hotelCheckOutDate;
    }

    public void setHotelCheckOutDate(String hotelCheckOutDate) {
        this.hotelCheckOutDate = hotelCheckOutDate;
    }

    public String getHotelAddressEnd() {
        return hotelAddressEnd;
    }

    public void setHotelAddressEnd(String hotelAddressEnd) {
        this.hotelAddressEnd = hotelAddressEnd;
    }

    public Item(String fromFlightStart, String toFlightStart, String fromFlightAirportStart, String toFlightAirportStart, String hotelNameStart, String hotelCheckInTime, String hotelCheckInDate, String hotelAddressStart, String activityTitle, String activityDuration,
                //ImageView activityImage,
                String fromFlightEnd, String fromFlightAirportEnd, String toFlightEnd, String toFlightAirportEnd, String hotelNameEnd, String hotelCheckOutTime, String hotelCheckOutDate, String hotelAddressEnd) {
        this.fromFlightStart = fromFlightStart;
        this.toFlightStart = toFlightStart;
        this.fromFlightAirportStart = fromFlightAirportStart;
        this.toFlightAirportStart = toFlightAirportStart;
        this.hotelNameStart = hotelNameStart;
        this.hotelCheckInTime = hotelCheckInTime;
        this.hotelCheckInDate = hotelCheckInDate;
        this.hotelAddressStart = hotelAddressStart;
        this.activityTitle = activityTitle;
        this.activityDuration = activityDuration;
        //this.activityImage = activityImage;
        this.fromFlightEnd = fromFlightEnd;
        this.fromFlightAirportEnd = fromFlightAirportEnd;
        this.toFlightEnd = toFlightEnd;
        this.toFlightAirportEnd = toFlightAirportEnd;
        this.hotelNameEnd = hotelNameEnd;
        this.hotelCheckOutTime = hotelCheckOutTime;
        this.hotelCheckOutDate = hotelCheckOutDate;
        this.hotelAddressEnd = hotelAddressEnd;
    }

    private View.OnClickListener requestBtnClickListener;

    public Item() {
    }



    public View.OnClickListener getRequestBtnClickListener() {
        return requestBtnClickListener;
    }

    public void setRequestBtnClickListener(View.OnClickListener requestBtnClickListener) {
        this.requestBtnClickListener = requestBtnClickListener;
    }

    /**
     * @return List of elements prepared for tests
     */
    public static ArrayList<Item> getTestingList() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("A", "B","C", "D", "E", "2:00 PM", "G", "H","I",  "K", "L", "M", "N","O", "P", "10:00 AM", "R", "S"));
        items.add(new Item("A", "B","C", "D", "E", "2:00 PM", "G", "H","I",  "K", "L", "M", "N","O", "P", "10:00 AM", "R", "S"));
        items.add(new Item("A", "B","C", "D", "E", "2:00 PM", "G", "H","I",  "K", "L", "M", "N","O", "P", "10:00 AM", "R", "S"));
        items.add(new Item("A", "B","C", "D", "E", "2:00 PM", "G", "H","I",  "K", "L", "M", "N","O", "P", "10:00 AM", "R", "S"));
        items.add(new Item("A", "B","C", "D", "E", "2:00 PM", "G", "H","I",  "K", "L", "M", "N","O", "P", "10:00 AM", "R", "S"));

        //items.add(new Item("$14", "$270", "W 79th St, NY, 10024", "W 139th St, NY, 10030", 3, "TODAY", "05:10 PM"));
        //items.add(new Item("$23", "$116", "W 36th St, NY, 10015", "W 114th St, NY, 10037", 10, "TODAY", "11:10 AM"));
        //items.add(new Item("$63", "$350", "W 36th St, NY, 10029", "56th Ave, NY, 10041", 0, "TODAY", "07:11 PM"));
        //items.add(new Item("$19", "$150", "12th Ave, NY, 10012", "W 57th St, NY, 10048", 8, "TODAY", "4:15 AM"));
        //items.add(new Item("$5", "$300", "56th Ave, NY, 10041", "W 36th St, NY, 10029", 0, "TODAY", "06:15 PM"));
        return items;

    }

}
