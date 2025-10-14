package com.blackhub.bronline.game.core.extension;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.lifecycle.LifecycleOwner;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.PointViewListenerEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OtherExtension.kt */
@SourceDebugExtension({"SMAP\nOtherExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtherExtension.kt\ncom/blackhub/bronline/game/core/extension/OtherExtensionKt\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,83:1\n91#2,14:84\n*S KotlinDebug\n*F\n+ 1 OtherExtension.kt\ncom/blackhub/bronline/game/core/extension/OtherExtensionKt\n*L\n66#1:84,14\n*E\n"})

public final class OtherExtensionKt {

    /* compiled from: OtherExtension.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointViewListenerEnum.values().length];
            try {
                iArr[PointViewListenerEnum.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointViewListenerEnum.TOP_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointViewListenerEnum.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PointViewListenerEnum.BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PointViewListenerEnum.BOTTOM_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    public static final LifecycleOwner lifecycleOwner(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        int i = 20;
        Object obj = context;
        while (true) {
            int i2 = i - 1;
            if (i <= 0 || (obj instanceof LifecycleOwner)) {
                break;
            }
            Context baseContext = ((ContextWrapper) obj).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
            i = i2;
            obj = baseContext;
        }
        if (obj instanceof LifecycleOwner) {
            return (LifecycleOwner) obj;
        }
        return null;
    }

    public static /* synthetic */ Point getPositionListener$default(DragEvent dragEvent, PointViewListenerEnum pointViewListenerEnum, int i, Object obj) {
        if ((i & 1) != 0) {
            pointViewListenerEnum = PointViewListenerEnum.CENTER;
        }
        return getPositionListener(dragEvent, pointViewListenerEnum);
    }

    @NotNull
    public static final Point getPositionListener(@NotNull DragEvent dragEvent, @Nullable PointViewListenerEnum pointViewListenerEnum) {
        Point point;
        Intrinsics.checkNotNullParameter(dragEvent, "<this>");
        int x = (int) dragEvent.getX();
        int y = (int) dragEvent.getY();
        Object localState = dragEvent.getLocalState();
        Intrinsics.checkNotNull(localState, "null cannot be cast to non-null type android.view.View");
        View view = (View) localState;
        int i = pointViewListenerEnum == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pointViewListenerEnum.ordinal()];
        if (i == 1) {
            point = new Point(x - (view.getWidth() / 2), y - (view.getHeight() / 2));
        } else if (i == 2) {
            point = new Point(x, y - (view.getHeight() / 2));
        } else {
            if (i == 3) {
                return new Point(x, y);
            }
            if (i == 4) {
                point = new Point(x - (view.getWidth() / 2), y + (view.getHeight() / 2));
            } else if (i == 5) {
                point = new Point(x + (view.getWidth() / 2), y + (view.getHeight() / 2));
            } else {
                return new Point();
            }
        }
        return point;
    }

    public static final void appendSpace(@NotNull AnnotatedString.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        builder.append(" ");
    }

    public static final void cancelAnimator(@NotNull ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "<this>");
        valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.blackhub.bronline.game.core.extension.OtherExtensionKt$cancelAnimator$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
                new AnimatorListenerAdapter() { // from class: com.blackhub.bronline.game.core.extension.OtherExtensionKt$cancelAnimator$1$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(@NotNull Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        super.onAnimationEnd(animation);
                        animation.removeAllListeners();
                        animation.cancel();
                        animation.end();
                    }
                };
            }
        });
    }
}

