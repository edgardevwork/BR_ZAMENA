package com.blackhub.bronline.game.p019ui.widget.dialog.dissapearingdialog;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DisappearingDialog.kt */
/* loaded from: classes3.dex */
public final class ComposableSingletons$DisappearingDialogKt {

    @NotNull
    public static final ComposableSingletons$DisappearingDialogKt INSTANCE = new ComposableSingletons$DisappearingDialogKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11283lambda1 = ComposableLambdaKt.composableLambdaInstance(-1524077994, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.ComposableSingletons$DisappearingDialogKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1524077994, i, -1, "com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.ComposableSingletons$DisappearingDialogKt.lambda-1.<anonymous> (DisappearingDialog.kt:120)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    /* renamed from: getLambda-1$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15084getLambda1$app_siteRelease() {
        return f11283lambda1;
    }
}

