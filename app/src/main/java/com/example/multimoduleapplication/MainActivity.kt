package com.example.multimoduleapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.multimoduleapplication.ui.theme.MultiModuleApplicationTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			MultiModuleApplicationTheme {
				MainScreen(
					modifier = Modifier.fillMaxSize(),
					onFeatureClick = {
						// Main screen already can launch feature module activities, but lets use feature starter nonetheless
						when (it) {
							NavigationScreen.FeatureA -> FeatureStarter.navigateToA(this@MainActivity)
							NavigationScreen.FeatureB -> FeatureStarter.navigateToB(this@MainActivity)
							NavigationScreen.FeatureC -> FeatureStarter.navigateToC(this@MainActivity)
						}
					}
				)
			}
		}
	}
}

@Composable
fun MainScreen(
	modifier: Modifier = Modifier,
	onFeatureClick: (NavigationScreen) -> Unit
) {
	Column(
		modifier = modifier,
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		Button(
			modifier = Modifier.padding(all = 16.dp),
			onClick = { onFeatureClick.invoke(NavigationScreen.FeatureA) }
		) {
			Text(text = "Start Feature A")
		}

		Button(
			modifier = Modifier.padding(all = 16.dp),
			onClick = { onFeatureClick.invoke(NavigationScreen.FeatureB) }
		) {
			Text(text = "Start Feature B")
		}

		Button(
			modifier = Modifier.padding(all = 16.dp),
			onClick = { onFeatureClick.invoke(NavigationScreen.FeatureC) }
		) {
			Text(text = "Start Feature C")
		}
	}
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
	MultiModuleApplicationTheme {
		MainScreen(onFeatureClick = {})
	}
}