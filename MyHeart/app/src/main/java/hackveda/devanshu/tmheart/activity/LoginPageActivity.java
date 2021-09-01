/*
*  LoginPageActivity.java
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


public class LoginPageActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, LoginPageActivity.class);
	}
	
	private Button lblsignupButton;
	private Button loginbtnButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.login_page_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure lblSignup component
		lblsignupButton = this.findViewById(R.id.lblsignup_button);
		lblsignupButton.setOnClickListener((view) -> {
	this.onLblSignupPressed();
});
		
		// Configure loginBtn component
		loginbtnButton = this.findViewById(R.id.loginbtn_button);
		loginbtnButton.setOnClickListener((view) -> {
	this.onLoginBtnPressed();
});
	}
	
	public void onLblSignupPressed() {
	
		this.startSignUpActivity();
	}
	
	public void onLoginBtnPressed() {
	
		this.startProfileActivity();
	}
	
	private void startProfileActivity() {
	
		this.startActivity(ProfileActivity.newIntent(this));
	}
	
	private void startSignUpActivity() {
	
		this.startActivity(SignUpActivity.newIntent(this));
	}
}
