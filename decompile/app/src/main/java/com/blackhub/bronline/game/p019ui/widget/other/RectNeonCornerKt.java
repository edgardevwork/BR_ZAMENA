package com.blackhub.bronline.game.p019ui.widget.other;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.CornerRadiusKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.Paint;
import androidx.compose.p003ui.graphics.PaintingStyle;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
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
import androidx.media3.exoplayer.analytics.AnalyticsListener;
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
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RectNeonCorner.kt */
@Metadata(m7104d1 = {"\u00004\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\r\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\b\u001av\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, m7105d2 = {"RADIUS_BLUR", "", "RADIUS_CORNER", "", "STROKE_RECT_WIDTH", "STROKE_SHADOW_WIDTH", "PreviewRectNeonCorner", "", "(Landroidx/compose/runtime/Composer;I)V", "RectNeonCorner", "modifier", "Landroidx/compose/ui/Modifier;", "colorStroke", "Landroidx/compose/ui/graphics/Color;", "strokeRectWidth", "Landroidx/compose/ui/unit/Dp;", "colorShadow", "strokeShadowWidth", "radiusCorner", "radiusBlur", "alpha", "insetDp", "isNeedDrawLine", "", "RectNeonCorner-FuCtLKA", "(Landroidx/compose/ui/Modifier;JFJFFFFFZLandroidx/compose/runtime/Composer;II)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRectNeonCorner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectNeonCorner.kt\ncom/blackhub/bronline/game/ui/widget/other/RectNeonCornerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,113:1\n154#2:114\n154#2:115\n154#2:116\n68#3,6:117\n74#3:151\n78#3:168\n79#4,11:123\n92#4:167\n456#5,8:134\n464#5,3:148\n467#5,3:164\n3737#6,6:142\n1116#7,6:152\n1116#7,6:158\n*S KotlinDebug\n*F\n+ 1 RectNeonCorner.kt\ncom/blackhub/bronline/game/ui/widget/other/RectNeonCornerKt\n*L\n35#1:114\n38#1:115\n41#1:116\n44#1:117,6\n44#1:151\n44#1:168\n44#1:123,11\n44#1:167\n44#1:134,8\n44#1:148,3\n44#1:164,3\n44#1:142,6\n47#1:152,6\n54#1:158,6\n*E\n"})
/* loaded from: classes3.dex */
public final class RectNeonCornerKt {
    public static final float RADIUS_BLUR = 20.0f;
    public static final int RADIUS_CORNER = 6;
    public static final int STROKE_RECT_WIDTH = 2;
    public static final float STROKE_SHADOW_WIDTH = 30.0f;

    /* JADX WARN: Removed duplicated region for block: B:108:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: RectNeonCorner-FuCtLKA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15097RectNeonCornerFuCtLKA(@Nullable Modifier modifier, long j, float f, long j2, float f2, float f3, float f4, float f5, float f6, boolean z, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        float f7;
        int i5;
        int i6;
        float f8;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Modifier modifier2;
        float f9;
        int currentCompositeKeyHash;
        final long j3;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final long j4;
        final float f10;
        final float f11;
        final float f12;
        final float f13;
        final boolean z2;
        final float f14;
        final float f15;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1823086141);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 896) == 0) {
                    f7 = f;
                    i3 |= composerStartRestartGroup.changed(f7) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    i3 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
                }
                i6 = i2 & 16;
                if (i6 == 0) {
                    if ((57344 & i) == 0) {
                        f8 = f2;
                        i3 |= composerStartRestartGroup.changed(f8) ? 16384 : 8192;
                    }
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else if ((i & 458752) == 0) {
                        i3 |= composerStartRestartGroup.changed(f3) ? 131072 : 65536;
                    }
                    i8 = i2 & 64;
                    if (i8 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i3 |= composerStartRestartGroup.changed(f4) ? 1048576 : 524288;
                    }
                    i9 = i2 & 128;
                    if (i9 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i3 |= composerStartRestartGroup.changed(f5) ? 8388608 : 4194304;
                    }
                    i10 = i2 & 256;
                    if (i10 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i3 |= composerStartRestartGroup.changed(f6) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i11 = i2 & 512;
                    if (i11 == 0) {
                        i3 |= 805306368;
                    } else if ((i & 1879048192) == 0) {
                        i3 |= composerStartRestartGroup.changed(z) ? 536870912 : 268435456;
                    }
                    if ((1533916891 & i3) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        modifier2 = i12 == 0 ? Modifier.INSTANCE : modifier;
                        long jM11374getRed0d7_KjU = i13 == 0 ? Color.INSTANCE.m11374getRed0d7_KjU() : j;
                        float fM13666constructorimpl = i4 == 0 ? C2046Dp.m13666constructorimpl(2) : f7;
                        long jM11374getRed0d7_KjU2 = i5 == 0 ? Color.INSTANCE.m11374getRed0d7_KjU() : j2;
                        float f16 = i6 == 0 ? 30.0f : f8;
                        float fM13666constructorimpl2 = i7 == 0 ? C2046Dp.m13666constructorimpl(6) : f3;
                        float f17 = i8 == 0 ? 20.0f : f4;
                        float f18 = i9 == 0 ? 0.5f : f5;
                        float fM13666constructorimpl3 = i10 == 0 ? C2046Dp.m13666constructorimpl(10) : f6;
                        boolean z3 = i11 == 0 ? true : z;
                        if (ComposerKt.isTraceInProgress()) {
                            f9 = fM13666constructorimpl;
                        } else {
                            f9 = fM13666constructorimpl;
                            ComposerKt.traceEventStart(1823086141, i3, -1, "com.blackhub.bronline.game.ui.widget.other.RectNeonCorner (RectNeonCorner.kt:42)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        j3 = jM11374getRed0d7_KjU;
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
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
                        composerStartRestartGroup.startReplaceableGroup(-1101176945);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        Object obj = objRememberedValue;
                        if (objRememberedValue == companion.getEmpty()) {
                            Paint Paint = AndroidPaint_androidKt.Paint();
                            Paint.mo11223setStylek9PVt8s(PaintingStyle.INSTANCE.m11608getStrokeTiuSbCo());
                            Paint.setStrokeWidth(f16);
                            composerStartRestartGroup.updateRememberedValue(Paint);
                            obj = Paint;
                        }
                        final Paint paint = (Paint) obj;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1101176759);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = paint.getInternalPaint();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        android.graphics.Paint paint2 = (android.graphics.Paint) objRememberedValue2;
                        composerStartRestartGroup.endReplaceableGroup();
                        long j5 = jM11374getRed0d7_KjU2;
                        paint2.setColor(ColorKt.m11394toArgb8_81llA(Color.m11339copywmQWz5c$default(j5, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)));
                        paint2.setShadowLayer(f17, 0.0f, 0.0f, ColorKt.m11394toArgb8_81llA(Color.m11339copywmQWz5c$default(j5, f18, 0.0f, 0.0f, 0.0f, 14, null)));
                        final float f19 = fM13666constructorimpl3;
                        final float f20 = fM13666constructorimpl2;
                        final boolean z4 = z3;
                        final float f21 = f9;
                        CanvasKt.Canvas(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.RectNeonCornerKt$RectNeonCorner$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:9:0x0094  */
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void invoke2(@NotNull DrawScope Canvas) {
                                float f22;
                                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                float fMo7874toPx0680j_4 = Canvas.mo7874toPx0680j_4(f19);
                                float f23 = f20;
                                Paint paint3 = paint;
                                boolean z5 = z4;
                                long j6 = j3;
                                float f24 = f21;
                                Canvas.getDrawContext().getTransform().inset(fMo7874toPx0680j_4, fMo7874toPx0680j_4, fMo7874toPx0680j_4, fMo7874toPx0680j_4);
                                float fM11168getWidthimpl = Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc());
                                float fM11165getHeightimpl = Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc());
                                if (fM11168getWidthimpl < 0.0f || fM11165getHeightimpl < 0.0f) {
                                    f22 = fMo7874toPx0680j_4;
                                } else {
                                    Canvas.getDrawContext().getCanvas().drawRoundRect(0.0f, 0.0f, fM11168getWidthimpl, fM11165getHeightimpl, Canvas.mo7874toPx0680j_4(f23), Canvas.mo7874toPx0680j_4(f23), paint3);
                                    if (z5) {
                                        f22 = fMo7874toPx0680j_4;
                                        DrawScope.m11886drawRoundRectuAw5IA$default(Canvas, j6, 0L, 0L, CornerRadiusKt.CornerRadius(Canvas.mo7874toPx0680j_4(f23), Canvas.mo7874toPx0680j_4(f23)), new Stroke(Canvas.mo7874toPx0680j_4(f24), 0.0f, 0, 0, null, 30, null), 0.0f, null, 0, 230, null);
                                    }
                                }
                                float f25 = -f22;
                                Canvas.getDrawContext().getTransform().inset(f25, f25, f25, f25);
                            }
                        }, composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j4 = jM11374getRed0d7_KjU2;
                        f10 = f16;
                        f11 = f17;
                        f12 = fM13666constructorimpl2;
                        f13 = f18;
                        z2 = z3;
                        f14 = fM13666constructorimpl3;
                        f15 = f9;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        j3 = j;
                        j4 = j2;
                        f12 = f3;
                        f11 = f4;
                        f14 = f6;
                        z2 = z;
                        f15 = f7;
                        f10 = f8;
                        f13 = f5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier3 = modifier2;
                        final long j6 = j3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.RectNeonCornerKt$RectNeonCorner$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i14) {
                                RectNeonCornerKt.m15097RectNeonCornerFuCtLKA(modifier3, j6, f15, j4, f10, f12, f11, f13, f14, z2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= CpioConstants.C_ISBLK;
                f8 = f2;
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                i9 = i2 & 128;
                if (i9 == 0) {
                }
                i10 = i2 & 256;
                if (i10 == 0) {
                }
                i11 = i2 & 512;
                if (i11 == 0) {
                }
                if ((1533916891 & i3) == 306783378) {
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
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
                    j3 = jM11374getRed0d7_KjU;
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier2);
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
                        composerStartRestartGroup.startReplaceableGroup(-1101176945);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        Object obj2 = objRememberedValue;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        final Paint paint3 = (Paint) obj2;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1101176759);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        android.graphics.Paint paint22 = (android.graphics.Paint) objRememberedValue2;
                        composerStartRestartGroup.endReplaceableGroup();
                        long j52 = jM11374getRed0d7_KjU2;
                        paint22.setColor(ColorKt.m11394toArgb8_81llA(Color.m11339copywmQWz5c$default(j52, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)));
                        paint22.setShadowLayer(f17, 0.0f, 0.0f, ColorKt.m11394toArgb8_81llA(Color.m11339copywmQWz5c$default(j52, f18, 0.0f, 0.0f, 0.0f, 14, null)));
                        final float f192 = fM13666constructorimpl3;
                        final float f202 = fM13666constructorimpl2;
                        final boolean z42 = z3;
                        final float f212 = f9;
                        CanvasKt.Canvas(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.RectNeonCornerKt$RectNeonCorner$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:9:0x0094  */
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void invoke2(@NotNull DrawScope Canvas) {
                                float f22;
                                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                float fMo7874toPx0680j_4 = Canvas.mo7874toPx0680j_4(f192);
                                float f23 = f202;
                                Paint paint32 = paint3;
                                boolean z5 = z42;
                                long j62 = j3;
                                float f24 = f212;
                                Canvas.getDrawContext().getTransform().inset(fMo7874toPx0680j_4, fMo7874toPx0680j_4, fMo7874toPx0680j_4, fMo7874toPx0680j_4);
                                float fM11168getWidthimpl = Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc());
                                float fM11165getHeightimpl = Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc());
                                if (fM11168getWidthimpl < 0.0f || fM11165getHeightimpl < 0.0f) {
                                    f22 = fMo7874toPx0680j_4;
                                } else {
                                    Canvas.getDrawContext().getCanvas().drawRoundRect(0.0f, 0.0f, fM11168getWidthimpl, fM11165getHeightimpl, Canvas.mo7874toPx0680j_4(f23), Canvas.mo7874toPx0680j_4(f23), paint32);
                                    if (z5) {
                                        f22 = fMo7874toPx0680j_4;
                                        DrawScope.m11886drawRoundRectuAw5IA$default(Canvas, j62, 0L, 0L, CornerRadiusKt.CornerRadius(Canvas.mo7874toPx0680j_4(f23), Canvas.mo7874toPx0680j_4(f23)), new Stroke(Canvas.mo7874toPx0680j_4(f24), 0.0f, 0, 0, null, 30, null), 0.0f, null, 0, 230, null);
                                    }
                                }
                                float f25 = -f22;
                                Canvas.getDrawContext().getTransform().inset(f25, f25, f25, f25);
                            }
                        }, composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        j4 = jM11374getRed0d7_KjU2;
                        f10 = f16;
                        f11 = f17;
                        f12 = fM13666constructorimpl2;
                        f13 = f18;
                        z2 = z3;
                        f14 = fM13666constructorimpl3;
                        f15 = f9;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            f7 = f;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            f8 = f2;
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            i9 = i2 & 128;
            if (i9 == 0) {
            }
            i10 = i2 & 256;
            if (i10 == 0) {
            }
            i11 = i2 & 512;
            if (i11 == 0) {
            }
            if ((1533916891 & i3) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f7 = f;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        f8 = f2;
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        i9 = i2 & 128;
        if (i9 == 0) {
        }
        i10 = i2 & 256;
        if (i10 == 0) {
        }
        i11 = i2 & 512;
        if (i11 == 0) {
        }
        if ((1533916891 & i3) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "RectNeonCorner")
    public static final void PreviewRectNeonCorner(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(628413472);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(628413472, i, -1, "com.blackhub.bronline.game.ui.widget.other.PreviewRectNeonCorner (RectNeonCorner.kt:110)");
            }
            m15097RectNeonCornerFuCtLKA(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0.0f, 0L, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, composerStartRestartGroup, 6, AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.RectNeonCornerKt.PreviewRectNeonCorner.1
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
                    RectNeonCornerKt.PreviewRectNeonCorner(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
