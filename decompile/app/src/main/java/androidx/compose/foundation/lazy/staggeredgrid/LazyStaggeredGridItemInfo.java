package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyStaggeredGridMeasureResult.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0012\u0010\u000b\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0018\u0010\r\u001a\u00020\u000eX¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u00020\u0012X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010\u0082\u0001\u0001\u0014ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, m7105d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "", "contentType", "getContentType", "()Ljava/lang/Object;", FirebaseAnalytics.Param.INDEX, "", "getIndex", "()I", "key", "getKey", "lane", "getLane", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/unit/IntOffset;", "getOffset-nOcc-ac", "()J", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public interface LazyStaggeredGridItemInfo {
    @Nullable
    Object getContentType();

    int getIndex();

    @NotNull
    Object getKey();

    int getLane();

    /* renamed from: getOffset-nOcc-ac, reason: not valid java name */
    long mo8313getOffsetnOccac();

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo8314getSizeYbymL2g();
}
