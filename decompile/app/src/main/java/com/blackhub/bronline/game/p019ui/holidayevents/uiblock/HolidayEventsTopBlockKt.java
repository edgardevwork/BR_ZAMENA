package com.blackhub.bronline.game.p019ui.holidayevents.uiblock;

import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.attachment.main.CommonButtonCategory;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.main.CommonBcBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.ButtonContentBlockKt;
import com.blackhub.bronline.game.p019ui.widget.other.GradientAngle;
import com.blackhub.bronline.game.p019ui.widget.other.GradientOffsetKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HolidayEventsTopBlock.kt */
@Metadata(m7104d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\u001a\u008f\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002"}, m7105d2 = {"HolidayEventsTopBlock", "", "buttons", "", "Lcom/blackhub/bronline/game/core/utils/attachment/main/CommonButtonCategory;", "seasonColor", "Landroidx/compose/ui/graphics/Color;", "shadowColorForEventIcon", "bcAmount", "Landroidx/compose/ui/text/AnnotatedString;", "seasonCurrencyBitmap", "Landroid/graphics/Bitmap;", "onInfoClick", "Lkotlin/Function0;", "onButtonClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "button", "onCloseClick", "onButtonBcClick", "HolidayEventsTopBlock-RakH_j8", "(Ljava/util/List;JJLandroidx/compose/ui/text/AnnotatedString;Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "HolidayEventsTopBlockPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "selectedIndex", ""}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHolidayEventsTopBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsTopBlock.kt\ncom/blackhub/bronline/game/ui/holidayevents/uiblock/HolidayEventsTopBlockKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,207:1\n1116#2,6:208\n1116#2,6:363\n1116#2,6:374\n1116#2,6:380\n91#3,2:214\n93#3:244\n88#3,5:245\n93#3:278\n97#3:326\n86#3,7:327\n93#3:362\n97#3:373\n97#3:390\n79#4,11:216\n79#4,11:250\n79#4,11:287\n92#4:319\n92#4:325\n79#4,11:334\n92#4:372\n92#4:389\n456#5,8:227\n464#5,3:241\n456#5,8:261\n464#5,3:275\n456#5,8:298\n464#5,3:312\n467#5,3:316\n467#5,3:322\n456#5,8:345\n464#5,3:359\n467#5,3:369\n467#5,3:386\n3737#6,6:235\n3737#6,6:269\n3737#6,6:306\n3737#6,6:353\n1864#7,2:279\n1866#7:321\n68#8,6:281\n74#8:315\n78#8:320\n81#9:391\n*S KotlinDebug\n*F\n+ 1 HolidayEventsTopBlock.kt\ncom/blackhub/bronline/game/ui/holidayevents/uiblock/HolidayEventsTopBlockKt\n*L\n62#1:208,6\n150#1:363,6\n172#1:374,6\n177#1:380,6\n68#1:214,2\n68#1:244\n76#1:245,5\n76#1:278\n76#1:326\n121#1:327,7\n121#1:362\n121#1:373\n68#1:390\n68#1:216,11\n76#1:250,11\n81#1:287,11\n81#1:319\n76#1:325\n121#1:334,11\n121#1:372\n68#1:389\n68#1:227,8\n68#1:241,3\n76#1:261,8\n76#1:275,3\n81#1:298,8\n81#1:312,3\n81#1:316,3\n76#1:322,3\n121#1:345,8\n121#1:359,3\n121#1:369,3\n68#1:386,3\n68#1:235,6\n76#1:269,6\n81#1:306,6\n121#1:353,6\n80#1:279,2\n80#1:321\n81#1:281,6\n81#1:315\n81#1:320\n62#1:391\n*E\n"})
/* loaded from: classes3.dex */
public final class HolidayEventsTopBlockKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x05b7 A[PHI: r5
  0x05b7: PHI (r5v47 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r5v45 kotlin.jvm.functions.Function0<kotlin.Unit>), (r5v48 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:107:0x05b5, B:103:0x05af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0548 A[PHI: r3
  0x0548: PHI (r3v24 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r3v22 kotlin.jvm.functions.Function0<kotlin.Unit>), (r3v25 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:92:0x0546, B:88:0x0540] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0559  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: HolidayEventsTopBlock-RakH_j8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14989HolidayEventsTopBlockRakH_j8(@NotNull final List<CommonButtonCategory> buttons, final long j, final long j2, @NotNull final AnnotatedString bcAmount, @Nullable final Bitmap bitmap, @NotNull final Function0<Unit> onInfoClick, @NotNull final Function1<? super CommonButtonCategory, Unit> onButtonClick, @NotNull final Function0<Unit> onCloseClick, @NotNull final Function0<Unit> onButtonBcClick, @Nullable Composer composer, final int i) {
        final Function0<Unit> function0;
        boolean z;
        Object objRememberedValue;
        final Function0<Unit> function02;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(bcAmount, "bcAmount");
        Intrinsics.checkNotNullParameter(onInfoClick, "onInfoClick");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(onButtonBcClick, "onButtonBcClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-573932779);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-573932779, i, -1, "com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsTopBlock (HolidayEventsTopBlock.kt:59)");
        }
        composerStartRestartGroup.startReplaceableGroup(383168848);
        boolean zChanged = composerStartRestartGroup.changed(buttons);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsTopBlockKt$HolidayEventsTopBlock$selectedIndex$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    Iterator<CommonButtonCategory> it = buttons.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        if (it.next().isSelected()) {
                            break;
                        }
                        i2++;
                    }
                    Integer numValueOf = Integer.valueOf(i2);
                    if (numValueOf.intValue() < 0) {
                        numValueOf = null;
                    }
                    return Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        State state = (State) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._34wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._34wdp, composerStartRestartGroup, 6), 0.0f, 2, null);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8125paddingVpY3zN4$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_4 = arrangement.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composerStartRestartGroup, 6));
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM8032spacedBy0680j_4, companion2.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        composerStartRestartGroup.startReplaceableGroup(-1663122558);
        Iterator it = buttons.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            final CommonButtonCategory commonButtonCategory = (CommonButtonCategory) next;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Iterator it2 = it;
            Modifier modifierM7805clickableXHw0xAI$default = ClickableKt.m7805clickableXHw0xAI$default(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._33wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(commonButtonCategory.getIconBgColor(), composerStartRestartGroup, 0), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6))), false, null, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsTopBlockKt$HolidayEventsTopBlock$1$1$1$1
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
                    onButtonClick.invoke(commonButtonCategory);
                }
            }, 7, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM7805clickableXHw0xAI$default);
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
            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            final BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageBitmapKt.m15118ImageBitmapAy9G7rc(commonButtonCategory.getIconCDN(), SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), null, null, 0.0f, ColorFilter.Companion.m11381tintxETnrds$default(ColorFilter.INSTANCE, ColorResources_androidKt.colorResource(commonButtonCategory.getIconColor(), composerStartRestartGroup, 0), 0, 2, null), 0, composerStartRestartGroup, 56, 92);
            ComposeExtensionKt.IfTrue(Boolean.valueOf(commonButtonCategory.getHasUpdates()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1132263315, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsTopBlockKt$HolidayEventsTopBlock$1$1$1$2$1
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
                public final void invoke(@Nullable Composer composer2, int i4) {
                    if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1132263315, i4, -1, "com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsTopBlock.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HolidayEventsTopBlock.kt:97)");
                        }
                        BoxScope boxScope = boxScopeInstance;
                        Modifier.Companion companion6 = Modifier.INSTANCE;
                        Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer2, 6));
                        Alignment.Companion companion7 = Alignment.INSTANCE;
                        Modifier modifierAlign = boxScope.align(modifierM8172size3ABfNKs, companion7.getTopEnd());
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion7.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor4 = companion8.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierAlign);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor4);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer2);
                        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion8.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion8.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion8.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        BoxKt.Box(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(BoxScopeInstance.INSTANCE.align(companion6, companion7.getCenter()), PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6)), ColorResources_androidKt.colorResource(R.color.red, composer2, 6), RoundedCornerShapeKt.getCircleShape()), composer2, 0);
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
            }), composerStartRestartGroup, 48);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            i2 = i3;
            it = it2;
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_42 = Arrangement.INSTANCE.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6));
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Modifier.Companion companion6 = Modifier.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(horizontalOrVerticalM8032spacedBy0680j_42, centerVertically2, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion6);
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
        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy3, companion7.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        boolean z2 = false;
        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        CommonButtonCategory commonButtonCategory2 = (CommonButtonCategory) CollectionsKt___CollectionsKt.getOrNull(buttons, HolidayEventsTopBlock_RakH_j8$lambda$1(state));
        String categoryName = commonButtonCategory2 != null ? commonButtonCategory2.getCategoryName() : null;
        TextKt.m10024Text4IGK_g(categoryName == null ? "" : categoryName, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._24wsp, 0L, 0, 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 126), composerStartRestartGroup, 0, 0, 65534);
        Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6));
        Brush.Companion companion8 = Brush.INSTANCE;
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6))});
        GradientAngle gradientAngle = GradientAngle.CW90;
        Brush brushM11291linearGradientmHitzGk$default = Brush.Companion.m11291linearGradientmHitzGk$default(companion8, listListOf, GradientOffsetKt.gradientOffset(gradientAngle).m15095getStartF1C5BW0(), GradientOffsetKt.gradientOffset(gradientAngle).m15094getEndF1C5BW0(), 0, 8, (Object) null);
        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6));
        BorderStroke borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._05wdp, composerStartRestartGroup, 6), Color.INSTANCE.m11377getWhite0d7_KjU());
        composerStartRestartGroup.startReplaceableGroup(78607616);
        boolean z3 = (((458752 & i) ^ ProfileVerifier.CompilationStatus.f342xf2722a21) > 131072 && composerStartRestartGroup.changed(onInfoClick)) || (i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 131072;
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (z3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsTopBlockKt$HolidayEventsTopBlock$1$2$1$1
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
                    onInfoClick.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        Function0 function03 = (Function0) objRememberedValue4;
        composerStartRestartGroup.endReplaceableGroup();
        ComposableSingletons$HolidayEventsTopBlockKt composableSingletons$HolidayEventsTopBlockKt = ComposableSingletons$HolidayEventsTopBlockKt.INSTANCE;
        ButtonContentBlockKt.m15069ButtonContentBlockkmJHe8M(modifierM8174sizeVpY3zN4, null, 0L, 0L, 0.0f, brushM11291linearGradientmHitzGk$default, roundedCornerShapeM8392RoundedCornerShape0680j_4, borderStrokeM7798BorderStrokecXLIe8U, null, false, false, null, false, false, false, false, 0, null, function03, composableSingletons$HolidayEventsTopBlockKt.m14983getLambda1$app_siteRelease(), composerStartRestartGroup, 0, 805306368, 261918);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._118wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6));
        Color colorM11330boximpl = Color.m11330boximpl(j);
        composerStartRestartGroup.startReplaceableGroup(-1663118837);
        if (((234881024 & i) ^ 100663296) > 67108864) {
            function0 = onButtonBcClick;
            if (composerStartRestartGroup.changed(function0)) {
                z = true;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsTopBlockKt$HolidayEventsTopBlock$1$3$1
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
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i4 = i << 6;
            CommonBcBlockKt.m15060CommonBcBlockOo4ZOEs(modifierM8158height3ABfNKs, bcAmount, true, colorM11330boximpl, j2, bitmap, (Function0) objRememberedValue, composerStartRestartGroup, ((i >> 6) & 112) | 262528 | (i4 & 7168) | (i4 & 57344), 0);
            Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(companion6, 0.0f, 1, null);
            Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6));
            composerStartRestartGroup.startReplaceableGroup(-1663118630);
            if (((29360128 & i) ^ 12582912) <= 8388608) {
                function02 = onCloseClick;
                if (composerStartRestartGroup.changed(function02)) {
                    z2 = true;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsTopBlockKt$HolidayEventsTopBlock$1$4$1
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
                            function02.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierFillMaxHeight$default2, modifierM8172size3ABfNKs, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue2, composableSingletons$HolidayEventsTopBlockKt.m14984getLambda2$app_siteRelease(), composerStartRestartGroup, 6, 3072, 4092);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsTopBlockKt$HolidayEventsTopBlock$2
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

                        public final void invoke(@Nullable Composer composer2, int i5) {
                            HolidayEventsTopBlockKt.m14989HolidayEventsTopBlockRakH_j8(buttons, j, j2, bcAmount, bitmap, onInfoClick, onButtonClick, onCloseClick, onButtonBcClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                        }
                    });
                    return;
                }
                return;
            }
            function02 = onCloseClick;
            if ((12582912 & i) == 8388608) {
            }
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2) {
                objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsTopBlockKt$HolidayEventsTopBlock$1$4$1
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
                        function02.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierFillMaxHeight$default2, modifierM8172size3ABfNKs, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue2, composableSingletons$HolidayEventsTopBlockKt.m14984getLambda2$app_siteRelease(), composerStartRestartGroup, 6, 3072, 4092);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        } else {
            function0 = onButtonBcClick;
        }
        if ((100663296 & i) != 67108864) {
            z = false;
        }
        objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (!z) {
            objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsTopBlockKt$HolidayEventsTopBlock$1$3$1
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
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        int i42 = i << 6;
        CommonBcBlockKt.m15060CommonBcBlockOo4ZOEs(modifierM8158height3ABfNKs, bcAmount, true, colorM11330boximpl, j2, bitmap, (Function0) objRememberedValue, composerStartRestartGroup, ((i >> 6) & 112) | 262528 | (i42 & 7168) | (i42 & 57344), 0);
        Modifier modifierFillMaxHeight$default22 = SizeKt.fillMaxHeight$default(companion6, 0.0f, 1, null);
        Modifier modifierM8172size3ABfNKs2 = SizeKt.m8172size3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6));
        composerStartRestartGroup.startReplaceableGroup(-1663118630);
        if (((29360128 & i) ^ 12582912) <= 8388608) {
        }
        if ((12582912 & i) == 8388608) {
        }
        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (z2) {
        }
        composerStartRestartGroup.endReplaceableGroup();
        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierFillMaxHeight$default22, modifierM8172size3ABfNKs2, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue2, composableSingletons$HolidayEventsTopBlockKt.m14984getLambda2$app_siteRelease(), composerStartRestartGroup, 6, 3072, 4092);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void HolidayEventsTopBlockPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-626939472);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-626939472, i, -1, "com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsTopBlockPreview (HolidayEventsTopBlock.kt:189)");
            }
            m14989HolidayEventsTopBlockRakH_j8(CollectionsKt__CollectionsKt.listOf((Object[]) new CommonButtonCategory[]{new CommonButtonCategory(0, "Тёмное дерево", null, false, false, null, null, 125, null), new CommonButtonCategory(0, "azazaza", null, true, true, null, null, 101, null), new CommonButtonCategory(0, "azazaza", null, false, false, null, null, 125, null)}), ColorResources_androidKt.colorResource(R.color.purple, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.purple, composerStartRestartGroup, 6), new AnnotatedString("211", null, null, 6, null), null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsTopBlockKt.HolidayEventsTopBlockPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<CommonButtonCategory, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsTopBlockKt.HolidayEventsTopBlockPreview.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CommonButtonCategory it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CommonButtonCategory commonButtonCategory) {
                    invoke2(commonButtonCategory);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsTopBlockKt.HolidayEventsTopBlockPreview.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsTopBlockKt.HolidayEventsTopBlockPreview.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 115043336);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsTopBlockKt.HolidayEventsTopBlockPreview.5
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
                    HolidayEventsTopBlockKt.HolidayEventsTopBlockPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final int HolidayEventsTopBlock_RakH_j8$lambda$1(State<Integer> state) {
        return state.getValue().intValue();
    }
}
