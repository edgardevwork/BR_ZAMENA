package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SnapPositionInLayout.kt */
@ExperimentalFoundationApi
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bç\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m7105d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "", "position", "", "layoutSize", "itemSize", "beforeContentPadding", "afterContentPadding", "itemIndex", "Companion", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public interface SnapPositionInLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    int position(int layoutSize, int itemSize, int beforeContentPadding, int afterContentPadding, int itemIndex);

    /* compiled from: SnapPositionInLayout.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout$Companion;", "", "()V", "CenterToCenter", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "getCenterToCenter", "()Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final SnapPositionInLayout CenterToCenter = new SnapPositionInLayout() { // from class: androidx.compose.foundation.gestures.snapping.SnapPositionInLayout$Companion$$ExternalSyntheticLambda0
            @Override // androidx.compose.foundation.gestures.snapping.SnapPositionInLayout
            public final int position(int i, int i2, int i3, int i4, int i5) {
                return SnapPositionInLayout.Companion.CenterToCenter$lambda$0(i, i2, i3, i4, i5);
            }
        };

        private Companion() {
        }

        @NotNull
        public final SnapPositionInLayout getCenterToCenter() {
            return CenterToCenter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int CenterToCenter$lambda$0(int i, int i2, int i3, int i4, int i5) {
            return (((i - i3) - i4) / 2) - (i2 / 2);
        }
    }
}
