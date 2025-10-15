package androidx.compose.foundation;

import androidx.compose.p003ui.Modifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Overscroll.kt */
@Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, m7105d2 = {"overscroll", "Landroidx/compose/ui/Modifier;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class OverscrollKt {
    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier overscroll(@NotNull Modifier modifier, @NotNull OverscrollEffect overscrollEffect) {
        return modifier.then(overscrollEffect.getEffectModifier());
    }
}
