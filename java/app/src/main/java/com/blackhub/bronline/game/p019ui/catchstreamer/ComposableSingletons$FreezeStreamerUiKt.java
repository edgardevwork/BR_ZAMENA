package com.blackhub.bronline.game.p019ui.catchstreamer;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
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

/* compiled from: FreezeStreamerUi.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$FreezeStreamerUiKt {

    @NotNull
    public static final ComposableSingletons$FreezeStreamerUiKt INSTANCE = new ComposableSingletons$FreezeStreamerUiKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11193lambda1 = ComposableLambdaKt.composableLambdaInstance(823715997, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.ComposableSingletons$FreezeStreamerUiKt$lambda-1$1
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
                    ComposerKt.traceEventStart(823715997, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.ComposableSingletons$FreezeStreamerUiKt.lambda-1.<anonymous> (FreezeStreamerUi.kt:89)");
                }
                IconKt.m9497Iconww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, Color.INSTANCE.m11377getWhite0d7_KjU(), composer, 3120, 4);
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
    public final Function2<Composer, Integer, Unit> m14945getLambda1$app_siteRelease() {
        return f11193lambda1;
    }
}

