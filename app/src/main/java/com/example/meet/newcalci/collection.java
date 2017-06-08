package com.example.meet.newcalci;

/**
 * Created by Meet on 22-May-17.
 */

public class collection {

    int coll_id;
    String coll_name;
    String profile_photo;
    String cover_photo;
    String date;
    String description;

    public collection(int coll_id, String coll_name, String profile_photo, String cover_photo, String date, String description) {
        this.coll_id = coll_id;
        this.coll_name = coll_name;
        this.profile_photo = profile_photo;
        this.cover_photo = cover_photo;
        this.date = date;
        this.description = description;
    }

    public int getColl_id() {
        return coll_id;
    }

    public void setColl_id(int coll_id) {
        this.coll_id = coll_id;
    }

    public String getColl_name() {
        return coll_name;
    }

    public void setColl_name(String coll_name) {
        this.coll_name = coll_name;
    }

    public String getProfile_photo() {
        return profile_photo;
    }

    public void setProfile_photo(String profile_photo) {
        this.profile_photo = profile_photo;
    }

    public String getCover_photo() {
        return cover_photo;
    }

    public void setCover_photo(String cover_photo) {
        this.cover_photo = cover_photo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
