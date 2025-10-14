package com.blackhub.bronline.game.p019ui.widget.block;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.DimenRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.PainterModifierKt;
import androidx.compose.p003ui.draw.RotateKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.craft.enums.CraftElementStatusEnum;
import com.blackhub.bronline.game.gui.craft.model.CraftElement;
import com.blackhub.bronline.game.p019ui.widget.anim.LottieLoopKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImageAndStatusBlock.kt */
@SourceDebugExtension({"SMAP\nImageAndStatusBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageAndStatusBlock.kt\ncom/blackhub/bronline/game/ui/widget/block/ImageAndStatusBlockKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,409:1\n1116#2,6:410\n1116#2,6:416\n1116#2,6:422\n1116#2,6:428\n1116#2,6:434\n1116#2,6:440\n1116#2,6:446\n1116#2,6:452\n1116#2,6:494\n74#3:458\n68#4,6:459\n74#4:493\n78#4:540\n79#5,11:465\n79#5,11:502\n92#5:534\n92#5:539\n456#6,8:476\n464#6,3:490\n456#6,8:513\n464#6,3:527\n467#6,3:531\n467#6,3:536\n3737#7,6:484\n3737#7,6:521\n91#8,2:500\n93#8:530\n97#8:535\n81#9:541\n81#9:542\n81#9:546\n81#9:547\n81#9:548\n81#9:549\n81#9:550\n107#9,2:551\n76#10:543\n109#10,2:544\n*S KotlinDebug\n*F\n+ 1 ImageAndStatusBlock.kt\ncom/blackhub/bronline/game/ui/widget/block/ImageAndStatusBlockKt\n*L\n88#1:410,6\n91#1:416,6\n96#1:422,6\n112#1:428,6\n117#1:434,6\n122#1:440,6\n127#1:446,6\n133#1:452,6\n267#1:494,6\n137#1:458\n173#1:459,6\n173#1:493\n173#1:540\n173#1:465,11\n260#1:502,11\n260#1:534\n173#1:539\n173#1:476,8\n173#1:490,3\n260#1:513,8\n260#1:527,3\n260#1:531,3\n173#1:536,3\n173#1:484,6\n260#1:521,6\n260#1:500,2\n260#1:530\n260#1:535\n88#1:541\n91#1:542\n112#1:546\n117#1:547\n122#1:548\n127#1:549\n133#1:550\n133#1:551,2\n96#1:543\n96#1:544,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ImageAndStatusBlockKt {
    public static final long THREE_SECONDS = 3000;
    public static final float WEIGHT_BG_START = 0.85f;

    /* compiled from: ImageAndStatusBlock.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CraftElementStatusEnum.values().length];
            try {
                iArr[CraftElementStatusEnum.IN_THE_QUEUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CraftElementStatusEnum.IN_THE_PIPELINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CraftElementStatusEnum.UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CraftElementStatusEnum.AVAILABLE_FOR_CRAFTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CraftElementStatusEnum.NEW_ELEMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ImageAndStatusBlock(@DimenRes final int i, @NotNull final CraftElement element, final boolean z, final boolean z2, final boolean z3, @Nullable Function0<Unit> function0, @Nullable Composer composer, final int i2, final int i3) {
        Continuation continuation;
        Function0<Unit> function02;
        int i4;
        Modifier.Companion companion;
        Intrinsics.checkNotNullParameter(element, "element");
        Composer composerStartRestartGroup = composer.startRestartGroup(-189537874);
        Function0<Unit> function03 = (i3 & 32) != 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ImageAndStatusBlockKt.ImageAndStatusBlock.1
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
            ComposerKt.traceEventStart(-189537874, i2, -1, "com.blackhub.bronline.game.ui.widget.block.ImageAndStatusBlock (ImageAndStatusBlock.kt:77)");
        }
        Brush.Companion companion2 = Brush.INSTANCE;
        Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(companion2, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(element.getBottomBgColor(), composerStartRestartGroup, 0))}), 0.0f, 0.0f, 0, 14, (Object) null);
        long jColorResource = ColorResources_androidKt.colorResource(element.getBorderColor(), composerStartRestartGroup, 0);
        float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(2071981085);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(0.0f, fDimensionResource, 0.0f, 0.0f, 13, null), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(2071981197);
        boolean zChanged = composerStartRestartGroup.changed(element);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.blackhub.bronline.game.ui.widget.block.ImageAndStatusBlockKt$ImageAndStatusBlock$isLegendaryElement$2$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() {
                    return Boolean.valueOf(element.getElementRarity() == CommonRarityEnum.LEGENDARY);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        State state = (State) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        final Function0<Unit> function04 = function03;
        final long jColorResource2 = ColorResources_androidKt.colorResource(R.color.green_50, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(2071981398);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        final MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(element.getTimeWhenElementCreated(), new C62402(element, mutableFloatState, null), composerStartRestartGroup, 64);
        composerStartRestartGroup.startReplaceableGroup(2071981974);
        boolean zChanged2 = composerStartRestartGroup.changed(element);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue4 == companion3.getEmpty()) {
            objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.widget.block.ImageAndStatusBlockKt$ImageAndStatusBlock$iconIsWithVIPPlatinum$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    return Integer.valueOf(z2 ? R.drawable.ic_check_correct_white : R.drawable.ic_shop);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        State state2 = (State) objRememberedValue4;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(2071982156);
        boolean zChanged3 = composerStartRestartGroup.changed(element);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (zChanged3 || objRememberedValue5 == companion3.getEmpty()) {
            objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.widget.block.ImageAndStatusBlockKt$ImageAndStatusBlock$bgColorIsWithVIPPlatinum$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    return Integer.valueOf(z2 ? R.color.dark_medium_green : R.color.yellow);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        State state3 = (State) objRememberedValue5;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(2071982328);
        boolean zChanged4 = composerStartRestartGroup.changed(element);
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (zChanged4 || objRememberedValue6 == companion3.getEmpty()) {
            objRememberedValue6 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.widget.block.ImageAndStatusBlockKt$ImageAndStatusBlock$textColorIsWithVIPPlatinum$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    return Integer.valueOf(z2 ? R.color.white : R.color.total_black_70);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        }
        State state4 = (State) objRememberedValue6;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(2071982482);
        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue7 == companion3.getEmpty()) {
            objRememberedValue7 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.widget.block.ImageAndStatusBlockKt$ImageAndStatusBlock$imagePadding$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    return Integer.valueOf(z ? R.dimen._5wdp : R.dimen._1wdp);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
        }
        State state5 = (State) objRememberedValue7;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(2071982621);
        boolean zChanged5 = composerStartRestartGroup.changed(element);
        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
        if (zChanged5 || objRememberedValue8 == companion3.getEmpty()) {
            continuation = null;
            objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
        } else {
            continuation = null;
        }
        MutableState mutableState2 = (MutableState) objRememberedValue8;
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(element, new C62413(mutableState2, element, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), continuation), composerStartRestartGroup, 72);
        Modifier.Companion companion4 = Modifier.INSTANCE;
        Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.m8172size3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(i, composerStartRestartGroup, i2 & 14)), brushM11297verticalGradient8A3gB4$default, ImageAndStatusBlock$lambda$1(mutableState), 0.0f, 4, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion5 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion5.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion6.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierBackground$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion6.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        final BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        BoxKt.Box(BorderKt.m7782borderxT4_qwU(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), jColorResource, ImageAndStatusBlock$lambda$1(mutableState)), composerStartRestartGroup, 0);
        ComposeExtensionKt.IfTrue(Boolean.valueOf(ImageAndStatusBlock$lambda$3(state)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -649112176, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ImageAndStatusBlockKt$ImageAndStatusBlock$4$1
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
                        ComposerKt.traceEventStart(-649112176, i5, -1, "com.blackhub.bronline.game.ui.widget.block.ImageAndStatusBlock.<anonymous>.<anonymous> (ImageAndStatusBlock.kt:191)");
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_stars, composer2, 6), (String) null, boxScopeInstance.align(SizeKt.fillMaxSize(Modifier.INSTANCE, 0.85f), Alignment.INSTANCE.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 48);
        boolean z4 = true;
        ImageBitmapKt.m15118ImageBitmapAy9G7rc(ImageAndStatusBlock$lambda$16(mutableState2), PaddingKt.m8123padding3ABfNKs(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(ImageAndStatusBlock$lambda$14(state5), composerStartRestartGroup, 0)), null, null, 0.0f, null, 0, composerStartRestartGroup, 8, 124);
        if (z) {
            composerStartRestartGroup.startReplaceableGroup(-734357331);
            int i5 = WhenMappings.$EnumSwitchMapping$0[element.getElementState().ordinal()];
            if (i5 == 1) {
                i4 = R.dimen._2wdp;
                companion = companion4;
                composerStartRestartGroup.startReplaceableGroup(-734357224);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_sand_clock, composerStartRestartGroup, 6), (String) null, boxScopeInstance.align(PaddingKt.m8123padding3ABfNKs(SizeKt.m8172size3ABfNKs(PaddingKt.m8123padding3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._38wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6)), companion5.getTopStart()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit = Unit.INSTANCE;
            } else if (i5 == 2) {
                i4 = R.dimen._2wdp;
                companion = companion4;
                composerStartRestartGroup.startReplaceableGroup(-734356638);
                LottieLoopKt.LottieLoop(boxScopeInstance.align(SizeKt.m8172size3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._38wdp, composerStartRestartGroup, 6)), companion5.getTopStart()), R.raw.ic_progress, 0, composerStartRestartGroup, 48, 4);
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit2 = Unit.INSTANCE;
            } else if (i5 == 3) {
                i4 = R.dimen._2wdp;
                companion = companion4;
                composerStartRestartGroup.startReplaceableGroup(-734356281);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_lock_close_fill, composerStartRestartGroup, 6), (String) null, boxScopeInstance.align(PaddingKt.m8123padding3ABfNKs(SizeKt.m8172size3ABfNKs(PaddingKt.m8123padding3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._38wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6)), companion5.getTopStart()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit3 = Unit.INSTANCE;
            } else {
                composerStartRestartGroup.startReplaceableGroup(-734355724);
                if (z3) {
                    Modifier modifierAlign = boxScopeInstance.align(PaddingKt.m8123padding3ABfNKs(SizeKt.m8172size3ABfNKs(PaddingKt.m8123padding3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._38wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6)), companion5.getTopStart());
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_check_correct_white, composerStartRestartGroup, 6);
                    companion = companion4;
                    i4 = R.dimen._2wdp;
                    ImageKt.Image(painterPainterResource, (String) null, modifierAlign, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                } else {
                    i4 = R.dimen._2wdp;
                    companion = companion4;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit4 = Unit.INSTANCE;
            }
            Modifier modifierPaint$default = PainterModifierKt.paint$default(BackgroundKt.m7771backgroundbw27NRU$default(boxScopeInstance.align(SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composerStartRestartGroup, 6)), 0.0f, 1, null), companion5.getBottomCenter()), ColorResources_androidKt.colorResource(ImageAndStatusBlock$lambda$10(state3), composerStartRestartGroup, 0), null, 2, null), PainterResources_androidKt.painterResource(R.drawable.bg_inactive, composerStartRestartGroup, 6), false, null, null, 0.0f, null, 62, null);
            boolean z5 = !z2;
            composerStartRestartGroup.startReplaceableGroup(-734354602);
            if ((((458752 & i2) ^ ProfileVerifier.CompilationStatus.f342xf2722a21) <= 131072 || !composerStartRestartGroup.changed(function04)) && (i2 & ProfileVerifier.CompilationStatus.f342xf2722a21) != 131072) {
                z4 = false;
            }
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue9 == companion3.getEmpty()) {
                objRememberedValue9 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ImageAndStatusBlockKt$ImageAndStatusBlock$4$2$1
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
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierNoRippleClickable = ComposeExtensionKt.noRippleClickable(modifierPaint$default, z5, (Function0) objRememberedValue9);
            Alignment.Vertical centerVertically = companion5.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierNoRippleClickable);
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
            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            function02 = function04;
            ImageKt.Image(PainterResources_androidKt.painterResource(ImageAndStatusBlock$lambda$8(state2), composerStartRestartGroup, 0), (String) null, PaddingKt.m8123padding3ABfNKs(SizeKt.m8172size3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(i4, composerStartRestartGroup, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            TextKt.m10024Text4IGK_g(StringResourceCompose.INSTANCE.craftElementDescriptionIsNeedVIPPlatinum(z2, element.getValueOfPercent(), composerStartRestartGroup, ((i2 >> 9) & 14) | 384), (Modifier) null, ColorResources_androidKt.colorResource(ImageAndStatusBlock$lambda$12(state4), composerStartRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._11wsp, 0L, 0, 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 126), composerStartRestartGroup, 0, 0, 65530);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            function02 = function04;
            composerStartRestartGroup.startReplaceableGroup(-734353634);
            int i6 = WhenMappings.$EnumSwitchMapping$0[element.getElementState().ordinal()];
            if (i6 == 1) {
                composerStartRestartGroup.startReplaceableGroup(-734349868);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_sand_clock, composerStartRestartGroup, 6), (String) null, PaddingKt.m8123padding3ABfNKs(BackgroundKt.m7770backgroundbw27NRU(PaddingKt.m8123padding3ABfNKs(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6), ImageAndStatusBlock$lambda$1(mutableState)), PrimitiveResources_androidKt.dimensionResource(R.dimen._13wdp, composerStartRestartGroup, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit5 = Unit.INSTANCE;
            } else if (i6 == 2) {
                composerStartRestartGroup.startReplaceableGroup(-734351123);
                SurfaceKt.m9876SurfaceT9BRK9s(PaddingKt.m8123padding3ABfNKs(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6)), ImageAndStatusBlock$lambda$1(mutableState), Color.INSTANCE.m11375getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1817265782, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ImageAndStatusBlockKt$ImageAndStatusBlock$4$4
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
                    public final void invoke(@Nullable Composer composer2, int i7) {
                        if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1817265782, i7, -1, "com.blackhub.bronline.game.ui.widget.block.ImageAndStatusBlock.<anonymous>.<anonymous> (ImageAndStatusBlock.kt:347)");
                            }
                            Modifier modifierRotate = RotateKt.rotate(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 180.0f);
                            composer2.startReplaceableGroup(-2775423);
                            boolean zChanged6 = composer2.changed(jColorResource2);
                            final long j = jColorResource2;
                            final MutableFloatState mutableFloatState2 = mutableFloatState;
                            Object objRememberedValue10 = composer2.rememberedValue();
                            if (zChanged6 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue10 = new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ImageAndStatusBlockKt$ImageAndStatusBlock$4$4$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                        invoke2(drawScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull DrawScope Canvas) {
                                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                        DrawScope.m11886drawRoundRectuAw5IA$default(Canvas, j, 0L, androidx.compose.p003ui.geometry.SizeKt.Size(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), mutableFloatState2.getFloatValue() * Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc())), 0L, null, 0.0f, null, 0, 250, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue10);
                            }
                            composer2.endReplaceableGroup();
                            CanvasKt.Canvas(modifierRotate, (Function1) objRememberedValue10, composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, 12583296, 120);
                LottieLoopKt.LottieLoop(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), R.raw.ic_progress, 0, composerStartRestartGroup, 54, 4);
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit6 = Unit.INSTANCE;
            } else if (i6 == 3) {
                composerStartRestartGroup.startReplaceableGroup(-734353014);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_lock_close_fill, composerStartRestartGroup, 6), (String) null, boxScopeInstance.align(SizeKt.m8172size3ABfNKs(PaddingKt.m8123padding3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._11wdp, composerStartRestartGroup, 6)), companion5.getBottomStart()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit7 = Unit.INSTANCE;
            } else if (i6 == 4) {
                composerStartRestartGroup.startReplaceableGroup(-734353517);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_prod, composerStartRestartGroup, 6), (String) null, boxScopeInstance.align(SizeKt.m8172size3ABfNKs(PaddingKt.m8123padding3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._11wdp, composerStartRestartGroup, 6)), companion5.getBottomStart()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit8 = Unit.INSTANCE;
            } else if (i6 == 5) {
                composerStartRestartGroup.startReplaceableGroup(-734352500);
                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_new, composerStartRestartGroup, 6), boxScopeInstance.align(PaddingKt.m8124paddingVpY3zN4(BackgroundKt.background$default(PaddingKt.m8123padding3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6)), Brush.Companion.m11297verticalGradient8A3gB4$default(companion2, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.yellow_orange, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null), 0.0f, 4, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6)), companion5.getBottomStart()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._5wsp, 0L, 0, Offset.INSTANCE.m11115getZeroF1C5BW0(), 0.0f, null, composerStartRestartGroup, 1600518, 38), composerStartRestartGroup, 0, 0, 65532);
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit9 = Unit.INSTANCE;
            } else {
                composerStartRestartGroup.startReplaceableGroup(-734349220);
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit10 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0<Unit> function05 = function02;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ImageAndStatusBlockKt.ImageAndStatusBlock.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i7) {
                    ImageAndStatusBlockKt.ImageAndStatusBlock(i, element, z, z2, z3, function05, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* compiled from: ImageAndStatusBlock.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.block.ImageAndStatusBlockKt$ImageAndStatusBlock$2", m7120f = "ImageAndStatusBlock.kt", m7121i = {}, m7122l = {106}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.widget.block.ImageAndStatusBlockKt$ImageAndStatusBlock$2 */
    /* loaded from: classes8.dex */
    public static final class C62402 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ CraftElement $element;
        public final /* synthetic */ MutableFloatState $percentOfPreparation$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62402(CraftElement craftElement, MutableFloatState mutableFloatState, Continuation<? super C62402> continuation) {
            super(2, continuation);
            this.$element = craftElement;
            this.$percentOfPreparation$delegate = mutableFloatState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C62402(this.$element, this.$percentOfPreparation$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C62402) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$element.getTimeWhenElementCreated() == null) {
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            do {
                Duration.Companion companion = Duration.INSTANCE;
                ImageAndStatusBlockKt.ImageAndStatusBlock$lambda$6(this.$percentOfPreparation$delegate, (Duration.m17046getInWholeSecondsimpl(DurationKt.toDuration(System.currentTimeMillis(), DurationUnit.MILLISECONDS)) - this.$element.getTimeWhenElementCreated().intValue()) / (this.$element.getTimeUntilItemPreparation() - this.$element.getTimeWhenElementCreated().intValue()));
                this.label = 1;
            } while (DelayKt.delay(3000L, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    /* compiled from: ImageAndStatusBlock.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.block.ImageAndStatusBlockKt$ImageAndStatusBlock$3", m7120f = "ImageAndStatusBlock.kt", m7121i = {}, m7122l = {Cea708Decoder.COMMAND_DLY}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.widget.block.ImageAndStatusBlockKt$ImageAndStatusBlock$3 */
    /* loaded from: classes8.dex */
    public static final class C62413 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ CraftElement $element;
        public final /* synthetic */ MutableState<Bitmap> $imageBitmap$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62413(MutableState<Bitmap> mutableState, CraftElement craftElement, Context context, Continuation<? super C62413> continuation) {
            super(2, continuation);
            this.$imageBitmap$delegate = mutableState;
            this.$element = craftElement;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C62413(this.$imageBitmap$delegate, this.$element, this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C62413) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (AnyExtensionKt.isNull(ImageAndStatusBlockKt.ImageAndStatusBlock$lambda$16(this.$imageBitmap$delegate))) {
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$element, this.$context, this.$imageBitmap$delegate, null);
                    this.label = 1;
                    if (BuildersKt.withContext(io2, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: ImageAndStatusBlock.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.block.ImageAndStatusBlockKt$ImageAndStatusBlock$3$1", m7120f = "ImageAndStatusBlock.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.ui.widget.block.ImageAndStatusBlockKt$ImageAndStatusBlock$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Context $context;
            public final /* synthetic */ CraftElement $element;
            public final /* synthetic */ MutableState<Bitmap> $imageBitmap$delegate;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CraftElement craftElement, Context context, MutableState<Bitmap> mutableState, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$element = craftElement;
                this.$context = context;
                this.$imageBitmap$delegate = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$element, this.$context, this.$imageBitmap$delegate, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Bitmap bitmapFromZip$default;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MutableState<Bitmap> mutableState = this.$imageBitmap$delegate;
                int imageType = this.$element.getImageType();
                if (imageType == 1) {
                    bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$element.getImageName(), ImageTypePathInCDNEnum.COMPONENT, 0.0f, 0.0f, 24, null);
                } else if (imageType == 2) {
                    bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$element.getImageName(), ImageTypePathInCDNEnum.ACCESSORY, 0.0f, 0.0f, 24, null);
                } else if (imageType == 3) {
                    bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$element.getImageName(), ImageTypePathInCDNEnum.SKIN, 0.0f, 0.0f, 24, null);
                } else {
                    bitmapFromZip$default = imageType != 4 ? null : BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$element.getImageName(), ImageTypePathInCDNEnum.VEHICLE, 0.0f, 0.0f, 24, null);
                }
                ImageAndStatusBlockKt.ImageAndStatusBlock$lambda$17(mutableState, bitmapFromZip$default);
                return Unit.INSTANCE;
            }
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewImageAndStatusBlock(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(157099073);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(157099073, i, -1, "com.blackhub.bronline.game.ui.widget.block.PreviewImageAndStatusBlock (ImageAndStatusBlock.kt:395)");
            }
            ImageAndStatusBlock(R.dimen._148wdp, new CraftElement(0, 0, null, 0, 0, 0, null, CommonRarityEnum.EPIC, CraftElementStatusEnum.IN_THE_PIPELINE, 100, null, null, 0, null, 0, 0, 64639, null), false, false, true, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ImageAndStatusBlockKt.PreviewImageAndStatusBlock.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 224710, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ImageAndStatusBlockKt.PreviewImageAndStatusBlock.2
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
                    ImageAndStatusBlockKt.PreviewImageAndStatusBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final RoundedCornerShape ImageAndStatusBlock$lambda$1(MutableState<RoundedCornerShape> mutableState) {
        return mutableState.getValue();
    }

    public static final boolean ImageAndStatusBlock$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    public static final void ImageAndStatusBlock$lambda$6(MutableFloatState mutableFloatState, float f) {
        mutableFloatState.setFloatValue(f);
    }

    public static final int ImageAndStatusBlock$lambda$8(State<Integer> state) {
        return state.getValue().intValue();
    }

    public static final int ImageAndStatusBlock$lambda$10(State<Integer> state) {
        return state.getValue().intValue();
    }

    public static final int ImageAndStatusBlock$lambda$12(State<Integer> state) {
        return state.getValue().intValue();
    }

    public static final int ImageAndStatusBlock$lambda$14(State<Integer> state) {
        return state.getValue().intValue();
    }

    public static final Bitmap ImageAndStatusBlock$lambda$16(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    public static final void ImageAndStatusBlock$lambda$17(MutableState<Bitmap> mutableState, Bitmap bitmap) {
        mutableState.setValue(bitmap);
    }
}

