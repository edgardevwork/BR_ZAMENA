package com.blackhub.bronline.game.p019ui.activetask;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
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

/* compiled from: ActiveTaskBlock.kt */
@Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class ComposableSingletons$ActiveTaskBlockKt {

    @NotNull
    public static final ComposableSingletons$ActiveTaskBlockKt INSTANCE = new ComposableSingletons$ActiveTaskBlockKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11151lambda1 = ComposableLambdaKt.composableLambdaInstance(1464772371, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ComposableSingletons$ActiveTaskBlockKt$lambda-1$1
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
                    ComposerKt.traceEventStart(1464772371, i, -1, "com.blackhub.bronline.game.ui.activetask.ComposableSingletons$ActiveTaskBlockKt.lambda-1.<anonymous> (ActiveTaskBlock.kt:106)");
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_close_rounded, composer, 6), (String) null, SizeKt.m8172size3ABfNKs(PaddingKt.m8123padding3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._11sdp, composer, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
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
    public static Function2<Composer, Integer, Unit> f11152lambda2 = ComposableLambdaKt.composableLambdaInstance(945337786, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ComposableSingletons$ActiveTaskBlockKt$lambda-2$1
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
                    ComposerKt.traceEventStart(945337786, i, -1, "com.blackhub.bronline.game.ui.activetask.ComposableSingletons$ActiveTaskBlockKt.lambda-2.<anonymous> (ActiveTaskBlock.kt:139)");
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_double_arrow_left, composer, 6), (String) null, PaddingKt.m8123padding3ABfNKs(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._19sdp, composer, 6)), ColorResources_androidKt.colorResource(R.color.black_gray_blue_40, composer, 6), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer, 6), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer, 6), 6, null)), PrimitiveResources_androidKt.dimensionResource(R.dimen._2sdp, composer, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
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
    public final Function2<Composer, Integer, Unit> m14880getLambda1$app_siteRelease() {
        return f11151lambda1;
    }

    @NotNull
    /* renamed from: getLambda-2$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14881getLambda2$app_siteRelease() {
        return f11152lambda2;
    }
}
