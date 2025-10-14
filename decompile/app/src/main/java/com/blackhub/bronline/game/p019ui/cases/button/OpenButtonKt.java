package com.blackhub.bronline.game.p019ui.cases.button;

import androidx.annotation.ColorRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.graphics.Color;
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
import androidx.compose.runtime.Updater;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
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

/* compiled from: OpenButton.kt */
@Metadata(m7104d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u008c\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\r2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, m7105d2 = {"OpenButton", "", "openCasesBtnColorId", "", "typeOpenCaseButton", "formattedPriceCaseWithSale", "", "valueOfSale", "formattedPrice", "btnText", "btnWidth", "", "isAllowedClick", "", "btnAlpha", "isEnabledClick", "onClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "(IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;FZFZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "OpenButtonPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nOpenButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenButton.kt\ncom/blackhub/bronline/game/ui/cases/button/OpenButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,195:1\n1116#2,6:196\n87#3,6:202\n93#3:236\n97#3:319\n79#4,11:208\n79#4,11:242\n79#4,11:276\n92#4:308\n92#4:313\n92#4:318\n456#5,8:219\n464#5,3:233\n456#5,8:253\n464#5,3:267\n456#5,8:287\n464#5,3:301\n467#5,3:305\n467#5,3:310\n467#5,3:315\n3737#6,6:227\n3737#6,6:261\n3737#6,6:295\n69#7,5:237\n74#7:270\n69#7,5:271\n74#7:304\n78#7:309\n78#7:314\n*S KotlinDebug\n*F\n+ 1 OpenButton.kt\ncom/blackhub/bronline/game/ui/cases/button/OpenButtonKt\n*L\n61#1:196,6\n52#1:202,6\n52#1:236\n52#1:319\n52#1:208,11\n91#1:242,11\n148#1:276,11\n148#1:308\n91#1:313\n52#1:318\n52#1:219,8\n52#1:233,3\n91#1:253,8\n91#1:267,3\n148#1:287,8\n148#1:301,3\n148#1:305,3\n91#1:310,3\n52#1:315,3\n52#1:227,6\n91#1:261,6\n148#1:295,6\n91#1:237,5\n91#1:270\n148#1:271,5\n148#1:304\n148#1:309\n91#1:314\n*E\n"})
/* loaded from: classes2.dex */
public final class OpenButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0162 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0112  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OpenButton(@ColorRes final int i, final int i2, @Nullable final String str, @Nullable final Integer num, @Nullable final String str2, @NotNull final String btnText, final float f, final boolean z, float f2, boolean z2, @NotNull final Function1<? super Float, Unit> onClick, @Nullable Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        final boolean z3;
        int i9;
        boolean z4;
        float f3;
        boolean z5;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM10870constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        final float f4;
        Modifier.Companion companion;
        Composer composer3;
        BoxScopeInstance boxScopeInstance;
        Object obj;
        Composer composer4;
        Modifier.Companion companion2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(btnText, "btnText");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(576192650);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= 384;
        } else if ((i3 & 896) == 0) {
            i6 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i3 & 7168) == 0) {
            i6 |= composerStartRestartGroup.changed(num) ? 2048 : 1024;
        }
        if ((i5 & 16) != 0) {
            i6 |= CpioConstants.C_ISBLK;
        } else if ((57344 & i3) == 0) {
            i6 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
        }
        if ((i5 & 32) != 0) {
            i7 = ProfileVerifier.CompilationStatus.f342xf2722a21;
        } else {
            if ((458752 & i3) == 0) {
                i7 = composerStartRestartGroup.changed(btnText) ? 131072 : 65536;
            }
            if ((i5 & 64) != 0) {
                i11 = (i3 & 3670016) == 0 ? composerStartRestartGroup.changed(f) ? 1048576 : 524288 : 1572864;
                if ((i5 & 128) == 0) {
                    i10 = (29360128 & i3) == 0 ? composerStartRestartGroup.changed(z) ? 8388608 : 4194304 : 12582912;
                    i8 = i5 & 256;
                    if (i8 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 234881024) == 0) {
                        i6 |= composerStartRestartGroup.changed(f2) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    if ((i3 & 1879048192) != 0) {
                        if ((i5 & 512) == 0) {
                            z3 = z2;
                            int i12 = composerStartRestartGroup.changed(z3) ? 536870912 : 268435456;
                            i6 |= i12;
                        } else {
                            z3 = z2;
                        }
                        i6 |= i12;
                    } else {
                        z3 = z2;
                    }
                    if ((i5 & 1024) == 0) {
                        i9 = i4 | 6;
                    } else if ((i4 & 14) == 0) {
                        i9 = i4 | (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2);
                    } else {
                        i9 = i4;
                    }
                    if ((i6 & 1533916891) == 306783378 || (i9 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            float f5 = i8 == 0 ? 1.0f : f2;
                            if ((i5 & 512) == 0) {
                                i6 &= -1879048193;
                                z4 = z && f5 == 1.0f;
                            } else {
                                z4 = z2;
                            }
                            f3 = f5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i5 & 512) != 0) {
                                i6 &= -1879048193;
                            }
                            f3 = f2;
                            z4 = z2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(576192650, i6, i9, "com.blackhub.bronline.game.ui.cases.button.OpenButton (OpenButton.kt:46)");
                        }
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(AlphaKt.alpha(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._185wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composerStartRestartGroup, 6)), f3), ColorResources_androidKt.colorResource(i, composerStartRestartGroup, i6 & 14), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6)));
                        composerStartRestartGroup.startReplaceableGroup(608467168);
                        z5 = ((i9 & 14) != 4) | ((i6 & 3670016) != 1048576);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z5 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.button.OpenButtonKt$OpenButton$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    onClick.invoke(Float.valueOf(f));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierM7805clickableXHw0xAI$default = ClickableKt.m7805clickableXHw0xAI$default(modifierM7770backgroundbw27NRU, z4, null, null, (Function0) objRememberedValue, 6, null);
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                        Alignment.Companion companion4 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion4.getTop(), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion5.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7805clickableXHw0xAI$default);
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
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(companion3, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6));
                        Color.Companion companion6 = Color.INSTANCE;
                        BoxKt.Box(BackgroundKt.m7770backgroundbw27NRU(modifierM8177width3ABfNKs, companion6.m11377getWhite0d7_KjU(), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6), 6, null)), composerStartRestartGroup, 0);
                        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                        long jM11377getWhite0d7_KjU = companion6.m11377getWhite0d7_KjU();
                        TextAlign.Companion companion7 = TextAlign.INSTANCE;
                        int i13 = i6;
                        float f6 = f3;
                        TextKt.m10024Text4IGK_g(btnText, SizeKt.wrapContentHeight$default(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth(companion3, f), 0.0f, 1, null), null, false, 3, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._13wsp, jM11377getWhite0d7_KjU, companion7.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composerStartRestartGroup, 12582966, 120), composerStartRestartGroup, (i6 >> 15) & 14, 0, 65532);
                        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        Alignment topEnd = companion4.getTopEnd();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topEnd, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        if (i2 != 1) {
                            composerStartRestartGroup.startReplaceableGroup(-649153166);
                            if (str2 != null) {
                                composer2 = composerStartRestartGroup;
                                TextKt.m10024Text4IGK_g(str2, PaddingKt.m8127paddingqDBjuR0$default(boxScopeInstance2.align(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), companion4.getBottomCenter()), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._11wdp, composerStartRestartGroup, 6), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._11wsp, companion6.m11377getWhite0d7_KjU(), companion7.m13563getStarte0LSkKk(), 0L, 0.0f, null, null, composerStartRestartGroup, 12582966, 120), composer2, (i13 >> 12) & 14, 0, 65532);
                            } else {
                                composer2 = composerStartRestartGroup;
                            }
                            composer2.endReplaceableGroup();
                            Unit unit = Unit.INSTANCE;
                        } else if (i2 == 2) {
                            composerStartRestartGroup.startReplaceableGroup(-649152406);
                            composerStartRestartGroup.startReplaceableGroup(-649152406);
                            if (str2 != null) {
                                composer3 = composerStartRestartGroup;
                                boxScopeInstance = boxScopeInstance2;
                                obj = null;
                                companion = companion3;
                                TextKt.m10024Text4IGK_g(str2, PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composer3, 6), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._8wsp, ColorResources_androidKt.colorResource(R.color.white_40, composerStartRestartGroup, 6), companion7.m13563getStarte0LSkKk(), 0L, 0.0f, TextDecoration.INSTANCE.getLineThrough(), null, composer3, 12779526, 88), composer3, (i13 >> 12) & 14, 0, 65532);
                            } else {
                                companion = companion3;
                                composer3 = composerStartRestartGroup;
                                boxScopeInstance = boxScopeInstance2;
                                obj = null;
                            }
                            composer3.endReplaceableGroup();
                            Composer composer5 = composer3;
                            composer5.startReplaceableGroup(-649151677);
                            if (str != null) {
                                Modifier.Companion companion8 = companion;
                                composer4 = composer5;
                                companion2 = companion8;
                                TextKt.m10024Text4IGK_g(str, PaddingKt.m8127paddingqDBjuR0$default(boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, obj), companion4.getBottomCenter()), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._11wdp, composer5, 6), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._11wsp, companion6.m11377getWhite0d7_KjU(), companion7.m13563getStarte0LSkKk(), 0L, 0.0f, null, null, composer5, 12582966, 120), composer4, (i13 >> 6) & 14, 0, 65532);
                            } else {
                                composer4 = composer5;
                                companion2 = companion;
                            }
                            composer4.endReplaceableGroup();
                            Composer composer6 = composer4;
                            Modifier.Companion companion9 = companion2;
                            Modifier modifierM7770backgroundbw27NRU2 = BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion9, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._13wdp, composer6, 6)), ColorResources_androidKt.colorResource(R.color.yellow, composer6, 6), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer6, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer6, 6), 5, null));
                            Alignment center = companion4.getCenter();
                            composer6.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer6, 6);
                            composer6.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer6.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU2);
                            if (!(composer6.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer6.startReusableNode();
                            if (composer6.getInserting()) {
                                composer6.createNode(constructor3);
                            } else {
                                composer6.useNode();
                            }
                            Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer6);
                            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer6)), composer6, 0);
                            composer6.startReplaceableGroup(2058660585);
                            composer6.startReplaceableGroup(-649150241);
                            if (num != null) {
                                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_value_and_percent, new Object[]{Integer.valueOf(-num.intValue())}, composer6, 70), (Modifier) companion9, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._10wsp, companion6.m11366getBlack0d7_KjU(), companion7.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer6, 12582966, 120), composer6, 48, 0, 65532);
                            }
                            composer6.endReplaceableGroup();
                            composer6.endReplaceableGroup();
                            composer6.endNode();
                            composer6.endReplaceableGroup();
                            composer6.endReplaceableGroup();
                            composer6.endReplaceableGroup();
                            Unit unit2 = Unit.INSTANCE;
                            composer2 = composer6;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-649149626);
                            composerStartRestartGroup.endReplaceableGroup();
                            Unit unit3 = Unit.INSTANCE;
                            composer2 = composerStartRestartGroup;
                        }
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z3 = z4;
                        f4 = f6;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        f4 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.button.OpenButtonKt.OpenButton.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num2) {
                                invoke(composer7, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer7, int i14) {
                                OpenButtonKt.OpenButton(i, i2, str, num, str2, btnText, f, z, f4, z3, onClick, composer7, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                            }
                        });
                        return;
                    }
                    return;
                }
                i6 |= i10;
                i8 = i5 & 256;
                if (i8 == 0) {
                }
                if ((i3 & 1879048192) != 0) {
                }
                if ((i5 & 1024) == 0) {
                }
                if ((i6 & 1533916891) == 306783378) {
                }
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i8 == 0) {
                    }
                    if ((i5 & 512) == 0) {
                    }
                    f3 = f5;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Modifier modifierM7770backgroundbw27NRU3 = BackgroundKt.m7770backgroundbw27NRU(AlphaKt.alpha(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion32, PrimitiveResources_androidKt.dimensionResource(R.dimen._185wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composerStartRestartGroup, 6)), f3), ColorResources_androidKt.colorResource(i, composerStartRestartGroup, i6 & 14), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6)));
                    composerStartRestartGroup.startReplaceableGroup(608467168);
                    z5 = ((i9 & 14) != 4) | ((i6 & 3670016) != 1048576);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z5) {
                        objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.button.OpenButtonKt$OpenButton$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                onClick.invoke(Float.valueOf(f));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierM7805clickableXHw0xAI$default2 = ClickableKt.m7805clickableXHw0xAI$default(modifierM7770backgroundbw27NRU3, z4, null, null, (Function0) objRememberedValue, 6, null);
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
                        Alignment.Companion companion42 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(start2, companion42.getTop(), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion52 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor4 = companion52.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM7805clickableXHw0xAI$default2);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy2, companion52.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap4, companion52.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion52.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl.getInserting()) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            Modifier modifierM8177width3ABfNKs2 = SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(companion32, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6));
                            Color.Companion companion62 = Color.INSTANCE;
                            BoxKt.Box(BackgroundKt.m7770backgroundbw27NRU(modifierM8177width3ABfNKs2, companion62.m11377getWhite0d7_KjU(), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6), 6, null)), composerStartRestartGroup, 0);
                            TypographyStyle typographyStyle2 = TypographyStyle.INSTANCE;
                            long jM11377getWhite0d7_KjU2 = companion62.m11377getWhite0d7_KjU();
                            TextAlign.Companion companion72 = TextAlign.INSTANCE;
                            int i132 = i6;
                            float f62 = f3;
                            TextKt.m10024Text4IGK_g(btnText, SizeKt.wrapContentHeight$default(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth(companion32, f), 0.0f, 1, null), null, false, 3, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle2.m14811montserratBoldCustomSpIzzofJo(R.dimen._13wsp, jM11377getWhite0d7_KjU2, companion72.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composerStartRestartGroup, 12582966, 120), composerStartRestartGroup, (i6 >> 15) & 14, 0, 65532);
                            Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            Alignment topEnd2 = companion42.getTopEnd();
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(topEnd2, false, composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor22 = companion52.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy3, companion52.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion52.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion52.getSetCompositeKeyHash();
                            if (!composerM10870constructorimpl2.getInserting()) {
                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                if (i2 != 1) {
                                }
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z3 = z4;
                                f4 = f62;
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i6 |= i11;
            if ((i5 & 128) == 0) {
            }
            i6 |= i10;
            i8 = i5 & 256;
            if (i8 == 0) {
            }
            if ((i3 & 1879048192) != 0) {
            }
            if ((i5 & 1024) == 0) {
            }
            if ((i6 & 1533916891) == 306783378) {
            }
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i6 |= i7;
        if ((i5 & 64) != 0) {
        }
        i6 |= i11;
        if ((i5 & 128) == 0) {
        }
        i6 |= i10;
        i8 = i5 & 256;
        if (i8 == 0) {
        }
        if ((i3 & 1879048192) != 0) {
        }
        if ((i5 & 1024) == 0) {
        }
        if ((i6 & 1533916891) == 306783378) {
        }
        composerStartRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void OpenButtonPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2021562449);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2021562449, i, -1, "com.blackhub.bronline.game.ui.cases.button.OpenButtonPreview (OpenButton.kt:180)");
            }
            OpenButton(R.color.red, 1, "120 BC", 30, "100 BC", "Открыть х10", 0.5f, true, 0.5f, false, new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.button.OpenButtonKt.OpenButtonPreview.1
                public final void invoke(float f) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                    invoke(f.floatValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 115043766, 6, 512);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.button.OpenButtonKt.OpenButtonPreview.2
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
                    OpenButtonKt.OpenButtonPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
