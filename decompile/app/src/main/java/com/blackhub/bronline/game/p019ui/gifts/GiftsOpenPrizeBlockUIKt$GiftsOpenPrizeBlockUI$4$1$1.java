package com.blackhub.bronline.game.p019ui.gifts;

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

/* compiled from: GiftsOpenPrizeBlockUI.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizeBlockUIKt$GiftsOpenPrizeBlockUI$4$1$1", m7120f = "GiftsOpenPrizeBlockUI.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes7.dex */
public final class GiftsOpenPrizeBlockUIKt$GiftsOpenPrizeBlockUI$4$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ boolean $isRotationFinished;
    public final /* synthetic */ MutableState<Boolean> $isStartAnim$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftsOpenPrizeBlockUIKt$GiftsOpenPrizeBlockUI$4$1$1(boolean z, MutableState<Boolean> mutableState, Continuation<? super GiftsOpenPrizeBlockUIKt$GiftsOpenPrizeBlockUI$4$1$1> continuation) {
        super(2, continuation);
        this.$isRotationFinished = z;
        this.$isStartAnim$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GiftsOpenPrizeBlockUIKt$GiftsOpenPrizeBlockUI$4$1$1(this.$isRotationFinished, this.$isStartAnim$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((GiftsOpenPrizeBlockUIKt$GiftsOpenPrizeBlockUI$4$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$isRotationFinished) {
            GiftsOpenPrizeBlockUIKt.GiftsOpenPrizeBlockUI$lambda$11(this.$isStartAnim$delegate, true);
        }
        return Unit.INSTANCE;
    }
}
