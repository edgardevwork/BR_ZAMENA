package com.blackhub.bronline.game.p019ui.taxiorder;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TaxiMap.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.taxiorder.TaxiMapKt$TaxiMap$1$1$1", m7120f = "TaxiMap.kt", m7121i = {}, m7122l = {129}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes8.dex */
public final class TaxiMapKt$TaxiMap$1$1$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Ref.FloatRef $alpha;
    public final /* synthetic */ MutableState<Boolean> $isPointSelected$delegate;
    public final /* synthetic */ MutableState<Offset> $offsetPoint$delegate;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiMapKt$TaxiMap$1$1$1(Ref.FloatRef floatRef, MutableState<Boolean> mutableState, MutableState<Offset> mutableState2, Continuation<? super TaxiMapKt$TaxiMap$1$1$1> continuation) {
        super(2, continuation);
        this.$alpha = floatRef;
        this.$isPointSelected$delegate = mutableState;
        this.$offsetPoint$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        TaxiMapKt$TaxiMap$1$1$1 taxiMapKt$TaxiMap$1$1$1 = new TaxiMapKt$TaxiMap$1$1$1(this.$alpha, this.$isPointSelected$delegate, this.$offsetPoint$delegate, continuation);
        taxiMapKt$TaxiMap$1$1$1.L$0 = obj;
        return taxiMapKt$TaxiMap$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TaxiMapKt$TaxiMap$1$1$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final Ref.FloatRef floatRef = this.$alpha;
            final MutableState<Boolean> mutableState = this.$isPointSelected$delegate;
            final MutableState<Offset> mutableState2 = this.$offsetPoint$delegate;
            Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiMapKt$TaxiMap$1$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m15026invokek4lQ0M(offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m15026invokek4lQ0M(long j) {
                    TaxiMapKt.TaxiMap$lambda$5(mutableState, true);
                    floatRef.element = 1.0f;
                    TaxiMapKt.TaxiMap$lambda$2(mutableState2, OffsetKt.Offset(Offset.m11099getXimpl(j), Offset.m11100getYimpl(j)));
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, function1, this, 7, null) == coroutine_suspended) {
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
