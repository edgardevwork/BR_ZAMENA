package com.blackhub.bronline.game.p019ui.catchstreamer;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RegistrationInCompetitionDialogUi.kt */

public final class ComposableSingletons$RegistrationInCompetitionDialogUiKt {

    @NotNull
    public static final ComposableSingletons$RegistrationInCompetitionDialogUiKt INSTANCE = new ComposableSingletons$RegistrationInCompetitionDialogUiKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function3<String, Composer, Integer, Unit> f11194lambda1 = ComposableLambdaKt.composableLambdaInstance(4670654, false, new Function3<String, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.ComposableSingletons$RegistrationInCompetitionDialogUiKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(String str, Composer composer, Integer num) {
            invoke(str, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull String it, @Nullable Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(4670654, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.ComposableSingletons$RegistrationInCompetitionDialogUiKt.lambda-1.<anonymous> (RegistrationInCompetitionDialogUi.kt:147)");
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_ticket, composer, 6), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 440, 120);
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
    public final Function3<String, Composer, Integer, Unit> m14946getLambda1$app_siteRelease() {
        return f11194lambda1;
    }
}

