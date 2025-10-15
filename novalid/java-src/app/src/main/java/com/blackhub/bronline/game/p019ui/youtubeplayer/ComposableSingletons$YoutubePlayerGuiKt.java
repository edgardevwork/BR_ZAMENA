package com.blackhub.bronline.game.p019ui.youtubeplayer;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: YoutubePlayerGui.kt */
@Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$YoutubePlayerGuiKt {

    @NotNull
    public static final ComposableSingletons$YoutubePlayerGuiKt INSTANCE = new ComposableSingletons$YoutubePlayerGuiKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11290lambda1 = ComposableLambdaKt.composableLambdaInstance(-1245081137, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.youtubeplayer.ComposableSingletons$YoutubePlayerGuiKt$lambda-1$1
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
                    ComposerKt.traceEventStart(-1245081137, i, -1, "com.blackhub.bronline.game.ui.youtubeplayer.ComposableSingletons$YoutubePlayerGuiKt.lambda-1.<anonymous> (YoutubePlayerGui.kt:80)");
                }
                IconKt.m9497Iconww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), (String) null, BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._16sdp, composer, 6)), ColorResources_androidKt.colorResource(R.color.orange, composer, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer, 6))), Color.INSTANCE.m11377getWhite0d7_KjU(), composer, 3120, 0);
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
    public static Function2<Composer, Integer, Unit> f11291lambda2 = ComposableLambdaKt.composableLambdaInstance(505267557, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.youtubeplayer.ComposableSingletons$YoutubePlayerGuiKt$lambda-2$1
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
                    ComposerKt.traceEventStart(505267557, i, -1, "com.blackhub.bronline.game.ui.youtubeplayer.ComposableSingletons$YoutubePlayerGuiKt.lambda-2.<anonymous> (YoutubePlayerGui.kt:101)");
                }
                YoutubePlayerGuiKt.YoutubePlayerContent(null, "", new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.youtubeplayer.ComposableSingletons$YoutubePlayerGuiKt$lambda-2$1.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, composer, 432, 1);
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
    public final Function2<Composer, Integer, Unit> m15123getLambda1$app_siteRelease() {
        return f11290lambda1;
    }

    @NotNull
    /* renamed from: getLambda-2$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15124getLambda2$app_siteRelease() {
        return f11291lambda2;
    }
}
