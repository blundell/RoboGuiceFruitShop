package com.blundell.roboguicefruitshop.ui;

import android.os.Bundle;
import android.widget.TextView;

import com.blundell.roboguicefruitshop.R;
import com.blundell.roboguicefruitshop.domain.*;
import com.google.inject.Inject;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;

public class MainActivity extends RoboActivity {

	@InjectView(R.id.main_tv_fruit_count)
	TextView numberOfFruitTextView;

	@Inject
	FruitShop fruitShop;

	@Inject
	Auditor auditor;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		fruitShop.add(Fruit.ORANGE, 3);

		numberOfFruitTextView.setText("Fruit Shop Count: " + auditor.count(fruitShop));
	}

}
