package androidx.compose.p003ui.draw;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.graphics.RectangleShapeKt;
import androidx.compose.p003ui.graphics.RenderEffectKt;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.TileMode;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: Blur.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, m7105d2 = {"blur", "Landroidx/compose/ui/Modifier;", "radius", "Landroidx/compose/ui/unit/Dp;", "edgeTreatment", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "blur-F8QBwvs", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "radiusX", "radiusY", "blur-1fqS-gw", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBlur.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,154:1\n154#2:155\n*S KotlinDebug\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n*L\n112#1:155\n*E\n"})
/* loaded from: classes4.dex */
public final class BlurKt {
    /* renamed from: blur-1fqS-gw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m10993blur1fqSgw$default(Modifier modifier, float f, float f2, BlurredEdgeTreatment blurredEdgeTreatment, int i, Object obj) {
        if ((i & 4) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m10996boximpl(BlurredEdgeTreatment.INSTANCE.m11003getRectangleGoahg());
        }
        return m10992blur1fqSgw(modifier, f, f2, blurredEdgeTreatment.m11002unboximpl());
    }

    @Stable
    @NotNull
    /* renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final Modifier m10992blur1fqSgw(@NotNull Modifier modifier, final float f, final float f2, @NotNull final Shape shape) {
        final boolean z;
        final int iM11713getDecal3opZhB0;
        if (shape != null) {
            iM11713getDecal3opZhB0 = TileMode.INSTANCE.m11712getClamp3opZhB0();
            z = true;
        } else {
            z = false;
            iM11713getDecal3opZhB0 = TileMode.INSTANCE.m11713getDecal3opZhB0();
        }
        float f3 = 0;
        return ((C2046Dp.m13665compareTo0680j_4(f, C2046Dp.m13666constructorimpl(f3)) <= 0 || C2046Dp.m13665compareTo0680j_4(f2, C2046Dp.m13666constructorimpl(f3)) <= 0) && !z) ? modifier : GraphicsLayerModifierKt.graphicsLayer(modifier, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.ui.draw.BlurKt$blur$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull GraphicsLayerScope graphicsLayerScope) {
                float fMo7874toPx0680j_4 = graphicsLayerScope.mo7874toPx0680j_4(f);
                float fMo7874toPx0680j_42 = graphicsLayerScope.mo7874toPx0680j_4(f2);
                graphicsLayerScope.setRenderEffect((fMo7874toPx0680j_4 <= 0.0f || fMo7874toPx0680j_42 <= 0.0f) ? null : RenderEffectKt.m11647BlurEffect3YTHUZs(fMo7874toPx0680j_4, fMo7874toPx0680j_42, iM11713getDecal3opZhB0));
                Shape rectangleShape = shape;
                if (rectangleShape == null) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                graphicsLayerScope.setShape(rectangleShape);
                graphicsLayerScope.setClip(z);
            }
        });
    }

    /* renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m10995blurF8QBwvs$default(Modifier modifier, float f, BlurredEdgeTreatment blurredEdgeTreatment, int i, Object obj) {
        if ((i & 2) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m10996boximpl(BlurredEdgeTreatment.INSTANCE.m11003getRectangleGoahg());
        }
        return m10994blurF8QBwvs(modifier, f, blurredEdgeTreatment.m11002unboximpl());
    }

    @Stable
    @NotNull
    /* renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final Modifier m10994blurF8QBwvs(@NotNull Modifier modifier, float f, @NotNull Shape shape) {
        return m10992blur1fqSgw(modifier, f, f, shape);
    }
}
