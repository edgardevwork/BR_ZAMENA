package com.blackhub.bronline.game.p019ui.widget.block;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ClickNoAnimStopSpamBlock.kt */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ClickNoAnimStopSpamBlockKt {

    @NotNull
    public static final ComposableSingletons$ClickNoAnimStopSpamBlockKt INSTANCE = new ComposableSingletons$ClickNoAnimStopSpamBlockKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11257lambda1 = ComposableLambdaKt.composableLambdaInstance(1233630764, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ComposableSingletons$ClickNoAnimStopSpamBlockKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1233630764, i, -1, "com.blackhub.bronline.game.ui.widget.block.ComposableSingletons$ClickNoAnimStopSpamBlockKt.lambda-1.<anonymous> (ClickNoAnimStopSpamBlock.kt:112)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    /* renamed from: getLambda-1$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15040getLambda1$app_siteRelease() {
        return f11257lambda1;
    }
}

