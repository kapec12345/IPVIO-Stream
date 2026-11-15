# K-019 – Account expiry on Home

The TV owner wants to see when the active IPTV account expires without opening Settings. Keep the information visible at the bottom of Home when scrolling the content, and preserve remote focus and the available space for the rows.

HomeScreen reserves a footer for the selected playlist. AccountExpiryFooter reads the selected Xtream provider's account information on a background thread and renders the date in the selected language and time zone. It reuses results for one hour and retries transient failures after five minutes. State for different accounts is kept separate. The footer uses distinct messages for an unpublished date and a connection failure; it does not infer a lifetime subscription from a missing date. Pure M3U files without an Xtream login do not expose account information through this interface.

XtreamApi reuses the normal account endpoint. XtreamLogic interprets a numeric timestamp or returns an unknown date; XtreamLogicTest covers seconds, milliseconds and absent or malformed values. German, English and Polish labels use the app's existing dictionaries.

## Verification and status

Completed. All 165 tests in the 22 focused suites passed. The preview APK passed signature and integrity checks, installed over 1.4.17-pl and matched the APK on the Philips by SHA-256. The footer displayed the same local date and time as the provider account response. Scrolling changed the visible home rows and left both footer fields in the same bottom position. The refreshed catalog still had every live route under Live TV.
