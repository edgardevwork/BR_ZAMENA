package com.blackhub.bronline.game.p019ui.fishing;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
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
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
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
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.gui.fishing.data.FishingBaitObj;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.progressbar.VerticalProgressBarKt;
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
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FishingButtonWithDescriptionUi.kt */
@Metadata(m7104d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\u001a;\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\n\u001a?\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\rX\u008a\u008e\u0002"}, m7105d2 = {"FishingButtonWithDescriptionUi", "", "modifier", "Landroidx/compose/ui/Modifier;", "fishingObj", "Lcom/blackhub/bronline/game/gui/fishing/data/FishingBaitObj;", "isVisibleDescription", "", "onClickDescription", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lcom/blackhub/bronline/game/gui/fishing/data/FishingBaitObj;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "FishingDescription", "title", "", "description", "titleStyle", "Landroidx/compose/ui/text/TextStyle;", "subtitleStyle", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;II)V", "PreviewFishingButtonWithDescriptionUi", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "baitTimer", "", "newValueOfTime"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFishingButtonWithDescriptionUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FishingButtonWithDescriptionUi.kt\ncom/blackhub/bronline/game/ui/fishing/FishingButtonWithDescriptionUiKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,212:1\n154#2:213\n154#2:214\n154#2:274\n154#2:275\n154#2:276\n154#2:363\n1116#3,6:215\n1116#3,6:221\n1116#3,6:263\n1116#3,6:312\n74#4:227\n87#5,6:228\n93#5:262\n97#5:273\n87#5,6:277\n93#5:311\n97#5:362\n79#6,11:234\n92#6:272\n79#6,11:283\n79#6,11:324\n92#6:356\n92#6:361\n456#7,8:245\n464#7,3:259\n467#7,3:269\n456#7,8:294\n464#7,3:308\n456#7,8:335\n464#7,3:349\n467#7,3:353\n467#7,3:358\n3737#8,6:253\n3737#8,6:302\n3737#8,6:343\n74#9,6:318\n80#9:352\n84#9:357\n75#10:364\n108#10,2:365\n81#11:367\n107#11,2:368\n*S KotlinDebug\n*F\n+ 1 FishingButtonWithDescriptionUi.kt\ncom/blackhub/bronline/game/ui/fishing/FishingButtonWithDescriptionUiKt\n*L\n62#1:213\n63#1:214\n141#1:274\n142#1:275\n143#1:276\n203#1:363\n65#1:215,6\n66#1:221,6\n95#1:263,6\n154#1:312,6\n70#1:227\n90#1:228,6\n90#1:262\n90#1:273\n145#1:277,6\n145#1:311\n145#1:362\n90#1:234,11\n90#1:272\n145#1:283,11\n166#1:324,11\n166#1:356\n145#1:361\n90#1:245,8\n90#1:259,3\n90#1:269,3\n145#1:294,8\n145#1:308,3\n166#1:335,8\n166#1:349,3\n166#1:353,3\n145#1:358,3\n90#1:253,6\n145#1:302,6\n166#1:343,6\n166#1:318,6\n166#1:352\n166#1:357\n65#1:364\n65#1:365,2\n66#1:367\n66#1:368,2\n*E\n"})
/* loaded from: classes3.dex */
public final class FishingButtonWithDescriptionUiKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0249  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FishingButtonWithDescriptionUi(@Nullable Modifier modifier, @Nullable FishingBaitObj fishingBaitObj, boolean z, @Nullable Function0<Unit> function0, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        int i4;
        Function0<Unit> function02;
        Modifier modifier3;
        final FishingBaitObj fishingBaitObj2;
        boolean z3;
        final Function0<Unit> function03;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final ImageBitmap bitmapRender;
        String title;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z4;
        Object objRememberedValue3;
        final FishingBaitObj fishingBaitObj3;
        final boolean z5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-897616814);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 896) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                if (i6 != 2 || (i3 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i6 == 0) {
                            fishingBaitObj2 = new FishingBaitObj(null, 0, null, null, null, 0.0f, null, 0, 0, null, 1023, null);
                            i3 &= -113;
                        } else {
                            fishingBaitObj2 = fishingBaitObj;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i4 == 0) {
                            function03 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingButtonWithDescriptionUiKt.FishingButtonWithDescriptionUi.1
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }
                            };
                            z3 = z2;
                        } else {
                            z3 = z2;
                            function03 = function02;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if (i6 != 0) {
                            i3 &= -113;
                        }
                        modifier3 = modifier2;
                        z3 = z2;
                        function03 = function02;
                        fishingBaitObj2 = fishingBaitObj;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-897616814, i3, -1, "com.blackhub.bronline.game.ui.fishing.FishingButtonWithDescriptionUi (FishingButtonWithDescriptionUi.kt:59)");
                    }
                    float fM13666constructorimpl = C2046Dp.m13666constructorimpl(2);
                    final float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(5);
                    final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._32sdp, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1454096845);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(fishingBaitObj2.getTime());
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1454096771);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("0:0", null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    MutableState mutableState = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    bitmapRender = fishingBaitObj2.getBitmapRender();
                    composerStartRestartGroup.startReplaceableGroup(-1454096688);
                    if (bitmapRender == null) {
                        Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        bitmapRender = AndroidImageBitmap_androidKt.asImageBitmap(BitmapUtilsKt.getBitmap(resources, R.drawable.img_logo_br_big));
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new C55622(fishingBaitObj2, mutableIntState, mutableState, null), composerStartRestartGroup, 70);
                    composerStartRestartGroup.startReplaceableGroup(-1454096220);
                    if (fishingBaitObj2.getTime() == 0) {
                        title = StringResources_androidKt.stringResource(R.string.common_str_with_str_in_baskets, new Object[]{fishingBaitObj2.getTitle(), FishingButtonWithDescriptionUi$lambda$4(mutableState)}, composerStartRestartGroup, 70);
                    } else {
                        title = fishingBaitObj2.getTitle();
                    }
                    String str = title;
                    composerStartRestartGroup.endReplaceableGroup();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier3);
                    Modifier modifier4 = modifier3;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(fM13666constructorimpl);
                    composerStartRestartGroup.startReplaceableGroup(-1784366056);
                    z4 = (i3 & 7168) != 2048;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!z4 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingButtonWithDescriptionUiKt$FishingButtonWithDescriptionUi$3$1$1
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
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0<Unit> function04 = function03;
                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, false, false, false, false, roundedCornerShapeM8392RoundedCornerShape0680j_4, 0, 0L, null, (Function0) objRememberedValue3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1745421887, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingButtonWithDescriptionUiKt$FishingButtonWithDescriptionUi$3$2
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
                        public final void invoke(@Nullable Composer composer2, int i8) {
                            if ((i8 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1745421887, i8, -1, "com.blackhub.bronline.game.ui.fishing.FishingButtonWithDescriptionUi.<anonymous>.<anonymous> (FishingButtonWithDescriptionUi.kt:97)");
                                }
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion3, fDimensionResource), fDimensionResource);
                                float f = fDimensionResource;
                                FishingBaitObj fishingBaitObj4 = fishingBaitObj2;
                                ImageBitmap imageBitmap = bitmapRender;
                                float f2 = fM13666constructorimpl2;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
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
                                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                VerticalProgressBarKt.m15104VerticalProgressBar6a0pyJM(fishingBaitObj4.getPercent(), SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion3, f), f), PrimitiveResources_androidKt.dimensionResource(R.dimen._5sdp, composer2, 6), composer2, 0, 0);
                                ImageKt.m7827Image5hnEew(imageBitmap, null, PaddingKt.m8123padding3ABfNKs(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), f2), null, null, 0.0f, null, 0, composer2, 440, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER);
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
                    }), composerStartRestartGroup, 0, 3072, 3839);
                    composerStartRestartGroup.startReplaceableGroup(-1454094868);
                    if (z3) {
                        FishingDescription(null, str, fishingBaitObj2.getDescription(), null, null, composerStartRestartGroup, 0, 25);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function02 = function04;
                    fishingBaitObj3 = fishingBaitObj2;
                    z5 = z3;
                    modifier2 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    fishingBaitObj3 = fishingBaitObj;
                    z5 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = modifier2;
                    final Function0<Unit> function05 = function02;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingButtonWithDescriptionUiKt.FishingButtonWithDescriptionUi.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i8) {
                            FishingButtonWithDescriptionUiKt.FishingButtonWithDescriptionUi(modifier5, fishingBaitObj3, z5, function05, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function02 = function0;
            if (i6 != 2) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i4 == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    float fM13666constructorimpl3 = C2046Dp.m13666constructorimpl(2);
                    final float fM13666constructorimpl22 = C2046Dp.m13666constructorimpl(5);
                    final float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._32sdp, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1454096845);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1454096771);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    MutableState mutableState2 = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    bitmapRender = fishingBaitObj2.getBitmapRender();
                    composerStartRestartGroup.startReplaceableGroup(-1454096688);
                    if (bitmapRender == null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new C55622(fishingBaitObj2, mutableIntState2, mutableState2, null), composerStartRestartGroup, 70);
                    composerStartRestartGroup.startReplaceableGroup(-1454096220);
                    if (fishingBaitObj2.getTime() == 0) {
                    }
                    String str2 = title;
                    composerStartRestartGroup.endReplaceableGroup();
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier3);
                    Modifier modifier42 = modifier3;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl.getInserting()) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(fM13666constructorimpl3);
                        composerStartRestartGroup.startReplaceableGroup(-1784366056);
                        if ((i3 & 7168) != 2048) {
                        }
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!z4) {
                            objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingButtonWithDescriptionUiKt$FishingButtonWithDescriptionUi$3$1$1
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
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0<Unit> function042 = function03;
                            ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, false, false, false, false, roundedCornerShapeM8392RoundedCornerShape0680j_42, 0, 0L, null, (Function0) objRememberedValue3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1745421887, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingButtonWithDescriptionUiKt$FishingButtonWithDescriptionUi$3$2
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
                                public final void invoke(@Nullable Composer composer2, int i8) {
                                    if ((i8 & 11) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1745421887, i8, -1, "com.blackhub.bronline.game.ui.fishing.FishingButtonWithDescriptionUi.<anonymous>.<anonymous> (FishingButtonWithDescriptionUi.kt:97)");
                                        }
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion3, fDimensionResource2), fDimensionResource2);
                                        float f = fDimensionResource2;
                                        FishingBaitObj fishingBaitObj4 = fishingBaitObj2;
                                        ImageBitmap imageBitmap = bitmapRender;
                                        float f2 = fM13666constructorimpl22;
                                        composer2.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                        composer2.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor22 = companion4.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor22);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion4.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        VerticalProgressBarKt.m15104VerticalProgressBar6a0pyJM(fishingBaitObj4.getPercent(), SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion3, f), f), PrimitiveResources_androidKt.dimensionResource(R.dimen._5sdp, composer2, 6), composer2, 0, 0);
                                        ImageKt.m7827Image5hnEew(imageBitmap, null, PaddingKt.m8123padding3ABfNKs(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), f2), null, null, 0.0f, null, 0, composer2, 440, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER);
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
                            }), composerStartRestartGroup, 0, 3072, 3839);
                            composerStartRestartGroup.startReplaceableGroup(-1454094868);
                            if (z3) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function02 = function042;
                            fishingBaitObj3 = fishingBaitObj2;
                            z5 = z3;
                            modifier2 = modifier42;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z2 = z;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function02 = function0;
        if (i6 != 2) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: FishingButtonWithDescriptionUi.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.fishing.FishingButtonWithDescriptionUiKt$FishingButtonWithDescriptionUi$2", m7120f = "FishingButtonWithDescriptionUi.kt", m7121i = {}, m7122l = {77}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingButtonWithDescriptionUiKt$FishingButtonWithDescriptionUi$2 */
    /* loaded from: classes7.dex */
    public static final class C55622 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MutableIntState $baitTimer$delegate;
        public final /* synthetic */ FishingBaitObj $fishingObj;
        public final /* synthetic */ MutableState<String> $newValueOfTime$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55622(FishingBaitObj fishingBaitObj, MutableIntState mutableIntState, MutableState<String> mutableState, Continuation<? super C55622> continuation) {
            super(2, continuation);
            this.$fishingObj = fishingBaitObj;
            this.$baitTimer$delegate = mutableIntState;
            this.$newValueOfTime$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C55622(this.$fishingObj, this.$baitTimer$delegate, this.$newValueOfTime$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C55622) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0038 -> B:15:0x003b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$fishingObj.getTime() != 0) {
                    if (FishingButtonWithDescriptionUiKt.FishingButtonWithDescriptionUi$lambda$1(this.$baitTimer$delegate) > 0) {
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FishingButtonWithDescriptionUiKt.FishingButtonWithDescriptionUi$lambda$2(this.$baitTimer$delegate, FishingButtonWithDescriptionUiKt.FishingButtonWithDescriptionUi$lambda$1(this.$baitTimer$delegate) - 1);
            FishingButtonWithDescriptionUiKt.FishingButtonWithDescriptionUi$lambda$5(this.$newValueOfTime$delegate, IntExtensionKt.parseTimeToStringWithFormat(FishingButtonWithDescriptionUiKt.FishingButtonWithDescriptionUi$lambda$1(this.$baitTimer$delegate)));
            if (FishingButtonWithDescriptionUiKt.FishingButtonWithDescriptionUi$lambda$1(this.$baitTimer$delegate) > 0) {
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(1, DurationUnit.SECONDS);
                this.label = 1;
                if (DelayKt.m17189delayVtjQ1oo(duration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                FishingButtonWithDescriptionUiKt.FishingButtonWithDescriptionUi$lambda$2(this.$baitTimer$delegate, FishingButtonWithDescriptionUiKt.FishingButtonWithDescriptionUi$lambda$1(this.$baitTimer$delegate) - 1);
                FishingButtonWithDescriptionUiKt.FishingButtonWithDescriptionUi$lambda$5(this.$newValueOfTime$delegate, IntExtensionKt.parseTimeToStringWithFormat(FishingButtonWithDescriptionUiKt.FishingButtonWithDescriptionUi$lambda$1(this.$baitTimer$delegate)));
                if (FishingButtonWithDescriptionUiKt.FishingButtonWithDescriptionUi$lambda$1(this.$baitTimer$delegate) > 0) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void FishingDescription(Modifier modifier, String str, String str2, TextStyle textStyle, TextStyle textStyle2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str3;
        String str4;
        TextStyle textStyle3;
        TextStyle textStyle4;
        Modifier modifier3;
        String strEmpty;
        String strEmpty2;
        int i4;
        final TextStyle textStyleM14810montserratBold9ssp67j0QOw;
        TextStyle textStyleM14847montserratRegular9ssp67j0QOw;
        int i5;
        Modifier modifier4;
        final String str5;
        final String str6;
        final TextStyle textStyle5;
        Composer composerStartRestartGroup = composer.startRestartGroup(1608740365);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                str3 = str;
                int i7 = composerStartRestartGroup.changed(str3) ? 32 : 16;
                i3 |= i7;
            } else {
                str3 = str;
            }
            i3 |= i7;
        } else {
            str3 = str;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                str4 = str2;
                int i8 = composerStartRestartGroup.changed(str4) ? 256 : 128;
                i3 |= i8;
            } else {
                str4 = str2;
            }
            i3 |= i8;
        } else {
            str4 = str2;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                textStyle3 = textStyle;
                int i9 = composerStartRestartGroup.changed(textStyle3) ? 2048 : 1024;
                i3 |= i9;
            } else {
                textStyle3 = textStyle;
            }
            i3 |= i9;
        } else {
            textStyle3 = textStyle;
        }
        if ((57344 & i) == 0) {
            textStyle4 = textStyle2;
            i3 |= ((i2 & 16) == 0 && composerStartRestartGroup.changed(textStyle4)) ? 16384 : 8192;
        } else {
            textStyle4 = textStyle2;
        }
        if ((46811 & i3) != 9362 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                    i3 &= -113;
                } else {
                    strEmpty = str3;
                }
                if ((i2 & 4) != 0) {
                    strEmpty2 = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                    i3 &= -897;
                } else {
                    strEmpty2 = str4;
                }
                if ((i2 & 8) != 0) {
                    i4 = i3 & (-7169);
                    textStyleM14810montserratBold9ssp67j0QOw = TypographyStyle.INSTANCE.m14810montserratBold9ssp67j0QOw(0L, TextAlign.INSTANCE.m13563getStarte0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13);
                } else {
                    i4 = i3;
                    textStyleM14810montserratBold9ssp67j0QOw = textStyle3;
                }
                if ((i2 & 16) != 0) {
                    textStyleM14847montserratRegular9ssp67j0QOw = TypographyStyle.INSTANCE.m14847montserratRegular9ssp67j0QOw(0L, TextAlign.INSTANCE.m13563getStarte0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13);
                    i5 = i4 & (-57345);
                } else {
                    textStyleM14847montserratRegular9ssp67j0QOw = textStyle2;
                    i5 = i4;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                modifier3 = modifier2;
                strEmpty = str3;
                strEmpty2 = str4;
                textStyleM14847montserratRegular9ssp67j0QOw = textStyle4;
                i5 = i3;
                textStyleM14810montserratBold9ssp67j0QOw = textStyle3;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1608740365, i5, -1, "com.blackhub.bronline.game.ui.fishing.FishingDescription (FishingButtonWithDescriptionUi.kt:138)");
            }
            final long jColorResource = ColorResources_androidKt.colorResource(R.color.black_50, composerStartRestartGroup, 6);
            final float fM13666constructorimpl = C2046Dp.m13666constructorimpl(15);
            float f = 5;
            float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(f);
            float fM13666constructorimpl3 = C2046Dp.m13666constructorimpl(f);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier3);
            modifier4 = modifier3;
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
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion3, fM13666constructorimpl), fM13666constructorimpl);
            composerStartRestartGroup.startReplaceableGroup(-1464220230);
            boolean zChanged = composerStartRestartGroup.changed(jColorResource);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingButtonWithDescriptionUiKt$FishingDescription$1$1$1
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
                        Path Path = AndroidPath_androidKt.Path();
                        float f2 = fM13666constructorimpl;
                        Path.moveTo(0.0f, Canvas.mo7874toPx0680j_4(f2) / 2.0f);
                        Path.lineTo(Canvas.mo7874toPx0680j_4(f2), 0.0f);
                        Path.lineTo(Canvas.mo7874toPx0680j_4(f2), Canvas.mo7874toPx0680j_4(f2));
                        DrawScope.m11880drawPathLG529CI$default(Canvas, Path, jColorResource, 0.0f, null, null, 0, 60, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM8158height3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, 6);
            Modifier modifierM8123padding3ABfNKs = PaddingKt.m8123padding3ABfNKs(BackgroundKt.background$default(companion3, Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_50, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(fM13666constructorimpl2, 0.0f, 0.0f, fM13666constructorimpl2, 6, null), 0.0f, 4, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._4sdp, composerStartRestartGroup, 6));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8123padding3ABfNKs);
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
            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i10 = i5;
            TextKt.m10024Text4IGK_g(strEmpty, PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM13666constructorimpl3, 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14810montserratBold9ssp67j0QOw, composerStartRestartGroup, ((i5 >> 3) & 14) | 48, (i5 << 9) & 3670016, 65532);
            TextKt.m10024Text4IGK_g(strEmpty2, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14847montserratRegular9ssp67j0QOw, composerStartRestartGroup, ((i10 >> 6) & 14) | 48, (i10 << 6) & 3670016, 65532);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str5 = strEmpty;
            str6 = strEmpty2;
            textStyle5 = textStyleM14847montserratRegular9ssp67j0QOw;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
            str5 = str3;
            str6 = str4;
            textStyleM14810montserratBold9ssp67j0QOw = textStyle3;
            textStyle5 = textStyle4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingButtonWithDescriptionUiKt.FishingDescription.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i11) {
                    FishingButtonWithDescriptionUiKt.FishingDescription(modifier5, str5, str6, textStyleM14810montserratBold9ssp67j0QOw, textStyle5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "FishingButtonWithDescriptionUi")
    public static final void PreviewFishingButtonWithDescriptionUi(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1093750018);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1093750018, i, -1, "com.blackhub.bronline.game.ui.fishing.PreviewFishingButtonWithDescriptionUi (FishingButtonWithDescriptionUi.kt:200)");
            }
            FishingButtonWithDescriptionUi(SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, C2046Dp.m13666constructorimpl(300)), new FishingBaitObj("title 1", 0, "description 1 dsadsa dsadsad sadsadsa dsadsa dsa description 1 dsadsa dsadsad sadsadsa dsadsa dsa", null, null, 0.85f, "ic_fish_tackle", 0, 2, null, 666, null), false, null, composerStartRestartGroup, 70, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingButtonWithDescriptionUiKt.PreviewFishingButtonWithDescriptionUi.1
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
                    FishingButtonWithDescriptionUiKt.PreviewFishingButtonWithDescriptionUi(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final int FishingButtonWithDescriptionUi$lambda$1(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    public static final void FishingButtonWithDescriptionUi$lambda$2(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
    }

    public static final String FishingButtonWithDescriptionUi$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final void FishingButtonWithDescriptionUi$lambda$5(MutableState<String> mutableState, String str) {
        mutableState.setValue(str);
    }
}
