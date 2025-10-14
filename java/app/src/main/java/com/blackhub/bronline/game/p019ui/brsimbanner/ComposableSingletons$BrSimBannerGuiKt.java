package com.blackhub.bronline.game.p019ui.brsimbanner;

import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BrSimBannerGui.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$BrSimBannerGuiKt {

    @NotNull
    public static final ComposableSingletons$BrSimBannerGuiKt INSTANCE = new ComposableSingletons$BrSimBannerGuiKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11170lambda1 = ComposableLambdaKt.composableLambdaInstance(-921824939, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.ComposableSingletons$BrSimBannerGuiKt$lambda-1$1
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
                    ComposerKt.traceEventStart(-921824939, i, -1, "com.blackhub.bronline.game.ui.brsimbanner.ComposableSingletons$BrSimBannerGuiKt.lambda-1.<anonymous> (BrSimBannerGui.kt:468)");
                }
                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.br_sim_banner_have_sim_card, composer, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._13wsp, 0L, 0, 0L, 0.0f, TextDecoration.INSTANCE.getUnderline(), composer, 1769478, 30), composer, 0, 0, 65534);
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
    public final Function2<Composer, Integer, Unit> m14912getLambda1$app_siteRelease() {
        return f11170lambda1;
    }
}

