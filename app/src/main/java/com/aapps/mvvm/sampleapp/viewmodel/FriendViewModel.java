package com.aapps.mvvm.sampleapp.viewmodel;

import android.os.Parcel;

public class FriendViewModel {
    String name;
    String emailId;
    String linkedInProfileLink;
    int image;

    public FriendViewModel(String name, String emailId, String linkedInProfileLink, int image){
        this.name = name;
        this.emailId = emailId;
        this.linkedInProfileLink = linkedInProfileLink;
        this.image = image;
    }

    public FriendViewModel() {

    }

    protected FriendViewModel(Parcel in) {
        name = in.readString();
        emailId = in.readString();
        linkedInProfileLink = in.readString();
        image = in.readInt();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getLinkedInProfileLink() {
        return linkedInProfileLink;
    }

    public void setLinkedInProfileLink(String linkedInProfileLink) {
        this.linkedInProfileLink = linkedInProfileLink;
    }

    public boolean hasLinkedInProfile(){
        if(!linkedInProfileLink.isEmpty())
            return true;
        return false;
    }

}
