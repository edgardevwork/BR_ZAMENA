package androidx.compose.p003ui.graphics.drawscope;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.Path;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: CanvasDrawScope.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m7105d2 = {"asDrawTransform", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "ui-graphics_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class CanvasDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawTransform asDrawTransform(final DrawContext drawContext) {
        return new DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt.asDrawTransform.1
            @Override // androidx.compose.p003ui.graphics.drawscope.DrawTransform
            /* renamed from: getSize-NH-jbRc, reason: not valid java name */
            public long mo11819getSizeNHjbRc() {
                return drawContext.mo11814getSizeNHjbRc();
            }

            @Override // androidx.compose.p003ui.graphics.drawscope.DrawTransform
            /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
            public long mo11818getCenterF1C5BW0() {
                return SizeKt.m11178getCenteruvyYCjk(mo11819getSizeNHjbRc());
            }

            @Override // androidx.compose.p003ui.graphics.drawscope.DrawTransform
            public void inset(float left, float top, float right, float bottom) {
                Canvas canvas = drawContext.getCanvas();
                DrawContext drawContext2 = drawContext;
                long jSize = SizeKt.Size(Size.m11168getWidthimpl(mo11819getSizeNHjbRc()) - (right + left), Size.m11165getHeightimpl(mo11819getSizeNHjbRc()) - (bottom + top));
                if (Size.m11168getWidthimpl(jSize) < 0.0f || Size.m11165getHeightimpl(jSize) < 0.0f) {
                    throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
                }
                drawContext2.mo11815setSizeuvyYCjk(jSize);
                canvas.translate(left, top);
            }

            @Override // androidx.compose.p003ui.graphics.drawscope.DrawTransform
            /* renamed from: clipRect-N_I0leg, reason: not valid java name */
            public void mo11817clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp) {
                drawContext.getCanvas().mo11194clipRectN_I0leg(left, top, right, bottom, clipOp);
            }

            @Override // androidx.compose.p003ui.graphics.drawscope.DrawTransform
            /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
            public void mo11816clipPathmtrdDE(@NotNull Path path, int clipOp) {
                drawContext.getCanvas().mo11193clipPathmtrdDE(path, clipOp);
            }

            @Override // androidx.compose.p003ui.graphics.drawscope.DrawTransform
            public void translate(float left, float top) {
                drawContext.getCanvas().translate(left, top);
            }

            @Override // androidx.compose.p003ui.graphics.drawscope.DrawTransform
            /* renamed from: rotate-Uv8p0NA, reason: not valid java name */
            public void mo11820rotateUv8p0NA(float degrees, long pivot) {
                Canvas canvas = drawContext.getCanvas();
                canvas.translate(Offset.m11099getXimpl(pivot), Offset.m11100getYimpl(pivot));
                canvas.rotate(degrees);
                canvas.translate(-Offset.m11099getXimpl(pivot), -Offset.m11100getYimpl(pivot));
            }

            @Override // androidx.compose.p003ui.graphics.drawscope.DrawTransform
            /* renamed from: scale-0AR0LA0, reason: not valid java name */
            public void mo11821scale0AR0LA0(float scaleX, float scaleY, long pivot) {
                Canvas canvas = drawContext.getCanvas();
                canvas.translate(Offset.m11099getXimpl(pivot), Offset.m11100getYimpl(pivot));
                canvas.scale(scaleX, scaleY);
                canvas.translate(-Offset.m11099getXimpl(pivot), -Offset.m11100getYimpl(pivot));
            }

            @Override // androidx.compose.p003ui.graphics.drawscope.DrawTransform
            /* renamed from: transform-58bKbWc, reason: not valid java name */
            public void mo11822transform58bKbWc(@NotNull float[] matrix) {
                drawContext.getCanvas().mo11195concat58bKbWc(matrix);
            }
        };
    }
}
