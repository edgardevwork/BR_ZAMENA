package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.Modifier;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* compiled from: FocusOrderModifier.kt */
@Deprecated(message = "Use Modifier.focusProperties() instead")
@Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, m7105d2 = {"Landroidx/compose/ui/focus/FocusOrderModifier;", "Landroidx/compose/ui/Modifier$Element;", "populateFocusOrder", "", "focusOrder", "Landroidx/compose/ui/focus/FocusOrder;", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public interface FocusOrderModifier extends Modifier.Element {
    void populateFocusOrder(@NotNull FocusOrder focusOrder);

    /* compiled from: FocusOrderModifier.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull FocusOrderModifier focusOrderModifier, @NotNull Function1<? super Modifier.Element, Boolean> function1) {
            return FocusOrderModifier.super.all(function1);
        }

        @Deprecated
        public static boolean any(@NotNull FocusOrderModifier focusOrderModifier, @NotNull Function1<? super Modifier.Element, Boolean> function1) {
            return FocusOrderModifier.super.any(function1);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull FocusOrderModifier focusOrderModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
            return (R) FocusOrderModifier.super.foldIn(r, function2);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull FocusOrderModifier focusOrderModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
            return (R) FocusOrderModifier.super.foldOut(r, function2);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull FocusOrderModifier focusOrderModifier, @NotNull Modifier modifier) {
            return FocusOrderModifier.super.then(modifier);
        }
    }
}
