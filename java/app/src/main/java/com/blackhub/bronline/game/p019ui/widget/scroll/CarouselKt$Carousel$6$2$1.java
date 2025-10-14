package com.blackhub.bronline.game.p019ui.widget.scroll;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Carousel.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.scroll.CarouselKt$Carousel$6$2$1", m7120f = "Carousel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes8.dex */
public final class CarouselKt$Carousel$6$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableIntState $allItemsCount;
    public final /* synthetic */ MutableIntState $allScrollSize;
    public final /* synthetic */ int $firstVisibleItemHeight;
    public final /* synthetic */ MutableState<Boolean> $ifWithPathRow;
    public final /* synthetic */ MutableIntState $itemLengthInPx;
    public final /* synthetic */ MutableIntState $maxScroll;
    public final /* synthetic */ MutableIntState $rows;
    public final /* synthetic */ LazyGridState $state;
    public final /* synthetic */ int $valueOfColumns;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselKt$Carousel$6$2$1(MutableIntState mutableIntState, int i, MutableIntState mutableIntState2, LazyGridState lazyGridState, MutableState<Boolean> mutableState, int i2, MutableIntState mutableIntState3, MutableIntState mutableIntState4, MutableIntState mutableIntState5, Continuation<? super CarouselKt$Carousel$6$2$1> continuation) {
        super(2, continuation);
        this.$itemLengthInPx = mutableIntState;
        this.$firstVisibleItemHeight = i;
        this.$allItemsCount = mutableIntState2;
        this.$state = lazyGridState;
        this.$ifWithPathRow = mutableState;
        this.$valueOfColumns = i2;
        this.$rows = mutableIntState3;
        this.$allScrollSize = mutableIntState4;
        this.$maxScroll = mutableIntState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CarouselKt$Carousel$6$2$1(this.$itemLengthInPx, this.$firstVisibleItemHeight, this.$allItemsCount, this.$state, this.$ifWithPathRow, this.$valueOfColumns, this.$rows, this.$allScrollSize, this.$maxScroll, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CarouselKt$Carousel$6$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$itemLengthInPx.setIntValue(this.$firstVisibleItemHeight);
        this.$allItemsCount.setIntValue(this.$state.getLayoutInfo().getTotalItemsCount());
        this.$ifWithPathRow.setValue(Boxing.boxBoolean(this.$allItemsCount.getIntValue() % this.$valueOfColumns != 0));
        this.$rows.setIntValue((this.$allItemsCount.getIntValue() / this.$valueOfColumns) + (this.$ifWithPathRow.getValue().booleanValue() ? 1 : 0));
        this.$allScrollSize.setIntValue(this.$itemLengthInPx.getIntValue() * this.$rows.getIntValue());
        this.$maxScroll.setIntValue(this.$allScrollSize.getIntValue() - this.$state.getLayoutInfo().getViewportEndOffset());
        return Unit.INSTANCE;
    }
}

