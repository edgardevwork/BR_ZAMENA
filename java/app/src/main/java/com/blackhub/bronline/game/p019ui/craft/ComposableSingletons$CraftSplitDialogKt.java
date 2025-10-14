package com.blackhub.bronline.game.p019ui.craft;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p003ui.Modifier;
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

/* compiled from: CraftSplitDialog.kt */

public final class ComposableSingletons$CraftSplitDialogKt {

    @NotNull
    public static final ComposableSingletons$CraftSplitDialogKt INSTANCE = new ComposableSingletons$CraftSplitDialogKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11207lambda1 = ComposableLambdaKt.composableLambdaInstance(426788947, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.ComposableSingletons$CraftSplitDialogKt$lambda-1$1
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
                    ComposerKt.traceEventStart(426788947, i, -1, "com.blackhub.bronline.game.ui.craft.ComposableSingletons$CraftSplitDialogKt.lambda-1.<anonymous> (CraftSplitDialog.kt:143)");
                }
                IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_close_new, composer, 6), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorResources_androidKt.colorResource(R.color.white, composer, 6), composer, 440, 0);
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
    public final Function2<Composer, Integer, Unit> m14961getLambda1$app_siteRelease() {
        return f11207lambda1;
    }
}

