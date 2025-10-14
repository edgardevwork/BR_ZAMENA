package com.blackhub.bronline.game.p019ui.catchstreamer;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerUiState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CongratulationsDialogUI.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$CongratulationsDialogUIKt {

    @NotNull
    public static final ComposableSingletons$CongratulationsDialogUIKt INSTANCE = new ComposableSingletons$CongratulationsDialogUIKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11191lambda1 = ComposableLambdaKt.composableLambdaInstance(1679961970, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.ComposableSingletons$CongratulationsDialogUIKt$lambda-1$1
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
                    ComposerKt.traceEventStart(1679961970, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.ComposableSingletons$CongratulationsDialogUIKt.lambda-1.<anonymous> (CongratulationsDialogUI.kt:126)");
                }
                CongratulationsDialogUIKt.CongratulationsDialogUI(null, SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null), new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null), composer, 0, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11192lambda2 = ComposableLambdaKt.composableLambdaInstance(-1590697750, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.ComposableSingletons$CongratulationsDialogUIKt$lambda-2$1
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
                    ComposerKt.traceEventStart(-1590697750, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.ComposableSingletons$CongratulationsDialogUIKt.lambda-2.<anonymous> (CongratulationsDialogUI.kt:144)");
                }
                CongratulationsDialogUIKt.CongratulationsDialogUI(null, SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null), new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null), composer, 0, 1);
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
    public final Function2<Composer, Integer, Unit> m14943getLambda1$app_siteRelease() {
        return f11191lambda1;
    }

    @NotNull
    /* renamed from: getLambda-2$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14944getLambda2$app_siteRelease() {
        return f11192lambda2;
    }
}

