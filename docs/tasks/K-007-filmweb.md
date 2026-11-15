# K-007 – Filmweb community ratings

Show the community score out of ten and the number of votes in movie and series details. A stable cinema preview can request one title after a delay. The integration uses the public responses from the Filmweb website's live search, film preview and rating routes. This is an unofficial integration and depends on those response formats.

Filmweb.kt matches a normalized title and media type. For remakes it requires a unique matching release year. Missing votes, inconsistent IDs or ambiguous matches never produce a score. A missing match and a temporary network failure have distinct states. Requests are cancellable and serialized. The bounded local cache stores seven days of ratings and one day of confirmed misses. FilmwebRatingLabel.kt renders results independently of the existing IPTV, IMDb and Rotten Tomatoes ratings.

Acceptance checks cover Polish titles, a movie and a series with the same name, a remake, no votes, mismatched IDs, an unavailable source and coexistence with the other scores.

The 1.4.7-pl preview APK passed signature and archive verification. Ten targeted rating, dictionary and Polish locale tests passed. The APK updated 1.4.6 on the Philips. The device displayed 6.8/10 from 12,846 Filmweb votes for Ślepa furia (1989), and 7.5/10 from 10,360 votes for Na wschód od Edenu (2026). Both matched the independent Filmweb responses on 2026-11-15. The existing provider rating remained visible on the series detail screen.
