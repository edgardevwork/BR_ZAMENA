package com.blackhub.bronline.game.gui.gasmangame;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewGroupKt;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.ViewDragShadowBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* compiled from: GasmanUtils.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/gasmangame/GasmanUtils;", "", "()V", "animateImageViews", "Landroid/graphics/drawable/Drawable;", "imageView", "Landroid/widget/ImageView;", "resetAnimationOfImageViews", "", "viewGroup", "Landroid/view/ViewGroup;", "setOnActionDownListener", "Landroid/view/View$OnTouchListener;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nGasmanUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GasmanUtils.kt\ncom/blackhub/bronline/game/gui/gasmangame/GasmanUtils\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,73:1\n1313#2,2:74\n*S KotlinDebug\n*F\n+ 1 GasmanUtils.kt\ncom/blackhub/bronline/game/gui/gasmangame/GasmanUtils\n*L\n55#1:74,2\n*E\n"})
/* loaded from: classes.dex */
public final class GasmanUtils {
    public static final int $stable = 0;

    @NotNull
    public static final GasmanUtils INSTANCE = new GasmanUtils();

    @SuppressLint({"ClickableViewAccessibility"})
    @NotNull
    public final View.OnTouchListener setOnActionDownListener() {
        return new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.gasmangame.GasmanUtils$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return GasmanUtils.setOnActionDownListener$lambda$0(view, motionEvent);
            }
        };
    }

    public static final boolean setOnActionDownListener$lambda$0(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        Intrinsics.checkNotNull(view);
        ViewDragShadowBuilder viewDragShadowBuilder = new ViewDragShadowBuilder(view);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        view.startDragAndDrop(new ClipData(AnyExtensionKt.empty(stringCompanionObject), new String[]{"text/plain"}, new ClipData.Item(AnyExtensionKt.empty(stringCompanionObject))), viewDragShadowBuilder, view, 256);
        return true;
    }

    @NotNull
    public final Drawable animateImageViews(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimatedVectorDrawableCompat) {
            ((AnimatedVectorDrawableCompat) drawable).start();
        } else if (drawable instanceof AnimatedVectorDrawable) {
            ((AnimatedVectorDrawable) drawable).start();
        }
        Intrinsics.checkNotNullExpressionValue(drawable, "apply(...)");
        return drawable;
    }

    public final void resetAnimationOfImageViews(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        for (View view : ViewGroupKt.getChildren(viewGroup)) {
            if (view instanceof ViewGroup) {
                INSTANCE.resetAnimationOfImageViews((ViewGroup) view);
            } else if (view instanceof AppCompatImageView) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) view;
                if (appCompatImageView.getDrawable() instanceof AnimatedVectorDrawable) {
                    Drawable drawable = appCompatImageView.getDrawable();
                    Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimatedVectorDrawable");
                    ((AnimatedVectorDrawable) drawable).reset();
                }
            }
        }
    }
}
