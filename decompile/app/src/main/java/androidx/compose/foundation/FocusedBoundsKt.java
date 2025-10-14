package androidx.compose.foundation;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.modifier.ModifierLocalKt;
import androidx.compose.p003ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FocusedBounds.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0007\u001a\u00020\b*\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\"*\u0010\u0000\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m7105d2 = {"ModifierLocalFocusedBoundsObserver", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "getModifierLocalFocusedBoundsObserver", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "onFocusedBoundsChanged", "Landroidx/compose/ui/Modifier;", "onPositioned", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class FocusedBoundsKt {

    @NotNull
    private static final ProvidableModifierLocal<Function1<LayoutCoordinates, Unit>> ModifierLocalFocusedBoundsObserver = ModifierLocalKt.modifierLocalOf(new Function0<Function1<? super LayoutCoordinates, ? extends Unit>>() { // from class: androidx.compose.foundation.FocusedBoundsKt$ModifierLocalFocusedBoundsObserver$1
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Function1<? super LayoutCoordinates, ? extends Unit> invoke() {
            return null;
        }
    });

    @NotNull
    public static final ProvidableModifierLocal<Function1<LayoutCoordinates, Unit>> getModifierLocalFocusedBoundsObserver() {
        return ModifierLocalFocusedBoundsObserver;
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier onFocusedBoundsChanged(@NotNull Modifier modifier, @NotNull Function1<? super LayoutCoordinates, Unit> function1) {
        return modifier.then(new FocusedBoundsObserverElement(function1));
    }
}
