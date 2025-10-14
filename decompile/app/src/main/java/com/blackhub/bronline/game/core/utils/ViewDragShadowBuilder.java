package com.blackhub.bronline.game.core.utils;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewDragShadowBuilder.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u000e\u0010\u0010\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/ViewDragShadowBuilder;", "Landroid/view/View$DragShadowBuilder;", SVG.View.NODE_NAME, "Landroid/view/View;", "(Landroid/view/View;)V", "cosRotate", "", "height", "", "getHeight", "()I", "heightWithScale", "rotationRad", "sinRotate", "width", "getWidth", "widthWithScale", "onDrawShadow", "", "canvas", "Landroid/graphics/Canvas;", "onProvideShadowMetrics", "shadowSize", "Landroid/graphics/Point;", "shadowTouchPoint", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ViewDragShadowBuilder extends View.DragShadowBuilder {
    public static final int $stable = 8;
    public double cosRotate;
    public final int height;
    public final int heightWithScale;
    public double rotationRad;
    public double sinRotate;
    public final int width;
    public final int widthWithScale;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewDragShadowBuilder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.rotationRad = Math.toRadians(view.getRotation());
        int width = (int) (view.getWidth() * view.getScaleX());
        this.widthWithScale = width;
        int height = (int) (view.getHeight() * view.getScaleY());
        this.heightWithScale = height;
        this.sinRotate = Math.abs(Math.sin(this.rotationRad));
        double dAbs = Math.abs(Math.cos(this.rotationRad));
        this.cosRotate = dAbs;
        double d = this.sinRotate;
        this.width = (int) ((width * dAbs) + (height * d));
        this.height = (int) ((width * d) + (height * dAbs));
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(@NotNull Point shadowSize, @NotNull Point shadowTouchPoint) {
        Intrinsics.checkNotNullParameter(shadowSize, "shadowSize");
        Intrinsics.checkNotNullParameter(shadowTouchPoint, "shadowTouchPoint");
        shadowSize.set(this.width, this.height);
        shadowTouchPoint.set(shadowSize.x / 2, shadowSize.y / 2);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.scale(getView().getScaleX(), getView().getScaleY(), this.width / 2, this.height / 2);
        canvas.rotate(getView().getRotation(), this.width / 2, this.height / 2);
        canvas.translate((this.width - getView().getWidth()) / 2, (this.height - getView().getHeight()) / 2);
        super.onDrawShadow(canvas);
    }
}
