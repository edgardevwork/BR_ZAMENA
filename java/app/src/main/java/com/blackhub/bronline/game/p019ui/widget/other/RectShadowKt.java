package com.blackhub.bronline.game.p019ui.widget.other;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.Paint;
import androidx.compose.p003ui.graphics.PaintingStyle;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RectShadow.kt */
@SourceDebugExtension({"SMAP\nRectShadow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectShadow.kt\ncom/blackhub/bronline/game/ui/widget/other/RectShadowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,80:1\n154#2:81\n154#2:82\n68#3,6:83\n74#3:117\n78#3:134\n79#4,11:89\n92#4:133\n456#5,8:100\n464#5,3:114\n467#5,3:130\n3737#6,6:108\n1116#7,6:118\n1116#7,6:124\n*S KotlinDebug\n*F\n+ 1 RectShadow.kt\ncom/blackhub/bronline/game/ui/widget/other/RectShadowKt\n*L\n24#1:81\n27#1:82\n29#1:83,6\n29#1:117\n29#1:134\n29#1:89,11\n29#1:133\n29#1:100,8\n29#1:114,3\n29#1:130,3\n29#1:108,6\n32#1:118,6\n39#1:124,6\n*E\n"})
/* loaded from: classes3.dex */
public final class RectShadowKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0123  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: RectShadow-OfrYxbw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15098RectShadowOfrYxbw(@Nullable Modifier modifier, long j, float f, float f2, float f3, float f4, float f5, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        long jM11374getRed0d7_KjU;
        int i4;
        float f6;
        int i5;
        final float fM13666constructorimpl;
        int i6;
        float f7;
        int i7;
        int i8;
        int currentCompositeKeyHash;
        Modifier modifier2;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final float f8;
        final float f9;
        final float f10;
        final float f11;
        final long j2;
        final float f12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2125989174);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                jM11374getRed0d7_KjU = j;
                i3 |= composerStartRestartGroup.changed(jM11374getRed0d7_KjU) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 896) == 0) {
                    f6 = f;
                    i3 |= composerStartRestartGroup.changed(f6) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        fM13666constructorimpl = f2;
                        i3 |= composerStartRestartGroup.changed(fM13666constructorimpl) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((57344 & i) == 0) {
                            f7 = f3;
                            i3 |= composerStartRestartGroup.changed(f7) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                        } else if ((i & 458752) == 0) {
                            i3 |= composerStartRestartGroup.changed(f4) ? 131072 : 65536;
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 3670016) == 0) {
                            i3 |= composerStartRestartGroup.changed(f5) ? 1048576 : 524288;
                        }
                        if ((i3 & 2995931) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier;
                            if (i10 != 0) {
                                jM11374getRed0d7_KjU = Color.INSTANCE.m11374getRed0d7_KjU();
                            }
                            if (i4 != 0) {
                                f6 = 30.0f;
                            }
                            if (i5 != 0) {
                                fM13666constructorimpl = C2046Dp.m13666constructorimpl(6);
                            }
                            if (i6 != 0) {
                                f7 = 200.0f;
                            }
                            float f13 = i7 == 0 ? 0.5f : f4;
                            final float fM13666constructorimpl2 = i8 == 0 ? C2046Dp.m13666constructorimpl(10) : f5;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2125989174, i3, -1, "com.blackhub.bronline.game.ui.widget.other.RectShadow (RectShadow.kt:27)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier3);
                            modifier2 = modifier3;
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
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(-50512224);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            Object obj = objRememberedValue;
                            if (objRememberedValue == companion.getEmpty()) {
                                Paint Paint = AndroidPaint_androidKt.Paint();
                                Paint.mo11223setStylek9PVt8s(PaintingStyle.INSTANCE.m11607getFillTiuSbCo());
                                Paint.setStrokeWidth(f6);
                                composerStartRestartGroup.updateRememberedValue(Paint);
                                obj = Paint;
                            }
                            final Paint paint = (Paint) obj;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-50512040);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = paint.getInternalPaint();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            android.graphics.Paint paint2 = (android.graphics.Paint) objRememberedValue2;
                            composerStartRestartGroup.endReplaceableGroup();
                            long j3 = jM11374getRed0d7_KjU;
                            paint2.setColor(ColorKt.m11394toArgb8_81llA(Color.m11339copywmQWz5c$default(j3, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)));
                            paint2.setShadowLayer(f7, 0.0f, 0.0f, ColorKt.m11394toArgb8_81llA(Color.m11339copywmQWz5c$default(j3, f13, 0.0f, 0.0f, 0.0f, 14, null)));
                            CanvasKt.Canvas(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.RectShadowKt$RectShadow$1$1
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
                                    float fMo7874toPx0680j_4 = Canvas.mo7874toPx0680j_4(fM13666constructorimpl2);
                                    float f14 = fM13666constructorimpl;
                                    Paint paint3 = paint;
                                    Canvas.getDrawContext().getTransform().inset(fMo7874toPx0680j_4, fMo7874toPx0680j_4, fMo7874toPx0680j_4, fMo7874toPx0680j_4);
                                    Canvas.getDrawContext().getCanvas().drawRoundRect(0.0f, 0.0f, Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()), Canvas.mo7874toPx0680j_4(f14), Canvas.mo7874toPx0680j_4(f14), paint3);
                                    float f15 = -fMo7874toPx0680j_4;
                                    Canvas.getDrawContext().getTransform().inset(f15, f15, f15, f15);
                                }
                            }, composerStartRestartGroup, 6);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f8 = fM13666constructorimpl2;
                            f9 = f6;
                            f10 = fM13666constructorimpl;
                            f11 = f13;
                            j2 = jM11374getRed0d7_KjU;
                            f12 = f7;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            f8 = f5;
                            j2 = jM11374getRed0d7_KjU;
                            f9 = f6;
                            f10 = fM13666constructorimpl;
                            f12 = f7;
                            f11 = f4;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier2;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.RectShadowKt$RectShadow$2
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
                                    RectShadowKt.m15098RectShadowOfrYxbw(modifier4, j2, f9, f10, f12, f11, f8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= CpioConstants.C_ISBLK;
                    f7 = f3;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    if ((i3 & 2995931) != 599186) {
                        if (i9 == 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier3);
                        modifier2 = modifier3;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
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
                            composerStartRestartGroup.startReplaceableGroup(-50512224);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            Object obj2 = objRememberedValue;
                            if (objRememberedValue == companion.getEmpty()) {
                            }
                            final Paint paint3 = (Paint) obj2;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-50512040);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                            }
                            android.graphics.Paint paint22 = (android.graphics.Paint) objRememberedValue2;
                            composerStartRestartGroup.endReplaceableGroup();
                            long j32 = jM11374getRed0d7_KjU;
                            paint22.setColor(ColorKt.m11394toArgb8_81llA(Color.m11339copywmQWz5c$default(j32, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)));
                            paint22.setShadowLayer(f7, 0.0f, 0.0f, ColorKt.m11394toArgb8_81llA(Color.m11339copywmQWz5c$default(j32, f13, 0.0f, 0.0f, 0.0f, 14, null)));
                            CanvasKt.Canvas(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.RectShadowKt$RectShadow$1$1
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
                                    float fMo7874toPx0680j_4 = Canvas.mo7874toPx0680j_4(fM13666constructorimpl2);
                                    float f14 = fM13666constructorimpl;
                                    Paint paint32 = paint3;
                                    Canvas.getDrawContext().getTransform().inset(fMo7874toPx0680j_4, fMo7874toPx0680j_4, fMo7874toPx0680j_4, fMo7874toPx0680j_4);
                                    Canvas.getDrawContext().getCanvas().drawRoundRect(0.0f, 0.0f, Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()), Canvas.mo7874toPx0680j_4(f14), Canvas.mo7874toPx0680j_4(f14), paint32);
                                    float f15 = -fMo7874toPx0680j_4;
                                    Canvas.getDrawContext().getTransform().inset(f15, f15, f15, f15);
                                }
                            }, composerStartRestartGroup, 6);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f8 = fM13666constructorimpl2;
                            f9 = f6;
                            f10 = fM13666constructorimpl;
                            f11 = f13;
                            j2 = jM11374getRed0d7_KjU;
                            f12 = f7;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                fM13666constructorimpl = f2;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                f7 = f3;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                if ((i3 & 2995931) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            f6 = f;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            fM13666constructorimpl = f2;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            f7 = f3;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            if ((i3 & 2995931) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        jM11374getRed0d7_KjU = j;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f6 = f;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        fM13666constructorimpl = f2;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        f7 = f3;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        if ((i3 & 2995931) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "RectShadow")
    public static final void PreviewRectShadow(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(28161024);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(28161024, i, -1, "com.blackhub.bronline.game.ui.widget.other.PreviewRectShadow (RectShadow.kt:77)");
            }
            m15098RectShadowOfrYxbw(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 6, 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.RectShadowKt.PreviewRectShadow.1
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
                    RectShadowKt.PreviewRectShadow(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

