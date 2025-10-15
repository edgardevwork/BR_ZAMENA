package com.blackhub.bronline.game.p019ui.gifts;

import androidx.annotation.DrawableRes;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextStyle;
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
import androidx.media3.extractor.mkv.MatroskaExtractor;
import com.blackhub.bronline.game.common.resources.ColorResourceCompose;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.gui.gifts.model.GiftsPreviewItemModel;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GiftsOpenPrizesUI.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a_\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0007¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0014\u001a]\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0007¢\u0006\u0002\u0010\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m7105d2 = {"FILL_MAX_SIZE_FOR_BUTTON_GET", "", "HEIGHT_FOR_BUTTON_GET_BLOCK", "WIDTH_FOR_BUTTON_GET_BLOCK", "GiftsOpenPrizesContent", "", "firstGift", "Lcom/blackhub/bronline/game/gui/gifts/model/GiftsPreviewItemModel;", "secondGift", "giftImageRes", "", "isStandard", "", "isSecondGiftVisible", "isButtonGetVisible", "onFlipClick", "Lkotlin/Function0;", "onButtonGetClick", "(Lcom/blackhub/bronline/game/gui/gifts/model/GiftsPreviewItemModel;Lcom/blackhub/bronline/game/gui/gifts/model/GiftsPreviewItemModel;IZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "GiftsOpenPrizesContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "GiftsOpenPrizesUI", "(Lcom/blackhub/bronline/game/gui/gifts/model/GiftsPreviewItemModel;Lcom/blackhub/bronline/game/gui/gifts/model/GiftsPreviewItemModel;IZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class GiftsOpenPrizesUIKt {
    public static final float FILL_MAX_SIZE_FOR_BUTTON_GET = 0.7f;
    public static final float HEIGHT_FOR_BUTTON_GET_BLOCK = 0.5f;
    public static final float WIDTH_FOR_BUTTON_GET_BLOCK = 0.3f;

    /* compiled from: GiftsOpenPrizesUI.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizesUIKt$GiftsOpenPrizesContent$2 */
    /* loaded from: classes.dex */
    public static final class C56102 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $giftImageRes;
        public final /* synthetic */ boolean $isButtonGetVisible;
        public final /* synthetic */ boolean $isSecondGiftVisible;
        public final /* synthetic */ boolean $isStandard;
        public final /* synthetic */ Function0<Unit> $onButtonGetClick;
        public final /* synthetic */ Function0<Unit> $onFlipClick;
        public final /* synthetic */ GiftsPreviewItemModel $secondGift;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C56102(GiftsPreviewItemModel giftsPreviewItemModel, int i, boolean z, boolean z2, boolean z3, Function0<Unit> function0, Function0<Unit> function02, int i2, int i3) {
            super(2);
            giftsPreviewItemModel = giftsPreviewItemModel;
            i = i;
            z = z;
            z = z2;
            z = z3;
            function0 = function0;
            function0 = function02;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            GiftsOpenPrizesUIKt.GiftsOpenPrizesContent(giftsPreviewItemModel, giftsPreviewItemModel, i, z, z, z, function0, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: GiftsOpenPrizesUI.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizesUIKt$GiftsOpenPrizesContentPreview$3 */
    /* loaded from: classes.dex */
    public static final class C56133 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C56133(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            GiftsOpenPrizesUIKt.GiftsOpenPrizesContentPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: GiftsOpenPrizesUI.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizesUIKt$GiftsOpenPrizesUI$1 */
    /* loaded from: classes.dex */
    public static final class C56141 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $giftImageRes;
        public final /* synthetic */ boolean $isButtonGetVisible;
        public final /* synthetic */ boolean $isSecondGiftVisible;
        public final /* synthetic */ boolean $isStandard;
        public final /* synthetic */ Function0<Unit> $onButtonGetClick;
        public final /* synthetic */ Function0<Unit> $onFlipClick;
        public final /* synthetic */ GiftsPreviewItemModel $secondGift;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C56141(GiftsPreviewItemModel giftsPreviewItemModel, int i, boolean z, boolean z2, boolean z3, Function0<Unit> function0, Function0<Unit> function02, int i2) {
            super(2);
            giftsPreviewItemModel = giftsPreviewItemModel;
            i = i;
            z = z;
            z = z2;
            z = z3;
            function0 = function0;
            function0 = function02;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            GiftsOpenPrizesUIKt.GiftsOpenPrizesUI(giftsPreviewItemModel, giftsPreviewItemModel, i, z, z, z, function0, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void GiftsOpenPrizesUI(@NotNull GiftsPreviewItemModel firstGift, @Nullable GiftsPreviewItemModel giftsPreviewItemModel, @DrawableRes int i, boolean z, boolean z2, boolean z3, @NotNull Function0<Unit> onFlipClick, @NotNull Function0<Unit> onButtonGetClick, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(firstGift, "firstGift");
        Intrinsics.checkNotNullParameter(onFlipClick, "onFlipClick");
        Intrinsics.checkNotNullParameter(onButtonGetClick, "onButtonGetClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1713389320);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1713389320, i2, -1, "com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizesUI (GiftsOpenPrizesUI.kt:45)");
        }
        GiftsOpenPrizesContent(firstGift, giftsPreviewItemModel, i, z, z2, z3, onFlipClick, onButtonGetClick, composerStartRestartGroup, (i2 & 896) | 72 | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (29360128 & i2), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizesUIKt.GiftsOpenPrizesUI.1
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $giftImageRes;
                public final /* synthetic */ boolean $isButtonGetVisible;
                public final /* synthetic */ boolean $isSecondGiftVisible;
                public final /* synthetic */ boolean $isStandard;
                public final /* synthetic */ Function0<Unit> $onButtonGetClick;
                public final /* synthetic */ Function0<Unit> $onFlipClick;
                public final /* synthetic */ GiftsPreviewItemModel $secondGift;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C56141(GiftsPreviewItemModel giftsPreviewItemModel2, int i3, boolean z4, boolean z22, boolean z32, Function0<Unit> onFlipClick2, Function0<Unit> onButtonGetClick2, int i22) {
                    super(2);
                    giftsPreviewItemModel = giftsPreviewItemModel2;
                    i = i3;
                    z = z4;
                    z = z22;
                    z = z32;
                    function0 = onFlipClick2;
                    function0 = onButtonGetClick2;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    GiftsOpenPrizesUIKt.GiftsOpenPrizesUI(giftsPreviewItemModel, giftsPreviewItemModel, i, z, z, z, function0, function0, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: GiftsOpenPrizesUI.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nGiftsOpenPrizesUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftsOpenPrizesUI.kt\ncom/blackhub/bronline/game/ui/gifts/GiftsOpenPrizesUIKt$GiftsOpenPrizesContent$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,160:1\n67#2,7:161\n74#2:196\n69#2,5:281\n74#2:314\n78#2:325\n78#2:335\n79#3,11:168\n79#3,11:211\n79#3,11:247\n92#3:279\n79#3,11:286\n92#3:324\n92#3:329\n92#3:334\n456#4,8:179\n464#4,3:193\n456#4,8:222\n464#4,3:236\n456#4,8:258\n464#4,3:272\n467#4,3:276\n456#4,8:297\n464#4,3:311\n467#4,3:321\n467#4,3:326\n467#4,3:331\n3737#5,6:187\n3737#5,6:230\n3737#5,6:266\n3737#5,6:305\n1116#6,6:197\n1116#6,6:203\n1116#6,6:315\n78#7,2:209\n80#7:239\n84#7:330\n86#8,7:240\n93#8:275\n97#8:280\n*S KotlinDebug\n*F\n+ 1 GiftsOpenPrizesUI.kt\ncom/blackhub/bronline/game/ui/gifts/GiftsOpenPrizesUIKt$GiftsOpenPrizesContent$1\n*L\n71#1:161,7\n71#1:196\n113#1:281,5\n113#1:314\n113#1:325\n71#1:335\n71#1:168,11\n76#1:211,11\n87#1:247,11\n87#1:279\n113#1:286,11\n113#1:324\n76#1:329\n71#1:334\n71#1:179,8\n71#1:193,3\n76#1:222,8\n76#1:236,3\n87#1:258,8\n87#1:272,3\n87#1:276,3\n113#1:297,8\n113#1:311,3\n113#1:321,3\n76#1:326,3\n71#1:331,3\n71#1:187,6\n76#1:230,6\n87#1:266,6\n113#1:305,6\n74#1:197,6\n83#1:203,6\n131#1:315,6\n76#1:209,2\n76#1:239\n76#1:330\n87#1:240,7\n87#1:275\n87#1:280\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizesUIKt$GiftsOpenPrizesContent$1 */
    /* loaded from: classes.dex */
    public static final class C56091 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ GiftsPreviewItemModel $firstGift;
        public final /* synthetic */ int $giftImageRes;
        public final /* synthetic */ boolean $isButtonGetVisible;
        public final /* synthetic */ boolean $isSecondGiftVisible;
        public final /* synthetic */ boolean $isStandard;
        public final /* synthetic */ Function0<Unit> $onButtonGetClick;
        public final /* synthetic */ Function0<Unit> $onFlipClick;
        public final /* synthetic */ GiftsPreviewItemModel $secondGift;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C56091(boolean z, Function0<Unit> function0, GiftsPreviewItemModel giftsPreviewItemModel, boolean z2, int i, Function0<Unit> function02, boolean z3, GiftsPreviewItemModel giftsPreviewItemModel2) {
            super(2);
            z = z;
            function0 = function0;
            giftsPreviewItemModel = giftsPreviewItemModel;
            z = z2;
            i = i;
            function0 = function02;
            z = z3;
            giftsPreviewItemModel = giftsPreviewItemModel2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            String strEmpty;
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1048984879, i, -1, "com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizesContent.<anonymous> (GiftsOpenPrizesUI.kt:70)");
                }
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment center = companion.getCenter();
                boolean z = z;
                final Function0<Unit> function0 = function0;
                GiftsPreviewItemModel giftsPreviewItemModel = giftsPreviewItemModel;
                boolean z2 = z;
                int i2 = i;
                Function0<Unit> function02 = function0;
                boolean z3 = z;
                GiftsPreviewItemModel giftsPreviewItemModel2 = giftsPreviewItemModel;
                composer.startReplaceableGroup(733328855);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer.startReplaceableGroup(1415264854);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion4 = Composer.INSTANCE;
                if (objRememberedValue == companion4.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(objRememberedValue);
                }
                MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                composer.endReplaceableGroup();
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null);
                composer.startReplaceableGroup(1415265201);
                boolean zChanged = composer.changed(function0);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == companion4.getEmpty()) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizesUIKt$GiftsOpenPrizesContent$1$1$1$1
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
                            function0.invoke();
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Modifier modifierM7803clickableO2vRcR0$default = ClickableKt.m7803clickableO2vRcR0$default(modifierFillMaxHeight$default, mutableInteractionSource, null, z, null, null, (Function0) objRememberedValue2, 24, null);
                Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical bottom = arrangement.getBottom();
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(bottom, centerHorizontally, composer, 54);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7803clickableO2vRcR0$default);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer);
                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Arrangement.HorizontalOrVertical spaceEvenly = arrangement.getSpaceEvenly();
                composer.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, companion.getTop(), composer, 6);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion2);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer);
                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                GiftsOpenPrizeBlockUIKt.GiftsOpenPrizeBlockUI(null, giftsPreviewItemModel.getPrizeName(), z2, null, i2, giftsPreviewItemModel.getImageId(), giftsPreviewItemModel.getPrizeImage(), z, function02, function0, composer, 2097152, 9);
                composer.startReplaceableGroup(-414151681);
                if (z3) {
                    if (giftsPreviewItemModel2 == null || (strEmpty = giftsPreviewItemModel2.getPrizeName()) == null) {
                        strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                    }
                    GiftsOpenPrizeBlockUIKt.GiftsOpenPrizeBlockUI(null, strEmpty, z2, null, i2, IntExtensionKt.getOrZero(giftsPreviewItemModel2 != null ? Integer.valueOf(giftsPreviewItemModel2.getImageId()) : null), giftsPreviewItemModel2 != null ? giftsPreviewItemModel2.getPrizeImage() : null, z, function02, function0, composer, 2097152, 9);
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(SizeKt.fillMaxHeight(companion2, 0.5f), 0.3f);
                Alignment center2 = companion.getCenter();
                composer.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer, 6);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor4);
                } else {
                    composer.useNode();
                }
                Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer);
                Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                composer.startReplaceableGroup(-414150732);
                if (z) {
                    Modifier modifierFillMaxSize = SizeKt.fillMaxSize(companion2, 0.7f);
                    String strStringResource = StringResources_androidKt.stringResource(R.string.common_take, composer, 6);
                    TextStyle textStyleM14792montserratBold13spOr10ssp67j0QOw = TypographyStyle.INSTANCE.m14792montserratBold13spOr10ssp67j0QOw(0L, 0, Offset.INSTANCE.m11115getZeroF1C5BW0(), 0.0f, composer, MatroskaExtractor.ID_CONTENT_ENCODINGS, 3);
                    long jM14394getGiftsPurchaseGiftButtonBgColorXeAY9LY = ColorResourceCompose.INSTANCE.m14394getGiftsPurchaseGiftButtonBgColorXeAY9LY(z2, composer, 48);
                    composer.startReplaceableGroup(-627165685);
                    boolean zChanged2 = composer.changed(function0);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == companion4.getEmpty()) {
                        objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizesUIKt$GiftsOpenPrizesContent$1$1$2$2$1$1
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
                                function0.invoke();
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceableGroup();
                    MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierFillMaxSize, null, strStringResource, textStyleM14792montserratBold13spOr10ssp67j0QOw, 0.0f, 0, null, null, null, 0.0f, jM14394getGiftsPurchaseGiftButtonBgColorXeAY9LY, 0.0f, null, null, null, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue3, composer, 6, 0, 0, 16776178);
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void GiftsOpenPrizesContent(@NotNull GiftsPreviewItemModel firstGift, @Nullable GiftsPreviewItemModel giftsPreviewItemModel, @DrawableRes int i, boolean z, boolean z2, boolean z3, @NotNull Function0<Unit> onFlipClick, @NotNull Function0<Unit> onButtonGetClick, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(firstGift, "firstGift");
        Intrinsics.checkNotNullParameter(onFlipClick, "onFlipClick");
        Intrinsics.checkNotNullParameter(onButtonGetClick, "onButtonGetClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(2035252387);
        GiftsPreviewItemModel giftsPreviewItemModel2 = (i3 & 2) != 0 ? null : giftsPreviewItemModel;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2035252387, i2, -1, "com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizesContent (GiftsOpenPrizesUI.kt:68)");
        }
        FakeDialogKt.m15089FakeDialog3IgeMak(null, ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1048984879, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizesUIKt.GiftsOpenPrizesContent.1
            public final /* synthetic */ GiftsPreviewItemModel $firstGift;
            public final /* synthetic */ int $giftImageRes;
            public final /* synthetic */ boolean $isButtonGetVisible;
            public final /* synthetic */ boolean $isSecondGiftVisible;
            public final /* synthetic */ boolean $isStandard;
            public final /* synthetic */ Function0<Unit> $onButtonGetClick;
            public final /* synthetic */ Function0<Unit> $onFlipClick;
            public final /* synthetic */ GiftsPreviewItemModel $secondGift;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C56091(boolean z32, Function0<Unit> onButtonGetClick2, GiftsPreviewItemModel firstGift2, boolean z4, int i4, Function0<Unit> onFlipClick2, boolean z22, GiftsPreviewItemModel giftsPreviewItemModel22) {
                super(2);
                z = z32;
                function0 = onButtonGetClick2;
                giftsPreviewItemModel = firstGift2;
                z = z4;
                i = i4;
                function0 = onFlipClick2;
                z = z22;
                giftsPreviewItemModel = giftsPreviewItemModel22;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer2, int i4) {
                String strEmpty;
                if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1048984879, i4, -1, "com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizesContent.<anonymous> (GiftsOpenPrizesUI.kt:70)");
                    }
                    Alignment.Companion companion = Alignment.INSTANCE;
                    Alignment center = companion.getCenter();
                    boolean z4 = z;
                    final Function0<Unit> function0 = function0;
                    GiftsPreviewItemModel giftsPreviewItemModel3 = giftsPreviewItemModel;
                    boolean z22 = z;
                    int i22 = i;
                    Function0<Unit> function02 = function0;
                    boolean z32 = z;
                    GiftsPreviewItemModel giftsPreviewItemModel22 = giftsPreviewItemModel;
                    composer2.startReplaceableGroup(733328855);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
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
                    composer2.startReplaceableGroup(1415264854);
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion4 = Composer.INSTANCE;
                    if (objRememberedValue == companion4.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composer2.endReplaceableGroup();
                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null);
                    composer2.startReplaceableGroup(1415265201);
                    boolean zChanged = composer2.changed(function0);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion4.getEmpty()) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizesUIKt$GiftsOpenPrizesContent$1$1$1$1
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
                                function0.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierM7803clickableO2vRcR0$default = ClickableKt.m7803clickableO2vRcR0$default(modifierFillMaxHeight$default, mutableInteractionSource, null, z4, null, null, (Function0) objRememberedValue2, 24, null);
                    Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical bottom = arrangement.getBottom();
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(bottom, centerHorizontally, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7803clickableO2vRcR0$default);
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
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Arrangement.HorizontalOrVertical spaceEvenly = arrangement.getSpaceEvenly();
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, companion.getTop(), composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion2);
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
                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    GiftsOpenPrizeBlockUIKt.GiftsOpenPrizeBlockUI(null, giftsPreviewItemModel3.getPrizeName(), z22, null, i22, giftsPreviewItemModel3.getImageId(), giftsPreviewItemModel3.getPrizeImage(), z4, function02, function0, composer2, 2097152, 9);
                    composer2.startReplaceableGroup(-414151681);
                    if (z32) {
                        if (giftsPreviewItemModel22 == null || (strEmpty = giftsPreviewItemModel22.getPrizeName()) == null) {
                            strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                        }
                        GiftsOpenPrizeBlockUIKt.GiftsOpenPrizeBlockUI(null, strEmpty, z22, null, i22, IntExtensionKt.getOrZero(giftsPreviewItemModel22 != null ? Integer.valueOf(giftsPreviewItemModel22.getImageId()) : null), giftsPreviewItemModel22 != null ? giftsPreviewItemModel22.getPrizeImage() : null, z4, function02, function0, composer2, 2097152, 9);
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(SizeKt.fillMaxHeight(companion2, 0.5f), 0.3f);
                    Alignment center2 = companion.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth);
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
                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-414150732);
                    if (z4) {
                        Modifier modifierFillMaxSize = SizeKt.fillMaxSize(companion2, 0.7f);
                        String strStringResource = StringResources_androidKt.stringResource(R.string.common_take, composer2, 6);
                        TextStyle textStyleM14792montserratBold13spOr10ssp67j0QOw = TypographyStyle.INSTANCE.m14792montserratBold13spOr10ssp67j0QOw(0L, 0, Offset.INSTANCE.m11115getZeroF1C5BW0(), 0.0f, composer2, MatroskaExtractor.ID_CONTENT_ENCODINGS, 3);
                        long jM14394getGiftsPurchaseGiftButtonBgColorXeAY9LY = ColorResourceCompose.INSTANCE.m14394getGiftsPurchaseGiftButtonBgColorXeAY9LY(z22, composer2, 48);
                        composer2.startReplaceableGroup(-627165685);
                        boolean zChanged2 = composer2.changed(function0);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == companion4.getEmpty()) {
                            objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizesUIKt$GiftsOpenPrizesContent$1$1$2$2$1$1
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
                                    function0.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierFillMaxSize, null, strStringResource, textStyleM14792montserratBold13spOr10ssp67j0QOw, 0.0f, 0, null, null, null, 0.0f, jM14394getGiftsPurchaseGiftButtonBgColorXeAY9LY, 0.0f, null, null, null, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue3, composer2, 6, 0, 0, 16776178);
                    }
                    composer2.endReplaceableGroup();
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
        }), composerStartRestartGroup, 384, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizesUIKt.GiftsOpenPrizesContent.2
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $$default;
                public final /* synthetic */ int $giftImageRes;
                public final /* synthetic */ boolean $isButtonGetVisible;
                public final /* synthetic */ boolean $isSecondGiftVisible;
                public final /* synthetic */ boolean $isStandard;
                public final /* synthetic */ Function0<Unit> $onButtonGetClick;
                public final /* synthetic */ Function0<Unit> $onFlipClick;
                public final /* synthetic */ GiftsPreviewItemModel $secondGift;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C56102(GiftsPreviewItemModel giftsPreviewItemModel22, int i4, boolean z4, boolean z22, boolean z32, Function0<Unit> onFlipClick2, Function0<Unit> onButtonGetClick2, int i22, int i32) {
                    super(2);
                    giftsPreviewItemModel = giftsPreviewItemModel22;
                    i = i4;
                    z = z4;
                    z = z22;
                    z = z32;
                    function0 = onFlipClick2;
                    function0 = onButtonGetClick2;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i4) {
                    GiftsOpenPrizesUIKt.GiftsOpenPrizesContent(giftsPreviewItemModel, giftsPreviewItemModel, i, z, z, z, function0, function0, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    /* compiled from: GiftsOpenPrizesUI.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizesUIKt$GiftsOpenPrizesContentPreview$1 */
    /* loaded from: classes.dex */
    public static final class C56111 extends Lambda implements Function0<Unit> {
        public static final C56111 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: GiftsOpenPrizesUI.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizesUIKt$GiftsOpenPrizesContentPreview$2 */
    /* loaded from: classes.dex */
    public static final class C56122 extends Lambda implements Function0<Unit> {
        public static final C56122 INSTANCE = ;

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
    @Preview(apiLevel = 33, device = "spec:id=reference_phone,shape=Normal,width=844,height=390,unit=dp,dpi=420")
    public static final void GiftsOpenPrizesContentPreview(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-242573856);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-242573856, i, -1, "com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizesContentPreview (GiftsOpenPrizesUI.kt:143)");
            }
            GiftsOpenPrizesContent(new GiftsPreviewItemModel(null, 0, "ДОДГЕ ВУПЕР ОЧЕНЯ БЫСТРЫЙ МАКСИМАЛЬНАЯ МОЩНЫЙ", 3, null), new GiftsPreviewItemModel(null, 0, "15.000p", 3, null), R.drawable.ic_standard_gift, false, true, true, C56111.INSTANCE, C56122.INSTANCE, composerStartRestartGroup, 14380488, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizesUIKt.GiftsOpenPrizesContentPreview.3
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C56133(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    GiftsOpenPrizesUIKt.GiftsOpenPrizesContentPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
