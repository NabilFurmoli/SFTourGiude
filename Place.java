package com.example.android.sftourgiude;

/**
 * Created by Nabol Furmoli on 4/4/2018.
 */

public class Place {

    private static final int NO_IMAGE_PROVIDED = -1;

    //String and integer variables that holds the Info
    private String name;
    private String address;
    private String phone;
    private int imageId=NO_IMAGE_PROVIDED;

    public Place(String mname, String maddress, String mPhone, int image_id) {
        name=mname;
        address = maddress;
        phone=mPhone;
        imageId = image_id;
    }

    /**
     * Get the info of the palces.
     */
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public int getImageId() {
        return imageId;
    }
    public boolean hasImage() {
        return imageId != NO_IMAGE_PROVIDED;
    }

}
