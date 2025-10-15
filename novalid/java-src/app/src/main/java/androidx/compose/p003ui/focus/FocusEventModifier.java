package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.Modifier;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* compiled from: FocusEventModifier.kt */
@Deprecated(message = "Use FocusEventModifierNode instead")
@Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, m7105d2 = {"Landroidx/compose/ui/focus/FocusEventModifier;", "Landroidx/compose/ui/Modifier$Element;", "onFocusEvent", "", "focusState", "Landroidx/compose/ui/focus/FocusState;", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public interface FocusEventModifier extends Modifier.Element {
    void onFocusEvent(@NotNull FocusState focusState);

    /* compiled from: FocusEventModifier.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull FocusEventModifier focusEventModifier, @NotNull Function1<? super Modifier.Element, Boolean> function1) {
            return FocusEventModifier.super.all(function1);
        }

        @Deprecated
        public static boolean any(@NotNull FocusEventModifier focusEventModifier, @NotNull Function1<? super Modifier.Element, Boolean> function1) {
            return FocusEventModifier.super.any(function1);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull FocusEventModifier focusEventModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
            return (R) FocusEventModifier.super.foldIn(r, function2);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull FocusEventModifier focusEventModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
            return (R) FocusEventModifier.super.foldOut(r, function2);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull FocusEventModifier focusEventModifier, @NotNull Modifier modifier) {
            return FocusEventModifier.super.then(modifier);
        }
    }
}
