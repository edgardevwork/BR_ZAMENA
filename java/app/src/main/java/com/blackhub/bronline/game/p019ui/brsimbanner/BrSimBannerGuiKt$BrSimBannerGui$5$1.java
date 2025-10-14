package com.blackhub.bronline.game.p019ui.brsimbanner;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
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

/* compiled from: BrSimBannerGui.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerGui$5$1", m7120f = "BrSimBannerGui.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})

public final class BrSimBannerGuiKt$BrSimBannerGui$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ PagerState $pagerState;
    public final /* synthetic */ MutableState<Boolean> $tickTurnOn$delegate;
    public final /* synthetic */ MutableIntState $ticksForPager$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrSimBannerGuiKt$BrSimBannerGui$5$1(PagerState pagerState, MutableIntState mutableIntState, MutableState<Boolean> mutableState, Continuation<? super BrSimBannerGuiKt$BrSimBannerGui$5$1> continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
        this.$ticksForPager$delegate = mutableIntState;
        this.$tickTurnOn$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BrSimBannerGuiKt$BrSimBannerGui$5$1(this.$pagerState, this.$ticksForPager$delegate, this.$tickTurnOn$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BrSimBannerGuiKt$BrSimBannerGui$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$pagerState.isScrollInProgress()) {
            BrSimBannerGuiKt.BrSimBannerGui$lambda$5(this.$ticksForPager$delegate, 0);
            BrSimBannerGuiKt.BrSimBannerGui$lambda$8(this.$tickTurnOn$delegate, false);
        } else {
            BrSimBannerGuiKt.BrSimBannerGui$lambda$8(this.$tickTurnOn$delegate, true);
        }
        return Unit.INSTANCE;
    }
}

