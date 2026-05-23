dependencies {
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
}

// Use an integer for version numbers
version = 1

cloudstream {
    // All of these properties are optional, you can safely remove any of them.

    description = "Kuronime"
    authors = listOf("Glicth07")

    /**
    * Status int as one of the following:
    * 0: Down
    * 1: Ok
    * 2: Slow
    * 3: Beta-only
    **/
    status = 1 // Will be 3 if unspecified

    tvTypes = listOf(
        "AnimeMovie",
        "Anime",
        "OVA",
    )
    requiresResources = true
    language = "id"

    // Random CC logo I found
    iconUrl = "https://play-lh.googleusercontent.com/EFMkS1T-8txjLFIl9QxjcTRLa7a7Muv08C04b7ongYgodoY_b2T3GpxzGAQEx-eitfQ=w256"
}

android {
    buildFeatures {
        buildConfig = true
        viewBinding = true
    }
}
