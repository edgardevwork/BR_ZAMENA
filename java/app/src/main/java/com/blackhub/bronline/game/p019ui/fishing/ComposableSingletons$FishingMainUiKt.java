package com.blackhub.bronline.game.p019ui.fishing;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.gui.fishing.FishingUiState;
import com.blackhub.bronline.game.gui.fishing.data.FishingBaitObj;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FishingMainUi.kt */
/* loaded from: classes3.dex */
public final class ComposableSingletons$FishingMainUiKt {

    @NotNull
    public static final ComposableSingletons$FishingMainUiKt INSTANCE = new ComposableSingletons$FishingMainUiKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11211lambda1 = ComposableLambdaKt.composableLambdaInstance(-1541833900, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.ComposableSingletons$FishingMainUiKt$lambda-1$1
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
                    ComposerKt.traceEventStart(-1541833900, i, -1, "com.blackhub.bronline.game.ui.fishing.ComposableSingletons$FishingMainUiKt.lambda-1.<anonymous> (FishingMainUi.kt:221)");
                }
                FishingMainUiKt.FishingMainContent(BackgroundKt.m7771backgroundbw27NRU$default(Modifier.INSTANCE, Color.INSTANCE.m11378getYellow0d7_KjU(), null, 2, null), new FishingUiState(0, 0.0f, 0L, 0, 0, 0.0f, 0, null, new FishingBaitObj("title 1", 0, "description 1 \ndsadsa", null, null, 0.85f, "ic_fish_tackle", 0, 1, null, 666, null), null, 0, null, false, false, false, false, false, false, false, 523903, null), 15L, SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null), null, null, null, null, null, composer, 454, 496);
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
    public final Function2<Composer, Integer, Unit> m14973getLambda1$app_siteRelease() {
        return f11211lambda1;
    }
}

