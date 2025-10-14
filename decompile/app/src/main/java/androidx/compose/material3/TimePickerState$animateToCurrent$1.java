package androidx.compose.material3;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TimePicker.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "androidx.compose.material3.TimePickerState", m7120f = "TimePicker.kt", m7121i = {0, 0}, m7122l = {703, TypedValues.TransitionType.TYPE_AUTO_TRANSITION}, m7123m = "animateToCurrent$material3_release", m7124n = {"this", "end"}, m7125s = {"L$0", "F$0"})
/* loaded from: classes.dex */
public final class TimePickerState$animateToCurrent$1 extends ContinuationImpl {
    public float F$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TimePickerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerState$animateToCurrent$1(TimePickerState timePickerState, Continuation<? super TimePickerState$animateToCurrent$1> continuation) {
        super(continuation);
        this.this$0 = timePickerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.animateToCurrent$material3_release(this);
    }
}
