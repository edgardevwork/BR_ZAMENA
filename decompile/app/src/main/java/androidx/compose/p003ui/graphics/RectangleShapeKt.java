package androidx.compose.p003ui.graphics;

import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.Outline;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: RectangleShape.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001c\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"RectangleShape", "Landroidx/compose/ui/graphics/Shape;", "getRectangleShape$annotations", "()V", "getRectangleShape", "()Landroidx/compose/ui/graphics/Shape;", "ui-graphics_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class RectangleShapeKt {

    @NotNull
    private static final Shape RectangleShape = new Shape() { // from class: androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1
        @Override // androidx.compose.p003ui.graphics.Shape
        @NotNull
        /* renamed from: createOutline-Pq9zytI */
        public Outline.Rectangle mo7821createOutlinePq9zytI(long size, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
            return new Outline.Rectangle(SizeKt.m11189toRectuvyYCjk(size));
        }

        @NotNull
        public String toString() {
            return "RectangleShape";
        }
    };

    @Stable
    public static /* synthetic */ void getRectangleShape$annotations() {
    }

    @NotNull
    public static final Shape getRectangleShape() {
        return RectangleShape;
    }
}
