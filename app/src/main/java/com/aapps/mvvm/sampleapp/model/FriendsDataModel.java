package com.aapps.mvvm.sampleapp.model;

import com.aapps.mvvm.sampleapp.R;
import com.aapps.mvvm.sampleapp.viewmodel.FriendViewModel;

import java.util.HashMap;

public class FriendsDataModel {
    public FriendViewModel[] MY_FRIENDS = {RAJIV,ASHISHI,INDRANIL,KESHAV};


    public HashMap<String, FriendViewModel> MY_FRIEND_MAP = new HashMap<>();

    public FriendsDataModel() {
        for(FriendViewModel myFriendModel : MY_FRIENDS){
            MY_FRIEND_MAP.put(myFriendModel.getName(), myFriendModel);
        }

    }

    public static final FriendViewModel RAJIV = new FriendViewModel("Rajiv Ranjan", "rajiv@xyz.com", "rajiv-ranjan-58293b14", R.drawable.rajiv);
    public static final FriendViewModel ASHISHI = new FriendViewModel("Ashish K Gupta", "ashish@xyz.com", "ashish-kumar-gupta-17705b20", R.drawable.ashish);
    public static final FriendViewModel INDRANIL = new FriendViewModel("Indranil Paul", "indranil@xyz.com", "indranilpaul", R.drawable.indranil);
    public static final FriendViewModel KESHAV = new FriendViewModel("Keshav Verma", "Keshav@xyz.com", "", R.drawable.ic_launcher_background);

}
