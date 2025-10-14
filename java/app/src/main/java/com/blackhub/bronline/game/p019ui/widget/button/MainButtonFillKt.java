package com.blackhub.bronline.game.p019ui.widget.button;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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

/* compiled from: MainButtonFill.kt */
/* loaded from: classes3.dex */
public final class MainButtonFillKt {
    /* JADX WARN: Removed duplicated region for block: B:114:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: MainButtonFill-jAZ_Pg4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15075MainButtonFilljAZ_Pg4(@Nullable Modifier modifier, @NotNull final String text, @Nullable TextStyle textStyle, final long j, float f, float f2, boolean z, boolean z2, boolean z3, @Nullable Function0<Unit> function0, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        float fDimensionResource;
        float fDimensionResource2;
        boolean z4;
        int i4;
        Function0<Unit> function02;
        int i5;
        int i6;
        TextStyle textStyleM14788montserratBold11sp67j0QOw;
        int i7;
        boolean z5;
        Function0<Unit> function03;
        boolean z6;
        Modifier modifier2;
        boolean z7;
        float f3;
        float f4;
        boolean z8;
        TextStyle textStyle2;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final float f5;
        final float f6;
        final boolean z9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1302092971);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(textStyle)) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            if ((i2 & 16) == 0) {
                fDimensionResource = f;
                int i9 = composerStartRestartGroup.changed(fDimensionResource) ? 16384 : 8192;
                i3 |= i9;
            } else {
                fDimensionResource = f;
            }
            i3 |= i9;
        } else {
            fDimensionResource = f;
        }
        if ((458752 & i) == 0) {
            if ((i2 & 32) == 0) {
                fDimensionResource2 = f2;
                int i10 = composerStartRestartGroup.changed(fDimensionResource2) ? 131072 : 65536;
                i3 |= i10;
            } else {
                fDimensionResource2 = f2;
            }
            i3 |= i10;
        } else {
            fDimensionResource2 = f2;
        }
        int i11 = i2 & 64;
        if (i11 != 0) {
            i3 |= 1572864;
        } else if ((3670016 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((i & 29360128) == 0) {
            if ((i2 & 128) == 0) {
                z4 = z2;
                int i12 = composerStartRestartGroup.changed(z4) ? 8388608 : 4194304;
                i3 |= i12;
            } else {
                z4 = z2;
            }
            i3 |= i12;
        } else {
            z4 = z2;
        }
        int i13 = i2 & 256;
        if (i13 != 0) {
            i3 |= 100663296;
        } else if ((i & 234881024) == 0) {
            i3 |= composerStartRestartGroup.changed(z3) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
        }
        int i14 = i2 & 512;
        if (i14 == 0) {
            if ((i & 1879048192) == 0) {
                i4 = i14;
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 536870912 : 268435456;
            }
            if ((i3 & 1533916891) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier;
                    if ((i2 & 4) == 0) {
                        i5 = i4;
                        i6 = 6;
                        textStyleM14788montserratBold11sp67j0QOw = TypographyStyle.INSTANCE.m14788montserratBold11sp67j0QOw(0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13);
                        i3 &= -897;
                    } else {
                        i5 = i4;
                        i6 = 6;
                        textStyleM14788montserratBold11sp67j0QOw = textStyle;
                    }
                    if ((i2 & 16) != 0) {
                        fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, i6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, i6);
                        i3 &= -458753;
                    }
                    boolean z10 = i11 == 0 ? true : z;
                    if ((i2 & 128) == 0) {
                        i7 = i3 & (-29360129);
                        z5 = z10;
                    } else {
                        i7 = i3;
                        z5 = z2;
                    }
                    boolean z11 = i13 == 0 ? false : z3;
                    if (i5 == 0) {
                        z6 = z11;
                        modifier2 = modifier4;
                        function03 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.MainButtonFillKt$MainButtonFill$1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function03 = function0;
                        z6 = z11;
                        modifier2 = modifier4;
                    }
                    z7 = z5;
                    f3 = fDimensionResource;
                    f4 = fDimensionResource2;
                    z8 = z10;
                    textStyle2 = textStyleM14788montserratBold11sp67j0QOw;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                    }
                    modifier2 = modifier;
                    textStyle2 = textStyle;
                    z8 = z;
                    z6 = z3;
                    function03 = function0;
                    i7 = i3;
                    f3 = fDimensionResource;
                    f4 = fDimensionResource2;
                    z7 = z4;
                    i6 = 6;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1302092971, i7, -1, "com.blackhub.bronline.game.ui.widget.button.MainButtonFill (MainButtonFill.kt:33)");
                }
                final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f3);
                final Modifier modifier5 = modifier2;
                final float f7 = f4;
                final TextStyle textStyle4 = textStyle2;
                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(Modifier.INSTANCE, null, z8, null, z7, false, false, z6, roundedCornerShapeM8392RoundedCornerShape0680j_4, 0, 0L, null, function03, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2144293478, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.MainButtonFillKt$MainButtonFill$2
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
                    public final void invoke(@Nullable Composer composer2, int i15) {
                        if ((i15 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2144293478, i15, -1, "com.blackhub.bronline.game.ui.widget.button.MainButtonFill.<anonymous> (MainButtonFill.kt:45)");
                            }
                            Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(ClipKt.clip(modifier5, roundedCornerShapeM8392RoundedCornerShape0680j_4), j, roundedCornerShapeM8392RoundedCornerShape0680j_4);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            String str = text;
                            float f8 = f7;
                            TextStyle textStyle5 = textStyle4;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            String upperCase = str.toUpperCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                            TextKt.m10024Text4IGK_g(upperCase, PaddingKt.m8123padding3ABfNKs(Modifier.INSTANCE, f8), Color.INSTANCE.m11377getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle5, composer2, 384, 0, 65528);
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
                }), composerStartRestartGroup, ((i7 >> 12) & 896) | 6 | ((i7 >> 9) & 57344) | ((i7 >> 3) & 29360128), ((i7 >> 21) & 896) | 3072, 3690);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                textStyle3 = textStyle2;
                f5 = f3;
                f6 = f4;
                z9 = z8;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier;
                textStyle3 = textStyle;
                z9 = z;
                z6 = z3;
                f6 = fDimensionResource2;
                z7 = z4;
                function03 = function02;
                f5 = fDimensionResource;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final boolean z12 = z7;
                final boolean z13 = z6;
                final Function0<Unit> function04 = function03;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.MainButtonFillKt$MainButtonFill$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        MainButtonFillKt.m15075MainButtonFilljAZ_Pg4(modifier3, text, textStyle3, j, f5, f6, z9, z12, z13, function04, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 805306368;
        i4 = i14;
        function02 = function0;
        if ((i3 & 1533916891) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i11 == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if (i13 == 0) {
                }
                if (i5 == 0) {
                }
                z7 = z5;
                f3 = fDimensionResource;
                f4 = fDimensionResource2;
                z8 = z10;
                textStyle2 = textStyleM14788montserratBold11sp67j0QOw;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f3);
                final Modifier modifier52 = modifier2;
                final float f72 = f4;
                final TextStyle textStyle42 = textStyle2;
                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(Modifier.INSTANCE, null, z8, null, z7, false, false, z6, roundedCornerShapeM8392RoundedCornerShape0680j_42, 0, 0L, null, function03, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2144293478, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.MainButtonFillKt$MainButtonFill$2
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
                    public final void invoke(@Nullable Composer composer2, int i15) {
                        if ((i15 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2144293478, i15, -1, "com.blackhub.bronline.game.ui.widget.button.MainButtonFill.<anonymous> (MainButtonFill.kt:45)");
                            }
                            Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(ClipKt.clip(modifier52, roundedCornerShapeM8392RoundedCornerShape0680j_42), j, roundedCornerShapeM8392RoundedCornerShape0680j_42);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            String str = text;
                            float f8 = f72;
                            TextStyle textStyle5 = textStyle42;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            String upperCase = str.toUpperCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                            TextKt.m10024Text4IGK_g(upperCase, PaddingKt.m8123padding3ABfNKs(Modifier.INSTANCE, f8), Color.INSTANCE.m11377getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle5, composer2, 384, 0, 65528);
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
                }), composerStartRestartGroup, ((i7 >> 12) & 896) | 6 | ((i7 >> 9) & 57344) | ((i7 >> 3) & 29360128), ((i7 >> 21) & 896) | 3072, 3690);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                textStyle3 = textStyle2;
                f5 = f3;
                f6 = f4;
                z9 = z8;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "MainButton")
    public static final void PreviewMainButton(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1512085743);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1512085743, i, -1, "com.blackhub.bronline.game.ui.widget.button.PreviewMainButton (MainButtonFill.kt:64)");
            }
            m15075MainButtonFilljAZ_Pg4(null, "Играть", null, ColorKt.Color(4293013772L), 0.0f, 0.0f, false, false, false, null, composerStartRestartGroup, 3120, 1013);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.MainButtonFillKt.PreviewMainButton.1
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
                    MainButtonFillKt.PreviewMainButton(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

