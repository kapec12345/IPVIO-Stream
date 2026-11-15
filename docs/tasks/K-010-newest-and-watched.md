# K-010 – Latest catalog arrivals and separate viewing histories

Kino begins the movie and series areas with a newly added title and the new-arrivals shelf. The next shelf shows that area's viewing history. It uses the current profile, keeps playback order, lists a series by title and has a separate empty state for each area. The default home layout places new films and series below the navigation tiles. An explicitly saved home layout retains its order.

New-arrivals ordering uses a provider's added timestamp when available. A successful playlist refresh compares the new snapshot with the previous IDs to date newly observed titles. Existing undated titles use the provider's new-arrivals category followed by provider order. Changing the language/content selection establishes a baseline for newly visible titles. The version 6 playlist cache stores the timestamps; versions 3–5 can still be read. This change keeps the configured refresh schedule.

Verified the upgrade on the Philips with the existing collection. Both area screens showed Recently added as their first shelf, followed by the corresponding history. The movie shelf showed its localized empty state and the series shelf exposed its own Show all action. Tests cover timestamp parsing and cache round-trip, existing v5 IDs, new language selections and catalog ordering.
