package com.blackhub.bronline.game.p019ui.widget.dialog;

import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.p019ui.widget.button.ButtonWithLineKt;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.pack200.BcBands;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DialogCustomFlatBlock.kt */
/* loaded from: classes3.dex */
public final class DialogCustomFlatBlockKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014f  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DialogCustomFlatBlock(@Nullable Modifier modifier, @ColorRes int i, @Nullable String str, @Nullable TextStyle textStyle, @Nullable Brush brush, boolean z, @NotNull final String firstButtonText, @NotNull final String secondButtonText, @ColorRes int i2, @ColorRes int i3, @DimenRes int i4, @NotNull final Function0<Unit> onFirstButtonClick, @NotNull final Function0<Unit> onSecondButtonClick, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i5, final int i6, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        String strStringResource;
        TextStyle textStyleM14811montserratBoldCustomSpIzzofJo;
        int i13;
        Brush solidColor;
        Modifier modifier2;
        int i14;
        int i15;
        Brush brush2;
        int i16;
        boolean z2;
        int i17;
        String str2;
        TextStyle textStyle2;
        int i18;
        Composer composer2;
        final Modifier modifier3;
        final String str3;
        final TextStyle textStyle3;
        final Brush brush3;
        final boolean z3;
        final int i19;
        final int i20;
        final int i21;
        final int i22;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i23;
        int i24;
        Intrinsics.checkNotNullParameter(firstButtonText, "firstButtonText");
        Intrinsics.checkNotNullParameter(secondButtonText, "secondButtonText");
        Intrinsics.checkNotNullParameter(onFirstButtonClick, "onFirstButtonClick");
        Intrinsics.checkNotNullParameter(onSecondButtonClick, "onSecondButtonClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-169285896);
        int i25 = i7 & 1;
        if (i25 != 0) {
            i8 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        int i26 = i7 & 2;
        if (i26 != 0) {
            i8 |= 48;
        } else if ((i5 & 112) == 0) {
            i8 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i5 & 896) == 0) {
            i8 |= ((i7 & 4) == 0 && composerStartRestartGroup.changed(str)) ? 256 : 128;
        }
        if ((i5 & 7168) == 0) {
            i8 |= ((i7 & 8) == 0 && composerStartRestartGroup.changed(textStyle)) ? 2048 : 1024;
        }
        if ((i5 & 57344) == 0) {
            i8 |= ((i7 & 16) == 0 && composerStartRestartGroup.changed(brush)) ? 16384 : 8192;
        }
        int i27 = i7 & 32;
        if (i27 != 0) {
            i8 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
        } else if ((i5 & 458752) == 0) {
            i8 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((i7 & 64) == 0) {
            i24 = (i5 & 3670016) == 0 ? composerStartRestartGroup.changed(firstButtonText) ? 1048576 : 524288 : 1572864;
            if ((i7 & 128) != 0) {
                i23 = (29360128 & i5) == 0 ? composerStartRestartGroup.changed(secondButtonText) ? 8388608 : 4194304 : 12582912;
                i9 = i7 & 256;
                if (i9 != 0) {
                    i8 |= 100663296;
                } else if ((i5 & 234881024) == 0) {
                    i8 |= composerStartRestartGroup.changed(i2) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i10 = i7 & 512;
                if (i10 != 0) {
                    i8 |= 805306368;
                } else if ((i5 & 1879048192) == 0) {
                    i8 |= composerStartRestartGroup.changed(i3) ? 536870912 : 268435456;
                }
                i11 = i7 & 1024;
                if (i11 != 0) {
                    i12 = i6 | 6;
                } else if ((i6 & 14) == 0) {
                    i12 = i6 | (composerStartRestartGroup.changed(i4) ? 4 : 2);
                } else {
                    i12 = i6;
                }
                if ((i7 & 2048) != 0) {
                    i12 |= 48;
                } else if ((i6 & 112) == 0) {
                    i12 |= composerStartRestartGroup.changedInstance(onFirstButtonClick) ? 32 : 16;
                }
                int i28 = i12;
                if ((i7 & 4096) != 0) {
                    i28 |= 384;
                } else if ((i6 & 896) == 0) {
                    i28 |= composerStartRestartGroup.changedInstance(onSecondButtonClick) ? 256 : 128;
                }
                if ((i7 & 8192) != 0) {
                    i28 |= 3072;
                } else if ((i6 & 7168) == 0) {
                    i28 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
                }
                if ((1533916891 & i8) != 306783378 || (i28 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i5 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i25 == 0 ? Modifier.INSTANCE : modifier;
                        int i29 = i26 == 0 ? R.color.black_80 : i;
                        if ((i7 & 4) == 0) {
                            strStringResource = StringResources_androidKt.stringResource(R.string.common_confirmation, composerStartRestartGroup, 6);
                            i8 &= -897;
                        } else {
                            strStringResource = str;
                        }
                        if ((i7 & 8) == 0) {
                            textStyleM14811montserratBoldCustomSpIzzofJo = TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._16wsp, 0L, 0, 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 126);
                            i8 &= -7169;
                        } else {
                            textStyleM14811montserratBoldCustomSpIzzofJo = textStyle;
                        }
                        Modifier modifier5 = modifier4;
                        if ((i7 & 16) == 0) {
                            i13 = i29;
                            solidColor = new SolidColor(ColorResources_androidKt.colorResource(R.color.dark_gray_blue, composerStartRestartGroup, 6), null);
                            i8 = (-57345) & i8;
                        } else {
                            i13 = i29;
                            solidColor = brush;
                        }
                        boolean z4 = i27 == 0 ? true : z;
                        int i30 = i9 == 0 ? R.color.red : i2;
                        int i31 = i10 == 0 ? R.color.dark_gray_blue : i3;
                        if (i11 == 0) {
                            modifier2 = modifier5;
                            i15 = i30;
                            brush2 = solidColor;
                            i16 = i31;
                            i14 = R.dimen._12wsp;
                        } else {
                            modifier2 = modifier5;
                            i14 = i4;
                            i15 = i30;
                            brush2 = solidColor;
                            i16 = i31;
                        }
                        z2 = z4;
                        i17 = i8;
                        str2 = strStringResource;
                        textStyle2 = textStyleM14811montserratBoldCustomSpIzzofJo;
                        i18 = i13;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i7 & 4) != 0) {
                            i8 &= -897;
                        }
                        if ((i7 & 8) != 0) {
                            i8 &= -7169;
                        }
                        if ((i7 & 16) != 0) {
                            i8 &= -57345;
                        }
                        modifier2 = modifier;
                        i18 = i;
                        str2 = str;
                        textStyle2 = textStyle;
                        brush2 = brush;
                        z2 = z;
                        i15 = i2;
                        i16 = i3;
                        i14 = i4;
                        i17 = i8;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-169285896, i17, i28, "com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlock (DialogCustomFlatBlock.kt:56)");
                    }
                    final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composerStartRestartGroup, 6);
                    final float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._170wdp, composerStartRestartGroup, 6);
                    final float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composerStartRestartGroup, 6);
                    final float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._100wdp, composerStartRestartGroup, 6);
                    final float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._300wdp, composerStartRestartGroup, 6);
                    final float fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6);
                    long jColorResource = ColorResources_androidKt.colorResource(i18, composerStartRestartGroup, (i17 >> 3) & 14);
                    final Brush brush4 = brush2;
                    final String str4 = str2;
                    final TextStyle textStyle4 = textStyle2;
                    int i32 = i18;
                    final int i33 = i15;
                    final int i34 = i14;
                    final boolean z5 = z2;
                    final int i35 = i16;
                    Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockKt.DialogCustomFlatBlock.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i36) {
                            if ((i36 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1446732524, i36, -1, "com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlock.<anonymous> (DialogCustomFlatBlock.kt:69)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                Alignment center = Alignment.INSTANCE.getCenter();
                                final float f = fDimensionResource3;
                                final float f2 = fDimensionResource6;
                                final float f3 = fDimensionResource4;
                                final float f4 = fDimensionResource5;
                                final Brush brush5 = brush4;
                                final Function2<Composer, Integer, Unit> function22 = content;
                                final String str5 = str4;
                                final TextStyle textStyle5 = textStyle4;
                                final String str6 = firstButtonText;
                                final String str7 = secondButtonText;
                                final float f5 = fDimensionResource;
                                final float f6 = fDimensionResource2;
                                final int i37 = i33;
                                final int i38 = i34;
                                final boolean z6 = z5;
                                final Function0<Unit> function0 = onFirstButtonClick;
                                final int i39 = i35;
                                final Function0<Unit> function02 = onSecondButtonClick;
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer3.startReplaceableGroup(-270267587);
                                composer3.startReplaceableGroup(-3687241);
                                Object objRememberedValue = composer3.rememberedValue();
                                Composer.Companion companion3 = Composer.INSTANCE;
                                if (objRememberedValue == companion3.getEmpty()) {
                                    objRememberedValue = new Measurer();
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceableGroup();
                                final Measurer measurer = (Measurer) objRememberedValue;
                                composer3.startReplaceableGroup(-3687241);
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if (objRememberedValue2 == companion3.getEmpty()) {
                                    objRememberedValue2 = new ConstraintLayoutScope();
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceableGroup();
                                final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                                composer3.startReplaceableGroup(-3687241);
                                Object objRememberedValue3 = composer3.rememberedValue();
                                if (objRememberedValue3 == companion3.getEmpty()) {
                                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                    composer3.updateRememberedValue(objRememberedValue3);
                                }
                                composer3.endReplaceableGroup();
                                Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objRememberedValue3, measurer, composer3, 4544);
                                MeasurePolicy measurePolicyComponent1 = pairRememberConstraintLayoutMeasurePolicy.component1();
                                final Function0<Unit> function0Component2 = pairRememberConstraintLayoutMeasurePolicy.component2();
                                final int i40 = 0;
                                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockKt$DialogCustomFlatBlock$1$invoke$lambda$6$$inlined$ConstraintLayout$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                        ToolingUtilsKt.setDesignInfoProvider(semantics, measurer);
                                    }
                                }, 1, null), ComposableLambdaKt.composableLambda(composer3, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockKt$DialogCustomFlatBlock$1$invoke$lambda$6$$inlined$ConstraintLayout$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i41) {
                                        if (((i41 & 11) ^ 2) != 0 || !composer4.getSkipping()) {
                                            int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                            constraintLayoutScope.reset();
                                            ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                                            ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            composer4.startReplaceableGroup(-1779911694);
                                            boolean zChanged = composer4.changed(f);
                                            Object objRememberedValue4 = composer4.rememberedValue();
                                            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                final float f7 = f;
                                                objRememberedValue4 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockKt$DialogCustomFlatBlock$1$1$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                        invoke2(constrainScope);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), f7, 0.0f, 4, null);
                                                        ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
                                                    }
                                                };
                                                composer4.updateRememberedValue(objRememberedValue4);
                                            }
                                            composer4.endReplaceableGroup();
                                            Modifier modifierM8159heightInVpY3zN4 = SizeKt.m8159heightInVpY3zN4(SizeKt.m8177width3ABfNKs(BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(constraintLayoutScope2.constrainAs(companion4, constrainedLayoutReferenceComponent1, (Function1) objRememberedValue4), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f2)), ColorResources_androidKt.colorResource(R.color.black_80, composer4, 6), null, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._421wdp, composer4, 6)), f3, f4);
                                            composer4.startReplaceableGroup(-483455358);
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            Arrangement.Vertical top = arrangement.getTop();
                                            Alignment.Companion companion5 = Alignment.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion5.getStart(), composer4, 0);
                                            composer4.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8159heightInVpY3zN4);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor2);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer4);
                                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.background$default(companion4, brush5, null, 0.0f, 6, null), 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._38wdp, composer4, 6));
                                            composer4.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion5.getTopStart(), false, composer4, 0);
                                            composer4.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor3);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer4);
                                            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion6.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            String upperCase = str5.toUpperCase(Locale.ROOT);
                                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                            TextKt.m10024Text4IGK_g(upperCase, boxScopeInstance2.align(companion4, companion5.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle5, composer4, 0, 0, 65532);
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            function22.invoke(composer4, 0);
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.startReplaceableGroup(-1779910325);
                                            boolean zChanged2 = composer4.changed(constrainedLayoutReferenceComponent1);
                                            Object objRememberedValue5 = composer4.rememberedValue();
                                            if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue5 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockKt$DialogCustomFlatBlock$1$1$1$3$1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                        invoke2(constrainScope);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent1.getBottom(), 0.0f, 0.0f, 6, null);
                                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent1.getBottom(), 0.0f, 0.0f, 6, null);
                                                    }
                                                };
                                                composer4.updateRememberedValue(objRememberedValue5);
                                            }
                                            composer4.endReplaceableGroup();
                                            Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(constraintLayoutScope2.constrainAs(companion4, constrainedLayoutReferenceComponent2, (Function1) objRememberedValue5), PrimitiveResources_androidKt.dimensionResource(R.dimen._421wdp, composer4, 6));
                                            Arrangement.HorizontalOrVertical spaceAround = arrangement.getSpaceAround();
                                            composer4.startReplaceableGroup(693286680);
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceAround, companion5.getTop(), composer4, 6);
                                            composer4.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8177width3ABfNKs);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor4);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer4);
                                            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                            }
                                            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            Boolean boolValueOf = Boolean.valueOf(str6.length() > 0);
                                            final float f8 = f5;
                                            final float f9 = f6;
                                            final int i42 = i37;
                                            final int i43 = i38;
                                            final String str8 = str6;
                                            final boolean z7 = z6;
                                            final Function0 function03 = function0;
                                            ComposeExtensionKt.IfTrue(boolValueOf, ComposableLambdaKt.composableLambda(composer4, -1589292427, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockKt$DialogCustomFlatBlock$1$1$1$4$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer5, int i44) {
                                                    if ((i44 & 11) != 2 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1589292427, i44, -1, "com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlock.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DialogCustomFlatBlock.kt:121)");
                                                        }
                                                        Modifier modifierM8177width3ABfNKs2 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, f8), f9);
                                                        int i45 = i42;
                                                        int i46 = i43;
                                                        String str9 = str8;
                                                        boolean z8 = z7;
                                                        composer5.startReplaceableGroup(-758754981);
                                                        boolean zChanged3 = composer5.changed(function03);
                                                        final Function0<Unit> function04 = function03;
                                                        Object objRememberedValue6 = composer5.rememberedValue();
                                                        if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue6 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockKt$DialogCustomFlatBlock$1$1$1$4$1$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                                    function04.invoke();
                                                                }
                                                            };
                                                            composer5.updateRememberedValue(objRememberedValue6);
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        ButtonWithLineKt.ButtonWithLine(modifierM8177width3ABfNKs2, i45, 0, i46, str9, z8, 0, 0.0f, (Function0) objRememberedValue6, composer5, 0, BcBands.WIDE);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }), composer4, 48);
                                            Boolean boolValueOf2 = Boolean.valueOf(str7.length() > 0);
                                            final float f10 = f5;
                                            final float f11 = f6;
                                            final int i44 = i39;
                                            final int i45 = i38;
                                            final String str9 = str7;
                                            final Function0 function04 = function02;
                                            ComposeExtensionKt.IfTrue(boolValueOf2, ComposableLambdaKt.composableLambda(composer4, 325944286, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockKt$DialogCustomFlatBlock$1$1$1$4$2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer5, int i46) {
                                                    if ((i46 & 11) != 2 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(325944286, i46, -1, "com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlock.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DialogCustomFlatBlock.kt:135)");
                                                        }
                                                        Modifier modifierM8177width3ABfNKs2 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, f10), f11);
                                                        int i47 = i44;
                                                        int i48 = i45;
                                                        String str10 = str9;
                                                        composer5.startReplaceableGroup(-758754432);
                                                        boolean zChanged3 = composer5.changed(function04);
                                                        final Function0<Unit> function05 = function04;
                                                        Object objRememberedValue6 = composer5.rememberedValue();
                                                        if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue6 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockKt$DialogCustomFlatBlock$1$1$1$4$2$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                                    function05.invoke();
                                                                }
                                                            };
                                                            composer5.updateRememberedValue(objRememberedValue6);
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        ButtonWithLineKt.ButtonWithLine(modifierM8177width3ABfNKs2, i47, 0, i48, str10, false, 0, 0.0f, (Function0) objRememberedValue6, composer5, 0, 228);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }), composer4, 48);
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                                function0Component2.invoke();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), measurePolicyComponent1, composer3, 48, 0);
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    };
                    composer2 = composerStartRestartGroup;
                    FakeDialogKt.m15089FakeDialog3IgeMak(modifier2, jColorResource, ComposableLambdaKt.composableLambda(composer2, 1446732524, true, function2), composer2, (i17 & 14) | 384, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    str3 = str2;
                    textStyle3 = textStyle2;
                    brush3 = brush2;
                    z3 = z2;
                    i19 = i15;
                    i20 = i16;
                    i21 = i14;
                    i22 = i32;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    i22 = i;
                    str3 = str;
                    textStyle3 = textStyle;
                    z3 = z;
                    i19 = i2;
                    i20 = i3;
                    i21 = i4;
                    composer2 = composerStartRestartGroup;
                    brush3 = brush;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockKt.DialogCustomFlatBlock.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i36) {
                            DialogCustomFlatBlockKt.DialogCustomFlatBlock(modifier3, i22, str3, textStyle3, brush3, z3, firstButtonText, secondButtonText, i19, i20, i21, onFirstButtonClick, onSecondButtonClick, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), RecomposeScopeImplKt.updateChangedFlags(i6), i7);
                        }
                    });
                    return;
                }
                return;
            }
            i8 |= i23;
            i9 = i7 & 256;
            if (i9 != 0) {
            }
            i10 = i7 & 512;
            if (i10 != 0) {
            }
            i11 = i7 & 1024;
            if (i11 != 0) {
            }
            if ((i7 & 2048) != 0) {
            }
            int i282 = i12;
            if ((i7 & 4096) != 0) {
            }
            if ((i7 & 8192) != 0) {
            }
            if ((1533916891 & i8) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i5 & 1) != 0) {
                    if (i25 == 0) {
                    }
                    if (i26 == 0) {
                    }
                    if ((i7 & 4) == 0) {
                    }
                    if ((i7 & 8) == 0) {
                    }
                    Modifier modifier52 = modifier4;
                    if ((i7 & 16) == 0) {
                    }
                    if (i27 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    z2 = z4;
                    i17 = i8;
                    str2 = strStringResource;
                    textStyle2 = textStyleM14811montserratBoldCustomSpIzzofJo;
                    i18 = i13;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final float fDimensionResource7 = PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composerStartRestartGroup, 6);
                    final float fDimensionResource22 = PrimitiveResources_androidKt.dimensionResource(R.dimen._170wdp, composerStartRestartGroup, 6);
                    final float fDimensionResource32 = PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composerStartRestartGroup, 6);
                    final float fDimensionResource42 = PrimitiveResources_androidKt.dimensionResource(R.dimen._100wdp, composerStartRestartGroup, 6);
                    final float fDimensionResource52 = PrimitiveResources_androidKt.dimensionResource(R.dimen._300wdp, composerStartRestartGroup, 6);
                    final float fDimensionResource62 = PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6);
                    long jColorResource2 = ColorResources_androidKt.colorResource(i18, composerStartRestartGroup, (i17 >> 3) & 14);
                    final Brush brush42 = brush2;
                    final String str42 = str2;
                    final TextStyle textStyle42 = textStyle2;
                    int i322 = i18;
                    final int i332 = i15;
                    final int i342 = i14;
                    final boolean z52 = z2;
                    final int i352 = i16;
                    Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockKt.DialogCustomFlatBlock.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i36) {
                            if ((i36 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1446732524, i36, -1, "com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlock.<anonymous> (DialogCustomFlatBlock.kt:69)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                Alignment center = Alignment.INSTANCE.getCenter();
                                final float f = fDimensionResource32;
                                final float f2 = fDimensionResource62;
                                final float f3 = fDimensionResource42;
                                final float f4 = fDimensionResource52;
                                final Brush brush5 = brush42;
                                final Function2 function222 = content;
                                final String str5 = str42;
                                final TextStyle textStyle5 = textStyle42;
                                final String str6 = firstButtonText;
                                final String str7 = secondButtonText;
                                final float f5 = fDimensionResource7;
                                final float f6 = fDimensionResource22;
                                final int i37 = i332;
                                final int i38 = i342;
                                final boolean z6 = z52;
                                final Function0 function0 = onFirstButtonClick;
                                final int i39 = i352;
                                final Function0 function02 = onSecondButtonClick;
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer3.startReplaceableGroup(-270267587);
                                composer3.startReplaceableGroup(-3687241);
                                Object objRememberedValue = composer3.rememberedValue();
                                Composer.Companion companion3 = Composer.INSTANCE;
                                if (objRememberedValue == companion3.getEmpty()) {
                                    objRememberedValue = new Measurer();
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceableGroup();
                                final Measurer measurer = (Measurer) objRememberedValue;
                                composer3.startReplaceableGroup(-3687241);
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if (objRememberedValue2 == companion3.getEmpty()) {
                                    objRememberedValue2 = new ConstraintLayoutScope();
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceableGroup();
                                final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                                composer3.startReplaceableGroup(-3687241);
                                Object objRememberedValue3 = composer3.rememberedValue();
                                if (objRememberedValue3 == companion3.getEmpty()) {
                                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                    composer3.updateRememberedValue(objRememberedValue3);
                                }
                                composer3.endReplaceableGroup();
                                Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objRememberedValue3, measurer, composer3, 4544);
                                MeasurePolicy measurePolicyComponent1 = pairRememberConstraintLayoutMeasurePolicy.component1();
                                final Function0 function0Component2 = pairRememberConstraintLayoutMeasurePolicy.component2();
                                final int i40 = 0;
                                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockKt$DialogCustomFlatBlock$1$invoke$lambda$6$$inlined$ConstraintLayout$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                        ToolingUtilsKt.setDesignInfoProvider(semantics, measurer);
                                    }
                                }, 1, null), ComposableLambdaKt.composableLambda(composer3, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockKt$DialogCustomFlatBlock$1$invoke$lambda$6$$inlined$ConstraintLayout$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i41) {
                                        if (((i41 & 11) ^ 2) != 0 || !composer4.getSkipping()) {
                                            int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                            constraintLayoutScope.reset();
                                            ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                                            ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            composer4.startReplaceableGroup(-1779911694);
                                            boolean zChanged = composer4.changed(f);
                                            Object objRememberedValue4 = composer4.rememberedValue();
                                            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                final float f7 = f;
                                                objRememberedValue4 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockKt$DialogCustomFlatBlock$1$1$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                        invoke2(constrainScope);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), f7, 0.0f, 4, null);
                                                        ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
                                                    }
                                                };
                                                composer4.updateRememberedValue(objRememberedValue4);
                                            }
                                            composer4.endReplaceableGroup();
                                            Modifier modifierM8159heightInVpY3zN4 = SizeKt.m8159heightInVpY3zN4(SizeKt.m8177width3ABfNKs(BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(constraintLayoutScope2.constrainAs(companion4, constrainedLayoutReferenceComponent1, (Function1) objRememberedValue4), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f2)), ColorResources_androidKt.colorResource(R.color.black_80, composer4, 6), null, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._421wdp, composer4, 6)), f3, f4);
                                            composer4.startReplaceableGroup(-483455358);
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            Arrangement.Vertical top = arrangement.getTop();
                                            Alignment.Companion companion5 = Alignment.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion5.getStart(), composer4, 0);
                                            composer4.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8159heightInVpY3zN4);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor2);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer4);
                                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.background$default(companion4, brush5, null, 0.0f, 6, null), 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._38wdp, composer4, 6));
                                            composer4.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion5.getTopStart(), false, composer4, 0);
                                            composer4.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor3);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer4);
                                            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion6.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            String upperCase = str5.toUpperCase(Locale.ROOT);
                                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                            TextKt.m10024Text4IGK_g(upperCase, boxScopeInstance2.align(companion4, companion5.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle5, composer4, 0, 0, 65532);
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            function222.invoke(composer4, 0);
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.startReplaceableGroup(-1779910325);
                                            boolean zChanged2 = composer4.changed(constrainedLayoutReferenceComponent1);
                                            Object objRememberedValue5 = composer4.rememberedValue();
                                            if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue5 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockKt$DialogCustomFlatBlock$1$1$1$3$1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                        invoke2(constrainScope);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent1.getBottom(), 0.0f, 0.0f, 6, null);
                                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent1.getBottom(), 0.0f, 0.0f, 6, null);
                                                    }
                                                };
                                                composer4.updateRememberedValue(objRememberedValue5);
                                            }
                                            composer4.endReplaceableGroup();
                                            Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(constraintLayoutScope2.constrainAs(companion4, constrainedLayoutReferenceComponent2, (Function1) objRememberedValue5), PrimitiveResources_androidKt.dimensionResource(R.dimen._421wdp, composer4, 6));
                                            Arrangement.HorizontalOrVertical spaceAround = arrangement.getSpaceAround();
                                            composer4.startReplaceableGroup(693286680);
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceAround, companion5.getTop(), composer4, 6);
                                            composer4.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8177width3ABfNKs);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor4);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer4);
                                            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                            }
                                            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            Boolean boolValueOf = Boolean.valueOf(str6.length() > 0);
                                            final float f8 = f5;
                                            final float f9 = f6;
                                            final int i42 = i37;
                                            final int i43 = i38;
                                            final String str8 = str6;
                                            final boolean z7 = z6;
                                            final Function0<Unit> function03 = function0;
                                            ComposeExtensionKt.IfTrue(boolValueOf, ComposableLambdaKt.composableLambda(composer4, -1589292427, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockKt$DialogCustomFlatBlock$1$1$1$4$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer5, int i44) {
                                                    if ((i44 & 11) != 2 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1589292427, i44, -1, "com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlock.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DialogCustomFlatBlock.kt:121)");
                                                        }
                                                        Modifier modifierM8177width3ABfNKs2 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, f8), f9);
                                                        int i45 = i42;
                                                        int i46 = i43;
                                                        String str9 = str8;
                                                        boolean z8 = z7;
                                                        composer5.startReplaceableGroup(-758754981);
                                                        boolean zChanged3 = composer5.changed(function03);
                                                        final Function0<Unit> function04 = function03;
                                                        Object objRememberedValue6 = composer5.rememberedValue();
                                                        if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue6 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockKt$DialogCustomFlatBlock$1$1$1$4$1$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                                    function04.invoke();
                                                                }
                                                            };
                                                            composer5.updateRememberedValue(objRememberedValue6);
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        ButtonWithLineKt.ButtonWithLine(modifierM8177width3ABfNKs2, i45, 0, i46, str9, z8, 0, 0.0f, (Function0) objRememberedValue6, composer5, 0, BcBands.WIDE);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }), composer4, 48);
                                            Boolean boolValueOf2 = Boolean.valueOf(str7.length() > 0);
                                            final float f10 = f5;
                                            final float f11 = f6;
                                            final int i44 = i39;
                                            final int i45 = i38;
                                            final String str9 = str7;
                                            final Function0<Unit> function04 = function02;
                                            ComposeExtensionKt.IfTrue(boolValueOf2, ComposableLambdaKt.composableLambda(composer4, 325944286, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockKt$DialogCustomFlatBlock$1$1$1$4$2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer5, int i46) {
                                                    if ((i46 & 11) != 2 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(325944286, i46, -1, "com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlock.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DialogCustomFlatBlock.kt:135)");
                                                        }
                                                        Modifier modifierM8177width3ABfNKs2 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, f10), f11);
                                                        int i47 = i44;
                                                        int i48 = i45;
                                                        String str10 = str9;
                                                        composer5.startReplaceableGroup(-758754432);
                                                        boolean zChanged3 = composer5.changed(function04);
                                                        final Function0<Unit> function05 = function04;
                                                        Object objRememberedValue6 = composer5.rememberedValue();
                                                        if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue6 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockKt$DialogCustomFlatBlock$1$1$1$4$2$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                                    function05.invoke();
                                                                }
                                                            };
                                                            composer5.updateRememberedValue(objRememberedValue6);
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        ButtonWithLineKt.ButtonWithLine(modifierM8177width3ABfNKs2, i47, 0, i48, str10, false, 0, 0.0f, (Function0) objRememberedValue6, composer5, 0, 228);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }), composer4, 48);
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                                function0Component2.invoke();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), measurePolicyComponent1, composer3, 48, 0);
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    };
                    composer2 = composerStartRestartGroup;
                    FakeDialogKt.m15089FakeDialog3IgeMak(modifier2, jColorResource2, ComposableLambdaKt.composableLambda(composer2, 1446732524, true, function22), composer2, (i17 & 14) | 384, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    str3 = str2;
                    textStyle3 = textStyle2;
                    brush3 = brush2;
                    z3 = z2;
                    i19 = i15;
                    i20 = i16;
                    i21 = i14;
                    i22 = i322;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i8 |= i24;
        if ((i7 & 128) != 0) {
        }
        i8 |= i23;
        i9 = i7 & 256;
        if (i9 != 0) {
        }
        i10 = i7 & 512;
        if (i10 != 0) {
        }
        i11 = i7 & 1024;
        if (i11 != 0) {
        }
        if ((i7 & 2048) != 0) {
        }
        int i2822 = i12;
        if ((i7 & 4096) != 0) {
        }
        if ((i7 & 8192) != 0) {
        }
        if ((1533916891 & i8) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void DialogCustomFlatBlockPreview(@Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2137433022);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2137433022, i, -1, "com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockPreview (DialogCustomFlatBlock.kt:154)");
            }
            String strStringResource = StringResources_androidKt.stringResource(R.string.common_confirmation, composerStartRestartGroup, 6);
            String upperCase = StringResources_androidKt.stringResource(R.string.common_no, composerStartRestartGroup, 6).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            composer2 = composerStartRestartGroup;
            DialogCustomFlatBlock(null, 0, strStringResource, null, null, false, "qwe", upperCase, 0, 0, 0, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockKt.DialogCustomFlatBlockPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockKt.DialogCustomFlatBlockPreview.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, ComposableSingletons$DialogCustomFlatBlockKt.INSTANCE.m15081getLambda1$app_siteRelease(), composer2, 1572864, 3504, 1851);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomFlatBlockKt.DialogCustomFlatBlockPreview.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i2) {
                    DialogCustomFlatBlockKt.DialogCustomFlatBlockPreview(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

