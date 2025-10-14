package com.blackhub.bronline.game.p019ui.clicker;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.MutableState;
import androidx.media3.extractor.p007ts.TsExtractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ClickerContent.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.clicker.ClickerContentKt$ClickerContent$4$1$2$2", m7120f = "ClickerContent.kt", m7121i = {}, m7122l = {181}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes7.dex */
public final class ClickerContentKt$ClickerContent$4$1$2$2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Mutex $clickMutex;
    public final /* synthetic */ MutableState<Boolean> $isStartTimer$delegate;
    public final /* synthetic */ Function0<Unit> $onTapScreen;
    public final /* synthetic */ CoroutineScope $scope;
    public final /* synthetic */ MutableState<Offset> $tapPosition$delegate;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickerContentKt$ClickerContent$4$1$2$2(CoroutineScope coroutineScope, Mutex mutex, Function0<Unit> function0, MutableState<Offset> mutableState, MutableState<Boolean> mutableState2, Continuation<? super ClickerContentKt$ClickerContent$4$1$2$2> continuation) {
        super(2, continuation);
        this.$scope = coroutineScope;
        this.$clickMutex = mutex;
        this.$onTapScreen = function0;
        this.$tapPosition$delegate = mutableState;
        this.$isStartTimer$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ClickerContentKt$ClickerContent$4$1$2$2 clickerContentKt$ClickerContent$4$1$2$2 = new ClickerContentKt$ClickerContent$4$1$2$2(this.$scope, this.$clickMutex, this.$onTapScreen, this.$tapPosition$delegate, this.$isStartTimer$delegate, continuation);
        clickerContentKt$ClickerContent$4$1$2$2.L$0 = obj;
        return clickerContentKt$ClickerContent$4$1$2$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ClickerContentKt$ClickerContent$4$1$2$2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final CoroutineScope coroutineScope = this.$scope;
            final Mutex mutex = this.$clickMutex;
            final Function0<Unit> function0 = this.$onTapScreen;
            final MutableState<Offset> mutableState = this.$tapPosition$delegate;
            final MutableState<Boolean> mutableState2 = this.$isStartTimer$delegate;
            Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: com.blackhub.bronline.game.ui.clicker.ClickerContentKt$ClickerContent$4$1$2$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* compiled from: ClickerContent.kt */
                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.clicker.ClickerContentKt$ClickerContent$4$1$2$2$1$1", m7120f = "ClickerContent.kt", m7121i = {}, m7122l = {TsExtractor.TS_PACKET_SIZE}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                /* renamed from: com.blackhub.bronline.game.ui.clicker.ClickerContentKt$ClickerContent$4$1$2$2$1$1, reason: invalid class name */
                /* loaded from: classes7.dex */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ Mutex $clickMutex;
                    public final /* synthetic */ MutableState<Boolean> $isStartTimer$delegate;
                    public final /* synthetic */ long $offset;
                    public final /* synthetic */ Function0<Unit> $onTapScreen;
                    public final /* synthetic */ MutableState<Offset> $tapPosition$delegate;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(Mutex mutex, Function0<Unit> function0, long j, MutableState<Offset> mutableState, MutableState<Boolean> mutableState2, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$clickMutex = mutex;
                        this.$onTapScreen = function0;
                        this.$offset = j;
                        this.$tapPosition$delegate = mutableState;
                        this.$isStartTimer$delegate = mutableState2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new AnonymousClass1(this.$clickMutex, this.$onTapScreen, this.$offset, this.$tapPosition$delegate, this.$isStartTimer$delegate, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        try {
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                if (Mutex.DefaultImpls.tryLock$default(this.$clickMutex, null, 1, null)) {
                                    this.$onTapScreen.invoke();
                                    this.$tapPosition$delegate.setValue(Offset.m11088boximpl(this.$offset));
                                    if (!ClickerContentKt.ClickerContent$lambda$4(this.$isStartTimer$delegate)) {
                                        ClickerContentKt.ClickerContent$lambda$5(this.$isStartTimer$delegate, true);
                                    }
                                    this.label = 1;
                                    if (DelayKt.delay(100L, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        } finally {
                            Mutex.DefaultImpls.unlock$default(this.$clickMutex, null, 1, null);
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m14947invokek4lQ0M(offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m14947invokek4lQ0M(long j) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(mutex, function0, j, mutableState, mutableState2, null), 3, null);
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

