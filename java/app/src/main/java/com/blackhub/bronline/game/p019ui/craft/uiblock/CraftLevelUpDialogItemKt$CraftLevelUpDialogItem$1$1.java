package com.blackhub.bronline.game.p019ui.craft.uiblock;

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

/* compiled from: CraftLevelUpDialogItem.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.craft.uiblock.CraftLevelUpDialogItemKt$CraftLevelUpDialogItem$1$1", m7120f = "CraftLevelUpDialogItem.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes7.dex */
public final class CraftLevelUpDialogItemKt$CraftLevelUpDialogItem$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ State<Boolean> $isMoving$delegate;
    public final /* synthetic */ MutableState<Boolean> $isRotated$delegate;
    public final /* synthetic */ MutableState<Boolean> $rotate$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CraftLevelUpDialogItemKt$CraftLevelUpDialogItem$1$1(MutableState<Boolean> mutableState, State<Boolean> state, MutableState<Boolean> mutableState2, Continuation<? super CraftLevelUpDialogItemKt$CraftLevelUpDialogItem$1$1> continuation) {
        super(2, continuation);
        this.$rotate$delegate = mutableState;
        this.$isMoving$delegate = state;
        this.$isRotated$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CraftLevelUpDialogItemKt$CraftLevelUpDialogItem$1$1(this.$rotate$delegate, this.$isMoving$delegate, this.$isRotated$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CraftLevelUpDialogItemKt$CraftLevelUpDialogItem$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CraftLevelUpDialogItemKt.CraftLevelUpDialogItem$lambda$5(this.$rotate$delegate, false);
            if (CraftLevelUpDialogItemKt.CraftLevelUpDialogItem$lambda$10(this.$isMoving$delegate)) {
                CraftLevelUpDialogItemKt.CraftLevelUpDialogItem$lambda$2(this.$isRotated$delegate, true);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

