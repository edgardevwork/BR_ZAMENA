package androidx.compose.foundation;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExcludeFromSystemGesture.android.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¨\u0006\u0006"}, m7105d2 = {"excludeFromSystemGesture", "Landroidx/compose/ui/Modifier;", PomReader.EXCLUSION, "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@JvmName(name = "ExcludeFromSystemGestureKt")
/* loaded from: classes.dex */
public final class ExcludeFromSystemGestureKt {
    @Deprecated(message = "Use systemGestureExclusion", replaceWith = @ReplaceWith(expression = "systemGestureExclusion", imports = {}))
    @NotNull
    public static final Modifier excludeFromSystemGesture(@NotNull Modifier modifier) {
        return SystemGestureExclusionKt.systemGestureExclusion(modifier);
    }

    @Deprecated(message = "Use systemGestureExclusion", replaceWith = @ReplaceWith(expression = "systemGestureExclusion", imports = {}))
    @NotNull
    public static final Modifier excludeFromSystemGesture(@NotNull Modifier modifier, @NotNull Function1<? super LayoutCoordinates, Rect> function1) {
        return SystemGestureExclusionKt.systemGestureExclusion(modifier, function1);
    }
}
