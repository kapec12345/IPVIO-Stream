# K-008 – Filmweb scores and release years on Kino posters

Movie and series tiles in Kino display the year independently of the Filmweb community score. The overlay is part of the card and adds no remote-control focus target. It is used in browsing rows and grids, categories, favorites, search results and continue-watching cards. It uses the existing title matching and caching in Filmweb.kt. A confidently matched Filmweb entry can supply the year when the local catalogue has none. Missing or ambiguous scores are omitted.

KinoPosterInfo waits until a card is visible and has remained on screen briefly. Source lookups for poster artwork and provider year share two bounded locks. Fresh cache entries can be read independently of a pending network request. Entries from 1.4.7 remain readable and legacy yearless entries are refreshed when a release year is needed.

Acceptance checks cover film and series rows without opening details, a known year without a rating, remote navigation, and retaining the selected look and playlist across the update.

Installed 1.4.8-pl (13) over 1.4.7 on the Philips after verifying the APK signature and archive. All 13 targeted tests passed. Physical TV checks found Ślepa furia (1989, Filmweb 6.8) and Wściekłe pięści (1972, 7.4) on movie posters. The series row included Na wschód od Edenu (2026, 7.5) and Akademia Minerwy (2026, 6.5). The movie documentary tile displayed 2021 alone. The overlays were visible while navigating between posters without opening details.
