package com.blackhub.bronline.game.p019ui.widget.dialog;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
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

/* compiled from: PreviewRewardDialogUi.kt */
@Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$PreviewRewardDialogUiKt {

    @NotNull
    public static final ComposableSingletons$PreviewRewardDialogUiKt INSTANCE = new ComposableSingletons$PreviewRewardDialogUiKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11282lambda1 = ComposableLambdaKt.composableLambdaInstance(1328348895, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.ComposableSingletons$PreviewRewardDialogUiKt$lambda-1$1
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
                    ComposerKt.traceEventStart(1328348895, i, -1, "com.blackhub.bronline.game.ui.widget.dialog.ComposableSingletons$PreviewRewardDialogUiKt.lambda-1.<anonymous> (PreviewRewardDialogUi.kt:171)");
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_lock_close_fill, composer, 6), (String) null, SizeKt.m8172size3ABfNKs(PaddingKt.m8123padding3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composer, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
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
    public final Function2<Composer, Integer, Unit> m15082getLambda1$app_siteRelease() {
        return f11282lambda1;
    }
}
