package com.app.common.config

/**
 * Single source of truth for store-listing identifiers and related
 * release-time constants.
 *
 * Note: ads have been removed on Android. The iOS AdMob unit IDs below are
 * still referenced by the iOS actuals in `composeApp/src/iosMain` — leave
 * them as-is unless ads are also removed there.
 */
object AppConfig {

    // ── Store listings ─────────────────────────────────────────────────────
    /** Play Store package name — also used to build `market://` deeplinks. */
    const val ANDROID_PACKAGE_NAME: String = "ge.yet.blokblast"

    /** Numeric App Store ID (from App Store Connect). */
    // TODO: replace with the real App Store ID once provisioned.
    const val IOS_APP_STORE_ID: String = "6765924581"

    // ── AdMob (iOS only) ─────────────────────────────────────────────────────
    const val BANNER_UNIT_ID_IOS: String = "ca-app-pub-1829375480261561/9561597181"
    const val GAME_OVER_INTERSTITIAL_UNIT_ID_IOS: String =
        "ca-app-pub-1829375480261561/5009161004"

    // ── In-app review ──────────────────────────────────────────────────────
    /**
     * Minimum score at which the OS-level in-app review prompt is requested
     * on a new personal best. The store SDK additionally throttles requests,
     * so crossing this threshold often will not spam the user.
     */
    const val REVIEW_MIN_SCORE: Int = 500

    /**
     * Additional score the user must beat their previous best by before the
     * in-app review prompt is requested again. Combined with [REVIEW_MIN_SCORE]
     * and [REVIEW_MAX_PROMPTS], this keeps the dialog from feeling pushy.
     */
    const val REVIEW_BEST_SCORE_DELTA: Long = 1000L

    /**
     * Hard lifetime cap on how many times the in-app review prompt may be
     * triggered for a given user. The OS SDK already throttles further, but
     * this guarantees we never ask more than this many times even on devices
     * where its quota has reset.
     */
    const val REVIEW_MAX_PROMPTS: Int = 2

    // ── Legal ──────────────────────────────────────────────────────────────
    /** Public privacy-policy URL linked from the Settings screen. */
    const val PRIVACY_POLICY_URL: String =
        "https://github.com/yet300/block_blast/blob/main/privacy_policy.md"

    /** Public source-code repository linked from the Settings screen. */
    const val GITHUB_URL: String =
        "https://github.com/fan-world-me/BlockBlast"

    // ── Drag & Drop ────────────────────────────────────────────────────────
    /**
     * Multiplier for drag speed. Values > 1.0 make the piece move faster than
     * the finger relative to the pickup point. 1.15 is a good balance for
     * reaching screen corners on large phones.
     */
    const val DRAG_SENSITIVITY: Float = 1.15f
}
