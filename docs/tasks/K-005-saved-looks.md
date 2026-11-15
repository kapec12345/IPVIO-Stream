# K-005 – In-app catalogue layouts and saved looks

Settings → Design and color offers Classic and VOD and a collection of named looks. A look saves its catalogue layout, color preset or custom color pair, background, UI scale and motion. The color controls on the same page edit the current appearance. Saving as new creates a snapshot. Selecting a name applies its values immediately. Updating, renaming and removing a saved look are separate actions.

The active layout and saved looks are stored in the existing profile-scoped ipvio_settings preferences. Existing profiles without these keys start in Classic in the normal app and in VOD in the separate preview package. Switching layout preserves the active palette. Selecting a saved look writes its values and the selected name in the same preferences edit. Renaming preserves the snapshot, and deletion leaves the current appearance in use.

The settings page and both layouts share the existing catalogue views, playback handlers and focus targets. The chosen layout controls the live overview, poster captions, grid density and catalogue typography. The global language, playlist and player settings are independent of a saved look.

## Validation

The 1.4.5-pl preview APK built successfully and passed Android signature and ZIP checks. It shares the package ID and signing certificate of the 1.4.4-pl preview. All four saved-look regression tests passed. The full run passed 369 of 371 tests, with connection resets in the existing phone import and phone transfer tests. The local browser preview also passed checks for saving, applying, reloading, updating, renaming and deleting looks. On 2026-11-15 the 1.4.5-pl preview was installed on the Philips UHD Android TV. In demo mode, directional and OK key events navigated settings and the TV keyboard to save Kino (VOD, Night Owl) and Dom (Classic, Deep Sea). Selecting the two names changed the layout and palette. After a cold relaunch, both were available and Kino was still selected. The separate viewer profile isolation check is pending.

## Acceptance on Android TV

1. Save a Classic daytime look. Switch to VOD, pick a different palette and save a second look.
2. Apply each by name and check Live TV, Movies and Series. Check poster row widths in full catalogues and favorites.
3. Restart the app and reopen settings. Confirm both names and the last applied look are still present.
4. Change a named look's colors, save changes, rename it and verify the other look retains its colors. Check that canceling a name edit and rejecting a duplicate name preserve both saved entries.
5. Switch viewer profiles and confirm each has its own collection.
