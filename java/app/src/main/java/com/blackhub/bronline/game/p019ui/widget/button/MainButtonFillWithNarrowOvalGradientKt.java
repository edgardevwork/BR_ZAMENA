package com.blackhub.bronline.game.p019ui.widget.button;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.tooling.preview.Preview;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.other.NarrowOvalWithGradientCustomKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import com.google.firebase.perf.util.Constants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MainButtonFillWithNarrowOvalGradient.kt */
/* loaded from: classes3.dex */
public final class MainButtonFillWithNarrowOvalGradientKt {
    /* JADX WARN: Removed duplicated region for block: B:125:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: MainButtonFillWithNarrowOvalGradient-OKqFZno, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15076MainButtonFillWithNarrowOvalGradientOKqFZno(@Nullable Modifier modifier, @NotNull final String text, @Nullable TextStyle textStyle, long j, final long j2, float f, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Function0<Unit> function0, @Nullable Composer composer, final int i, final int i2, final int i3) {
        int i4;
        TextStyle textStyleM14788montserratBold11sp67j0QOw;
        long jM11377getWhite0d7_KjU;
        int i5;
        boolean z5;
        boolean z6;
        int i6;
        int i7;
        float fDimensionResource;
        Function0<Unit> function02;
        boolean z7;
        boolean z8;
        boolean z9;
        long j3;
        boolean z10;
        Modifier modifier2;
        int i8;
        TextStyle textStyle2;
        float f2;
        final float f3;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final long j4;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-236375910);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            if ((i3 & 4) == 0) {
                textStyleM14788montserratBold11sp67j0QOw = textStyle;
                int i10 = composerStartRestartGroup.changed(textStyleM14788montserratBold11sp67j0QOw) ? 256 : 128;
                i4 |= i10;
            } else {
                textStyleM14788montserratBold11sp67j0QOw = textStyle;
            }
            i4 |= i10;
        } else {
            textStyleM14788montserratBold11sp67j0QOw = textStyle;
        }
        int i11 = i3 & 8;
        if (i11 != 0) {
            i4 |= 3072;
            jM11377getWhite0d7_KjU = j;
        } else {
            jM11377getWhite0d7_KjU = j;
            if ((i & 7168) == 0) {
                i4 |= composerStartRestartGroup.changed(jM11377getWhite0d7_KjU) ? 2048 : 1024;
            }
        }
        if ((i3 & 16) != 0) {
            i4 |= CpioConstants.C_ISBLK;
            i5 = i9;
        } else {
            i5 = i9;
            if ((i & 57344) == 0) {
                i4 |= composerStartRestartGroup.changed(j2) ? 16384 : 8192;
            }
        }
        if ((i & 458752) == 0) {
            i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(f)) ? 131072 : 65536;
        }
        int i12 = i3 & 64;
        if (i12 != 0) {
            i4 |= 1572864;
            z5 = z;
        } else {
            z5 = z;
            if ((i & 3670016) == 0) {
                i4 |= composerStartRestartGroup.changed(z5) ? 1048576 : 524288;
            }
        }
        if ((i & 29360128) == 0) {
            if ((i3 & 128) == 0) {
                z6 = z2;
                int i13 = composerStartRestartGroup.changed(z6) ? 8388608 : 4194304;
                i4 |= i13;
            } else {
                z6 = z2;
            }
            i4 |= i13;
        } else {
            z6 = z2;
        }
        int i14 = i3 & 256;
        if (i14 != 0) {
            i4 |= 100663296;
        } else if ((i & 234881024) == 0) {
            i4 |= composerStartRestartGroup.changed(z3) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
        }
        int i15 = i3 & 512;
        if (i15 != 0) {
            i4 |= 805306368;
        } else if ((i & 1879048192) == 0) {
            i4 |= composerStartRestartGroup.changed(z4) ? 536870912 : 268435456;
        }
        int i16 = i3 & 1024;
        if (i16 != 0) {
            i7 = i2 | 6;
        } else {
            if ((i2 & 14) != 0) {
                i6 = i2;
                if ((i4 & 1533916891) == 306783378 || (i6 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier;
                        if ((i3 & 4) != 0) {
                            textStyleM14788montserratBold11sp67j0QOw = TypographyStyle.INSTANCE.m14788montserratBold11sp67j0QOw(0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13);
                            i4 &= -897;
                        }
                        if (i11 != 0) {
                            jM11377getWhite0d7_KjU = Color.INSTANCE.m11377getWhite0d7_KjU();
                        }
                        if ((i3 & 32) == 0) {
                            fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._5sdp, composerStartRestartGroup, 6);
                            i4 &= -458753;
                        } else {
                            fDimensionResource = f;
                        }
                        if (i12 != 0) {
                            z5 = true;
                        }
                        if ((i3 & 128) != 0) {
                            i4 = (-29360129) & i4;
                            z6 = z5;
                        }
                        boolean z14 = i14 == 0 ? false : z3;
                        boolean z15 = i15 == 0 ? true : z4;
                        function02 = i16 == 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.MainButtonFillWithNarrowOvalGradientKt$MainButtonFillWithNarrowOvalGradient$1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        } : function0;
                        z7 = z15;
                        z8 = z14;
                        z9 = z5;
                        j3 = jM11377getWhite0d7_KjU;
                        z10 = z6;
                        modifier2 = modifier4;
                        i8 = i4;
                        textStyle2 = textStyleM14788montserratBold11sp67j0QOw;
                        f2 = fDimensionResource;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        z8 = z3;
                        z7 = z4;
                        function02 = function0;
                        z9 = z5;
                        j3 = jM11377getWhite0d7_KjU;
                        z10 = z6;
                        modifier2 = modifier;
                        f2 = f;
                        i8 = i4;
                        textStyle2 = textStyleM14788montserratBold11sp67j0QOw;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-236375910, i8, i6, "com.blackhub.bronline.game.ui.widget.button.MainButtonFillWithNarrowOvalGradient (MainButtonFillWithNarrowOvalGradient.kt:38)");
                    }
                    final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f2);
                    final boolean z16 = z7;
                    float f4 = f2;
                    final long j5 = j3;
                    int i17 = i8;
                    final TextStyle textStyle4 = textStyle2;
                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifier2, null, z9, null, z10, false, false, z8, roundedCornerShapeM8392RoundedCornerShape0680j_4, 0, 0L, null, function02, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1600135785, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.MainButtonFillWithNarrowOvalGradientKt$MainButtonFillWithNarrowOvalGradient$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i18) {
                            if ((i18 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1600135785, i18, -1, "com.blackhub.bronline.game.ui.widget.button.MainButtonFillWithNarrowOvalGradient.<anonymous> (MainButtonFillWithNarrowOvalGradient.kt:50)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(ClipKt.clip(companion, roundedCornerShapeM8392RoundedCornerShape0680j_4), j2, roundedCornerShapeM8392RoundedCornerShape0680j_4);
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                Alignment topCenter = companion2.getTopCenter();
                                boolean z17 = z16;
                                String str = text;
                                long j6 = j5;
                                TextStyle textStyle5 = textStyle4;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topCenter, false, composer2, 6);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                Alignment center = companion2.getCenter();
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                String upperCase = str.toUpperCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                TextKt.m10024Text4IGK_g(upperCase, PaddingKt.m8123padding3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer2, 6)), j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(TextAlign.INSTANCE.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle5, composer2, 0, 0, 65016);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(-1229820056);
                                if (z17) {
                                    NarrowOvalWithGradientCustomKt.m15096NarrowOvalWithGradientCustomiJQMabo(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._2sdp, composer2, 6)), 0L, composer2, 0, 2);
                                }
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, (i17 & 14) | ((i17 >> 12) & 896) | ((i17 >> 9) & 57344) | ((i17 >> 3) & 29360128), ((i6 << 6) & 896) | 3072, 3690);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = f4;
                    modifier3 = modifier2;
                    textStyle3 = textStyle2;
                    j4 = j3;
                    z11 = z9;
                    z12 = z8;
                    z13 = z7;
                    function03 = function02;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    textStyle3 = textStyleM14788montserratBold11sp67j0QOw;
                    z11 = z5;
                    j4 = jM11377getWhite0d7_KjU;
                    z10 = z6;
                    f3 = f;
                    z12 = z3;
                    z13 = z4;
                    function03 = function0;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    final boolean z17 = z10;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.MainButtonFillWithNarrowOvalGradientKt$MainButtonFillWithNarrowOvalGradient$3
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
                            MainButtonFillWithNarrowOvalGradientKt.m15076MainButtonFillWithNarrowOvalGradientOKqFZno(modifier3, text, textStyle3, j4, j2, f3, z11, z17, z12, z13, function03, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i7 = i2 | (composerStartRestartGroup.changedInstance(function0) ? 4 : 2);
        }
        i6 = i7;
        if ((i4 & 1533916891) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if (i11 != 0) {
                }
                if ((i3 & 32) == 0) {
                }
                if (i12 != 0) {
                }
                if ((i3 & 128) != 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                z7 = z15;
                z8 = z14;
                z9 = z5;
                j3 = jM11377getWhite0d7_KjU;
                z10 = z6;
                modifier2 = modifier4;
                i8 = i4;
                textStyle2 = textStyleM14788montserratBold11sp67j0QOw;
                f2 = fDimensionResource;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f2);
                final boolean z162 = z7;
                float f42 = f2;
                final long j52 = j3;
                int i172 = i8;
                final TextStyle textStyle42 = textStyle2;
                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifier2, null, z9, null, z10, false, false, z8, roundedCornerShapeM8392RoundedCornerShape0680j_42, 0, 0L, null, function02, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1600135785, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.MainButtonFillWithNarrowOvalGradientKt$MainButtonFillWithNarrowOvalGradient$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i18) {
                        if ((i18 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1600135785, i18, -1, "com.blackhub.bronline.game.ui.widget.button.MainButtonFillWithNarrowOvalGradient.<anonymous> (MainButtonFillWithNarrowOvalGradient.kt:50)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(ClipKt.clip(companion, roundedCornerShapeM8392RoundedCornerShape0680j_42), j2, roundedCornerShapeM8392RoundedCornerShape0680j_42);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment topCenter = companion2.getTopCenter();
                            boolean z172 = z162;
                            String str = text;
                            long j6 = j52;
                            TextStyle textStyle5 = textStyle42;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topCenter, false, composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                            Alignment center = companion2.getCenter();
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            String upperCase = str.toUpperCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                            TextKt.m10024Text4IGK_g(upperCase, PaddingKt.m8123padding3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer2, 6)), j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(TextAlign.INSTANCE.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle5, composer2, 0, 0, 65016);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(-1229820056);
                            if (z172) {
                                NarrowOvalWithGradientCustomKt.m15096NarrowOvalWithGradientCustomiJQMabo(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._2sdp, composer2, 6)), 0L, composer2, 0, 2);
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, (i172 & 14) | ((i172 >> 12) & 896) | ((i172 >> 9) & 57344) | ((i172 >> 3) & 29360128), ((i6 << 6) & 896) | 3072, 3690);
                if (ComposerKt.isTraceInProgress()) {
                }
                f3 = f42;
                modifier3 = modifier2;
                textStyle3 = textStyle2;
                j4 = j3;
                z11 = z9;
                z12 = z8;
                z13 = z7;
                function03 = function02;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "MainButton")
    public static final void PreviewMainButtonFillWithNarrowOvalGradient(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(28376806);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(28376806, i, -1, "com.blackhub.bronline.game.ui.widget.button.PreviewMainButtonFillWithNarrowOvalGradient (MainButtonFillWithNarrowOvalGradient.kt:82)");
            }
            m15076MainButtonFillWithNarrowOvalGradientOKqFZno(null, "Играть", null, 0L, ColorKt.Color(4293013772L), 0.0f, false, false, false, false, null, composerStartRestartGroup, 24624, 0, 2029);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.MainButtonFillWithNarrowOvalGradientKt.PreviewMainButtonFillWithNarrowOvalGradient.1
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
                    MainButtonFillWithNarrowOvalGradientKt.PreviewMainButtonFillWithNarrowOvalGradient(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

