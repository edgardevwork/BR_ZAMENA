package androidx.compose.foundation.layout;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: FlowLayout.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, m7105d2 = {"Landroidx/compose/foundation/layout/FlowResult;", "", "mainAxisTotalSize", "", "crossAxisTotalSize", FirebaseAnalytics.Param.ITEMS, "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "(IILandroidx/compose/runtime/collection/MutableVector;)V", "getCrossAxisTotalSize", "()I", "getItems", "()Landroidx/compose/runtime/collection/MutableVector;", "getMainAxisTotalSize", "foundation-layout_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class FlowResult {
    public static final int $stable = MutableVector.$stable;
    private final int crossAxisTotalSize;

    @NotNull
    private final MutableVector<RowColumnMeasureHelperResult> items;
    private final int mainAxisTotalSize;

    public FlowResult(int i, int i2, @NotNull MutableVector<RowColumnMeasureHelperResult> mutableVector) {
        this.mainAxisTotalSize = i;
        this.crossAxisTotalSize = i2;
        this.items = mutableVector;
    }

    public final int getMainAxisTotalSize() {
        return this.mainAxisTotalSize;
    }

    public final int getCrossAxisTotalSize() {
        return this.crossAxisTotalSize;
    }

    @NotNull
    public final MutableVector<RowColumnMeasureHelperResult> getItems() {
        return this.items;
    }
}
