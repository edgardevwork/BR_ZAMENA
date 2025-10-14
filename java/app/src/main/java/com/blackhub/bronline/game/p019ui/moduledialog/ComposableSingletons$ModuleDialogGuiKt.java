package com.blackhub.bronline.game.p019ui.moduledialog;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.p019ui.widget.anim.LottieLoopKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ModuleDialogGui.kt */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ModuleDialogGuiKt {

    @NotNull
    public static final ComposableSingletons$ModuleDialogGuiKt INSTANCE = new ComposableSingletons$ModuleDialogGuiKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11234lambda1 = ComposableLambdaKt.composableLambdaInstance(1025915736, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.moduledialog.ComposableSingletons$ModuleDialogGuiKt$lambda-1$1
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
                    ComposerKt.traceEventStart(1025915736, i, -1, "com.blackhub.bronline.game.ui.moduledialog.ComposableSingletons$ModuleDialogGuiKt.lambda-1.<anonymous> (ModuleDialogGui.kt:85)");
                }
                LottieLoopKt.LottieLoop(SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._44wdp, composer, 6)), R.raw.loader_red, 0, composer, 48, 4);
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
    public final Function2<Composer, Integer, Unit> m15012getLambda1$app_siteRelease() {
        return f11234lambda1;
    }
}

