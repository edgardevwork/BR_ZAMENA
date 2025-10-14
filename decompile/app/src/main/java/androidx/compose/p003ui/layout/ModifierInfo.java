package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.Modifier;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LayoutInfo.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m7105d2 = {"Landroidx/compose/ui/layout/ModifierInfo;", "", "modifier", "Landroidx/compose/ui/Modifier;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "extra", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/LayoutCoordinates;Ljava/lang/Object;)V", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "getExtra", "()Ljava/lang/Object;", "getModifier", "()Landroidx/compose/ui/Modifier;", "toString", "", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class ModifierInfo {
    public static final int $stable = 8;

    @NotNull
    private final LayoutCoordinates coordinates;

    @Nullable
    private final Object extra;

    @NotNull
    private final Modifier modifier;

    public ModifierInfo(@NotNull Modifier modifier, @NotNull LayoutCoordinates layoutCoordinates, @Nullable Object obj) {
        this.modifier = modifier;
        this.coordinates = layoutCoordinates;
        this.extra = obj;
    }

    public /* synthetic */ ModifierInfo(Modifier modifier, LayoutCoordinates layoutCoordinates, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(modifier, layoutCoordinates, (i & 4) != 0 ? null : obj);
    }

    @NotNull
    public final Modifier getModifier() {
        return this.modifier;
    }

    @NotNull
    public final LayoutCoordinates getCoordinates() {
        return this.coordinates;
    }

    @Nullable
    public final Object getExtra() {
        return this.extra;
    }

    @NotNull
    public String toString() {
        return "ModifierInfo(" + this.modifier + ", " + this.coordinates + ", " + this.extra + ')';
    }
}
