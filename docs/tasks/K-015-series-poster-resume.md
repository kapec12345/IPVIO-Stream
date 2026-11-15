# K-015 – Resume an episode from its history poster

The Recently watched series shelf and its Show all view use the active profile's existing WatchStore entry. A resumable poster shows the episode number, saved time and a progress bar when the duration is known. Entries for the following episode show Next episode. Other posters retain the details action. The same behaviour applies to portrait and landscape cards. The shelf uses a distinct return-focus key because the same title can also appear in Continue watching.

The preview update preserves the application ID, signing certificate and existing on-device data. The APK passed archive and signature verification. All 103 tests in 18 targeted suites passed, including three regression tests for matching series, legacy records and next-episode entries.

On the Philips UHD Android TV, the original preview wrote a checkpoint during playback of Lupin, season 3 episode 1. The update installed in place and preserved it. On the final build the focused history poster showed 02:30. One DPAD_CENTER event opened the player, which showed season 3, episode 1 at 02:30 and then 02:37 during playback. Back restored the same history poster and its updated time of 02:41.
