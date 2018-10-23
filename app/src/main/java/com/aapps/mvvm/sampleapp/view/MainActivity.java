package com.aapps.mvvm.sampleapp.view;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.aapps.mvvm.sampleapp.R;
import com.aapps.mvvm.sampleapp.databinding.ActivityMainBinding;
import com.aapps.mvvm.sampleapp.model.FriendsDataModel;
import com.aapps.mvvm.sampleapp.viewmodel.FriendViewModel;
import com.aapps.mvvm.sampleapp.viewmodel.IMainActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IMainActivity{

    ActivityMainBinding mBinding;
    FriendsDataModel friendsDataModel;
    FriendViewModel friendViewModel;
    int friendPosititon = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mBinding.setIMainActivity((IMainActivity) this);
        friendsDataModel = new FriendsDataModel();
        showFriend(friendPosititon);
    }

    private void showFriend(int position){
        friendViewModel = friendsDataModel.MY_FRIENDS[position];
        mBinding.setFriendmodelview(friendViewModel);
    }

    @Override
    public void showNextFriend() {
        int totalFriends = friendsDataModel.MY_FRIENDS.length;
        if(friendPosititon<totalFriends-1){
            friendPosititon++;
        } else {
            friendPosititon = 0;
        }
        showFriend(friendPosititon);
    }

    public void openLinkedInProfile(){
        try{

            String linkedId = friendViewModel.getLinkedInProfileLink();
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("linkedin://add/%@" + linkedId));
            final PackageManager packageManager = getApplicationContext().getPackageManager();
            final List<ResolveInfo> list = packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);
            if (list.isEmpty()) {
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.linkedin.com/profile/view?id=" + linkedId));
            }
            startActivity(intent);
        } catch(Exception ex){
            Toast.makeText(this,this.getText(R.string.linkedin_app),Toast.LENGTH_SHORT).show();
        }

    }
}
