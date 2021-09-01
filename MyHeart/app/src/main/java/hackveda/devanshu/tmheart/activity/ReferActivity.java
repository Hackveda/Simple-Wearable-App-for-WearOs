/*
*  ReferActivity.java
*  MyHeart
*
*  Created by Devanshu Shukla.
*  Copyright © 2018 Hackveda. All rights reserved.
*/

package hackveda.devanshu.tmheart.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.core.content.res.ResourcesCompat;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.widget.Button;
import android.widget.TextView;
import hackveda.devanshu.tmheart.R;
import io.supernova.uitoolkit.text.FontSpan;


public class ReferActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, ReferActivity.class);
	}
	
	private Button btncopyButton;
	private Button btninviteButton;
	private Button lblbackButton;
	private TextView lblinvitemessageTextView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.refer_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure btnCopy component
		btncopyButton = this.findViewById(R.id.btncopy_button);
		btncopyButton.setOnClickListener((view) -> {
	this.onBtnCopyPressed();
});
		
		// Configure btnInvite component
		btninviteButton = this.findViewById(R.id.btninvite_button);
		btninviteButton.setOnClickListener((view) -> {
	this.onBtnInvitePressed();
});
		
		// Configure lblBack component
		lblbackButton = this.findViewById(R.id.lblback_button);
		lblbackButton.setOnClickListener((view) -> {
	this.onLblBackPressed();
});
		
		// Configure lblInviteMessage component
		lblinvitemessageTextView = this.findViewById(R.id.lblinvitemessage_text_view);
		SpannableString lblinvitemessageTextViewText = new SpannableString(this.getString(R.string.refer_activity_lblinvitemessage_text_view_text));
		lblinvitemessageTextViewText.setSpan(new FontSpan(ResourcesCompat.getFont(this, R.font.roboto_regular)), 29, 38, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		lblinvitemessageTextViewText.setSpan(new FontSpan(ResourcesCompat.getFont(this, R.font.roboto_regular)), 98, 116, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		lblinvitemessageTextView.setText(lblinvitemessageTextViewText);
	}
	
	public void onBtnCopyPressed() {
	
	}
	
	public void onBtnInvitePressed() {
	
		new AlertDialog.Builder(this, R.style.Theme_AppCompat_Light_Dialog_Alert).setTitle(this.getString(R.string.refer_activity_btninvite_button_alert_title)).setItems(R.array.refer_activity_btninvite_button_alert_items, (dialogInterface, which) -> {
}).setNegativeButton(this.getString(R.string.refer_activity_btninvite_button_alert_negative_text), (dialogInterface, which) -> {
}).show();
	}
	
	public void onLblBackPressed() {
	
	}
}
