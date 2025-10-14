package com.blackhub.bronline.game.p019ui.upgradeobjectevent;

import androidx.compose.foundation.lazy.LazyListState;
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

/* compiled from: UpgradeObjectEventLevelPrizesUi.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesUiKt$EventLevelPrizesContent$1$1", m7120f = "UpgradeObjectEventLevelPrizesUi.kt", m7121i = {}, m7122l = {79}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes8.dex */
public final class UpgradeObjectEventLevelPrizesUiKt$EventLevelPrizesContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $currentLevel;
    public final /* synthetic */ LazyListState $scrollState;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeObjectEventLevelPrizesUiKt$EventLevelPrizesContent$1$1(int i, LazyListState lazyListState, Continuation<? super UpgradeObjectEventLevelPrizesUiKt$EventLevelPrizesContent$1$1> continuation) {
        super(2, continuation);
        this.$currentLevel = i;
        this.$scrollState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UpgradeObjectEventLevelPrizesUiKt$EventLevelPrizesContent$1$1(this.$currentLevel, this.$scrollState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UpgradeObjectEventLevelPrizesUiKt$EventLevelPrizesContent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int i2 = this.$currentLevel;
            int i3 = i2 + (-1) < 0 ? 0 : i2 - 1;
            LazyListState lazyListState = this.$scrollState;
            this.label = 1;
            if (LazyListState.animateScrollToItem$default(lazyListState, i3, 0, this, 2, null) == coroutine_suspended) {
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

