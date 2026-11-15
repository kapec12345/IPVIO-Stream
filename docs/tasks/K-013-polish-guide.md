# K-013 – Polish guide fallback

An optional switch in Live TV & Guide enables the EPG.OVH standard Polish guide alongside existing XMLTV and Xtream sources. PolishGuide indexes official station names and aliases from the public file, checks configured live channel names, and retains matching programmes for the current viewing window. The public file gives TVN 24 BiS a secondary name shared with TVN 24. Official station names take precedence and ambiguous aliases are skipped. Supplementary programmes must fit entirely between provider slots.

The live list, now/next panels, search and guide grid respond when a new guide arrives. The provider and public source load independently. While the app stays running the public guide is refreshed every 12 hours. After a failed download it retries in 15 minutes. The switch is off until enabled.

The signed 1.4.12-pl preview was installed over the previous release on the Philips. The setting remained enabled after a cold launch. All 84 tests in 14 targeted suites passed. Device checks on 15 November 2026 matched current titles, times and next titles against the public XMLTV feed for PL-VIP| TVN 24 RAW and PL-VIP| TVN24 BIS RAW, both lacking playlist station IDs.

The full guide grid opened from playback. It showed both requested station rows and both 18:00 programmes. Focusing the current TVN 24 cell displayed Fakty po południu, 16:00–18:00.
