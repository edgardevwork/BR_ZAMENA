package com.blackhub.bronline.game.p019ui.blackpass.uiblock;

import android.graphics.Bitmap;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.gui.blackpass.enums.VIPStateEnum;
import com.blackhub.bronline.game.p019ui.widget.block.item.CommonCategoryItemKt;
import com.blackhub.bronline.game.p019ui.widget.button.ButtonWithLineKt;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassCategoryItem.kt */
@SourceDebugExtension({"SMAP\nBlackPassCategoryItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassCategoryItem.kt\ncom/blackhub/bronline/game/ui/blackpass/uiblock/BlackPassCategoryItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,134:1\n1116#2,6:135\n1116#2,6:141\n81#3:147\n81#3:148\n*S KotlinDebug\n*F\n+ 1 BlackPassCategoryItem.kt\ncom/blackhub/bronline/game/ui/blackpass/uiblock/BlackPassCategoryItemKt\n*L\n49#1:135,6\n59#1:141,6\n49#1:147\n59#1:148\n*E\n"})
/* loaded from: classes.dex */
public final class BlackPassCategoryItemKt {
    public static final float SHADOW_BLUR_FOR_TEXT = 8.1f;

    /* compiled from: BlackPassCategoryItem.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassCategoryItemKt$PreviewBlackPassCategoryItem$2 */
    /* loaded from: classes3.dex */
    public static final class C49312 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49312(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            BlackPassCategoryItemKt.PreviewBlackPassCategoryItem(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: BlackPassCategoryItem-ZPw9REg */
    public static final void m14898BlackPassCategoryItemZPw9REg(final long j, @Nullable final Bitmap bitmap, @NotNull final VIPStateEnum vipState, final boolean z, final boolean z2, @Nullable Function0<Unit> function0, @Nullable Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(vipState, "vipState");
        Composer composerStartRestartGroup = composer.startRestartGroup(946360794);
        Function0<Unit> function02 = (i2 & 32) != 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassCategoryItemKt$BlackPassCategoryItem$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(946360794, i, -1, "com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassCategoryItem (BlackPassCategoryItem.kt:47)");
        }
        composerStartRestartGroup.startReplaceableGroup(1130308859);
        int i3 = (i & 896) ^ 384;
        int i4 = (i & 7168) ^ 3072;
        boolean z3 = ((i3 > 256 && composerStartRestartGroup.changed(vipState)) || (i & 384) == 256) | ((i4 > 2048 && composerStartRestartGroup.changed(z)) || (i & 3072) == 2048);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<String>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassCategoryItemKt$BlackPassCategoryItem$categoryName$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    if (z) {
                        return VIPStateEnum.STANDARD.getVipName();
                    }
                    VIPStateEnum vIPStateEnum = vipState;
                    return vIPStateEnum == VIPStateEnum.STANDARD ? VIPStateEnum.PREMIUM.getVipName() : vIPStateEnum.getVipName();
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final State state = (State) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1130309205);
        boolean z4 = ((i3 > 256 && composerStartRestartGroup.changed(vipState)) || (i & 384) == 256) | ((i4 > 2048 && composerStartRestartGroup.changed(z)) || (i & 3072) == 2048);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassCategoryItemKt$BlackPassCategoryItem$isNeedToShowButton$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() {
                    VIPStateEnum vIPStateEnum = vipState;
                    return Boolean.valueOf((vIPStateEnum == VIPStateEnum.NONE || vIPStateEnum == VIPStateEnum.PREMIUM_DELUXE || z) ? false : true);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        final State state2 = (State) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        final Function0<Unit> function03 = function02;
        CommonCategoryItemKt.m15054CommonCategoryItemKsQRdP4(null, j, bitmap, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -143307188, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassCategoryItemKt$BlackPassCategoryItem$2
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
                        ComposerKt.traceEventStart(-143307188, i5, -1, "com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassCategoryItem.<anonymous> (BlackPassCategoryItem.kt:68)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    boolean z5 = z2;
                    State<String> state3 = state;
                    State<Boolean> state4 = state2;
                    final VIPStateEnum vIPStateEnum = vipState;
                    final Function0<Unit> function04 = function03;
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
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
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextKt.m10024Text4IGK_g(BlackPassCategoryItemKt.BlackPassCategoryItem_ZPw9REg$lambda$1(state3), PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._16wdp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 8.1f, null, composer2, 1597446, 42), composer2, 0, 0, 65532);
                    ComposeExtensionKt.IfTrue(Boolean.valueOf(z5), ComposableSingletons$BlackPassCategoryItemKt.INSTANCE.m14900getLambda1$app_siteRelease(), composer2, 48);
                    ComposeExtensionKt.IfTrue(Boolean.valueOf(BlackPassCategoryItemKt.BlackPassCategoryItem_ZPw9REg$lambda$3(state4)), ComposableLambdaKt.composableLambda(composer2, 2026928679, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassCategoryItemKt$BlackPassCategoryItem$2$1$1
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
                        public final void invoke(@Nullable Composer composer3, int i6) {
                            if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2026928679, i6, -1, "com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassCategoryItem.<anonymous>.<anonymous>.<anonymous> (BlackPassCategoryItem.kt:108)");
                                }
                                ButtonWithLineKt.ButtonWithLine(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._97wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer3, 6)), R.color.dark_medium_green, 0, R.dimen._9wsp, StringResourceCompose.INSTANCE.blackPassCategoryButtonText(vIPStateEnum, composer3, 48), false, 0, 0.0f, function04, composer3, 3120, 228);
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
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, ((i << 3) & 112) | 197120, 25);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0<Unit> function04 = function02;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassCategoryItemKt$BlackPassCategoryItem$3
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
                    BlackPassCategoryItemKt.m14898BlackPassCategoryItemZPw9REg(j, bitmap, vipState, z, z2, function04, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* compiled from: BlackPassCategoryItem.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassCategoryItemKt$PreviewBlackPassCategoryItem$1 */
    /* loaded from: classes3.dex */
    public static final class C49301 extends Lambda implements Function0<Unit> {
        public static final C49301 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "BlackPassCategoryItem")
    public static final void PreviewBlackPassCategoryItem(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1175232497);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1175232497, i, -1, "com.blackhub.bronline.game.ui.blackpass.uiblock.PreviewBlackPassCategoryItem (BlackPassCategoryItem.kt:124)");
            }
            m14898BlackPassCategoryItemZPw9REg(ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6), null, VIPStateEnum.PREMIUM_DELUXE, false, true, C49301.INSTANCE, composerStartRestartGroup, 224688, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassCategoryItemKt.PreviewBlackPassCategoryItem.2
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C49312(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    BlackPassCategoryItemKt.PreviewBlackPassCategoryItem(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final String BlackPassCategoryItem_ZPw9REg$lambda$1(State<String> state) {
        return state.getValue();
    }

    public static final boolean BlackPassCategoryItem_ZPw9REg$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}

