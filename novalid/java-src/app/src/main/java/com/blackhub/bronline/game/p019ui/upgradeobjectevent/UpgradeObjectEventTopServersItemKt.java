package com.blackhub.bronline.game.p019ui.upgradeobjectevent;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.draw.ScaleKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.RectangleShapeKt;
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
import androidx.compose.p003ui.tooling.preview.Preview;
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
import androidx.compose.runtime.Updater;
import com.blackhub.bronline.game.core.enums.SideEnum;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.gui.upgradeobjectevent.model.UpgradeObjectEventTopListOfServersItem;
import com.blackhub.bronline.game.p019ui.widget.other.ColoredRectangleKt;
import com.blackhub.bronline.game.p019ui.widget.other.GradientSphereKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UpgradeObjectEventTopServersItem.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m7105d2 = {"FIRST_PLACE", "", "SCALE_X_FOR_GRADIENT_SPHERE", "", "SCALE_Y_FOR_GRADIENT_SPHERE", "SECOND_PLACE", "START_OF_GRADIENT", "THIRD_PLACE", "WEIGHT_FOR_LEVEL", "WEIGHT_FOR_PLACE", "WEIGHT_FOR_SERVER_NAME", "WEIGHT_FOR_UNDERLINE", "WIDTH_FOR_AURA_PERCENT", "PreviewUpgradeObjectEventTopServersItem", "", "(Landroidx/compose/runtime/Composer;I)V", "UpgradeObjectEventTopServersItem", "item", "Lcom/blackhub/bronline/game/gui/upgradeobjectevent/model/UpgradeObjectEventTopListOfServersItem;", "(Lcom/blackhub/bronline/game/gui/upgradeobjectevent/model/UpgradeObjectEventTopListOfServersItem;Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUpgradeObjectEventTopServersItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpgradeObjectEventTopServersItem.kt\ncom/blackhub/bronline/game/ui/upgradeobjectevent/UpgradeObjectEventTopServersItemKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,158:1\n154#2:159\n68#3,6:160\n74#3:194\n69#3,5:195\n74#3:228\n78#3:233\n78#3:279\n79#4,11:166\n79#4,11:200\n92#4:232\n79#4,11:241\n92#4:273\n92#4:278\n456#5,8:177\n464#5,3:191\n456#5,8:211\n464#5,3:225\n467#5,3:229\n456#5,8:252\n464#5,3:266\n467#5,3:270\n467#5,3:275\n3737#6,6:185\n3737#6,6:219\n3737#6,6:260\n86#7,7:234\n93#7:269\n97#7:274\n*S KotlinDebug\n*F\n+ 1 UpgradeObjectEventTopServersItem.kt\ncom/blackhub/bronline/game/ui/upgradeobjectevent/UpgradeObjectEventTopServersItemKt\n*L\n49#1:159\n51#1:160,6\n51#1:194\n71#1:195,5\n71#1:228\n71#1:233\n51#1:279\n51#1:166,11\n71#1:200,11\n71#1:232\n107#1:241,11\n107#1:273\n51#1:278\n51#1:177,8\n51#1:191,3\n71#1:211,8\n71#1:225,3\n71#1:229,3\n107#1:252,8\n107#1:266,3\n107#1:270,3\n51#1:275,3\n51#1:185,6\n71#1:219,6\n107#1:260,6\n107#1:234,7\n107#1:269\n107#1:274\n*E\n"})
/* loaded from: classes3.dex */
public final class UpgradeObjectEventTopServersItemKt {

    @NotNull
    public static final String FIRST_PLACE = "1";
    public static final float SCALE_X_FOR_GRADIENT_SPHERE = 0.6f;
    public static final float SCALE_Y_FOR_GRADIENT_SPHERE = 0.4f;

    @NotNull
    public static final String SECOND_PLACE = "2";
    public static final float START_OF_GRADIENT = 0.05f;

    @NotNull
    public static final String THIRD_PLACE = "3";
    public static final float WEIGHT_FOR_LEVEL = 0.6f;
    public static final float WEIGHT_FOR_PLACE = 0.5f;
    public static final float WEIGHT_FOR_SERVER_NAME = 0.8f;
    public static final float WEIGHT_FOR_UNDERLINE = 0.2f;
    public static final float WIDTH_FOR_AURA_PERCENT = 0.955f;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0366  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UpgradeObjectEventTopServersItem(@NotNull final UpgradeObjectEventTopListOfServersItem item, @Nullable Composer composer, final int i) {
        long jM11375getTransparent0d7_KjU;
        int i2;
        long jM11377getWhite0d7_KjU;
        Intrinsics.checkNotNullParameter(item, "item");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1607913853);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1607913853, i, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventTopServersItem (UpgradeObjectEventTopServersItem.kt:47)");
        }
        float fM13666constructorimpl = C2046Dp.m13666constructorimpl(1);
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._19wdp, composerStartRestartGroup, 6)), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(525790233);
        if (item.isPlayersServer()) {
            jM11375getTransparent0d7_KjU = ColorResources_androidKt.colorResource(R.color.black_gray_blue_80, composerStartRestartGroup, 6);
        } else {
            jM11375getTransparent0d7_KjU = Color.INSTANCE.m11375getTransparent0d7_KjU();
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(ClipKt.clip(BackgroundKt.m7771backgroundbw27NRU$default(modifierFillMaxWidth$default, jM11375getTransparent0d7_KjU, null, 2, null), RectangleShapeKt.getRectangleShape()), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), 0.0f, 8, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
        composerStartRestartGroup.startReplaceableGroup(-229253881);
        if (item.isPlayersServer()) {
            Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(companion, 0.955f);
            Alignment bottomCenter = companion2.getBottomCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth);
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
            Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(ScaleKt.scale(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._29wdp, composerStartRestartGroup, 6)), 0.6f, 0.4f), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6), 1, null);
            SideEnum sideEnum = SideEnum.BOTTOM_CENTER;
            Pair pairM7112to = TuplesKt.m7112to(Float.valueOf(0.05f), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6)));
            Float fValueOf = Float.valueOf(1.0f);
            Color.Companion companion4 = Color.INSTANCE;
            GradientSphereKt.GradientSphere(modifierM8084offsetVpY3zN4$default, sideEnum, null, new Pair[]{pairM7112to, TuplesKt.m7112to(fValueOf, Color.m11330boximpl(companion4.m11375getTransparent0d7_KjU()))}, 1.0f, ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._44sdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0), composerStartRestartGroup, 24624, 4);
            i2 = 0;
            ColoredRectangleKt.ColoredRectangle(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth(boxScopeInstance.align(companion, companion2.getBottomCenter()), 0.2f), fM13666constructorimpl), Brush.Companion.m11291linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(companion4.m11375getTransparent0d7_KjU()), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.orange_80, composerStartRestartGroup, 6)), Color.m11330boximpl(companion4.m11375getTransparent0d7_KjU())}), 0L, 0L, 0, 14, (Object) null), composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            i2 = 0;
        }
        composerStartRestartGroup.endReplaceableGroup();
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, companion2.getTop(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i2);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion);
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
        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf(i2));
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 0.5f, false, 2, null);
        String place = item.getPlace();
        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
        TextAlign.Companion companion5 = TextAlign.INSTANCE;
        int iM13558getCentere0LSkKk = companion5.m13558getCentere0LSkKk();
        String place2 = item.getPlace();
        switch (place2.hashCode()) {
            case 49:
                if (place2.equals("1")) {
                    composerStartRestartGroup.startReplaceableGroup(1246374494);
                    jM11377getWhite0d7_KjU = ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                    break;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1246374716);
                    composerStartRestartGroup.endReplaceableGroup();
                    jM11377getWhite0d7_KjU = Color.INSTANCE.m11377getWhite0d7_KjU();
                    break;
                }
            case 50:
                if (place2.equals("2")) {
                    composerStartRestartGroup.startReplaceableGroup(1246374569);
                    jM11377getWhite0d7_KjU = ColorResources_androidKt.colorResource(R.color.silver, composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                    break;
                }
                break;
            case 51:
                if (place2.equals("3")) {
                    composerStartRestartGroup.startReplaceableGroup(1246374643);
                    jM11377getWhite0d7_KjU = ColorResources_androidKt.colorResource(R.color.bronze, composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                    break;
                }
                break;
        }
        TextKt.m10024Text4IGK_g(place, modifierWeight$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._11wdp, jM11377getWhite0d7_KjU, iM13558getCentere0LSkKk, androidx.compose.p003ui.geometry.OffsetKt.Offset(0.0f, 0.0f), 0.0f, null, composerStartRestartGroup, 1600518, 32), composerStartRestartGroup, 0, 0, 65532);
        TextKt.m10024Text4IGK_g(item.getServerName(), RowScope.weight$default(rowScopeInstance, companion, 0.8f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._11wdp, 0L, companion5.m13558getCentere0LSkKk(), androidx.compose.p003ui.geometry.OffsetKt.Offset(0.0f, 0.0f), 0.0f, null, composerStartRestartGroup, 1600518, 34), composerStartRestartGroup, 0, 3072, 57340);
        TextKt.m10024Text4IGK_g(item.getLevel(), RowScope.weight$default(rowScopeInstance, companion, 0.6f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._11wdp, 0L, companion5.m13558getCentere0LSkKk(), androidx.compose.p003ui.geometry.OffsetKt.Offset(0.0f, 0.0f), 0.0f, null, composerStartRestartGroup, 1600518, 34), composerStartRestartGroup, 0, 0, 65532);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventTopServersItemKt.UpgradeObjectEventTopServersItem.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    UpgradeObjectEventTopServersItemKt.UpgradeObjectEventTopServersItem(item, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(device = "spec:id=reference_phone,shape=Normal,width=844,height=390,unit=dp,dpi=420")
    public static final void PreviewUpgradeObjectEventTopServersItem(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1217358791);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1217358791, i, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.PreviewUpgradeObjectEventTopServersItem (UpgradeObjectEventTopServersItem.kt:151)");
            }
            UpgradeObjectEventTopServersItem(new UpgradeObjectEventTopListOfServersItem(YouTubePlayerBridge.ERROR_HTML_5_PLAYER, "MAKHACHKALA", "22", true), composerStartRestartGroup, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventTopServersItemKt.PreviewUpgradeObjectEventTopServersItem.1
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
                    UpgradeObjectEventTopServersItemKt.PreviewUpgradeObjectEventTopServersItem(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
