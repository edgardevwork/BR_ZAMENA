package com.blackhub.bronline.game.p019ui.widget.scroll;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import com.blackhub.bronline.game.core.extension.FloatExtensionKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Scroll.kt */
@Stable
@SourceDebugExtension({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\ncom/blackhub/bronline/game/ui/widget/scroll/CarouselScrollState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,450:1\n81#2:451\n107#2,2:452\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\ncom/blackhub/bronline/game/ui/widget/scroll/CarouselScrollState\n*L\n97#1:451\n97#1:452,2\n*E\n"})
/* loaded from: classes4.dex */
public final class CarouselScrollState implements ScrollableState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Saver<CarouselScrollState, ?> Saver = SaverKt.Saver(new Function2<SaverScope, CarouselScrollState, Integer>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselScrollState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Integer invoke(@NotNull SaverScope Saver2, @NotNull CarouselScrollState it) {
            Intrinsics.checkNotNullParameter(Saver2, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.getValue());
        }
    }, new Function1<Integer, CarouselScrollState>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselScrollState$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CarouselScrollState invoke(Integer num) {
            return invoke(num.intValue());
        }

        @Nullable
        public final CarouselScrollState invoke(int i) {
            return new CarouselScrollState(i);
        }
    });
    public float accumulator;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    @NotNull
    public final MutableState value;

    @NotNull
    public final MutableInteractionSource internalInteractionSource = InteractionSourceKt.MutableInteractionSource();

    @NotNull
    public MutableState<Integer> _maxValueState = SnapshotStateKt.mutableStateOf(Integer.MAX_VALUE, SnapshotStateKt.structuralEqualityPolicy());

    @NotNull
    public MutableState<Integer> _length = SnapshotStateKt.mutableStateOf(Integer.MAX_VALUE, SnapshotStateKt.structuralEqualityPolicy());

    @NotNull
    public final ScrollableState scrollableState = ScrollableStateKt.ScrollableState(new Function1<Float, Float>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselScrollState$scrollableState$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f) {
            return invoke(f.floatValue());
        }

        @NotNull
        public final Float invoke(float f) {
            float value = this.this$0.getValue() + f + this.this$0.accumulator;
            float fCoerceIn = RangesKt___RangesKt.coerceIn(value, 0.0f, this.this$0.getMaxValue());
            boolean z = !(value == fCoerceIn);
            float value2 = fCoerceIn - this.this$0.getValue();
            int iRoundToIntSafely = FloatExtensionKt.roundToIntSafely(value2);
            CarouselScrollState carouselScrollState = this.this$0;
            carouselScrollState.setValue(carouselScrollState.getValue() + iRoundToIntSafely);
            this.this$0.accumulator = value2 - iRoundToIntSafely;
            if (z) {
                f = value2;
            }
            return Float.valueOf(f);
        }
    });

    public CarouselScrollState(int i) {
        this.value = SnapshotStateKt.mutableStateOf(Integer.valueOf(i), SnapshotStateKt.structuralEqualityPolicy());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getValue() {
        return ((Number) this.value.getValue()).intValue();
    }

    public final void setValue(int i) {
        this.value.setValue(Integer.valueOf(i));
    }

    public final int getMaxValue() {
        return this._maxValueState.getValue().intValue();
    }

    public final void setMaxValue$app_siteRelease(int i) {
        this._maxValueState.setValue(Integer.valueOf(i));
        if (getValue() > i) {
            setValue(i);
        }
    }

    public final int getScrollableLength() {
        return this._length.getValue().intValue();
    }

    public final void setScrollableLength$app_siteRelease(int i) {
        this._length.setValue(Integer.valueOf(i));
    }

    @NotNull
    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    @NotNull
    /* renamed from: getInternalInteractionSource$app_siteRelease, reason: from getter */
    public final MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public Object scroll(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objScroll = this.scrollableState.scroll(mutatePriority, function2, continuation);
        return objScroll == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.scrollableState.dispatchRawDelta(delta);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollTo$default(CarouselScrollState carouselScrollState, int i, AnimationSpec animationSpec, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 0.0f, null, 7, null);
        }
        return carouselScrollState.animateScrollTo(i, animationSpec, continuation);
    }

    @Nullable
    public final Object animateScrollTo(int i, @NotNull AnimationSpec<Float> animationSpec, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimateScrollBy = ScrollExtensionsKt.animateScrollBy(this, i - getValue(), animationSpec, continuation);
        return objAnimateScrollBy == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateScrollBy : Unit.INSTANCE;
    }

    @Nullable
    public final Object scrollTo(int i, @NotNull Continuation<? super Float> continuation) {
        return ScrollExtensionsKt.scrollBy(this, i - getValue(), continuation);
    }

    /* compiled from: Scroll.kt */
    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"Lcom/blackhub/bronline/game/ui/widget/scroll/CarouselScrollState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/blackhub/bronline/game/ui/widget/scroll/CarouselScrollState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final Saver<CarouselScrollState, ?> getSaver() {
            return CarouselScrollState.Saver;
        }
    }
}

