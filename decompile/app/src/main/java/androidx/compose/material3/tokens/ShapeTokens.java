package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p003ui.graphics.RectangleShapeKt;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: ShapeTokens.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006¨\u0006\u001d"}, m7105d2 = {"Landroidx/compose/material3/tokens/ShapeTokens;", "", "()V", "CornerExtraLarge", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getCornerExtraLarge", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "CornerExtraLargeTop", "getCornerExtraLargeTop", "CornerExtraSmall", "getCornerExtraSmall", "CornerExtraSmallTop", "getCornerExtraSmallTop", "CornerFull", "getCornerFull", "CornerLarge", "getCornerLarge", "CornerLargeEnd", "getCornerLargeEnd", "CornerLargeTop", "getCornerLargeTop", "CornerMedium", "getCornerMedium", "CornerNone", "Landroidx/compose/ui/graphics/Shape;", "getCornerNone", "()Landroidx/compose/ui/graphics/Shape;", "CornerSmall", "getCornerSmall", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nShapeTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShapeTokens.kt\nandroidx/compose/material3/tokens/ShapeTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,62:1\n164#2:63\n164#2:64\n164#2:65\n164#2:66\n164#2:67\n164#2:68\n164#2:69\n164#2:70\n164#2:71\n164#2:72\n164#2:73\n164#2:74\n164#2:75\n164#2:76\n164#2:77\n164#2:78\n164#2:79\n164#2:80\n164#2:81\n164#2:82\n164#2:83\n*S KotlinDebug\n*F\n+ 1 ShapeTokens.kt\nandroidx/compose/material3/tokens/ShapeTokens\n*L\n27#1:63\n30#1:64\n31#1:65\n32#1:66\n33#1:67\n35#1:68\n37#1:69\n38#1:70\n39#1:71\n40#1:72\n43#1:73\n46#1:74\n47#1:75\n48#1:76\n49#1:77\n53#1:78\n54#1:79\n55#1:80\n56#1:81\n58#1:82\n60#1:83\n*E\n"})
/* loaded from: classes3.dex */
public final class ShapeTokens {
    public static final int $stable = 0;

    @NotNull
    private static final RoundedCornerShape CornerExtraLarge;

    @NotNull
    private static final RoundedCornerShape CornerExtraLargeTop;

    @NotNull
    private static final RoundedCornerShape CornerExtraSmall;

    @NotNull
    private static final RoundedCornerShape CornerExtraSmallTop;

    @NotNull
    private static final RoundedCornerShape CornerLarge;

    @NotNull
    private static final RoundedCornerShape CornerLargeEnd;

    @NotNull
    private static final RoundedCornerShape CornerLargeTop;

    @NotNull
    public static final ShapeTokens INSTANCE = new ShapeTokens();

    @NotNull
    private static final RoundedCornerShape CornerFull = RoundedCornerShapeKt.getCircleShape();

    @NotNull
    private static final RoundedCornerShape CornerMedium = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(C2046Dp.m13666constructorimpl((float) 12.0d));

    @NotNull
    private static final Shape CornerNone = RectangleShapeKt.getRectangleShape();

    @NotNull
    private static final RoundedCornerShape CornerSmall = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(C2046Dp.m13666constructorimpl((float) 8.0d));

    private ShapeTokens() {
    }

    @NotNull
    public final RoundedCornerShape getCornerExtraLarge() {
        return CornerExtraLarge;
    }

    @NotNull
    public final RoundedCornerShape getCornerExtraLargeTop() {
        return CornerExtraLargeTop;
    }

    @NotNull
    public final RoundedCornerShape getCornerExtraSmall() {
        return CornerExtraSmall;
    }

    @NotNull
    public final RoundedCornerShape getCornerExtraSmallTop() {
        return CornerExtraSmallTop;
    }

    @NotNull
    public final RoundedCornerShape getCornerFull() {
        return CornerFull;
    }

    @NotNull
    public final RoundedCornerShape getCornerLarge() {
        return CornerLarge;
    }

    @NotNull
    public final RoundedCornerShape getCornerLargeEnd() {
        return CornerLargeEnd;
    }

    @NotNull
    public final RoundedCornerShape getCornerLargeTop() {
        return CornerLargeTop;
    }

    @NotNull
    public final RoundedCornerShape getCornerMedium() {
        return CornerMedium;
    }

    @NotNull
    public final Shape getCornerNone() {
        return CornerNone;
    }

    @NotNull
    public final RoundedCornerShape getCornerSmall() {
        return CornerSmall;
    }

    static {
        float f = (float) 28.0d;
        CornerExtraLarge = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(C2046Dp.m13666constructorimpl(f));
        float f2 = (float) 0.0d;
        CornerExtraLargeTop = RoundedCornerShapeKt.m8393RoundedCornerShapea9UjIt4(C2046Dp.m13666constructorimpl(f), C2046Dp.m13666constructorimpl(f), C2046Dp.m13666constructorimpl(f2), C2046Dp.m13666constructorimpl(f2));
        float f3 = (float) 4.0d;
        CornerExtraSmall = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(C2046Dp.m13666constructorimpl(f3));
        CornerExtraSmallTop = RoundedCornerShapeKt.m8393RoundedCornerShapea9UjIt4(C2046Dp.m13666constructorimpl(f3), C2046Dp.m13666constructorimpl(f3), C2046Dp.m13666constructorimpl(f2), C2046Dp.m13666constructorimpl(f2));
        float f4 = (float) 16.0d;
        CornerLarge = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(C2046Dp.m13666constructorimpl(f4));
        CornerLargeEnd = RoundedCornerShapeKt.m8393RoundedCornerShapea9UjIt4(C2046Dp.m13666constructorimpl(f2), C2046Dp.m13666constructorimpl(f4), C2046Dp.m13666constructorimpl(f4), C2046Dp.m13666constructorimpl(f2));
        CornerLargeTop = RoundedCornerShapeKt.m8393RoundedCornerShapea9UjIt4(C2046Dp.m13666constructorimpl(f4), C2046Dp.m13666constructorimpl(f4), C2046Dp.m13666constructorimpl(f2), C2046Dp.m13666constructorimpl(f2));
    }
}
