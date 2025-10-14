package androidx.compose.p003ui.graphics.drawscope;

import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DensityKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DrawContext.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m7105d2 = {"DefaultDensity", "Landroidx/compose/ui/unit/Density;", "getDefaultDensity", "()Landroidx/compose/ui/unit/Density;", "ui-graphics_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class DrawContextKt {

    @NotNull
    private static final Density DefaultDensity = DensityKt.Density(1.0f, 1.0f);

    @NotNull
    public static final Density getDefaultDensity() {
        return DefaultDensity;
    }
}
