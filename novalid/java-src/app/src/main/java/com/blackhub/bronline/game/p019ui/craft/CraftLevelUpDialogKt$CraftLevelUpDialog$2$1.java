package com.blackhub.bronline.game.p019ui.craft;

import androidx.compose.foundation.ScrollState;
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

/* compiled from: CraftLevelUpDialog.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.craft.CraftLevelUpDialogKt$CraftLevelUpDialog$2$1", m7120f = "CraftLevelUpDialog.kt", m7121i = {}, m7122l = {119, 120, 128, 129}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes7.dex */
public final class CraftLevelUpDialogKt$CraftLevelUpDialog$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $isTouchingLeft$delegate;
    public final /* synthetic */ MutableState<Boolean> $isTouchingRight$delegate;
    public final /* synthetic */ ScrollState $scrollState;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CraftLevelUpDialogKt$CraftLevelUpDialog$2$1(ScrollState scrollState, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super CraftLevelUpDialogKt$CraftLevelUpDialog$2$1> continuation) {
        super(2, continuation);
        this.$scrollState = scrollState;
        this.$isTouchingRight$delegate = mutableState;
        this.$isTouchingLeft$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CraftLevelUpDialogKt$CraftLevelUpDialog$2$1(this.$scrollState, this.$isTouchingRight$delegate, this.$isTouchingLeft$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CraftLevelUpDialogKt$CraftLevelUpDialog$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Path cross not found for [B:4:0x000e, B:14:0x0030], limit reached: 44 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0076 -> B:22:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00ac -> B:34:0x0089). Please report as a decompilation issue!!! */
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
            if (!CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$13(this.$isTouchingRight$delegate) || !CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$10(this.$isTouchingLeft$delegate)) {
                if (!CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$13(this.$isTouchingRight$delegate)) {
                    if (CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$10(this.$isTouchingLeft$delegate) && this.$scrollState.getCanScrollBackward()) {
                        if (CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$10(this.$isTouchingLeft$delegate)) {
                        }
                    }
                } else if (this.$scrollState.getCanScrollForward()) {
                    if (CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$13(this.$isTouchingRight$delegate)) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
            this.label = 2;
            if (DelayKt.delay(100L, this) == coroutine_suspended) {
            }
            if (CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$13(this.$isTouchingRight$delegate)) {
            }
            return Unit.INSTANCE;
        }
        if (i == 2) {
            ResultKt.throwOnFailure(obj);
            if (CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$13(this.$isTouchingRight$delegate)) {
                ScrollState scrollState = this.$scrollState;
                int value = scrollState.getValue() + 250;
                this.label = 1;
                if (ScrollState.animateScrollTo$default(scrollState, value, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.label = 2;
                if (DelayKt.delay(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$13(this.$isTouchingRight$delegate)) {
                }
            }
            return Unit.INSTANCE;
        }
        if (i == 3) {
            ResultKt.throwOnFailure(obj);
            this.label = 4;
            if (DelayKt.delay(100L, this) == coroutine_suspended) {
            }
            if (CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$10(this.$isTouchingLeft$delegate)) {
            }
            return Unit.INSTANCE;
        }
        if (i != 4) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$10(this.$isTouchingLeft$delegate)) {
            ScrollState scrollState2 = this.$scrollState;
            int value2 = scrollState2.getValue() - 250;
            this.label = 3;
            if (ScrollState.animateScrollTo$default(scrollState2, value2, null, this, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.label = 4;
            if (DelayKt.delay(100L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$10(this.$isTouchingLeft$delegate)) {
            }
        }
        return Unit.INSTANCE;
    }
}
