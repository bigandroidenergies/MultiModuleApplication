package com.example.featurec

import android.content.Context

const val EXTRA_FEATURE_C_NAVIGATOR = "EXTRA_FEATURE_C_NAVIGATOR"

interface FeatureCNavigation {
	fun navigateToA(context: Context)
	fun navigateToB(context: Context)
}