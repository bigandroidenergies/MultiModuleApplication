package com.example.featurea

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class FeatureAActivity : ComponentActivity() {


	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		val navigator: FeatureANavigation =
			intent.getSerializableExtra(EXTRA_FEATURE_A_NAVIGATOR) as FeatureANavigation
		setContent {
			Column(
				modifier = Modifier.fillMaxSize(),
				verticalArrangement = Arrangement.Center,
				horizontalAlignment = Alignment.CenterHorizontally
			) {
				Text(text = "Feature A Screen")

				Button(
					modifier = Modifier.padding(all = 16.dp),
					onClick = {
						navigator.navigateToB(this@FeatureAActivity)
					}
				) {
					Text(text = "Start Feature B")
				}
			}
		}
	}
}

