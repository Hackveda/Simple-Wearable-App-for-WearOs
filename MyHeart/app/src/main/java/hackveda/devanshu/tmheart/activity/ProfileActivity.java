/*
*  ProfileActivity.java
*  MyHeart
*
*  Created by Devanshu Shukla.
*  Copyright © 2018 Hackveda. All rights reserved.
*/

package hackveda.devanshu.tmheart.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;

import hackveda.devanshu.tmheart.R;
import hackveda.devanshu.tmheart.dialog.ProfileActivityGoalbtnButtonSheet;


public class ProfileActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, ProfileActivity.class);
	}
	
	private Button goalbtnButton;
	private Button tveditprofileButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.profile_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure goalBtn component
		goalbtnButton = this.findViewById(R.id.goalbtn_button);
		goalbtnButton.setOnClickListener((view) -> {
	this.onGoalBtnPressed();
});
		
		// Configure tvEditProfile component
		tveditprofileButton = this.findViewById(R.id.tveditprofile_button);
		tveditprofileButton.setOnClickListener((view) -> {
	this.onTvEditProfilePressed();
});
	}
	
	public void onGoalBtnPressed() {
	
		new ProfileActivityGoalbtnButtonSheet().show(this.getSupportFragmentManager(), "ProfileActivityGoalbtnButtonSheet");
	}
	
	public void onTvEditProfilePressed() {
	
		this.startConfigureActivity();
	}
	
	private void startConfigureActivity() {
	
		this.startActivity(ConfigureActivity.newIntent(this));
	}
}
