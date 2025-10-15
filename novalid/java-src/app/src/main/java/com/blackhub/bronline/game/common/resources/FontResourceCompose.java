package com.blackhub.bronline.game.common.resources;

import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FontResourceCompose.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/resources/FontResourceCompose;", "", "()V", "getBPPrizeDialogTitleTextStyle", "Landroidx/compose/ui/text/TextStyle;", "ifGetAward", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class FontResourceCompose {
    public static final int $stable = 0;

    @NotNull
    public static final FontResourceCompose INSTANCE = new FontResourceCompose();

    @Composable
    @NotNull
    public final TextStyle getBPPrizeDialogTitleTextStyle(boolean z, @Nullable Composer composer, int i) {
        TextStyle textStyleM14873mullerBoldCustomSpbl3sdaw;
        composer.startReplaceableGroup(190695118);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(190695118, i, -1, "com.blackhub.bronline.game.common.resources.FontResourceCompose.getBPPrizeDialogTitleTextStyle (FontResourceCompose.kt:9)");
        }
        if (z) {
            composer.startReplaceableGroup(1779725679);
            textStyleM14873mullerBoldCustomSpbl3sdaw = TypographyStyle.INSTANCE.m14873mullerBoldCustomSpbl3sdaw(R.dimen._20wsp, ColorResources_androidKt.colorResource(R.color.white, composer, 6), 0, 0L, 0.0f, composer, 196614, 28);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1779725839);
            textStyleM14873mullerBoldCustomSpbl3sdaw = TypographyStyle.INSTANCE.m14873mullerBoldCustomSpbl3sdaw(R.dimen._14wsp, ColorResources_androidKt.colorResource(R.color.total_black, composer, 6), 0, 0L, 0.0f, composer, 196614, 28);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyleM14873mullerBoldCustomSpbl3sdaw;
    }
}
