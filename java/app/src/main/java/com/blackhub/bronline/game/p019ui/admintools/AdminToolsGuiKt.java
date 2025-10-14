package com.blackhub.bronline.game.p019ui.admintools;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.common.C2732C;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaSmallPreview;
import com.blackhub.bronline.game.gui.admintools.AdminToolsUiState;
import com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel;
import com.blackhub.bronline.game.gui.admintools.model.ATTemplateModel;
import com.blackhub.bronline.game.p019ui.admintools.adminpanel.ATPanelUiKt;
import com.blackhub.bronline.game.p019ui.admintools.control.ATControlPanelUiKt;
import com.blackhub.bronline.game.p019ui.admintools.control.ATCreateAndEditPatternBlockKt;
import com.blackhub.bronline.game.p019ui.admintools.control.ATSelectCategoryKt;
import com.blackhub.bronline.game.p019ui.admintools.reports.AnswerWithTextFieldAndTwoButtonsBlockKt;
import com.blackhub.bronline.game.p019ui.admintools.widget.ATGridBlockKt;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.blackhub.bronline.game.p019ui.widget.timer.DataWithTimerKt;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: AdminToolsGui.kt */
@SourceDebugExtension({"SMAP\nAdminToolsGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminToolsGui.kt\ncom/blackhub/bronline/game/ui/admintools/AdminToolsGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,464:1\n81#2,11:465\n1116#3,6:476\n75#4:482\n108#4,2:483\n*S KotlinDebug\n*F\n+ 1 AdminToolsGui.kt\ncom/blackhub/bronline/game/ui/admintools/AdminToolsGuiKt\n*L\n64#1:465,11\n67#1:476,6\n67#1:482\n67#1:483,2\n*E\n"})
/* loaded from: classes.dex */
public final class AdminToolsGuiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void AdminToolsGui(@Nullable Composer composer, final int i) {
        CreationExtras defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1778554850);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1778554850, i, -1, "com.blackhub.bronline.game.ui.admintools.AdminToolsGui (AdminToolsGui.kt:61)");
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
            ViewModel viewModel = ViewModelKt.viewModel(AdminToolsViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final AdminToolsViewModel adminToolsViewModel = (AdminToolsViewModel) viewModel;
            final AdminToolsUiState adminToolsUiState = (AdminToolsUiState) FlowExtKt.collectAsStateWithLifecycle(adminToolsViewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue();
            composerStartRestartGroup.startReplaceableGroup(1376084523);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            final char[] charArray = StringResources_androidKt.stringResource(adminToolsUiState.getValidationChars(), composerStartRestartGroup, 0).toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            ComposeExtensionKt.IfTrue(Boolean.valueOf(adminToolsUiState.isInterfaceVisible()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 214191686, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1
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
                public final void invoke(@Nullable Composer composer2, int i2) {
                    Integer templateTime;
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(214191686, i2, -1, "com.blackhub.bronline.game.ui.admintools.AdminToolsGui.<anonymous> (AdminToolsGui.kt:73)");
                        }
                        int screenType = adminToolsUiState.getScreenType();
                        composer2.startReplaceableGroup(-572318324);
                        string = null;
                        String string = null;
                        if (screenType == 3 || screenType == 4 || screenType == 5 || screenType == 6 || screenType == 7 || screenType == 9 || screenType == 32 || screenType == 82) {
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                            Alignment bottomEnd = Alignment.INSTANCE.getBottomEnd();
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomEnd, false, composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            DataWithTimerKt.DataWithTimer(PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6), 3, null), composer2, 0, 0);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        composer2.endReplaceableGroup();
                        int screenType2 = adminToolsUiState.getScreenType();
                        if (screenType2 != 32) {
                            if (screenType2 != 82) {
                                switch (screenType2) {
                                    case 1:
                                    case 2:
                                        composer2.startReplaceableGroup(-572317213);
                                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        final AdminToolsUiState adminToolsUiState2 = adminToolsUiState;
                                        final AdminToolsViewModel adminToolsViewModel2 = adminToolsViewModel;
                                        final MutableIntState mutableIntState2 = mutableIntState;
                                        composer2.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                        composer2.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
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
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        ATPanelUiKt.ATPanelUi(null, adminToolsUiState2.getPlayerId(), adminToolsUiState2.getPlayerName(), adminToolsUiState2.getPlayerInfoList(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt$AdminToolsGui$1$2$1
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
                                                adminToolsViewModel2.sendButton(1, 10);
                                            }
                                        }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt$AdminToolsGui$1$2$2
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
                                                adminToolsViewModel2.sendButton(1, 11);
                                            }
                                        }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt$AdminToolsGui$1$2$3
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
                                                adminToolsViewModel2.sendTrackingPanelButton(1);
                                            }
                                        }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt$AdminToolsGui$1$2$4
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
                                                adminToolsViewModel2.sendCloseScreen();
                                            }
                                        }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt$AdminToolsGui$1$2$5
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
                                                adminToolsViewModel2.sendTrackingPanelButton(2);
                                            }
                                        }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt$AdminToolsGui$1$2$6
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
                                                adminToolsViewModel2.sendTrackingPanelCategoryButton(3);
                                            }
                                        }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt$AdminToolsGui$1$2$7
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
                                                adminToolsViewModel2.sendTrackingPanelCategoryButton(4);
                                            }
                                        }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt$AdminToolsGui$1$2$8
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
                                                adminToolsViewModel2.sendTrackingPanelCategoryButton(5);
                                            }
                                        }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt$AdminToolsGui$1$2$9
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
                                                adminToolsViewModel2.sendTrackingPanelCategoryButton(6);
                                            }
                                        }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt$AdminToolsGui$1$2$10
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
                                                adminToolsViewModel2.sendTrackingPanelCategoryButton(7);
                                            }
                                        }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt$AdminToolsGui$1$2$11
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
                                                adminToolsViewModel2.sendTrackingPanelCategoryButton(8);
                                            }
                                        }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt$AdminToolsGui$1$2$12
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
                                                adminToolsViewModel2.sendTrackingPanelButton(9);
                                            }
                                        }, composer2, 4096, 0, 1);
                                        ComposeExtensionKt.IfTrue(Boolean.valueOf(adminToolsUiState2.isShowTable()), ComposableLambdaKt.composableLambda(composer2, -1791156391, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt$AdminToolsGui$1$2$13
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                            public final void invoke(@Nullable Composer composer3, int i3) {
                                                if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1791156391, i3, -1, "com.blackhub.bronline.game.ui.admintools.AdminToolsGui.<anonymous>.<anonymous>.<anonymous> (AdminToolsGui.kt:159)");
                                                    }
                                                    String tableTitle = adminToolsUiState2.getTableTitle();
                                                    List<ATTemplateModel> templateList = adminToolsUiState2.getTemplateList();
                                                    String strStringResource = StringResources_androidKt.stringResource(R.string.common_choose, composer3, 6);
                                                    String strStringResource2 = StringResources_androidKt.stringResource(R.string.common_back, composer3, 6);
                                                    final AdminToolsViewModel adminToolsViewModel3 = adminToolsViewModel2;
                                                    final MutableIntState mutableIntState3 = mutableIntState2;
                                                    Function1<Integer, Unit> function1 = new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt$AdminToolsGui$1$2$13.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                                            invoke(num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(int i4) {
                                                            AdminToolsGuiKt.AdminToolsGui$lambda$2(mutableIntState3, i4);
                                                            adminToolsViewModel3.sendTrackingPanelTableButtonAndCloseTable(i4);
                                                        }
                                                    };
                                                    final AdminToolsViewModel adminToolsViewModel4 = adminToolsViewModel2;
                                                    ATGridBlockKt.ATGridBlock(null, tableTitle, templateList, strStringResource, null, strStringResource2, 0, false, true, false, false, function1, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt$AdminToolsGui$1$2$13.2
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
                                                            adminToolsViewModel4.closeTable();
                                                        }
                                                    }, composer3, 113246720, 0, 5713);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }), composer2, 48);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        Unit unit = Unit.INSTANCE;
                                        break;
                                    case 3:
                                        composer2.startReplaceableGroup(-572313299);
                                        long jM11375getTransparent0d7_KjU = Color.INSTANCE.m11375getTransparent0d7_KjU();
                                        final AdminToolsUiState adminToolsUiState3 = adminToolsUiState;
                                        final char[] cArr = charArray;
                                        final AdminToolsViewModel adminToolsViewModel3 = adminToolsViewModel;
                                        FakeDialogKt.m15089FakeDialog3IgeMak(null, jM11375getTransparent0d7_KjU, ComposableLambdaKt.composableLambda(composer2, -1446083102, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                            public final void invoke(@Nullable Composer composer3, int i3) {
                                                if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1446083102, i3, -1, "com.blackhub.bronline.game.ui.admintools.AdminToolsGui.<anonymous>.<anonymous> (AdminToolsGui.kt:182)");
                                                    }
                                                    String strStringResource = StringResources_androidKt.stringResource(R.string.admin_tools_report_title_text, new Object[]{adminToolsUiState3.getPlayerName(), Integer.valueOf(adminToolsUiState3.getPlayerId())}, composer3, 70);
                                                    String playerReport = adminToolsUiState3.getPlayerReport();
                                                    String strStringResource2 = StringResources_androidKt.stringResource(R.string.common_change_answer, composer3, 6);
                                                    String strStringResource3 = StringResources_androidKt.stringResource(R.string.common_cancel, composer3, 6);
                                                    char[] cArr2 = cArr;
                                                    final AdminToolsViewModel adminToolsViewModel4 = adminToolsViewModel3;
                                                    Function1<String, Unit> function1 = new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.3.1
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(String str) {
                                                            invoke2(str);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(@NotNull String it) {
                                                            Intrinsics.checkNotNullParameter(it, "it");
                                                            adminToolsViewModel4.sendReportButton(1);
                                                        }
                                                    };
                                                    final AdminToolsViewModel adminToolsViewModel5 = adminToolsViewModel3;
                                                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.3.2
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
                                                            adminToolsViewModel5.sendReportCancelButton(2);
                                                        }
                                                    };
                                                    final AdminToolsViewModel adminToolsViewModel6 = adminToolsViewModel3;
                                                    AnswerWithTextFieldAndTwoButtonsBlockKt.AnswerWithTextFieldAndTwoButtonsBlock(null, strStringResource, playerReport, null, strStringResource2, strStringResource3, cArr2, true, function1, function0, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.3.3
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
                                                            adminToolsViewModel6.sendCloseScreen();
                                                        }
                                                    }, composer3, 14683136, 0, 1);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }), composer2, 432, 1);
                                        composer2.endReplaceableGroup();
                                        Unit unit2 = Unit.INSTANCE;
                                        break;
                                    case 4:
                                        composer2.startReplaceableGroup(-572312009);
                                        long jM11375getTransparent0d7_KjU2 = Color.INSTANCE.m11375getTransparent0d7_KjU();
                                        final AdminToolsUiState adminToolsUiState4 = adminToolsUiState;
                                        final AdminToolsViewModel adminToolsViewModel4 = adminToolsViewModel;
                                        final MutableIntState mutableIntState3 = mutableIntState;
                                        FakeDialogKt.m15089FakeDialog3IgeMak(null, jM11375getTransparent0d7_KjU2, ComposableLambdaKt.composableLambda(composer2, 1954949283, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                            public final void invoke(@Nullable Composer composer3, int i3) {
                                                if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1954949283, i3, -1, "com.blackhub.bronline.game.ui.admintools.AdminToolsGui.<anonymous>.<anonymous> (AdminToolsGui.kt:209)");
                                                    }
                                                    String tableTitle = adminToolsUiState4.getTableTitle();
                                                    List<ATTemplateModel> templateList = adminToolsUiState4.getTemplateList();
                                                    String strStringResource = StringResources_androidKt.stringResource(R.string.common_choose, composer3, 6);
                                                    String strStringResource2 = StringResources_androidKt.stringResource(R.string.admin_tools_report_your_answer_button, composer3, 6);
                                                    String strStringResource3 = StringResources_androidKt.stringResource(R.string.common_back, composer3, 6);
                                                    final AdminToolsViewModel adminToolsViewModel5 = adminToolsViewModel4;
                                                    final MutableIntState mutableIntState4 = mutableIntState3;
                                                    Function1<Integer, Unit> function1 = new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.4.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                                            invoke(num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(int i4) {
                                                            AdminToolsGuiKt.AdminToolsGui$lambda$2(mutableIntState4, i4);
                                                            adminToolsViewModel5.closeTableAndOpenTemplate(i4);
                                                        }
                                                    };
                                                    final AdminToolsViewModel adminToolsViewModel6 = adminToolsViewModel4;
                                                    Function1<Integer, Unit> function12 = new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.4.2
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                                            invoke(num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(int i4) {
                                                            adminToolsViewModel6.selectTypeScreen(5);
                                                        }
                                                    };
                                                    final AdminToolsViewModel adminToolsViewModel7 = adminToolsViewModel4;
                                                    ATGridBlockKt.ATGridBlock(null, tableTitle, templateList, strStringResource, strStringResource2, strStringResource3, 0, true, true, true, true, function1, function12, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.4.3
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
                                                            adminToolsViewModel7.selectTypeScreen(3);
                                                        }
                                                    }, composer3, 918553088, 6, 65);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }), composer2, 432, 1);
                                        composer2.endReplaceableGroup();
                                        Unit unit3 = Unit.INSTANCE;
                                        break;
                                    case 5:
                                        composer2.startReplaceableGroup(-572309325);
                                        long jM11375getTransparent0d7_KjU3 = Color.INSTANCE.m11375getTransparent0d7_KjU();
                                        final char[] cArr2 = charArray;
                                        final AdminToolsViewModel adminToolsViewModel5 = adminToolsViewModel;
                                        FakeDialogKt.m15089FakeDialog3IgeMak(null, jM11375getTransparent0d7_KjU3, ComposableLambdaKt.composableLambda(composer2, 167079461, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.6
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                            public final void invoke(@Nullable Composer composer3, int i3) {
                                                if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(167079461, i3, -1, "com.blackhub.bronline.game.ui.admintools.AdminToolsGui.<anonymous>.<anonymous> (AdminToolsGui.kt:264)");
                                                    }
                                                    String strStringResource = StringResources_androidKt.stringResource(R.string.admin_tools_report_your_answer_title, composer3, 6);
                                                    String strStringResource2 = StringResources_androidKt.stringResource(R.string.admin_tools_report_your_answer_hint, composer3, 6);
                                                    String strStringResource3 = StringResources_androidKt.stringResource(R.string.common_send, composer3, 6);
                                                    String strStringResource4 = StringResources_androidKt.stringResource(R.string.common_back, composer3, 6);
                                                    char[] cArr3 = cArr2;
                                                    final AdminToolsViewModel adminToolsViewModel6 = adminToolsViewModel5;
                                                    Function1<String, Unit> function1 = new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.6.1
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(String str) {
                                                            invoke2(str);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(@NotNull String reportText) {
                                                            Intrinsics.checkNotNullParameter(reportText, "reportText");
                                                            adminToolsViewModel6.sendCustomReport(reportText);
                                                        }
                                                    };
                                                    final AdminToolsViewModel adminToolsViewModel7 = adminToolsViewModel5;
                                                    AnswerWithTextFieldAndTwoButtonsBlockKt.AnswerWithTextFieldAndTwoButtonsBlock(null, strStringResource, strStringResource2, null, strStringResource3, strStringResource4, cArr3, false, function1, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.6.2
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
                                                            adminToolsViewModel7.selectTypeScreen(4);
                                                        }
                                                    }, null, composer3, 14683136, 0, 1025);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }), composer2, 432, 1);
                                        composer2.endReplaceableGroup();
                                        Unit unit4 = Unit.INSTANCE;
                                        break;
                                    case 6:
                                        composer2.startReplaceableGroup(-572308225);
                                        long jM11375getTransparent0d7_KjU4 = Color.INSTANCE.m11375getTransparent0d7_KjU();
                                        final AdminToolsViewModel adminToolsViewModel6 = adminToolsViewModel;
                                        FakeDialogKt.m15089FakeDialog3IgeMak(null, jM11375getTransparent0d7_KjU4, ComposableLambdaKt.composableLambda(composer2, -726855450, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.7
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
                                            public final void invoke(@Nullable Composer composer3, int i3) {
                                                if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-726855450, i3, -1, "com.blackhub.bronline.game.ui.admintools.AdminToolsGui.<anonymous>.<anonymous> (AdminToolsGui.kt:286)");
                                                    }
                                                    final String strStringResource = StringResources_androidKt.stringResource(R.string.admin_tools_categories_title_show_template, composer3, 6);
                                                    final String strStringResource2 = StringResources_androidKt.stringResource(R.string.admin_tools_categories_title_add_template, composer3, 6);
                                                    final AdminToolsViewModel adminToolsViewModel7 = adminToolsViewModel6;
                                                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.7.1
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
                                                            adminToolsViewModel7.sendButtonIdAndSetCategoryTitle(6, 0, strStringResource);
                                                        }
                                                    };
                                                    final AdminToolsViewModel adminToolsViewModel8 = adminToolsViewModel6;
                                                    Function0<Unit> function02 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.7.2
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
                                                            adminToolsViewModel8.sendButtonIdAndSetCategoryTitle(6, 1, strStringResource2);
                                                        }
                                                    };
                                                    final AdminToolsViewModel adminToolsViewModel9 = adminToolsViewModel6;
                                                    ATControlPanelUiKt.ATControlPanelUi(null, function0, function02, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.7.3
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
                                                            adminToolsViewModel9.sendCloseScreen();
                                                        }
                                                    }, composer3, 0, 1);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }), composer2, 432, 1);
                                        composer2.endReplaceableGroup();
                                        Unit unit5 = Unit.INSTANCE;
                                        break;
                                    case 7:
                                        composer2.startReplaceableGroup(-572306751);
                                        long jM11375getTransparent0d7_KjU5 = Color.INSTANCE.m11375getTransparent0d7_KjU();
                                        final AdminToolsUiState adminToolsUiState5 = adminToolsUiState;
                                        final AdminToolsViewModel adminToolsViewModel7 = adminToolsViewModel;
                                        FakeDialogKt.m15089FakeDialog3IgeMak(null, jM11375getTransparent0d7_KjU5, ComposableLambdaKt.composableLambda(composer2, -1620790361, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.8
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                            public final void invoke(@Nullable Composer composer3, int i3) {
                                                if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1620790361, i3, -1, "com.blackhub.bronline.game.ui.admintools.AdminToolsGui.<anonymous>.<anonymous> (AdminToolsGui.kt:314)");
                                                    }
                                                    String categoryTitle = adminToolsUiState5.getCategoryTitle();
                                                    final AdminToolsViewModel adminToolsViewModel8 = adminToolsViewModel7;
                                                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.8.1
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
                                                            adminToolsViewModel8.selectTypeScreen(6);
                                                        }
                                                    };
                                                    final AdminToolsViewModel adminToolsViewModel9 = adminToolsViewModel7;
                                                    Function0<Unit> function02 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.8.2
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
                                                            adminToolsViewModel9.sendButtonId(7, 3);
                                                        }
                                                    };
                                                    final AdminToolsViewModel adminToolsViewModel10 = adminToolsViewModel7;
                                                    Function0<Unit> function03 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.8.3
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
                                                            adminToolsViewModel10.sendButtonId(7, 4);
                                                        }
                                                    };
                                                    final AdminToolsViewModel adminToolsViewModel11 = adminToolsViewModel7;
                                                    Function0<Unit> function04 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.8.4
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
                                                            adminToolsViewModel11.sendButtonId(7, 5);
                                                        }
                                                    };
                                                    final AdminToolsViewModel adminToolsViewModel12 = adminToolsViewModel7;
                                                    Function0<Unit> function05 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.8.5
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
                                                            adminToolsViewModel12.sendButtonId(7, 6);
                                                        }
                                                    };
                                                    final AdminToolsViewModel adminToolsViewModel13 = adminToolsViewModel7;
                                                    Function0<Unit> function06 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.8.6
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
                                                            adminToolsViewModel13.sendButtonId(7, 7);
                                                        }
                                                    };
                                                    final AdminToolsViewModel adminToolsViewModel14 = adminToolsViewModel7;
                                                    ATSelectCategoryKt.ATSelectCategory(null, categoryTitle, function0, function02, function03, function04, function05, function06, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.8.7
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
                                                            adminToolsViewModel14.sendButtonId(7, 8);
                                                        }
                                                    }, composer3, 0, 1);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }), composer2, 432, 1);
                                        composer2.endReplaceableGroup();
                                        Unit unit6 = Unit.INSTANCE;
                                        break;
                                    case 8:
                                        composer2.startReplaceableGroup(-572304544);
                                        long jM11375getTransparent0d7_KjU6 = Color.INSTANCE.m11375getTransparent0d7_KjU();
                                        final AdminToolsUiState adminToolsUiState6 = adminToolsUiState;
                                        final AdminToolsViewModel adminToolsViewModel8 = adminToolsViewModel;
                                        final MutableIntState mutableIntState4 = mutableIntState;
                                        FakeDialogKt.m15089FakeDialog3IgeMak(null, jM11375getTransparent0d7_KjU6, ComposableLambdaKt.composableLambda(composer2, 1780242024, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.9
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                            public final void invoke(@Nullable Composer composer3, int i3) {
                                                if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1780242024, i3, -1, "com.blackhub.bronline.game.ui.admintools.AdminToolsGui.<anonymous>.<anonymous> (AdminToolsGui.kt:363)");
                                                    }
                                                    String tableTitle = adminToolsUiState6.getTableTitle();
                                                    List<ATTemplateModel> templateList = adminToolsUiState6.getTemplateList();
                                                    String strStringResource = StringResources_androidKt.stringResource(R.string.common_edit, composer3, 6);
                                                    String strStringResource2 = StringResources_androidKt.stringResource(R.string.common_clear, composer3, 6);
                                                    String strStringResource3 = StringResources_androidKt.stringResource(R.string.common_back, composer3, 6);
                                                    boolean z = !adminToolsUiState6.getTemplateList().isEmpty();
                                                    boolean z2 = !adminToolsUiState6.getTemplateList().isEmpty();
                                                    final AdminToolsViewModel adminToolsViewModel9 = adminToolsViewModel8;
                                                    final MutableIntState mutableIntState5 = mutableIntState4;
                                                    Function1<Integer, Unit> function1 = new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.9.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                                            invoke(num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(int i4) {
                                                            AdminToolsGuiKt.AdminToolsGui$lambda$2(mutableIntState5, i4);
                                                            adminToolsViewModel9.closeTableAndOpenEditTemplate(i4);
                                                        }
                                                    };
                                                    final AdminToolsViewModel adminToolsViewModel10 = adminToolsViewModel8;
                                                    final MutableIntState mutableIntState6 = mutableIntState4;
                                                    Function1<Integer, Unit> function12 = new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.9.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                                            invoke(num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(int i4) {
                                                            AdminToolsGuiKt.AdminToolsGui$lambda$2(mutableIntState6, i4);
                                                            adminToolsViewModel10.deleteTemplateInTable(i4);
                                                        }
                                                    };
                                                    final AdminToolsUiState adminToolsUiState7 = adminToolsUiState6;
                                                    final AdminToolsViewModel adminToolsViewModel11 = adminToolsViewModel8;
                                                    ATGridBlockKt.ATGridBlock(null, tableTitle, templateList, strStringResource, strStringResource2, strStringResource3, 0, false, z, true, z2, function1, function12, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.9.3
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
                                                            if (IntExtensionKt.isNotZero(Integer.valueOf(adminToolsUiState7.getCategoryId()))) {
                                                                adminToolsViewModel11.selectTypeScreen(7);
                                                            } else {
                                                                adminToolsViewModel11.selectTypeScreen(6);
                                                            }
                                                        }
                                                    }, composer3, 817889792, 0, 65);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }), composer2, 432, 1);
                                        composer2.endReplaceableGroup();
                                        Unit unit7 = Unit.INSTANCE;
                                        break;
                                    case 9:
                                        composer2.startReplaceableGroup(-572301154);
                                        Integer timeTitle = adminToolsUiState.getTimeTitle();
                                        composer2.startReplaceableGroup(-572301106);
                                        String strStringResource = timeTitle == null ? null : StringResources_androidKt.stringResource(timeTitle.intValue(), composer2, 0);
                                        composer2.endReplaceableGroup();
                                        String templateTitle = adminToolsUiState.getTemplateTitle();
                                        ATTemplateModel currentTemplate = adminToolsUiState.getCurrentTemplate();
                                        if (currentTemplate != null && (templateTime = currentTemplate.getTemplateTime()) != null) {
                                            string = templateTime.toString();
                                        }
                                        String str = string == null ? "" : string;
                                        String strStringResource2 = StringResources_androidKt.stringResource(R.string.common_add, composer2, 6);
                                        String strStringResource3 = StringResources_androidKt.stringResource(R.string.common_back, composer2, 6);
                                        IntRange timeRange = adminToolsUiState.getTimeRange();
                                        char[] cArr3 = charArray;
                                        final AdminToolsViewModel adminToolsViewModel9 = adminToolsViewModel;
                                        Function1<ATTemplateModel, Unit> function1 = new Function1<ATTemplateModel, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.12
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(ATTemplateModel aTTemplateModel) {
                                                invoke2(aTTemplateModel);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull ATTemplateModel template) {
                                                Intrinsics.checkNotNullParameter(template, "template");
                                                AdminToolsViewModel adminToolsViewModel10 = adminToolsViewModel9;
                                                String templateTitle2 = template.getTemplateTitle();
                                                String templateDesc = template.getTemplateDesc();
                                                Integer templateTime2 = template.getTemplateTime();
                                                if (!AnyExtensionKt.isNotNull(templateTime2)) {
                                                    templateTime2 = null;
                                                }
                                                adminToolsViewModel10.sendTemplateCreate(templateTitle2, templateDesc, templateTime2);
                                            }
                                        };
                                        final AdminToolsUiState adminToolsUiState7 = adminToolsUiState;
                                        final AdminToolsViewModel adminToolsViewModel10 = adminToolsViewModel;
                                        ATCreateAndEditPatternBlockKt.ATCreateAndEditPatternBlock(null, templateTitle, null, null, str, strStringResource, strStringResource2, strStringResource3, cArr3, 0, 0, timeRange, function1, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.13
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
                                                if (IntExtensionKt.isNotZero(Integer.valueOf(adminToolsUiState7.getCategoryId()))) {
                                                    adminToolsViewModel10.selectTypeScreen(7);
                                                } else {
                                                    adminToolsViewModel10.selectTypeScreen(6);
                                                }
                                            }
                                        }, composer2, C2732C.BUFFER_FLAG_FIRST_SAMPLE, 64, 1549);
                                        composer2.endReplaceableGroup();
                                        Unit unit8 = Unit.INSTANCE;
                                        break;
                                    default:
                                        composer2.startReplaceableGroup(-572299614);
                                        composer2.endReplaceableGroup();
                                        Unit unit9 = Unit.INSTANCE;
                                        break;
                                }
                            } else {
                                composer2.startReplaceableGroup(-572302684);
                                Integer timeTitle2 = adminToolsUiState.getTimeTitle();
                                composer2.startReplaceableGroup(-572302636);
                                String strStringResource4 = timeTitle2 == null ? null : StringResources_androidKt.stringResource(timeTitle2.intValue(), composer2, 0);
                                composer2.endReplaceableGroup();
                                String templateTitle2 = adminToolsUiState.getTemplateTitle();
                                ATTemplateModel currentTemplate2 = adminToolsUiState.getCurrentTemplate();
                                String templateTitle3 = currentTemplate2 != null ? currentTemplate2.getTemplateTitle() : null;
                                String str2 = templateTitle3 == null ? "" : templateTitle3;
                                ATTemplateModel currentTemplate3 = adminToolsUiState.getCurrentTemplate();
                                String templateDesc = currentTemplate3 != null ? currentTemplate3.getTemplateDesc() : null;
                                String str3 = templateDesc != null ? templateDesc : "";
                                ATTemplateModel currentTemplate4 = adminToolsUiState.getCurrentTemplate();
                                String strValueOf = String.valueOf(IntExtensionKt.getOrZero(currentTemplate4 != null ? currentTemplate4.getTemplateTime() : null));
                                String strStringResource5 = StringResources_androidKt.stringResource(R.string.common_save, composer2, 6);
                                String strStringResource6 = StringResources_androidKt.stringResource(R.string.common_back, composer2, 6);
                                IntRange timeRange2 = adminToolsUiState.getTimeRange();
                                char[] cArr4 = charArray;
                                final AdminToolsViewModel adminToolsViewModel11 = adminToolsViewModel;
                                final AdminToolsUiState adminToolsUiState8 = adminToolsUiState;
                                Function1<ATTemplateModel, Unit> function12 = new Function1<ATTemplateModel, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.10
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(ATTemplateModel aTTemplateModel) throws JSONException {
                                        invoke2(aTTemplateModel);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull ATTemplateModel template) throws JSONException {
                                        Intrinsics.checkNotNullParameter(template, "template");
                                        AdminToolsViewModel adminToolsViewModel12 = adminToolsViewModel11;
                                        ATTemplateModel currentTemplate5 = adminToolsUiState8.getCurrentTemplate();
                                        int orZero = IntExtensionKt.getOrZero(currentTemplate5 != null ? Integer.valueOf(currentTemplate5.getTemplateId()) : null);
                                        String templateTitle4 = template.getTemplateTitle();
                                        String templateDesc2 = template.getTemplateDesc();
                                        Integer templateTime2 = template.getTemplateTime();
                                        adminToolsViewModel12.sendTemplateEdit(orZero, templateTitle4, templateDesc2, AnyExtensionKt.isNotNull(templateTime2) ? templateTime2 : null);
                                    }
                                };
                                final AdminToolsViewModel adminToolsViewModel12 = adminToolsViewModel;
                                ATCreateAndEditPatternBlockKt.ATCreateAndEditPatternBlock(null, templateTitle2, str2, str3, strValueOf, strStringResource4, strStringResource5, strStringResource6, cArr4, 0, 0, timeRange2, function12, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.11
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
                                        adminToolsViewModel12.selectTypeScreen(8);
                                    }
                                }, composer2, C2732C.BUFFER_FLAG_FIRST_SAMPLE, 64, 1537);
                                composer2.endReplaceableGroup();
                                Unit unit10 = Unit.INSTANCE;
                            }
                        } else {
                            composer2.startReplaceableGroup(-572310538);
                            long jM11375getTransparent0d7_KjU7 = Color.INSTANCE.m11375getTransparent0d7_KjU();
                            final AdminToolsUiState adminToolsUiState9 = adminToolsUiState;
                            final char[] cArr5 = charArray;
                            final AdminToolsViewModel adminToolsViewModel13 = adminToolsViewModel;
                            final MutableIntState mutableIntState5 = mutableIntState;
                            FakeDialogKt.m15089FakeDialog3IgeMak(null, jM11375getTransparent0d7_KjU7, ComposableLambdaKt.composableLambda(composer2, 1061014372, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                public final void invoke(@Nullable Composer composer3, int i3) {
                                    if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1061014372, i3, -1, "com.blackhub.bronline.game.ui.admintools.AdminToolsGui.<anonymous>.<anonymous> (AdminToolsGui.kt:239)");
                                        }
                                        ATTemplateModel currentTemplate5 = adminToolsUiState9.getCurrentTemplate();
                                        String templateTitle4 = currentTemplate5 != null ? currentTemplate5.getTemplateTitle() : null;
                                        if (templateTitle4 == null) {
                                            templateTitle4 = "";
                                        }
                                        String strStringResource7 = StringResources_androidKt.stringResource(R.string.admin_tools_report_template_title_text, new Object[]{templateTitle4}, composer3, 70);
                                        ATTemplateModel currentTemplate6 = adminToolsUiState9.getCurrentTemplate();
                                        String templateDesc2 = currentTemplate6 != null ? currentTemplate6.getTemplateDesc() : null;
                                        String str4 = templateDesc2 != null ? templateDesc2 : "";
                                        String strStringResource8 = StringResources_androidKt.stringResource(R.string.common_send, composer3, 6);
                                        String strStringResource9 = StringResources_androidKt.stringResource(R.string.common_back, composer3, 6);
                                        char[] cArr6 = cArr5;
                                        final AdminToolsViewModel adminToolsViewModel14 = adminToolsViewModel13;
                                        final MutableIntState mutableIntState6 = mutableIntState5;
                                        Function1<String, Unit> function13 = new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.5.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(String str5) {
                                                invoke2(str5);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull String it) {
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                adminToolsViewModel14.sendReportTableButton(AdminToolsGuiKt.AdminToolsGui$lambda$1(mutableIntState6));
                                            }
                                        };
                                        final AdminToolsViewModel adminToolsViewModel15 = adminToolsViewModel13;
                                        AnswerWithTextFieldAndTwoButtonsBlockKt.AnswerWithTextFieldAndTwoButtonsBlock(null, strStringResource7, str4, null, strStringResource8, strStringResource9, cArr6, true, function13, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.1.5.2
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
                                                adminToolsViewModel15.selectTypeScreen(4);
                                            }
                                        }, null, composer3, 14683136, 0, 1025);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, 432, 1);
                            composer2.endReplaceableGroup();
                            Unit unit11 = Unit.INSTANCE;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.AdminToolsGui.2
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
                    AdminToolsGuiKt.AdminToolsGui(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaSmallPreview
    public static final void PreviewAdminToolsGui(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1420983830);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1420983830, i, -1, "com.blackhub.bronline.game.ui.admintools.PreviewAdminToolsGui (AdminToolsGui.kt:461)");
            }
            AdminToolsGui(composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.AdminToolsGuiKt.PreviewAdminToolsGui.1
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
                    AdminToolsGuiKt.PreviewAdminToolsGui(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final int AdminToolsGui$lambda$1(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    public static final void AdminToolsGui$lambda$2(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
    }
}

