package com.blackhub.bronline.game.p019ui.widget.block.cloud;

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

/* compiled from: CloudArrowRightBlock.kt */
@Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$CloudArrowRightBlockKt {

    @NotNull
    public static final ComposableSingletons$CloudArrowRightBlockKt INSTANCE = new ComposableSingletons$CloudArrowRightBlockKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11268lambda1 = ComposableLambdaKt.composableLambdaInstance(-821605643, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.cloud.ComposableSingletons$CloudArrowRightBlockKt$lambda-1$1
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
                ComposerKt.traceEventStart(-821605643, i, -1, "com.blackhub.bronline.game.ui.widget.block.cloud.ComposableSingletons$CloudArrowRightBlockKt.lambda-1.<anonymous> (CloudArrowRightBlock.kt:119)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    /* renamed from: getLambda-1$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15051getLambda1$app_siteRelease() {
        return f11268lambda1;
    }
}
