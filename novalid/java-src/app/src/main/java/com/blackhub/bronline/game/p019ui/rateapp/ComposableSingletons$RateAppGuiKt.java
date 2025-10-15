package com.blackhub.bronline.game.p019ui.rateapp;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
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

/* compiled from: RateAppGui.kt */
@Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$RateAppGuiKt {

    @NotNull
    public static final ComposableSingletons$RateAppGuiKt INSTANCE = new ComposableSingletons$RateAppGuiKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11241lambda1 = ComposableLambdaKt.composableLambdaInstance(549510030, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.ComposableSingletons$RateAppGuiKt$lambda-1$1
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
                    ComposerKt.traceEventStart(549510030, i, -1, "com.blackhub.bronline.game.ui.rateapp.ComposableSingletons$RateAppGuiKt.lambda-1.<anonymous> (RateAppGui.kt:173)");
                }
                IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_close_rounded, composer, 6), (String) null, (Modifier) null, ColorResources_androidKt.colorResource(R.color.white, composer, 6), composer, 56, 4);
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
    public static Function2<Composer, Integer, Unit> f11242lambda2 = ComposableLambdaKt.composableLambdaInstance(-578082664, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.ComposableSingletons$RateAppGuiKt$lambda-2$1
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
                    ComposerKt.traceEventStart(-578082664, i, -1, "com.blackhub.bronline.game.ui.rateapp.ComposableSingletons$RateAppGuiKt.lambda-2.<anonymous> (RateAppGui.kt:241)");
                }
                IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_dislike, composer, 6), (String) null, SizeKt.fillMaxSize(Modifier.INSTANCE, 0.65f), Color.INSTANCE.m11377getWhite0d7_KjU(), composer, 3512, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11243lambda3 = ComposableLambdaKt.composableLambdaInstance(1023013455, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.ComposableSingletons$RateAppGuiKt$lambda-3$1
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
                    ComposerKt.traceEventStart(1023013455, i, -1, "com.blackhub.bronline.game.ui.rateapp.ComposableSingletons$RateAppGuiKt.lambda-3.<anonymous> (RateAppGui.kt:261)");
                }
                IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_like, composer, 6), (String) null, SizeKt.fillMaxSize(Modifier.INSTANCE, 0.65f), Color.INSTANCE.m11377getWhite0d7_KjU(), composer, 3512, 0);
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
    public final Function2<Composer, Integer, Unit> m15020getLambda1$app_siteRelease() {
        return f11241lambda1;
    }

    @NotNull
    /* renamed from: getLambda-2$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15021getLambda2$app_siteRelease() {
        return f11242lambda2;
    }

    @NotNull
    /* renamed from: getLambda-3$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15022getLambda3$app_siteRelease() {
        return f11243lambda3;
    }
}
