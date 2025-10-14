package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.MultiContentMeasurePolicy;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SegmentedButton.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J2\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, m7105d2 = {"Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", PomReader.SCOPE, "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "animatable", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "getAnimatable", "()Landroidx/compose/animation/core/Animatable;", "setAnimatable", "(Landroidx/compose/animation/core/Animatable;)V", "initialOffset", "Ljava/lang/Integer;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,786:1\n151#2,3:787\n33#2,4:790\n154#2,2:794\n38#2:796\n156#2:797\n171#2,13:798\n151#2,3:811\n33#2,4:814\n154#2,2:818\n38#2:820\n156#2:821\n171#2,13:822\n171#2,13:835\n1#3:848\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonContentMeasurePolicy\n*L\n354#1:787,3\n354#1:790,4\n354#1:794,2\n354#1:796\n354#1:797\n355#1:798,13\n356#1:811,3\n356#1:814,4\n356#1:818,2\n356#1:820\n356#1:821\n357#1:822,13\n358#1:835,13\n*E\n"})
/* loaded from: classes4.dex */
public final class SegmentedButtonContentMeasurePolicy implements MultiContentMeasurePolicy {
    public static final int $stable = 0;

    @Nullable
    private Animatable<Integer, AnimationVector1D> animatable;

    @Nullable
    private Integer initialOffset;

    @NotNull
    private final CoroutineScope scope;

    public SegmentedButtonContentMeasurePolicy(@NotNull CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }

    @NotNull
    public final CoroutineScope getScope() {
        return this.scope;
    }

    @Nullable
    public final Animatable<Integer, AnimationVector1D> getAnimatable() {
        return this.animatable;
    }

    public final void setAnimatable(@Nullable Animatable<Integer, AnimationVector1D> animatable) {
        this.animatable = animatable;
    }

    @Override // androidx.compose.p003ui.layout.MultiContentMeasurePolicy
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo9545measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull List<? extends List<? extends Measurable>> list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        List<? extends Measurable> list2 = list.get(0);
        int i = 1;
        List<? extends Measurable> list3 = list.get(1);
        final ArrayList arrayList = new ArrayList(list2.size());
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(list2.get(i2).mo12610measureBRTryo0(j));
        }
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int width = ((Placeable) obj).getWidth();
            int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
            if (1 <= lastIndex) {
                int i3 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i3);
                    int width2 = ((Placeable) obj4).getWidth();
                    if (width < width2) {
                        obj = obj4;
                        width = width2;
                    }
                    if (i3 == lastIndex) {
                        break;
                    }
                    i3++;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        int width3 = placeable != null ? placeable.getWidth() : 0;
        final ArrayList arrayList2 = new ArrayList(list3.size());
        int size2 = list3.size();
        for (int i4 = 0; i4 < size2; i4++) {
            arrayList2.add(list3.get(i4).mo12610measureBRTryo0(j));
        }
        if (arrayList2.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList2.get(0);
            int width4 = ((Placeable) obj2).getWidth();
            int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
            if (1 <= lastIndex2) {
                int i5 = 1;
                while (true) {
                    Object obj5 = arrayList2.get(i5);
                    int width5 = ((Placeable) obj5).getWidth();
                    if (width4 < width5) {
                        obj2 = obj5;
                        width4 = width5;
                    }
                    if (i5 == lastIndex2) {
                        break;
                    }
                    i5++;
                }
            }
        }
        Placeable placeable2 = (Placeable) obj2;
        Integer numValueOf = placeable2 != null ? Integer.valueOf(placeable2.getWidth()) : null;
        if (arrayList2.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList2.get(0);
            int height = ((Placeable) obj3).getHeight();
            int lastIndex3 = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
            if (1 <= lastIndex3) {
                while (true) {
                    Object obj6 = arrayList2.get(i);
                    int height2 = ((Placeable) obj6).getHeight();
                    if (height < height2) {
                        obj3 = obj6;
                        height = height2;
                    }
                    if (i == lastIndex3) {
                        break;
                    }
                    i++;
                }
            }
        }
        Placeable placeable3 = (Placeable) obj3;
        int height3 = placeable3 != null ? placeable3.getHeight() : 0;
        SegmentedButtonDefaults segmentedButtonDefaults = SegmentedButtonDefaults.INSTANCE;
        int iMax = Math.max(measureScope.mo7868roundToPx0680j_4(segmentedButtonDefaults.m9723getIconSizeD9Ej5fM()), width3) + measureScope.mo7868roundToPx0680j_4(SegmentedButtonKt.IconSpacing) + (numValueOf != null ? numValueOf.intValue() : 0);
        final int i6 = width3 == 0 ? (-(measureScope.mo7868roundToPx0680j_4(segmentedButtonDefaults.m9723getIconSizeD9Ej5fM()) + measureScope.mo7868roundToPx0680j_4(SegmentedButtonKt.IconSpacing))) / 2 : 0;
        if (this.initialOffset == null) {
            this.initialOffset = Integer.valueOf(i6);
        } else {
            Animatable<Integer, AnimationVector1D> animatable = this.animatable;
            if (animatable == null) {
                Integer num = this.initialOffset;
                Intrinsics.checkNotNull(num);
                animatable = new Animatable<>(num, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), null, null, 12, null);
                this.animatable = animatable;
            }
            if (animatable.getTargetValue().intValue() != i6) {
                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SegmentedButtonContentMeasurePolicy$measure$1(animatable, i6, null), 3, null);
            }
        }
        final int i7 = height3;
        return MeasureScope.layout$default(measureScope, iMax, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SegmentedButtonContentMeasurePolicy$measure$2
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
                List<Placeable> list4 = arrayList;
                int i8 = i7;
                int size3 = list4.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    Placeable placeable4 = list4.get(i9);
                    Placeable.PlacementScope.place$default(placementScope, placeable4, 0, (i8 - placeable4.getHeight()) / 2, 0.0f, 4, null);
                }
                int iMo7868roundToPx0680j_4 = measureScope.mo7868roundToPx0680j_4(SegmentedButtonDefaults.INSTANCE.m9723getIconSizeD9Ej5fM()) + measureScope.mo7868roundToPx0680j_4(SegmentedButtonKt.IconSpacing);
                Animatable<Integer, AnimationVector1D> animatable2 = this.getAnimatable();
                int iIntValue = iMo7868roundToPx0680j_4 + (animatable2 != null ? animatable2.getValue().intValue() : i6);
                List<Placeable> list5 = arrayList2;
                int i10 = i7;
                int size4 = list5.size();
                for (int i11 = 0; i11 < size4; i11++) {
                    Placeable placeable5 = list5.get(i11);
                    Placeable.PlacementScope.place$default(placementScope, placeable5, iIntValue, (i10 - placeable5.getHeight()) / 2, 0.0f, 4, null);
                }
            }
        }, 4, null);
    }
}
