package androidx.work.impl.constraints.controllers;

import androidx.exifinterface.media.ExifInterface;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContraintControllers.kt */
@Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014R\u0018\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m7105d2 = {"Landroidx/work/impl/constraints/controllers/ConstraintController;", ExifInterface.GPS_DIRECTION_TRUE, "", "tracker", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "(Landroidx/work/impl/constraints/trackers/ConstraintTracker;)V", "reason", "", "getReason$annotations", "()V", "getReason", "()I", "hasConstraint", "", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "isConstrained", "value", "(Ljava/lang/Object;)Z", "track", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/work/impl/constraints/ConstraintsState;", "work-runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public abstract class ConstraintController<T> {

    @NotNull
    public final ConstraintTracker<T> tracker;

    public static /* synthetic */ void getReason$annotations() {
    }

    public abstract int getReason();

    public abstract boolean hasConstraint(@NotNull WorkSpec workSpec);

    public abstract boolean isConstrained(T value);

    public ConstraintController(@NotNull ConstraintTracker<T> tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.tracker = tracker;
    }

    /* compiled from: ContraintControllers.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/channels/ProducerScope;", "Landroidx/work/impl/constraints/ConstraintsState;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.work.impl.constraints.controllers.ConstraintController$track$1", m7120f = "ContraintControllers.kt", m7121i = {}, m7122l = {55}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.work.impl.constraints.controllers.ConstraintController$track$1 */
    public static final class C33251 extends SuspendLambda implements Function2<ProducerScope<? super ConstraintsState>, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ ConstraintController<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33251(ConstraintController<T> constraintController, Continuation<? super C33251> continuation) {
            super(2, continuation);
            this.this$0 = constraintController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C33251 c33251 = new C33251(this.this$0, continuation);
            c33251.L$0 = obj;
            return c33251;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ProducerScope<? super ConstraintsState> producerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C33251) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final ProducerScope producerScope = (ProducerScope) this.L$0;
                final ConstraintController<T> constraintController = this.this$0;
                final ConstraintListener<T> constraintListener = new ConstraintListener<T>() { // from class: androidx.work.impl.constraints.controllers.ConstraintController$track$1$listener$1
                    @Override // androidx.work.impl.constraints.ConstraintListener
                    public void onConstraintChanged(T newValue) {
                        producerScope.getChannel().mo17201trySendJP2dKIU(constraintController.isConstrained((ConstraintController<T>) newValue) ? new ConstraintsState.ConstraintsNotMet(constraintController.getReason()) : ConstraintsState.ConstraintsMet.INSTANCE);
                    }
                };
                this.this$0.tracker.addListener(constraintListener);
                final ConstraintController<T> constraintController2 = this.this$0;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.work.impl.constraints.controllers.ConstraintController.track.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        constraintController2.tracker.removeListener(constraintListener);
                    }
                };
                this.label = 1;
                if (ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
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

    @NotNull
    public final Flow<ConstraintsState> track() {
        return FlowKt.callbackFlow(new C33251(this, null));
    }

    public final boolean isConstrained(@NotNull WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return hasConstraint(workSpec) && isConstrained((ConstraintController<T>) this.tracker.readSystemState());
    }
}
