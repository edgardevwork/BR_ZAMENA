package com.blackhub.bronline.game.p019ui.widget.other;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
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
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CustomShadowShape.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u001an\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, m7105d2 = {"START_ANGLE", "", "CustomShadowShape", "", "modifier", "Landroidx/compose/ui/Modifier;", "glowColor", "Landroidx/compose/ui/graphics/Color;", "glowRadius", "", "startX", "startY", "sideLengthsDp", "", "Landroidx/compose/ui/unit/Dp;", "angles", "startAngle", "CustomShadowShape-Y2L_72g", "(Landroidx/compose/ui/Modifier;JFFFLjava/util/List;Ljava/util/List;DLandroidx/compose/runtime/Composer;II)V", "CustomShape3Preview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCustomShadowShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomShadowShape.kt\ncom/blackhub/bronline/game/ui/widget/other/CustomShadowShapeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,83:1\n74#2:84\n68#3,6:85\n74#3:119\n78#3:124\n79#4,11:91\n92#4:123\n456#5,8:102\n464#5,3:116\n467#5,3:120\n3737#6,6:110\n*S KotlinDebug\n*F\n+ 1 CustomShadowShape.kt\ncom/blackhub/bronline/game/ui/widget/other/CustomShadowShapeKt\n*L\n42#1:84\n44#1:85,6\n44#1:119\n44#1:124\n44#1:91,11\n44#1:123\n44#1:102,8\n44#1:116,3\n44#1:120,3\n44#1:110,6\n*E\n"})
/* loaded from: classes3.dex */
public final class CustomShadowShapeKt {
    public static final double START_ANGLE = 190.0d;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: CustomShadowShape-Y2L_72g, reason: not valid java name */
    public static final void m15088CustomShadowShapeY2L_72g(@Nullable Modifier modifier, long j, float f, float f2, float f3, @Nullable List<C2046Dp> list, @Nullable List<Double> list2, double d, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float fM14409dpToPx8Feqmps;
        float fM14409dpToPx8Feqmps2;
        float fM14409dpToPx8Feqmps3;
        double d2;
        long jColorResource;
        Modifier modifier3;
        List<C2046Dp> listListOf;
        List<Double> listListOf2;
        final float f4;
        final List<C2046Dp> list3;
        float f5;
        final List<Double> list4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-291325847);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(j)) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                fM14409dpToPx8Feqmps = f;
                int i5 = composerStartRestartGroup.changed(fM14409dpToPx8Feqmps) ? 256 : 128;
                i3 |= i5;
            } else {
                fM14409dpToPx8Feqmps = f;
            }
            i3 |= i5;
        } else {
            fM14409dpToPx8Feqmps = f;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                fM14409dpToPx8Feqmps2 = f2;
                int i6 = composerStartRestartGroup.changed(fM14409dpToPx8Feqmps2) ? 2048 : 1024;
                i3 |= i6;
            } else {
                fM14409dpToPx8Feqmps2 = f2;
            }
            i3 |= i6;
        } else {
            fM14409dpToPx8Feqmps2 = f2;
        }
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0) {
                fM14409dpToPx8Feqmps3 = f3;
                int i7 = composerStartRestartGroup.changed(fM14409dpToPx8Feqmps3) ? 16384 : 8192;
                i3 |= i7;
            } else {
                fM14409dpToPx8Feqmps3 = f3;
            }
            i3 |= i7;
        } else {
            fM14409dpToPx8Feqmps3 = f3;
        }
        int i8 = i2 & 32;
        if (i8 != 0) {
            i3 |= 65536;
        }
        int i9 = i2 & 64;
        if (i9 != 0) {
            i3 |= 524288;
        }
        int i10 = i2 & 128;
        if (i10 != 0) {
            i3 |= 12582912;
            d2 = d;
        } else {
            d2 = d;
            if ((29360128 & i) == 0) {
                i3 |= composerStartRestartGroup.changed(d2) ? 8388608 : 4194304;
            }
        }
        if ((i2 & 96) != 96 || (23967451 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    jColorResource = ColorResources_androidKt.colorResource(R.color.light_yellow, composerStartRestartGroup, 6);
                    i3 &= -113;
                } else {
                    jColorResource = j;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    fM14409dpToPx8Feqmps = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    fM14409dpToPx8Feqmps2 = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    fM14409dpToPx8Feqmps3 = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._158wdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
                }
                if (i8 != 0) {
                    modifier3 = modifier2;
                    listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new C2046Dp[]{C2046Dp.m13664boximpl(PrimitiveResources_androidKt.dimensionResource(R.dimen._116wdp, composerStartRestartGroup, 6)), C2046Dp.m13664boximpl(PrimitiveResources_androidKt.dimensionResource(R.dimen._60wdp, composerStartRestartGroup, 6)), C2046Dp.m13664boximpl(PrimitiveResources_androidKt.dimensionResource(R.dimen._56wdp, composerStartRestartGroup, 6)), C2046Dp.m13664boximpl(PrimitiveResources_androidKt.dimensionResource(R.dimen._103wdp, composerStartRestartGroup, 6)), C2046Dp.m13664boximpl(PrimitiveResources_androidKt.dimensionResource(R.dimen._103wdp, composerStartRestartGroup, 6))});
                    i3 = (-458753) & i3;
                } else {
                    modifier3 = modifier2;
                    listListOf = list;
                }
                listListOf2 = i9 != 0 ? CollectionsKt__CollectionsKt.listOf((Object[]) new Double[]{Double.valueOf(80.0d), Double.valueOf(64.0d), Double.valueOf(56.0d), Double.valueOf(60.0d), Double.valueOf(83.7d)}) : list2;
                if (i10 != 0) {
                    d2 = 190.0d;
                    modifier2 = modifier3;
                } else {
                    modifier2 = modifier3;
                    d2 = d;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if (i8 != 0) {
                    i3 &= -458753;
                }
                jColorResource = j;
                listListOf = list;
                listListOf2 = list2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-291325847, i3, -1, "com.blackhub.bronline.game.ui.widget.other.CustomShadowShape (CustomShadowShape.kt:40)");
            }
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
            Modifier modifier4 = modifier2;
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
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            final List<C2046Dp> list5 = listListOf;
            final double d3 = d2;
            final float f6 = fM14409dpToPx8Feqmps2;
            final float f7 = fM14409dpToPx8Feqmps3;
            final List<Double> list6 = listListOf2;
            final long j2 = jColorResource;
            final float f8 = fM14409dpToPx8Feqmps;
            CanvasKt.Canvas(BoxScopeInstance.INSTANCE.matchParentSize(Modifier.INSTANCE), new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.CustomShadowShapeKt$CustomShadowShape$1$1
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
                    Path path = new Path();
                    List<C2046Dp> list7 = list5;
                    double dDoubleValue = d3;
                    float fFloatValue = f6;
                    float fFloatValue2 = f7;
                    List<Double> list8 = list6;
                    Density density2 = density;
                    List<C2046Dp> list9 = list7;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list9, 10));
                    Iterator<T> it = list9.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Float.valueOf(density2.mo7874toPx0680j_4(((C2046Dp) it.next()).m13680unboximpl())));
                    }
                    path.moveTo(fFloatValue, fFloatValue2);
                    int i11 = 0;
                    for (Object obj : list8) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        dDoubleValue += ((Number) obj).doubleValue();
                        fFloatValue += ((Number) arrayList.get(i11)).floatValue() * ((float) Math.cos(Math.toRadians(dDoubleValue)));
                        fFloatValue2 += ((Number) arrayList.get(i11)).floatValue() * ((float) Math.sin(Math.toRadians(dDoubleValue)));
                        path.lineTo(fFloatValue, fFloatValue2);
                        i11 = i12;
                    }
                    path.close();
                    long j3 = j2;
                    float f9 = f8;
                    Canvas canvas = Canvas.getDrawContext().getCanvas();
                    Paint paint = new Paint();
                    paint.setColor(ColorKt.m11394toArgb8_81llA(j3));
                    paint.setMaskFilter(new BlurMaskFilter(f9, BlurMaskFilter.Blur.OUTER));
                    AndroidCanvas_androidKt.getNativeCanvas(canvas).drawPath(path, paint);
                }
            }, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f4 = fM14409dpToPx8Feqmps;
            modifier2 = modifier4;
            list3 = listListOf;
            f5 = fM14409dpToPx8Feqmps2;
            list4 = listListOf2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            jColorResource = j;
            f4 = fM14409dpToPx8Feqmps;
            list3 = list;
            f5 = fM14409dpToPx8Feqmps2;
            list4 = list2;
        }
        final double d4 = d2;
        final float f9 = f5;
        final float f10 = fM14409dpToPx8Feqmps3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier2;
            final long j3 = jColorResource;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.CustomShadowShapeKt$CustomShadowShape$2
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
                    CustomShadowShapeKt.m15088CustomShadowShapeY2L_72g(modifier5, j3, f4, f9, f10, list3, list4, d4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void CustomShape3Preview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2043391135);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2043391135, i, -1, "com.blackhub.bronline.game.ui.widget.other.CustomShape3Preview (CustomShadowShape.kt:78)");
            }
            m15088CustomShadowShapeY2L_72g(SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._184wdp, composerStartRestartGroup, 6)), 0L, 0.0f, 0.0f, 0.0f, null, null, 0.0d, composerStartRestartGroup, 0, 254);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.CustomShadowShapeKt.CustomShape3Preview.1
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
                    CustomShadowShapeKt.CustomShape3Preview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
