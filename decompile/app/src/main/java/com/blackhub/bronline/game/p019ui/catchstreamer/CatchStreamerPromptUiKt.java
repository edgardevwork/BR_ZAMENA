package com.blackhub.bronline.game.p019ui.catchstreamer;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
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
import androidx.recyclerview.widget.FastScroller;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.LeftCornerBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonFillKt;
import com.blackhub.bronline.game.theme.ThemeKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CatchStreamerPromptUi.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a3\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0007\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f¨\u0006\u000f"}, m7105d2 = {"CatchStreamerPromptUi", "", "modifier", "Landroidx/compose/ui/Modifier;", "isActivatedClick", "Lkotlin/Function0;", "isClosedClick", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "viewModel", "Lcom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel;", "(Landroidx/compose/ui/Modifier;Lcom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel;Landroidx/compose/runtime/Composer;II)V", "PreviewPhone", "(Landroidx/compose/runtime/Composer;I)V", "PreviewTable", "PreviewTable11", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCatchStreamerPromptUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatchStreamerPromptUi.kt\ncom/blackhub/bronline/game/ui/catchstreamer/CatchStreamerPromptUiKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,153:1\n67#2,7:154\n74#2:189\n78#2:194\n79#3,11:161\n92#3:193\n456#4,8:172\n464#4,3:186\n467#4,3:190\n3737#5,6:180\n*S KotlinDebug\n*F\n+ 1 CatchStreamerPromptUi.kt\ncom/blackhub/bronline/game/ui/catchstreamer/CatchStreamerPromptUiKt\n*L\n54#1:154,7\n54#1:189\n54#1:194\n54#1:161,11\n54#1:193\n54#1:172,8\n54#1:186,3\n54#1:190,3\n54#1:180,6\n*E\n"})
/* loaded from: classes2.dex */
public final class CatchStreamerPromptUiKt {

    /* compiled from: CatchStreamerPromptUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerPromptUiKt$CatchStreamerPromptUi$3 */
    /* loaded from: classes.dex */
    public static final class C52813 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ CatchStreamerViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C52813(CatchStreamerViewModel catchStreamerViewModel, int i, int i2) {
            super(2);
            catchStreamerViewModel = catchStreamerViewModel;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CatchStreamerPromptUiKt.CatchStreamerPromptUi(modifier, catchStreamerViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: CatchStreamerPromptUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerPromptUiKt$CatchStreamerPromptUi$5 */
    /* loaded from: classes.dex */
    public static final class C52825 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<Unit> $isActivatedClick;
        public final /* synthetic */ Function0<Unit> $isClosedClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C52825(Function0<Unit> function0, Function0<Unit> function02, int i, int i2) {
            super(2);
            function0 = function0;
            function0 = function02;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CatchStreamerPromptUiKt.CatchStreamerPromptUi(modifier, function0, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: CatchStreamerPromptUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerPromptUiKt$PreviewPhone$1 */
    /* loaded from: classes.dex */
    public static final class C52831 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C52831(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CatchStreamerPromptUiKt.PreviewPhone(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: CatchStreamerPromptUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerPromptUiKt$PreviewTable$1 */
    /* loaded from: classes.dex */
    public static final class C52841 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C52841(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CatchStreamerPromptUiKt.PreviewTable(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: CatchStreamerPromptUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerPromptUiKt$PreviewTable11$1 */
    /* loaded from: classes.dex */
    public static final class C52851 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C52851(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CatchStreamerPromptUiKt.PreviewTable11(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: CatchStreamerPromptUi.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerPromptUiKt$CatchStreamerPromptUi$1 */
    /* loaded from: classes.dex */
    public static final class C52791 extends Lambda implements Function0<Unit> {
        public C52791() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            catchStreamerViewModel.isParticipate(1);
        }
    }

    /* compiled from: CatchStreamerPromptUi.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerPromptUiKt$CatchStreamerPromptUi$2 */
    /* loaded from: classes.dex */
    public static final class C52802 extends Lambda implements Function0<Unit> {
        public C52802() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            catchStreamerViewModel.isParticipate(0);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CatchStreamerPromptUi(@Nullable Modifier modifier, @NotNull CatchStreamerViewModel viewModel, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(2099446885);
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2099446885, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerPromptUi (CatchStreamerPromptUi.kt:39)");
        }
        CatchStreamerPromptUi(modifier, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerPromptUiKt.CatchStreamerPromptUi.1
            public C52791() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                catchStreamerViewModel.isParticipate(1);
            }
        }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerPromptUiKt.CatchStreamerPromptUi.2
            public C52802() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                catchStreamerViewModel.isParticipate(0);
            }
        }, composerStartRestartGroup, i & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerPromptUiKt.CatchStreamerPromptUi.3
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $$default;
                public final /* synthetic */ CatchStreamerViewModel $viewModel;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C52813(CatchStreamerViewModel viewModel2, int i3, int i22) {
                    super(2);
                    catchStreamerViewModel = viewModel2;
                    i = i3;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    CatchStreamerPromptUiKt.CatchStreamerPromptUi(modifier, catchStreamerViewModel, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CatchStreamerPromptUi(Modifier modifier, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1380098939);
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
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1380098939, i3, -1, "com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerPromptUi (CatchStreamerPromptUi.kt:52)");
            }
            Alignment topEnd = Alignment.INSTANCE.getTopEnd();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topEnd, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            LeftCornerBlockKt.LeftCornerBlock(PaddingKt.m8127paddingqDBjuR0$default(SizeKt.wrapContentSize$default(modifier3, null, false, 3, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._49sdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1837877670, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerPromptUiKt$CatchStreamerPromptUi$4$1
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
                            ComposerKt.traceEventStart(1837877670, i5, -1, "com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerPromptUi.<anonymous>.<anonymous> (CatchStreamerPromptUi.kt:61)");
                        }
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierM8124paddingVpY3zN4 = PaddingKt.m8124paddingVpY3zN4(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._9sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer2, 6));
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_4 = arrangement.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer2, 6));
                        final Function0<Unit> function03 = function0;
                        final Function0<Unit> function04 = function02;
                        composer2.startReplaceableGroup(-483455358);
                        Alignment.Companion companion4 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM8032spacedBy0680j_4, companion4.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8124paddingVpY3zN4);
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
                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        AnnotatedString catchStreamerPromptTitle = StringResourceCompose.INSTANCE.getCatchStreamerPromptTitle(composer2, 6);
                        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                        TextKt.m10025TextIbK3jfQ(catchStreamerPromptTitle, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14850montserratSemiBold12spOr9ssp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15), composer2, 0, 0, 131070);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_42 = arrangement.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer2, 6));
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM8032spacedBy0680j_42, companion4.getTop(), composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion3);
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
                        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        String strStringResource = StringResources_androidKt.stringResource(R.string.common_activate, composer2, 6);
                        TextStyle textStyleM14787montserratBold10spOr8ssp67j0QOw = typographyStyle.m14787montserratBold10spOr8ssp67j0QOw(0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 13);
                        long jColorResource = ColorResources_androidKt.colorResource(R.color.red, composer2, 6);
                        composer2.startReplaceableGroup(-1080356793);
                        boolean zChanged = composer2.changed(function03);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerPromptUiKt$CatchStreamerPromptUi$4$1$1$1$1$1
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
                                    function03.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        MainButtonFillKt.m15075MainButtonFilljAZ_Pg4(companion3, strStringResource, textStyleM14787montserratBold10spOr8ssp67j0QOw, jColorResource, 0.0f, 0.0f, false, false, false, (Function0) objRememberedValue, composer2, 6, 496);
                        Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(companion3, ColorResources_androidKt.colorResource(R.color.dark_gray_blue, composer2, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer2, 6)));
                        composer2.startReplaceableGroup(-1080356313);
                        boolean zChanged2 = composer2.changed(function04);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerPromptUiKt$CatchStreamerPromptUi$4$1$1$1$2$1
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
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM7770backgroundbw27NRU, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue2, ComposableSingletons$CatchStreamerPromptUiKt.INSTANCE.m14939getLambda1$app_siteRelease(), composer2, 0, 3072, 4094);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.catch_streamer_recognized_as_foreign_agent, composer2, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14840montserratMedium7spOr5ssp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15), composer2, 0, 0, 65534);
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
            }), composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerPromptUiKt.CatchStreamerPromptUi.5
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $$default;
                public final /* synthetic */ Function0<Unit> $isActivatedClick;
                public final /* synthetic */ Function0<Unit> $isClosedClick;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C52825(final Function0<Unit> function03, final Function0<Unit> function022, int i5, int i22) {
                    super(2);
                    function0 = function03;
                    function0 = function022;
                    i = i5;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i5) {
                    CatchStreamerPromptUiKt.CatchStreamerPromptUi(modifier, function0, function0, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 31, heightDp = HttpStatus.SC_LENGTH_REQUIRED, name = "CatchStreamerPromptUi Phone", widthDp = 914)
    public static final void PreviewPhone(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1756070836);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1756070836, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewPhone (CatchStreamerPromptUi.kt:116)");
            }
            ThemeKt.BRTheme(false, false, ComposableSingletons$CatchStreamerPromptUiKt.INSTANCE.m14940getLambda2$app_siteRelease(), composerStartRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerPromptUiKt.PreviewPhone.1
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C52831(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CatchStreamerPromptUiKt.PreviewPhone(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 28, heightDp = 744, name = "CatchStreamerPromptUi Table", widthDp = 1133)
    public static final void PreviewTable(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1658292908);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1658292908, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewTable (CatchStreamerPromptUi.kt:131)");
            }
            ThemeKt.BRTheme(false, false, ComposableSingletons$CatchStreamerPromptUiKt.INSTANCE.m14941getLambda3$app_siteRelease(), composerStartRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerPromptUiKt.PreviewTable.1
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C52841(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CatchStreamerPromptUiKt.PreviewTable(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 28, heightDp = FastScroller.HIDE_DELAY_AFTER_DRAGGING_MS, name = "CatchStreamerPromptUi Table 11", widthDp = 2000)
    public static final void PreviewTable11(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1913613260);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1913613260, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewTable11 (CatchStreamerPromptUi.kt:146)");
            }
            ThemeKt.BRTheme(false, false, ComposableSingletons$CatchStreamerPromptUiKt.INSTANCE.m14942getLambda4$app_siteRelease(), composerStartRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerPromptUiKt.PreviewTable11.1
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C52851(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CatchStreamerPromptUiKt.PreviewTable11(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
