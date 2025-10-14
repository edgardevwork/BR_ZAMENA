package com.blackhub.bronline.game.p019ui.widget.shape;

import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Outline;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TrapezoidShape.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class TrapezoidShape implements Shape {
    public static final int $stable = 0;

    @Override // androidx.compose.p003ui.graphics.Shape
    @NotNull
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo7821createOutlinePq9zytI(long size, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Path Path = AndroidPath_androidKt.Path();
        Path.moveTo(Size.m11168getWidthimpl(size), Size.m11165getHeightimpl(size));
        Path.lineTo(0.0f, Size.m11165getHeightimpl(size));
        Path.lineTo(Size.m11168getWidthimpl(size) * 0.33f, 0.0f);
        Path.lineTo(Size.m11168getWidthimpl(size) * 0.66f, 0.0f);
        Path.close();
        return new Outline.Generic(Path);
    }
}

