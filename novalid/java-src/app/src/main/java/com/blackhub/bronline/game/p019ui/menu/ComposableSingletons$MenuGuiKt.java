package com.blackhub.bronline.game.p019ui.menu;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
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

/* compiled from: MenuGui.kt */
@Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$MenuGuiKt {

    @NotNull
    public static final ComposableSingletons$MenuGuiKt INSTANCE = new ComposableSingletons$MenuGuiKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11231lambda1 = ComposableLambdaKt.composableLambdaInstance(-560911024, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.menu.ComposableSingletons$MenuGuiKt$lambda-1$1
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
                    ComposerKt.traceEventStart(-560911024, i, -1, "com.blackhub.bronline.game.ui.menu.ComposableSingletons$MenuGuiKt.lambda-1.<anonymous> (MenuGui.kt:130)");
                }
                Modifier modifierFillMaxSize = SizeKt.fillMaxSize(Modifier.INSTANCE, 0.07f);
                IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_close_rounded, composer, 6), StringResources_androidKt.stringResource(R.string.common_close, composer, 6), modifierFillMaxSize, Color.INSTANCE.m11377getWhite0d7_KjU(), composer, 3464, 0);
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
    public final Function2<Composer, Integer, Unit> m15007getLambda1$app_siteRelease() {
        return f11231lambda1;
    }
}
