# K-018 – Keep live channels out of Movies

## Goal and acceptance

Live movie channels such as CANAL+ Premium belong in Live TV and the programme guide. On-demand films still belong in Movies, even in the same provider category. The change must apply to previously downloaded playlists and preserve the original station names and guide IDs.

## Implementation

Models.kt examines explicit live stream paths before category keywords and episode-like names. PlaylistStore.kt rebuilds older catalogs from the stored compressed playlist with the current language and content filters. The playlist cache now records classification revision 7 and continues to read older layouts. When only the older binary survives, explicit live movie entries are corrected before content filtering. Full playlist metadata can be recovered when the original playlist is available. The normal refresh continues to carry movie arrival dates forward. PlaylistCacheTest.kt covers mixed groups, guide IDs, catch-up, live-only and VOD-only filtering, and old binary-only catalogs.

Before updating the Philips, 78 live streams in the PL| FILMOWE group were stored as movies, including the HD and FHD variants of CANAL+ Premium.

## Verification and status

Completed on the Philips. The updated catalog contains 788 live entries, 16,214 movie entries and 1,531 series. Every movie entry points to the provider's movie route. All 788 live routes are classified as Live TV. The guide's PL| FILMOWE category displays both PL| CANAL+ PREMIUM FHD and PL| CANAL+ PREMIUM HD. The FHD variant retained its guide ID. In the same “premium” movie search, CANAL+ Premium and FilmBox Premium disappeared and the Prime MMA 6 recording remained.

All 164 focused tests passed. In the full suite, 404 of 406 tests passed. PhoneImportTest and PhoneTransferTest reported the pre-existing local socket resets. The installed 1.4.17-pl package matched the distributable by SHA-256.
