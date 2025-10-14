package androidx.compose.foundation;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.CacheDrawScope;
import androidx.compose.p003ui.draw.DrawResult;
import androidx.compose.p003ui.geometry.CornerRadius;
import androidx.compose.p003ui.geometry.CornerRadiusKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.RoundRect;
import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.PathOperation;
import androidx.compose.p003ui.graphics.RectangleShapeKt;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.graphics.drawscope.Fill;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Border.kt */
@Metadata(m7104d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001e\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u000b\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u001a.\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a0\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001cH\u0002\u001a>\u0010\u001d\u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010%\u001a\u00020&*\u00020&2\u0006\u0010'\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, m7105d2 = {"createInsetRoundedRect", "Landroidx/compose/ui/geometry/RoundRect;", "widthPx", "", "roundedRect", "createRoundRectPath", "Landroidx/compose/ui/graphics/Path;", "targetPath", "strokeWidth", "fillArea", "", OutlinedTextFieldKt.BorderId, "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/BorderStroke;", "shape", "Landroidx/compose/ui/graphics/Shape;", "width", "Landroidx/compose/ui/unit/Dp;", "brush", "Landroidx/compose/ui/graphics/Brush;", "border-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "border-xT4_qwU", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "drawContentWithoutBorder", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "drawRectBorder", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "borderSize", "Landroidx/compose/ui/geometry/Size;", "strokeWidthPx", "drawRectBorder-NsqcLGU", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;JJZF)Landroidx/compose/ui/draw/DrawResult;", "shrink", "Landroidx/compose/ui/geometry/CornerRadius;", "value", "shrink-Kibmq7A", "(JF)J", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class BorderKt {
    public static /* synthetic */ Modifier border$default(Modifier modifier, BorderStroke borderStroke, Shape shape, int i, Object obj) {
        if ((i & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return border(modifier, borderStroke, shape);
    }

    @Stable
    @NotNull
    public static final Modifier border(@NotNull Modifier modifier, @NotNull BorderStroke borderStroke, @NotNull Shape shape) {
        return m7784borderziNgDLE(modifier, borderStroke.getWidth(), borderStroke.getBrush(), shape);
    }

    /* renamed from: border-xT4_qwU$default */
    public static /* synthetic */ Modifier m7783borderxT4_qwU$default(Modifier modifier, float f, long j, Shape shape, int i, Object obj) {
        if ((i & 4) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m7782borderxT4_qwU(modifier, f, j, shape);
    }

    @Stable
    @NotNull
    /* renamed from: border-xT4_qwU */
    public static final Modifier m7782borderxT4_qwU(@NotNull Modifier modifier, float f, long j, @NotNull Shape shape) {
        return m7784borderziNgDLE(modifier, f, new SolidColor(j, null), shape);
    }

    @Stable
    @NotNull
    /* renamed from: border-ziNgDLE */
    public static final Modifier m7784borderziNgDLE(@NotNull Modifier modifier, float f, @NotNull Brush brush, @NotNull Shape shape) {
        return modifier.then(new BorderModifierNodeElement(f, brush, shape, null));
    }

    /* compiled from: Border.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.BorderKt$drawContentWithoutBorder$1 */
    /* loaded from: classes3.dex */
    public static final class C03801 extends Lambda implements Function1<ContentDrawScope, Unit> {
        public static final C03801 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
            invoke2(contentDrawScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull ContentDrawScope contentDrawScope) {
            contentDrawScope.drawContent();
        }
    }

    public static final DrawResult drawContentWithoutBorder(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawWithContent(C03801.INSTANCE);
    }

    /* renamed from: drawRectBorder-NsqcLGU */
    public static final DrawResult m7785drawRectBorderNsqcLGU(CacheDrawScope cacheDrawScope, final Brush brush, long j, long j2, boolean z, float f) {
        final long jM11115getZeroF1C5BW0 = z ? Offset.INSTANCE.m11115getZeroF1C5BW0() : j;
        final long jM11006getSizeNHjbRc = z ? cacheDrawScope.m11006getSizeNHjbRc() : j2;
        final DrawStyle stroke = z ? Fill.INSTANCE : new Stroke(f, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawRectBorder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                DrawScope.m11883drawRectAsUm42w$default(contentDrawScope, brush, jM11115getZeroF1C5BW0, jM11006getSizeNHjbRc, 0.0f, stroke, null, 0, 104, null);
            }
        });
    }

    public static final Path createRoundRectPath(Path path, RoundRect roundRect, float f, boolean z) {
        path.reset();
        path.addRoundRect(roundRect);
        if (!z) {
            Path Path = AndroidPath_androidKt.Path();
            Path.addRoundRect(createInsetRoundedRect(f, roundRect));
            path.mo11232opN5in7k0(path, Path, PathOperation.INSTANCE.m11631getDifferenceb3I0S0c());
        }
        return path;
    }

    private static final RoundRect createInsetRoundedRect(float f, RoundRect roundRect) {
        return new RoundRect(f, f, roundRect.getWidth() - f, roundRect.getHeight() - f, m7786shrinkKibmq7A(roundRect.m11149getTopLeftCornerRadiuskKHJgLs(), f), m7786shrinkKibmq7A(roundRect.m11150getTopRightCornerRadiuskKHJgLs(), f), m7786shrinkKibmq7A(roundRect.m11148getBottomRightCornerRadiuskKHJgLs(), f), m7786shrinkKibmq7A(roundRect.m11147getBottomLeftCornerRadiuskKHJgLs(), f), null);
    }

    /* renamed from: shrink-Kibmq7A */
    public static final long m7786shrinkKibmq7A(long j, float f) {
        return CornerRadiusKt.CornerRadius(Math.max(0.0f, CornerRadius.m11074getXimpl(j) - f), Math.max(0.0f, CornerRadius.m11075getYimpl(j) - f));
    }
}
