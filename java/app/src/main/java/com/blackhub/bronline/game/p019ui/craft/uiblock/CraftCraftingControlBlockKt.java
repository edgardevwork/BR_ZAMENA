package com.blackhub.bronline.game.p019ui.craft.uiblock;

import androidx.annotation.ColorRes;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
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
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.p019ui.widget.button.ButtonGrayGradientKt;
import com.blackhub.bronline.game.p019ui.widget.button.ButtonWithLineKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftCraftingControlBlock.kt */
@SourceDebugExtension({"SMAP\nCraftCraftingControlBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftCraftingControlBlock.kt\ncom/blackhub/bronline/game/ui/craft/uiblock/CraftCraftingControlBlockKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,367:1\n487#2,4:368\n491#2,2:376\n495#2:382\n25#3:372\n456#3,8:414\n464#3,3:428\n456#3,8:450\n464#3,3:464\n456#3,8:486\n464#3,3:500\n467#3,3:504\n456#3,8:527\n464#3,3:541\n467#3,3:545\n467#3,3:550\n456#3,8:573\n464#3,3:587\n467#3,3:591\n456#3,8:614\n464#3,3:628\n456#3,8:650\n464#3,3:664\n467#3,3:668\n467#3,3:679\n467#3,3:684\n456#3,8:702\n464#3,3:716\n456#3,8:737\n464#3,3:751\n467#3,3:755\n467#3,3:766\n1116#4,3:373\n1119#4,3:379\n1116#4,6:383\n1116#4,6:389\n1116#4,6:395\n1116#4,6:673\n1116#4,6:760\n487#5:378\n91#6,2:401\n93#6:431\n86#6,7:468\n93#6:503\n97#6:508\n86#6,7:509\n93#6:544\n97#6:549\n86#6,7:632\n93#6:667\n97#6:672\n97#6:688\n87#6,6:720\n93#6:754\n97#6:759\n79#7,11:403\n79#7,11:439\n79#7,11:475\n92#7:507\n79#7,11:516\n92#7:548\n92#7:553\n79#7,11:562\n92#7:594\n79#7,11:603\n79#7,11:639\n92#7:671\n92#7:682\n92#7:687\n79#7,11:691\n79#7,11:726\n92#7:758\n92#7:769\n3737#8,6:422\n3737#8,6:458\n3737#8,6:494\n3737#8,6:535\n3737#8,6:581\n3737#8,6:622\n3737#8,6:658\n3737#8,6:710\n3737#8,6:745\n73#9,7:432\n80#9:467\n84#9:554\n73#9,7:555\n80#9:590\n84#9:595\n73#9,7:596\n80#9:631\n84#9:683\n78#9,2:689\n80#9:719\n84#9:770\n81#10:771\n107#10,2:772\n81#10:774\n*S KotlinDebug\n*F\n+ 1 CraftCraftingControlBlock.kt\ncom/blackhub/bronline/game/ui/craft/uiblock/CraftCraftingControlBlockKt\n*L\n127#1:368,4\n127#1:376,2\n127#1:382\n127#1:372\n152#1:414,8\n152#1:428,3\n157#1:450,8\n157#1:464,3\n160#1:486,8\n160#1:500,3\n160#1:504,3\n173#1:527,8\n173#1:541,3\n173#1:545,3\n157#1:550,3\n241#1:573,8\n241#1:587,3\n241#1:591,3\n270#1:614,8\n270#1:628,3\n274#1:650,8\n274#1:664,3\n274#1:668,3\n270#1:679,3\n152#1:684,3\n310#1:702,8\n310#1:716,3\n315#1:737,8\n315#1:751,3\n315#1:755,3\n310#1:766,3\n127#1:373,3\n127#1:379,3\n128#1:383,6\n129#1:389,6\n131#1:395,6\n300#1:673,6\n341#1:760,6\n127#1:378\n152#1:401,2\n152#1:431\n160#1:468,7\n160#1:503\n160#1:508\n173#1:509,7\n173#1:544\n173#1:549\n274#1:632,7\n274#1:667\n274#1:672\n152#1:688\n315#1:720,6\n315#1:754\n315#1:759\n152#1:403,11\n157#1:439,11\n160#1:475,11\n160#1:507\n173#1:516,11\n173#1:548\n157#1:553\n241#1:562,11\n241#1:594\n270#1:603,11\n274#1:639,11\n274#1:671\n270#1:682\n152#1:687\n310#1:691,11\n315#1:726,11\n315#1:758\n310#1:769\n152#1:422,6\n157#1:458,6\n160#1:494,6\n173#1:535,6\n241#1:581,6\n270#1:622,6\n274#1:658,6\n310#1:710,6\n315#1:745,6\n157#1:432,7\n157#1:467\n157#1:554\n241#1:555,7\n241#1:590\n241#1:595\n270#1:596,7\n270#1:631\n270#1:683\n310#1:689,2\n310#1:719\n310#1:770\n128#1:771\n128#1:772,2\n139#1:774\n*E\n"})
/* loaded from: classes2.dex */
public final class CraftCraftingControlBlockKt {
    public static final int ANIMATION_DURATION_AND_DELAY = 300;
    public static final float FILL_ICON = 0.5f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CraftCraftingControlBlock(final int i, final int i2, final int i3, @NotNull final String selectedWeight, @NotNull final String craftingPrice, final int i4, final boolean z, final boolean z2, final boolean z3, @ColorRes final int i5, @ColorRes final int i6, final float f, final float f2, @NotNull final Function0<Unit> onMinusClick, @NotNull final Function0<Unit> onPlusClick, @NotNull final Function0<Unit> onMainButtonClick, @Nullable Composer composer, final int i7, final int i8) {
        int i9;
        int i10;
        Composer composer2;
        Intrinsics.checkNotNullParameter(selectedWeight, "selectedWeight");
        Intrinsics.checkNotNullParameter(craftingPrice, "craftingPrice");
        Intrinsics.checkNotNullParameter(onMinusClick, "onMinusClick");
        Intrinsics.checkNotNullParameter(onPlusClick, "onPlusClick");
        Intrinsics.checkNotNullParameter(onMainButtonClick, "onMainButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1348560639);
        if ((i7 & 14) == 0) {
            i9 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        if ((i7 & 112) == 0) {
            i9 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i7 & 896) == 0) {
            i9 |= composerStartRestartGroup.changed(i3) ? 256 : 128;
        }
        if ((i7 & 7168) == 0) {
            i9 |= composerStartRestartGroup.changed(selectedWeight) ? 2048 : 1024;
        }
        if ((i7 & 57344) == 0) {
            i9 |= composerStartRestartGroup.changed(craftingPrice) ? 16384 : 8192;
        }
        if ((i7 & 458752) == 0) {
            i9 |= composerStartRestartGroup.changed(i4) ? 131072 : 65536;
        }
        if ((i7 & 3670016) == 0) {
            i9 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((i7 & 29360128) == 0) {
            i9 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
        }
        if ((i7 & 234881024) == 0) {
            i9 |= composerStartRestartGroup.changed(z3) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
        }
        if ((i7 & 1879048192) == 0) {
            i9 |= composerStartRestartGroup.changed(i5) ? 536870912 : 268435456;
        }
        if ((i8 & 14) == 0) {
            i10 = i8 | (composerStartRestartGroup.changed(i6) ? 4 : 2);
        } else {
            i10 = i8;
        }
        if ((i8 & 112) == 0) {
            i10 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i8 & 896) == 0) {
            i10 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
        }
        if ((i8 & 7168) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onMinusClick) ? 2048 : 1024;
        }
        if ((i8 & 57344) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onPlusClick) ? 16384 : 8192;
        }
        if ((i8 & 458752) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onMainButtonClick) ? 131072 : 65536;
        }
        int i11 = i10;
        if ((i9 & 1533916891) != 306783378 || (374491 & i11) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1348560639, i9, i11, "com.blackhub.bronline.game.ui.craft.uiblock.CraftCraftingControlBlock (CraftCraftingControlBlock.kt:67)");
            }
            if (i != 1) {
                if (i == 2) {
                    composerStartRestartGroup.startReplaceableGroup(-1420544999);
                    ControlReadyForGet(onMainButtonClick, composerStartRestartGroup, (i11 >> 15) & 14);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i == 3) {
                    composerStartRestartGroup.startReplaceableGroup(-1420544847);
                    CraftControlTimerKt.CraftControlTimer(i4, composerStartRestartGroup, (i9 >> 15) & 14);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i == 4) {
                    composerStartRestartGroup.startReplaceableGroup(-1420544696);
                    CraftControlCancelCreateKt.CraftControlCancelCreate(onMainButtonClick, composerStartRestartGroup, (i11 >> 15) & 14);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1420544587);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1420545819);
                int i12 = (i9 >> 3) & 8190;
                int i13 = i9 >> 6;
                int i14 = i12 | (57344 & i13) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128);
                int i15 = i11 << 24;
                int i16 = (i11 >> 6) & 8190;
                composer2 = composerStartRestartGroup;
                ControlEdit(i2, i3, selectedWeight, craftingPrice, z, z2, z3, i5, i6, f, f2, onMinusClick, onPlusClick, onMainButtonClick, composer2, i14 | (234881024 & i15) | (i15 & 1879048192), i16);
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftCraftingControlBlockKt.CraftCraftingControlBlock.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i17) {
                    CraftCraftingControlBlockKt.CraftCraftingControlBlock(i, i2, i3, selectedWeight, craftingPrice, i4, z, z2, z3, i5, i6, f, f2, onMinusClick, onPlusClick, onMainButtonClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i7 | 1), RecomposeScopeImplKt.updateChangedFlags(i8));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ControlEdit(final int i, final int i2, final String str, final String str2, final boolean z, final boolean z2, final boolean z3, @ColorRes final int i3, @ColorRes final int i4, final float f, final float f2, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, Composer composer, final int i5, final int i6) {
        int i7;
        int i8;
        long jColorResource;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1123801104);
        if ((i5 & 14) == 0) {
            i7 = i5 | (composerStartRestartGroup.changed(i) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 112) == 0) {
            i7 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i5 & 896) == 0) {
            i7 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i5 & 7168) == 0) {
            i7 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i5 & 57344) == 0) {
            i7 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((i5 & 458752) == 0) {
            i7 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if ((i5 & 3670016) == 0) {
            i7 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
        }
        if ((i5 & 29360128) == 0) {
            i7 |= composerStartRestartGroup.changed(i3) ? 8388608 : 4194304;
        }
        if ((i5 & 234881024) == 0) {
            i7 |= composerStartRestartGroup.changed(i4) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
        }
        if ((i5 & 1879048192) == 0) {
            i7 |= composerStartRestartGroup.changed(f) ? 536870912 : 268435456;
        }
        int i9 = i7;
        if ((i6 & 14) == 0) {
            i8 = i6 | (composerStartRestartGroup.changed(f2) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 112) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i6 & 896) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i6 & 7168) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(function03) ? 2048 : 1024;
        }
        int i10 = i8;
        if ((i9 & 1533916891) != 306783378 || (i10 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1123801104, i9, i10, "com.blackhub.bronline.game.ui.craft.uiblock.ControlEdit (CraftCraftingControlBlock.kt:124)");
            }
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composerStartRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1935028859);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1935028792);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue3;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1935028735);
            boolean z4 = (234881024 & i9) == 67108864;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = Integer.valueOf(i4 == R.color.white ? R.color.rose_red : R.color.white);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            int iIntValue = ((Number) objRememberedValue4).intValue();
            composerStartRestartGroup.endReplaceableGroup();
            if (ControlEdit$lambda$1(mutableState)) {
                composerStartRestartGroup.startReplaceableGroup(-1935028444);
                jColorResource = ColorResources_androidKt.colorResource(iIntValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1935028383);
                jColorResource = ColorResources_androidKt.colorResource(i4, composerStartRestartGroup, (i9 >> 24) & 14);
                composerStartRestartGroup.endReplaceableGroup();
            }
            State<Color> stateM7665animateColorAsStateeuL9pac = SingleValueAnimationKt.m7665animateColorAsStateeuL9pac(jColorResource, AnimationSpecKt.tween$default(300, 0, EasingFunctionsKt.getEaseOut(), 2, null), AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, composerStartRestartGroup, 0, 8);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion3.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
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
            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion2);
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
            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._21wdp, composerStartRestartGroup, 6), 7, null);
            String strStringResource = StringResources_androidKt.stringResource(R.string.craft_crafting_control_max_value, new Object[]{Integer.valueOf(i2)}, composerStartRestartGroup, 70);
            TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
            TextKt.m10024Text4IGK_g(strStringResource, modifierM8127paddingqDBjuR0$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._13wsp, ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 60), composerStartRestartGroup, 0, 0, 65532);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Alignment.Vertical centerVertically2 = companion3.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion2);
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
            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy3, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6));
            Function0<Unit> function04 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftCraftingControlBlockKt$ControlEdit$1$1$2$1
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
                    if (!z) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C54841(mutableState, null), 3, null);
                    } else {
                        function0.invoke();
                    }
                }

                /* compiled from: CraftCraftingControlBlock.kt */
                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.craft.uiblock.CraftCraftingControlBlockKt$ControlEdit$1$1$2$1$1", m7120f = "CraftCraftingControlBlock.kt", m7121i = {}, m7122l = {MatroskaExtractor.ID_CUE_POINT}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                /* renamed from: com.blackhub.bronline.game.ui.craft.uiblock.CraftCraftingControlBlockKt$ControlEdit$1$1$2$1$1 */
                /* loaded from: classes7.dex */
                public static final class C54841 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ MutableState<Boolean> $isNeedBlink$delegate;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C54841(MutableState<Boolean> mutableState, Continuation<? super C54841> continuation) {
                        super(2, continuation);
                        this.$isNeedBlink$delegate = mutableState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new C54841(this.$isNeedBlink$delegate, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                        return ((C54841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            CraftCraftingControlBlockKt.ControlEdit$lambda$2(this.$isNeedBlink$delegate, !CraftCraftingControlBlockKt.ControlEdit$lambda$1(r6));
                            this.label = 1;
                            if (DelayKt.delay(300L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        CraftCraftingControlBlockKt.ControlEdit$lambda$2(this.$isNeedBlink$delegate, !CraftCraftingControlBlockKt.ControlEdit$lambda$1(r6));
                        return Unit.INSTANCE;
                    }
                }
            };
            ComposableSingletons$CraftCraftingControlBlockKt composableSingletons$CraftCraftingControlBlockKt = ComposableSingletons$CraftCraftingControlBlockKt.INSTANCE;
            ButtonGrayGradientKt.ButtonGrayGradient(modifierM8172size3ABfNKs, null, null, null, false, mutableState2, z, false, function04, composableSingletons$CraftCraftingControlBlockKt.m14969getLambda1$app_siteRelease(), composerStartRestartGroup, ((i9 << 6) & 3670016) | 805502976, Cea708Decoder.COMMAND_DF6);
            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_number_value, new Object[]{Integer.valueOf(i)}, composerStartRestartGroup, 70), AlphaKt.alpha(SizeKt.m8157defaultMinSizeVpY3zN4$default(PaddingKt.m8125paddingVpY3zN4$default(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._19wdp, composerStartRestartGroup, 6), 0.0f, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._26wdp, composerStartRestartGroup, 6), 0.0f, 2, null), f2), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(TextAlign.INSTANCE.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._22wsp, ControlEdit$lambda$5(stateM7665animateColorAsStateeuL9pac), 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 60), composerStartRestartGroup, 0, 0, 65020);
            Modifier modifierM8172size3ABfNKs2 = SizeKt.m8172size3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6));
            Function0<Unit> function05 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftCraftingControlBlockKt$ControlEdit$1$1$2$2
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
                    if (!z2) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C54851(mutableState, null), 3, null);
                    } else {
                        function02.invoke();
                    }
                }

                /* compiled from: CraftCraftingControlBlock.kt */
                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.craft.uiblock.CraftCraftingControlBlockKt$ControlEdit$1$1$2$2$1", m7120f = "CraftCraftingControlBlock.kt", m7121i = {}, m7122l = {225}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                /* renamed from: com.blackhub.bronline.game.ui.craft.uiblock.CraftCraftingControlBlockKt$ControlEdit$1$1$2$2$1 */
                /* loaded from: classes7.dex */
                public static final class C54851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ MutableState<Boolean> $isNeedBlink$delegate;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C54851(MutableState<Boolean> mutableState, Continuation<? super C54851> continuation) {
                        super(2, continuation);
                        this.$isNeedBlink$delegate = mutableState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new C54851(this.$isNeedBlink$delegate, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                        return ((C54851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            CraftCraftingControlBlockKt.ControlEdit$lambda$2(this.$isNeedBlink$delegate, !CraftCraftingControlBlockKt.ControlEdit$lambda$1(r6));
                            this.label = 1;
                            if (DelayKt.delay(300L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        CraftCraftingControlBlockKt.ControlEdit$lambda$2(this.$isNeedBlink$delegate, !CraftCraftingControlBlockKt.ControlEdit$lambda$1(r6));
                        return Unit.INSTANCE;
                    }
                }
            };
            Function2<Composer, Integer, Unit> function2M14970getLambda2$app_siteRelease = composableSingletons$CraftCraftingControlBlockKt.m14970getLambda2$app_siteRelease();
            int i11 = i9 << 3;
            ButtonGrayGradientKt.ButtonGrayGradient(modifierM8172size3ABfNKs2, null, null, null, false, mutableState2, z2, false, function05, function2M14970getLambda2$app_siteRelease, composerStartRestartGroup, (i11 & 3670016) | 805502976, Cea708Decoder.COMMAND_DF6);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Alignment.Horizontal centerHorizontally2 = companion3.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(companion2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.craft_element_weight_title, composerStartRestartGroup, 6), PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._21wdp, composerStartRestartGroup, 6), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._13wsp, ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 60), composerStartRestartGroup, 0, 0, 65532);
            ButtonGrayGradientKt.ButtonGrayGradient(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._83wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6)), null, null, null, false, mutableState2, false, z3, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -874707516, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftCraftingControlBlockKt$ControlEdit$1$2$1
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
                public final void invoke(@Nullable Composer composer3, int i12) {
                    if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-874707516, i12, -1, "com.blackhub.bronline.game.ui.craft.uiblock.ControlEdit.<anonymous>.<anonymous>.<anonymous> (CraftCraftingControlBlock.kt:259)");
                        }
                        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.craft_element_weight_value, new Object[]{str}, composer3, 70), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._15wsp, ColorResources_androidKt.colorResource(R.color.white, composer3, 6), 0, 0L, 0.0f, null, composer3, 1572870, 60), composer3, 0, 0, 65534);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composerStartRestartGroup, (i11 & 29360128) | 805527552, 334);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Alignment.Horizontal centerHorizontally3 = companion3.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally3, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor6 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(companion2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor6);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyColumnMeasurePolicy3, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor7 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(companion2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor7);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRowMeasurePolicy4, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
            }
            function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.craft_crafting_control_price, composerStartRestartGroup, 6), PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._21wdp, composerStartRestartGroup, 6), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._13wsp, ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 60), composerStartRestartGroup, 0, 0, 65532);
            TextKt.m10024Text4IGK_g(str2, PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._21wdp, composerStartRestartGroup, 6), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._13wsp, ColorResources_androidKt.colorResource(i3, composerStartRestartGroup, (i9 >> 21) & 14), 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 60), composerStartRestartGroup, (i9 >> 9) & 14, 0, 65532);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._157wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6));
            String strStringResource2 = StringResources_androidKt.stringResource(R.string.craft_crafting_control_create, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1825598103);
            boolean z5 = (i10 & 7168) == 2048;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftCraftingControlBlockKt$ControlEdit$1$3$2$1
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
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            ButtonWithLineKt.ButtonWithLine(modifierM8158height3ABfNKs, R.color.dark_medium_green, 0, 0, strStringResource2, false, 0, f, (Function0) objRememberedValue5, composerStartRestartGroup, ((i9 >> 6) & 29360128) | 48, 108);
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
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftCraftingControlBlockKt.ControlEdit.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i12) {
                    CraftCraftingControlBlockKt.ControlEdit(i, i2, str, str2, z, z2, z3, i3, i4, f, f2, function0, function02, function03, composer3, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), RecomposeScopeImplKt.updateChangedFlags(i6));
                }
            });
        }
    }

    public static final void ControlEdit$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ControlReadyForGet(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1621379488);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1621379488, i2, -1, "com.blackhub.bronline.game.ui.craft.uiblock.ControlReadyForGet (CraftCraftingControlBlock.kt:308)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
            Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composerStartRestartGroup, 6), 7, null);
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_check_correct, composerStartRestartGroup, 6), (String) null, PaddingKt.m8123padding3ABfNKs(SizeKt.m8172size3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._31wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            int i3 = i2;
            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_ready, composerStartRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._24wsp, ColorResources_androidKt.colorResource(R.color.dark_medium_green, composerStartRestartGroup, 6), 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 60), composerStartRestartGroup, 0, 0, 65534);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._157wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer2, 6));
            String strStringResource = StringResources_androidKt.stringResource(R.string.common_get, composer2, 6);
            composer2.startReplaceableGroup(1119736728);
            boolean z = (i3 & 14) == 4;
            Object objRememberedValue = composer2.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftCraftingControlBlockKt$ControlReadyForGet$1$2$1
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
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            ButtonWithLineKt.ButtonWithLine(modifierM8158height3ABfNKs, R.color.dark_medium_green, 0, 0, strStringResource, false, 0, 0.0f, (Function0) objRememberedValue, composer2, 48, 236);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftCraftingControlBlockKt.ControlReadyForGet.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i4) {
                    CraftCraftingControlBlockKt.ControlReadyForGet(function0, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewCraftCraftingControlBlock(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-126578847);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-126578847, i, -1, "com.blackhub.bronline.game.ui.craft.uiblock.PreviewCraftCraftingControlBlock (CraftCraftingControlBlock.kt:347)");
            }
            CraftCraftingControlBlock(1, 4, 10, "99", "99 999 999", 0, true, true, false, R.color.rose_red, R.color.rose_red, 1.0f, 1.0f, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftCraftingControlBlockKt.PreviewCraftCraftingControlBlock.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftCraftingControlBlockKt.PreviewCraftCraftingControlBlock.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftCraftingControlBlockKt.PreviewCraftCraftingControlBlock.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 920350134, 224694);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftCraftingControlBlockKt.PreviewCraftCraftingControlBlock.4
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
                    CraftCraftingControlBlockKt.PreviewCraftCraftingControlBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final boolean ControlEdit$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final long ControlEdit$lambda$5(State<Color> state) {
        return state.getValue().m11350unboximpl();
    }
}

