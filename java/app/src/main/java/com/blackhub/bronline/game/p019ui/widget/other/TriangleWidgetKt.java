package com.blackhub.bronline.game.p019ui.widget.other;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.draw.RotateKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.RectKt;
import androidx.compose.p003ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Outline;
import androidx.compose.p003ui.graphics.OutlineKt;
import androidx.compose.p003ui.graphics.Paint;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.PathEffect;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
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
import androidx.profileinstaller.ProfileVerifier;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TriangleWidget.kt */
@SourceDebugExtension({"SMAP\nTriangleWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TriangleWidget.kt\ncom/blackhub/bronline/game/ui/widget/other/TriangleWidgetKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,85:1\n75#2:86\n92#2:123\n154#3:87\n68#4,6:88\n74#4:122\n78#4:134\n79#5,11:94\n92#5:133\n456#6,8:105\n464#6,3:119\n467#6,3:130\n3737#7,6:113\n1116#8,6:124\n*S KotlinDebug\n*F\n+ 1 TriangleWidget.kt\ncom/blackhub/bronline/game/ui/widget/other/TriangleWidgetKt\n*L\n38#1:86\n53#1:123\n42#1:87\n44#1:88,6\n44#1:122\n44#1:134\n44#1:94,11\n44#1:133\n44#1:105,8\n44#1:119,3\n44#1:130,3\n44#1:113,6\n56#1:124,6\n*E\n"})
/* loaded from: classes3.dex */
public final class TriangleWidgetKt {

    /* compiled from: TriangleWidget.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.other.TriangleWidgetKt$PreviewTriangleWithRoundedCorners$1 */
    /* loaded from: classes8.dex */
    public static final class C64461 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64461(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TriangleWidgetKt.PreviewTriangleWithRoundedCorners(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: TriangleWidget-m7uSSuA */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15099TriangleWidgetm7uSSuA(@Nullable Modifier modifier, float f, float f2, long j, float f3, float f4, float f5, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float fDimensionResource;
        float fM13666constructorimpl;
        final long jM11377getWhite0d7_KjU;
        int i4;
        float f6;
        int i5;
        float f7;
        int i6;
        Modifier modifier3;
        float fM13666constructorimpl2;
        int currentCompositeKeyHash;
        Modifier modifier4;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z;
        Object objRememberedValue;
        final float f8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1418337690);
        int i7 = i2 & 1;
        if (i7 != 0) {
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
                fDimensionResource = f;
                int i8 = composerStartRestartGroup.changed(fDimensionResource) ? 32 : 16;
                i3 |= i8;
            } else {
                fDimensionResource = f;
            }
            i3 |= i8;
        } else {
            fDimensionResource = f;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                fM13666constructorimpl = f2;
                int i9 = composerStartRestartGroup.changed(fM13666constructorimpl) ? 256 : 128;
                i3 |= i9;
            } else {
                fM13666constructorimpl = f2;
            }
            i3 |= i9;
        } else {
            fM13666constructorimpl = f2;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 7168) == 0) {
                jM11377getWhite0d7_KjU = j;
                i3 |= composerStartRestartGroup.changed(jM11377getWhite0d7_KjU) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((57344 & i) == 0) {
                    f6 = f3;
                    i3 |= composerStartRestartGroup.changed(f6) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    f7 = f4;
                } else {
                    f7 = f4;
                    if ((i & 458752) == 0) {
                        i3 |= composerStartRestartGroup.changed(f7) ? 131072 : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i3 |= composerStartRestartGroup.changed(f5) ? 1048576 : 524288;
                }
                if ((i3 & 2995931) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composerStartRestartGroup, 6);
                        }
                        if ((i2 & 4) != 0) {
                            fM13666constructorimpl = C2046Dp.m13666constructorimpl(fDimensionResource / 2);
                            i3 &= -897;
                        }
                        if (i10 != 0) {
                            jM11377getWhite0d7_KjU = Color.INSTANCE.m11377getWhite0d7_KjU();
                        }
                        if (i4 != 0) {
                            f6 = 1.0f;
                        }
                        if (i5 != 0) {
                            f7 = 0.0f;
                        }
                        fM13666constructorimpl2 = i6 == 0 ? C2046Dp.m13666constructorimpl(0) : f5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        fM13666constructorimpl2 = f5;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1418337690, i3, -1, "com.blackhub.bronline.game.ui.widget.other.TriangleWidget (TriangleWidget.kt:42)");
                    }
                    Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(modifier3, fM13666constructorimpl2, 0.0f, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8125paddingVpY3zN4$default);
                    modifier4 = modifier3;
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
                    Modifier modifierRotate = RotateKt.rotate(OffsetKt.m8084offsetVpY3zN4$default(AlphaKt.alpha(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, fDimensionResource), fM13666constructorimpl), f6), 0.0f, C2046Dp.m13666constructorimpl(PrimitiveResources_androidKt.dimensionResource(R.dimen._05wdp, composerStartRestartGroup, 6) * (-1)), 1, null), f7);
                    composerStartRestartGroup.startReplaceableGroup(1546180306);
                    z = (i3 & 7168) != 2048;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.TriangleWidgetKt$TriangleWidget$1$1$1
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
                                Rect rectM11139Recttz77jQw = RectKt.m11139Recttz77jQw(Offset.INSTANCE.m11115getZeroF1C5BW0(), Canvas.mo11889getSizeNHjbRc());
                                Path Path = AndroidPath_androidKt.Path();
                                Path.moveTo(Offset.m11099getXimpl(rectM11139Recttz77jQw.m11133getTopCenterF1C5BW0()), Offset.m11100getYimpl(rectM11139Recttz77jQw.m11133getTopCenterF1C5BW0()));
                                Path.lineTo(Offset.m11099getXimpl(rectM11139Recttz77jQw.m11128getBottomRightF1C5BW0()), Offset.m11100getYimpl(rectM11139Recttz77jQw.m11128getBottomRightF1C5BW0()));
                                Path.lineTo(Offset.m11099getXimpl(rectM11139Recttz77jQw.m11127getBottomLeftF1C5BW0()), Offset.m11100getYimpl(rectM11139Recttz77jQw.m11127getBottomLeftF1C5BW0()));
                                Path.close();
                                long j2 = jM11377getWhite0d7_KjU;
                                Canvas canvas = Canvas.getDrawContext().getCanvas();
                                Outline.Generic generic = new Outline.Generic(Path);
                                Paint Paint = AndroidPaint_androidKt.Paint();
                                Paint.mo11219setColor8_81llA(j2);
                                Paint.setPathEffect(PathEffect.INSTANCE.cornerPathEffect(rectM11139Recttz77jQw.getMaxDimension() / 10));
                                Unit unit = Unit.INSTANCE;
                                OutlineKt.drawOutline(canvas, generic, Paint);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierRotate, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f8 = fM13666constructorimpl2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    f8 = f5;
                    modifier4 = modifier2;
                }
                final float f9 = fDimensionResource;
                final float f10 = fM13666constructorimpl;
                final float f11 = f7;
                final long j2 = jM11377getWhite0d7_KjU;
                final float f12 = f6;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = modifier4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.TriangleWidgetKt$TriangleWidget$2
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
                            TriangleWidgetKt.m15099TriangleWidgetm7uSSuA(modifier5, f9, f10, j2, f12, f11, f8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= CpioConstants.C_ISBLK;
            f6 = f3;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            if ((i3 & 2995931) != 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 == 0) {
                    }
                    if ((i2 & 2) != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierM8125paddingVpY3zN4$default2 = PaddingKt.m8125paddingVpY3zN4$default(modifier3, fM13666constructorimpl2, 0.0f, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8125paddingVpY3zN4$default2);
                    modifier4 = modifier3;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl.getInserting()) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Modifier modifierRotate2 = RotateKt.rotate(OffsetKt.m8084offsetVpY3zN4$default(AlphaKt.alpha(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, fDimensionResource), fM13666constructorimpl), f6), 0.0f, C2046Dp.m13666constructorimpl(PrimitiveResources_androidKt.dimensionResource(R.dimen._05wdp, composerStartRestartGroup, 6) * (-1)), 1, null), f7);
                        composerStartRestartGroup.startReplaceableGroup(1546180306);
                        if ((i3 & 7168) != 2048) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z) {
                            objRememberedValue = new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.TriangleWidgetKt$TriangleWidget$1$1$1
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
                                    Rect rectM11139Recttz77jQw = RectKt.m11139Recttz77jQw(Offset.INSTANCE.m11115getZeroF1C5BW0(), Canvas.mo11889getSizeNHjbRc());
                                    Path Path = AndroidPath_androidKt.Path();
                                    Path.moveTo(Offset.m11099getXimpl(rectM11139Recttz77jQw.m11133getTopCenterF1C5BW0()), Offset.m11100getYimpl(rectM11139Recttz77jQw.m11133getTopCenterF1C5BW0()));
                                    Path.lineTo(Offset.m11099getXimpl(rectM11139Recttz77jQw.m11128getBottomRightF1C5BW0()), Offset.m11100getYimpl(rectM11139Recttz77jQw.m11128getBottomRightF1C5BW0()));
                                    Path.lineTo(Offset.m11099getXimpl(rectM11139Recttz77jQw.m11127getBottomLeftF1C5BW0()), Offset.m11100getYimpl(rectM11139Recttz77jQw.m11127getBottomLeftF1C5BW0()));
                                    Path.close();
                                    long j22 = jM11377getWhite0d7_KjU;
                                    Canvas canvas = Canvas.getDrawContext().getCanvas();
                                    Outline.Generic generic = new Outline.Generic(Path);
                                    Paint Paint = AndroidPaint_androidKt.Paint();
                                    Paint.mo11219setColor8_81llA(j22);
                                    Paint.setPathEffect(PathEffect.INSTANCE.cornerPathEffect(rectM11139Recttz77jQw.getMaxDimension() / 10));
                                    Unit unit = Unit.INSTANCE;
                                    OutlineKt.drawOutline(canvas, generic, Paint);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceableGroup();
                            CanvasKt.Canvas(modifierRotate2, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f8 = fM13666constructorimpl2;
                        }
                    }
                }
            }
            final float f92 = fDimensionResource;
            final float f102 = fM13666constructorimpl;
            final float f112 = f7;
            final long j22 = jM11377getWhite0d7_KjU;
            final float f122 = f6;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        jM11377getWhite0d7_KjU = j;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        f6 = f3;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        if ((i3 & 2995931) != 599186) {
        }
        final float f922 = fDimensionResource;
        final float f1022 = fM13666constructorimpl;
        final float f1122 = f7;
        final long j222 = jM11377getWhite0d7_KjU;
        final float f1222 = f6;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void PreviewTriangleWithRoundedCorners(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1652726131);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1652726131, i, -1, "com.blackhub.bronline.game.ui.widget.other.PreviewTriangleWithRoundedCorners (TriangleWidget.kt:81)");
            }
            m15099TriangleWidgetm7uSSuA(null, 0.0f, 0.0f, 0L, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 0, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.TriangleWidgetKt.PreviewTriangleWithRoundedCorners.1
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C64461(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    TriangleWidgetKt.PreviewTriangleWithRoundedCorners(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

