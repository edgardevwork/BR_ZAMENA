package com.blackhub.bronline.game.p019ui.widget.block.item;

import android.graphics.Bitmap;
import androidx.annotation.DimenRes;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.p019ui.widget.other.RectNeonCornerKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonTaskCategoryItem.kt */
@SourceDebugExtension({"SMAP\nCommonTaskCategoryItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonTaskCategoryItem.kt\ncom/blackhub/bronline/game/ui/widget/block/item/CommonTaskCategoryItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n*L\n1#1,309:1\n1116#2,6:310\n1116#2,6:316\n1116#2,6:322\n1116#2,6:328\n1116#2,6:334\n1116#2,6:340\n1116#2,6:346\n1116#2,6:352\n1116#2,6:358\n1116#2,6:364\n1116#2,6:370\n68#3,6:376\n74#3:410\n67#3,7:447\n74#3:482\n78#3:488\n68#3,6:494\n74#3:528\n78#3:533\n78#3:615\n79#4,11:382\n79#4,11:418\n79#4,11:454\n92#4:487\n92#4:492\n79#4,11:500\n92#4:532\n79#4,11:536\n79#4,11:572\n92#4:604\n92#4:609\n92#4:614\n456#5,8:393\n464#5,3:407\n456#5,8:429\n464#5,3:443\n456#5,8:465\n464#5,3:479\n467#5,3:484\n467#5,3:489\n456#5,8:511\n464#5,3:525\n467#5,3:529\n456#5,8:547\n464#5,3:561\n456#5,8:583\n464#5,3:597\n467#5,3:601\n467#5,3:606\n467#5,3:611\n3737#6,6:401\n3737#6,6:437\n3737#6,6:473\n3737#6,6:519\n3737#6,6:555\n3737#6,6:591\n86#7,7:411\n93#7:446\n97#7:493\n86#7,7:565\n93#7:600\n97#7:605\n174#8:483\n78#9,2:534\n80#9:564\n84#9:610\n81#10:616\n81#10:617\n81#10:618\n81#10:619\n107#10,2:620\n81#10:628\n107#10,2:629\n76#11:622\n109#11,2:623\n76#11:625\n109#11,2:626\n*S KotlinDebug\n*F\n+ 1 CommonTaskCategoryItem.kt\ncom/blackhub/bronline/game/ui/widget/block/item/CommonTaskCategoryItemKt\n*L\n77#1:310,6\n85#1:316,6\n93#1:322,6\n115#1:328,6\n121#1:334,6\n122#1:340,6\n127#1:346,6\n128#1:352,6\n131#1:358,6\n190#1:364,6\n199#1:370,6\n194#1:376,6\n194#1:410\n224#1:447,7\n224#1:482\n224#1:488\n242#1:494,6\n242#1:528\n242#1:533\n194#1:615\n194#1:382,11\n201#1:418,11\n224#1:454,11\n224#1:487\n201#1:492\n242#1:500,11\n242#1:532\n257#1:536,11\n272#1:572,11\n272#1:604\n257#1:609\n194#1:614\n194#1:393,8\n194#1:407,3\n201#1:429,8\n201#1:443,3\n224#1:465,8\n224#1:479,3\n224#1:484,3\n201#1:489,3\n242#1:511,8\n242#1:525,3\n242#1:529,3\n257#1:547,8\n257#1:561,3\n272#1:583,8\n272#1:597,3\n272#1:601,3\n257#1:606,3\n194#1:611,3\n194#1:401,6\n201#1:437,6\n224#1:473,6\n242#1:519,6\n257#1:555,6\n272#1:591,6\n201#1:411,7\n201#1:446\n201#1:493\n272#1:565,7\n272#1:600\n272#1:605\n228#1:483\n257#1:534,2\n257#1:564\n257#1:610\n77#1:616\n85#1:617\n93#1:618\n115#1:619\n115#1:620,2\n128#1:628\n128#1:629,2\n122#1:622\n122#1:623,2\n127#1:625\n127#1:626,2\n*E\n"})
/* loaded from: classes3.dex */
public final class CommonTaskCategoryItemKt {
    public static final float SHADOW_BLUR_FOR_TEXT = 8.1f;
    public static final long TIME_MILLISECONDS_IN_MINUTE = 60000;
    public static final int TIME_SECONDS_IN_HOUR_PLUS_MINUTE = 3660;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CommonTaskCategoryItem(@DimenRes final int i, @DimenRes final int i2, @NotNull final String titleCategory, final boolean z, @Nullable final Bitmap bitmap, final int i3, @Nullable String str, @NotNull final Function0<Unit> onElementClick, @Nullable Composer composer, final int i4, final int i5) {
        Object obj;
        String str2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(titleCategory, "titleCategory");
        Intrinsics.checkNotNullParameter(onElementClick, "onElementClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1126836798);
        String str3 = (i5 & 64) != 0 ? null : str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1126836798, i4, -1, "com.blackhub.bronline.game.ui.widget.block.item.CommonTaskCategoryItem (CommonTaskCategoryItem.kt:75)");
        }
        composerStartRestartGroup.startReplaceableGroup(1631608664);
        int i6 = (i4 & 7168) ^ 3072;
        boolean z2 = (i6 > 2048 && composerStartRestartGroup.changed(z)) || (i4 & 3072) == 2048;
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonTaskCategoryItemKt$CommonTaskCategoryItem$alphaIsSelected$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Float invoke() {
                    return Float.valueOf(z ? 1.0f : 0.5f);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        State state = (State) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1631608855);
        boolean z3 = (i6 > 2048 && composerStartRestartGroup.changed(z)) || (i4 & 3072) == 2048;
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonTaskCategoryItemKt$CommonTaskCategoryItem$bgAlphaIsSelected$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Float invoke() {
                    return Float.valueOf(z ? 0.0f : 0.5f);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        State state2 = (State) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1631609047);
        boolean z4 = (i6 > 2048 && composerStartRestartGroup.changed(z)) || (i4 & 3072) == 2048;
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonTaskCategoryItemKt$CommonTaskCategoryItem$textColorResource$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    return Integer.valueOf(z ? R.color.yellow : R.color.white);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        State state3 = (State) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        Brush.Companion companion = Brush.INSTANCE;
        Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        Brush brushM11289horizontalGradient8A3gB4$default2 = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(i3, composerStartRestartGroup, (i4 >> 15) & 14)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        composerStartRestartGroup.startReplaceableGroup(1631609630);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue4 == companion2.getEmpty()) {
            objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        MutableState mutableState = (MutableState) objRememberedValue4;
        composerStartRestartGroup.endReplaceableGroup();
        float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(i, composerStartRestartGroup, i4 & 14);
        composerStartRestartGroup.startReplaceableGroup(1631609819);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue5 == companion2.getEmpty()) {
            objRememberedValue5 = AnimatableKt.Animatable$default(fDimensionResource, 0.0f, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        Animatable animatable = (Animatable) objRememberedValue5;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1631609884);
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue6 == companion2.getEmpty()) {
            objRememberedValue6 = SnapshotLongStateKt.mutableLongStateOf(System.currentTimeMillis() / 1000);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        }
        MutableLongState mutableLongState = (MutableLongState) objRememberedValue6;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1631610013);
        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue7 == companion2.getEmpty()) {
            objRememberedValue7 = SnapshotLongStateKt.mutableLongStateOf(0L);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
        }
        MutableLongState mutableLongState2 = (MutableLongState) objRememberedValue7;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1631610091);
        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue8 == companion2.getEmpty()) {
            objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
        }
        MutableState mutableState2 = (MutableState) objRememberedValue8;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1631610169);
        boolean z5 = (((3670016 & i4) ^ 1572864) > 1048576 && composerStartRestartGroup.changed(str3)) || (i4 & 1572864) == 1048576;
        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
        if (z5 || objRememberedValue9 == companion2.getEmpty()) {
            objRememberedValue9 = new CommonTaskCategoryItemKt$CommonTaskCategoryItem$1$1(str3, mutableLongState, mutableLongState2, mutableState2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(str3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, composerStartRestartGroup, ((i4 >> 18) & 14) | 64);
        Boolean boolValueOf = Boolean.valueOf(z);
        C62962 c62962 = new C62962(z, animatable, fDimensionResource, mutableState, null);
        int i7 = (i4 >> 9) & 14;
        EffectsKt.LaunchedEffect(boolValueOf, c62962, composerStartRestartGroup, i7 | 64);
        Unit unit = Unit.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(1631612403);
        Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue10 == companion2.getEmpty()) {
            objRememberedValue10 = new CommonTaskCategoryItemKt$CommonTaskCategoryItem$3$1(mutableState, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composerStartRestartGroup, 70);
        Modifier.Companion companion3 = Modifier.INSTANCE;
        int i8 = (i4 >> 3) & 14;
        Modifier modifierAlpha = AlphaKt.alpha(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion3, fDimensionResource), PrimitiveResources_androidKt.dimensionResource(i2, composerStartRestartGroup, i8)), CommonTaskCategoryItem$lambda$1(state));
        composerStartRestartGroup.startReplaceableGroup(1631612633);
        boolean z6 = (((29360128 & i4) ^ 12582912) > 8388608 && composerStartRestartGroup.changed(onElementClick)) || (i4 & 12582912) == 8388608;
        Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
        if (z6 || objRememberedValue11 == companion2.getEmpty()) {
            objRememberedValue11 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonTaskCategoryItemKt$CommonTaskCategoryItem$4$1
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
                    onElementClick.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM7805clickableXHw0xAI$default = ClickableKt.m7805clickableXHw0xAI$default(modifierAlpha, false, null, null, (Function0) objRememberedValue11, 7, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion4 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7805clickableXHw0xAI$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
        String str4 = str3;
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        ComposeExtensionKt.IfTrue(Boolean.valueOf(z), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 254880260, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonTaskCategoryItemKt$CommonTaskCategoryItem$5$1$1
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
            public final void invoke(@Nullable Composer composer3, int i9) {
                if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(254880260, i9, -1, "com.blackhub.bronline.game.ui.widget.block.item.CommonTaskCategoryItem.<anonymous>.<anonymous>.<anonymous> (CommonTaskCategoryItem.kt:202)");
                    }
                    int i10 = i2;
                    int i11 = i3;
                    composer3.startReplaceableGroup(733328855);
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                    composer3.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion6);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer3);
                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion7.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    RectNeonCornerKt.m15097RectNeonCornerFuCtLKA(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(i10, composer3, 0)), ColorResources_androidKt.colorResource(i11, composer3, 0), 0.0f, ColorResources_androidKt.colorResource(i11, composer3, 0), PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer3, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer3, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer3, 6), 1.0f, C2046Dp.m13666constructorimpl(0), false, composer3, 918552576, 4);
                    BoxKt.Box(BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(SizeKt.m8177width3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composer3, 6)), 0.0f, 1, null), ColorResources_androidKt.colorResource(i11, composer3, 0), null, 2, null), composer3, 0);
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
        }), composerStartRestartGroup, i7 | 48);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion3);
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
        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxKt.Box(BackgroundKt.background$default(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(AlphaKt.alpha(companion3, 0.5f), C2046Dp.m13666constructorimpl(((Number) animatable.getValue()).floatValue())), PrimitiveResources_androidKt.dimensionResource(i2, composerStartRestartGroup, i8)), brushM11289horizontalGradient8A3gB4$default2, null, 0.0f, 6, null), composerStartRestartGroup, 0);
        BoxKt.Box(BackgroundKt.background$default(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(AlphaKt.alpha(companion3, CommonTaskCategoryItem$lambda$3(state2)), fDimensionResource), PrimitiveResources_androidKt.dimensionResource(i2, composerStartRestartGroup, i8)), brushM11289horizontalGradient8A3gB4$default, null, 0.0f, 6, null), composerStartRestartGroup, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(AlphaKt.alpha(companion3, CommonTaskCategoryItem$lambda$1(state)), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor4);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ImageBitmap imageBitmapAsImageBitmap = bitmap != null ? AndroidImageBitmap_androidKt.asImageBitmap(bitmap) : null;
        composerStartRestartGroup.startReplaceableGroup(949950283);
        if (imageBitmapAsImageBitmap == null) {
            composer2 = composerStartRestartGroup;
            str2 = str4;
            obj = null;
        } else {
            obj = null;
            str2 = str4;
            composer2 = composerStartRestartGroup;
            ImageKt.m7827Image5hnEew(imageBitmapAsImageBitmap, null, SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), null, null, 0.0f, null, 0, composer2, 440, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER);
        }
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(AlphaKt.alpha(companion3, CommonTaskCategoryItem$lambda$1(state)), 0.0f, 1, obj);
        Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
        Arrangement.HorizontalOrVertical center = arrangement.getCenter();
        composer2.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
        composer2.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
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
        Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
        }
        function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
        TextKt.m10024Text4IGK_g(titleCategory, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, 0L, 0, Offset.INSTANCE.m11115getZeroF1C5BW0(), 0.0f, null, composer2, 1600518, 38), composer2, (i4 >> 6) & 14, 0, 65534);
        Alignment.Vertical centerVertically = companion4.getCenterVertically();
        composer2.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer2, 48);
        composer2.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor6 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(companion3);
        if (!(composer2.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor6);
        } else {
            composer2.useNode();
        }
        Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composer2);
        Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRowMeasurePolicy2, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
            composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
            composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
        }
        function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_history, composer2, 6), (String) null, SizeKt.m8172size3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composer2, 6), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composer2, 6)), ColorResources_androidKt.colorResource(CommonTaskCategoryItem$lambda$5(state3), composer2, 0), composer2, 56, 0);
        TextKt.m10024Text4IGK_g(str2 == null ? CommonTaskCategoryItem$lambda$17(mutableState2) : str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, ColorResources_androidKt.colorResource(CommonTaskCategoryItem$lambda$5(state3), composer2, 0), 0, 0L, 8.1f, null, composer2, 1597446, 44), composer2, 0, 0, 65534);
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
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final String str5 = str2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonTaskCategoryItemKt.CommonTaskCategoryItem.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i9) {
                    CommonTaskCategoryItemKt.CommonTaskCategoryItem(i, i2, titleCategory, z, bitmap, i3, str5, onElementClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                }
            });
        }
    }

    public static final void CommonTaskCategoryItem$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: CommonTaskCategoryItem.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.block.item.CommonTaskCategoryItemKt$CommonTaskCategoryItem$2", m7120f = "CommonTaskCategoryItem.kt", m7121i = {}, m7122l = {164, 176}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.widget.block.item.CommonTaskCategoryItemKt$CommonTaskCategoryItem$2 */
    /* loaded from: classes8.dex */
    public static final class C62962 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $bgWidthAnimatedFloat;
        public final /* synthetic */ MutableState<Boolean> $isInitInterface$delegate;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ float $sizeOfBlockValue;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62962(boolean z, Animatable<Float, AnimationVector1D> animatable, float f, MutableState<Boolean> mutableState, Continuation<? super C62962> continuation) {
            super(2, continuation);
            this.$isSelected = z;
            this.$bgWidthAnimatedFloat = animatable;
            this.$sizeOfBlockValue = f;
            this.$isInitInterface$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C62962(this.$isSelected, this.$bgWidthAnimatedFloat, this.$sizeOfBlockValue, this.$isInitInterface$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C62962) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$isSelected) {
                    Animatable<Float, AnimationVector1D> animatable = this.$bgWidthAnimatedFloat;
                    Float fBoxFloat = Boxing.boxFloat(this.$sizeOfBlockValue);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(CommonTaskCategoryItemKt.CommonTaskCategoryItem$lambda$7(this.$isInitInterface$delegate) ? 300 : 0, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Animatable<Float, AnimationVector1D> animatable2 = this.$bgWidthAnimatedFloat;
                    Float fBoxFloat2 = Boxing.boxFloat(0.0f);
                    TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(CommonTaskCategoryItemKt.CommonTaskCategoryItem$lambda$7(this.$isInitInterface$delegate) ? 300 : 0, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                    this.label = 2;
                    if (Animatable.animateTo$default(animatable2, fBoxFloat2, tweenSpecTween$default2, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "CommonTaskCategoryItem")
    public static final void PreviewCommonTaskCategoryItem(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(231484900);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(231484900, i, -1, "com.blackhub.bronline.game.ui.widget.block.item.PreviewCommonTaskCategoryItem (CommonTaskCategoryItem.kt:298)");
            }
            CommonTaskCategoryItem(R.dimen._114wdp, R.dimen._120wdp, "Особые", true, null, R.color.yellow, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonTaskCategoryItemKt.PreviewCommonTaskCategoryItem.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 12807606, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonTaskCategoryItemKt.PreviewCommonTaskCategoryItem.2
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
                    CommonTaskCategoryItemKt.PreviewCommonTaskCategoryItem(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final float CommonTaskCategoryItem$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final float CommonTaskCategoryItem$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final int CommonTaskCategoryItem$lambda$5(State<Integer> state) {
        return state.getValue().intValue();
    }

    public static final boolean CommonTaskCategoryItem$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final String CommonTaskCategoryItem$lambda$17(MutableState<String> mutableState) {
        return mutableState.getValue();
    }
}

