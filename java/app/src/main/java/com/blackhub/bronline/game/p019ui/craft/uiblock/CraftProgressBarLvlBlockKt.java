package com.blackhub.bronline.game.p019ui.craft.uiblock;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.blackhub.bronline.game.p019ui.widget.progressbar.StripedHorizontalProgressBarWithIconKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftProgressBarLvlBlock.kt */
/* loaded from: classes2.dex */
public final class CraftProgressBarLvlBlockKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CraftProgressBarLvlBlock(@NotNull final Modifier modifier, final int i, final int i2, @Nullable Composer composer, final int i3) {
        int i4;
        Composer composer2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(641863296);
        if ((i3 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i4 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(641863296, i4, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftProgressBarLvlBlock (CraftProgressBarLvlBlock.kt:20)");
            }
            if (i == 5) {
                composerStartRestartGroup.startReplaceableGroup(140930986);
                StripedHorizontalProgressBarWithIconKt.m15103StripedHorizontalProgressBarWithIconYTPNW1E(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(modifier, PrimitiveResources_androidKt.dimensionResource(R.dimen._148wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composerStartRestartGroup, 6)), 0, null, 0, 100, 100, 0L, ColorResources_androidKt.colorResource(R.color.dark_red, composerStartRestartGroup, 6), null, 0, 0, StringResources_androidKt.stringResource(R.string.craft_max_level, composerStartRestartGroup, 6), null, false, 0, composerStartRestartGroup, 221184, 0, 30542);
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceableGroup(140931434);
                composer2 = composerStartRestartGroup;
                StripedHorizontalProgressBarWithIconKt.m15103StripedHorizontalProgressBarWithIconYTPNW1E(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(modifier, PrimitiveResources_androidKt.dimensionResource(R.dimen._148wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composerStartRestartGroup, 6)), 0, null, 0, i2, 100, 0L, ColorResources_androidKt.colorResource(R.color.dark_red, composerStartRestartGroup, 6), Integer.valueOf(R.drawable.ic_craft), 0, 0, StringResources_androidKt.stringResource(R.string.common_value_with_level, new Object[]{Integer.valueOf(i)}, composerStartRestartGroup, 70), null, false, 0, composer2, ((i4 << 6) & 57344) | 100859904, 0, 30286);
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftProgressBarLvlBlockKt.CraftProgressBarLvlBlock.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i5) {
                    CraftProgressBarLvlBlockKt.CraftProgressBarLvlBlock(modifier, i, i2, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void CraftProgressBarLvlBlockPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-722434823);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-722434823, i, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftProgressBarLvlBlockPreview (CraftProgressBarLvlBlock.kt:50)");
            }
            CraftProgressBarLvlBlock(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._148wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composerStartRestartGroup, 6)), 1, 60, composerStartRestartGroup, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftProgressBarLvlBlockKt.CraftProgressBarLvlBlockPreview.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CraftProgressBarLvlBlockKt.CraftProgressBarLvlBlockPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

