package com.blackhub.bronline.game.p019ui.cases.uiblock;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesBottomRewardBlock.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardBlockKt$CasesBottomRewardBlock$2$1", m7120f = "CasesBottomRewardBlock.kt", m7121i = {}, m7122l = {123}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes7.dex */
public final class CasesBottomRewardBlockKt$CasesBottomRewardBlock$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ State<Integer> $centerOffsetForScroll$delegate;
    public final /* synthetic */ MutableState<Boolean> $itemInCenterPosition$delegate;
    public final /* synthetic */ LazyListState $lazyRowScrollState;
    public final /* synthetic */ MutableIntState $selectedBottomItemIndex;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CasesBottomRewardBlockKt$CasesBottomRewardBlock$2$1(LazyListState lazyListState, MutableIntState mutableIntState, MutableState<Boolean> mutableState, State<Integer> state, Continuation<? super CasesBottomRewardBlockKt$CasesBottomRewardBlock$2$1> continuation) {
        super(2, continuation);
        this.$lazyRowScrollState = lazyListState;
        this.$selectedBottomItemIndex = mutableIntState;
        this.$itemInCenterPosition$delegate = mutableState;
        this.$centerOffsetForScroll$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CasesBottomRewardBlockKt$CasesBottomRewardBlock$2$1(this.$lazyRowScrollState, this.$selectedBottomItemIndex, this.$itemInCenterPosition$delegate, this.$centerOffsetForScroll$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CasesBottomRewardBlockKt$CasesBottomRewardBlock$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$lazyRowScrollState.isScrollInProgress() && CasesBottomRewardBlockKt.CasesBottomRewardBlock$lambda$3(this.$itemInCenterPosition$delegate)) {
                CasesBottomRewardBlockKt.CasesBottomRewardBlock$lambda$4(this.$itemInCenterPosition$delegate, false);
            } else if (!this.$lazyRowScrollState.isScrollInProgress() && !CasesBottomRewardBlockKt.CasesBottomRewardBlock$lambda$3(this.$itemInCenterPosition$delegate)) {
                LazyListState lazyListState = this.$lazyRowScrollState;
                int intValue = this.$selectedBottomItemIndex.getIntValue();
                int i2 = -CasesBottomRewardBlockKt.CasesBottomRewardBlock$lambda$1(this.$centerOffsetForScroll$delegate);
                this.label = 1;
                if (lazyListState.animateScrollToItem(intValue, i2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CasesBottomRewardBlockKt.CasesBottomRewardBlock$lambda$4(this.$itemInCenterPosition$delegate, true);
        return Unit.INSTANCE;
    }
}
