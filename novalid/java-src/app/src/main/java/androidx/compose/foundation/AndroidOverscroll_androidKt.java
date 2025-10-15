package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutModifierKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidOverscroll.android.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m7105d2 = {"StretchOverscrollNonClippingLayer", "Landroidx/compose/ui/Modifier;", "rememberOverscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidOverscroll_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,595:1\n74#2:596\n74#2:597\n50#3:598\n49#3:599\n1116#4,6:600\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidOverscroll_androidKt\n*L\n66#1:596\n67#1:597\n69#1:598\n69#1:599\n69#1:600,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidOverscroll_androidKt {

    @NotNull
    private static final Modifier StretchOverscrollNonClippingLayer;

    @Composable
    @NotNull
    public static final OverscrollEffect rememberOverscrollEffect(@Nullable Composer composer, int i) {
        OverscrollEffect overscrollEffect;
        composer.startReplaceableGroup(-1476348564);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1476348564, i, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.android.kt:64)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) composer.consume(OverscrollConfiguration_androidKt.getLocalOverscrollConfiguration());
        if (overscrollConfiguration != null) {
            composer.startReplaceableGroup(511388516);
            boolean zChanged = composer.changed(context) | composer.changed(overscrollConfiguration);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AndroidEdgeEffectOverscrollEffect(context, overscrollConfiguration);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            overscrollEffect = (OverscrollEffect) objRememberedValue;
        } else {
            overscrollEffect = NoOpOverscrollEffect.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return overscrollEffect;
    }

    static {
        Modifier modifierLayout;
        if (Build.VERSION.SDK_INT >= 31) {
            modifierLayout = LayoutModifierKt.layout(LayoutModifierKt.layout(Modifier.INSTANCE, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                    return m7768invoke3p2s80s(measureScope, measurable, constraints.getValue());
                }

                @NotNull
                /* renamed from: invoke-3p2s80s, reason: not valid java name */
                public final MeasureResult m7768invoke3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
                    final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(j);
                    final int iMo7868roundToPx0680j_4 = measureScope.mo7868roundToPx0680j_4(C2046Dp.m13666constructorimpl(ClipScrollableContainerKt.getMaxSupportedElevation() * 2));
                    return MeasureScope.layout$default(measureScope, RangesKt___RangesKt.coerceAtLeast(placeableMo12610measureBRTryo0.getMeasuredWidth() - iMo7868roundToPx0680j_4, 0), RangesKt___RangesKt.coerceAtLeast(placeableMo12610measureBRTryo0.getMeasuredHeight() - iMo7868roundToPx0680j_4, 0), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                            Placeable placeable = placeableMo12610measureBRTryo0;
                            Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, ((-iMo7868roundToPx0680j_4) / 2) - ((placeable.getWidth() - placeableMo12610measureBRTryo0.getMeasuredWidth()) / 2), ((-iMo7868roundToPx0680j_4) / 2) - ((placeableMo12610measureBRTryo0.getHeight() - placeableMo12610measureBRTryo0.getMeasuredHeight()) / 2), 0.0f, null, 12, null);
                        }
                    }, 4, null);
                }
            }), new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                    return m7769invoke3p2s80s(measureScope, measurable, constraints.getValue());
                }

                @NotNull
                /* renamed from: invoke-3p2s80s, reason: not valid java name */
                public final MeasureResult m7769invoke3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
                    final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(j);
                    final int iMo7868roundToPx0680j_4 = measureScope.mo7868roundToPx0680j_4(C2046Dp.m13666constructorimpl(ClipScrollableContainerKt.getMaxSupportedElevation() * 2));
                    return MeasureScope.layout$default(measureScope, placeableMo12610measureBRTryo0.getWidth() + iMo7868roundToPx0680j_4, placeableMo12610measureBRTryo0.getHeight() + iMo7868roundToPx0680j_4, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                            Placeable placeable = placeableMo12610measureBRTryo0;
                            int i = iMo7868roundToPx0680j_4;
                            Placeable.PlacementScope.place$default(placementScope, placeable, i / 2, i / 2, 0.0f, 4, null);
                        }
                    }, 4, null);
                }
            });
        } else {
            modifierLayout = Modifier.INSTANCE;
        }
        StretchOverscrollNonClippingLayer = modifierLayout;
    }
}
