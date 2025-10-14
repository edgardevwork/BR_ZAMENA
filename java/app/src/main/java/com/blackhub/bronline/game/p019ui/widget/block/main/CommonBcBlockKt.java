package com.blackhub.bronline.game.p019ui.widget.block.main;

import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.RectangleShapeKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.style.TextAlign;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.p019ui.widget.button.ButtonImageKt;
import com.blackhub.bronline.game.p019ui.widget.other.GradientAngle;
import com.blackhub.bronline.game.p019ui.widget.other.GradientOffsetKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonBcBlock.kt */
@SourceDebugExtension({"SMAP\nCommonBcBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonBcBlock.kt\ncom/blackhub/bronline/game/ui/widget/block/main/CommonBcBlockKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,137:1\n1116#2,6:138\n1116#2,6:211\n91#3,2:144\n93#3:174\n97#3:226\n79#4,11:146\n79#4,11:182\n92#4:220\n92#4:225\n456#5,8:157\n464#5,3:171\n456#5,8:193\n464#5,3:207\n467#5,3:217\n467#5,3:222\n3737#6,6:165\n3737#6,6:201\n67#7,7:175\n74#7:210\n78#7:221\n81#8:227\n*S KotlinDebug\n*F\n+ 1 CommonBcBlock.kt\ncom/blackhub/bronline/game/ui/widget/block/main/CommonBcBlockKt\n*L\n47#1:138,6\n95#1:211,6\n75#1:144,2\n75#1:174\n75#1:226\n75#1:146,11\n87#1:182,11\n87#1:220\n75#1:225\n75#1:157,8\n75#1:171,3\n87#1:193,8\n87#1:207,3\n87#1:217,3\n75#1:222,3\n75#1:165,6\n87#1:201,6\n87#1:175,7\n87#1:210\n87#1:221\n47#1:227\n*E\n"})
/* loaded from: classes3.dex */
public final class CommonBcBlockKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0126  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: CommonBcBlock-Oo4ZOEs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15060CommonBcBlockOo4ZOEs(@Nullable Modifier modifier, @NotNull final AnnotatedString bcAmount, boolean z, @Nullable Color color, long j, @Nullable Bitmap bitmap, @NotNull final Function0<Unit> onButtonBcClick, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        int i4;
        final Color color2;
        int i5;
        long jM11375getTransparent0d7_KjU;
        int i6;
        boolean z3;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM10870constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean z4;
        Object objRememberedValue2;
        Composer composer2;
        Bitmap bitmap2;
        final long j2;
        final Color color3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(bcAmount, "bcAmount");
        Intrinsics.checkNotNullParameter(onButtonBcClick, "onButtonBcClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1986814937);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(bcAmount) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else {
            if ((i & 896) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    color2 = color;
                    i3 |= composerStartRestartGroup.changed(color2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                    jM11375getTransparent0d7_KjU = j;
                } else {
                    jM11375getTransparent0d7_KjU = j;
                    if ((i & 57344) == 0) {
                        i3 |= composerStartRestartGroup.changed(jM11375getTransparent0d7_KjU) ? 16384 : 8192;
                    }
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= 65536;
                }
                if ((i2 & 64) == 0) {
                    i7 = (i & 3670016) == 0 ? composerStartRestartGroup.changedInstance(onButtonBcClick) ? 1048576 : 524288 : 1572864;
                    if (i6 == 32 || (2995931 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z5 = i9 == 0 ? false : z2;
                        if (i4 != 0) {
                            color2 = null;
                        }
                        if (i5 != 0) {
                            jM11375getTransparent0d7_KjU = Color.INSTANCE.m11375getTransparent0d7_KjU();
                        }
                        Bitmap bitmap3 = i6 == 0 ? null : bitmap;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1986814937, i3, -1, "com.blackhub.bronline.game.ui.widget.block.main.CommonBcBlock (CommonBcBlock.kt:45)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1585273478);
                        z3 = (i3 & 7168) != 2048;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.widget.block.main.CommonBcBlockKt$CommonBcBlock$buttonImageId$2$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Integer invoke() {
                                    int i10;
                                    Color color4 = color2;
                                    if (color4 != null) {
                                        color4.m11350unboximpl();
                                        i10 = R.drawable.ic_plus_event;
                                    } else {
                                        i10 = R.drawable.ic_plus_yellow;
                                    }
                                    return Integer.valueOf(i10);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        State state = (State) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        Brush.Companion companion = Brush.INSTANCE;
                        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.gray_blue_50, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6))});
                        GradientAngle gradientAngle = GradientAngle.CW180;
                        Modifier modifierM7784borderziNgDLE = BorderKt.m7784borderziNgDLE(BackgroundKt.background$default(modifier4, Brush.Companion.m11291linearGradientmHitzGk$default(companion, listListOf, GradientOffsetKt.gradientOffset(gradientAngle).m15095getStartF1C5BW0(), GradientOffsetKt.gradientOffset(gradientAngle).m15094getEndF1C5BW0(), 0, 8, (Object) null), null, 0.0f, 6, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), Brush.Companion.m11291linearGradientmHitzGk$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.white_25, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6))}), GradientOffsetKt.gradientOffset(gradientAngle).m15095getStartF1C5BW0(), GradientOffsetKt.gradientOffset(gradientAngle).m15094getEndF1C5BW0(), 0, 8, (Object) null), RectangleShapeKt.getRectangleShape());
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7784borderziNgDLE);
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
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Alignment centerEnd = companion2.getCenterEnd();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerEnd, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion4);
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
                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._19wdp, composerStartRestartGroup, 6));
                        int iCommonBcBlock_Oo4ZOEs$lambda$1 = CommonBcBlock_Oo4ZOEs$lambda$1(state);
                        composerStartRestartGroup.startReplaceableGroup(874231430);
                        z4 = (i3 & 3670016) == 1048576;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.main.CommonBcBlockKt$CommonBcBlock$1$1$1$1
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
                                    onButtonBcClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i10 = i3 >> 6;
                        ButtonImageKt.m15070ButtonImagebWB7cM8(modifierM8172size3ABfNKs, color2, iCommonBcBlock_Oo4ZOEs$lambda$1, (Function0) objRememberedValue2, composerStartRestartGroup, i10 & 112, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        final long j3 = jM11375getTransparent0d7_KjU;
                        Color color4 = color2;
                        final Bitmap bitmap4 = bitmap3;
                        TextKt.m10025TextIbK3jfQ(bcAmount, PaddingKt.m8125paddingVpY3zN4$default(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6), 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._12wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 122), composerStartRestartGroup, (i3 >> 3) & 14, 0, 131068);
                        composer2 = composerStartRestartGroup;
                        ComposeExtensionKt.IfTrue(Boolean.valueOf(z5), ComposableLambdaKt.composableLambda(composer2, 1349328491, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.main.CommonBcBlockKt$CommonBcBlock$1$2
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
                                        ComposerKt.traceEventStart(1349328491, i11, -1, "com.blackhub.bronline.game.ui.widget.block.main.CommonBcBlock.<anonymous>.<anonymous> (CommonBcBlock.kt:108)");
                                    }
                                    Modifier modifierM8172size3ABfNKs2 = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer3, 6));
                                    float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composer3, 6);
                                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap4, ComposeExtensionKt.m14410shadowo6VuwKU(modifierM8172size3ABfNKs2, (242 & 1) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : j3, (242 & 2) != 0 ? 1.0f : 0.0f, (242 & 4) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer3, 6), (242 & 8) != 0 ? C2046Dp.m13666constructorimpl(0) : fDimensionResource, (242 & 16) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 32) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 64) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 128) != 0 ? Modifier.INSTANCE : null), null, null, 0.0f, null, 0, composer3, 8, 124);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, (i10 & 14) | 48);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        bitmap2 = bitmap4;
                        j2 = j3;
                        color3 = color4;
                        modifier3 = modifier4;
                        z2 = z5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        bitmap2 = bitmap;
                        modifier3 = modifier2;
                        j2 = jM11375getTransparent0d7_KjU;
                        color3 = color2;
                        composer2 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final boolean z6 = z2;
                        final Bitmap bitmap5 = bitmap2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.main.CommonBcBlockKt$CommonBcBlock$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i11) {
                                CommonBcBlockKt.m15060CommonBcBlockOo4ZOEs(modifier3, bcAmount, z6, color3, j2, bitmap5, onButtonBcClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= i7;
                if (i6 == 32) {
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(1585273478);
                    if ((i3 & 7168) != 2048) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z3) {
                        objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.widget.block.main.CommonBcBlockKt$CommonBcBlock$buttonImageId$2$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Integer invoke() {
                                int i102;
                                Color color42 = color2;
                                if (color42 != null) {
                                    color42.m11350unboximpl();
                                    i102 = R.drawable.ic_plus_event;
                                } else {
                                    i102 = R.drawable.ic_plus_yellow;
                                }
                                return Integer.valueOf(i102);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        State state2 = (State) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        Brush.Companion companion5 = Brush.INSTANCE;
                        List listListOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.gray_blue_50, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6))});
                        GradientAngle gradientAngle2 = GradientAngle.CW180;
                        Modifier modifierM7784borderziNgDLE2 = BorderKt.m7784borderziNgDLE(BackgroundKt.background$default(modifier4, Brush.Companion.m11291linearGradientmHitzGk$default(companion5, listListOf2, GradientOffsetKt.gradientOffset(gradientAngle2).m15095getStartF1C5BW0(), GradientOffsetKt.gradientOffset(gradientAngle2).m15094getEndF1C5BW0(), 0, 8, (Object) null), null, 0.0f, 6, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), Brush.Companion.m11291linearGradientmHitzGk$default(companion5, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.white_25, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6))}), GradientOffsetKt.gradientOffset(gradientAngle2).m15095getStartF1C5BW0(), GradientOffsetKt.gradientOffset(gradientAngle2).m15094getEndF1C5BW0(), 0, 8, (Object) null), RectangleShapeKt.getRectangleShape());
                        Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                        Alignment.Companion companion22 = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically2 = companion22.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically2, composerStartRestartGroup, 54);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM7784borderziNgDLE2);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl.getInserting()) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            Alignment centerEnd2 = companion22.getCenterEnd();
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            Modifier.Companion companion42 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(centerEnd2, false, composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(companion42);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                            if (!composerM10870constructorimpl2.getInserting()) {
                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                Modifier modifierM8172size3ABfNKs2 = SizeKt.m8172size3ABfNKs(companion42, PrimitiveResources_androidKt.dimensionResource(R.dimen._19wdp, composerStartRestartGroup, 6));
                                int iCommonBcBlock_Oo4ZOEs$lambda$12 = CommonBcBlock_Oo4ZOEs$lambda$1(state2);
                                composerStartRestartGroup.startReplaceableGroup(874231430);
                                if ((i3 & 3670016) == 1048576) {
                                }
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!z4) {
                                    objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.main.CommonBcBlockKt$CommonBcBlock$1$1$1$1
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
                                            onButtonBcClick.invoke();
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    int i102 = i3 >> 6;
                                    ButtonImageKt.m15070ButtonImagebWB7cM8(modifierM8172size3ABfNKs2, color2, iCommonBcBlock_Oo4ZOEs$lambda$12, (Function0) objRememberedValue2, composerStartRestartGroup, i102 & 112, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    final long j32 = jM11375getTransparent0d7_KjU;
                                    Color color42 = color2;
                                    final Bitmap bitmap42 = bitmap3;
                                    TextKt.m10025TextIbK3jfQ(bcAmount, PaddingKt.m8125paddingVpY3zN4$default(companion42, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6), 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._12wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 122), composerStartRestartGroup, (i3 >> 3) & 14, 0, 131068);
                                    composer2 = composerStartRestartGroup;
                                    ComposeExtensionKt.IfTrue(Boolean.valueOf(z5), ComposableLambdaKt.composableLambda(composer2, 1349328491, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.main.CommonBcBlockKt$CommonBcBlock$1$2
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
                                                    ComposerKt.traceEventStart(1349328491, i11, -1, "com.blackhub.bronline.game.ui.widget.block.main.CommonBcBlock.<anonymous>.<anonymous> (CommonBcBlock.kt:108)");
                                                }
                                                Modifier modifierM8172size3ABfNKs22 = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer3, 6));
                                                float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composer3, 6);
                                                ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap42, ComposeExtensionKt.m14410shadowo6VuwKU(modifierM8172size3ABfNKs22, (242 & 1) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : j32, (242 & 2) != 0 ? 1.0f : 0.0f, (242 & 4) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer3, 6), (242 & 8) != 0 ? C2046Dp.m13666constructorimpl(0) : fDimensionResource, (242 & 16) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 32) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 64) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 128) != 0 ? Modifier.INSTANCE : null), null, null, 0.0f, null, 0, composer3, 8, 124);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }), composer2, (i102 & 14) | 48);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    bitmap2 = bitmap42;
                                    j2 = j32;
                                    color3 = color42;
                                    modifier3 = modifier4;
                                    z2 = z5;
                                }
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            color2 = color;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            if ((i2 & 64) == 0) {
            }
            i3 |= i7;
            if (i6 == 32) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z2 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        color2 = color;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i3 |= i7;
        if (i6 == 32) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewCasesBcBlock(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1616875222);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1616875222, i, -1, "com.blackhub.bronline.game.ui.widget.block.main.PreviewCasesBcBlock (CommonBcBlock.kt:124)");
            }
            Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._118wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6));
            long jColorResource = ColorResources_androidKt.colorResource(R.color.purple, composerStartRestartGroup, 6);
            m15060CommonBcBlockOo4ZOEs(modifierM8174sizeVpY3zN4, new AnnotatedString("999/1000", null, null, 6, null), false, Color.m11330boximpl(jColorResource), ColorResources_androidKt.colorResource(R.color.purple, composerStartRestartGroup, 6), null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.main.CommonBcBlockKt.PreviewCasesBcBlock.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 1769904, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.main.CommonBcBlockKt.PreviewCasesBcBlock.2
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
                    CommonBcBlockKt.PreviewCasesBcBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final int CommonBcBlock_Oo4ZOEs$lambda$1(State<Integer> state) {
        return state.getValue().intValue();
    }
}

