package com.blackhub.bronline.game.p019ui.craft;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.LayoutCoordinatesKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.FloatExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.craft.model.CraftIngredient;
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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftIngredientItem.kt */
@Metadata(m7104d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\f\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u008a\u008e\u0002"}, m7105d2 = {"IngredientItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "ingredient", "Lcom/blackhub/bronline/game/gui/craft/model/CraftIngredient;", "isSelected", "", "onItemSelected", "Lkotlin/Function1;", "(Landroidx/compose/ui/Modifier;Lcom/blackhub/bronline/game/gui/craft/model/CraftIngredient;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "IngredientItemPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "ingredientPosition", "Landroidx/compose/ui/unit/IntOffset;", "imageBitmap", "Landroid/graphics/Bitmap;"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCraftIngredientItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftIngredientItem.kt\ncom/blackhub/bronline/game/ui/craft/CraftIngredientItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,198:1\n1116#2,6:199\n1116#2,6:205\n1116#2,6:212\n1116#2,6:218\n74#3:211\n74#4,6:224\n80#4:258\n84#4:302\n79#5,11:230\n79#5,11:264\n92#5:296\n92#5:301\n456#6,8:241\n464#6,3:255\n456#6,8:275\n464#6,3:289\n467#6,3:293\n467#6,3:298\n3737#7,6:249\n3737#7,6:283\n69#8,5:259\n74#8:292\n78#8:297\n81#9:303\n107#9,2:304\n81#9:306\n107#9,2:307\n*S KotlinDebug\n*F\n+ 1 CraftIngredientItem.kt\ncom/blackhub/bronline/game/ui/craft/CraftIngredientItemKt\n*L\n64#1:199,6\n65#1:205,6\n114#1:212,6\n121#1:218,6\n76#1:211\n112#1:224,6\n112#1:258\n112#1:302\n112#1:230,11\n126#1:264,11\n126#1:296\n112#1:301\n112#1:241,8\n112#1:255,3\n126#1:275,8\n126#1:289,3\n126#1:293,3\n112#1:298,3\n112#1:249,6\n126#1:283,6\n126#1:259,5\n126#1:292\n126#1:297\n64#1:303\n64#1:304,2\n65#1:306\n65#1:307,2\n*E\n"})
/* loaded from: classes2.dex */
public final class CraftIngredientItemKt {

    /* compiled from: CraftIngredientItem.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.craft.CraftIngredientItemKt$IngredientItem$5 */
    /* loaded from: classes3.dex */
    public static final class C54135 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ CraftIngredient $ingredient;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ Function1<Boolean, Unit> $onItemSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C54135(CraftIngredient craftIngredient, boolean z, Function1<? super Boolean, Unit> function1, int i, int i2) {
            super(2);
            craftIngredient = craftIngredient;
            z = z;
            function1 = function1;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CraftIngredientItemKt.IngredientItem(modifier, craftIngredient, z, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: CraftIngredientItem.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.craft.CraftIngredientItemKt$IngredientItemPreview$2 */
    /* loaded from: classes3.dex */
    public static final class C54152 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54152(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CraftIngredientItemKt.IngredientItemPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void IngredientItem(@Nullable Modifier modifier, @NotNull CraftIngredient ingredient, final boolean z, @NotNull final Function1<? super Boolean, Unit> onItemSelected, @Nullable Composer composer, int i, int i2) {
        Modifier.Companion companion;
        float f;
        Modifier.Companion companion2;
        int i3;
        Intrinsics.checkNotNullParameter(ingredient, "ingredient");
        Intrinsics.checkNotNullParameter(onItemSelected, "onItemSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(1621124793);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1621124793, i, -1, "com.blackhub.bronline.game.ui.craft.IngredientItem (CraftIngredientItem.kt:62)");
        }
        composerStartRestartGroup.startReplaceableGroup(732447352);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m13785boximpl(IntOffset.INSTANCE.m13804getZeronOccac()), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(732447419);
        boolean zChanged = composerStartRestartGroup.changed(ingredient);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        MutableState mutableState2 = (MutableState) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(ingredient.getBackgroundColor(), composerStartRestartGroup, 0))}), 0.0f, 0.0f, 0, 14, (Object) null);
        EffectsKt.LaunchedEffect(ingredient, new C54121(mutableState2, ingredient, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), null), composerStartRestartGroup, 72);
        composerStartRestartGroup.startReplaceableGroup(732449083);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = new Function1<LayoutCoordinates, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftIngredientItemKt$IngredientItem$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                    invoke2(layoutCoordinates);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LayoutCoordinates coordinates) {
                    Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                    long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(coordinates);
                    CraftIngredientItemKt.IngredientItem$lambda$2(mutableState, IntOffsetKt.IntOffset(FloatExtensionKt.roundToIntSafely(Offset.m11099getXimpl(jPositionInRoot)), FloatExtensionKt.roundToIntSafely(Offset.m11100getYimpl(jPositionInRoot))));
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier2, (Function1) objRememberedValue3);
        composerStartRestartGroup.startReplaceableGroup(732449404);
        boolean z2 = ((((i & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(onItemSelected)) || (i & 3072) == 2048) | ((((i & 896) ^ 384) > 256 && composerStartRestartGroup.changed(z)) || (i & 384) == 256);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (z2 || objRememberedValue4 == companion3.getEmpty()) {
            objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftIngredientItemKt$IngredientItem$3$1
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
                    onItemSelected.invoke(Boolean.valueOf(!z));
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierNoRippleClickable$default = ComposeExtensionKt.noRippleClickable$default(modifierOnGloballyPositioned, false, (Function0) objRememberedValue4, 1, null);
        Alignment.Companion companion4 = Alignment.INSTANCE;
        Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierNoRippleClickable$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier.Companion companion6 = Modifier.INSTANCE;
        Modifier modifierBackground$default = BackgroundKt.background$default(ClipKt.clip(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._44wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._44wdp, composerStartRestartGroup, 6)), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6))), brushM11297verticalGradient8A3gB4$default, null, 0.0f, 6, null);
        Alignment center = companion4.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierBackground$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Bitmap bitmapIngredientItem$lambda$4 = IngredientItem$lambda$4(mutableState2);
        Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._33wdp, composerStartRestartGroup, 6));
        ContentScale.Companion companion7 = ContentScale.INSTANCE;
        Modifier modifier3 = modifier2;
        ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmapIngredientItem$lambda$4, modifierM8177width3ABfNKs, null, companion7.getFillWidth(), 0.0f, null, 0, composerStartRestartGroup, 3080, 116);
        BoxKt.Box(BackgroundKt.m7771backgroundbw27NRU$default(AlphaKt.alpha(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), ingredient.getAlphaDarkLayer()), ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6), null, 2, null), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1150256844);
        if (ingredient.isInStorage()) {
            companion = companion6;
            f = 0.0f;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_check_correct_white, composerStartRestartGroup, 6), (String) null, SizeKt.m8177width3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6)), (Alignment) null, companion7.getFillWidth(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
        } else {
            companion = companion6;
            f = 0.0f;
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1974598181);
        if (ingredient.isInWork()) {
            i3 = 6;
            companion2 = companion;
            LottieLoopKt.LottieLoop(SizeKt.m8177width3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._33wdp, composerStartRestartGroup, 6)), R.raw.ic_progress, 0, composerStartRestartGroup, 48, 4);
        } else {
            companion2 = companion;
            i3 = 6;
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        TextKt.m10025TextIbK3jfQ(StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(ingredient.getCountTemplate(), new Object[]{Integer.valueOf(ingredient.getQuantityInStock()), Integer.valueOf(ingredient.getActualQuantityNeededByCount())}, composerStartRestartGroup, 64)), PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, i3), 0.0f, 0.0f, 13, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._12wsp, 0L, 0, OffsetKt.Offset(f, 2.0f), 0.0f, null, null, composerStartRestartGroup, 12585990, 118), composerStartRestartGroup, 0, 0, 131068);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftIngredientItemKt.IngredientItem.5
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $$default;
                public final /* synthetic */ CraftIngredient $ingredient;
                public final /* synthetic */ boolean $isSelected;
                public final /* synthetic */ Function1<Boolean, Unit> $onItemSelected;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C54135(CraftIngredient ingredient2, final boolean z3, final Function1<? super Boolean, Unit> onItemSelected2, int i4, int i22) {
                    super(2);
                    craftIngredient = ingredient2;
                    z = z3;
                    function1 = onItemSelected2;
                    i = i4;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i4) {
                    CraftIngredientItemKt.IngredientItem(modifier, craftIngredient, z, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    public static final void IngredientItem$lambda$2(MutableState<IntOffset> mutableState, long j) {
        mutableState.setValue(IntOffset.m13785boximpl(j));
    }

    /* compiled from: CraftIngredientItem.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.craft.CraftIngredientItemKt$IngredientItem$1", m7120f = "CraftIngredientItem.kt", m7121i = {}, m7122l = {80}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.craft.CraftIngredientItemKt$IngredientItem$1 */
    /* loaded from: classes7.dex */
    public static final class C54121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ MutableState<Bitmap> $imageBitmap$delegate;
        public final /* synthetic */ CraftIngredient $ingredient;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54121(MutableState<Bitmap> mutableState, CraftIngredient craftIngredient, Context context, Continuation<? super C54121> continuation) {
            super(2, continuation);
            this.$imageBitmap$delegate = mutableState;
            this.$ingredient = craftIngredient;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C54121(this.$imageBitmap$delegate, this.$ingredient, this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C54121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (AnyExtensionKt.isNull(CraftIngredientItemKt.IngredientItem$lambda$4(this.$imageBitmap$delegate))) {
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$ingredient, this.$context, this.$imageBitmap$delegate, null);
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

        /* compiled from: CraftIngredientItem.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.craft.CraftIngredientItemKt$IngredientItem$1$1", m7120f = "CraftIngredientItem.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.ui.craft.CraftIngredientItemKt$IngredientItem$1$1 */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Context $context;
            public final /* synthetic */ MutableState<Bitmap> $imageBitmap$delegate;
            public final /* synthetic */ CraftIngredient $ingredient;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CraftIngredient craftIngredient, Context context, MutableState<Bitmap> mutableState, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$ingredient = craftIngredient;
                this.$context = context;
                this.$imageBitmap$delegate = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$ingredient, this.$context, this.$imageBitmap$delegate, continuation);
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
                int imageType = this.$ingredient.getImageType();
                if (imageType == 1) {
                    bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$ingredient.getImageName(), ImageTypePathInCDNEnum.COMPONENT, 0.0f, 0.0f, 24, null);
                } else if (imageType == 2) {
                    bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$ingredient.getImageName(), ImageTypePathInCDNEnum.ACCESSORY, 0.0f, 0.0f, 24, null);
                } else if (imageType == 3) {
                    bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$ingredient.getImageName(), ImageTypePathInCDNEnum.SKIN, 0.0f, 0.0f, 24, null);
                } else {
                    bitmapFromZip$default = imageType != 4 ? null : BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$ingredient.getImageName(), ImageTypePathInCDNEnum.VEHICLE, 0.0f, 0.0f, 24, null);
                }
                CraftIngredientItemKt.IngredientItem$lambda$5(mutableState, bitmapFromZip$default);
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CraftIngredientItem.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "it", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.craft.CraftIngredientItemKt$IngredientItemPreview$1 */
    /* loaded from: classes3.dex */
    public static final class C54141 extends Lambda implements Function1<Boolean, Unit> {
        public static final C54141 INSTANCE = ;

        public final void invoke(boolean z) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void IngredientItemPreview(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1569538754);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1569538754, i, -1, "com.blackhub.bronline.game.ui.craft.IngredientItemPreview (CraftIngredientItem.kt:185)");
            }
            IngredientItem(null, new CraftIngredient(0, CommonRarityEnum.COMMON, null, null, null, 0, 2, 1, 1, false, false, 1085, null), true, C54141.INSTANCE, composerStartRestartGroup, 3520, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftIngredientItemKt.IngredientItemPreview.2
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C54152(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CraftIngredientItemKt.IngredientItemPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final Bitmap IngredientItem$lambda$4(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    public static final void IngredientItem$lambda$5(MutableState<Bitmap> mutableState, Bitmap bitmap) {
        mutableState.setValue(bitmap);
    }
}
