package com.blackhub.bronline.game.p019ui.tutorial;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.enums.SideEnum;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.p019ui.widget.other.GradientSphereKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HintRightWithImageBlock.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$HintRightWithImageBlockKt {

    @NotNull
    public static final ComposableSingletons$HintRightWithImageBlockKt INSTANCE = new ComposableSingletons$HintRightWithImageBlockKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11246lambda1 = ComposableLambdaKt.composableLambdaInstance(1621384764, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.tutorial.ComposableSingletons$HintRightWithImageBlockKt$lambda-1$1
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
                    ComposerKt.traceEventStart(1621384764, i, -1, "com.blackhub.bronline.game.ui.tutorial.ComposableSingletons$HintRightWithImageBlockKt.lambda-1.<anonymous> (HintRightWithImageBlock.kt:81)");
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_close_rounded, composer, 6), (String) null, SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
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
    public static Function2<Composer, Integer, Unit> f11247lambda2 = ComposableLambdaKt.composableLambdaInstance(-673169167, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.tutorial.ComposableSingletons$HintRightWithImageBlockKt$lambda-2$1
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
                    ComposerKt.traceEventStart(-673169167, i, -1, "com.blackhub.bronline.game.ui.tutorial.ComposableSingletons$HintRightWithImageBlockKt.lambda-2.<anonymous> (HintRightWithImageBlock.kt:99)");
                }
                GradientSphereKt.GradientSphere(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), SideEnum.CENTER, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_red, composer, 6)), Color.m11330boximpl(Color.INSTANCE.m11375getTransparent0d7_KjU())}), new Pair[0], 0.0f, ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._15sdp, composer, 6), composer, 0), composer, 4150, 16);
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
    public static Function2<Composer, Integer, Unit> f11248lambda3 = ComposableLambdaKt.composableLambdaInstance(-300093537, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.tutorial.ComposableSingletons$HintRightWithImageBlockKt$lambda-3$1
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
                    ComposerKt.traceEventStart(-300093537, i, -1, "com.blackhub.bronline.game.ui.tutorial.ComposableSingletons$HintRightWithImageBlockKt.lambda-3.<anonymous> (HintRightWithImageBlock.kt:130)");
                }
                float f = 20;
                float f2 = 10;
                TextKt.m10025TextIbK3jfQ(StringExtensionKt.htmlTextToAnnotatedString("Приветствую. Не волнуйтесь, Вы уже прошли половину экзамена. Осталось самое интересное.\n <font color=#CCFFDD>Откройте Радиальное меню</font> и заведите двигатель.Приветствую. Не волнуйтесь, Вы уже прошли половину <font color=#FFBAFA>экзамена</font>. Осталось самое интересное.\nОткройте Радиальное меню и заведите двигатель.Приветствую."), PaddingKt.m8126paddingqDBjuR0(Modifier.INSTANCE, C2046Dp.m13666constructorimpl(f), C2046Dp.m13666constructorimpl(f2), C2046Dp.m13666constructorimpl(f), C2046Dp.m13666constructorimpl(f2)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TypographyStyle.INSTANCE.m14861montserratSemiBold9spOr7ssp67j0QOw(0L, 0, 0L, 0.0f, composer, CpioConstants.C_ISBLK, 15), composer, 0, 0, 131068);
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
    public final Function2<Composer, Integer, Unit> m15028getLambda1$app_siteRelease() {
        return f11246lambda1;
    }

    @NotNull
    /* renamed from: getLambda-2$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15029getLambda2$app_siteRelease() {
        return f11247lambda2;
    }

    @NotNull
    /* renamed from: getLambda-3$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15030getLambda3$app_siteRelease() {
        return f11248lambda3;
    }
}

