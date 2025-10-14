package com.blackhub.bronline.game.p019ui.rent;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextStyle;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.rent.RentViewModel;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.Nullable;

/* compiled from: RentGui.kt */
@SourceDebugExtension({"SMAP\nRentGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RentGui.kt\ncom/blackhub/bronline/game/ui/rent/RentGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,142:1\n81#2,11:143\n*S KotlinDebug\n*F\n+ 1 RentGui.kt\ncom/blackhub/bronline/game/ui/rent/RentGuiKt\n*L\n35#1:143,11\n*E\n"})

public final class RentGuiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void RentGui(@Nullable Composer composer, final int i) {
        CreationExtras defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(-320928891);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-320928891, i, -1, "com.blackhub.bronline.game.ui.rent.RentGui (RentGui.kt:33)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(RentViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final RentViewModel rentViewModel = (RentViewModel) viewModel;
            RentGuiContent(null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rent.RentGuiKt.RentGui.1
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
                    rentViewModel.onClickButtonWithId(3);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rent.RentGuiKt.RentGui.2
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
                    rentViewModel.onClickButtonWithId(2);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rent.RentGuiKt.RentGui.3
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
                    rentViewModel.onClickButtonWithId(1);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rent.RentGuiKt.RentGui.4
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
                    rentViewModel.closeInterface();
                }
            }, composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rent.RentGuiKt.RentGui.5
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
                    RentGuiKt.RentGui(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RentGuiContent(Modifier modifier, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1070873243);
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
        if ((i2 & 2) == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function03) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= CpioConstants.C_ISBLK;
            } else if ((57344 & i) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function04) ? 16384 : 8192;
            }
            if ((46811 & i3) == 9362 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1070873243, i3, -1, "com.blackhub.bronline.game.ui.rent.RentGuiContent (RentGui.kt:51)");
                }
                final Modifier modifier4 = modifier3;
                SurfaceKt.m9876SurfaceT9BRK9s(null, null, Color.INSTANCE.m11375getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -421046410, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rent.RentGuiKt.RentGuiContent.1
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
                    public final void invoke(@Nullable Composer composer2, int i5) {
                        if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-421046410, i5, -1, "com.blackhub.bronline.game.ui.rent.RentGuiContent.<anonymous> (RentGui.kt:55)");
                            }
                            Brush.Companion companion = Brush.INSTANCE;
                            Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composer2, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.orange, composer2, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                            Brush brushM11289horizontalGradient8A3gB4$default2 = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_80, composer2, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_80, composer2, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                            BorderStroke borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(C2046Dp.m13666constructorimpl(PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composer2, 6) / 2), ColorResources_androidKt.colorResource(R.color.orange, composer2, 6));
                            Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._20sdp, composer2, 6), 7, null);
                            Alignment.Vertical bottom = Alignment.INSTANCE.getBottom();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            final Function0<Unit> function05 = function02;
                            final Function0<Unit> function06 = function03;
                            final Function0<Unit> function07 = function04;
                            final Function0<Unit> function08 = function0;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, bottom, composer2, 54);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._26sdp, composer2, 6));
                            composer2.startReplaceableGroup(204758489);
                            boolean zChanged = composer2.changed(function05);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rent.RentGuiKt$RentGuiContent$1$1$1$1
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
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            ComposableSingletons$RentGuiKt composableSingletons$RentGuiKt = ComposableSingletons$RentGuiKt.INSTANCE;
                            ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8172size3ABfNKs, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue, composableSingletons$RentGuiKt.m15024getLambda1$app_siteRelease(), composer2, 0, 3072, 4094);
                            Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(PaddingKt.m8127paddingqDBjuR0$default(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composer2, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._4sdp, composer2, 6), 0.0f, 10, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._77sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._26sdp, composer2, 6));
                            String strStringResource = StringResources_androidKt.stringResource(R.string.rent_dialog_rent, composer2, 6);
                            TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                            TextStyle textStyleM14807montserratBold8spOr6ssp67j0QOw = typographyStyle.m14807montserratBold8spOr6ssp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15);
                            composer2.startReplaceableGroup(204759422);
                            boolean zChanged2 = composer2.changed(function06);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rent.RentGuiKt$RentGuiContent$1$1$2$1
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
                                        function06.invoke();
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN4, null, strStringResource, textStyleM14807montserratBold8spOr6ssp67j0QOw, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, brushM11289horizontalGradient8A3gB4$default, null, borderStrokeM7798BorderStrokecXLIe8U, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue2, composer2, 0, 0, 0, 16756722);
                            Modifier modifierM8156defaultMinSizeVpY3zN42 = SizeKt.m8156defaultMinSizeVpY3zN4(PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composer2, 6), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._77sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._26sdp, composer2, 6));
                            String strStringResource2 = StringResources_androidKt.stringResource(R.string.common_exit, composer2, 6);
                            TextStyle textStyleM14807montserratBold8spOr6ssp67j0QOw2 = typographyStyle.m14807montserratBold8spOr6ssp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15);
                            composer2.startReplaceableGroup(204760043);
                            boolean zChanged3 = composer2.changed(function07);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rent.RentGuiKt$RentGuiContent$1$1$3$1
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
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceableGroup();
                            MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN42, null, strStringResource2, textStyleM14807montserratBold8spOr6ssp67j0QOw2, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, brushM11289horizontalGradient8A3gB4$default2, null, borderStrokeM7798BorderStrokecXLIe8U, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue3, composer2, 0, 0, 0, 16756722);
                            Modifier modifierM8172size3ABfNKs2 = SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._26sdp, composer2, 6));
                            composer2.startReplaceableGroup(204760220);
                            boolean zChanged4 = composer2.changed(function08);
                            Object objRememberedValue4 = composer2.rememberedValue();
                            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rent.RentGuiKt$RentGuiContent$1$1$4$1
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
                                        function08.invoke();
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            composer2.endReplaceableGroup();
                            ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8172size3ABfNKs2, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue4, composableSingletons$RentGuiKt.m15025getLambda2$app_siteRelease(), composer2, 0, 3072, 4094);
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
                }), composerStartRestartGroup, 12583296, 123);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier5 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rent.RentGuiKt.RentGuiContent.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i5) {
                        RentGuiKt.RentGuiContent(modifier5, function0, function02, function03, function04, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((46811 & i3) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Modifier modifier42 = modifier3;
            SurfaceKt.m9876SurfaceT9BRK9s(null, null, Color.INSTANCE.m11375getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -421046410, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rent.RentGuiKt.RentGuiContent.1
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
                public final void invoke(@Nullable Composer composer2, int i5) {
                    if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-421046410, i5, -1, "com.blackhub.bronline.game.ui.rent.RentGuiContent.<anonymous> (RentGui.kt:55)");
                        }
                        Brush.Companion companion = Brush.INSTANCE;
                        Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composer2, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.orange, composer2, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                        Brush brushM11289horizontalGradient8A3gB4$default2 = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_80, composer2, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_80, composer2, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                        BorderStroke borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(C2046Dp.m13666constructorimpl(PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composer2, 6) / 2), ColorResources_androidKt.colorResource(R.color.orange, composer2, 6));
                        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxSize$default(modifier42, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._20sdp, composer2, 6), 7, null);
                        Alignment.Vertical bottom = Alignment.INSTANCE.getBottom();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        final Function0<Unit> function05 = function02;
                        final Function0<Unit> function06 = function03;
                        final Function0<Unit> function07 = function04;
                        final Function0<Unit> function08 = function0;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, bottom, composer2, 54);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._26sdp, composer2, 6));
                        composer2.startReplaceableGroup(204758489);
                        boolean zChanged = composer2.changed(function05);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rent.RentGuiKt$RentGuiContent$1$1$1$1
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
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        ComposableSingletons$RentGuiKt composableSingletons$RentGuiKt = ComposableSingletons$RentGuiKt.INSTANCE;
                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8172size3ABfNKs, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue, composableSingletons$RentGuiKt.m15024getLambda1$app_siteRelease(), composer2, 0, 3072, 4094);
                        Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(PaddingKt.m8127paddingqDBjuR0$default(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composer2, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._4sdp, composer2, 6), 0.0f, 10, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._77sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._26sdp, composer2, 6));
                        String strStringResource = StringResources_androidKt.stringResource(R.string.rent_dialog_rent, composer2, 6);
                        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                        TextStyle textStyleM14807montserratBold8spOr6ssp67j0QOw = typographyStyle.m14807montserratBold8spOr6ssp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15);
                        composer2.startReplaceableGroup(204759422);
                        boolean zChanged2 = composer2.changed(function06);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rent.RentGuiKt$RentGuiContent$1$1$2$1
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
                                    function06.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN4, null, strStringResource, textStyleM14807montserratBold8spOr6ssp67j0QOw, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, brushM11289horizontalGradient8A3gB4$default, null, borderStrokeM7798BorderStrokecXLIe8U, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue2, composer2, 0, 0, 0, 16756722);
                        Modifier modifierM8156defaultMinSizeVpY3zN42 = SizeKt.m8156defaultMinSizeVpY3zN4(PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composer2, 6), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._77sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._26sdp, composer2, 6));
                        String strStringResource2 = StringResources_androidKt.stringResource(R.string.common_exit, composer2, 6);
                        TextStyle textStyleM14807montserratBold8spOr6ssp67j0QOw2 = typographyStyle.m14807montserratBold8spOr6ssp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15);
                        composer2.startReplaceableGroup(204760043);
                        boolean zChanged3 = composer2.changed(function07);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rent.RentGuiKt$RentGuiContent$1$1$3$1
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
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN42, null, strStringResource2, textStyleM14807montserratBold8spOr6ssp67j0QOw2, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, brushM11289horizontalGradient8A3gB4$default2, null, borderStrokeM7798BorderStrokecXLIe8U, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue3, composer2, 0, 0, 0, 16756722);
                        Modifier modifierM8172size3ABfNKs2 = SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._26sdp, composer2, 6));
                        composer2.startReplaceableGroup(204760220);
                        boolean zChanged4 = composer2.changed(function08);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rent.RentGuiKt$RentGuiContent$1$1$4$1
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
                                    function08.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceableGroup();
                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8172size3ABfNKs2, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue4, composableSingletons$RentGuiKt.m15025getLambda2$app_siteRelease(), composer2, 0, 3072, 4094);
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
            }), composerStartRestartGroup, 12583296, 123);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewBrDialogRentGui(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1162694615);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1162694615, i, -1, "com.blackhub.bronline.game.ui.rent.PreviewBrDialogRentGui (RentGui.kt:134)");
            }
            RentGuiContent(null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rent.RentGuiKt.PreviewBrDialogRentGui.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rent.RentGuiKt.PreviewBrDialogRentGui.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rent.RentGuiKt.PreviewBrDialogRentGui.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rent.RentGuiKt.PreviewBrDialogRentGui.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rent.RentGuiKt.PreviewBrDialogRentGui.5
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
                    RentGuiKt.PreviewBrDialogRentGui(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

