# K-012 – IMDb fallback for movies

When Filmweb has no match or community rating, movie posters and details show an explicitly labelled IMDb rating if available. Filmweb scores retain priority. Series and Filmweb sorting keep their existing behavior. A temporary Filmweb failure allows a later retry.

`MovieRatings.kt` resolves the source and checks a supplied IMDb ID or a unique title match with the known release year. `Meta.kt` and `ProviderInfo.kt` preserve original titles and public identifiers. `RatingHttp.kt` shares bounded, cancellable requests with Filmweb. The poster and detail composables format the chosen source and score. Generic provider ratings are excluded. Ambiguous matches can leave a movie without a score.

The preview APK passed signing and archive checks. All 55 tests in 11 targeted suites passed. Version 1.4.11-pl (16) was installed in place on the Philips. In Kino, Frankenstein (1931) showed IMDb 7.7 on both the poster and the title panel. Other visible posters showed Filmweb. The playlist setting for refresh on each launch persisted and the recorded refresh time advanced after the cold start.
