package com.blackhub.bronline.game.p019ui.widget.button;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ToggleButton.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u001aH\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0006X\u008a\u0084\u0002"}, m7105d2 = {"DURATION", "", "FIFTY_PERCENT", "ToggleButton", "", "width", "Landroidx/compose/ui/unit/Dp;", "circleSize", "modifierOuter", "Landroidx/compose/ui/Modifier;", "modifierInner", "onClick", "Lkotlin/Function0;", "ToggleButton-cmh-DWc", "(FFLandroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ToggleButtonPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "isChecked", "", "xOffset"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nToggleButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToggleButton.kt\ncom/blackhub/bronline/game/ui/widget/button/ToggleButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,102:1\n1116#2,6:103\n1116#2,6:111\n154#3:109\n58#4:110\n87#5,6:117\n93#5:151\n97#5:196\n79#6,11:123\n79#6,11:158\n92#6:190\n92#6:195\n456#7,8:134\n464#7,3:148\n456#7,8:169\n464#7,3:183\n467#7,3:187\n467#7,3:192\n3737#8,6:142\n3737#8,6:177\n68#9,6:152\n74#9:186\n78#9:191\n81#10:197\n107#10,2:198\n81#10:200\n*S KotlinDebug\n*F\n+ 1 ToggleButton.kt\ncom/blackhub/bronline/game/ui/widget/button/ToggleButtonKt\n*L\n68#1:103,6\n81#1:111,6\n72#1:109\n74#1:110\n79#1:117,6\n79#1:151\n79#1:196\n79#1:123,11\n87#1:158,11\n87#1:190\n79#1:195\n79#1:134,8\n79#1:148,3\n87#1:169,8\n87#1:183,3\n87#1:187,3\n79#1:192,3\n79#1:142,6\n87#1:177,6\n87#1:152,6\n87#1:186\n87#1:191\n68#1:197\n68#1:198,2\n70#1:200\n*E\n"})
/* loaded from: classes3.dex */
public final class ToggleButtonKt {
    public static final int DURATION = 300;
    public static final int FIFTY_PERCENT = 50;

    /* compiled from: ToggleButton.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.button.ToggleButtonKt$ToggleButtonPreview$2 */
    /* loaded from: classes8.dex */
    public static final class C64002 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64002(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ToggleButtonKt.ToggleButtonPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:238:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x038f  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: ToggleButton-cmh-DWc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15079ToggleButtoncmhDWc(float f, float f2, @Nullable Modifier modifier, @Nullable Modifier modifier2, @NotNull final Function0<Unit> onClick, @Nullable Composer composer, final int i, final int i2) {
        float fDimensionResource;
        int i3;
        float fDimensionResource2;
        Modifier modifierM7771backgroundbw27NRU$default;
        Modifier modifier3;
        Modifier modifierBackground$default;
        int i4;
        float f3;
        Modifier modifier4;
        Object objRememberedValue;
        Composer.Companion companion;
        final MutableState mutableState;
        float fM13666constructorimpl;
        boolean z;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM10870constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Modifier modifier5;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1720348728);
        if ((i & 14) == 0) {
            if ((i2 & 1) == 0) {
                fDimensionResource = f;
                int i5 = composerStartRestartGroup.changed(fDimensionResource) ? 4 : 2;
                i3 = i5 | i;
            } else {
                fDimensionResource = f;
            }
            i3 = i5 | i;
        } else {
            fDimensionResource = f;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                fDimensionResource2 = f2;
                int i6 = composerStartRestartGroup.changed(fDimensionResource2) ? 32 : 16;
                i3 |= i6;
            } else {
                fDimensionResource2 = f2;
            }
            i3 |= i6;
        } else {
            fDimensionResource2 = f2;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                modifierM7771backgroundbw27NRU$default = modifier;
                int i7 = composerStartRestartGroup.changed(modifierM7771backgroundbw27NRU$default) ? 256 : 128;
                i3 |= i7;
            } else {
                modifierM7771backgroundbw27NRU$default = modifier;
            }
            i3 |= i7;
        } else {
            modifierM7771backgroundbw27NRU$default = modifier;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                modifier3 = modifier2;
                int i8 = composerStartRestartGroup.changed(modifier3) ? 2048 : 1024;
                i3 |= i8;
            } else {
                modifier3 = modifier2;
            }
            i3 |= i8;
        } else {
            modifier3 = modifier2;
        }
        if ((i2 & 16) != 0) {
            i3 |= CpioConstants.C_ISBLK;
        } else if ((i & 57344) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 16384 : 8192;
        }
        if ((46811 & i3) != 9362 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            } else {
                if ((i2 & 1) != 0) {
                    fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._45wdp, composerStartRestartGroup, 6);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    Modifier modifierClip = ClipKt.clip(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6)), fDimensionResource), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6)));
                    Color.Companion companion2 = Color.INSTANCE;
                    i3 &= -897;
                    modifierM7771backgroundbw27NRU$default = BackgroundKt.m7771backgroundbw27NRU$default(BorderKt.m7782borderxT4_qwU(BackgroundKt.m7771backgroundbw27NRU$default(modifierClip, companion2.m11366getBlack0d7_KjU(), null, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._05wdp, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape()), companion2.m11366getBlack0d7_KjU(), null, 2, null);
                }
                if ((i2 & 8) != 0) {
                    modifierBackground$default = BackgroundKt.background$default(ClipKt.clip(SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, fDimensionResource2), RoundedCornerShapeKt.RoundedCornerShape(50)), Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.orange, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                    i4 = i3 & (-7169);
                    f3 = fDimensionResource2;
                    modifier4 = modifierM7771backgroundbw27NRU$default;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1720348728, i4, -1, "com.blackhub.bronline.game.ui.widget.button.ToggleButton (ToggleButton.kt:66)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1410679950);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                if (ToggleButton_cmh_DWc$lambda$1(mutableState)) {
                    fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
                } else {
                    fM13666constructorimpl = C2046Dp.m13666constructorimpl(fDimensionResource - f3);
                }
                float f4 = fDimensionResource;
                State<C2046Dp> stateM7677animateDpAsStateAjpBEmI = AnimateAsStateKt.m7677animateDpAsStateAjpBEmI(fM13666constructorimpl, AnimationSpecKt.tween$default(300, 0, null, 6, null), AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, composerStartRestartGroup, 48, 8);
                composerStartRestartGroup.startReplaceableGroup(-1410679615);
                z = (57344 & i4) != 16384;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ToggleButtonKt$ToggleButton$1$1
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
                            ToggleButtonKt.ToggleButton_cmh_DWc$lambda$2(mutableState, !ToggleButtonKt.ToggleButton_cmh_DWc$lambda$1(r0));
                            onClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM7805clickableXHw0xAI$default = ClickableKt.m7805clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue2, 7, null);
                Alignment.Companion companion3 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion3.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7805clickableXHw0xAI$default);
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
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(Modifier.INSTANCE, ToggleButton_cmh_DWc$lambda$3(stateM7677animateDpAsStateAjpBEmI), 0.0f, 2, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default);
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
                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                BoxKt.Box(modifierBackground$default, composerStartRestartGroup, (i4 >> 9) & 14);
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
                fDimensionResource = f4;
                modifierM7771backgroundbw27NRU$default = modifier4;
                modifier5 = modifierBackground$default;
            }
            i4 = i3;
            f3 = fDimensionResource2;
            modifier4 = modifierM7771backgroundbw27NRU$default;
            modifierBackground$default = modifier3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceableGroup(-1410679950);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            if (ToggleButton_cmh_DWc$lambda$1(mutableState)) {
            }
            float f42 = fDimensionResource;
            State<C2046Dp> stateM7677animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m7677animateDpAsStateAjpBEmI(fM13666constructorimpl, AnimationSpecKt.tween$default(300, 0, null, 6, null), AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, composerStartRestartGroup, 48, 8);
            composerStartRestartGroup.startReplaceableGroup(-1410679615);
            if ((57344 & i4) != 16384) {
            }
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ToggleButtonKt$ToggleButton$1$1
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
                        ToggleButtonKt.ToggleButton_cmh_DWc$lambda$2(mutableState, !ToggleButtonKt.ToggleButton_cmh_DWc$lambda$1(r0));
                        onClick.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM7805clickableXHw0xAI$default2 = ClickableKt.m7805clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue2, 7, null);
                Alignment.Companion companion32 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically2 = companion32.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion42.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM7805clickableXHw0xAI$default2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy2, companion42.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap3, companion42.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl.getInserting()) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    Modifier modifierM8084offsetVpY3zN4$default2 = OffsetKt.m8084offsetVpY3zN4$default(Modifier.INSTANCE, ToggleButton_cmh_DWc$lambda$3(stateM7677animateDpAsStateAjpBEmI2), 0.0f, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion32.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion42.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl2.getInserting()) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        BoxKt.Box(modifierBackground$default, composerStartRestartGroup, (i4 >> 9) & 14);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        fDimensionResource = f42;
                        modifierM7771backgroundbw27NRU$default = modifier4;
                        modifier5 = modifierBackground$default;
                    }
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            f3 = fDimensionResource2;
            modifier5 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final float f5 = fDimensionResource;
            final float f6 = f3;
            final Modifier modifier6 = modifierM7771backgroundbw27NRU$default;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ToggleButtonKt$ToggleButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i9) {
                    ToggleButtonKt.m15079ToggleButtoncmhDWc(f5, f6, modifier6, modifier5, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final void ToggleButton_cmh_DWc$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: ToggleButton.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.button.ToggleButtonKt$ToggleButtonPreview$1 */
    /* loaded from: classes8.dex */
    public static final class C63991 extends Lambda implements Function0<Unit> {
        public static final C63991 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void ToggleButtonPreview(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(410852936);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(410852936, i, -1, "com.blackhub.bronline.game.ui.widget.button.ToggleButtonPreview (ToggleButton.kt:99)");
            }
            m15079ToggleButtoncmhDWc(0.0f, 0.0f, null, null, C63991.INSTANCE, composerStartRestartGroup, CpioConstants.C_ISBLK, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ToggleButtonKt.ToggleButtonPreview.2
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C64002(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    ToggleButtonKt.ToggleButtonPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final boolean ToggleButton_cmh_DWc$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final float ToggleButton_cmh_DWc$lambda$3(State<C2046Dp> state) {
        return state.getValue().m13680unboximpl();
    }
}
