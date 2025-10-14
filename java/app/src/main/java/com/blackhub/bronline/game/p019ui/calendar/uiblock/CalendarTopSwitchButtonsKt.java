package com.blackhub.bronline.game.p019ui.calendar.uiblock;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.C2046Dp;
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
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.calendar.model.CalendarScreenType;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CalendarTopSwitchButtons.kt */
@SourceDebugExtension({"SMAP\nCalendarTopSwitchButtons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarTopSwitchButtons.kt\ncom/blackhub/bronline/game/ui/calendar/uiblock/CalendarTopSwitchButtonsKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,124:1\n68#2,6:125\n74#2:159\n68#2,6:166\n74#2:200\n78#2:206\n68#2,6:213\n74#2:247\n78#2:253\n78#2:258\n79#3,11:131\n79#3,11:172\n92#3:205\n79#3,11:219\n92#3:252\n92#3:257\n456#4,8:142\n464#4,3:156\n456#4,8:183\n464#4,3:197\n467#4,3:202\n456#4,8:230\n464#4,3:244\n467#4,3:249\n467#4,3:254\n3737#5,6:150\n3737#5,6:191\n3737#5,6:238\n1116#6,6:160\n1116#6,6:207\n64#7:201\n64#7:248\n*S KotlinDebug\n*F\n+ 1 CalendarTopSwitchButtons.kt\ncom/blackhub/bronline/game/ui/calendar/uiblock/CalendarTopSwitchButtonsKt\n*L\n46#1:125,6\n46#1:159\n47#1:166,6\n47#1:200\n47#1:206\n79#1:213,6\n79#1:247\n79#1:253\n46#1:258\n46#1:131,11\n47#1:172,11\n47#1:205\n79#1:219,11\n79#1:252\n46#1:257\n46#1:142,8\n46#1:156,3\n47#1:183,8\n47#1:197,3\n47#1:202,3\n79#1:230,8\n79#1:244,3\n79#1:249,3\n46#1:254,3\n46#1:150,6\n47#1:191,6\n79#1:238,6\n56#1:160,6\n87#1:207,6\n72#1:201\n103#1:248\n*E\n"})
/* loaded from: classes2.dex */
public final class CalendarTopSwitchButtonsKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CalendarTopSwitchButtons(@Nullable Modifier modifier, @NotNull final CalendarScreenType selectedPage, final boolean z, final boolean z2, @NotNull final Function1<? super CalendarScreenType, Unit> onTopSwitchButtonsClick, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        BoxScopeInstance boxScopeInstance;
        Intrinsics.checkNotNullParameter(selectedPage, "selectedPage");
        Intrinsics.checkNotNullParameter(onTopSwitchButtonsClick, "onTopSwitchButtonsClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(339491163);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(selectedPage) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= CpioConstants.C_ISBLK;
        } else if ((i & 57344) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTopSwitchButtonsClick) ? 16384 : 8192;
        }
        int i5 = i3;
        if ((46811 & i5) != 9362 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(339491163, i5, -1, "com.blackhub.bronline.game.ui.calendar.uiblock.CalendarTopSwitchButtons (CalendarTopSwitchButtons.kt:37)");
            }
            SolidColor solidColor = new SolidColor(ColorResources_androidKt.colorResource(R.color.gray_blue, composerStartRestartGroup, 6), null);
            RoundedCornerShape roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default = RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
            SolidColor solidColor2 = new SolidColor(ColorResources_androidKt.colorResource(R.color.blue_dark, composerStartRestartGroup, 6), null);
            RoundedCornerShape roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default2 = RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null);
            TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
            Modifier modifier4 = modifier3;
            TextStyle textStyleM14862montserratSemiBoldCustomSpcv9FZhg = typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62);
            TextStyle textStyleM14848montserratRegularCustomSpbl3sdaw = typographyStyle.m14848montserratRegularCustomSpbl3sdaw(R.dimen._12wsp, 0L, 0, 0L, 0.0f, composerStartRestartGroup, 196614, 30);
            Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(modifier4, PrimitiveResources_androidKt.dimensionResource(R.dimen._180wdp, composerStartRestartGroup, 6));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8177width3ABfNKs);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._90wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6));
            CalendarScreenType calendarScreenType = CalendarScreenType.COME_BACK;
            Modifier modifierAlign = boxScopeInstance2.align(BackgroundKt.background$default(modifierM8158height3ABfNKs, selectedPage == calendarScreenType ? solidColor : solidColor2, roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default2, 0.0f, 4, null), companion.getTopEnd());
            composerStartRestartGroup.startReplaceableGroup(-545902193);
            int i6 = i5 & 57344;
            boolean z3 = i6 == 16384;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.uiblock.CalendarTopSwitchButtonsKt$CalendarTopSwitchButtons$1$1$1
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
                        onTopSwitchButtonsClick.invoke(CalendarScreenType.COME_BACK);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM7805clickableXHw0xAI$default = ClickableKt.m7805clickableXHw0xAI$default(modifierAlign, false, null, null, (Function0) objRememberedValue, 7, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7805clickableXHw0xAI$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.calendar_come_back_title, composerStartRestartGroup, 6), AlphaKt.alpha(boxScopeInstance2.align(companion3, companion.getCenter()), selectedPage == calendarScreenType ? 1.0f : 0.5f), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, selectedPage == calendarScreenType ? textStyleM14862montserratSemiBoldCustomSpcv9FZhg : textStyleM14848montserratRegularCustomSpbl3sdaw, composerStartRestartGroup, 0, 0, 65532);
            composerStartRestartGroup.startReplaceableGroup(-545901702);
            if (z2) {
                boxScopeInstance = boxScopeInstance2;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_alarm, composerStartRestartGroup, 6), (String) null, OffsetKt.m8083offsetVpY3zN4(boxScopeInstance2.align(SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composerStartRestartGroup, 6)), companion.getTopEnd()), PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6), C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            } else {
                boxScopeInstance = boxScopeInstance2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._90wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6));
            CalendarScreenType calendarScreenType2 = CalendarScreenType.MAIN;
            Modifier modifierBackground$default = BackgroundKt.background$default(modifierM8158height3ABfNKs2, selectedPage == calendarScreenType2 ? solidColor : solidColor2, roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default, 0.0f, 4, null);
            composerStartRestartGroup.startReplaceableGroup(-545900754);
            boolean z4 = i6 == 16384;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.uiblock.CalendarTopSwitchButtonsKt$CalendarTopSwitchButtons$1$3$1
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
                        onTopSwitchButtonsClick.invoke(CalendarScreenType.MAIN);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM7805clickableXHw0xAI$default2 = ClickableKt.m7805clickableXHw0xAI$default(modifierBackground$default, false, null, null, (Function0) objRememberedValue2, 7, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM7805clickableXHw0xAI$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, companion2.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance3 = boxScopeInstance;
            Modifier modifierAlpha = AlphaKt.alpha(boxScopeInstance3.align(companion3, companion.getCenter()), selectedPage == calendarScreenType2 ? 1.0f : 0.5f);
            String strStringResource = StringResources_androidKt.stringResource(R.string.calendar_season_title, composerStartRestartGroup, 6);
            if (selectedPage != calendarScreenType2) {
                textStyleM14862montserratSemiBoldCustomSpcv9FZhg = textStyleM14848montserratRegularCustomSpbl3sdaw;
            }
            TextKt.m10024Text4IGK_g(strStringResource, modifierAlpha, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14862montserratSemiBoldCustomSpcv9FZhg, composerStartRestartGroup, 0, 0, 65532);
            composerStartRestartGroup.startReplaceableGroup(-545900281);
            if (z) {
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_alarm, composerStartRestartGroup, 6), (String) null, OffsetKt.m8083offsetVpY3zN4(boxScopeInstance3.align(SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composerStartRestartGroup, 6)), companion.getTopEnd()), PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6), C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.uiblock.CalendarTopSwitchButtonsKt.CalendarTopSwitchButtons.2
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

                public final void invoke(@Nullable Composer composer2, int i7) {
                    CalendarTopSwitchButtonsKt.CalendarTopSwitchButtons(modifier5, selectedPage, z, z2, onTopSwitchButtonsClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewCalendarTopSwitchButtons(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2058043645);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2058043645, i, -1, "com.blackhub.bronline.game.ui.calendar.uiblock.PreviewCalendarTopSwitchButtons (CalendarTopSwitchButtons.kt:115)");
            }
            CalendarTopSwitchButtons(null, CalendarScreenType.COME_BACK, true, true, new Function1<CalendarScreenType, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.uiblock.CalendarTopSwitchButtonsKt.PreviewCalendarTopSwitchButtons.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CalendarScreenType it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CalendarScreenType calendarScreenType) {
                    invoke2(calendarScreenType);
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 28080, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.uiblock.CalendarTopSwitchButtonsKt.PreviewCalendarTopSwitchButtons.2
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
                    CalendarTopSwitchButtonsKt.PreviewCalendarTopSwitchButtons(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

