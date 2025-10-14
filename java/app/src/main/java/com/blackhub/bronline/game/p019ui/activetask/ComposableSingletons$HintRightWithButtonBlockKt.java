package com.blackhub.bronline.game.p019ui.activetask;

import androidx.compose.foundation.ImageKt;
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
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HintRightWithButtonBlock.kt */
/* loaded from: classes.dex */
public final class ComposableSingletons$HintRightWithButtonBlockKt {

    @NotNull
    public static final ComposableSingletons$HintRightWithButtonBlockKt INSTANCE = new ComposableSingletons$HintRightWithButtonBlockKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11153lambda1 = ComposableLambdaKt.composableLambdaInstance(-7287442, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ComposableSingletons$HintRightWithButtonBlockKt$lambda-1$1
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
                    ComposerKt.traceEventStart(-7287442, i, -1, "com.blackhub.bronline.game.ui.activetask.ComposableSingletons$HintRightWithButtonBlockKt.lambda-1.<anonymous> (HintRightWithButtonBlock.kt:70)");
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_close_rounded, composer, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 124);
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
    public final Function2<Composer, Integer, Unit> m14882getLambda1$app_siteRelease() {
        return f11153lambda1;
    }
}

