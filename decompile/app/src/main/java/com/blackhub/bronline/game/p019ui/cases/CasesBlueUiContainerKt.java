package com.blackhub.bronline.game.p019ui.cases;

import android.graphics.Bitmap;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.draw.ScaleKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
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
import coil.compose.SingletonAsyncImageKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.launcher.LauncherConstants;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesBlueUiContainer.kt */
@Metadata(m7104d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\u0084\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0016¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002"}, m7105d2 = {"CasesBlueUiContainer", "", "modifier", "Landroidx/compose/ui/Modifier;", "borderColor", "", "shadowColor", "height", "width", "bearBgPatternColor", "blurRadius", "prizesBgPattern", "Landroid/graphics/Bitmap;", "scaleBear", "", "cornerIsOnlyRight", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;IIIIIILandroid/graphics/Bitmap;FZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "CasesBlueUiContainerPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "halfHeightDialog", "Landroidx/compose/ui/unit/Dp;", "shape", "Landroidx/compose/foundation/shape/RoundedCornerShape;"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCasesBlueUiContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesBlueUiContainer.kt\ncom/blackhub/bronline/game/ui/cases/CasesBlueUiContainerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,146:1\n1116#2,6:147\n1116#2,6:153\n69#3,5:159\n74#3:192\n69#3,5:193\n74#3:226\n69#3,5:227\n74#3:260\n78#3:265\n78#3:271\n78#3:276\n79#4,11:164\n79#4,11:198\n79#4,11:232\n92#4:264\n92#4:270\n92#4:275\n456#5,8:175\n464#5,3:189\n456#5,8:209\n464#5,3:223\n456#5,8:243\n464#5,3:257\n467#5,3:261\n467#5,3:267\n467#5,3:272\n3737#6,6:183\n3737#6,6:217\n3737#6,6:251\n64#7:266\n154#8:277\n81#9:278\n81#9:279\n*S KotlinDebug\n*F\n+ 1 CasesBlueUiContainer.kt\ncom/blackhub/bronline/game/ui/cases/CasesBlueUiContainerKt\n*L\n56#1:147,6\n72#1:153,6\n85#1:159,5\n85#1:192\n89#1:193,5\n89#1:226\n107#1:227,5\n107#1:260\n107#1:265\n89#1:271\n85#1:276\n85#1:164,11\n89#1:198,11\n107#1:232,11\n107#1:264\n89#1:270\n85#1:275\n85#1:175,8\n85#1:189,3\n89#1:209,8\n89#1:223,3\n107#1:243,8\n107#1:257,3\n107#1:261,3\n89#1:267,3\n85#1:272,3\n85#1:183,6\n89#1:217,6\n107#1:251,6\n125#1:266\n139#1:277\n56#1:278\n72#1:279\n*E\n"})
/* loaded from: classes2.dex */
public final class CasesBlueUiContainerKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void CasesBlueUiContainer(@Nullable Modifier modifier, @ColorRes int i, @ColorRes int i2, @DimenRes int i3, @DimenRes int i4, @ColorRes int i5, @DimenRes int i6, @Nullable final Bitmap bitmap, float f, boolean z, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i7, final int i8, final int i9) {
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(696253475);
        Modifier modifier2 = (i9 & 1) != 0 ? Modifier.INSTANCE : modifier;
        int i10 = (i9 & 2) != 0 ? R.color.darker_gray_blue : i;
        int i11 = (i9 & 4) != 0 ? R.color.transparent : i2;
        int i12 = (i9 & 8) != 0 ? R.dimen._245wdp : i3;
        int i13 = (i9 & 16) != 0 ? R.dimen._748wdp : i4;
        int i14 = (i9 & 32) != 0 ? R.color.white : i5;
        int i15 = (i9 & 64) != 0 ? R.dimen._20wdp : i6;
        float f2 = (i9 & 256) != 0 ? 1.0f : f;
        final boolean z2 = (i9 & 512) != 0 ? false : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(696253475, i7, i8, "com.blackhub.bronline.game.ui.cases.CasesBlueUiContainer (CasesBlueUiContainer.kt:52)");
        }
        final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(i12, composerStartRestartGroup, (i7 >> 9) & 14);
        final float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1638409759);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        final int i16 = i12;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<C2046Dp>() { // from class: com.blackhub.bronline.game.ui.cases.CasesBlueUiContainerKt$CasesBlueUiContainer$halfHeightDialog$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ C2046Dp invoke() {
                    return C2046Dp.m13664boximpl(m14928invokeD9Ej5fM());
                }

                /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
                public final float m14928invokeD9Ej5fM() {
                    return C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(fDimensionResource / 2) - fDimensionResource2);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        State state = (State) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_dark, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        final float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1638409346);
        boolean z3 = (((1879048192 & i7) ^ 805306368) > 536870912 && composerStartRestartGroup.changed(z2)) || (i7 & 805306368) == 536870912;
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (z3 || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<RoundedCornerShape>() { // from class: com.blackhub.bronline.game.ui.cases.CasesBlueUiContainerKt$CasesBlueUiContainer$shape$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final RoundedCornerShape invoke() {
                    if (z2) {
                        float f3 = fDimensionResource3;
                        return RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(0.0f, f3, f3, 0.0f, 9, null);
                    }
                    return RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(fDimensionResource3);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        State state2 = (State) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment center = companion2.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        final boolean z4 = z2;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        final int i17 = i14;
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
        final float f3 = f2;
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier.Companion companion4 = Modifier.INSTANCE;
        Modifier modifierM7782borderxT4_qwU = BorderKt.m7782borderxT4_qwU(BackgroundKt.background$default(ClipKt.clip(ComposeExtensionKt.m14410shadowo6VuwKU(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion4, fDimensionResource), PrimitiveResources_androidKt.dimensionResource(i13, composerStartRestartGroup, (i7 >> 12) & 14)), (242 & 1) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : ColorResources_androidKt.colorResource(i11, composerStartRestartGroup, (i7 >> 6) & 14), (242 & 2) != 0 ? 1.0f : 0.0f, (242 & 4) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composerStartRestartGroup, 6), (242 & 8) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(i15, composerStartRestartGroup, (i7 >> 18) & 14), (242 & 16) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 32) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 64) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 128) != 0 ? Modifier.INSTANCE : null), CasesBlueUiContainer$lambda$3(state2)), brushM11297verticalGradient8A3gB4$default, null, 0.0f, 6, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(i10, composerStartRestartGroup, (i7 >> 3) & 14), CasesBlueUiContainer$lambda$3(state2));
        Alignment center2 = companion2.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7782borderxT4_qwU);
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
        Alignment centerStart = companion2.getCenterStart();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion4, 0.0f, 1, null);
        ContentScale.Companion companion5 = ContentScale.INSTANCE;
        SingletonAsyncImageKt.m14279AsyncImage3HmZ8SU(bitmap, null, modifierFillMaxHeight$default, null, null, null, companion5.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 1573304, 952);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        final int i18 = i15;
        final int i19 = i13;
        final int i20 = i11;
        final int i21 = i10;
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_bear_transparent, composerStartRestartGroup, 6), (String) null, ScaleKt.scale(OffsetKt.m8083offsetVpY3zN4(boxScopeInstance.align(SizeKt.fillMaxHeight$default(companion4, 0.0f, 1, null), companion2.getCenterEnd()), CasesBlueUiContainer$lambda$1(state), C2046Dp.m13666constructorimpl(-fDimensionResource2)), f3), (Alignment) null, companion5.getFillHeight(), 0.0f, ColorFilter.Companion.m11381tintxETnrds$default(ColorFilter.INSTANCE, ColorResources_androidKt.colorResource(i17, composerStartRestartGroup, (i7 >> 15) & 14), 0, 2, null), composerStartRestartGroup, 24632, 40);
        content.invoke(composerStartRestartGroup, Integer.valueOf(i8 & 14));
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesBlueUiContainerKt.CasesBlueUiContainer.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i22) {
                    CasesBlueUiContainerKt.CasesBlueUiContainer(modifier3, i21, i20, i16, i19, i17, i18, bitmap, f3, z4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i7 | 1), RecomposeScopeImplKt.updateChangedFlags(i8), i9);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void CasesBlueUiContainerPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1581995969);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1581995969, i, -1, "com.blackhub.bronline.game.ui.cases.CasesBlueUiContainerPreview (CasesBlueUiContainer.kt:136)");
            }
            CasesBlueUiContainer(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, C2046Dp.m13666constructorimpl(LauncherConstants.ADDITIONAL_FREE_SPACE)), 0, 0, 0, 0, 0, 0, null, 1.3f, false, ComposableSingletons$CasesBlueUiContainerKt.INSTANCE.m14929getLambda1$app_siteRelease(), composerStartRestartGroup, 113246214, 6, 638);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesBlueUiContainerKt.CasesBlueUiContainerPreview.1
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
                    CasesBlueUiContainerKt.CasesBlueUiContainerPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final float CasesBlueUiContainer$lambda$1(State<C2046Dp> state) {
        return state.getValue().m13680unboximpl();
    }

    public static final RoundedCornerShape CasesBlueUiContainer$lambda$3(State<RoundedCornerShape> state) {
        return state.getValue();
    }
}
