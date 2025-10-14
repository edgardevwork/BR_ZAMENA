package com.blackhub.bronline.game.p019ui.halloweenaward;

import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Modifier;
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
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PurchaseOfferAwardWithoutBPBlock.kt */
@Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$PurchaseOfferAwardWithoutBPBlockKt {

    @NotNull
    public static final ComposableSingletons$PurchaseOfferAwardWithoutBPBlockKt INSTANCE = new ComposableSingletons$PurchaseOfferAwardWithoutBPBlockKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11213lambda1 = ComposableLambdaKt.composableLambdaInstance(306589400, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.ComposableSingletons$PurchaseOfferAwardWithoutBPBlockKt$lambda-1$1
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
                    ComposerKt.traceEventStart(306589400, i, -1, "com.blackhub.bronline.game.ui.halloweenaward.ComposableSingletons$PurchaseOfferAwardWithoutBPBlockKt.lambda-1.<anonymous> (PurchaseOfferAwardWithoutBPBlock.kt:48)");
                }
                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_without_bp, composer, 6), PaddingKt.m8123padding3ABfNKs(IntrinsicKt.width(Modifier.INSTANCE, IntrinsicSize.Max), PrimitiveResources_androidKt.dimensionResource(R.dimen._4sdp, composer, 6)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14813montserratBoldItalic14spOr11ssp67j0QOw(0L, 0, 0L, 0.0f, composer, CpioConstants.C_ISBLK, 15), composer, 0, 0, 65532);
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
    public final Function2<Composer, Integer, Unit> m14978getLambda1$app_siteRelease() {
        return f11213lambda1;
    }
}
