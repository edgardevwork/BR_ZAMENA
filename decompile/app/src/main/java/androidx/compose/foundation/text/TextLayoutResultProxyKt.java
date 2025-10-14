package androidx.compose.foundation.text;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import kotlin.Metadata;

/* compiled from: TextLayoutResultProxy.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, m7105d2 = {"coerceIn", "Landroidx/compose/ui/geometry/Offset;", "rect", "Landroidx/compose/ui/geometry/Rect;", "coerceIn-3MmeM6k", "(JLandroidx/compose/ui/geometry/Rect;)J", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class TextLayoutResultProxyKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m8503coerceIn3MmeM6k(long j, Rect rect) {
        float right;
        float bottom;
        if (Offset.m11099getXimpl(j) < rect.getLeft()) {
            right = rect.getLeft();
        } else {
            right = Offset.m11099getXimpl(j) > rect.getRight() ? rect.getRight() : Offset.m11099getXimpl(j);
        }
        if (Offset.m11100getYimpl(j) < rect.getTop()) {
            bottom = rect.getTop();
        } else {
            bottom = Offset.m11100getYimpl(j) > rect.getBottom() ? rect.getBottom() : Offset.m11100getYimpl(j);
        }
        return OffsetKt.Offset(right, bottom);
    }
}
