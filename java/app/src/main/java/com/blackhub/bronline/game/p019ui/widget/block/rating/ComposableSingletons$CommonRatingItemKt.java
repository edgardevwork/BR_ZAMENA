package com.blackhub.bronline.game.p019ui.widget.block.rating;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.RotateKt;
import androidx.compose.p003ui.draw.ScaleKt;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
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

/* compiled from: CommonRatingItem.kt */
/* loaded from: classes3.dex */
public final class ComposableSingletons$CommonRatingItemKt {

    @NotNull
    public static final ComposableSingletons$CommonRatingItemKt INSTANCE = new ComposableSingletons$CommonRatingItemKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11274lambda1 = ComposableLambdaKt.composableLambdaInstance(-235400081, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.rating.ComposableSingletons$CommonRatingItemKt$lambda-1$1
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
                    ComposerKt.traceEventStart(-235400081, i, -1, "com.blackhub.bronline.game.ui.widget.block.rating.ComposableSingletons$CommonRatingItemKt.lambda-1.<anonymous> (CommonRatingItem.kt:158)");
                }
                Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bays, composer, 6);
                ContentScale fit = ContentScale.INSTANCE.getFit();
                Modifier.Companion companion = Modifier.INSTANCE;
                ImageKt.Image(painterPainterResource, (String) null, PaddingKt.m8123padding3ABfNKs(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer, 6)), (Alignment) null, fit, 0.0f, (ColorFilter) null, composer, 24632, 104);
                BoxKt.Box(BackgroundKt.m7771backgroundbw27NRU$default(OffsetKt.m8084offsetVpY3zN4$default(RotateKt.rotate(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composer, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composer, 6)), -45.0f), 0.0f, C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer, 6)), 1, null), ColorResources_androidKt.colorResource(R.color.white_25, composer, 6), null, 2, null), composer, 0);
                BoxKt.Box(BackgroundKt.m7771backgroundbw27NRU$default(OffsetKt.m8084offsetVpY3zN4$default(RotateKt.rotate(ScaleKt.scale(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composer, 6)), 1.35f), -45.0f), 0.0f, C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer, 6)), 1, null), ColorResources_androidKt.colorResource(R.color.white_25, composer, 6), null, 2, null), composer, 0);
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
    public final Function2<Composer, Integer, Unit> m15065getLambda1$app_siteRelease() {
        return f11274lambda1;
    }
}

