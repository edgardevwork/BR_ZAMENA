package com.blackhub.bronline.game.p019ui.minigameshelper;

import androidx.compose.runtime.MutableIntState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MiniGamesHelperUntieUi.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperUntieUiKt$MiniGamesHelperUntieUI$1$1", m7120f = "MiniGamesHelperUntieUi.kt", m7121i = {}, m7122l = {57}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes7.dex */
public final class MiniGamesHelperUntieUiKt$MiniGamesHelperUntieUI$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableIntState $currentStatus$delegate;
    public final /* synthetic */ int $maxValue;
    public final /* synthetic */ Function0<Unit> $onEndOfTime;
    public final /* synthetic */ int $tick;
    public final /* synthetic */ long $timer;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniGamesHelperUntieUiKt$MiniGamesHelperUntieUI$1$1(int i, int i2, long j, Function0<Unit> function0, MutableIntState mutableIntState, Continuation<? super MiniGamesHelperUntieUiKt$MiniGamesHelperUntieUI$1$1> continuation) {
        super(2, continuation);
        this.$maxValue = i;
        this.$tick = i2;
        this.$timer = j;
        this.$onEndOfTime = function0;
        this.$currentStatus$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MiniGamesHelperUntieUiKt$MiniGamesHelperUntieUI$1$1(this.$maxValue, this.$tick, this.$timer, this.$onEndOfTime, this.$currentStatus$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MiniGamesHelperUntieUiKt$MiniGamesHelperUntieUI$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0038 -> B:14:0x003b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$currentStatus$delegate.getIntValue() < this.$maxValue) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.$currentStatus$delegate.getIntValue() >= this.$maxValue) {
                this.$onEndOfTime.invoke();
            }
            if (this.$currentStatus$delegate.getIntValue() < this.$maxValue) {
                MutableIntState mutableIntState = this.$currentStatus$delegate;
                mutableIntState.setIntValue(mutableIntState.getIntValue() + this.$tick);
                long j = this.$timer;
                this.label = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (this.$currentStatus$delegate.getIntValue() >= this.$maxValue) {
                }
                if (this.$currentStatus$delegate.getIntValue() < this.$maxValue) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}

