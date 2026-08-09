package ge.yet3.blokblast.ads

import androidx.compose.runtime.Composable

/**
 * Ads disabled: always behaves as "no ad available" — [onDismiss] fires
 * immediately so the caller's post-ad flow (e.g. revive) still proceeds.
 */
@Composable
actual fun rememberGameOverInterstitial(): GameOverInterstitial {
    return GameOverInterstitial(
        show = { onDismiss -> onDismiss() },
    )
}
