# K-004 – Readable TV browsing

The Live TV home shows the highlighted channel's current program, time and logo above the channel rows. A channel with no current guide entry shows its name and group. The panel is omitted on short viewports to keep the rows reachable. The existing OK and long-OK actions remain on the channel cards. Film and series poster rows show a title before focus. The Polish history heading reads “Ostatnio oglądane”.

Changes are in LiveTab.kt, Components.kt, HomeParts.kt, Visuals.kt, DictPl.kt and app/build.gradle.kts. The normal package identifiers are unchanged. With -PvodPreview=true the debug package is com.kapec12345.ipviostream.vodpreview and the launcher label is IPVIO Podgląd. This is a separate install with its own playlist and history.

## Device acceptance

1. Enter Live TV and move right through one row, then down into the next row. Check the focus ring and banner follow the same channel. Try a channel with no guide entry.
2. Press OK to open a channel and Back to return. Hold OK on a recent channel and on a genre channel to check the existing history and favorite actions.
3. Open Movies and Series. Check titles are readable at rest, including a long title and a missing poster. Check the preview and Show All actions with the remote.
4. Open the side-by-side preview and confirm the previous app is still separately available.

## Catalogue and validation

Movies and Series keep a featured title even when the playlist has no TMDB backdrop. The hero tries the playlist cover before a neutral fallback. The shared poster grid gives Favorites and My List a permanent caption. Search, continue-watching cards, title details and the season/episode selector use larger text and stronger focus contrast. Additional changed files: HomeScreen.kt, DetailScreen.kt and SearchScreen.kt.

The local preview APK assembled successfully. Android package, launcher, version, APK v2 signature and ZIP integrity were verified. Of 367 existing unit tests, 365 passed. The two phone import/transfer socket tests failed with Connection reset on this Mac. Interactive catalogue routing was checked with sample data (movies, shows, season and episode selection, focus on return, list/favorites, search, live and resume). Playback and remote navigation on the Philips are pending.
