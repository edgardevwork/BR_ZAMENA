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

