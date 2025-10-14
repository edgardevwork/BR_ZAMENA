package com.blackhub.bronline.game.p019ui.widget.block;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VerticalRedBlackBlock.kt */
/* loaded from: classes3.dex */
public final class ComposableSingletons$VerticalRedBlackBlockKt {

    @NotNull
    public static final ComposableSingletons$VerticalRedBlackBlockKt INSTANCE = new ComposableSingletons$VerticalRedBlackBlockKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11263lambda1 = ComposableLambdaKt.composableLambdaInstance(1788392828, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ComposableSingletons$VerticalRedBlackBlockKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1788392828, i, -1, "com.blackhub.bronline.game.ui.widget.block.ComposableSingletons$VerticalRedBlackBlockKt.lambda-1.<anonymous> (VerticalRedBlackBlock.kt:93)");
                }
                IconKt.m9497Iconww6aTOc(CloseKt.getClose(Icons.Filled.INSTANCE), (String) null, SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._15sdp, composer, 6)), Color.INSTANCE.m11377getWhite0d7_KjU(), composer, 3120, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11264lambda2 = ComposableLambdaKt.composableLambdaInstance(-677847224, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ComposableSingletons$VerticalRedBlackBlockKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-677847224, i, -1, "com.blackhub.bronline.game.ui.widget.block.ComposableSingletons$VerticalRedBlackBlockKt.lambda-2.<anonymous> (VerticalRedBlackBlock.kt:133)");
                }
                BoxKt.Box(BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, C2046Dp.m13666constructorimpl(100)), Color.INSTANCE.m11371getGreen0d7_KjU(), null, 2, null), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    @NotNull
    /* renamed from: getLambda-1$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15046getLambda1$app_siteRelease() {
        return f11263lambda1;
    }

    @NotNull
    /* renamed from: getLambda-2$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15047getLambda2$app_siteRelease() {
        return f11264lambda2;
    }
}

