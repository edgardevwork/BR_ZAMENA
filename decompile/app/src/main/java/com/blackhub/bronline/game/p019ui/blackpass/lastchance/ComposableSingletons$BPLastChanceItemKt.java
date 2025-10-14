package com.blackhub.bronline.game.p019ui.blackpass.lastchance;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
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

/* compiled from: BPLastChanceItem.kt */
@Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class ComposableSingletons$BPLastChanceItemKt {

    @NotNull
    public static final ComposableSingletons$BPLastChanceItemKt INSTANCE = new ComposableSingletons$BPLastChanceItemKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11161lambda1 = ComposableLambdaKt.composableLambdaInstance(-354695926, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.lastchance.ComposableSingletons$BPLastChanceItemKt$lambda-1$1
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
                    ComposerKt.traceEventStart(-354695926, i, -1, "com.blackhub.bronline.game.ui.blackpass.lastchance.ComposableSingletons$BPLastChanceItemKt.lambda-1.<anonymous> (BPLastChanceItem.kt:86)");
                }
                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.donate_tile_hot_selling, composer, 6), PaddingKt.m8124paddingVpY3zN4(BackgroundKt.m7770backgroundbw27NRU(Modifier.INSTANCE, ColorResources_androidKt.colorResource(R.color.red, composer, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._05wdp, composer, 6))), PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composer, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer, 6)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._9wdp, 0L, 0, Offset.INSTANCE.m11115getZeroF1C5BW0(), 0.0f, null, composer, 1600518, 38), composer, 0, 0, 65532);
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
    public final Function2<Composer, Integer, Unit> m14895getLambda1$app_siteRelease() {
        return f11161lambda1;
    }
}
