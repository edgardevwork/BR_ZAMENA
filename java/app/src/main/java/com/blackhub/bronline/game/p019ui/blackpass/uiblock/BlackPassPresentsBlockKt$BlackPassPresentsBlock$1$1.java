package com.blackhub.bronline.game.p019ui.blackpass.uiblock;

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

/* compiled from: BlackPassPresentsBlock.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassPresentsBlockKt$BlackPassPresentsBlock$1$1", m7120f = "BlackPassPresentsBlock.kt", m7121i = {}, m7122l = {59}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes2.dex */
public final class BlackPassPresentsBlockKt$BlackPassPresentsBlock$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ LazyListState $rewardsListState;
    public final /* synthetic */ State<Integer> $scrollLevel$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackPassPresentsBlockKt$BlackPassPresentsBlock$1$1(LazyListState lazyListState, State<Integer> state, Continuation<? super BlackPassPresentsBlockKt$BlackPassPresentsBlock$1$1> continuation) {
        super(2, continuation);
        this.$rewardsListState = lazyListState;
        this.$scrollLevel$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BlackPassPresentsBlockKt$BlackPassPresentsBlock$1$1(this.$rewardsListState, this.$scrollLevel$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BlackPassPresentsBlockKt$BlackPassPresentsBlock$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (BlackPassPresentsBlockKt.BlackPassPresentsBlock$lambda$1(this.$scrollLevel$delegate) >= 0) {
                LazyListState lazyListState = this.$rewardsListState;
                int iBlackPassPresentsBlock$lambda$1 = BlackPassPresentsBlockKt.BlackPassPresentsBlock$lambda$1(this.$scrollLevel$delegate);
                this.label = 1;
                if (LazyListState.animateScrollToItem$default(lazyListState, iBlackPassPresentsBlock$lambda$1, 0, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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

