package com.blackhub.bronline.game.p019ui.cases.uiblock;

import androidx.compose.foundation.lazy.LazyListState;
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
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardBlockKt$CasesBottomRewardBlock$1$1", m7120f = "CasesBottomRewardBlock.kt", m7121i = {}, m7122l = {111}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes7.dex */
public final class CasesBottomRewardBlockKt$CasesBottomRewardBlock$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ State<Integer> $centerOffsetForScroll$delegate;
    public final /* synthetic */ int $goToSelectItem;
    public final /* synthetic */ LazyListState $lazyRowScrollState;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CasesBottomRewardBlockKt$CasesBottomRewardBlock$1$1(LazyListState lazyListState, int i, State<Integer> state, Continuation<? super CasesBottomRewardBlockKt$CasesBottomRewardBlock$1$1> continuation) {
        super(2, continuation);
        this.$lazyRowScrollState = lazyListState;
        this.$goToSelectItem = i;
        this.$centerOffsetForScroll$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CasesBottomRewardBlockKt$CasesBottomRewardBlock$1$1(this.$lazyRowScrollState, this.$goToSelectItem, this.$centerOffsetForScroll$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CasesBottomRewardBlockKt$CasesBottomRewardBlock$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LazyListState lazyListState = this.$lazyRowScrollState;
            int i2 = this.$goToSelectItem;
            int i3 = -CasesBottomRewardBlockKt.CasesBottomRewardBlock$lambda$1(this.$centerOffsetForScroll$delegate);
            this.label = 1;
            if (lazyListState.animateScrollToItem(i2, i3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
