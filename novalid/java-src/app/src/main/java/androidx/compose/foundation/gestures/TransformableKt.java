package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p003ui.input.pointer.PointerEvent;
import androidx.compose.p003ui.input.pointer.PointerEventKt;
import androidx.compose.p003ui.input.pointer.PointerEventPass;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import androidx.constraintlayout.motion.widget.Key;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Transformable.kt */
@Metadata(m7104d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tH\u0082@¢\u0006\u0002\u0010\u000b\u001a<\u0010\f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0004H\u0007\u001a&\u0010\f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0004¨\u0006\u0012"}, m7105d2 = {"detectZoom", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "panZoomLock", "", "channel", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/TransformEvent;", "canPan", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlinx/coroutines/channels/Channel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transformable", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/gestures/TransformableState;", "lockRotationOnZoomPan", "enabled", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,277:1\n101#2,2:278\n33#2,6:280\n103#2:286\n33#2,6:287\n101#2,2:293\n33#2,6:295\n103#2:301\n101#2,2:302\n33#2,6:304\n103#2:310\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n*L\n219#1:278,2\n219#1:280,6\n219#1:286\n253#1:287,6\n264#1:293,2\n264#1:295,6\n264#1:301\n265#1:302,2\n265#1:304,6\n265#1:310\n*E\n"})
/* loaded from: classes2.dex */
public final class TransformableKt {

    /* compiled from: Transformable.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.TransformableKt", m7120f = "Transformable.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, m7122l = {216, 218, 262}, m7123m = "detectZoom", m7124n = {"$this$detectZoom", "channel", "canPan", "panZoomLock", Key.ROTATION, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", "channel", "canPan", "panZoomLock", Key.ROTATION, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", "channel", "canPan", "event", "panZoomLock", Key.ROTATION, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "canceled"}, m7125s = {"L$0", "L$1", "L$2", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "I$2"})
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$detectZoom$1 */
    public static final class C05031 extends ContinuationImpl {
        public float F$0;
        public float F$1;
        public float F$2;
        public int I$0;
        public int I$1;
        public int I$2;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C05031(Continuation<? super C05031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransformableKt.detectZoom(null, false, null, null, this);
        }
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return transformable(modifier, transformableState, z, z2);
    }

    @NotNull
    public static final Modifier transformable(@NotNull Modifier modifier, @NotNull TransformableState transformableState, boolean z, boolean z2) {
        return transformable(modifier, transformableState, new Function1<Offset, Boolean>() { // from class: androidx.compose.foundation.gestures.TransformableKt.transformable.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Offset offset) {
                return m7982invokek4lQ0M(offset.getPackedValue());
            }

            @NotNull
            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final Boolean m7982invokek4lQ0M(long j) {
                return Boolean.TRUE;
            }
        }, z, z2);
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, Function1 function1, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        return transformable(modifier, transformableState, function1, z, z2);
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier transformable(@NotNull Modifier modifier, @NotNull TransformableState transformableState, @NotNull Function1<? super Offset, Boolean> function1, boolean z, boolean z2) {
        return modifier.then(new TransformableElement(transformableState, function1, z, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x029c, code lost:
    
        if (r5 != 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x029e, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a3 A[EDGE_INSN: B:100:0x02a3->B:89:0x02a3 BREAK  A[LOOP:0: B:83:0x028e->B:88:0x02a0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0274 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0275 -> B:82:0x0281). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object detectZoom(AwaitPointerEventScope awaitPointerEventScope, boolean z, Channel<TransformEvent> channel, Function1<? super Offset, Boolean> function1, Continuation<? super Unit> continuation) throws Throwable {
        C05031 c05031;
        AwaitPointerEventScope awaitPointerEventScope2;
        Channel<TransformEvent> channel2;
        Function1<? super Offset, Boolean> function12;
        boolean z2;
        float f;
        long jM11104plusMKHz9U;
        int i;
        int i2;
        float f2;
        float f3;
        AwaitPointerEventScope awaitPointerEventScope3;
        float f4;
        Channel<TransformEvent> channel3;
        int size;
        int i3;
        int i4;
        C05031 c050312;
        int i5;
        int i6;
        float f5;
        long j;
        int i7;
        int i8;
        Object objAwaitPointerEvent;
        boolean z3;
        PointerEvent pointerEvent;
        float f6;
        float f7;
        int i9;
        Channel<TransformEvent> channel4;
        float f8;
        int i10;
        long j2;
        float f9;
        float f10;
        int size2;
        int i11;
        int size3;
        int i12;
        int size4;
        int i13;
        if (continuation instanceof C05031) {
            c05031 = (C05031) continuation;
            int i14 = c05031.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c05031.label = i14 - Integer.MIN_VALUE;
            } else {
                c05031 = new C05031(continuation);
            }
        }
        Object objAwaitPointerEvent$default = c05031.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i15 = c05031.label;
        if (i15 == 0) {
            ResultKt.throwOnFailure(objAwaitPointerEvent$default);
            long jM11115getZeroF1C5BW0 = Offset.INSTANCE.m11115getZeroF1C5BW0();
            float touchSlop = awaitPointerEventScope.getViewConfiguration().getTouchSlop();
            awaitPointerEventScope2 = awaitPointerEventScope;
            c05031.L$0 = awaitPointerEventScope2;
            channel2 = channel;
            c05031.L$1 = channel2;
            function12 = function1;
            c05031.L$2 = function12;
            z2 = z;
            c05031.Z$0 = z2;
            c05031.F$0 = 0.0f;
            c05031.F$1 = 1.0f;
            c05031.J$0 = jM11115getZeroF1C5BW0;
            c05031.I$0 = 0;
            c05031.F$2 = touchSlop;
            c05031.I$1 = 0;
            c05031.label = 1;
            if (TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, c05031, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            f = touchSlop;
            jM11104plusMKHz9U = jM11115getZeroF1C5BW0;
            i = 0;
            i2 = 0;
            f2 = 1.0f;
            f3 = 0.0f;
        } else {
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i16 = c05031.I$2;
                    i9 = c05031.I$1;
                    f7 = c05031.F$2;
                    i7 = c05031.I$0;
                    j = c05031.J$0;
                    float f11 = c05031.F$1;
                    float f12 = c05031.F$0;
                    boolean z4 = c05031.Z$0;
                    pointerEvent = (PointerEvent) c05031.L$3;
                    function12 = (Function1) c05031.L$2;
                    Channel<TransformEvent> channel5 = (Channel) c05031.L$1;
                    awaitPointerEventScope3 = (AwaitPointerEventScope) c05031.L$0;
                    ResultKt.throwOnFailure(objAwaitPointerEvent$default);
                    z3 = z4;
                    f4 = f12;
                    channel4 = channel5;
                    f6 = f11;
                    i8 = i16;
                    objAwaitPointerEvent = objAwaitPointerEvent$default;
                    List<PointerInputChange> changes = ((PointerEvent) objAwaitPointerEvent).getChanges();
                    size3 = changes.size();
                    C05031 c050313 = c05031;
                    i12 = 0;
                    while (true) {
                        if (i12 >= size3) {
                            break;
                        }
                        if (changes.get(i12).isConsumed()) {
                            break;
                        }
                        i12++;
                    }
                    boolean z5 = false;
                    if (i8 == 0 && !z5) {
                        List<PointerInputChange> changes2 = pointerEvent.getChanges();
                        size4 = changes2.size();
                        for (i13 = 0; i13 < size4; i13++) {
                            if (changes2.get(i13).getPressed()) {
                                c05031 = c050313;
                                i = i9;
                                f = f7;
                                i2 = i7;
                                jM11104plusMKHz9U = j;
                                f2 = f6;
                                f3 = f4;
                                awaitPointerEventScope2 = awaitPointerEventScope3;
                                z2 = z3;
                                channel2 = channel4;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                i = c05031.I$1;
                f = c05031.F$2;
                i2 = c05031.I$0;
                jM11104plusMKHz9U = c05031.J$0;
                f2 = c05031.F$1;
                float f13 = c05031.F$0;
                boolean z6 = c05031.Z$0;
                Function1<? super Offset, Boolean> function13 = (Function1) c05031.L$2;
                Channel<TransformEvent> channel6 = (Channel) c05031.L$1;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) c05031.L$0;
                ResultKt.throwOnFailure(objAwaitPointerEvent$default);
                z2 = z6;
                f4 = f13;
                channel3 = channel6;
                awaitPointerEventScope3 = awaitPointerEventScope4;
                function12 = function13;
                PointerEvent pointerEvent2 = (PointerEvent) objAwaitPointerEvent$default;
                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                size = changes3.size();
                int i17 = i;
                i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        i4 = 0;
                        break;
                    }
                    if (changes3.get(i3).isConsumed()) {
                        i4 = 1;
                        break;
                    }
                    i3++;
                }
                if (i4 != 0) {
                    float fCalculateZoom = TransformGestureDetectorKt.calculateZoom(pointerEvent2);
                    float fCalculateRotation = TransformGestureDetectorKt.calculateRotation(pointerEvent2);
                    c050312 = c05031;
                    i5 = i4;
                    long jCalculatePan = TransformGestureDetectorKt.calculatePan(pointerEvent2);
                    if (i2 == 0) {
                        f2 *= fCalculateZoom;
                        f4 += fCalculateRotation;
                        jM11104plusMKHz9U = Offset.m11104plusMKHz9U(jM11104plusMKHz9U, jCalculatePan);
                        int i18 = i2;
                        float fCalculateCentroidSize = TransformGestureDetectorKt.calculateCentroidSize(pointerEvent2, false);
                        f8 = fCalculateRotation;
                        float fAbs = Math.abs(1 - f2) * fCalculateCentroidSize;
                        float fAbs2 = Math.abs(((3.1415927f * f4) * fCalculateCentroidSize) / 180.0f);
                        float fM11097getDistanceimpl = Offset.m11097getDistanceimpl(jM11104plusMKHz9U);
                        if (fAbs > f || fAbs2 > f || (fM11097getDistanceimpl > f && function12.invoke(Offset.m11088boximpl(jCalculatePan)).booleanValue())) {
                            i6 = (!z2 || fAbs2 >= f) ? 0 : 1;
                            channel3.mo17201trySendJP2dKIU(TransformEvent.TransformStarted.INSTANCE);
                            i2 = 1;
                        } else {
                            i6 = i17;
                            i2 = i18;
                        }
                    } else {
                        f8 = fCalculateRotation;
                        i6 = i17;
                    }
                    if (i2 == 0) {
                        i10 = i2;
                        j2 = jM11104plusMKHz9U;
                    } else {
                        if (i6 != 0) {
                            f10 = 0.0f;
                            f9 = 0.0f;
                        } else {
                            f9 = f8;
                            f10 = 0.0f;
                        }
                        if (f9 == f10 && fCalculateZoom == 1.0f) {
                            i10 = i2;
                            j2 = jM11104plusMKHz9U;
                            if (!Offset.m11096equalsimpl0(jCalculatePan, Offset.INSTANCE.m11115getZeroF1C5BW0()) && function12.invoke(Offset.m11088boximpl(jCalculatePan)).booleanValue()) {
                            }
                            List<PointerInputChange> changes4 = pointerEvent2.getChanges();
                            size2 = changes4.size();
                            for (i11 = 0; i11 < size2; i11++) {
                                PointerInputChange pointerInputChange = changes4.get(i11);
                                if (PointerEventKt.positionChanged(pointerInputChange)) {
                                    pointerInputChange.consume();
                                }
                            }
                        } else {
                            i10 = i2;
                            j2 = jM11104plusMKHz9U;
                        }
                        channel3.mo17201trySendJP2dKIU(new TransformEvent.TransformDelta(fCalculateZoom, jCalculatePan, f9, null));
                        List<PointerInputChange> changes42 = pointerEvent2.getChanges();
                        size2 = changes42.size();
                        while (i11 < size2) {
                        }
                    }
                    i7 = i10;
                    f5 = f2;
                    j = j2;
                } else {
                    c050312 = c05031;
                    i5 = i4;
                    channel3.mo17201trySendJP2dKIU(TransformEvent.TransformStopped.INSTANCE);
                    i6 = i17;
                    f5 = f2;
                    j = jM11104plusMKHz9U;
                    i7 = i2;
                }
                PointerEventPass pointerEventPass = PointerEventPass.Final;
                C05031 c050314 = c050312;
                c050314.L$0 = awaitPointerEventScope3;
                c050314.L$1 = channel3;
                c050314.L$2 = function12;
                c050314.L$3 = pointerEvent2;
                c050314.Z$0 = z2;
                c050314.F$0 = f4;
                c050314.F$1 = f5;
                c050314.J$0 = j;
                c050314.I$0 = i7;
                c050314.F$2 = f;
                c050314.I$1 = i6;
                i8 = i5;
                c050314.I$2 = i8;
                c050314.label = 3;
                objAwaitPointerEvent = awaitPointerEventScope3.awaitPointerEvent(pointerEventPass, c050314);
                if (objAwaitPointerEvent != coroutine_suspended) {
                    return coroutine_suspended;
                }
                z3 = z2;
                pointerEvent = pointerEvent2;
                Channel<TransformEvent> channel7 = channel3;
                f6 = f5;
                c05031 = c050314;
                f7 = f;
                i9 = i6;
                channel4 = channel7;
                List<PointerInputChange> changes5 = ((PointerEvent) objAwaitPointerEvent).getChanges();
                size3 = changes5.size();
                C05031 c0503132 = c05031;
                i12 = 0;
                while (true) {
                    if (i12 >= size3) {
                    }
                    i12++;
                }
                boolean z52 = false;
                if (i8 == 0) {
                    List<PointerInputChange> changes22 = pointerEvent.getChanges();
                    size4 = changes22.size();
                    while (i13 < size4) {
                    }
                }
                return Unit.INSTANCE;
            }
            i = c05031.I$1;
            f = c05031.F$2;
            i2 = c05031.I$0;
            jM11104plusMKHz9U = c05031.J$0;
            f2 = c05031.F$1;
            f3 = c05031.F$0;
            boolean z7 = c05031.Z$0;
            Function1<? super Offset, Boolean> function14 = (Function1) c05031.L$2;
            channel2 = (Channel) c05031.L$1;
            AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) c05031.L$0;
            ResultKt.throwOnFailure(objAwaitPointerEvent$default);
            z2 = z7;
            function12 = function14;
            awaitPointerEventScope2 = awaitPointerEventScope5;
        }
        c05031.L$0 = awaitPointerEventScope2;
        c05031.L$1 = channel2;
        c05031.L$2 = function12;
        c05031.L$3 = null;
        c05031.Z$0 = z2;
        c05031.F$0 = f3;
        c05031.F$1 = f2;
        c05031.J$0 = jM11104plusMKHz9U;
        c05031.I$0 = i2;
        c05031.F$2 = f;
        c05031.I$1 = i;
        c05031.label = 2;
        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, c05031, 1, null);
        if (objAwaitPointerEvent$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        AwaitPointerEventScope awaitPointerEventScope6 = awaitPointerEventScope2;
        f4 = f3;
        channel3 = channel2;
        awaitPointerEventScope3 = awaitPointerEventScope6;
        PointerEvent pointerEvent22 = (PointerEvent) objAwaitPointerEvent$default;
        List<PointerInputChange> changes32 = pointerEvent22.getChanges();
        size = changes32.size();
        int i172 = i;
        i3 = 0;
        while (true) {
            if (i3 >= size) {
            }
            i3++;
        }
        if (i4 != 0) {
        }
        PointerEventPass pointerEventPass2 = PointerEventPass.Final;
        C05031 c0503142 = c050312;
        c0503142.L$0 = awaitPointerEventScope3;
        c0503142.L$1 = channel3;
        c0503142.L$2 = function12;
        c0503142.L$3 = pointerEvent22;
        c0503142.Z$0 = z2;
        c0503142.F$0 = f4;
        c0503142.F$1 = f5;
        c0503142.J$0 = j;
        c0503142.I$0 = i7;
        c0503142.F$2 = f;
        c0503142.I$1 = i6;
        i8 = i5;
        c0503142.I$2 = i8;
        c0503142.label = 3;
        objAwaitPointerEvent = awaitPointerEventScope3.awaitPointerEvent(pointerEventPass2, c0503142);
        if (objAwaitPointerEvent != coroutine_suspended) {
        }
    }
}
