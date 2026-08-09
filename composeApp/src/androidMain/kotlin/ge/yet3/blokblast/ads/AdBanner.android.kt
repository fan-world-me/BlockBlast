package ge.yet3.blokblast.ads

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * Ads disabled: no-op, zero-size. Layout collapses cleanly since callers
 * already treat this as an optional slot.
 */
@Composable
actual fun AdBanner(modifier: Modifier) {
    // Intentionally empty — ads removed.
}
