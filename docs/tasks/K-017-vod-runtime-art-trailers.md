# K-017 – VOD running times, posters and trailer playback

Preview 1.4.16-pl (21) reads the provider’s formatted running time first. If numeric seconds repeat a separate field in minutes, that value is already in minutes. Older cached provider durations are refreshed. On the series detail page the app reads each episode’s format-independent source ID and its running time. Missing values stay empty when no other source supplies an episode duration.

The two low-resolution artwork URLs in the affected playlist have full-size equivalents. Kino tries the verified portrait first, then the original if the download fails. The Filmweb portrait for East of Eden is 500 × 741. The Strife MMA 15 poster from the Grodzisk event venue is 1440 × 1801. Coil on the Philips cached images identical to the reference files, and their proportions were checked on the search cards.

The Trailer button opens a scoped YouTube TV watch link. It can also use the native YouTube URI or another installed handler. It checks for a provider video if the current title metadata has none. When there is no video ID, the link requests YouTube results for the title and trailer. A known provider ID for Paris Has Fallen is replaced by the CANAL+ Polska trailer only when the requested series is Apollo Has Fallen.

## Verification

- 114 tests in 19 focused suites passed. APK signature matched the previous version. The installed base APK on the Philips matched the distributed APK by SHA-256.
- Strefa ognia displayed 1 h 46 min. The provider supplied a formatted time of 01:46:08.
- Apollo w ogniu displayed 43 min for episode 1 and 44 min for episode 2, matching 00:43:31 and 00:44:40 respectively.
- The button in IPVIO played the CANAL+ Polska trailer for Apollo w ogniu in YouTube on the Philips. Playback advanced from 1.3 to 4.5 seconds. The same button played the Netflix trailer for East of Eden and advanced from 1.5 to 4.7 seconds. Trials used the YouTube guest profile.
- The Interstellar film button played the Film Planet video and advanced from 1.9 to 5.1 seconds. Strefa ognia, with no direct trailer, opened the YouTube results for “Strefa ognia zwiastun”.
