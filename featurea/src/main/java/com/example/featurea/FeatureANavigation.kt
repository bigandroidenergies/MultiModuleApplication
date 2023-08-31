package com.example.featurea

import android.content.Context

const val EXTRA_FEATURE_A_NAVIGATOR = "EXTRA_FEATURE_A_NAVIGATOR"

interface FeatureANavigation {
	fun navigateToB(context: Context)
}