package com.blackhub.bronline.game.p019ui.craft;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableState;
import com.bless.client.R;
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

/* compiled from: CraftLevelUpDialog.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.craft.CraftLevelUpDialogKt$CraftLevelUpDialog$3$1", m7120f = "CraftLevelUpDialog.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes7.dex */
public final class CraftLevelUpDialogKt$CraftLevelUpDialog$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Integer> $leftArrowColor$delegate;
    public final /* synthetic */ MutableState<Integer> $rightArrowColor$delegate;
    public final /* synthetic */ ScrollState $scrollState;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CraftLevelUpDialogKt$CraftLevelUpDialog$3$1(ScrollState scrollState, MutableState<Integer> mutableState, MutableState<Integer> mutableState2, Continuation<? super CraftLevelUpDialogKt$CraftLevelUpDialog$3$1> continuation) {
        super(2, continuation);
        this.$scrollState = scrollState;
        this.$leftArrowColor$delegate = mutableState;
        this.$rightArrowColor$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CraftLevelUpDialogKt$CraftLevelUpDialog$3$1(this.$scrollState, this.$leftArrowColor$delegate, this.$rightArrowColor$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CraftLevelUpDialogKt$CraftLevelUpDialog$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$scrollState.getMaxValue() > 5) {
            if (this.$scrollState.getCanScrollBackward() && this.$scrollState.getCanScrollForward()) {
                CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$2(this.$leftArrowColor$delegate, R.color.white);
                CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$5(this.$rightArrowColor$delegate, R.color.white);
            } else if (this.$scrollState.getCanScrollBackward()) {
                CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$2(this.$leftArrowColor$delegate, R.color.white);
                CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$5(this.$rightArrowColor$delegate, R.color.white_40);
            } else if (this.$scrollState.getCanScrollForward()) {
                CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$2(this.$leftArrowColor$delegate, R.color.white_40);
                CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$5(this.$rightArrowColor$delegate, R.color.white);
            }
        }
        return Unit.INSTANCE;
    }
}
