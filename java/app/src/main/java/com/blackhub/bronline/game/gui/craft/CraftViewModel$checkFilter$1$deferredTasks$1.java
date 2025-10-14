package com.blackhub.bronline.game.gui.craft;

import com.blackhub.bronline.game.gui.craft.model.response.CraftItemCategoryFilter;
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

/* compiled from: CraftViewModel.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$checkFilter$1$deferredTasks$1", m7120f = "CraftViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes.dex */
public final class CraftViewModel$checkFilter$1$deferredTasks$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ CraftItemCategoryFilter $filterCheckBox;
    public final /* synthetic */ int $newParameter;
    public int label;
    public final /* synthetic */ CraftViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CraftViewModel$checkFilter$1$deferredTasks$1(CraftViewModel craftViewModel, CraftItemCategoryFilter craftItemCategoryFilter, int i, Continuation<? super CraftViewModel$checkFilter$1$deferredTasks$1> continuation) {
        super(2, continuation);
        this.this$0 = craftViewModel;
        this.$filterCheckBox = craftItemCategoryFilter;
        this.$newParameter = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CraftViewModel$checkFilter$1$deferredTasks$1(this.this$0, this.$filterCheckBox, this.$newParameter, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CraftViewModel$checkFilter$1$deferredTasks$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.preferencesRepository.putInteger(this.$filterCheckBox.getPreferenceKey(), this.$newParameter);
        return Unit.INSTANCE;
    }
}

