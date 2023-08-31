# Testing project for multi module application builds

This project has three features A, B and C, just like its counterpart [Single Module Application]([url](https://github.com/bigandroidenergies/SingleModuleApplication)https://github.com/bigandroidenergies/SingleModuleApplication)

In comparison to its counterpart in this project the features are extracted into their own modules and the feature modules does not have a direct dependency to other feature modules. The feature modules are able to navigate to other feature modules via a `FeatureStarter` which lives in the parent `app` module and passed down to the feature activities via intent extras.

Here are some build scans for different test cases:
* [Clean build](https://scans.gradle.com/s/ohdxa6udffqwa/timeline)
* [Incremental build with no change](https://scans.gradle.com/s/ksd74pcs7xx2q/timeline)
* [Incremental build with a new text addition to Feature C](https://scans.gradle.com/s/7iiu22mhzxkpy/timeline)
* [Incremental build with a new text addition to App module](https://scans.gradle.com/s/l2o4trqxy2oew/timeline)
