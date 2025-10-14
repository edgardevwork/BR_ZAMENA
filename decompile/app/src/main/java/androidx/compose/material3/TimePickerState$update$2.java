package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TimePicker.kt */
@Metadata(m7104d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", ""}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "androidx.compose.material3.TimePickerState$update$2", m7120f = "TimePicker.kt", m7121i = {}, m7122l = {689, 691}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes2.dex */
public final class TimePickerState$update$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public final /* synthetic */ boolean $fromTap;
    public final /* synthetic */ float $value;
    public int label;
    public final /* synthetic */ TimePickerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerState$update$2(TimePickerState timePickerState, float f, boolean z, Continuation<? super TimePickerState$update$2> continuation) {
        super(1, continuation);
        this.this$0 = timePickerState;
        this.$value = f;
        this.$fromTap = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new TimePickerState$update$2(this.this$0, this.$value, this.$fromTap, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
        return ((TimePickerState$update$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (Selection.m9744equalsimpl0(this.this$0.m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9748getHourJiIwxys())) {
                this.this$0.setHourAngle$material3_release((r8.toHour(this.$value) % 12) * 0.5235988f);
            } else if (this.$fromTap) {
                this.this$0.setMinuteAngle$material3_release((r8.toMinute(this.$value) - (this.this$0.toMinute(this.$value) % 5)) * 0.10471976f);
            } else {
                this.this$0.setMinuteAngle$material3_release(r8.toMinute(this.$value) * 0.10471976f);
            }
            if (this.$fromTap) {
                Animatable<Float, AnimationVector1D> currentAngle$material3_release = this.this$0.getCurrentAngle$material3_release();
                Float fBoxFloat = Boxing.boxFloat(this.this$0.getMinuteAngle$material3_release());
                this.label = 1;
                if (currentAngle$material3_release.snapTo(fBoxFloat, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                Animatable<Float, AnimationVector1D> currentAngle$material3_release2 = this.this$0.getCurrentAngle$material3_release();
                Float fBoxFloat2 = Boxing.boxFloat(this.this$0.offsetHour(this.$value));
                this.label = 2;
                if (currentAngle$material3_release2.snapTo(fBoxFloat2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
