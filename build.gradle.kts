plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    // ADD THESE TWO LINES:
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.ksp) apply false
}