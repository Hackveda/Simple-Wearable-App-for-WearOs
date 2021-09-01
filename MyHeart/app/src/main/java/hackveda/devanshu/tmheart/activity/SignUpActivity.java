/*
*  SignUpActivity.java
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


public class SignUpActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, SignUpActivity.class);
	}
	
	private Button lblloginButton;
	private Button signupbtnButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.sign_up_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure lblLogin component
		lblloginButton = this.findViewById(R.id.lbllogin_button);
		lblloginButton.setOnClickListener((view) -> {
	this.onLblLoginPressed();
});
		
		// Configure signupBtn component
		signupbtnButton = this.findViewById(R.id.signupbtn_button);
		signupbtnButton.setOnClickListener((view) -> {
	this.onSignupBtnPressed();
});
	}
	
	public void onLblLoginPressed() {
	
		this.startLoginPageActivity();
	}
	
	public void onSignupBtnPressed() {
	
		this.startSubscriptionActivity();
	}
	
	private void startLoginPageActivity() {
	
		this.startActivity(LoginPageActivity.newIntent(this));
	}
	
	private void startSubscriptionActivity() {
	
		this.startActivity(SubscriptionActivity.newIntent(this));
	}
}
