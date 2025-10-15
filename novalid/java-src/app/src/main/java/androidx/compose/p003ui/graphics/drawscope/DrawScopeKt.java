package androidx.compose.p003ui.graphics.drawscope;

import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.ClipOp;
import androidx.compose.p003ui.graphics.DegreesKt;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: DrawScope.kt */
@Metadata(m7104d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aB\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001ab\u0010\f\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aP\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a!\u0010\u001f\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\bH\u0086\b\u001a.\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010 \u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\b\u001a:\u0010 \u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u000e2\b\b\u0002\u0010\"\u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\b\u001aF\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\b\u001aB\u0010#\u001a\u00020\u0001*\u00020\u00022\u0006\u0010$\u001a\u00020\u000e2\b\b\u0002\u0010%\u001a\u00020&2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aB\u0010)\u001a\u00020\u0001*\u00020\u00022\u0006\u0010*\u001a\u00020\u000e2\b\b\u0002\u0010%\u001a\u00020&2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b+\u0010(\u001aB\u0010,\u001a\u00020\u0001*\u00020\u00022\u0006\u0010,\u001a\u00020\u000e2\b\b\u0002\u0010%\u001a\u00020&2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u0010(\u001aJ\u0010,\u001a\u00020\u0001*\u00020\u00022\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000e2\b\b\u0002\u0010%\u001a\u00020&2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a:\u00102\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\b\u001a?\u00103\u001a\u00020\u0001*\u00020\u00022\u0017\u00104\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\t2\u0017\u00106\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, m7105d2 = {"clipPath", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "clipPath-KD09W0M", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;ILkotlin/jvm/functions/Function1;)V", "clipRect", TtmlNode.LEFT, "", "top", TtmlNode.RIGHT, "bottom", "clipRect-rOu3jXo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFFILkotlin/jvm/functions/Function1;)V", "draw", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "size", "Landroidx/compose/ui/geometry/Size;", "draw-GRGpd60", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/functions/Function1;)V", "drawIntoCanvas", "inset", "horizontal", "vertical", "rotate", "degrees", "pivot", "Landroidx/compose/ui/geometry/Offset;", "rotate-Rg1IO4c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJLkotlin/jvm/functions/Function1;)V", "rotateRad", "radians", "rotateRad-Rg1IO4c", "scale", "scale-Rg1IO4c", "scaleX", "scaleY", "scale-Fgt4K4Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLkotlin/jvm/functions/Function1;)V", "translate", "withTransform", "transformBlock", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "drawBlock", "ui-graphics_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1000:1\n67#1,4:1001\n262#1,11:1005\n262#1,11:1016\n262#1,11:1027\n262#1,11:1038\n262#1,11:1049\n262#1,11:1060\n*S KotlinDebug\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n105#1:1001,4\n141#1:1005,11\n158#1:1016,11\n179#1:1027,11\n196#1:1038,11\n222#1:1049,11\n238#1:1060,11\n*E\n"})
/* loaded from: classes.dex */
public final class DrawScopeKt {
    public static final void inset(@NotNull DrawScope drawScope, float f, float f2, float f3, float f4, @NotNull Function1<? super DrawScope, Unit> function1) {
        drawScope.getDrawContext().getTransform().inset(f, f2, f3, f4);
        function1.invoke(drawScope);
        drawScope.getDrawContext().getTransform().inset(-f, -f2, -f3, -f4);
    }

    public static final void inset(@NotNull DrawScope drawScope, float f, @NotNull Function1<? super DrawScope, Unit> function1) {
        drawScope.getDrawContext().getTransform().inset(f, f, f, f);
        function1.invoke(drawScope);
        float f2 = -f;
        drawScope.getDrawContext().getTransform().inset(f2, f2, f2, f2);
    }

    public static final void translate(@NotNull DrawScope drawScope, float f, float f2, @NotNull Function1<? super DrawScope, Unit> function1) {
        drawScope.getDrawContext().getTransform().translate(f, f2);
        function1.invoke(drawScope);
        drawScope.getDrawContext().getTransform().translate(-f, -f2);
    }

    public static /* synthetic */ void translate$default(DrawScope drawScope, float f, float f2, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().translate(f, f2);
        function1.invoke(drawScope);
        drawScope.getDrawContext().getTransform().translate(-f, -f2);
    }

    /* renamed from: rotate-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m11932rotateRg1IO4c$default(DrawScope drawScope, float f, long j, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            j = drawScope.mo11888getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11814getSizeNHjbRc = drawContext.mo11814getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo11820rotateUv8p0NA(f, j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo11815setSizeuvyYCjk(jMo11814getSizeNHjbRc);
    }

    /* renamed from: rotateRad-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m11934rotateRadRg1IO4c$default(DrawScope drawScope, float f, long j, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            j = drawScope.mo11888getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11814getSizeNHjbRc = drawContext.mo11814getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo11820rotateUv8p0NA(DegreesKt.degrees(f), j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo11815setSizeuvyYCjk(jMo11814getSizeNHjbRc);
    }

    /* renamed from: scale-Fgt4K4Q$default, reason: not valid java name */
    public static /* synthetic */ void m11936scaleFgt4K4Q$default(DrawScope drawScope, float f, float f2, long j, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            j = drawScope.mo11888getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11814getSizeNHjbRc = drawContext.mo11814getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo11821scale0AR0LA0(f, f2, j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo11815setSizeuvyYCjk(jMo11814getSizeNHjbRc);
    }

    /* renamed from: scale-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m11938scaleRg1IO4c$default(DrawScope drawScope, float f, long j, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            j = drawScope.mo11888getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11814getSizeNHjbRc = drawContext.mo11814getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo11821scale0AR0LA0(f, f, j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo11815setSizeuvyYCjk(jMo11814getSizeNHjbRc);
    }

    /* renamed from: clipRect-rOu3jXo$default, reason: not valid java name */
    public static /* synthetic */ void m11929clipRectrOu3jXo$default(DrawScope drawScope, float f, float f2, float f3, float f4, int i, Function1 function1, int i2, Object obj) {
        float f5 = (i2 & 1) != 0 ? 0.0f : f;
        float f6 = (i2 & 2) != 0 ? 0.0f : f2;
        if ((i2 & 4) != 0) {
            f3 = Size.m11168getWidthimpl(drawScope.mo11889getSizeNHjbRc());
        }
        float f7 = f3;
        if ((i2 & 8) != 0) {
            f4 = Size.m11165getHeightimpl(drawScope.mo11889getSizeNHjbRc());
        }
        float f8 = f4;
        if ((i2 & 16) != 0) {
            i = ClipOp.INSTANCE.m11329getIntersectrtfAjoo();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11814getSizeNHjbRc = drawContext.mo11814getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo11817clipRectN_I0leg(f5, f6, f7, f8, i);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo11815setSizeuvyYCjk(jMo11814getSizeNHjbRc);
    }

    /* renamed from: clipPath-KD09W0M$default, reason: not valid java name */
    public static /* synthetic */ void m11927clipPathKD09W0M$default(DrawScope drawScope, Path path, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = ClipOp.INSTANCE.m11329getIntersectrtfAjoo();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11814getSizeNHjbRc = drawContext.mo11814getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo11816clipPathmtrdDE(path, i);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo11815setSizeuvyYCjk(jMo11814getSizeNHjbRc);
    }

    public static final void drawIntoCanvas(@NotNull DrawScope drawScope, @NotNull Function1<? super Canvas, Unit> function1) {
        function1.invoke(drawScope.getDrawContext().getCanvas());
    }

    public static final void withTransform(@NotNull DrawScope drawScope, @NotNull Function1<? super DrawTransform, Unit> function1, @NotNull Function1<? super DrawScope, Unit> function12) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11814getSizeNHjbRc = drawContext.mo11814getSizeNHjbRc();
        drawContext.getCanvas().save();
        function1.invoke(drawContext.getTransform());
        function12.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo11815setSizeuvyYCjk(jMo11814getSizeNHjbRc);
    }

    /* renamed from: draw-GRGpd60, reason: not valid java name */
    public static final void m11930drawGRGpd60(@NotNull DrawScope drawScope, @NotNull Density density, @NotNull LayoutDirection layoutDirection, @NotNull Canvas canvas, long j, @NotNull Function1<? super DrawScope, Unit> function1) {
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long jMo11814getSizeNHjbRc = drawScope.getDrawContext().mo11814getSizeNHjbRc();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo11815setSizeuvyYCjk(j);
        canvas.save();
        function1.invoke(drawScope);
        canvas.restore();
        DrawContext drawContext2 = drawScope.getDrawContext();
        drawContext2.setDensity(density2);
        drawContext2.setLayoutDirection(layoutDirection2);
        drawContext2.setCanvas(canvas2);
        drawContext2.mo11815setSizeuvyYCjk(jMo11814getSizeNHjbRc);
    }

    public static final void inset(@NotNull DrawScope drawScope, float f, float f2, @NotNull Function1<? super DrawScope, Unit> function1) {
        drawScope.getDrawContext().getTransform().inset(f, f2, f, f2);
        function1.invoke(drawScope);
        float f3 = -f;
        float f4 = -f2;
        drawScope.getDrawContext().getTransform().inset(f3, f4, f3, f4);
    }

    public static /* synthetic */ void inset$default(DrawScope drawScope, float f, float f2, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().inset(f, f2, f, f2);
        function1.invoke(drawScope);
        float f3 = -f;
        float f4 = -f2;
        drawScope.getDrawContext().getTransform().inset(f3, f4, f3, f4);
    }

    /* renamed from: rotate-Rg1IO4c, reason: not valid java name */
    public static final void m11931rotateRg1IO4c(@NotNull DrawScope drawScope, float f, long j, @NotNull Function1<? super DrawScope, Unit> function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11814getSizeNHjbRc = drawContext.mo11814getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo11820rotateUv8p0NA(f, j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo11815setSizeuvyYCjk(jMo11814getSizeNHjbRc);
    }

    /* renamed from: rotateRad-Rg1IO4c, reason: not valid java name */
    public static final void m11933rotateRadRg1IO4c(@NotNull DrawScope drawScope, float f, long j, @NotNull Function1<? super DrawScope, Unit> function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11814getSizeNHjbRc = drawContext.mo11814getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo11820rotateUv8p0NA(DegreesKt.degrees(f), j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo11815setSizeuvyYCjk(jMo11814getSizeNHjbRc);
    }

    /* renamed from: scale-Fgt4K4Q, reason: not valid java name */
    public static final void m11935scaleFgt4K4Q(@NotNull DrawScope drawScope, float f, float f2, long j, @NotNull Function1<? super DrawScope, Unit> function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11814getSizeNHjbRc = drawContext.mo11814getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo11821scale0AR0LA0(f, f2, j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo11815setSizeuvyYCjk(jMo11814getSizeNHjbRc);
    }

    /* renamed from: scale-Rg1IO4c, reason: not valid java name */
    public static final void m11937scaleRg1IO4c(@NotNull DrawScope drawScope, float f, long j, @NotNull Function1<? super DrawScope, Unit> function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11814getSizeNHjbRc = drawContext.mo11814getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo11821scale0AR0LA0(f, f, j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo11815setSizeuvyYCjk(jMo11814getSizeNHjbRc);
    }

    /* renamed from: clipRect-rOu3jXo, reason: not valid java name */
    public static final void m11928clipRectrOu3jXo(@NotNull DrawScope drawScope, float f, float f2, float f3, float f4, int i, @NotNull Function1<? super DrawScope, Unit> function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11814getSizeNHjbRc = drawContext.mo11814getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo11817clipRectN_I0leg(f, f2, f3, f4, i);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo11815setSizeuvyYCjk(jMo11814getSizeNHjbRc);
    }

    /* renamed from: clipPath-KD09W0M, reason: not valid java name */
    public static final void m11926clipPathKD09W0M(@NotNull DrawScope drawScope, @NotNull Path path, int i, @NotNull Function1<? super DrawScope, Unit> function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11814getSizeNHjbRc = drawContext.mo11814getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo11816clipPathmtrdDE(path, i);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo11815setSizeuvyYCjk(jMo11814getSizeNHjbRc);
    }
}
