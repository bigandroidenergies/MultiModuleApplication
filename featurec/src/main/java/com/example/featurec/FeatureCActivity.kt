package com.example.featurec

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

class FeatureCActivity : ComponentActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		val navigator: FeatureCNavigation =
			intent.getSerializableExtra(EXTRA_FEATURE_C_NAVIGATOR) as FeatureCNavigation
		setContent {
			Column(
				modifier = Modifier.fillMaxSize(),
				verticalArrangement = Arrangement.Center,
				horizontalAlignment = Alignment.CenterHorizontally
			) {
				Text(text = "Feature C Screen")

				Button(
					modifier = Modifier.padding(all = 16.dp),
					onClick = {
						navigator.navigateToA(this@FeatureCActivity)
					}
				) {
					Text(text = "Start Feature A")
				}

				Button(
					modifier = Modifier.padding(all = 16.dp),
					onClick = {
						navigator.navigateToB(this@FeatureCActivity)
					}
				) {
					Text(text = "Start Feature B")
				}
			}
		}
	}
}