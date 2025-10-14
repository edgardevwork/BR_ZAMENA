package com.blackhub.bronline.game.p019ui.widget.block.cloud;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.CornerRadiusKt;
import androidx.compose.p003ui.geometry.RoundRect;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.tooling.preview.Preview;
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
import androidx.compose.runtime.Updater;
import com.bless.client.R;
import kotlin.Metadata;
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

/* compiled from: CloudArrowLeftBlock.kt */
@SourceDebugExtension({"SMAP\nCloudArrowLeftBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudArrowLeftBlock.kt\ncom/blackhub/bronline/game/ui/widget/block/cloud/CloudArrowLeftBlockKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,118:1\n69#2,5:119\n74#2:152\n69#2,5:153\n74#2:186\n78#2:191\n78#2:196\n79#3,11:124\n79#3,11:158\n92#3:190\n92#3:195\n456#4,8:135\n464#4,3:149\n456#4,8:169\n464#4,3:183\n467#4,3:187\n467#4,3:192\n3737#5,6:143\n3737#5,6:177\n*S KotlinDebug\n*F\n+ 1 CloudArrowLeftBlock.kt\ncom/blackhub/bronline/game/ui/widget/block/cloud/CloudArrowLeftBlockKt\n*L\n52#1:119,5\n52#1:152\n98#1:153,5\n98#1:186\n98#1:191\n52#1:196\n52#1:124,11\n98#1:158,11\n98#1:190\n52#1:195\n52#1:135,8\n52#1:149,3\n98#1:169,8\n98#1:183,3\n98#1:187,3\n52#1:192,3\n52#1:143,6\n98#1:177,6\n*E\n"})
/* loaded from: classes3.dex */
public final class CloudArrowLeftBlockKt {
    public static final float HEIGHT = 0.8f;
    public static final float PATH_HEIGHT_COEFF_BOTTOM = 0.7f;
    public static final float PATH_HEIGHT_COEFF_TOP = 0.3f;
    public static final float PATH_WIDTH_COEFF = 0.07f;
    public static final float RADIUS_VAL_FIRST = 0.05f;
    public static final float RADIUS_VAL_SECOND = 0.2f;
    public static final float WIDTH = 0.91f;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016d  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CloudArrowLeftBlock(@Nullable Modifier modifier, @Nullable Brush brush, @Nullable float[] fArr, @Nullable float[] fArr2, @Nullable float[] fArr3, @Nullable float[] fArr4, @Nullable Alignment alignment, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Brush brushM11297verticalGradient8A3gB4$default;
        Alignment center;
        Modifier modifier3;
        int i4;
        char c;
        float[] fArr5;
        float[] fArr6;
        float f;
        float[] fArr7;
        float[] fArr8;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM10870constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final float[] fArr9;
        final Brush brush2;
        final float[] fArr10;
        final Alignment alignment2;
        final float[] fArr11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i5;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(304861342);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                brushM11297verticalGradient8A3gB4$default = brush;
                int i7 = composerStartRestartGroup.changed(brushM11297verticalGradient8A3gB4$default) ? 32 : 16;
                i3 |= i7;
            } else {
                brushM11297verticalGradient8A3gB4$default = brush;
            }
            i3 |= i7;
        } else {
            brushM11297verticalGradient8A3gB4$default = brush;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 1024;
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i3 |= 8192;
        }
        int i11 = i2 & 32;
        if (i11 != 0) {
            i3 |= 65536;
        }
        int i12 = i2 & 64;
        if (i12 != 0) {
            i3 |= 1572864;
        } else {
            if ((i & 3670016) == 0) {
                center = alignment;
                i3 |= composerStartRestartGroup.changed(center) ? 1048576 : 524288;
            }
            if ((i2 & 128) != 0) {
                i5 = (i & 29360128) == 0 ? composerStartRestartGroup.changedInstance(content) ? 8388608 : 4194304 : 12582912;
                if ((i2 & 60) != 60 || (23967451 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(Color.INSTANCE.m11375getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null);
                        }
                        if (i8 == 0) {
                            i4 = 2;
                            c = 0;
                            fArr5 = new float[]{0.05f, 0.2f};
                            i3 &= -897;
                        } else {
                            i4 = 2;
                            c = 0;
                            fArr5 = fArr;
                        }
                        if (i9 == 0) {
                            fArr6 = new float[i4];
                            fArr6[c] = 0.05f;
                            fArr6[1] = 0.2f;
                            i3 &= -7169;
                        } else {
                            fArr6 = fArr2;
                        }
                        if (i10 == 0) {
                            fArr7 = new float[i4];
                            f = 0.0f;
                            fArr7[c] = 0.0f;
                            fArr7[1] = 0.0f;
                            i3 &= -57345;
                        } else {
                            f = 0.0f;
                            fArr7 = fArr3;
                        }
                        if (i11 == 0) {
                            fArr8 = new float[i4];
                            fArr8[c] = f;
                            fArr8[1] = f;
                            i3 = (-458753) & i3;
                        } else {
                            fArr8 = fArr4;
                        }
                        if (i12 != 0) {
                            center = Alignment.INSTANCE.getCenter();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if (i8 != 0) {
                            i3 &= -897;
                        }
                        if (i9 != 0) {
                            i3 &= -7169;
                        }
                        if (i10 != 0) {
                            i3 &= -57345;
                        }
                        if (i11 != 0) {
                            i3 &= -458753;
                        }
                        fArr5 = fArr;
                        fArr6 = fArr2;
                        fArr7 = fArr3;
                        fArr8 = fArr4;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(304861342, i3, -1, "com.blackhub.bronline.game.ui.widget.block.cloud.CloudArrowLeftBlock (CloudArrowLeftBlock.kt:50)");
                    }
                    Alignment centerEnd = Alignment.INSTANCE.getCenterEnd();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerEnd, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier3);
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
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    final Brush brush3 = brushM11297verticalGradient8A3gB4$default;
                    final float[] fArr12 = fArr5;
                    final float[] fArr13 = fArr6;
                    final float[] fArr14 = fArr7;
                    final float[] fArr15 = fArr8;
                    CanvasKt.Canvas(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.cloud.CloudArrowLeftBlockKt$CloudArrowLeftBlock$1$1
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
                            float[] fArr16 = fArr12;
                            float[] fArr17 = fArr13;
                            float[] fArr18 = fArr14;
                            float[] fArr19 = fArr15;
                            Path.moveTo(0.0f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 0.5f);
                            Path.lineTo(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * 0.07f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 0.3f);
                            Path.lineTo(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * 0.07f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 0.7f);
                            Path.addRoundRect(new RoundRect(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * 0.07f, 0.0f, Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()), CornerRadiusKt.CornerRadius(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * fArr16[0], Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * fArr16[1]), CornerRadiusKt.CornerRadius(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * fArr17[0], Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * fArr17[1]), CornerRadiusKt.CornerRadius(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * fArr18[0], Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * fArr18[1]), CornerRadiusKt.CornerRadius(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * fArr19[0], Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * fArr19[1]), null));
                            Path.close();
                            DrawScope.m11879drawPathGBMwjPU$default(Canvas, Path, brush3, 0.0f, null, null, 0, 60, null);
                        }
                    }, composerStartRestartGroup, 6);
                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth(SizeKt.fillMaxHeight(companion2, 0.8f), 0.91f), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._2sdp, composerStartRestartGroup, 6), 0.0f, 11, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, (((i3 >> 15) & 112) >> 3) & 14);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                    Modifier modifier4 = modifier3;
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
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 21) & 14));
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
                    modifier2 = modifier4;
                    fArr9 = fArr7;
                    brush2 = brushM11297verticalGradient8A3gB4$default;
                    fArr10 = fArr8;
                    alignment2 = center;
                    fArr11 = fArr5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    fArr11 = fArr;
                    fArr6 = fArr2;
                    fArr9 = fArr3;
                    brush2 = brushM11297verticalGradient8A3gB4$default;
                    alignment2 = center;
                    fArr10 = fArr4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = modifier2;
                    final float[] fArr16 = fArr6;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.cloud.CloudArrowLeftBlockKt.CloudArrowLeftBlock.2
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

                        public final void invoke(@Nullable Composer composer2, int i13) {
                            CloudArrowLeftBlockKt.CloudArrowLeftBlock(modifier5, brush2, fArr11, fArr16, fArr9, fArr10, alignment2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= i5;
            if ((i2 & 60) != 60) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 == 0) {
                    }
                    if ((i2 & 2) != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 != 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Alignment centerEnd2 = Alignment.INSTANCE.getCenterEnd();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(centerEnd2, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifier3);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl.getInserting()) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        final Brush brush32 = brushM11297verticalGradient8A3gB4$default;
                        final float[] fArr122 = fArr5;
                        final float[] fArr132 = fArr6;
                        final float[] fArr142 = fArr7;
                        final float[] fArr152 = fArr8;
                        CanvasKt.Canvas(SizeKt.fillMaxSize$default(companion22, 0.0f, 1, null), new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.cloud.CloudArrowLeftBlockKt$CloudArrowLeftBlock$1$1
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
                                float[] fArr162 = fArr122;
                                float[] fArr17 = fArr132;
                                float[] fArr18 = fArr142;
                                float[] fArr19 = fArr152;
                                Path.moveTo(0.0f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 0.5f);
                                Path.lineTo(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * 0.07f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 0.3f);
                                Path.lineTo(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * 0.07f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 0.7f);
                                Path.addRoundRect(new RoundRect(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * 0.07f, 0.0f, Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()), CornerRadiusKt.CornerRadius(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * fArr162[0], Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * fArr162[1]), CornerRadiusKt.CornerRadius(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * fArr17[0], Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * fArr17[1]), CornerRadiusKt.CornerRadius(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * fArr18[0], Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * fArr18[1]), CornerRadiusKt.CornerRadius(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * fArr19[0], Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * fArr19[1]), null));
                                Path.close();
                                DrawScope.m11879drawPathGBMwjPU$default(Canvas, Path, brush32, 0.0f, null, null, 0, 60, null);
                            }
                        }, composerStartRestartGroup, 6);
                        Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth(SizeKt.fillMaxHeight(companion22, 0.8f), 0.91f), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._2sdp, composerStartRestartGroup, 6), 0.0f, 11, null);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, (((i3 >> 15) & 112) >> 3) & 14);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor22 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
                        Modifier modifier42 = modifier3;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy22, companion3.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl2.getInserting()) {
                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 21) & 14));
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
                            modifier2 = modifier42;
                            fArr9 = fArr7;
                            brush2 = brushM11297verticalGradient8A3gB4$default;
                            fArr10 = fArr8;
                            alignment2 = center;
                            fArr11 = fArr5;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        center = alignment;
        if ((i2 & 128) != 0) {
        }
        i3 |= i5;
        if ((i2 & 60) != 60) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "CloudArrowLeftBlock")
    public static final void PreviewCloudArrowLeftBlock(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1757495714);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1757495714, i, -1, "com.blackhub.bronline.game.ui.widget.block.cloud.PreviewCloudArrowLeftBlock (CloudArrowLeftBlock.kt:111)");
            }
            CloudArrowLeftBlock(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._47sdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._175sdp, composerStartRestartGroup, 6)), null, null, null, null, null, null, ComposableSingletons$CloudArrowLeftBlockKt.INSTANCE.m15050getLambda1$app_siteRelease(), composerStartRestartGroup, 12582912, 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.cloud.CloudArrowLeftBlockKt.PreviewCloudArrowLeftBlock.1
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
                    CloudArrowLeftBlockKt.PreviewCloudArrowLeftBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

