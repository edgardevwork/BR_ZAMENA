package com.blackhub.bronline.game.p019ui.admintools.reports;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.KeyboardType;
import androidx.compose.p003ui.text.input.VisualTransformation;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.tooling.preview.Preview;
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
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt___StringsKt;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnswerWithTextFieldAndTwoButtonsBlock.kt */
/* loaded from: classes.dex */
public final class AnswerWithTextFieldAndTwoButtonsBlockKt {
    public static final float BLOCK_WIDTH_PERCENT = 0.6f;
    public static final int MIN_LENGTH_FOR_ANSWER = 5;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void AnswerWithTextFieldAndTwoButtonsBlock(@Nullable Modifier modifier, @NotNull final String titleText, @NotNull final String hintText, @Nullable final String str, @NotNull final String buttonLeftText, @NotNull final String buttonRightText, @NotNull final char[] validationChars, boolean z, @NotNull final Function1<? super String, Unit> onLeftClick, @NotNull final Function0<Unit> onRightClick, @Nullable Function0<Unit> function0, @Nullable Composer composer, final int i, final int i2, final int i3) {
        float fDimensionResource;
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(hintText, "hintText");
        Intrinsics.checkNotNullParameter(buttonLeftText, "buttonLeftText");
        Intrinsics.checkNotNullParameter(buttonRightText, "buttonRightText");
        Intrinsics.checkNotNullParameter(validationChars, "validationChars");
        Intrinsics.checkNotNullParameter(onLeftClick, "onLeftClick");
        Intrinsics.checkNotNullParameter(onRightClick, "onRightClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1372463615);
        Modifier modifier2 = (i3 & 1) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z2 = (i3 & 128) != 0 ? false : z;
        Function0<Unit> function02 = (i3 & 1024) != 0 ? null : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1372463615, i, i2, "com.blackhub.bronline.game.ui.admintools.reports.AnswerWithTextFieldAndTwoButtonsBlock (AnswerWithTextFieldAndTwoButtonsBlock.kt:62)");
        }
        final MutableState mutableState = (MutableState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableState<String>>() { // from class: com.blackhub.bronline.game.ui.admintools.reports.AnswerWithTextFieldAndTwoButtonsBlockKt$AnswerWithTextFieldAndTwoButtonsBlock$textField$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MutableState<String> invoke() {
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, 2, null);
            }
        }, composerStartRestartGroup, 3080, 6);
        final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._9sdp, composerStartRestartGroup, 6));
        final boolean z3 = z2 || ((String) mutableState.getValue()).length() > 5;
        if (function02 == null) {
            composerStartRestartGroup.startReplaceableGroup(-1289857316);
            fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-1289857257);
            fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen.zero_dp, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
        }
        final float f = fDimensionResource;
        final Modifier modifier3 = modifier2;
        final Function0<Unit> function03 = function02;
        final boolean z4 = z2;
        FakeDialogKt.m15089FakeDialog3IgeMak(null, Color.INSTANCE.m11375getTransparent0d7_KjU(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2050680181, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.reports.AnswerWithTextFieldAndTwoButtonsBlockKt.AnswerWithTextFieldAndTwoButtonsBlock.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
            public final void invoke(@Nullable Composer composer2, int i4) {
                boolean z5;
                MutableState<String> mutableState2;
                char[] cArr;
                String str2;
                String str3;
                String str4;
                boolean z6;
                Function1<String, Unit> function1;
                String str5;
                Function0<Unit> function04;
                ColumnScopeInstance columnScopeInstance;
                Modifier.Companion companion;
                if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2050680181, i4, -1, "com.blackhub.bronline.game.ui.admintools.reports.AnswerWithTextFieldAndTwoButtonsBlock.<anonymous> (AnswerWithTextFieldAndTwoButtonsBlock.kt:82)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    Alignment center = companion3.getCenter();
                    Modifier modifier4 = modifier3;
                    RoundedCornerShape roundedCornerShape = roundedCornerShapeM8392RoundedCornerShape0680j_4;
                    Function0<Unit> function05 = function03;
                    String str6 = titleText;
                    float f2 = f;
                    MutableState<String> mutableState3 = mutableState;
                    boolean z7 = z4;
                    char[] cArr2 = validationChars;
                    String str7 = hintText;
                    String str8 = buttonLeftText;
                    boolean z8 = z3;
                    Function1<String, Unit> function12 = onLeftClick;
                    String str9 = buttonRightText;
                    Function0<Unit> function06 = onRightClick;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(modifier4, 0.6f);
                    Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                    composer2.startReplaceableGroup(-483455358);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth);
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
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierBorder = BorderKt.border(BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), roundedCornerShape), ColorResources_androidKt.colorResource(R.color.total_black_70, composer2, 6), null, 2, null), BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._05sdp, composer2, 6), ColorResources_androidKt.colorResource(R.color.gray, composer2, 6)), roundedCornerShape);
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierBorder);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally2 = companion3.getCenterHorizontally();
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-100910134);
                    if (function05 == null) {
                        z5 = z7;
                        columnScopeInstance = columnScopeInstance2;
                        companion = companion2;
                        cArr = cArr2;
                        str2 = str6;
                        str3 = str7;
                        str4 = str8;
                        z6 = z8;
                        function1 = function12;
                        str5 = str9;
                        function04 = function06;
                        mutableState2 = mutableState3;
                    } else {
                        z5 = z7;
                        mutableState2 = mutableState3;
                        cArr = cArr2;
                        str2 = str6;
                        str3 = str7;
                        str4 = str8;
                        z6 = z8;
                        function1 = function12;
                        str5 = str9;
                        function04 = function06;
                        columnScopeInstance = columnScopeInstance2;
                        companion = companion2;
                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(columnScopeInstance2.align(companion2, companion3.getEnd()), null, false, null, false, false, false, false, null, 0, 0L, null, function05, ComposableSingletons$AnswerWithTextFieldAndTwoButtonsBlockKt.INSTANCE.m14886getLambda1$app_siteRelease(), composer2, 0, 3072, 4094);
                        Unit unit = Unit.INSTANCE;
                    }
                    composer2.endReplaceableGroup();
                    Modifier.Companion companion5 = companion;
                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(columnScopeInstance.align(companion5, companion3.getCenterHorizontally()), 0.0f, f2, 0.0f, 0.0f, 13, null);
                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                    TextKt.m10024Text4IGK_g(str2, modifierM8127paddingqDBjuR0$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14834montserratMedium12spOr9ssp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15), composer2, 0, 0, 65532);
                    final MutableState<String> mutableState4 = mutableState2;
                    final char[] cArr3 = cArr;
                    final String str10 = str3;
                    BasicTextFieldKt.BasicTextField(mutableState2.getValue(), (Function1<? super String, Unit>) new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.reports.AnswerWithTextFieldAndTwoButtonsBlockKt$AnswerWithTextFieldAndTwoButtonsBlock$1$1$1$1$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str11) {
                            invoke2(str11);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull String enteredText) {
                            Intrinsics.checkNotNullParameter(enteredText, "enteredText");
                            MutableState<String> mutableState5 = mutableState4;
                            char[] cArr4 = cArr3;
                            int length = enteredText.length();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= length) {
                                    break;
                                }
                                if (!UsefulKt.isValidCharField(enteredText.charAt(i5), cArr4)) {
                                    enteredText = enteredText.substring(0, i5);
                                    Intrinsics.checkNotNullExpressionValue(enteredText, "substring(...)");
                                    break;
                                }
                                i5++;
                            }
                            mutableState5.setValue(StringsKt___StringsKt.take(enteredText, 100));
                        }
                    }, SizeKt.m8156defaultMinSizeVpY3zN4(PaddingKt.m8126paddingqDBjuR0(companion5, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._9sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._32sdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._223sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._19sdp, composer2, 6)), false, z5, typographyStyle.m14834montserratMedium12spOr9ssp67j0QOw(0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 13), new KeyboardOptions(0, false, KeyboardType.INSTANCE.m13391getEmailPjHm6EE(), ImeAction.INSTANCE.m13342getDoneeUduSuo(), null, 19, null), (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(Color.INSTANCE.m11377getWhite0d7_KjU(), null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composer2, -1888527731, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.reports.AnswerWithTextFieldAndTwoButtonsBlockKt$AnswerWithTextFieldAndTwoButtonsBlock$1$1$1$1$1$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer3, Integer num) {
                            invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> innerTextField, @Nullable Composer composer3, int i5) {
                            int i6;
                            Composer composer4;
                            int i7;
                            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                            if ((i5 & 14) == 0) {
                                i6 = i5 | (composer3.changedInstance(innerTextField) ? 4 : 2);
                            } else {
                                i6 = i5;
                            }
                            if ((i6 & 91) != 18 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1888527731, i6, -1, "com.blackhub.bronline.game.ui.admintools.reports.AnswerWithTextFieldAndTwoButtonsBlock.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnswerWithTextFieldAndTwoButtonsBlock.kt:161)");
                                }
                                Modifier.Companion companion6 = Modifier.INSTANCE;
                                Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(companion6, ColorResources_androidKt.colorResource(R.color.gray_75, composer3, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._4sdp, composer3, 6)));
                                Alignment center2 = Alignment.INSTANCE.getCenter();
                                MutableState<String> mutableState5 = mutableState4;
                                String str11 = str10;
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer3, 6);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor5 = companion7.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor5);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy3, companion7.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion7.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion7.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                    composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                }
                                function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                composer3.startReplaceableGroup(-1915020706);
                                if (mutableState5.getValue().length() == 0) {
                                    Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer3, 6), 0.0f, 2, null);
                                    TextAlign.Companion companion8 = TextAlign.INSTANCE;
                                    TextAlign textAlignM13551boximpl = TextAlign.m13551boximpl(companion8.m13558getCentere0LSkKk());
                                    TextStyle textStyleM14834montserratMedium12spOr9ssp67j0QOw = TypographyStyle.INSTANCE.m14834montserratMedium12spOr9ssp67j0QOw(0L, companion8.m13558getCentere0LSkKk(), 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 13);
                                    i7 = i6;
                                    composer4 = composer3;
                                    TextKt.m10024Text4IGK_g(str11, modifierM8125paddingVpY3zN4$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, textAlignM13551boximpl, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14834montserratMedium12spOr9ssp67j0QOw, composer3, 0, 0, 65020);
                                } else {
                                    composer4 = composer3;
                                    i7 = i6;
                                }
                                composer3.endReplaceableGroup();
                                innerTextField.invoke(composer4, Integer.valueOf(i7 & 14));
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
                    }), composer2, 1572864, 221184, 16264);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._minus17sdp, composer2, 6), 1, null);
                    Arrangement.HorizontalOrVertical spaceEvenly = arrangement.getSpaceEvenly();
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, companion3.getTop(), composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(companion5, PrimitiveResources_androidKt.dimensionResource(R.dimen._108sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._34sdp, composer2, 6));
                    TextStyle textStyleM14791montserratBold12spOr9ssp67j0QOw = typographyStyle.m14791montserratBold12spOr9ssp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15);
                    composer2.startReplaceableGroup(-1000134242);
                    final Function1<String, Unit> function13 = function1;
                    boolean zChanged = composer2.changed(function13) | composer2.changed(mutableState4);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.reports.AnswerWithTextFieldAndTwoButtonsBlockKt$AnswerWithTextFieldAndTwoButtonsBlock$1$1$1$2$1$1
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
                                function13.invoke(mutableState4.getValue());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN4, null, str4, textStyleM14791montserratBold12spOr9ssp67j0QOw, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, null, null, null, 0.0f, 0.0f, false, false, null, z6, false, false, null, (Function0) objRememberedValue, composer2, 0, 100663296, 0, 15466482);
                    Modifier modifierM8156defaultMinSizeVpY3zN42 = SizeKt.m8156defaultMinSizeVpY3zN4(companion5, PrimitiveResources_androidKt.dimensionResource(R.dimen._108sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._34sdp, composer2, 6));
                    TextStyle textStyleM14791montserratBold12spOr9ssp67j0QOw2 = typographyStyle.m14791montserratBold12spOr9ssp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15);
                    long jColorResource = ColorResources_androidKt.colorResource(R.color.light_gray_blue, composer2, 6);
                    composer2.startReplaceableGroup(-1000133618);
                    final Function0<Unit> function07 = function04;
                    boolean zChanged2 = composer2.changed(function07);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.reports.AnswerWithTextFieldAndTwoButtonsBlockKt$AnswerWithTextFieldAndTwoButtonsBlock$1$1$1$2$2$1
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
                                function07.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN42, null, str5, textStyleM14791montserratBold12spOr9ssp67j0QOw2, 0.0f, 0, null, null, null, 0.0f, jColorResource, 0.0f, null, null, null, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue2, composer2, 0, 100663296, 0, 16514034);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
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
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 432, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            final Function0<Unit> function04 = function02;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.reports.AnswerWithTextFieldAndTwoButtonsBlockKt.AnswerWithTextFieldAndTwoButtonsBlock.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i4) {
                    AnswerWithTextFieldAndTwoButtonsBlockKt.AnswerWithTextFieldAndTwoButtonsBlock(modifier4, titleText, hintText, str, buttonLeftText, buttonRightText, validationChars, z2, onLeftClick, onRightClick, function04, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "AnswerWithTextFieldAndTwoButtonsBlock")
    public static final void PreviewAnswerWithTextFieldAndTwoButtonsBlock(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1619340539);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1619340539, i, -1, "com.blackhub.bronline.game.ui.admintools.reports.PreviewAnswerWithTextFieldAndTwoButtonsBlock (AnswerWithTextFieldAndTwoButtonsBlock.kt:227)");
            }
            char[] charArray = StringResources_androidKt.stringResource(R.string.common_edittext_allowed_characters, composerStartRestartGroup, 6).toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            composer2 = composerStartRestartGroup;
            AnswerWithTextFieldAndTwoButtonsBlock(null, "Жалоба от игрока: CoolNickname_Nick1000 [7777]", "Текст жалобы", "Вы действительно хотите наказать игрока?", "Выбрать ответ", "Отмена", charArray, false, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.reports.AnswerWithTextFieldAndTwoButtonsBlockKt.PreviewAnswerWithTextFieldAndTwoButtonsBlock.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.reports.AnswerWithTextFieldAndTwoButtonsBlockKt.PreviewAnswerWithTextFieldAndTwoButtonsBlock.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.reports.AnswerWithTextFieldAndTwoButtonsBlockKt.PreviewAnswerWithTextFieldAndTwoButtonsBlock.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 908291504, 6, 129);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.reports.AnswerWithTextFieldAndTwoButtonsBlockKt.PreviewAnswerWithTextFieldAndTwoButtonsBlock.4
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
                    AnswerWithTextFieldAndTwoButtonsBlockKt.PreviewAnswerWithTextFieldAndTwoButtonsBlock(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

