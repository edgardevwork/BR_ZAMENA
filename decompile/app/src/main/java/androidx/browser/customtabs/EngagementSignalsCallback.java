package androidx.browser.customtabs;

import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public interface EngagementSignalsCallback {
    default void onGreatestScrollPercentageIncreased(@IntRange(from = 1, m10to = 100) int i, @NonNull Bundle bundle) {
    }

    default void onSessionEnded(boolean z, @NonNull Bundle bundle) {
    }

    default void onVerticalScrollEvent(boolean z, @NonNull Bundle bundle) {
    }
}
