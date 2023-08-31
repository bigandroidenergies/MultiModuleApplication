package com.example.featureb

import android.content.Context

const val EXTRA_FEATURE_B_NAVIGATOR = "EXTRA_FEATURE_B_NAVIGATOR"

interface FeatureBNavigation {
	fun navigateToC(context: Context)
}