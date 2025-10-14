package com.blackhub.bronline.game.p019ui.craft.uiblock;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.colorspace.ColorSpace;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.craft.enums.CraftScreenTypeEnum;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftAnimButtonsBlock.kt */
@Metadata(m7104d1 = {"\u0000J\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a}\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0007¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010\u001f\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010 \u001a\u00020!X\u008a\u0084\u0002²\u0006\n\u0010\"\u001a\u00020!X\u008a\u0084\u0002²\u0006\n\u0010#\u001a\u00020!X\u008a\u0084\u0002"}, m7105d2 = {"ANIM_TIME", "", "CraftAnimButtonsBlock", "", "modifier", "Landroidx/compose/ui/Modifier;", "currentScreen", "Lcom/blackhub/bronline/game/gui/craft/enums/CraftScreenTypeEnum;", "craftIconAlarmText", "", "stashIconAlarmText", "progressIconAlarmText", "isButtonsExpanded", "", "isWithIndicationCraft", "isWithIndicationStash", "onButtonCraftClick", "Lkotlin/Function0;", "onButtonStashClick", "onButtonProgressClick", "(Landroidx/compose/ui/Modifier;Lcom/blackhub/bronline/game/gui/craft/enums/CraftScreenTypeEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CraftAnimButtonsBlockPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "iconColor", "Landroidx/compose/ui/graphics/Color;", "colorOneForBrushForAnimatedButtons", "colorTwoForBrushForAnimatedButtons", "zIndexCraft", "", "zIndexStash", "zIndexProgress", "craftOffset", "Landroidx/compose/ui/unit/Dp;", "stashOffset", "processOffset"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCraftAnimButtonsBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftAnimButtonsBlock.kt\ncom/blackhub/bronline/game/ui/craft/uiblock/CraftAnimButtonsBlockKt\n+ 2 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,244:1\n69#2,2:245\n71#2:251\n74#2:255\n69#2,2:261\n71#2:267\n74#2:271\n69#2,2:277\n71#2:283\n74#2:287\n36#3:247\n36#3:263\n36#3:279\n456#3,8:356\n464#3,3:370\n467#3,3:392\n1116#4,3:248\n1119#4,3:252\n1116#4,3:264\n1119#4,3:268\n1116#4,3:280\n1119#4,3:284\n1116#4,6:374\n1116#4,6:380\n1116#4,6:386\n1083#5,5:256\n1083#5,5:272\n1083#5,5:288\n1166#5:293\n1083#5,5:294\n1166#5:299\n1083#5,5:300\n1166#5:305\n1083#5,5:306\n1197#5:311\n1083#5:312\n1084#5,4:315\n1197#5:319\n1083#5:320\n1084#5:323\n1085#5,3:326\n1197#5:329\n1083#5:330\n1084#5:333\n1085#5,3:336\n154#6:313\n154#6:314\n154#6:321\n154#6:322\n154#6:324\n154#6:325\n154#6:331\n154#6:332\n154#6:334\n154#6:335\n68#7,6:339\n74#7:373\n78#7:396\n79#8,11:345\n92#8:395\n3737#9,6:364\n81#10:397\n81#10:398\n81#10:399\n81#10:400\n81#10:401\n81#10:402\n81#10:403\n81#10:404\n81#10:405\n*S KotlinDebug\n*F\n+ 1 CraftAnimButtonsBlock.kt\ncom/blackhub/bronline/game/ui/craft/uiblock/CraftAnimButtonsBlockKt\n*L\n54#1:245,2\n54#1:251\n54#1:255\n63#1:261,2\n63#1:267\n63#1:271\n71#1:277,2\n71#1:283\n71#1:287\n54#1:247\n63#1:263\n71#1:279\n168#1:356,8\n168#1:370,3\n168#1:392,3\n54#1:248,3\n54#1:252,3\n63#1:264,3\n63#1:268,3\n71#1:280,3\n71#1:284,3\n186#1:374,6\n202#1:380,6\n218#1:386,6\n54#1:256,5\n63#1:272,5\n71#1:288,5\n85#1:293\n85#1:294,5\n96#1:299\n96#1:300,5\n107#1:305\n107#1:306,5\n119#1:311\n119#1:312\n119#1:315,4\n133#1:319\n133#1:320\n133#1:323\n133#1:326,3\n148#1:329\n148#1:330\n148#1:333\n148#1:336,3\n124#1:313\n128#1:314\n139#1:321\n143#1:322\n139#1:324\n143#1:325\n156#1:331\n159#1:332\n156#1:334\n159#1:335\n168#1:339,6\n168#1:373\n168#1:396\n168#1:345,11\n168#1:395\n168#1:364,6\n54#1:397\n63#1:398\n71#1:399\n85#1:400\n96#1:401\n107#1:402\n119#1:403\n133#1:404\n148#1:405\n*E\n"})
/* loaded from: classes2.dex */
public final class CraftAnimButtonsBlockKt {
    public static final int ANIM_TIME = 200;

    /* compiled from: CraftAnimButtonsBlock.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CraftScreenTypeEnum.values().length];
            try {
                iArr[CraftScreenTypeEnum.CRAFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CraftScreenTypeEnum.STASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CraftScreenTypeEnum.PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:239:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x093e  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0957  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x09c9  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0a2e  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0a53  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0a7e  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0a90  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0ab5  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0ac4  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0b53  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0b5f  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0b63  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0b90  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0bd9  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0bdb  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0bee  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0c5b  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0c5e  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0c6e  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0cbd  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0cd1  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0d0f  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CraftAnimButtonsBlock(@NotNull final Modifier modifier, @NotNull final CraftScreenTypeEnum currentScreen, @Nullable final String str, @Nullable final String str2, @Nullable final String str3, final boolean z, final boolean z2, final boolean z3, @NotNull final Function0<Unit> onButtonCraftClick, @NotNull final Function0<Unit> onButtonStashClick, @NotNull final Function0<Unit> onButtonProgressClick, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        long jColorResource;
        long jColorResource2;
        long jColorResource3;
        long jColorResource4;
        long jColorResource5;
        long jColorResource6;
        long jColorResource7;
        long jColorResource8;
        long jColorResource9;
        float f;
        Brush brush;
        char c;
        float f2;
        int i5;
        float f3;
        int i6;
        float f4;
        int i7;
        float f5;
        int i8;
        State state;
        int i9;
        float fDimensionResource;
        int i10;
        float fDimensionResource2;
        float fM13666constructorimpl;
        boolean z4;
        float fM13666constructorimpl2;
        float fM13666constructorimpl3;
        float fM13666constructorimpl4;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z5;
        Object objRememberedValue;
        boolean z6;
        boolean z7;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        Intrinsics.checkNotNullParameter(onButtonCraftClick, "onButtonCraftClick");
        Intrinsics.checkNotNullParameter(onButtonStashClick, "onButtonStashClick");
        Intrinsics.checkNotNullParameter(onButtonProgressClick, "onButtonProgressClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-835708964);
        if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(currentScreen) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onButtonCraftClick) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
        }
        if ((1879048192 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onButtonStashClick) ? 536870912 : 268435456;
        }
        if ((i2 & 14) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(onButtonProgressClick) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i3 & 1533916891) == 306783378 && (i4 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-835708964, i3, i4, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock (CraftAnimButtonsBlock.kt:48)");
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            int i11 = i3 >> 3;
            int i12 = i11 & 14;
            Transition transitionUpdateTransition = TransitionKt.updateTransition(currentScreen, AnyExtensionKt.empty(stringCompanionObject), composerStartRestartGroup, i12, 0);
            Transition transitionUpdateTransition2 = TransitionKt.updateTransition(Boolean.valueOf(z), AnyExtensionKt.empty(stringCompanionObject), composerStartRestartGroup, (i3 >> 15) & 14, 0);
            String strEmpty = AnyExtensionKt.empty(stringCompanionObject);
            CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$iconColor$2 craftAnimButtonsBlockKt$CraftAnimButtonsBlock$iconColor$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$iconColor$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer3, Integer num) {
                    return invoke(segment, composer3, num.intValue());
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                @NotNull
                public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<Boolean> animateColor, @Nullable Composer composer3, int i13) {
                    Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                    composer3.startReplaceableGroup(577253434);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(577253434, i13, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:56)");
                    }
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceableGroup();
                    return tweenSpecTween$default;
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1939694975);
            boolean zBooleanValue = ((Boolean) transitionUpdateTransition2.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1803769126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1803769126, 0, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:58)");
            }
            if (zBooleanValue) {
                composerStartRestartGroup.startReplaceableGroup(-1374647800);
                jColorResource = ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1374647753);
                jColorResource = ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            ColorSpace colorSpaceM11344getColorSpaceimpl = Color.m11344getColorSpaceimpl(jColorResource);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(colorSpaceM11344getColorSpaceimpl);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM11344getColorSpaceimpl);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TwoWayConverter twoWayConverter = (TwoWayConverter) objRememberedValue4;
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            boolean zBooleanValue2 = ((Boolean) transitionUpdateTransition2.getCurrentState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1803769126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1803769126, 0, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:58)");
            }
            if (zBooleanValue2) {
                composerStartRestartGroup.startReplaceableGroup(-1374647800);
                jColorResource2 = ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1374647753);
                jColorResource2 = ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Color colorM11330boximpl = Color.m11330boximpl(jColorResource2);
            boolean zBooleanValue3 = ((Boolean) transitionUpdateTransition2.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1803769126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1803769126, 0, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:58)");
            }
            if (zBooleanValue3) {
                composerStartRestartGroup.startReplaceableGroup(-1374647800);
                jColorResource3 = ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1374647753);
                jColorResource3 = ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i13 = i4;
            State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition2, colorM11330boximpl, Color.m11330boximpl(jColorResource3), craftAnimButtonsBlockKt$CraftAnimButtonsBlock$iconColor$2.invoke((CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$iconColor$2) transitionUpdateTransition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter, strEmpty, composerStartRestartGroup, 32768);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            String strEmpty2 = AnyExtensionKt.empty(stringCompanionObject);
            C5466x6587277c c5466x6587277c = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$colorOneForBrushForAnimatedButtons$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer3, Integer num) {
                    return invoke(segment, composer3, num.intValue());
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                @NotNull
                public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<Boolean> animateColor, @Nullable Composer composer3, int i14) {
                    Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                    composer3.startReplaceableGroup(-388646851);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-388646851, i14, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:64)");
                    }
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceableGroup();
                    return tweenSpecTween$default;
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1939694975);
            boolean zBooleanValue4 = ((Boolean) transitionUpdateTransition2.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(-937184047);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-937184047, 0, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:66)");
            }
            if (zBooleanValue4) {
                composerStartRestartGroup.startReplaceableGroup(-1374647460);
                jColorResource4 = ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1374647413);
                jColorResource4 = ColorResources_androidKt.colorResource(R.color.gray_blue, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            ColorSpace colorSpaceM11344getColorSpaceimpl2 = Color.m11344getColorSpaceimpl(jColorResource4);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(colorSpaceM11344getColorSpaceimpl2);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM11344getColorSpaceimpl2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TwoWayConverter twoWayConverter2 = (TwoWayConverter) objRememberedValue5;
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            boolean zBooleanValue5 = ((Boolean) transitionUpdateTransition2.getCurrentState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(-937184047);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-937184047, 0, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:66)");
            }
            if (zBooleanValue5) {
                composerStartRestartGroup.startReplaceableGroup(-1374647460);
                jColorResource5 = ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1374647413);
                jColorResource5 = ColorResources_androidKt.colorResource(R.color.gray_blue, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Color colorM11330boximpl2 = Color.m11330boximpl(jColorResource5);
            boolean zBooleanValue6 = ((Boolean) transitionUpdateTransition2.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(-937184047);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-937184047, 0, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:66)");
            }
            if (zBooleanValue6) {
                composerStartRestartGroup.startReplaceableGroup(-1374647460);
                jColorResource6 = ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1374647413);
                jColorResource6 = ColorResources_androidKt.colorResource(R.color.gray_blue, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            State stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition2, colorM11330boximpl2, Color.m11330boximpl(jColorResource6), c5466x6587277c.invoke((C5466x6587277c) transitionUpdateTransition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter2, strEmpty2, composerStartRestartGroup, 32768);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            String strEmpty3 = AnyExtensionKt.empty(stringCompanionObject);
            C5467x71440662 c5467x71440662 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$colorTwoForBrushForAnimatedButtons$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer3, Integer num) {
                    return invoke(segment, composer3, num.intValue());
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                @NotNull
                public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<Boolean> animateColor, @Nullable Composer composer3, int i14) {
                    Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                    composer3.startReplaceableGroup(700076579);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(700076579, i14, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:72)");
                    }
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceableGroup();
                    return tweenSpecTween$default;
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1939694975);
            boolean zBooleanValue7 = ((Boolean) transitionUpdateTransition2.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(151539383);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(151539383, 0, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:74)");
            }
            if (zBooleanValue7) {
                composerStartRestartGroup.startReplaceableGroup(-1374647116);
                jColorResource7 = ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1374647069);
                jColorResource7 = ColorResources_androidKt.colorResource(R.color.black_gray_blue_2, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            ColorSpace colorSpaceM11344getColorSpaceimpl3 = Color.m11344getColorSpaceimpl(jColorResource7);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged3 = composerStartRestartGroup.changed(colorSpaceM11344getColorSpaceimpl3);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM11344getColorSpaceimpl3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TwoWayConverter twoWayConverter3 = (TwoWayConverter) objRememberedValue6;
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            boolean zBooleanValue8 = ((Boolean) transitionUpdateTransition2.getCurrentState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(151539383);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(151539383, 0, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:74)");
            }
            if (zBooleanValue8) {
                composerStartRestartGroup.startReplaceableGroup(-1374647116);
                jColorResource8 = ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1374647069);
                jColorResource8 = ColorResources_androidKt.colorResource(R.color.black_gray_blue_2, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Color colorM11330boximpl3 = Color.m11330boximpl(jColorResource8);
            boolean zBooleanValue9 = ((Boolean) transitionUpdateTransition2.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(151539383);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(151539383, 0, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:74)");
            }
            if (zBooleanValue9) {
                composerStartRestartGroup.startReplaceableGroup(-1374647116);
                jColorResource9 = ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1374647069);
                jColorResource9 = ColorResources_androidKt.colorResource(R.color.black_gray_blue_2, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            State stateCreateTransitionAnimation3 = TransitionKt.createTransitionAnimation(transitionUpdateTransition2, colorM11330boximpl3, Color.m11330boximpl(jColorResource9), c5467x71440662.invoke((C5467x71440662) transitionUpdateTransition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter3, strEmpty3, composerStartRestartGroup, 32768);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(CraftAnimButtonsBlock$lambda$3(stateCreateTransitionAnimation2)), Color.m11330boximpl(CraftAnimButtonsBlock$lambda$5(stateCreateTransitionAnimation3))}), 0.0f, 0.0f, 0, 14, (Object) null);
            String strEmpty4 = AnyExtensionKt.empty(stringCompanionObject);
            CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexCraft$2 craftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexCraft$2 = new Function3<Transition.Segment<CraftScreenTypeEnum>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexCraft$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<CraftScreenTypeEnum> segment, Composer composer3, Integer num) {
                    return invoke(segment, composer3, num.intValue());
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                @NotNull
                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<CraftScreenTypeEnum> animateFloat, @Nullable Composer composer3, int i14) {
                    Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                    composer3.startReplaceableGroup(-809513583);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-809513583, i14, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:87)");
                    }
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceableGroup();
                    return tweenSpecTween$default;
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            CraftScreenTypeEnum craftScreenTypeEnum = (CraftScreenTypeEnum) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(1795978165);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1795978165, 0, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:89)");
            }
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i14 = iArr[craftScreenTypeEnum.ordinal()];
            float f6 = 1.0f;
            if (i14 == 1) {
                f = 1.0f;
            } else {
                if (i14 != 2 && i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 0.0f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Float fValueOf = Float.valueOf(f);
            CraftScreenTypeEnum craftScreenTypeEnum2 = (CraftScreenTypeEnum) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(1795978165);
            if (ComposerKt.isTraceInProgress()) {
                brush = brushM11297verticalGradient8A3gB4$default;
                ComposerKt.traceEventStart(1795978165, 0, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:89)");
            } else {
                brush = brushM11297verticalGradient8A3gB4$default;
            }
            int i15 = iArr[craftScreenTypeEnum2.ordinal()];
            if (i15 != 1) {
                if (i15 != 2) {
                    c = 3;
                    if (i15 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    c = 3;
                }
                f2 = 0.0f;
            } else {
                c = 3;
                f2 = 1.0f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            State stateCreateTransitionAnimation4 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f2), craftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexCraft$2.invoke((CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexCraft$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, strEmpty4, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            String strEmpty5 = AnyExtensionKt.empty(stringCompanionObject);
            CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexStash$2 craftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexStash$2 = new Function3<Transition.Segment<CraftScreenTypeEnum>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexStash$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<CraftScreenTypeEnum> segment, Composer composer3, Integer num) {
                    return invoke(segment, composer3, num.intValue());
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                @NotNull
                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<CraftScreenTypeEnum> animateFloat, @Nullable Composer composer3, int i16) {
                    Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                    composer3.startReplaceableGroup(-2134919898);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2134919898, i16, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:98)");
                    }
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceableGroup();
                    return tweenSpecTween$default;
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            CraftScreenTypeEnum craftScreenTypeEnum3 = (CraftScreenTypeEnum) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(470571850);
            if (ComposerKt.isTraceInProgress()) {
                i5 = i12;
                ComposerKt.traceEventStart(470571850, 0, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:100)");
            } else {
                i5 = i12;
            }
            int i16 = iArr[craftScreenTypeEnum3.ordinal()];
            if (i16 == 1) {
                f3 = 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf2 = Float.valueOf(f3);
                CraftScreenTypeEnum craftScreenTypeEnum4 = (CraftScreenTypeEnum) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(470571850);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(470571850, 0, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:100)");
                }
                i6 = iArr[craftScreenTypeEnum4.ordinal()];
                if (i6 == 1) {
                    f4 = 0.0f;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State stateCreateTransitionAnimation5 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f4), craftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexStash$2.invoke((CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexStash$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter2, strEmpty5, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    String strEmpty6 = AnyExtensionKt.empty(stringCompanionObject);
                    CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexProgress$2 craftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexProgress$2 = new Function3<Transition.Segment<CraftScreenTypeEnum>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexProgress$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<CraftScreenTypeEnum> segment, Composer composer3, Integer num) {
                            return invoke(segment, composer3, num.intValue());
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        @NotNull
                        public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<CraftScreenTypeEnum> animateFloat, @Nullable Composer composer3, int i17) {
                            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                            composer3.startReplaceableGroup(-408311648);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-408311648, i17, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:109)");
                            }
                            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceableGroup();
                            return tweenSpecTween$default;
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-1338768149);
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                    composerStartRestartGroup.startReplaceableGroup(-142660079);
                    CraftScreenTypeEnum craftScreenTypeEnum5 = (CraftScreenTypeEnum) transitionUpdateTransition.getCurrentState();
                    composerStartRestartGroup.startReplaceableGroup(1147379708);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1147379708, 0, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:111)");
                    }
                    i7 = iArr[craftScreenTypeEnum5.ordinal()];
                    if (i7 == 1 || i7 == 2) {
                        f5 = 0.0f;
                    } else {
                        if (i7 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f5 = 1.0f;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Float fValueOf3 = Float.valueOf(f5);
                    CraftScreenTypeEnum craftScreenTypeEnum6 = (CraftScreenTypeEnum) transitionUpdateTransition.getTargetState();
                    composerStartRestartGroup.startReplaceableGroup(1147379708);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1147379708, 0, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:111)");
                    }
                    i8 = iArr[craftScreenTypeEnum6.ordinal()];
                    if (i8 != 1 || i8 == 2) {
                        f6 = 0.0f;
                    } else if (i8 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State stateCreateTransitionAnimation6 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf3, Float.valueOf(f6), craftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexProgress$2.invoke((CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexProgress$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter3, strEmpty6, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    String strEmpty7 = AnyExtensionKt.empty(stringCompanionObject);
                    CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$craftOffset$2 craftAnimButtonsBlockKt$CraftAnimButtonsBlock$craftOffset$2 = new Function3<Transition.Segment<CraftScreenTypeEnum>, Composer, Integer, FiniteAnimationSpec<C2046Dp>>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$craftOffset$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<C2046Dp> invoke(Transition.Segment<CraftScreenTypeEnum> segment, Composer composer3, Integer num) {
                            return invoke(segment, composer3, num.intValue());
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        @NotNull
                        public final FiniteAnimationSpec<C2046Dp> invoke(@NotNull Transition.Segment<CraftScreenTypeEnum> animateDp, @Nullable Composer composer3, int i17) {
                            Intrinsics.checkNotNullParameter(animateDp, "$this$animateDp");
                            composer3.startReplaceableGroup(-957101760);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-957101760, i17, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:119)");
                            }
                            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceableGroup();
                            return tweenSpecTween$default;
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(184732935);
                    C2046Dp.Companion companion = C2046Dp.INSTANCE;
                    TwoWayConverter<C2046Dp, AnimationVector1D> vectorConverter4 = VectorConvertersKt.getVectorConverter(companion);
                    composerStartRestartGroup.startReplaceableGroup(-142660079);
                    CraftScreenTypeEnum craftScreenTypeEnum7 = (CraftScreenTypeEnum) transitionUpdateTransition.getCurrentState();
                    composerStartRestartGroup.startReplaceableGroup(-1094854638);
                    if (ComposerKt.isTraceInProgress()) {
                        state = stateCreateTransitionAnimation5;
                        i9 = 0;
                    } else {
                        state = stateCreateTransitionAnimation5;
                        i9 = 0;
                        ComposerKt.traceEventStart(-1094854638, 0, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:121)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1092888217);
                    if (!z && craftScreenTypeEnum7 != CraftScreenTypeEnum.CRAFT) {
                        if (craftScreenTypeEnum7 != CraftScreenTypeEnum.STASH && craftScreenTypeEnum7 != CraftScreenTypeEnum.PROGRESS) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._46wdp, composerStartRestartGroup, 6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    C2046Dp c2046DpM13664boximpl = C2046Dp.m13664boximpl(fDimensionResource);
                    CraftScreenTypeEnum craftScreenTypeEnum8 = (CraftScreenTypeEnum) transitionUpdateTransition.getTargetState();
                    composerStartRestartGroup.startReplaceableGroup(-1094854638);
                    if (ComposerKt.isTraceInProgress()) {
                        i10 = 0;
                    } else {
                        i10 = 0;
                        ComposerKt.traceEventStart(-1094854638, 0, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:121)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1092888217);
                    if (!z && craftScreenTypeEnum8 != CraftScreenTypeEnum.CRAFT) {
                        if (craftScreenTypeEnum8 != CraftScreenTypeEnum.STASH && craftScreenTypeEnum8 != CraftScreenTypeEnum.PROGRESS) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._46wdp, composerStartRestartGroup, 6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State stateCreateTransitionAnimation7 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, c2046DpM13664boximpl, C2046Dp.m13664boximpl(fDimensionResource2), craftAnimButtonsBlockKt$CraftAnimButtonsBlock$craftOffset$2.invoke((CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$craftOffset$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter4, strEmpty7, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    String strEmpty8 = AnyExtensionKt.empty(stringCompanionObject);
                    CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$stashOffset$2 craftAnimButtonsBlockKt$CraftAnimButtonsBlock$stashOffset$2 = new Function3<Transition.Segment<CraftScreenTypeEnum>, Composer, Integer, FiniteAnimationSpec<C2046Dp>>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$stashOffset$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<C2046Dp> invoke(Transition.Segment<CraftScreenTypeEnum> segment, Composer composer3, Integer num) {
                            return invoke(segment, composer3, num.intValue());
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        @NotNull
                        public final FiniteAnimationSpec<C2046Dp> invoke(@NotNull Transition.Segment<CraftScreenTypeEnum> animateDp, @Nullable Composer composer3, int i17) {
                            Intrinsics.checkNotNullParameter(animateDp, "$this$animateDp");
                            composer3.startReplaceableGroup(103476501);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(103476501, i17, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:133)");
                            }
                            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceableGroup();
                            return tweenSpecTween$default;
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(184732935);
                    TwoWayConverter<C2046Dp, AnimationVector1D> vectorConverter5 = VectorConvertersKt.getVectorConverter(companion);
                    composerStartRestartGroup.startReplaceableGroup(-142660079);
                    CraftScreenTypeEnum craftScreenTypeEnum9 = (CraftScreenTypeEnum) transitionUpdateTransition.getCurrentState();
                    composerStartRestartGroup.startReplaceableGroup(-34276377);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-34276377, 0, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:135)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1092888664);
                    if (z) {
                        fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
                    } else {
                        int i17 = iArr[craftScreenTypeEnum9.ordinal()];
                        if (i17 == 1) {
                            composerStartRestartGroup.startReplaceableGroup(-1374645030);
                            float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._46wdp, composerStartRestartGroup, 6);
                            composerStartRestartGroup.endReplaceableGroup();
                            fM13666constructorimpl = fDimensionResource3;
                        } else if (i17 == 2) {
                            composerStartRestartGroup.startReplaceableGroup(-1374644937);
                            composerStartRestartGroup.endReplaceableGroup();
                            fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
                        } else {
                            if (i17 != 3) {
                                composerStartRestartGroup.startReplaceableGroup(-1374650044);
                                composerStartRestartGroup.endReplaceableGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceableGroup(-1374644886);
                            fM13666constructorimpl = PrimitiveResources_androidKt.dimensionResource(R.dimen._92wdp, composerStartRestartGroup, 6);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    C2046Dp c2046DpM13664boximpl2 = C2046Dp.m13664boximpl(fM13666constructorimpl);
                    CraftScreenTypeEnum craftScreenTypeEnum10 = (CraftScreenTypeEnum) transitionUpdateTransition.getTargetState();
                    composerStartRestartGroup.startReplaceableGroup(-34276377);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-34276377, 0, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:135)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1092888664);
                    if (z) {
                        z4 = true;
                        fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(0);
                    } else {
                        int i18 = iArr[craftScreenTypeEnum10.ordinal()];
                        z4 = true;
                        if (i18 == 1) {
                            composerStartRestartGroup.startReplaceableGroup(-1374645030);
                            fM13666constructorimpl2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._46wdp, composerStartRestartGroup, 6);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else if (i18 == 2) {
                            composerStartRestartGroup.startReplaceableGroup(-1374644937);
                            composerStartRestartGroup.endReplaceableGroup();
                            fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(0);
                        } else {
                            if (i18 != 3) {
                                composerStartRestartGroup.startReplaceableGroup(-1374650044);
                                composerStartRestartGroup.endReplaceableGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceableGroup(-1374644886);
                            fM13666constructorimpl2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._92wdp, composerStartRestartGroup, 6);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State stateCreateTransitionAnimation8 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, c2046DpM13664boximpl2, C2046Dp.m13664boximpl(fM13666constructorimpl2), craftAnimButtonsBlockKt$CraftAnimButtonsBlock$stashOffset$2.invoke((CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$stashOffset$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter5, strEmpty8, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    String strEmpty9 = AnyExtensionKt.empty(stringCompanionObject);
                    CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$processOffset$2 craftAnimButtonsBlockKt$CraftAnimButtonsBlock$processOffset$2 = new Function3<Transition.Segment<CraftScreenTypeEnum>, Composer, Integer, FiniteAnimationSpec<C2046Dp>>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$processOffset$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<C2046Dp> invoke(Transition.Segment<CraftScreenTypeEnum> segment, Composer composer3, Integer num) {
                            return invoke(segment, composer3, num.intValue());
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        @NotNull
                        public final FiniteAnimationSpec<C2046Dp> invoke(@NotNull Transition.Segment<CraftScreenTypeEnum> animateDp, @Nullable Composer composer3, int i19) {
                            Intrinsics.checkNotNullParameter(animateDp, "$this$animateDp");
                            composer3.startReplaceableGroup(-524139697);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-524139697, i19, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:150)");
                            }
                            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceableGroup();
                            return tweenSpecTween$default;
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(184732935);
                    TwoWayConverter<C2046Dp, AnimationVector1D> vectorConverter6 = VectorConvertersKt.getVectorConverter(companion);
                    composerStartRestartGroup.startReplaceableGroup(-142660079);
                    CraftScreenTypeEnum craftScreenTypeEnum11 = (CraftScreenTypeEnum) transitionUpdateTransition.getCurrentState();
                    composerStartRestartGroup.startReplaceableGroup(239330721);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(239330721, 0, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:152)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1092889195);
                    if (z) {
                        fM13666constructorimpl3 = C2046Dp.m13666constructorimpl(0);
                    } else if (craftScreenTypeEnum11 == CraftScreenTypeEnum.CRAFT || craftScreenTypeEnum11 == CraftScreenTypeEnum.STASH) {
                        fM13666constructorimpl3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._92wdp, composerStartRestartGroup, 6);
                    } else {
                        if (craftScreenTypeEnum11 != CraftScreenTypeEnum.PROGRESS) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fM13666constructorimpl3 = C2046Dp.m13666constructorimpl(0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    C2046Dp c2046DpM13664boximpl3 = C2046Dp.m13664boximpl(fM13666constructorimpl3);
                    CraftScreenTypeEnum craftScreenTypeEnum12 = (CraftScreenTypeEnum) transitionUpdateTransition.getTargetState();
                    composerStartRestartGroup.startReplaceableGroup(239330721);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(239330721, 0, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:152)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1092889195);
                    if (z) {
                        fM13666constructorimpl4 = C2046Dp.m13666constructorimpl(0);
                    } else if (craftScreenTypeEnum12 == CraftScreenTypeEnum.CRAFT || craftScreenTypeEnum12 == CraftScreenTypeEnum.STASH) {
                        fM13666constructorimpl4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._92wdp, composerStartRestartGroup, 6);
                    } else {
                        if (craftScreenTypeEnum12 != CraftScreenTypeEnum.PROGRESS) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fM13666constructorimpl4 = C2046Dp.m13666constructorimpl(0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State stateCreateTransitionAnimation9 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, c2046DpM13664boximpl3, C2046Dp.m13664boximpl(fM13666constructorimpl4), craftAnimButtonsBlockKt$CraftAnimButtonsBlock$processOffset$2.invoke((CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$processOffset$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter6, strEmpty9, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6));
                    BorderStroke borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._05wdp, composerStartRestartGroup, 6), Color.INSTANCE.m11377getWhite0d7_KjU());
                    Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(modifier, PrimitiveResources_androidKt.dimensionResource(R.dimen._130wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._37wdp, composerStartRestartGroup, 6));
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor);
                    }
                    composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    CraftScreenTypeEnum craftScreenTypeEnum13 = CraftScreenTypeEnum.CRAFT;
                    float fCraftAnimButtonsBlock$lambda$7 = CraftAnimButtonsBlock$lambda$7(stateCreateTransitionAnimation4);
                    float fCraftAnimButtonsBlock$lambda$13 = CraftAnimButtonsBlock$lambda$13(stateCreateTransitionAnimation7);
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_craft, composerStartRestartGroup, 6);
                    long jCraftAnimButtonsBlock$lambda$1 = CraftAnimButtonsBlock$lambda$1(stateCreateTransitionAnimation);
                    composerStartRestartGroup.startReplaceableGroup(-1374643301);
                    z5 = (234881024 & i3) != 67108864 ? z4 : false;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z5 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$1$1$1
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
                                onButtonCraftClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    int i19 = i3 >> 9;
                    int i20 = i19 & 896;
                    int i21 = i5 | 1073741872 | i20;
                    int i22 = i11 & 112;
                    int i23 = i3;
                    boolean z8 = z4;
                    z6 = false;
                    CraftAnimButtonKt.m14971CraftAnimButtoniXod_8E(currentScreen, craftScreenTypeEnum13, z, z2, fCraftAnimButtonsBlock$lambda$7, fCraftAnimButtonsBlock$lambda$13, brush, roundedCornerShapeM8392RoundedCornerShape0680j_4, borderStrokeM7798BorderStrokecXLIe8U, painterPainterResource, jCraftAnimButtonsBlock$lambda$1, str, function0, composerStartRestartGroup, i21 | (i19 & 7168), i22);
                    CraftScreenTypeEnum craftScreenTypeEnum14 = CraftScreenTypeEnum.STASH;
                    float fCraftAnimButtonsBlock$lambda$9 = CraftAnimButtonsBlock$lambda$9(state);
                    float fCraftAnimButtonsBlock$lambda$15 = CraftAnimButtonsBlock$lambda$15(stateCreateTransitionAnimation8);
                    Painter painterPainterResource2 = PainterResources_androidKt.painterResource(R.drawable.ic_stash, composerStartRestartGroup, 6);
                    long jCraftAnimButtonsBlock$lambda$12 = CraftAnimButtonsBlock$lambda$1(stateCreateTransitionAnimation);
                    composerStartRestartGroup.startReplaceableGroup(-1374642644);
                    z7 = (i23 & 1879048192) != 536870912 ? z8 : false;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z7 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$1$2$1
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
                                onButtonStashClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CraftAnimButtonKt.m14971CraftAnimButtoniXod_8E(currentScreen, craftScreenTypeEnum14, z, z3, fCraftAnimButtonsBlock$lambda$9, fCraftAnimButtonsBlock$lambda$15, brush, roundedCornerShapeM8392RoundedCornerShape0680j_4, borderStrokeM7798BorderStrokecXLIe8U, painterPainterResource2, jCraftAnimButtonsBlock$lambda$12, str2, (Function0) objRememberedValue2, composerStartRestartGroup, i21 | ((i23 >> 12) & 7168), (i23 >> 6) & 112);
                    CraftScreenTypeEnum craftScreenTypeEnum15 = CraftScreenTypeEnum.PROGRESS;
                    float fCraftAnimButtonsBlock$lambda$11 = CraftAnimButtonsBlock$lambda$11(stateCreateTransitionAnimation6);
                    float fCraftAnimButtonsBlock$lambda$17 = CraftAnimButtonsBlock$lambda$17(stateCreateTransitionAnimation9);
                    Painter painterPainterResource3 = PainterResources_androidKt.painterResource(R.drawable.ic_progress, composerStartRestartGroup, 6);
                    long jCraftAnimButtonsBlock$lambda$13 = CraftAnimButtonsBlock$lambda$1(stateCreateTransitionAnimation);
                    composerStartRestartGroup.startReplaceableGroup(-1374641989);
                    if ((i13 & 14) == 4) {
                        z6 = z8;
                    }
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!z6 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$1$3$1
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
                                onButtonProgressClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                    CraftAnimButtonKt.m14971CraftAnimButtoniXod_8E(currentScreen, craftScreenTypeEnum15, z, false, fCraftAnimButtonsBlock$lambda$11, fCraftAnimButtonsBlock$lambda$17, brush, roundedCornerShapeM8392RoundedCornerShape0680j_4, borderStrokeM7798BorderStrokecXLIe8U, painterPainterResource3, jCraftAnimButtonsBlock$lambda$13, str3, (Function0) objRememberedValue3, composer2, i5 | 1073744944 | i20, i19 & 112);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else if (i6 != 2) {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f4 = 0.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State stateCreateTransitionAnimation52 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f4), craftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexStash$2.invoke((CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexStash$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter2, strEmpty5, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    String strEmpty62 = AnyExtensionKt.empty(stringCompanionObject);
                    CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexProgress$2 craftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexProgress$22 = new Function3<Transition.Segment<CraftScreenTypeEnum>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexProgress$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<CraftScreenTypeEnum> segment, Composer composer3, Integer num) {
                            return invoke(segment, composer3, num.intValue());
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        @NotNull
                        public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<CraftScreenTypeEnum> animateFloat, @Nullable Composer composer3, int i172) {
                            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                            composer3.startReplaceableGroup(-408311648);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-408311648, i172, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:109)");
                            }
                            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceableGroup();
                            return tweenSpecTween$default;
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-1338768149);
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter32 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                    composerStartRestartGroup.startReplaceableGroup(-142660079);
                    CraftScreenTypeEnum craftScreenTypeEnum52 = (CraftScreenTypeEnum) transitionUpdateTransition.getCurrentState();
                    composerStartRestartGroup.startReplaceableGroup(1147379708);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i7 = iArr[craftScreenTypeEnum52.ordinal()];
                    if (i7 == 1) {
                        f5 = 0.0f;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Float fValueOf32 = Float.valueOf(f5);
                        CraftScreenTypeEnum craftScreenTypeEnum62 = (CraftScreenTypeEnum) transitionUpdateTransition.getTargetState();
                        composerStartRestartGroup.startReplaceableGroup(1147379708);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i8 = iArr[craftScreenTypeEnum62.ordinal()];
                        if (i8 != 1) {
                            f6 = 0.0f;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            State stateCreateTransitionAnimation62 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf32, Float.valueOf(f6), craftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexProgress$22.invoke((CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexProgress$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter32, strEmpty62, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            String strEmpty72 = AnyExtensionKt.empty(stringCompanionObject);
                            CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$craftOffset$2 craftAnimButtonsBlockKt$CraftAnimButtonsBlock$craftOffset$22 = new Function3<Transition.Segment<CraftScreenTypeEnum>, Composer, Integer, FiniteAnimationSpec<C2046Dp>>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$craftOffset$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<C2046Dp> invoke(Transition.Segment<CraftScreenTypeEnum> segment, Composer composer3, Integer num) {
                                    return invoke(segment, composer3, num.intValue());
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                @NotNull
                                public final FiniteAnimationSpec<C2046Dp> invoke(@NotNull Transition.Segment<CraftScreenTypeEnum> animateDp, @Nullable Composer composer3, int i172) {
                                    Intrinsics.checkNotNullParameter(animateDp, "$this$animateDp");
                                    composer3.startReplaceableGroup(-957101760);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-957101760, i172, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:119)");
                                    }
                                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer3.endReplaceableGroup();
                                    return tweenSpecTween$default;
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(184732935);
                            C2046Dp.Companion companion3 = C2046Dp.INSTANCE;
                            TwoWayConverter<C2046Dp, AnimationVector1D> vectorConverter42 = VectorConvertersKt.getVectorConverter(companion3);
                            composerStartRestartGroup.startReplaceableGroup(-142660079);
                            CraftScreenTypeEnum craftScreenTypeEnum72 = (CraftScreenTypeEnum) transitionUpdateTransition.getCurrentState();
                            composerStartRestartGroup.startReplaceableGroup(-1094854638);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(1092888217);
                            fDimensionResource = !z ? C2046Dp.m13666constructorimpl(i9) : C2046Dp.m13666constructorimpl(i9);
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            C2046Dp c2046DpM13664boximpl4 = C2046Dp.m13664boximpl(fDimensionResource);
                            CraftScreenTypeEnum craftScreenTypeEnum82 = (CraftScreenTypeEnum) transitionUpdateTransition.getTargetState();
                            composerStartRestartGroup.startReplaceableGroup(-1094854638);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(1092888217);
                            fDimensionResource2 = !z ? C2046Dp.m13666constructorimpl(i10) : C2046Dp.m13666constructorimpl(i10);
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            State stateCreateTransitionAnimation72 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, c2046DpM13664boximpl4, C2046Dp.m13664boximpl(fDimensionResource2), craftAnimButtonsBlockKt$CraftAnimButtonsBlock$craftOffset$22.invoke((CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$craftOffset$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter42, strEmpty72, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            String strEmpty82 = AnyExtensionKt.empty(stringCompanionObject);
                            CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$stashOffset$2 craftAnimButtonsBlockKt$CraftAnimButtonsBlock$stashOffset$22 = new Function3<Transition.Segment<CraftScreenTypeEnum>, Composer, Integer, FiniteAnimationSpec<C2046Dp>>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$stashOffset$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<C2046Dp> invoke(Transition.Segment<CraftScreenTypeEnum> segment, Composer composer3, Integer num) {
                                    return invoke(segment, composer3, num.intValue());
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                @NotNull
                                public final FiniteAnimationSpec<C2046Dp> invoke(@NotNull Transition.Segment<CraftScreenTypeEnum> animateDp, @Nullable Composer composer3, int i172) {
                                    Intrinsics.checkNotNullParameter(animateDp, "$this$animateDp");
                                    composer3.startReplaceableGroup(103476501);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(103476501, i172, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:133)");
                                    }
                                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer3.endReplaceableGroup();
                                    return tweenSpecTween$default;
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(184732935);
                            TwoWayConverter<C2046Dp, AnimationVector1D> vectorConverter52 = VectorConvertersKt.getVectorConverter(companion3);
                            composerStartRestartGroup.startReplaceableGroup(-142660079);
                            CraftScreenTypeEnum craftScreenTypeEnum92 = (CraftScreenTypeEnum) transitionUpdateTransition.getCurrentState();
                            composerStartRestartGroup.startReplaceableGroup(-34276377);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(1092888664);
                            if (z) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            C2046Dp c2046DpM13664boximpl22 = C2046Dp.m13664boximpl(fM13666constructorimpl);
                            CraftScreenTypeEnum craftScreenTypeEnum102 = (CraftScreenTypeEnum) transitionUpdateTransition.getTargetState();
                            composerStartRestartGroup.startReplaceableGroup(-34276377);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(1092888664);
                            if (z) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            State stateCreateTransitionAnimation82 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, c2046DpM13664boximpl22, C2046Dp.m13664boximpl(fM13666constructorimpl2), craftAnimButtonsBlockKt$CraftAnimButtonsBlock$stashOffset$22.invoke((CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$stashOffset$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter52, strEmpty82, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            String strEmpty92 = AnyExtensionKt.empty(stringCompanionObject);
                            CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$processOffset$2 craftAnimButtonsBlockKt$CraftAnimButtonsBlock$processOffset$22 = new Function3<Transition.Segment<CraftScreenTypeEnum>, Composer, Integer, FiniteAnimationSpec<C2046Dp>>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$processOffset$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<C2046Dp> invoke(Transition.Segment<CraftScreenTypeEnum> segment, Composer composer3, Integer num) {
                                    return invoke(segment, composer3, num.intValue());
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                @NotNull
                                public final FiniteAnimationSpec<C2046Dp> invoke(@NotNull Transition.Segment<CraftScreenTypeEnum> animateDp, @Nullable Composer composer3, int i192) {
                                    Intrinsics.checkNotNullParameter(animateDp, "$this$animateDp");
                                    composer3.startReplaceableGroup(-524139697);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-524139697, i192, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:150)");
                                    }
                                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer3.endReplaceableGroup();
                                    return tweenSpecTween$default;
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(184732935);
                            TwoWayConverter<C2046Dp, AnimationVector1D> vectorConverter62 = VectorConvertersKt.getVectorConverter(companion3);
                            composerStartRestartGroup.startReplaceableGroup(-142660079);
                            CraftScreenTypeEnum craftScreenTypeEnum112 = (CraftScreenTypeEnum) transitionUpdateTransition.getCurrentState();
                            composerStartRestartGroup.startReplaceableGroup(239330721);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(1092889195);
                            if (z) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            C2046Dp c2046DpM13664boximpl32 = C2046Dp.m13664boximpl(fM13666constructorimpl3);
                            CraftScreenTypeEnum craftScreenTypeEnum122 = (CraftScreenTypeEnum) transitionUpdateTransition.getTargetState();
                            composerStartRestartGroup.startReplaceableGroup(239330721);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(1092889195);
                            if (z) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            State stateCreateTransitionAnimation92 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, c2046DpM13664boximpl32, C2046Dp.m13664boximpl(fM13666constructorimpl4), craftAnimButtonsBlockKt$CraftAnimButtonsBlock$processOffset$22.invoke((CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$processOffset$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter62, strEmpty92, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6));
                            BorderStroke borderStrokeM7798BorderStrokecXLIe8U2 = BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._05wdp, composerStartRestartGroup, 6), Color.INSTANCE.m11377getWhite0d7_KjU());
                            Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(modifier, PrimitiveResources_androidKt.dimensionResource(R.dimen._130wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._37wdp, composerStartRestartGroup, 6));
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs2);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                            if (!composerM10870constructorimpl.getInserting()) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                CraftScreenTypeEnum craftScreenTypeEnum132 = CraftScreenTypeEnum.CRAFT;
                                float fCraftAnimButtonsBlock$lambda$72 = CraftAnimButtonsBlock$lambda$7(stateCreateTransitionAnimation4);
                                float fCraftAnimButtonsBlock$lambda$132 = CraftAnimButtonsBlock$lambda$13(stateCreateTransitionAnimation72);
                                Painter painterPainterResource4 = PainterResources_androidKt.painterResource(R.drawable.ic_craft, composerStartRestartGroup, 6);
                                long jCraftAnimButtonsBlock$lambda$14 = CraftAnimButtonsBlock$lambda$1(stateCreateTransitionAnimation);
                                composerStartRestartGroup.startReplaceableGroup(-1374643301);
                                if ((234881024 & i3) != 67108864) {
                                }
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!z5) {
                                    objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$1$1$1
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
                                            onButtonCraftClick.invoke();
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    Function0 function02 = (Function0) objRememberedValue;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    int i192 = i3 >> 9;
                                    int i202 = i192 & 896;
                                    int i212 = i5 | 1073741872 | i202;
                                    int i222 = i11 & 112;
                                    int i232 = i3;
                                    boolean z82 = z4;
                                    z6 = false;
                                    CraftAnimButtonKt.m14971CraftAnimButtoniXod_8E(currentScreen, craftScreenTypeEnum132, z, z2, fCraftAnimButtonsBlock$lambda$72, fCraftAnimButtonsBlock$lambda$132, brush, roundedCornerShapeM8392RoundedCornerShape0680j_42, borderStrokeM7798BorderStrokecXLIe8U2, painterPainterResource4, jCraftAnimButtonsBlock$lambda$14, str, function02, composerStartRestartGroup, i212 | (i192 & 7168), i222);
                                    CraftScreenTypeEnum craftScreenTypeEnum142 = CraftScreenTypeEnum.STASH;
                                    float fCraftAnimButtonsBlock$lambda$92 = CraftAnimButtonsBlock$lambda$9(state);
                                    float fCraftAnimButtonsBlock$lambda$152 = CraftAnimButtonsBlock$lambda$15(stateCreateTransitionAnimation82);
                                    Painter painterPainterResource22 = PainterResources_androidKt.painterResource(R.drawable.ic_stash, composerStartRestartGroup, 6);
                                    long jCraftAnimButtonsBlock$lambda$122 = CraftAnimButtonsBlock$lambda$1(stateCreateTransitionAnimation);
                                    composerStartRestartGroup.startReplaceableGroup(-1374642644);
                                    if ((i232 & 1879048192) != 536870912) {
                                    }
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (!z7) {
                                        objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$1$2$1
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
                                                onButtonStashClick.invoke();
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        composerStartRestartGroup.endReplaceableGroup();
                                        CraftAnimButtonKt.m14971CraftAnimButtoniXod_8E(currentScreen, craftScreenTypeEnum142, z, z3, fCraftAnimButtonsBlock$lambda$92, fCraftAnimButtonsBlock$lambda$152, brush, roundedCornerShapeM8392RoundedCornerShape0680j_42, borderStrokeM7798BorderStrokecXLIe8U2, painterPainterResource22, jCraftAnimButtonsBlock$lambda$122, str2, (Function0) objRememberedValue2, composerStartRestartGroup, i212 | ((i232 >> 12) & 7168), (i232 >> 6) & 112);
                                        CraftScreenTypeEnum craftScreenTypeEnum152 = CraftScreenTypeEnum.PROGRESS;
                                        float fCraftAnimButtonsBlock$lambda$112 = CraftAnimButtonsBlock$lambda$11(stateCreateTransitionAnimation62);
                                        float fCraftAnimButtonsBlock$lambda$172 = CraftAnimButtonsBlock$lambda$17(stateCreateTransitionAnimation92);
                                        Painter painterPainterResource32 = PainterResources_androidKt.painterResource(R.drawable.ic_progress, composerStartRestartGroup, 6);
                                        long jCraftAnimButtonsBlock$lambda$132 = CraftAnimButtonsBlock$lambda$1(stateCreateTransitionAnimation);
                                        composerStartRestartGroup.startReplaceableGroup(-1374641989);
                                        if ((i13 & 14) == 4) {
                                        }
                                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                        if (!z6) {
                                            objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$1$3$1
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
                                                    onButtonProgressClick.invoke();
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composer2 = composerStartRestartGroup;
                                            CraftAnimButtonKt.m14971CraftAnimButtoniXod_8E(currentScreen, craftScreenTypeEnum152, z, false, fCraftAnimButtonsBlock$lambda$112, fCraftAnimButtonsBlock$lambda$172, brush, roundedCornerShapeM8392RoundedCornerShape0680j_42, borderStrokeM7798BorderStrokecXLIe8U2, painterPainterResource32, jCraftAnimButtonsBlock$lambda$132, str3, (Function0) objRememberedValue3, composer2, i5 | 1073744944 | i202, i192 & 112);
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    f4 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State stateCreateTransitionAnimation522 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f4), craftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexStash$2.invoke((CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexStash$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter2, strEmpty5, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    String strEmpty622 = AnyExtensionKt.empty(stringCompanionObject);
                    CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexProgress$2 craftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexProgress$222 = new Function3<Transition.Segment<CraftScreenTypeEnum>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt$CraftAnimButtonsBlock$zIndexProgress$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<CraftScreenTypeEnum> segment, Composer composer3, Integer num) {
                            return invoke(segment, composer3, num.intValue());
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        @NotNull
                        public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<CraftScreenTypeEnum> animateFloat, @Nullable Composer composer3, int i172) {
                            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                            composer3.startReplaceableGroup(-408311648);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-408311648, i172, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlock.<anonymous> (CraftAnimButtonsBlock.kt:109)");
                            }
                            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceableGroup();
                            return tweenSpecTween$default;
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-1338768149);
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter322 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                    composerStartRestartGroup.startReplaceableGroup(-142660079);
                    CraftScreenTypeEnum craftScreenTypeEnum522 = (CraftScreenTypeEnum) transitionUpdateTransition.getCurrentState();
                    composerStartRestartGroup.startReplaceableGroup(1147379708);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i7 = iArr[craftScreenTypeEnum522.ordinal()];
                    if (i7 == 1) {
                    }
                }
            } else if (i16 != 2) {
                if (i16 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f3 = 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf22 = Float.valueOf(f3);
                CraftScreenTypeEnum craftScreenTypeEnum42 = (CraftScreenTypeEnum) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(470571850);
                if (ComposerKt.isTraceInProgress()) {
                }
                i6 = iArr[craftScreenTypeEnum42.ordinal()];
                if (i6 == 1) {
                }
            } else {
                f3 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf222 = Float.valueOf(f3);
                CraftScreenTypeEnum craftScreenTypeEnum422 = (CraftScreenTypeEnum) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(470571850);
                if (ComposerKt.isTraceInProgress()) {
                }
                i6 = iArr[craftScreenTypeEnum422.ordinal()];
                if (i6 == 1) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt.CraftAnimButtonsBlock.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i24) {
                    CraftAnimButtonsBlockKt.CraftAnimButtonsBlock(modifier, currentScreen, str, str2, str3, z, z2, z3, onButtonCraftClick, onButtonStashClick, onButtonProgressClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void CraftAnimButtonsBlockPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1750553847);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1750553847, i, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockPreview (CraftAnimButtonsBlock.kt:225)");
            }
            CraftAnimButtonsBlock(Modifier.INSTANCE, CraftScreenTypeEnum.CRAFT, null, null, null, false, false, true, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt.CraftAnimButtonsBlockPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt.CraftAnimButtonsBlockPreview.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt.CraftAnimButtonsBlockPreview.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 920350134, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftAnimButtonsBlockKt.CraftAnimButtonsBlockPreview.4
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
                    CraftAnimButtonsBlockKt.CraftAnimButtonsBlockPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final long CraftAnimButtonsBlock$lambda$1(State<Color> state) {
        return state.getValue().m11350unboximpl();
    }

    public static final long CraftAnimButtonsBlock$lambda$3(State<Color> state) {
        return state.getValue().m11350unboximpl();
    }

    public static final long CraftAnimButtonsBlock$lambda$5(State<Color> state) {
        return state.getValue().m11350unboximpl();
    }

    public static final float CraftAnimButtonsBlock$lambda$7(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final float CraftAnimButtonsBlock$lambda$9(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final float CraftAnimButtonsBlock$lambda$11(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final float CraftAnimButtonsBlock$lambda$13(State<C2046Dp> state) {
        return state.getValue().m13680unboximpl();
    }

    public static final float CraftAnimButtonsBlock$lambda$15(State<C2046Dp> state) {
        return state.getValue().m13680unboximpl();
    }

    public static final float CraftAnimButtonsBlock$lambda$17(State<C2046Dp> state) {
        return state.getValue().m13680unboximpl();
    }
}
