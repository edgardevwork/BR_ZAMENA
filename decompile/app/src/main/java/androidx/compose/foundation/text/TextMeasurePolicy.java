package androidx.compose.foundation.text;

import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: BasicText.kt */
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00040\u0003¢\u0006\u0002\u0010\u0006J,\u0010\u0007\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\f\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, m7105d2 = {"Landroidx/compose/foundation/text/TextMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "placements", "Lkotlin/Function0;", "", "Landroidx/compose/ui/geometry/Rect;", "(Lkotlin/jvm/functions/Function0;)V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,447:1\n298#2,3:448\n69#2,4:451\n301#2:455\n302#2:457\n74#2:458\n303#2:459\n1#3:456\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy\n*L\n373#1:448,3\n373#1:451,4\n373#1:455\n373#1:457\n373#1:458\n373#1:459\n373#1:456\n*E\n"})
/* loaded from: classes2.dex */
public final class TextMeasurePolicy implements MeasurePolicy {

    @NotNull
    public final Function0<List<Rect>> placements;

    /* JADX WARN: Multi-variable type inference failed */
    public TextMeasurePolicy(@NotNull Function0<? extends List<Rect>> function0) {
        this.placements = function0;
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo7599measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
        List<Rect> listInvoke = this.placements.invoke();
        final ArrayList arrayList = null;
        if (listInvoke != null) {
            ArrayList arrayList2 = new ArrayList(listInvoke.size());
            int size = listInvoke.size();
            for (int i = 0; i < size; i++) {
                Rect rect = listInvoke.get(i);
                Pair pair = rect != null ? new Pair(list.get(i).mo12610measureBRTryo0(ConstraintsKt.Constraints$default(0, (int) Math.floor(rect.getWidth()), 0, (int) Math.floor(rect.getHeight()), 5, null)), IntOffset.m13785boximpl(IntOffsetKt.IntOffset(MathKt__MathJVMKt.roundToInt(rect.getLeft()), MathKt__MathJVMKt.roundToInt(rect.getTop())))) : null;
                if (pair != null) {
                    arrayList2.add(pair);
                }
            }
            arrayList = arrayList2;
        }
        return MeasureScope.layout$default(measureScope, Constraints.m13622getMaxWidthimpl(j), Constraints.m13621getMaxHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.TextMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                List<Pair<Placeable, IntOffset>> list2 = arrayList;
                if (list2 != null) {
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Pair<Placeable, IntOffset> pair2 = list2.get(i2);
                        Placeable.PlacementScope.m12661place70tqf50$default(placementScope, pair2.component1(), pair2.component2().getPackedValue(), 0.0f, 2, null);
                    }
                }
            }
        }, 4, null);
    }
}
