package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TimePicker.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "androidx.compose.material3.TimePickerState", m7120f = "TimePicker.kt", m7121i = {0, 0, 0, 0, 0, 1, 1}, m7122l = {738, 746, 747, 750}, m7123m = "onTap$material3_release", m7124n = {"this", "x", "y", "maxDist", "autoSwitchToMinute", "this", "targetValue"}, m7125s = {"L$0", "F$0", "F$1", "F$2", "Z$0", "L$0", "L$1"})
/* loaded from: classes.dex */
public final class TimePickerState$onTap$1 extends ContinuationImpl {
    public float F$0;
    public float F$1;
    public float F$2;
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TimePickerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerState$onTap$1(TimePickerState timePickerState, Continuation<? super TimePickerState$onTap$1> continuation) {
        super(continuation);
        this.this$0 = timePickerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onTap$material3_release(0.0f, 0.0f, 0.0f, false, this);
    }
}
