package com.blackhub.bronline.game.p019ui.craft.uiblock;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.motion.widget.Key;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.craft.model.CraftElement;
import com.blackhub.bronline.game.gui.craft.model.CraftItemTextBlock;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.Locale;
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
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftLevelUpDialogItem.kt */
@Metadata(m7104d1 = {"\u00004\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\u001a1\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u0014\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\fX\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\fX\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u008a\u008e\u0002"}, m7105d2 = {"ALSO_MAX_SCALE_VALUE", "", "ANIMATION_DURATION", "", "MINIMUM_SCALE", "CraftLevelUpDialogItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "craftElement", "Lcom/blackhub/bronline/game/gui/craft/model/CraftElement;", "isForceRotated", "", "delay", "", "(Landroidx/compose/ui/Modifier;Lcom/blackhub/bronline/game/gui/craft/model/CraftElement;ZJLandroidx/compose/runtime/Composer;II)V", "CraftLevelUpDialogItemPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "isRotated", "rotate", Key.ROTATION, "isScaleMoreHalf", "isMoving", "scale", "imageBitmap", "Landroid/graphics/Bitmap;"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCraftLevelUpDialogItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftLevelUpDialogItem.kt\ncom/blackhub/bronline/game/ui/craft/uiblock/CraftLevelUpDialogItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,243:1\n1116#2,6:244\n1116#2,6:250\n1116#2,6:256\n1116#2,6:262\n1116#2,6:268\n1116#2,6:274\n1116#2,6:280\n1116#2,6:286\n1116#2,6:293\n74#3:292\n74#4,6:299\n80#4:333\n84#4:416\n79#5,11:305\n79#5,11:339\n92#5:371\n79#5,11:378\n92#5:410\n92#5:415\n456#6,8:316\n464#6,3:330\n456#6,8:350\n464#6,3:364\n467#6,3:368\n456#6,8:389\n464#6,3:403\n467#6,3:407\n467#6,3:412\n3737#7,6:324\n3737#7,6:358\n3737#7,6:397\n69#8,5:334\n74#8:367\n78#8:372\n69#8,5:373\n74#8:406\n78#8:411\n81#9:417\n107#9,2:418\n81#9:420\n107#9,2:421\n81#9:423\n81#9:424\n81#9:425\n81#9:426\n81#9:427\n107#9,2:428\n*S KotlinDebug\n*F\n+ 1 CraftLevelUpDialogItem.kt\ncom/blackhub/bronline/game/ui/craft/uiblock/CraftLevelUpDialogItemKt\n*L\n69#1:244,6\n70#1:250,6\n77#1:256,6\n82#1:262,6\n88#1:268,6\n94#1:274,6\n100#1:280,6\n115#1:286,6\n158#1:293,6\n119#1:292\n153#1:299,6\n153#1:333\n153#1:416\n153#1:305,11\n167#1:339,11\n167#1:371\n206#1:378,11\n206#1:410\n153#1:415\n153#1:316,8\n153#1:330,3\n167#1:350,8\n167#1:364,3\n167#1:368,3\n206#1:389,8\n206#1:403,3\n206#1:407,3\n153#1:412,3\n153#1:324,6\n167#1:358,6\n206#1:397,6\n167#1:334,5\n167#1:367\n167#1:372\n206#1:373,5\n206#1:406\n206#1:411\n69#1:417\n69#1:418,2\n70#1:420\n70#1:421,2\n71#1:423\n77#1:424\n82#1:425\n88#1:426\n115#1:427\n115#1:428,2\n*E\n"})
/* loaded from: classes2.dex */
public final class CraftLevelUpDialogItemKt {
    public static final float ALSO_MAX_SCALE_VALUE = 0.95f;
    public static final int ANIMATION_DURATION = 200;
    public static final float MINIMUM_SCALE = 0.01f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CraftLevelUpDialogItem(@Nullable Modifier modifier, @NotNull final CraftElement craftElement, final boolean z, long j, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(craftElement, "craftElement");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2109258420);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        long j2 = (i2 & 8) != 0 ? 0L : j;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2109258420, i, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftLevelUpDialogItem (CraftLevelUpDialogItem.kt:65)");
        }
        int rarityName = craftElement.getRarityName();
        composerStartRestartGroup.startReplaceableGroup(-2095611628);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-2095611575);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        MutableState mutableState2 = (MutableState) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        final long j3 = j2;
        final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(CraftLevelUpDialogItem$lambda$4(mutableState2) ? 0.0f : 1.0f, AnimationSpecKt.tween$default(200, 0, null, 6, null), 0.0f, AnyExtensionKt.empty(StringCompanionObject.INSTANCE), new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftLevelUpDialogItemKt$CraftLevelUpDialogItem$rotation$2
            public final void invoke(float f) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke(f.floatValue());
                return Unit.INSTANCE;
            }
        }, composerStartRestartGroup, 24624, 4);
        float fCraftLevelUpDialogItem$lambda$6 = CraftLevelUpDialogItem$lambda$6(stateAnimateFloatAsState);
        composerStartRestartGroup.startReplaceableGroup(-2095611291);
        boolean zChanged = composerStartRestartGroup.changed(fCraftLevelUpDialogItem$lambda$6);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftLevelUpDialogItemKt$CraftLevelUpDialogItem$isScaleMoreHalf$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() {
                    return Boolean.valueOf(CraftLevelUpDialogItemKt.CraftLevelUpDialogItem$lambda$6(stateAnimateFloatAsState) <= 0.01f);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        State state = (State) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        float fCraftLevelUpDialogItem$lambda$62 = CraftLevelUpDialogItem$lambda$6(stateAnimateFloatAsState);
        composerStartRestartGroup.startReplaceableGroup(-2095611171);
        boolean zChanged2 = composerStartRestartGroup.changed(fCraftLevelUpDialogItem$lambda$62);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftLevelUpDialogItemKt$CraftLevelUpDialogItem$isMoving$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() {
                    return Boolean.valueOf(CraftLevelUpDialogItemKt.CraftLevelUpDialogItem$lambda$6(stateAnimateFloatAsState) <= 0.95f);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        State state2 = (State) objRememberedValue4;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-2095611046);
        boolean z2 = (((i & 896) ^ 384) > 256 && composerStartRestartGroup.changed(z)) || (i & 384) == 256;
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (z2 || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftLevelUpDialogItemKt$CraftLevelUpDialogItem$scale$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Float invoke() {
                    return Float.valueOf(z ? 1.0f : CraftLevelUpDialogItemKt.CraftLevelUpDialogItem$lambda$6(stateAnimateFloatAsState));
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        final State state3 = (State) objRememberedValue5;
        composerStartRestartGroup.endReplaceableGroup();
        Boolean boolValueOf = Boolean.valueOf(CraftLevelUpDialogItem$lambda$8(state));
        composerStartRestartGroup.startReplaceableGroup(-2095610878);
        boolean zChanged3 = composerStartRestartGroup.changed(state2);
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (zChanged3 || objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new CraftLevelUpDialogItemKt$CraftLevelUpDialogItem$1$1(mutableState2, state2, mutableState, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 64);
        Unit unit = Unit.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-2095610752);
        boolean z3 = (((i & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(j3)) || (i & 3072) == 2048;
        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
        if (z3 || objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new CraftLevelUpDialogItemKt$CraftLevelUpDialogItem$2$1(j3, mutableState2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, 70);
        Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composerStartRestartGroup, 6));
        composerStartRestartGroup.startReplaceableGroup(-2095610369);
        boolean zChanged4 = composerStartRestartGroup.changed(craftElement);
        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
        if (zChanged4 || objRememberedValue8 == companion.getEmpty()) {
            i3 = 2;
            objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
        } else {
            i3 = 2;
        }
        MutableState mutableState3 = (MutableState) objRememberedValue8;
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(craftElement, new C55063(craftElement, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), mutableState3, null), composerStartRestartGroup, 72);
        Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(PaddingKt.m8125paddingVpY3zN4$default(modifier2, PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composerStartRestartGroup, 6), 0.0f, i3, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._160wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._139wdp, composerStartRestartGroup, 6));
        composerStartRestartGroup.startReplaceableGroup(-2095608839);
        boolean zChanged5 = composerStartRestartGroup.changed(state3);
        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
        if (zChanged5 || objRememberedValue9 == companion.getEmpty()) {
            objRememberedValue9 = new Function1<GraphicsLayerScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftLevelUpDialogItemKt$CraftLevelUpDialogItem$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                    invoke2(graphicsLayerScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
                    Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                    graphicsLayer.setScaleX(CraftLevelUpDialogItemKt.CraftLevelUpDialogItem$lambda$12(state3));
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierBackground$default = BackgroundKt.background$default(GraphicsLayerModifierKt.graphicsLayer(modifierM8177width3ABfNKs, (Function1) objRememberedValue9), brushM11297verticalGradient8A3gB4$default, roundedCornerShapeM8392RoundedCornerShape0680j_4, 0.0f, 4, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier.Companion companion4 = Modifier.INSTANCE;
        Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._27wdp, composerStartRestartGroup, 6)), 0.0f, 1, null), ColorResources_androidKt.colorResource(craftElement.getBottomBgColor(), composerStartRestartGroup, 0), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 12, null));
        Alignment center = companion2.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        String upperCase = StringResources_androidKt.stringResource(rarityName, composerStartRestartGroup, 0).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
        TextKt.m10024Text4IGK_g(upperCase, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._13wsp, 0L, 0, 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 126), composerStartRestartGroup, 0, 0, 65534);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (CraftLevelUpDialogItem$lambda$1(mutableState) || z) {
            composerStartRestartGroup.startReplaceableGroup(-1701645695);
            TextKt.m10024Text4IGK_g(craftElement.getTextBlock().getName(), PaddingKt.m8125paddingVpY3zN4$default(companion4, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._8wsp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62), composerStartRestartGroup, 0, 0, 65532);
            ImageBitmapKt.m15118ImageBitmapAy9G7rc(CraftLevelUpDialogItem$lambda$16(mutableState3), SizeKt.m8172size3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._78wdp, composerStartRestartGroup, 6)), null, null, 0.0f, null, 0, composerStartRestartGroup, 8, 124);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-1701645240);
            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_black_russia, composerStartRestartGroup, 6), PaddingKt.m8125paddingVpY3zN4$default(companion4, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._8wsp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62), composerStartRestartGroup, 0, 0, 65532);
            Modifier modifierM7782borderxT4_qwU = BorderKt.m7782borderxT4_qwU(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._78wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape()), PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(craftElement.getBottomBgColor(), composerStartRestartGroup, 0), RoundedCornerShapeKt.getCircleShape());
            Alignment center2 = companion2.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM7782borderxT4_qwU);
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
            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_craft, composerStartRestartGroup, 6), (String) null, SizeKt.m8172size3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), composerStartRestartGroup, 56, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
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
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftLevelUpDialogItemKt.CraftLevelUpDialogItem.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i4) {
                    CraftLevelUpDialogItemKt.CraftLevelUpDialogItem(modifier3, craftElement, z, j3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final void CraftLevelUpDialogItem$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void CraftLevelUpDialogItem$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: CraftLevelUpDialogItem.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.craft.uiblock.CraftLevelUpDialogItemKt$CraftLevelUpDialogItem$3", m7120f = "CraftLevelUpDialogItem.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.craft.uiblock.CraftLevelUpDialogItemKt$CraftLevelUpDialogItem$3 */
    /* loaded from: classes7.dex */
    public static final class C55063 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ CraftElement $craftElement;
        public final /* synthetic */ MutableState<Bitmap> $imageBitmap$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55063(CraftElement craftElement, Context context, MutableState<Bitmap> mutableState, Continuation<? super C55063> continuation) {
            super(2, continuation);
            this.$craftElement = craftElement;
            this.$context = context;
            this.$imageBitmap$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C55063(this.$craftElement, this.$context, this.$imageBitmap$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C55063) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Bitmap bitmapFromZip$default;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (AnyExtensionKt.isNull(CraftLevelUpDialogItemKt.CraftLevelUpDialogItem$lambda$16(this.$imageBitmap$delegate))) {
                    MutableState<Bitmap> mutableState = this.$imageBitmap$delegate;
                    int imageType = this.$craftElement.getImageType();
                    if (imageType == 1) {
                        bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$craftElement.getImageName(), ImageTypePathInCDNEnum.COMPONENT, 0.0f, 0.0f, 24, null);
                    } else if (imageType == 2) {
                        bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$craftElement.getImageName(), ImageTypePathInCDNEnum.ACCESSORY, 0.0f, 0.0f, 24, null);
                    } else if (imageType == 3) {
                        bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$craftElement.getImageName(), ImageTypePathInCDNEnum.SKIN, 0.0f, 0.0f, 24, null);
                    } else {
                        bitmapFromZip$default = imageType != 4 ? null : BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$craftElement.getImageName(), ImageTypePathInCDNEnum.VEHICLE, 0.0f, 0.0f, 24, null);
                    }
                    CraftLevelUpDialogItemKt.CraftLevelUpDialogItem$lambda$17(mutableState, bitmapFromZip$default);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void CraftLevelUpDialogItemPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1673470233);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1673470233, i, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftLevelUpDialogItemPreview (CraftLevelUpDialogItem.kt:232)");
            }
            CraftLevelUpDialogItem(null, new CraftElement(0, 0, null, 0, 0, 0, null, CommonRarityEnum.RARE, null, 0, new CraftItemTextBlock("Крутая маска", null, 0, 0, 0.0f, null, 62, null), null, 0, null, 0, 0, 64383, null), false, 0L, composerStartRestartGroup, 448, 9);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftLevelUpDialogItemKt.CraftLevelUpDialogItemPreview.1
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
                    CraftLevelUpDialogItemKt.CraftLevelUpDialogItemPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final boolean CraftLevelUpDialogItem$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final boolean CraftLevelUpDialogItem$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final float CraftLevelUpDialogItem$lambda$6(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final boolean CraftLevelUpDialogItem$lambda$8(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    public static final boolean CraftLevelUpDialogItem$lambda$10(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    public static final float CraftLevelUpDialogItem$lambda$12(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final Bitmap CraftLevelUpDialogItem$lambda$16(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    public static final void CraftLevelUpDialogItem$lambda$17(MutableState<Bitmap> mutableState, Bitmap bitmap) {
        mutableState.setValue(bitmap);
    }
}
