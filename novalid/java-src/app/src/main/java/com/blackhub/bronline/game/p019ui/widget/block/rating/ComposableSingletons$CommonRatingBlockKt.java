package com.blackhub.bronline.game.p019ui.widget.block.rating;

import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.p019ui.widget.button.ButtonWhiteStripKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonRatingBlock.kt */
@Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$CommonRatingBlockKt {

    @NotNull
    public static final ComposableSingletons$CommonRatingBlockKt INSTANCE = new ComposableSingletons$CommonRatingBlockKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11273lambda1 = ComposableLambdaKt.composableLambdaInstance(1895867078, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.rating.ComposableSingletons$CommonRatingBlockKt$lambda-1$1
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
                    ComposerKt.traceEventStart(1895867078, i, -1, "com.blackhub.bronline.game.ui.widget.block.rating.ComposableSingletons$CommonRatingBlockKt.lambda-1.<anonymous> (CommonRatingBlock.kt:106)");
                }
                ButtonWhiteStripKt.ButtonWhiteStrip(null, StringResources_androidKt.stringResource(R.string.common_update, composer, 6), R.dimen._5wdp, R.dimen._13wsp, 0, composer, 3456, 17);
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
    public final Function2<Composer, Integer, Unit> m15064getLambda1$app_siteRelease() {
        return f11273lambda1;
    }
}
