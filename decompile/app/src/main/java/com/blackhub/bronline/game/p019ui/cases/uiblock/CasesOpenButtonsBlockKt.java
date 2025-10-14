package com.blackhub.bronline.game.p019ui.cases.uiblock;

import androidx.annotation.ColorRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.p019ui.cases.button.OpenButtonKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesOpenButtonsBlock.kt */
@Metadata(m7104d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a\u008d\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00010\u001d2!\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00010\u001dH\u0007¢\u0006\u0002\u0010\"¨\u0006#²\u0006\n\u0010$\u001a\u00020\u001bX\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020\u001bX\u008a\u0084\u0002"}, m7105d2 = {"CaseOpenButtonsPreview", "", "(Landroidx/compose/runtime/Composer;I)V", "CasesOpenButtonsBlock", "modifier", "Landroidx/compose/ui/Modifier;", "rewardName", "", "colorRarity", "", "openOneCaseBtnColorId", "openTenCasesBtnColorId", "priceOneCase", "priceTenCases", "saleOneCase", "saleTenCase", "salePriceOneCase", "salePriceTenCases", "openOneWidth", "", "openTenWidth", "btnOneAlpha", "btnTenAlpha", "typeOpenOneCaseButton", "typeOpenTenCaseButton", "rewardNameVisibility", "isAllowedClick", "", "onOpenOneClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "btnWidth", "onOpenTenClick", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;FFFFIIFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIII)V", "app_siteRelease", "isEnabledOneButton", "isEnabledTenButton"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCasesOpenButtonsBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesOpenButtonsBlock.kt\ncom/blackhub/bronline/game/ui/cases/uiblock/CasesOpenButtonsBlockKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,146:1\n1116#2,6:147\n1116#2,6:153\n87#3,6:159\n93#3:193\n97#3:237\n79#4,11:165\n79#4,11:199\n92#4:231\n92#4:236\n456#5,8:176\n464#5,3:190\n456#5,8:210\n464#5,3:224\n467#5,3:228\n467#5,3:233\n3737#6,6:184\n3737#6,6:218\n69#7,5:194\n74#7:227\n78#7:232\n81#8:238\n81#8:239\n*S KotlinDebug\n*F\n+ 1 CasesOpenButtonsBlock.kt\ncom/blackhub/bronline/game/ui/cases/uiblock/CasesOpenButtonsBlockKt\n*L\n57#1:147,6\n62#1:153,6\n68#1:159,6\n68#1:193\n68#1:237\n68#1:165,11\n86#1:199,11\n86#1:231\n68#1:236\n68#1:176,8\n68#1:190,3\n86#1:210,8\n86#1:224,3\n86#1:228,3\n68#1:233,3\n68#1:184,6\n86#1:218,6\n86#1:194,5\n86#1:227\n86#1:232\n57#1:238\n62#1:239\n*E\n"})
/* loaded from: classes2.dex */
public final class CasesOpenButtonsBlockKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:313:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014c  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CasesOpenButtonsBlock(@Nullable Modifier modifier, @NotNull final String rewardName, @ColorRes final int i, @ColorRes final int i2, @ColorRes final int i3, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable String str3, @Nullable String str4, final float f, final float f2, final float f3, final float f4, final int i4, final int i5, float f5, final boolean z, @NotNull final Function1<? super Float, Unit> onOpenOneClick, @NotNull final Function1<? super Float, Unit> onOpenTenClick, @Nullable Composer composer, final int i6, final int i7, final int i8, final int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        float f6;
        int i19;
        int i20;
        boolean z2;
        Object objRememberedValue;
        boolean z3;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM10870constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        final float f7;
        final Modifier modifier2;
        final String str5;
        final String str6;
        final Integer num3;
        final Integer num4;
        final String str7;
        final String str8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i21;
        int i22;
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        Intrinsics.checkNotNullParameter(onOpenOneClick, "onOpenOneClick");
        Intrinsics.checkNotNullParameter(onOpenTenClick, "onOpenTenClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(218110185);
        int i23 = i9 & 1;
        if (i23 != 0) {
            i10 = i6 | 6;
        } else if ((i6 & 14) == 0) {
            i10 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i6 & 112) == 0) {
            i10 |= composerStartRestartGroup.changed(rewardName) ? 32 : 16;
        }
        if ((i9 & 4) != 0) {
            i10 |= 384;
        } else if ((i6 & 896) == 0) {
            i10 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i9 & 8) != 0) {
            i10 |= 3072;
        } else {
            if ((i6 & 7168) == 0) {
                i10 |= composerStartRestartGroup.changed(i2) ? 2048 : 1024;
            }
            if ((i9 & 16) == 0) {
                i10 |= CpioConstants.C_ISBLK;
            } else if ((i6 & 57344) == 0) {
                i10 |= composerStartRestartGroup.changed(i3) ? 16384 : 8192;
            }
            i11 = i9 & 32;
            if (i11 == 0) {
                i10 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else if ((i6 & 458752) == 0) {
                i10 |= composerStartRestartGroup.changed(str) ? 131072 : 65536;
            }
            i12 = i9 & 64;
            if (i12 == 0) {
                i10 |= 1572864;
            } else if ((i6 & 3670016) == 0) {
                i10 |= composerStartRestartGroup.changed(str2) ? 1048576 : 524288;
            }
            i13 = i9 & 128;
            if (i13 == 0) {
                i10 |= 12582912;
            } else if ((i6 & 29360128) == 0) {
                i10 |= composerStartRestartGroup.changed(num) ? 8388608 : 4194304;
            }
            i14 = i9 & 256;
            if (i14 == 0) {
                i10 |= 100663296;
            } else if ((i6 & 234881024) == 0) {
                i10 |= composerStartRestartGroup.changed(num2) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
            }
            i15 = i9 & 512;
            if (i15 == 0) {
                i10 |= 805306368;
            } else if ((i6 & 1879048192) == 0) {
                i10 |= composerStartRestartGroup.changed(str3) ? 536870912 : 268435456;
            }
            i16 = i9 & 1024;
            if (i16 == 0) {
                i17 = i7 | 6;
            } else if ((i7 & 14) == 0) {
                i17 = i7 | (composerStartRestartGroup.changed(str4) ? 4 : 2);
            } else {
                i17 = i7;
            }
            if ((i9 & 2048) == 0) {
                i17 |= 48;
            } else if ((i7 & 112) == 0) {
                i17 |= composerStartRestartGroup.changed(f) ? 32 : 16;
            }
            int i24 = i17;
            if ((i9 & 4096) == 0) {
                i24 |= 384;
            } else {
                if ((i7 & 896) == 0) {
                    i24 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
                }
                if ((i9 & 8192) != 0) {
                    i24 |= 3072;
                } else if ((i7 & 7168) == 0) {
                    i24 |= composerStartRestartGroup.changed(f3) ? 2048 : 1024;
                }
                if ((i9 & 16384) != 0) {
                    i24 |= CpioConstants.C_ISBLK;
                } else if ((i7 & 57344) == 0) {
                    i24 |= composerStartRestartGroup.changed(f4) ? 16384 : 8192;
                }
                if ((32768 & i9) != 0) {
                    i24 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else {
                    if ((458752 & i7) == 0) {
                        i24 |= composerStartRestartGroup.changed(i4) ? 131072 : 65536;
                    }
                    if ((i9 & 65536) == 0) {
                        i24 |= 1572864;
                    } else if ((i7 & 3670016) == 0) {
                        i24 |= composerStartRestartGroup.changed(i5) ? 1048576 : 524288;
                    }
                    i18 = i9 & 131072;
                    if (i18 == 0) {
                        i24 |= 12582912;
                        f6 = f5;
                    } else {
                        f6 = f5;
                        if ((i7 & 29360128) == 0) {
                            i24 |= composerStartRestartGroup.changed(f6) ? 8388608 : 4194304;
                        }
                    }
                    if ((i9 & 262144) != 0) {
                        i22 = (i7 & 234881024) == 0 ? composerStartRestartGroup.changed(z) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION : 100663296;
                        if ((i9 & 524288) == 0) {
                            i21 = (i7 & 1879048192) == 0 ? composerStartRestartGroup.changedInstance(onOpenOneClick) ? 536870912 : 268435456 : 805306368;
                            if ((i9 & 1048576) == 0) {
                                i20 = i8 | 6;
                            } else {
                                if ((i8 & 14) != 0) {
                                    i19 = i8;
                                    if ((i10 & 1533916891) != 306783378 || (1533916891 & i24) != 306783378 || (i19 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
                                        Modifier modifier3 = i23 == 0 ? Modifier.INSTANCE : modifier;
                                        String str9 = i11 == 0 ? null : str;
                                        String str10 = i12 == 0 ? null : str2;
                                        Integer num5 = i13 == 0 ? null : num;
                                        Integer num6 = i14 == 0 ? null : num2;
                                        String str11 = i15 == 0 ? null : str3;
                                        String str12 = i16 == 0 ? null : str4;
                                        float f8 = i18 == 0 ? 1.0f : f6;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(218110185, i10, i24, "com.blackhub.bronline.game.ui.cases.uiblock.CasesOpenButtonsBlock (CasesOpenButtonsBlock.kt:51)");
                                        }
                                        composerStartRestartGroup.startReplaceableGroup(986558892);
                                        int i25 = i24 & 234881024;
                                        z2 = (i25 != 67108864) | ((i24 & 7168) != 2048);
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesOpenButtonsBlockKt$CasesOpenButtonsBlock$isEnabledOneButton$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                @NotNull
                                                public final Boolean invoke() {
                                                    return Boolean.valueOf(z && f3 == 1.0f);
                                                }
                                            });
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        State state = (State) objRememberedValue;
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.startReplaceableGroup(986559072);
                                        z3 = (i25 != 67108864) | ((i24 & 57344) == 16384);
                                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (!z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesOpenButtonsBlockKt$CasesOpenButtonsBlock$isEnabledTenButton$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                @NotNull
                                                public final Boolean invoke() {
                                                    return Boolean.valueOf(z && f4 == 1.0f);
                                                }
                                            });
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        }
                                        State state2 = (State) objRememberedValue2;
                                        composerStartRestartGroup.endReplaceableGroup();
                                        Alignment.Companion companion = Alignment.INSTANCE;
                                        Alignment.Vertical centerVertically = companion.getCenterVertically();
                                        composerStartRestartGroup.startReplaceableGroup(693286680);
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier3);
                                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (!composerStartRestartGroup.getInserting()) {
                                            composerStartRestartGroup.createNode(constructor);
                                        } else {
                                            composerStartRestartGroup.useNode();
                                        }
                                        composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        int i26 = i10 >> 12;
                                        int i27 = i10 >> 3;
                                        int i28 = i24 << 15;
                                        int i29 = (i24 >> 3) & 29360128;
                                        OpenButtonKt.OpenButton(i2, i4, str11, num5, str9, StringResources_androidKt.stringResource(R.string.cases_open_one, composerStartRestartGroup, 6), f, z, f3, CasesOpenButtonsBlock$lambda$1(state), onOpenOneClick, composerStartRestartGroup, ((i10 >> 9) & 14) | ((i24 >> 12) & 112) | ((i10 >> 21) & 896) | (i26 & 7168) | (i27 & 57344) | (i28 & 3670016) | i29 | (i28 & 234881024), (i24 >> 27) & 14, 0);
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
                                        Modifier modifierM7771backgroundbw27NRU$default = BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(AlphaKt.alpha(companion3, f8), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composerStartRestartGroup, 6), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._45wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._171wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.black_90, composerStartRestartGroup, 6), null, 2, null);
                                        Alignment center = companion.getCenter();
                                        composerStartRestartGroup.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7771backgroundbw27NRU$default);
                                        float f9 = f8;
                                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (!composerStartRestartGroup.getInserting()) {
                                            composerStartRestartGroup.createNode(constructor2);
                                        } else {
                                            composerStartRestartGroup.useNode();
                                        }
                                        composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                        if (!composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        int i30 = i10 >> 6;
                                        int i31 = i24;
                                        TextKt.m10024Text4IGK_g(rewardName, PaddingKt.m8125paddingVpY3zN4$default(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(TextAlign.INSTANCE.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._15wsp, ColorResources_androidKt.colorResource(i, composerStartRestartGroup, i30 & 14), 0, 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 124), composerStartRestartGroup, i27 & 14, 0, 65020);
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.endNode();
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composer2 = composerStartRestartGroup;
                                        int i32 = i31 << 12;
                                        OpenButtonKt.OpenButton(i3, i5, str12, num6, str10, StringResources_androidKt.stringResource(R.string.cases_open_ten, composer2, 6), f2, z, f4, CasesOpenButtonsBlock$lambda$3(state2), onOpenTenClick, composer2, (i26 & 14) | ((i31 >> 15) & 112) | ((i31 << 6) & 896) | ((i10 >> 15) & 7168) | (i30 & 57344) | (i32 & 3670016) | i29 | (i32 & 234881024), i19 & 14, 0);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        f7 = f9;
                                        modifier2 = modifier3;
                                        str5 = str9;
                                        str6 = str10;
                                        num3 = num5;
                                        num4 = num6;
                                        str7 = str11;
                                        str8 = str12;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        modifier2 = modifier;
                                        str5 = str;
                                        str6 = str2;
                                        num3 = num;
                                        num4 = num2;
                                        str7 = str3;
                                        str8 = str4;
                                        f7 = f6;
                                        composer2 = composerStartRestartGroup;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesOpenButtonsBlockKt.CasesOpenButtonsBlock.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num7) {
                                                invoke(composer3, num7.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(@Nullable Composer composer3, int i33) {
                                                CasesOpenButtonsBlockKt.CasesOpenButtonsBlock(modifier2, rewardName, i, i2, i3, str5, str6, num3, num4, str7, str8, f, f2, f3, f4, i4, i5, f7, z, onOpenOneClick, onOpenTenClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i6 | 1), RecomposeScopeImplKt.updateChangedFlags(i7), RecomposeScopeImplKt.updateChangedFlags(i8), i9);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i20 = i8 | (composerStartRestartGroup.changedInstance(onOpenTenClick) ? 4 : 2);
                            }
                            i19 = i20;
                            if ((i10 & 1533916891) != 306783378) {
                                if (i23 == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i18 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composerStartRestartGroup.startReplaceableGroup(986558892);
                                int i252 = i24 & 234881024;
                                z2 = (i252 != 67108864) | ((i24 & 7168) != 2048);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!z2) {
                                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesOpenButtonsBlockKt$CasesOpenButtonsBlock$isEnabledOneButton$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            return Boolean.valueOf(z && f3 == 1.0f);
                                        }
                                    });
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    State state3 = (State) objRememberedValue;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.startReplaceableGroup(986559072);
                                    z3 = (i252 != 67108864) | ((i24 & 57344) == 16384);
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (!z3) {
                                        objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesOpenButtonsBlockKt$CasesOpenButtonsBlock$isEnabledTenButton$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                return Boolean.valueOf(z && f4 == 1.0f);
                                            }
                                        });
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        State state22 = (State) objRememberedValue2;
                                        composerStartRestartGroup.endReplaceableGroup();
                                        Alignment.Companion companion4 = Alignment.INSTANCE;
                                        Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                                        composerStartRestartGroup.startReplaceableGroup(693286680);
                                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifier3);
                                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (!composerStartRestartGroup.getInserting()) {
                                        }
                                        composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                                        if (!composerM10870constructorimpl.getInserting()) {
                                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                            int i262 = i10 >> 12;
                                            int i272 = i10 >> 3;
                                            int i282 = i24 << 15;
                                            int i292 = (i24 >> 3) & 29360128;
                                            OpenButtonKt.OpenButton(i2, i4, str11, num5, str9, StringResources_androidKt.stringResource(R.string.cases_open_one, composerStartRestartGroup, 6), f, z, f3, CasesOpenButtonsBlock$lambda$1(state3), onOpenOneClick, composerStartRestartGroup, ((i10 >> 9) & 14) | ((i24 >> 12) & 112) | ((i10 >> 21) & 896) | (i262 & 7168) | (i272 & 57344) | (i282 & 3670016) | i292 | (i282 & 234881024), (i24 >> 27) & 14, 0);
                                            Modifier.Companion companion32 = Modifier.INSTANCE;
                                            SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion32, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
                                            Modifier modifierM7771backgroundbw27NRU$default2 = BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(AlphaKt.alpha(companion32, f8), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composerStartRestartGroup, 6), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._45wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._171wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.black_90, composerStartRestartGroup, 6), null, 2, null);
                                            Alignment center2 = companion4.getCenter();
                                            composerStartRestartGroup.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierM7771backgroundbw27NRU$default2);
                                            float f92 = f8;
                                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                            }
                                            composerStartRestartGroup.startReusableNode();
                                            if (!composerStartRestartGroup.getInserting()) {
                                            }
                                            composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                                            if (!composerM10870constructorimpl2.getInserting()) {
                                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                int i302 = i10 >> 6;
                                                int i312 = i24;
                                                TextKt.m10024Text4IGK_g(rewardName, PaddingKt.m8125paddingVpY3zN4$default(companion32, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(TextAlign.INSTANCE.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._15wsp, ColorResources_androidKt.colorResource(i, composerStartRestartGroup, i302 & 14), 0, 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 124), composerStartRestartGroup, i272 & 14, 0, 65020);
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endNode();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composer2 = composerStartRestartGroup;
                                                int i322 = i312 << 12;
                                                OpenButtonKt.OpenButton(i3, i5, str12, num6, str10, StringResources_androidKt.stringResource(R.string.cases_open_ten, composer2, 6), f2, z, f4, CasesOpenButtonsBlock$lambda$3(state22), onOpenTenClick, composer2, (i262 & 14) | ((i312 >> 15) & 112) | ((i312 << 6) & 896) | ((i10 >> 15) & 7168) | (i302 & 57344) | (i322 & 3670016) | i292 | (i322 & 234881024), i19 & 14, 0);
                                                composer2.endReplaceableGroup();
                                                composer2.endNode();
                                                composer2.endReplaceableGroup();
                                                composer2.endReplaceableGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                f7 = f92;
                                                modifier2 = modifier3;
                                                str5 = str9;
                                                str6 = str10;
                                                num3 = num5;
                                                num4 = num6;
                                                str7 = str11;
                                                str8 = str12;
                                            }
                                        }
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i24 |= i21;
                        if ((i9 & 1048576) == 0) {
                        }
                        i19 = i20;
                        if ((i10 & 1533916891) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i24 |= i22;
                    if ((i9 & 524288) == 0) {
                    }
                    i24 |= i21;
                    if ((i9 & 1048576) == 0) {
                    }
                    i19 = i20;
                    if ((i10 & 1533916891) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i9 & 65536) == 0) {
                }
                i18 = i9 & 131072;
                if (i18 == 0) {
                }
                if ((i9 & 262144) != 0) {
                }
                i24 |= i22;
                if ((i9 & 524288) == 0) {
                }
                i24 |= i21;
                if ((i9 & 1048576) == 0) {
                }
                i19 = i20;
                if ((i10 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i9 & 8192) != 0) {
            }
            if ((i9 & 16384) != 0) {
            }
            if ((32768 & i9) != 0) {
            }
            if ((i9 & 65536) == 0) {
            }
            i18 = i9 & 131072;
            if (i18 == 0) {
            }
            if ((i9 & 262144) != 0) {
            }
            i24 |= i22;
            if ((i9 & 524288) == 0) {
            }
            i24 |= i21;
            if ((i9 & 1048576) == 0) {
            }
            i19 = i20;
            if ((i10 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i9 & 16) == 0) {
        }
        i11 = i9 & 32;
        if (i11 == 0) {
        }
        i12 = i9 & 64;
        if (i12 == 0) {
        }
        i13 = i9 & 128;
        if (i13 == 0) {
        }
        i14 = i9 & 256;
        if (i14 == 0) {
        }
        i15 = i9 & 512;
        if (i15 == 0) {
        }
        i16 = i9 & 1024;
        if (i16 == 0) {
        }
        if ((i9 & 2048) == 0) {
        }
        int i242 = i17;
        if ((i9 & 4096) == 0) {
        }
        if ((i9 & 8192) != 0) {
        }
        if ((i9 & 16384) != 0) {
        }
        if ((32768 & i9) != 0) {
        }
        if ((i9 & 65536) == 0) {
        }
        i18 = i9 & 131072;
        if (i18 == 0) {
        }
        if ((i9 & 262144) != 0) {
        }
        i242 |= i22;
        if ((i9 & 524288) == 0) {
        }
        i242 |= i21;
        if ((i9 & 1048576) == 0) {
        }
        i19 = i20;
        if ((i10 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void CaseOpenButtonsPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1573132468);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1573132468, i, -1, "com.blackhub.bronline.game.ui.cases.uiblock.CaseOpenButtonsPreview (CasesOpenButtonsBlock.kt:123)");
            }
            CasesOpenButtonsBlock(null, "FLANKE dsad dsada fghR", R.color.yellow, R.color.gray_blue, R.color.red, "100 BC", "1000 BC", 0, -10, "90 BC", "900 BC", 0.5f, 0.5f, 0.5f, 1.0f, 2, 2, 0.0f, true, new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesOpenButtonsBlockKt.CaseOpenButtonsPreview.1
                public final void invoke(float f) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                    invoke(f.floatValue());
                    return Unit.INSTANCE;
                }
            }, new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesOpenButtonsBlockKt.CaseOpenButtonsPreview.2
                public final void invoke(float f) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                    invoke(f.floatValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 920350128, 907767222, 6, 131073);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesOpenButtonsBlockKt.CaseOpenButtonsPreview.3
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
                    CasesOpenButtonsBlockKt.CaseOpenButtonsPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final boolean CasesOpenButtonsBlock$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    public static final boolean CasesOpenButtonsBlock$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
