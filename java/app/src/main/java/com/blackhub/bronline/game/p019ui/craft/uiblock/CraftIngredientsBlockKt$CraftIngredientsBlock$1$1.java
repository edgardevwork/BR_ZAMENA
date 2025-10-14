package com.blackhub.bronline.game.p019ui.craft.uiblock;

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
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftIngredientsBlock.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.craft.uiblock.CraftIngredientsBlockKt$CraftIngredientsBlock$1$1", m7120f = "CraftIngredientsBlock.kt", m7121i = {}, m7122l = {91}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes7.dex */
public final class CraftIngredientsBlockKt$CraftIngredientsBlock$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $isNeedShowTooltip$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CraftIngredientsBlockKt$CraftIngredientsBlock$1$1(MutableState<Boolean> mutableState, Continuation<? super CraftIngredientsBlockKt$CraftIngredientsBlock$1$1> continuation) {
        super(2, continuation);
        this.$isNeedShowTooltip$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CraftIngredientsBlockKt$CraftIngredientsBlock$1$1(this.$isNeedShowTooltip$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CraftIngredientsBlockKt$CraftIngredientsBlock$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        CraftIngredientsBlockKt.CraftIngredientsBlock$lambda$8(this.$isNeedShowTooltip$delegate, false);
        return Unit.INSTANCE;
    }
}

