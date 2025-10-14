package androidx.compose.p003ui.graphics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: GraphicsLayerScope.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0007\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, m7105d2 = {"DefaultCameraDistance", "", "DefaultShadowColor", "Landroidx/compose/ui/graphics/Color;", "getDefaultShadowColor", "()J", "J", "GraphicsLayerScope", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class GraphicsLayerScopeKt {
    public static final float DefaultCameraDistance = 8.0f;
    private static final long DefaultShadowColor = Color.INSTANCE.m11366getBlack0d7_KjU();

    public static final long getDefaultShadowColor() {
        return DefaultShadowColor;
    }

    @NotNull
    public static final GraphicsLayerScope GraphicsLayerScope() {
        return new ReusableGraphicsLayerScope();
    }
}
