package com.blackhub.bronline.game.p019ui.fishing;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FishingFloatUI.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.fishing.FishingFloatUIKt$FishingFloatUI$2$1", m7120f = "FishingFloatUI.kt", m7121i = {}, m7122l = {69}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes7.dex */
public final class FishingFloatUIKt$FishingFloatUI$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $animState;
    public final /* synthetic */ Function0<Unit> $isStartFishing;
    public final /* synthetic */ long $timerForStartFishing;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FishingFloatUIKt$FishingFloatUI$2$1(long j, Function0<Unit> function0, MutableState<Boolean> mutableState, Continuation<? super FishingFloatUIKt$FishingFloatUI$2$1> continuation) {
        super(2, continuation);
        this.$timerForStartFishing = j;
        this.$isStartFishing = function0;
        this.$animState = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FishingFloatUIKt$FishingFloatUI$2$1(this.$timerForStartFishing, this.$isStartFishing, this.$animState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FishingFloatUIKt$FishingFloatUI$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.$timerForStartFishing;
            this.label = 1;
            if (DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$isStartFishing.invoke();
        this.$animState.setValue(Boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }
}

