package com.blackhub.bronline.game.p019ui.widget.block.item;

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

/* compiled from: CommonTaskCategoryItem.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.block.item.CommonTaskCategoryItemKt$CommonTaskCategoryItem$3$1", m7120f = "CommonTaskCategoryItem.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes8.dex */
public final class CommonTaskCategoryItemKt$CommonTaskCategoryItem$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $isInitInterface$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonTaskCategoryItemKt$CommonTaskCategoryItem$3$1(MutableState<Boolean> mutableState, Continuation<? super CommonTaskCategoryItemKt$CommonTaskCategoryItem$3$1> continuation) {
        super(2, continuation);
        this.$isInitInterface$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CommonTaskCategoryItemKt$CommonTaskCategoryItem$3$1(this.$isInitInterface$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CommonTaskCategoryItemKt$CommonTaskCategoryItem$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CommonTaskCategoryItemKt.CommonTaskCategoryItem$lambda$8(this.$isInitInterface$delegate, true);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

