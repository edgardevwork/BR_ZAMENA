package com.blackhub.bronline.game.p019ui.cases.p020ui;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
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

/* compiled from: CasesMainUi.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$CasesMainUiKt {

    @NotNull
    public static final ComposableSingletons$CasesMainUiKt INSTANCE = new ComposableSingletons$CasesMainUiKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11181lambda1 = ComposableLambdaKt.composableLambdaInstance(2127705105, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.ComposableSingletons$CasesMainUiKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2127705105, i, -1, "com.blackhub.bronline.game.ui.cases.ui.ComposableSingletons$CasesMainUiKt.lambda-1.<anonymous> (CasesMainUi.kt:301)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11182lambda2 = ComposableLambdaKt.composableLambdaInstance(-1576207375, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.ComposableSingletons$CasesMainUiKt$lambda-2$1
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
                    ComposerKt.traceEventStart(-1576207375, i, -1, "com.blackhub.bronline.game.ui.cases.ui.ComposableSingletons$CasesMainUiKt.lambda-2.<anonymous> (CasesMainUi.kt:482)");
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_rewards, composer, 6), (String) null, SizeKt.m8174sizeVpY3zN4(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composer, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composer, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11183lambda3 = ComposableLambdaKt.composableLambdaInstance(-567019019, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.ComposableSingletons$CasesMainUiKt$lambda-3$1
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
                    ComposerKt.traceEventStart(-567019019, i, -1, "com.blackhub.bronline.game.ui.cases.ui.ComposableSingletons$CasesMainUiKt.lambda-3.<anonymous> (CasesMainUi.kt:537)");
                }
                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.cases_hint_cases, composer, 6), PaddingKt.m8127paddingqDBjuR0$default(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer, 6), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._9wsp, ColorResources_androidKt.colorResource(R.color.white, composer, 6), 0, 0L, 0.0f, composer, 196614, 28), composer, 0, 0, 65532);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11184lambda4 = ComposableLambdaKt.composableLambdaInstance(-1727571843, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.ComposableSingletons$CasesMainUiKt$lambda-4$1
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
                    ComposerKt.traceEventStart(-1727571843, i, -1, "com.blackhub.bronline.game.ui.cases.ui.ComposableSingletons$CasesMainUiKt.lambda-4.<anonymous> (CasesMainUi.kt:578)");
                }
                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.cases_hint_feed_reward, composer, 6), (Modifier) Modifier.INSTANCE, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._9wsp, ColorResources_androidKt.colorResource(R.color.white, composer, 6), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer, 196614, 24), composer, 48, 0, 65532);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11185lambda5 = ComposableLambdaKt.composableLambdaInstance(1252421236, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.ComposableSingletons$CasesMainUiKt$lambda-5$1
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
                    ComposerKt.traceEventStart(1252421236, i, -1, "com.blackhub.bronline.game.ui.cases.ui.ComposableSingletons$CasesMainUiKt.lambda-5.<anonymous> (CasesMainUi.kt:622)");
                }
                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.cases_hint_storage, composer, 6), (Modifier) Modifier.INSTANCE, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._9wsp, ColorResources_androidKt.colorResource(R.color.white, composer, 6), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer, 196614, 24), composer, 48, 0, 65532);
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
    public final Function2<Composer, Integer, Unit> m14931getLambda1$app_siteRelease() {
        return f11181lambda1;
    }

    @NotNull
    /* renamed from: getLambda-2$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14932getLambda2$app_siteRelease() {
        return f11182lambda2;
    }

    @NotNull
    /* renamed from: getLambda-3$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14933getLambda3$app_siteRelease() {
        return f11183lambda3;
    }

    @NotNull
    /* renamed from: getLambda-4$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14934getLambda4$app_siteRelease() {
        return f11184lambda4;
    }

    @NotNull
    /* renamed from: getLambda-5$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14935getLambda5$app_siteRelease() {
        return f11185lambda5;
    }
}

