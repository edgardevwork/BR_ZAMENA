package androidx.compose.p003ui.input.rotary;

import androidx.compose.p003ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: RotaryInputModifier.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u001a\u001e\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0006"}, m7105d2 = {"onPreRotaryScrollEvent", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "", "onRotaryScrollEvent", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class RotaryInputModifierKt {
    @NotNull
    public static final Modifier onRotaryScrollEvent(@NotNull Modifier modifier, @NotNull Function1<? super RotaryScrollEvent, Boolean> function1) {
        return modifier.then(new RotaryInputElement(function1, null));
    }

    @NotNull
    public static final Modifier onPreRotaryScrollEvent(@NotNull Modifier modifier, @NotNull Function1<? super RotaryScrollEvent, Boolean> function1) {
        return modifier.then(new RotaryInputElement(null, function1));
    }
}
