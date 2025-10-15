package androidx.compose.material3;

import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppBar.kt */
@ExperimentalMaterial3Api
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\bg\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\u0005\"\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0005\"\u0004\b\f\u0010\tR\u0018\u0010\r\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0005\"\u0004\b\u000f\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m7105d2 = {"Landroidx/compose/material3/BottomAppBarState;", "", "collapsedFraction", "", "getCollapsedFraction", "()F", "contentOffset", "getContentOffset", "setContentOffset", "(F)V", "heightOffset", "getHeightOffset", "setHeightOffset", "heightOffsetLimit", "getHeightOffsetLimit", "setHeightOffsetLimit", "Companion", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public interface BottomAppBarState {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    float getCollapsedFraction();

    float getContentOffset();

    float getHeightOffset();

    float getHeightOffsetLimit();

    void setContentOffset(float f);

    void setHeightOffset(float f);

    void setHeightOffsetLimit(float f);

    /* compiled from: AppBar.kt */
    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"Landroidx/compose/material3/BottomAppBarState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/BottomAppBarState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final Saver<BottomAppBarState, ?> Saver = ListSaverKt.listSaver(new Function2<SaverScope, BottomAppBarState, List<? extends Float>>() { // from class: androidx.compose.material3.BottomAppBarState$Companion$Saver$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final List<Float> invoke(@NotNull SaverScope saverScope, @NotNull BottomAppBarState bottomAppBarState) {
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(bottomAppBarState.getHeightOffsetLimit()), Float.valueOf(bottomAppBarState.getHeightOffset()), Float.valueOf(bottomAppBarState.getContentOffset())});
            }
        }, new Function1<List<? extends Float>, BottomAppBarState>() { // from class: androidx.compose.material3.BottomAppBarState$Companion$Saver$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ BottomAppBarState invoke(List<? extends Float> list) {
                return invoke2((List<Float>) list);
            }

            @Nullable
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final BottomAppBarState invoke2(@NotNull List<Float> list) {
                return AppBarKt.BottomAppBarState(list.get(0).floatValue(), list.get(1).floatValue(), list.get(2).floatValue());
            }
        });

        private Companion() {
        }

        @NotNull
        public final Saver<BottomAppBarState, ?> getSaver() {
            return Saver;
        }
    }
}
