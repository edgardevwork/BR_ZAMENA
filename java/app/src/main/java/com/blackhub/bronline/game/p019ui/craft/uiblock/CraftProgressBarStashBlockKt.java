package com.blackhub.bronline.game.p019ui.craft.uiblock;

import androidx.annotation.ColorRes;
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
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftProgressBarStashBlock.kt */

public final class CraftProgressBarStashBlockKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CraftProgressBarStashBlock(final int i, final int i2, int i3, boolean z, @ColorRes int i4, @Nullable Composer composer, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        final int i13;
        final int i14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-977121403);
        if ((i6 & 1) != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            i7 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else {
            if ((i5 & 112) == 0) {
                i7 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else {
                if ((i5 & 896) == 0) {
                    i9 = i3;
                    i7 |= composerStartRestartGroup.changed(i9) ? 256 : 128;
                }
                i10 = i6 & 8;
                if (i10 != 0) {
                    i7 |= 3072;
                } else {
                    if ((i5 & 7168) == 0) {
                        z2 = z;
                        i7 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                    }
                    i11 = i6 & 16;
                    if (i11 != 0) {
                        if ((i5 & 57344) == 0) {
                            i12 = i4;
                            i7 |= composerStartRestartGroup.changed(i12) ? 16384 : 8192;
                        }
                        if ((46811 & i7) != 9362 || !composerStartRestartGroup.getSkipping()) {
                            int i15 = i8 == 0 ? R.color.dark_green : i9;
                            boolean z3 = i10 == 0 ? false : z2;
                            int i16 = i11 == 0 ? R.color.yellow_orange : i12;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-977121403, i7, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftProgressBarStashBlock (CraftProgressBarStashBlock.kt:21)");
                            }
                            int i17 = i7 << 12;
                            StripedHorizontalProgressBarWithIconKt.m15103StripedHorizontalProgressBarWithIconYTPNW1E(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._80wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composerStartRestartGroup, 6)), 0, null, 0, i, i2, 0L, ColorResources_androidKt.colorResource(i15, composerStartRestartGroup, (i7 >> 6) & 14), Integer.valueOf(R.drawable.ic_stash), R.dimen._10wdp, 0, StringResources_androidKt.stringResource(R.string.common_progress_value, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, composerStartRestartGroup, 70), null, z3, i16, composerStartRestartGroup, (i17 & 57344) | 905969664 | (i17 & 458752), i7 & 64512, 5198);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i13 = i15;
                            z2 = z3;
                            i14 = i16;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            i13 = i9;
                            i14 = i12;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final boolean z4 = z2;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftProgressBarStashBlockKt.CraftProgressBarStashBlock.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i18) {
                                    CraftProgressBarStashBlockKt.CraftProgressBarStashBlock(i, i2, i13, z4, i14, composer2, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), i6);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= CpioConstants.C_ISBLK;
                    i12 = i4;
                    if ((46811 & i7) != 9362) {
                        if (i8 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i172 = i7 << 12;
                        StripedHorizontalProgressBarWithIconKt.m15103StripedHorizontalProgressBarWithIconYTPNW1E(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._80wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composerStartRestartGroup, 6)), 0, null, 0, i, i2, 0L, ColorResources_androidKt.colorResource(i15, composerStartRestartGroup, (i7 >> 6) & 14), Integer.valueOf(R.drawable.ic_stash), R.dimen._10wdp, 0, StringResources_androidKt.stringResource(R.string.common_progress_value, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, composerStartRestartGroup, 70), null, z3, i16, composerStartRestartGroup, (i172 & 57344) | 905969664 | (i172 & 458752), i7 & 64512, 5198);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i13 = i15;
                        z2 = z3;
                        i14 = i16;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z2 = z;
                i11 = i6 & 16;
                if (i11 != 0) {
                }
                i12 = i4;
                if ((46811 & i7) != 9362) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i9 = i3;
            i10 = i6 & 8;
            if (i10 != 0) {
            }
            z2 = z;
            i11 = i6 & 16;
            if (i11 != 0) {
            }
            i12 = i4;
            if ((46811 & i7) != 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i3;
        i10 = i6 & 8;
        if (i10 != 0) {
        }
        z2 = z;
        i11 = i6 & 16;
        if (i11 != 0) {
        }
        i12 = i4;
        if ((46811 & i7) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void CraftProgressBarStashBlockPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1449624985);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1449624985, i, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftProgressBarStashBlockPreview (CraftProgressBarStashBlock.kt:44)");
            }
            CraftProgressBarStashBlock(8, 20, 0, false, 0, composerStartRestartGroup, 54, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftProgressBarStashBlockKt.CraftProgressBarStashBlockPreview.1
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
                    CraftProgressBarStashBlockKt.CraftProgressBarStashBlockPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

