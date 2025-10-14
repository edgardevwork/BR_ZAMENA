package com.blackhub.bronline.game.gui.blackpass.p010ui;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.p019ui.blackpass.BlackPassActivateAnimateBgUiKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UIBlackPassActivateNew.kt */
@Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class ComposableSingletons$UIBlackPassActivateNewKt {

    @NotNull
    public static final ComposableSingletons$UIBlackPassActivateNewKt INSTANCE = new ComposableSingletons$UIBlackPassActivateNewKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11143lambda1 = ComposableLambdaKt.composableLambdaInstance(194315481, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.ComposableSingletons$UIBlackPassActivateNewKt$lambda-1$1
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
                ComposerKt.traceEventStart(194315481, i, -1, "com.blackhub.bronline.game.gui.blackpass.ui.ComposableSingletons$UIBlackPassActivateNewKt.lambda-1.<anonymous> (UIBlackPassActivateNew.kt:283)");
            }
            BlackPassActivateAnimateBgUiKt.BlackPassActivateAnimateBgUi(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    /* renamed from: getLambda-1$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14427getLambda1$app_siteRelease() {
        return f11143lambda1;
    }
}
