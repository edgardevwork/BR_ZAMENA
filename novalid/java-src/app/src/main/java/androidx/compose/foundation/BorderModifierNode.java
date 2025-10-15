package androidx.compose.foundation;

import androidx.compose.p003ui.draw.CacheDrawModifierNode;
import androidx.compose.p003ui.draw.CacheDrawScope;
import androidx.compose.p003ui.draw.DrawModifierKt;
import androidx.compose.p003ui.draw.DrawResult;
import androidx.compose.p003ui.geometry.CornerRadius;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.RoundRectKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.BlendMode;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.ClipOp;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.graphics.ImageBitmapConfig;
import androidx.compose.p003ui.graphics.ImageBitmapKt;
import androidx.compose.p003ui.graphics.Outline;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.PathOperation;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawContext;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Border.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ,\u0010\u001e\u001a\u00020\u001f*\u00020 2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002JF\u0010'\u001a\u00020\u001f*\u00020 2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R,\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, m7105d2 = {"Landroidx/compose/foundation/BorderModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "widthParameter", "Landroidx/compose/ui/unit/Dp;", "brushParameter", "Landroidx/compose/ui/graphics/Brush;", "shapeParameter", "Landroidx/compose/ui/graphics/Shape;", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "borderCache", "Landroidx/compose/foundation/BorderCache;", "value", "brush", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "drawWithCacheModifierNode", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "shape", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "width", "getWidth-D9Ej5fM", "()F", "setWidth-0680j_4", "(F)V", "F", "drawGenericBorder", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "outline", "Landroidx/compose/ui/graphics/Outline$Generic;", "fillArea", "", "strokeWidth", "", "drawRoundRectBorder", "Landroidx/compose/ui/graphics/Outline$Rounded;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "borderSize", "Landroidx/compose/ui/geometry/Size;", "drawRoundRectBorder-JqoCqck", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n+ 2 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,516:1\n386#2,26:517\n412#2,4:544\n421#2,6:557\n427#2:584\n428#2,2:593\n1#3:543\n542#4,9:548\n551#4,8:585\n121#5,2:563\n174#5,6:565\n262#5,11:571\n123#5,2:582\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n*L\n263#1:517,26\n263#1:544,4\n263#1:557,6\n263#1:584\n263#1:593,2\n263#1:543\n263#1:548,9\n263#1:585,8\n269#1:563,2\n281#1:565,6\n281#1:571,11\n269#1:582,2\n*E\n"})
/* loaded from: classes3.dex */
public final class BorderModifierNode extends DelegatingNode {
    public static final int $stable = 8;

    @Nullable
    private BorderCache borderCache;

    @NotNull
    private Brush brush;

    @NotNull
    private final CacheDrawModifierNode drawWithCacheModifierNode;

    @NotNull
    private Shape shape;
    private float width;

    public /* synthetic */ BorderModifierNode(float f, Brush brush, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, brush, shape);
    }

    private BorderModifierNode(float f, Brush brush, Shape shape) {
        this.width = f;
        this.brush = brush;
        this.shape = shape;
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.BorderModifierNode$drawWithCacheModifierNode$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DrawResult invoke(@NotNull CacheDrawScope cacheDrawScope) {
                if (cacheDrawScope.mo7874toPx0680j_4(this.this$0.getWidth()) < 0.0f || Size.m11167getMinDimensionimpl(cacheDrawScope.m11006getSizeNHjbRc()) <= 0.0f) {
                    return BorderKt.drawContentWithoutBorder(cacheDrawScope);
                }
                float f2 = 2;
                float fMin = Math.min(C2046Dp.m13671equalsimpl0(this.this$0.getWidth(), C2046Dp.INSTANCE.m13684getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(cacheDrawScope.mo7874toPx0680j_4(this.this$0.getWidth())), (float) Math.ceil(Size.m11167getMinDimensionimpl(cacheDrawScope.m11006getSizeNHjbRc()) / f2));
                float f3 = fMin / f2;
                long jOffset = OffsetKt.Offset(f3, f3);
                long jSize = SizeKt.Size(Size.m11168getWidthimpl(cacheDrawScope.m11006getSizeNHjbRc()) - fMin, Size.m11165getHeightimpl(cacheDrawScope.m11006getSizeNHjbRc()) - fMin);
                boolean z = f2 * fMin > Size.m11167getMinDimensionimpl(cacheDrawScope.m11006getSizeNHjbRc());
                Outline outlineMo7821createOutlinePq9zytI = this.this$0.getShape().mo7821createOutlinePq9zytI(cacheDrawScope.m11006getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                if (outlineMo7821createOutlinePq9zytI instanceof Outline.Generic) {
                    BorderModifierNode borderModifierNode = this.this$0;
                    return borderModifierNode.drawGenericBorder(cacheDrawScope, borderModifierNode.getBrush(), (Outline.Generic) outlineMo7821createOutlinePq9zytI, z, fMin);
                }
                if (outlineMo7821createOutlinePq9zytI instanceof Outline.Rounded) {
                    BorderModifierNode borderModifierNode2 = this.this$0;
                    return borderModifierNode2.m7788drawRoundRectBorderJqoCqck(cacheDrawScope, borderModifierNode2.getBrush(), (Outline.Rounded) outlineMo7821createOutlinePq9zytI, jOffset, jSize, z, fMin);
                }
                if (outlineMo7821createOutlinePq9zytI instanceof Outline.Rectangle) {
                    return BorderKt.m7785drawRectBorderNsqcLGU(cacheDrawScope, this.this$0.getBrush(), jOffset, jSize, z, fMin);
                }
                throw new NoWhenBranchMatchedException();
            }
        }));
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    /* renamed from: setWidth-0680j_4, reason: not valid java name */
    public final void m7790setWidth0680j_4(float f) {
        if (C2046Dp.m13671equalsimpl0(this.width, f)) {
            return;
        }
        this.width = f;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    @NotNull
    public final Brush getBrush() {
        return this.brush;
    }

    public final void setBrush(@NotNull Brush brush) {
        if (Intrinsics.areEqual(this.brush, brush)) {
            return;
        }
        this.brush = brush;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    @NotNull
    public final Shape getShape() {
        return this.shape;
    }

    public final void setShape(@NotNull Shape shape) {
        if (Intrinsics.areEqual(this.shape, shape)) {
            return;
        }
        this.shape = shape;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DrawResult drawGenericBorder(CacheDrawScope cacheDrawScope, final Brush brush, final Outline.Generic generic, boolean z, float f) {
        int iM11561getArgb8888_sVssgQ;
        ColorFilter colorFilterM11381tintxETnrds$default;
        ?? r12;
        Canvas canvas;
        if (z) {
            return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode.drawGenericBorder.1
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
                    DrawScope.m11879drawPathGBMwjPU$default(contentDrawScope, generic.getPath(), brush, 0.0f, null, null, 0, 60, null);
                }
            });
        }
        if (brush instanceof SolidColor) {
            iM11561getArgb8888_sVssgQ = ImageBitmapConfig.INSTANCE.m11560getAlpha8_sVssgQ();
            colorFilterM11381tintxETnrds$default = ColorFilter.Companion.m11381tintxETnrds$default(ColorFilter.INSTANCE, ((SolidColor) brush).getValue(), 0, 2, null);
        } else {
            iM11561getArgb8888_sVssgQ = ImageBitmapConfig.INSTANCE.m11561getArgb8888_sVssgQ();
            colorFilterM11381tintxETnrds$default = null;
        }
        final Rect bounds = generic.getPath().getBounds();
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        Intrinsics.checkNotNull(borderCache);
        Path pathObtainPath = borderCache.obtainPath();
        pathObtainPath.reset();
        pathObtainPath.addRect(bounds);
        pathObtainPath.mo11232opN5in7k0(pathObtainPath, generic.getPath(), PathOperation.INSTANCE.m11631getDifferenceb3I0S0c());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final long jIntSize = IntSizeKt.IntSize((int) Math.ceil(bounds.getWidth()), (int) Math.ceil(bounds.getHeight()));
        BorderCache borderCache2 = this.borderCache;
        Intrinsics.checkNotNull(borderCache2);
        ImageBitmap imageBitmap = borderCache2.imageBitmap;
        Canvas canvas2 = borderCache2.canvas;
        ImageBitmapConfig imageBitmapConfigM11553boximpl = imageBitmap != null ? ImageBitmapConfig.m11553boximpl(imageBitmap.mo11207getConfig_sVssgQ()) : null;
        boolean z2 = false;
        if (imageBitmapConfigM11553boximpl == null ? false : ImageBitmapConfig.m11556equalsimpl0(imageBitmapConfigM11553boximpl.m11559unboximpl(), ImageBitmapConfig.INSTANCE.m11561getArgb8888_sVssgQ())) {
            z2 = true;
        } else {
            if (ImageBitmapConfig.m11555equalsimpl(iM11561getArgb8888_sVssgQ, imageBitmap != null ? ImageBitmapConfig.m11553boximpl(imageBitmap.mo11207getConfig_sVssgQ()) : null)) {
            }
        }
        if (imageBitmap == null || canvas2 == null || Size.m11168getWidthimpl(cacheDrawScope.m11006getSizeNHjbRc()) > imageBitmap.getWidth() || Size.m11165getHeightimpl(cacheDrawScope.m11006getSizeNHjbRc()) > imageBitmap.getHeight() || !z2) {
            ImageBitmap imageBitmapM11566ImageBitmapx__hDU$default = ImageBitmapKt.m11566ImageBitmapx__hDU$default(IntSize.m13836getWidthimpl(jIntSize), IntSize.m13835getHeightimpl(jIntSize), iM11561getArgb8888_sVssgQ, false, null, 24, null);
            borderCache2.imageBitmap = imageBitmapM11566ImageBitmapx__hDU$default;
            Canvas Canvas = androidx.compose.p003ui.graphics.CanvasKt.Canvas(imageBitmapM11566ImageBitmapx__hDU$default);
            borderCache2.canvas = Canvas;
            r12 = imageBitmapM11566ImageBitmapx__hDU$default;
            canvas = Canvas;
        } else {
            r12 = imageBitmap;
            canvas = canvas2;
        }
        CanvasDrawScope canvasDrawScope = borderCache2.canvasDrawScope;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            borderCache2.canvasDrawScope = canvasDrawScope;
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        long jM13846toSizeozmzZPI = IntSizeKt.m13846toSizeozmzZPI(jIntSize);
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density density = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        Canvas canvas3 = drawParams.getCanvas();
        long size = drawParams.getSize();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m11813setSizeuvyYCjk(jM13846toSizeozmzZPI);
        canvas.save();
        long jM11366getBlack0d7_KjU = Color.INSTANCE.m11366getBlack0d7_KjU();
        BlendMode.Companion companion = BlendMode.INSTANCE;
        DrawScope.m11884drawRectnJ9OG0$default(canvasDrawScope2, jM11366getBlack0d7_KjU, 0L, jM13846toSizeozmzZPI, 0.0f, null, null, companion.m11255getClear0nO6VwU(), 58, null);
        float f2 = -bounds.getLeft();
        float f3 = -bounds.getTop();
        canvasDrawScope2.getDrawContext().getTransform().translate(f2, f3);
        DrawScope.m11879drawPathGBMwjPU$default(canvasDrawScope2, generic.getPath(), brush, 0.0f, new Stroke(f * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
        float f4 = 1;
        float fM11168getWidthimpl = (Size.m11168getWidthimpl(canvasDrawScope2.mo11889getSizeNHjbRc()) + f4) / Size.m11168getWidthimpl(canvasDrawScope2.mo11889getSizeNHjbRc());
        float fM11165getHeightimpl = (Size.m11165getHeightimpl(canvasDrawScope2.mo11889getSizeNHjbRc()) + f4) / Size.m11165getHeightimpl(canvasDrawScope2.mo11889getSizeNHjbRc());
        long jMo11888getCenterF1C5BW0 = canvasDrawScope2.mo11888getCenterF1C5BW0();
        DrawContext drawContext = canvasDrawScope2.getDrawContext();
        long jMo11814getSizeNHjbRc = drawContext.mo11814getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo11821scale0AR0LA0(fM11168getWidthimpl, fM11165getHeightimpl, jMo11888getCenterF1C5BW0);
        DrawScope.m11879drawPathGBMwjPU$default(canvasDrawScope2, pathObtainPath, brush, 0.0f, null, null, companion.m11255getClear0nO6VwU(), 28, null);
        drawContext.getCanvas().restore();
        drawContext.mo11815setSizeuvyYCjk(jMo11814getSizeNHjbRc);
        canvasDrawScope2.getDrawContext().getTransform().translate(-f2, -f3);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(density);
        drawParams3.setLayoutDirection(layoutDirection2);
        drawParams3.setCanvas(canvas3);
        drawParams3.m11813setSizeuvyYCjk(size);
        r12.prepareToDraw();
        objectRef.element = r12;
        final ColorFilter colorFilter = colorFilterM11381tintxETnrds$default;
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode.drawGenericBorder.3
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
                float left = bounds.getLeft();
                float top = bounds.getTop();
                Ref.ObjectRef<ImageBitmap> objectRef2 = objectRef;
                long j = jIntSize;
                ColorFilter colorFilter2 = colorFilter;
                contentDrawScope.getDrawContext().getTransform().translate(left, top);
                DrawScope.m11873drawImageAZ2fEMs$default(contentDrawScope, objectRef2.element, 0L, j, 0L, 0L, 0.0f, null, colorFilter2, 0, 0, 890, null);
                contentDrawScope.getDrawContext().getTransform().translate(-left, -top);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRoundRectBorder-JqoCqck, reason: not valid java name */
    public final DrawResult m7788drawRoundRectBorderJqoCqck(CacheDrawScope cacheDrawScope, final Brush brush, Outline.Rounded rounded, final long j, final long j2, final boolean z, final float f) {
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            final long jM11149getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m11149getTopLeftCornerRadiuskKHJgLs();
            final float f2 = f / 2;
            final Stroke stroke = new Stroke(f, 0.0f, 0, 0, null, 30, null);
            return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$1
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
                    if (z) {
                        DrawScope.m11885drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0L, 0L, jM11149getTopLeftCornerRadiuskKHJgLs, 0.0f, null, null, 0, 246, null);
                        return;
                    }
                    float fM11074getXimpl = CornerRadius.m11074getXimpl(jM11149getTopLeftCornerRadiuskKHJgLs);
                    float f3 = f2;
                    if (fM11074getXimpl < f3) {
                        float f4 = f;
                        float fM11168getWidthimpl = Size.m11168getWidthimpl(contentDrawScope.mo11889getSizeNHjbRc()) - f;
                        float fM11165getHeightimpl = Size.m11165getHeightimpl(contentDrawScope.mo11889getSizeNHjbRc()) - f;
                        int iM11328getDifferencertfAjoo = ClipOp.INSTANCE.m11328getDifferencertfAjoo();
                        Brush brush2 = brush;
                        long j3 = jM11149getTopLeftCornerRadiuskKHJgLs;
                        DrawContext drawContext = contentDrawScope.getDrawContext();
                        long jMo11814getSizeNHjbRc = drawContext.mo11814getSizeNHjbRc();
                        drawContext.getCanvas().save();
                        drawContext.getTransform().mo11817clipRectN_I0leg(f4, f4, fM11168getWidthimpl, fM11165getHeightimpl, iM11328getDifferencertfAjoo);
                        DrawScope.m11885drawRoundRectZuiqVtQ$default(contentDrawScope, brush2, 0L, 0L, j3, 0.0f, null, null, 0, 246, null);
                        drawContext.getCanvas().restore();
                        drawContext.mo11815setSizeuvyYCjk(jMo11814getSizeNHjbRc);
                        return;
                    }
                    DrawScope.m11885drawRoundRectZuiqVtQ$default(contentDrawScope, brush, j, j2, BorderKt.m7786shrinkKibmq7A(jM11149getTopLeftCornerRadiuskKHJgLs, f3), 0.0f, stroke, null, 0, 208, null);
                }
            });
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        Intrinsics.checkNotNull(borderCache);
        final Path pathCreateRoundRectPath = BorderKt.createRoundRectPath(borderCache.obtainPath(), rounded.getRoundRect(), f, z);
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$2
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
                DrawScope.m11879drawPathGBMwjPU$default(contentDrawScope, pathCreateRoundRectPath, brush, 0.0f, null, null, 0, 60, null);
            }
        });
    }
}
