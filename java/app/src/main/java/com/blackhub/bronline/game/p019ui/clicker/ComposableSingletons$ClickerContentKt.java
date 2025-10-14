package com.blackhub.bronline.game.p019ui.clicker;

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

/* compiled from: ClickerContent.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$ClickerContentKt {

    @NotNull
    public static final ComposableSingletons$ClickerContentKt INSTANCE = new ComposableSingletons$ClickerContentKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11195lambda1 = ComposableLambdaKt.composableLambdaInstance(-576797612, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.clicker.ComposableSingletons$ClickerContentKt$lambda-1$1
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
                    ComposerKt.traceEventStart(-576797612, i, -1, "com.blackhub.bronline.game.ui.clicker.ComposableSingletons$ClickerContentKt.lambda-1.<anonymous> (ClickerContent.kt:145)");
                }
                IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_close_new, composer, 6), (String) null, (Modifier) null, ColorResources_androidKt.colorResource(R.color.white, composer, 6), composer, 56, 4);
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
    public final Function2<Composer, Integer, Unit> m14949getLambda1$app_siteRelease() {
        return f11195lambda1;
    }
}

