package com.blackhub.bronline.game.p019ui.blackpass.uiblock;

import android.graphics.Bitmap;
import androidx.annotation.ColorRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.layout.ContentScale;
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
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.progressbar.ProgressBarHorizontalCustomKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassProgressBar.kt */
@SourceDebugExtension({"SMAP\nBlackPassProgressBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassProgressBar.kt\ncom/blackhub/bronline/game/ui/blackpass/uiblock/BlackPassProgressBarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,226:1\n64#2:227\n64#2:228\n1116#3,6:229\n69#4,5:235\n74#4:268\n68#4,6:269\n74#4:303\n78#4:309\n69#4,5:310\n74#4:343\n78#4:348\n69#4,5:349\n74#4:382\n78#4:387\n78#4:392\n79#5,11:240\n79#5,11:275\n92#5:308\n79#5,11:315\n92#5:347\n79#5,11:354\n92#5:386\n92#5:391\n456#6,8:251\n464#6,3:265\n456#6,8:286\n464#6,3:300\n467#6,3:305\n456#6,8:326\n464#6,3:340\n467#6,3:344\n456#6,8:365\n464#6,3:379\n467#6,3:383\n467#6,3:388\n3737#7,6:259\n3737#7,6:294\n3737#7,6:334\n3737#7,6:373\n154#8:304\n75#9:393\n*S KotlinDebug\n*F\n+ 1 BlackPassProgressBar.kt\ncom/blackhub/bronline/game/ui/blackpass/uiblock/BlackPassProgressBarKt\n*L\n62#1:227\n64#1:228\n66#1:229,6\n76#1:235,5\n76#1:268\n81#1:269,6\n81#1:303\n81#1:309\n105#1:310,5\n105#1:343\n105#1:348\n139#1:349,5\n139#1:382\n139#1:387\n76#1:392\n76#1:240,11\n81#1:275,11\n81#1:308\n105#1:315,11\n105#1:347\n139#1:354,11\n139#1:386\n76#1:391\n76#1:251,8\n76#1:265,3\n81#1:286,8\n81#1:300,3\n81#1:305,3\n105#1:326,8\n105#1:340,3\n105#1:344,3\n139#1:365,8\n139#1:379,3\n139#1:383,3\n76#1:388,3\n76#1:259,6\n81#1:294,6\n105#1:334,6\n139#1:373,6\n94#1:304\n66#1:393\n*E\n"})
/* loaded from: classes.dex */
public final class BlackPassProgressBarKt {
    public static final float STRIP_SCALE = 1.015f;

    /* JADX WARN: Removed duplicated region for block: B:106:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8 A[PHI: r10
  0x00e8: PHI (r10v18 int) = (r10v5 int), (r10v19 int) binds: [B:40:0x00e6, B:36:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0410  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: BlackPassProgressBar-BXK5RNM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14899BlackPassProgressBarBXK5RNM(@Nullable Modifier modifier, final int i, @Nullable final Bitmap bitmap, final boolean z, final boolean z2, @ColorRes int i2, final int i3, float f, float f2, boolean z3, @NotNull final Function0<Unit> onClickPlusBtn, @Nullable Composer composer, final int i4, final int i5, final int i6) {
        float fDimensionResource;
        int i7;
        float fDimensionResource2;
        float fM13666constructorimpl;
        int i8;
        boolean z4;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM10870constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        float f3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClickPlusBtn, "onClickPlusBtn");
        Composer composerStartRestartGroup = composer.startRestartGroup(217871944);
        Modifier modifier2 = (i6 & 1) != 0 ? Modifier.INSTANCE : modifier;
        int i9 = (i6 & 32) != 0 ? R.color.yellow : i2;
        if ((i6 & 128) != 0) {
            i7 = i4 & (-29360129);
            fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composerStartRestartGroup, 6);
        } else {
            fDimensionResource = f;
            i7 = i4;
        }
        if ((i6 & 256) != 0) {
            i7 &= -234881025;
            fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._28sdp, composerStartRestartGroup, 6);
        } else {
            fDimensionResource2 = f2;
        }
        int i10 = i7;
        boolean z5 = (i6 & 512) != 0 ? true : z3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(217871944, i10, i5, "com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassProgressBar (BlackPassProgressBar.kt:56)");
        }
        SolidColor solidColor = new SolidColor(ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6), null);
        SolidColor solidColor2 = new SolidColor(ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6), null);
        SolidColor solidColor3 = new SolidColor(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6), null);
        if (i == 1 || z5) {
            composerStartRestartGroup.startReplaceableGroup(743241911);
            fM13666constructorimpl = C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6));
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(743241971);
            fM13666constructorimpl = C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6));
            composerStartRestartGroup.endReplaceableGroup();
        }
        composerStartRestartGroup.startReplaceableGroup(743242045);
        if (((i4 & 3670016) ^ 1572864) > 1048576) {
            i8 = i3;
            if (composerStartRestartGroup.changed(i8)) {
                z4 = true;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(i8 >= 50 ? R.color.transparent : i9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment center = companion.getCenter();
            float f4 = fDimensionResource2;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            final BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(companion3, fDimensionResource);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
            final float f5 = fDimensionResource;
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (!composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            final float f6 = fM13666constructorimpl;
            final Modifier modifier3 = modifier2;
            ProgressBarHorizontalCustomKt.m15101ProgressBarHorizontalCustomggYRBCk(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), i3, 100, 0, solidColor2, solidColor, solidColor2, 0.0f, null, solidColor3, C2046Dp.m13666constructorimpl(0), 0.0f, false, null, false, 0, 0, 1.015f, 0.0f, true, ContentScale.INSTANCE.getFillWidth(), false, 0, composerStartRestartGroup, ((i10 >> 15) & 112) | 100663686, 817914246, 54, 4565128);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (!z) {
                composerStartRestartGroup.startReplaceableGroup(-1099205985);
                Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(BorderKt.m7782borderxT4_qwU(ComposeExtensionKt.m14410shadowo6VuwKU(SizeKt.m8172size3ABfNKs(companion3, f4), (242 & 1) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6), (242 & 2) != 0 ? 1.0f : 0.0f, (242 & 4) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6), (242 & 8) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composerStartRestartGroup, 6), (242 & 16) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 32) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 64) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 128) != 0 ? Modifier.INSTANCE : null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape()), ColorResources_androidKt.colorResource(R.color.black_gray_blue, composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                Alignment center2 = companion.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
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
                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, companion2.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxKt.Box(ComposeExtensionKt.m14410shadowo6VuwKU(SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6)), (242 & 1) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6), (242 & 2) != 0 ? 1.0f : 0.0f, (242 & 4) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6), (242 & 8) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._9wdp, composerStartRestartGroup, 6), (242 & 16) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 32) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 64) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 128) != 0 ? Modifier.INSTANCE : null), composerStartRestartGroup, 0);
                ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap, SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._26wdp, composerStartRestartGroup, 6)), null, null, 0.0f, null, 0, composerStartRestartGroup, 8, 124);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                f3 = f4;
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1099204481);
                Modifier modifierM7770backgroundbw27NRU2 = BackgroundKt.m7770backgroundbw27NRU(BorderKt.m7782borderxT4_qwU(SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._22wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(mutableIntState.getIntValue(), composerStartRestartGroup, 0), RoundedCornerShapeKt.getCircleShape()), ColorResources_androidKt.colorResource(R.color.black_gray_blue, composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                Alignment center3 = companion.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU2);
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
                Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy4, companion2.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxKt.Box(ComposeExtensionKt.m14410shadowo6VuwKU(SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composerStartRestartGroup, 6)), (242 & 1) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6), (242 & 2) != 0 ? 1.0f : 0.0f, (242 & 4) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6), (242 & 8) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), (242 & 16) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 32) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 64) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 128) != 0 ? Modifier.INSTANCE : null), composerStartRestartGroup, 0);
                f3 = f4;
                composer2 = composerStartRestartGroup;
                TextKt.m10024Text4IGK_g(String.valueOf(i), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._11wsp, 0L, 0, 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 126), composer2, 0, 0, 65534);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            }
            ComposeExtensionKt.IfTrue(Boolean.valueOf(z2), ComposableLambdaKt.composableLambda(composer2, -170728406, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassProgressBarKt$BlackPassProgressBar$1$4
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
                public final void invoke(@Nullable Composer composer3, int i11) {
                    if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-170728406, i11, -1, "com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassProgressBar.<anonymous>.<anonymous> (BlackPassProgressBar.kt:168)");
                        }
                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(OffsetKt.m8084offsetVpY3zN4$default(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), f6, 0.0f, 2, null), null, false, null, false, false, false, false, null, 0, 0L, null, onClickPlusBtn, ComposableSingletons$BlackPassProgressBarKt.INSTANCE.m14901getLambda1$app_siteRelease(), composer3, 0, 3072, 4094);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, ((i10 >> 12) & 14) | 48);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final int i11 = i9;
                final float f7 = f3;
                final boolean z6 = z5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassProgressBarKt$BlackPassProgressBar$2
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
                        BlackPassProgressBarKt.m14899BlackPassProgressBarBXK5RNM(modifier3, i, bitmap, z, z2, i11, i3, f5, f7, z6, onClickPlusBtn, composer3, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                    }
                });
                return;
            }
            return;
        }
        i8 = i3;
        if ((i4 & 1572864) != 1048576) {
            z4 = false;
        }
        objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (!z4) {
            objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(i8 >= 50 ? R.color.transparent : i9);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
        Alignment.Companion companion4 = Alignment.INSTANCE;
        Alignment center4 = companion4.getCenter();
        float f42 = fDimensionResource2;
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center4, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor5 = companion22.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
        }
        composerStartRestartGroup.startReusableNode();
        if (!composerStartRestartGroup.getInserting()) {
        }
        composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy5, companion22.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap5, companion22.getSetResolvedCompositionLocals());
        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
        if (!composerM10870constructorimpl.getInserting()) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        final BoxScope boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        Modifier.Companion companion32 = Modifier.INSTANCE;
        Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(companion32, fDimensionResource);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composerStartRestartGroup, 0);
        final float f52 = fDimensionResource;
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
        }
        composerStartRestartGroup.startReusableNode();
        if (!composerStartRestartGroup.getInserting()) {
        }
        composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
        if (!composerM10870constructorimpl2.getInserting()) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        final float f62 = fM13666constructorimpl;
        final Modifier modifier32 = modifier2;
        ProgressBarHorizontalCustomKt.m15101ProgressBarHorizontalCustomggYRBCk(SizeKt.fillMaxSize$default(companion32, 0.0f, 1, null), i3, 100, 0, solidColor2, solidColor, solidColor2, 0.0f, null, solidColor3, C2046Dp.m13666constructorimpl(0), 0.0f, false, null, false, 0, 0, 1.015f, 0.0f, true, ContentScale.INSTANCE.getFillWidth(), false, 0, composerStartRestartGroup, ((i10 >> 15) & 112) | 100663686, 817914246, 54, 4565128);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (!z) {
        }
        ComposeExtensionKt.IfTrue(Boolean.valueOf(z2), ComposableLambdaKt.composableLambda(composer2, -170728406, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassProgressBarKt$BlackPassProgressBar$1$4
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
            public final void invoke(@Nullable Composer composer3, int i112) {
                if ((i112 & 11) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-170728406, i112, -1, "com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassProgressBar.<anonymous>.<anonymous> (BlackPassProgressBar.kt:168)");
                    }
                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(OffsetKt.m8084offsetVpY3zN4$default(boxScopeInstance2.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), f62, 0.0f, 2, null), null, false, null, false, false, false, false, null, 0, 0L, null, onClickPlusBtn, ComposableSingletons$BlackPassProgressBarKt.INSTANCE.m14901getLambda1$app_siteRelease(), composer3, 0, 3072, 4094);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, ((i10 >> 12) & 14) | 48);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void BlackPassProgressBarPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2075781161);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2075781161, i, -1, "com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassProgressBarPreview (BlackPassProgressBar.kt:215)");
            }
            m14899BlackPassProgressBarBXK5RNM(null, 1, null, false, true, 0, 30, 0.0f, 0.0f, false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassProgressBarKt.BlackPassProgressBarPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 806907312, 6, HttpStatus.SC_EXPECTATION_FAILED);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassProgressBarKt.BlackPassProgressBarPreview.2
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
                    BlackPassProgressBarKt.BlackPassProgressBarPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

