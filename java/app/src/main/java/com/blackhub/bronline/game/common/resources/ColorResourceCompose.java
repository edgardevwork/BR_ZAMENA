package com.blackhub.bronline.game.common.resources;

import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ColorResourceCompose.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ColorResourceCompose {
    public static final int $stable = 0;

    @NotNull
    public static final ColorResourceCompose INSTANCE = new ColorResourceCompose();

    @Composable
    /* renamed from: getBPPrizeDialogButtonBgColor-XeAY9LY, reason: not valid java name */
    public final long m14391getBPPrizeDialogButtonBgColorXeAY9LY(boolean z, @Nullable Composer composer, int i) {
        long jColorResource;
        composer.startReplaceableGroup(1769402467);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1769402467, i, -1, "com.blackhub.bronline.game.common.resources.ColorResourceCompose.getBPPrizeDialogButtonBgColor (ColorResourceCompose.kt:10)");
        }
        if (z) {
            composer.startReplaceableGroup(-2040936588);
            jColorResource = ColorResources_androidKt.colorResource(R.color.yellow, composer, 6);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-2040936532);
            jColorResource = ColorResources_androidKt.colorResource(R.color.red, composer, 6);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jColorResource;
    }

    @Composable
    /* renamed from: getBPPrizeDialogButtonTextColor-XeAY9LY, reason: not valid java name */
    public final long m14392getBPPrizeDialogButtonTextColorXeAY9LY(boolean z, @Nullable Composer composer, int i) {
        long jColorResource;
        composer.startReplaceableGroup(-1293087749);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1293087749, i, -1, "com.blackhub.bronline.game.common.resources.ColorResourceCompose.getBPPrizeDialogButtonTextColor (ColorResourceCompose.kt:17)");
        }
        if (z) {
            composer.startReplaceableGroup(-1614397980);
            jColorResource = ColorResources_androidKt.colorResource(R.color.total_black, composer, 6);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1614397919);
            jColorResource = ColorResources_androidKt.colorResource(R.color.white, composer, 6);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jColorResource;
    }

    @Composable
    /* renamed from: getBPPrizeDialogTitleBgColor-XeAY9LY, reason: not valid java name */
    public final long m14393getBPPrizeDialogTitleBgColorXeAY9LY(boolean z, @Nullable Composer composer, int i) {
        long jColorResource;
        composer.startReplaceableGroup(2130340933);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2130340933, i, -1, "com.blackhub.bronline.game.common.resources.ColorResourceCompose.getBPPrizeDialogTitleBgColor (ColorResourceCompose.kt:24)");
        }
        if (z) {
            composer.startReplaceableGroup(1165810216);
            jColorResource = ColorResources_androidKt.colorResource(R.color.red, composer, 6);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1165810269);
            jColorResource = ColorResources_androidKt.colorResource(R.color.yellow, composer, 6);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jColorResource;
    }

    @Composable
    @NotNull
    public final Brush getGiftsPurchaseGiftBrushColor(boolean z, @Nullable Composer composer, int i) {
        Brush brushM11293radialGradientP_VxKs$default;
        composer.startReplaceableGroup(-1236865721);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1236865721, i, -1, "com.blackhub.bronline.game.common.resources.ColorResourceCompose.getGiftsPurchaseGiftBrushColor (ColorResourceCompose.kt:31)");
        }
        if (z) {
            composer.startReplaceableGroup(-519866966);
            brushM11293radialGradientP_VxKs$default = Brush.Companion.m11293radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_medium_green, composer, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composer, 6))}), 0L, 0.0f, 0, 14, (Object) null);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-519866760);
            brushM11293radialGradientP_VxKs$default = Brush.Companion.m11293radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.yellow_orange, composer, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composer, 6))}), 0L, 0.0f, 0, 14, (Object) null);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return brushM11293radialGradientP_VxKs$default;
    }

    @Composable
    @NotNull
    public final Brush getGiftsPurchaseGiftTitleBgColor(boolean z, @Nullable Composer composer, int i) {
        Brush brushM11297verticalGradient8A3gB4$default;
        composer.startReplaceableGroup(733765348);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(733765348, i, -1, "com.blackhub.bronline.game.common.resources.ColorResourceCompose.getGiftsPurchaseGiftTitleBgColor (ColorResourceCompose.kt:48)");
        }
        if (z) {
            composer.startReplaceableGroup(-651802207);
            brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_medium_green, composer, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_medium_green, composer, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-651801993);
            brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.yellow, composer, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.yellow_orange, composer, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return brushM11297verticalGradient8A3gB4$default;
    }

    @Composable
    /* renamed from: getGiftsPurchaseGiftButtonBgColor-XeAY9LY, reason: not valid java name */
    public final long m14394getGiftsPurchaseGiftButtonBgColorXeAY9LY(boolean z, @Nullable Composer composer, int i) {
        long jColorResource;
        composer.startReplaceableGroup(1226572699);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1226572699, i, -1, "com.blackhub.bronline.game.common.resources.ColorResourceCompose.getGiftsPurchaseGiftButtonBgColor (ColorResourceCompose.kt:65)");
        }
        if (z) {
            composer.startReplaceableGroup(1742600197);
            jColorResource = ColorResources_androidKt.colorResource(R.color.dark_medium_green, composer, 6);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1742600264);
            jColorResource = ColorResources_androidKt.colorResource(R.color.yellow_orange, composer, 6);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jColorResource;
    }

    @Composable
    @NotNull
    public final Brush getCalendarPrizeItemColor(@NotNull CommonRewardModel prizeItem, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(prizeItem, "prizeItem");
        composer.startReplaceableGroup(-1347652835);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1347652835, i, -1, "com.blackhub.bronline.game.common.resources.ColorResourceCompose.getCalendarPrizeItemColor (ColorResourceCompose.kt:74)");
        }
        Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composer, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(prizeItem.getColorIdForPrizeItem(), composer, 0))}), 0.0f, 0.0f, 0, 14, (Object) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return brushM11297verticalGradient8A3gB4$default;
    }
}

