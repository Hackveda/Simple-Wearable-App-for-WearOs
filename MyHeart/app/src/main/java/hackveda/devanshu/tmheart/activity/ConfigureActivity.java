/*
*  ConfigureActivity.java
*  MyHeart
*
*  Created by Devanshu Shukla.
*  Copyright © 2018 Hackveda. All rights reserved.
*/

package hackveda.devanshu.tmheart.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;

import hackveda.devanshu.tmheart.R;


public class ConfigureActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, ConfigureActivity.class);
	}
	
	private Button lbldeleteButton;
	private TabLayout tvsexTabBar;
	private Button btnsavedetailsButton;
	private Button lblreferfriendButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.configure_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure lblDelete component
		lbldeleteButton = this.findViewById(R.id.lbldelete_button);
		lbldeleteButton.setOnClickListener((view) -> {
	this.onLblDeletePressed();
});
		
		// Configure tvSex component
		tvsexTabBar = this.findViewById(R.id.tvsex_tab_bar);
		tvsexTabBar.setOnClickListener((view) -> {
	this.onTvSexValueChanged();
});
		
		// Configure btnSaveDetails component
		btnsavedetailsButton = this.findViewById(R.id.btnsavedetails_button);
		btnsavedetailsButton.setOnClickListener((view) -> {
	this.onBtnSaveDetailsPressed();
});
		
		// Configure lblReferFriend component
		lblreferfriendButton = this.findViewById(R.id.lblreferfriend_button);
		lblreferfriendButton.setOnClickListener((view) -> {
	this.onLblReferFriendPressed();
});
	}
	
	public void onLblDeletePressed() {
	
	}
	
	public void onTvSexValueChanged() {
	
	}
	
	public void onBtnSaveDetailsPressed() {
	
		this.startProfileActivity();
	}
	
	public void onLblReferFriendPressed() {
	
	}
	
	private void startProfileActivity() {
	
		this.startActivity(ProfileActivity.newIntent(this));
	}
}
