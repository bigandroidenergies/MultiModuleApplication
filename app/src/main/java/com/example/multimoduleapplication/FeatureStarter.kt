package com.example.multimoduleapplication

import android.content.Context
import android.content.Intent
import com.example.featurea.EXTRA_FEATURE_A_NAVIGATOR
import com.example.featurea.FeatureAActivity
import com.example.featurea.FeatureANavigation
import com.example.featureb.EXTRA_FEATURE_B_NAVIGATOR
import com.example.featureb.FeatureBActivity
import com.example.featureb.FeatureBNavigation
import com.example.featurec.EXTRA_FEATURE_C_NAVIGATOR
import com.example.featurec.FeatureCActivity
import com.example.featurec.FeatureCNavigation
import java.io.Serializable

object FeatureStarter : FeatureANavigation, FeatureBNavigation, FeatureCNavigation, Serializable {

	override fun navigateToA(context: Context) {
		val intent = Intent(context, FeatureAActivity::class.java)
		intent.putExtra(EXTRA_FEATURE_A_NAVIGATOR, this)
		context.startActivity(intent)
	}

	override fun navigateToB(context: Context) {
		val intent = Intent(context, FeatureBActivity::class.java)
		intent.putExtra(EXTRA_FEATURE_B_NAVIGATOR, this)
		context.startActivity(intent)
	}

	override fun navigateToC(context: Context) {
		val intent = Intent(context, FeatureCActivity::class.java)
		intent.putExtra(EXTRA_FEATURE_C_NAVIGATOR, this)
		context.startActivity(intent)
	}
}