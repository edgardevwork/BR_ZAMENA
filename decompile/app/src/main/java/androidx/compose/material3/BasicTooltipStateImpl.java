package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BasicTooltip.kt */
@Stable
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\u0016\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR+\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\b\"\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m7105d2 = {"Landroidx/compose/material3/BasicTooltipStateImpl;", "Landroidx/compose/material3/BasicTooltipState;", "initialIsVisible", "", "isPersistent", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "(ZZLandroidx/compose/foundation/MutatorMutex;)V", "()Z", "<set-?>", "isVisible", "setVisible", "(Z)V", "isVisible$delegate", "Landroidx/compose/runtime/MutableState;", "job", "Lkotlinx/coroutines/CancellableContinuation;", "", "dismiss", "onDispose", "show", "mutatePriority", "Landroidx/compose/foundation/MutatePriority;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/material3/BasicTooltipStateImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,248:1\n81#2:249\n107#2,2:250\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/material3/BasicTooltipStateImpl\n*L\n130#1:249\n130#1:250,2\n*E\n"})
/* loaded from: classes4.dex */
public final class BasicTooltipStateImpl implements BasicTooltipState {
    public final boolean isPersistent;

    /* renamed from: isVisible$delegate, reason: from kotlin metadata */
    @NotNull
    public final MutableState isVisible;

    @Nullable
    public CancellableContinuation<? super Unit> job;

    @NotNull
    public final MutatorMutex mutatorMutex;

    public BasicTooltipStateImpl(boolean z, boolean z2, @NotNull MutatorMutex mutatorMutex) {
        this.isPersistent = z2;
        this.mutatorMutex = mutatorMutex;
        this.isVisible = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
    }

    @Override // androidx.compose.material3.BasicTooltipState
    /* renamed from: isPersistent, reason: from getter */
    public boolean getIsPersistent() {
        return this.isPersistent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material3.BasicTooltipState
    /* renamed from: isVisible */
    public boolean getIsVisible() {
        return ((Boolean) this.isVisible.getValue()).booleanValue();
    }

    public void setVisible(boolean z) {
        this.isVisible.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.material3.BasicTooltipState
    @Nullable
    public Object show(@NotNull MutatePriority mutatePriority, @NotNull Continuation<? super Unit> continuation) {
        Object objMutate = this.mutatorMutex.mutate(mutatePriority, new C13192(new BasicTooltipStateImpl$show$cancellableShow$1(this, null), null), continuation);
        return objMutate == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate : Unit.INSTANCE;
    }

    /* compiled from: BasicTooltip.kt */
    @Metadata(m7104d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", ""}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.material3.BasicTooltipStateImpl$show$2", m7120f = "BasicTooltip.kt", m7121i = {}, m7122l = {159, MatroskaExtractor.ID_BLOCK}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.material3.BasicTooltipStateImpl$show$2 */
    /* loaded from: classes.dex */
    public static final class C13192 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Continuation<? super Unit>, Object> $cancellableShow;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13192(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super C13192> continuation) {
            super(1, continuation);
            this.$cancellableShow = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return BasicTooltipStateImpl.this.new C13192(this.$cancellableShow, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
            return ((C13192) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (BasicTooltipStateImpl.this.getIsPersistent()) {
                        Function1<Continuation<? super Unit>, Object> function1 = this.$cancellableShow;
                        this.label = 1;
                        if (function1.invoke(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$cancellableShow, null);
                        this.label = 2;
                        if (TimeoutKt.withTimeout(1500L, anonymousClass1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                BasicTooltipStateImpl.this.setVisible(false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                BasicTooltipStateImpl.this.setVisible(false);
                throw th;
            }
        }

        /* compiled from: BasicTooltip.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.material3.BasicTooltipStateImpl$show$2$1", m7120f = "BasicTooltip.kt", m7121i = {}, m7122l = {162}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.material3.BasicTooltipStateImpl$show$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Function1<Continuation<? super Unit>, Object> $cancellableShow;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$cancellableShow = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$cancellableShow, continuation);
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
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function1<Continuation<? super Unit>, Object> function1 = this.$cancellableShow;
                    this.label = 1;
                    if (function1.invoke(this) == coroutine_suspended) {
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
    }

    @Override // androidx.compose.material3.BasicTooltipState
    public void dismiss() {
        setVisible(false);
    }

    @Override // androidx.compose.material3.BasicTooltipState
    public void onDispose() {
        CancellableContinuation<? super Unit> cancellableContinuation = this.job;
        if (cancellableContinuation != null) {
            CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
        }
    }
}
