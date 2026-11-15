# K-016 – Filmweb rating for a unique title despite a provider year mismatch

A single exact normalized title of the requested media type can supply a Filmweb score even if the provider year differs. The Filmweb preview must confirm the candidate ID and type. Multiple exact namesakes still require a unique matching year and complete candidate information. A stale negative cache entry from the strict-year matcher is retried after upgrade. Successful cached matches and current negative results retain their existing lifetimes. Displayed catalog years continue to follow the existing provider and metadata rules.

The changes are in Filmweb, FilmwebStore, the focused Filmweb tests and the app version. All 106 tests in 18 targeted suites passed. The 1.4.15-pl (20) preview passed APK integrity and signing checks and installed over 1.4.14-pl on the Philips.

On the TV, the cached miss for Apollo w ogniu with provider year 2024 was replaced by Filmweb ID 10133758, Filmweb year 2026, score 6.01316 from 228 votes. The search poster displayed Filmweb 6,0 and the series details displayed 6,0/10 with 228 votes. The public Filmweb rating matched the on-device result.
