package ge.yet3.blokblast.ads

/**
 * Ads disabled on Android: no-op.
 */
actual object AdsManager {
    actual fun requestConsentAndAds() {
        // Intentionally empty — ads removed.
    }
}
