package com.blackhub.bronline.game.p019ui.blackpass;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.p019ui.widget.button.ButtonWhiteStripKt;
import com.bless.client.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassBoostHintUI.kt */
/* loaded from: classes.dex */
public final class ComposableSingletons$BlackPassBoostHintUIKt {

    @NotNull
    public static final ComposableSingletons$BlackPassBoostHintUIKt INSTANCE = new ComposableSingletons$BlackPassBoostHintUIKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11158lambda1 = ComposableLambdaKt.composableLambdaInstance(-2125078176, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.ComposableSingletons$BlackPassBoostHintUIKt$lambda-1$1
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
                    ComposerKt.traceEventStart(-2125078176, i, -1, "com.blackhub.bronline.game.ui.blackpass.ComposableSingletons$BlackPassBoostHintUIKt.lambda-1.<anonymous> (BlackPassBoostHintUI.kt:179)");
                }
                IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_close_rounded, composer, 6), (String) null, SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._16sdp, composer, 6)), Color.INSTANCE.m11377getWhite0d7_KjU(), composer, 3128, 0);
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
    public static Function2<Composer, Integer, Unit> f11159lambda2 = ComposableLambdaKt.composableLambdaInstance(2066722237, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.ComposableSingletons$BlackPassBoostHintUIKt$lambda-2$1
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
                    ComposerKt.traceEventStart(2066722237, i, -1, "com.blackhub.bronline.game.ui.blackpass.ComposableSingletons$BlackPassBoostHintUIKt.lambda-2.<anonymous> (BlackPassBoostHintUI.kt:225)");
                }
                Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._250sdp, composer, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._40sdp, composer, 6));
                String upperCase = StringResources_androidKt.stringResource(R.string.black_pass_boost_text_button, composer, 6).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                ButtonWhiteStripKt.ButtonWhiteStrip(modifierM8158height3ABfNKs, upperCase, R.dimen._7sdp, R.dimen._17ssp, 0, composer, 3456, 16);
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
    public final Function2<Composer, Integer, Unit> m14892getLambda1$app_siteRelease() {
        return f11158lambda1;
    }

    @NotNull
    /* renamed from: getLambda-2$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14893getLambda2$app_siteRelease() {
        return f11159lambda2;
    }
}

