# K-001: Independent fork identity and updates

## Goal and changes
Prepare kapec12345/IPVIO-Stream for independent development. Keep the display name requested by the maintainer.
- Release application ID: `com.kapec12345.ipviostream`; debug: `com.kapec12345.ipviostream.test`.
- Preserve Kotlin namespace `com.ipvio.stream` and component classes. FileProvider authority follows applicationId; update verification follows the installed package name.
- Built-in update manifest and GitHub API now point to `kapec12345/IPVIO-Stream`.
- Preserve storage keys, licence, attribution, player logic and dependencies.

## Validation and status
Static inspection confirmed dynamic FileProvider authority and package/signature validation. Manifest unchanged. Build and device tests NOT run locally: Java runtime unavailable here. Signing and first release pending; no signing key generated.

## Acceptance tests
Build and install alongside the original, verify separate data, playlist import, playback, recording and phone transfer. Create and securely back up a release signing key outside source control. Build a signed APK and test before publishing with update.json. Test an update signed with the same key, retained settings, and rejection of upstream APKs.

## Risks and documentation
New package means separate storage, not an in-place upgrade. Test backup/restore for data transfer. Existing custom update URLs in restored preferences override defaults; inspect/reset them after import. No APK release has been created by this task. Original Downloader code and upstream download links do not distribute this fork. Use this fork's Releases page for future APKs. In `docs/RELEASE.md`, substitute `kapec12345` for upstream release URLs. Upstream requests separate branding for modified distributions; review name/logo before distribution.
