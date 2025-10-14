package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.ExperimentalFoundationApi;
import kotlin.Metadata;

/* compiled from: SnapLayoutInfoProvider.kt */
@ExperimentalFoundationApi
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m7105d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "", "calculateApproachOffset", "", "initialVelocity", "calculateSnappingOffset", "currentVelocity", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public interface SnapLayoutInfoProvider {
    float calculateApproachOffset(float initialVelocity);

    float calculateSnappingOffset(float currentVelocity);
}
