package androidx.compose.foundation.gestures;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p003ui.input.pointer.PointerEvent;
import androidx.compose.p003ui.input.pointer.PointerEventKt;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.constraintlayout.motion.widget.Key;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TransformGestureDetector.kt */
@Metadata(m7104d1 = {"\u00004\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0002*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a\u000f\u0010\u000b\u001a\u00020\u0002*\u00020\u0006¢\u0006\u0002\u0010\f\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u0006\u001a~\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\b2`\u0010\u0013\u001a\\\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00100\u0014H\u0086@¢\u0006\u0002\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, m7105d2 = {"angle", "", "Landroidx/compose/ui/geometry/Offset;", "angle-k-4lQ0M", "(J)F", "calculateCentroid", "Landroidx/compose/ui/input/pointer/PointerEvent;", "useCurrent", "", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)J", "calculateCentroidSize", "calculatePan", "(Landroidx/compose/ui/input/pointer/PointerEvent;)J", "calculateRotation", "calculateZoom", "detectTransformGestures", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "panZoomLock", "onGesture", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "centroid", "pan", "zoom", Key.ROTATION, "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n132#2,3:256\n33#2,4:259\n135#2,2:263\n38#2:265\n137#2:266\n33#2,6:267\n33#2,6:273\n33#2,6:279\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n*L\n116#1:256,3\n116#1:259,4\n116#1:263,2\n116#1:265\n116#1:266\n131#1:267,6\n216#1:273,6\n242#1:279,6\n*E\n"})
/* loaded from: classes2.dex */
public final class TransformGestureDetectorKt {
    public static /* synthetic */ Object detectTransformGestures$default(PointerInputScope pointerInputScope, boolean z, Function4 function4, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return detectTransformGestures(pointerInputScope, z, function4, continuation);
    }

    /* compiled from: TransformGestureDetector.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", m7120f = "TransformGestureDetector.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m7122l = {59, 61}, m7123m = "invokeSuspend", m7124n = {"$this$awaitEachGesture", Key.ROTATION, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$awaitEachGesture", Key.ROTATION, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, m7125s = {"L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"})
    @SourceDebugExtension({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n101#2,2:256\n33#2,6:258\n103#2:264\n33#2,6:265\n101#2,2:271\n33#2,6:273\n103#2:279\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n*L\n62#1:256,2\n62#1:258,6\n62#1:264\n96#1:265,6\n103#1:271,2\n103#1:273,6\n103#1:279\n*E\n"})
    /* renamed from: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2 */
    /* loaded from: classes3.dex */
    public static final class C05022 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function4<Offset, Offset, Float, Float, Unit> $onGesture;
        public final /* synthetic */ boolean $panZoomLock;
        public float F$0;
        public float F$1;
        public float F$2;
        public int I$0;
        public int I$1;
        public long J$0;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05022(boolean z, Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, Continuation<? super C05022> continuation) {
            super(2, continuation);
            this.$panZoomLock = z;
            this.$onGesture = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C05022 c05022 = new C05022(this.$panZoomLock, this.$onGesture, continuation);
            c05022.L$0 = obj;
            return c05022;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C05022) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x016b  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x017d  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0187  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0193  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00bf A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x009e -> B:17:0x00a1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            AwaitPointerEventScope awaitPointerEventScope;
            float f;
            int i;
            int i2;
            float f2;
            long jM11104plusMKHz9U;
            float f3;
            Object objAwaitPointerEvent$default;
            int size;
            int i3;
            int i4;
            float f4;
            char c;
            boolean z;
            int i5;
            int i6;
            int i7;
            int size2;
            int i8;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.label;
            int i10 = 2;
            int i11 = 0;
            int i12 = 1;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                long jM11115getZeroF1C5BW0 = Offset.INSTANCE.m11115getZeroF1C5BW0();
                float touchSlop = awaitPointerEventScope.getViewConfiguration().getTouchSlop();
                this.L$0 = awaitPointerEventScope;
                this.F$0 = 0.0f;
                this.F$1 = 1.0f;
                this.J$0 = jM11115getZeroF1C5BW0;
                this.I$0 = 0;
                this.F$2 = touchSlop;
                this.I$1 = 0;
                this.label = 1;
                if (TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                f = 1.0f;
                i = 0;
                i2 = 0;
                f2 = touchSlop;
                jM11104plusMKHz9U = jM11115getZeroF1C5BW0;
                f3 = 0.0f;
            } else {
                if (i9 != 1) {
                    if (i9 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$1;
                    f2 = this.F$2;
                    i2 = this.I$0;
                    jM11104plusMKHz9U = this.J$0;
                    f = this.F$1;
                    f3 = this.F$0;
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwaitPointerEvent$default = obj;
                    PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent$default;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i3 = i11;
                    while (true) {
                        if (i3 >= size) {
                            i4 = i11;
                            break;
                        }
                        if (changes.get(i3).isConsumed()) {
                            i4 = i12;
                            break;
                        }
                        i3++;
                    }
                    if (i4 != 0) {
                        float fCalculateZoom = TransformGestureDetectorKt.calculateZoom(pointerEvent);
                        float fCalculateRotation = TransformGestureDetectorKt.calculateRotation(pointerEvent);
                        long jCalculatePan = TransformGestureDetectorKt.calculatePan(pointerEvent);
                        if (i2 == 0) {
                            f *= fCalculateZoom;
                            f3 += fCalculateRotation;
                            jM11104plusMKHz9U = Offset.m11104plusMKHz9U(jM11104plusMKHz9U, jCalculatePan);
                            i5 = i;
                            float fCalculateCentroidSize = TransformGestureDetectorKt.calculateCentroidSize(pointerEvent, false);
                            i6 = i2;
                            float fAbs = Math.abs(1 - f) * fCalculateCentroidSize;
                            float fAbs2 = Math.abs(((3.1415927f * f3) * fCalculateCentroidSize) / 180.0f);
                            float fM11097getDistanceimpl = Offset.m11097getDistanceimpl(jM11104plusMKHz9U);
                            if (fAbs > f2 || fAbs2 > f2 || fM11097getDistanceimpl > f2) {
                                i7 = (!this.$panZoomLock || fAbs2 >= f2) ? 0 : 1;
                                i6 = 1;
                            }
                            if (i6 == 0) {
                                long jCalculateCentroid = TransformGestureDetectorKt.calculateCentroid(pointerEvent, false);
                                if (i7 != 0) {
                                    fCalculateRotation = 0.0f;
                                }
                                z = false;
                                if (fCalculateRotation == 0.0f) {
                                    c = 0;
                                    if (fCalculateZoom == 1.0f) {
                                        f4 = f2;
                                        if (!Offset.m11096equalsimpl0(jCalculatePan, Offset.INSTANCE.m11115getZeroF1C5BW0())) {
                                        }
                                        List<PointerInputChange> changes2 = pointerEvent.getChanges();
                                        size2 = changes2.size();
                                        for (i8 = 0; i8 < size2; i8++) {
                                            PointerInputChange pointerInputChange = changes2.get(i8);
                                            if (PointerEventKt.positionChanged(pointerInputChange)) {
                                                pointerInputChange.consume();
                                            }
                                        }
                                    } else {
                                        f4 = f2;
                                    }
                                } else {
                                    f4 = f2;
                                    c = 0;
                                }
                                this.$onGesture.invoke(Offset.m11088boximpl(jCalculateCentroid), Offset.m11088boximpl(jCalculatePan), Boxing.boxFloat(fCalculateZoom), Boxing.boxFloat(fCalculateRotation));
                                List<PointerInputChange> changes22 = pointerEvent.getChanges();
                                size2 = changes22.size();
                                while (i8 < size2) {
                                }
                            } else {
                                f4 = f2;
                                c = 0;
                                z = false;
                            }
                            i = i7;
                            i2 = i6;
                        } else {
                            i5 = i;
                            i6 = i2;
                        }
                        i7 = i5;
                        if (i6 == 0) {
                        }
                        i = i7;
                        i2 = i6;
                    } else {
                        f4 = f2;
                        c = 0;
                        z = false;
                    }
                    if (i4 == 0) {
                        List<PointerInputChange> changes3 = pointerEvent.getChanges();
                        int size3 = changes3.size();
                        for (int i13 = 0; i13 < size3; i13++) {
                            if (changes3.get(i13).getPressed()) {
                                f2 = f4;
                                i10 = 2;
                                i11 = 0;
                                i12 = 1;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                i = this.I$1;
                f2 = this.F$2;
                i2 = this.I$0;
                jM11104plusMKHz9U = this.J$0;
                f = this.F$1;
                f3 = this.F$0;
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            this.L$0 = awaitPointerEventScope;
            this.F$0 = f3;
            this.F$1 = f;
            this.J$0 = jM11104plusMKHz9U;
            this.I$0 = i2;
            this.F$2 = f2;
            this.I$1 = i;
            this.label = i10;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, this, i12, null);
            if (objAwaitPointerEvent$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            PointerEvent pointerEvent2 = (PointerEvent) objAwaitPointerEvent$default;
            List<PointerInputChange> changes4 = pointerEvent2.getChanges();
            size = changes4.size();
            i3 = i11;
            while (true) {
                if (i3 >= size) {
                }
                i3++;
            }
            if (i4 != 0) {
            }
            if (i4 == 0) {
            }
            return Unit.INSTANCE;
        }
    }

    @Nullable
    public static final Object detectTransformGestures(@NotNull PointerInputScope pointerInputScope, boolean z, @NotNull Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, @NotNull Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C05022(z, function4, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    public static final float calculateRotation(@NotNull PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        if (i2 < 2) {
            return 0.0f;
        }
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        long jCalculateCentroid2 = calculateCentroid(pointerEvent, false);
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i4 = 0; i4 < size2; i4++) {
            PointerInputChange pointerInputChange2 = changes2.get(i4);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long position = pointerInputChange2.getPosition();
                long jM11103minusMKHz9U = Offset.m11103minusMKHz9U(pointerInputChange2.getPreviousPosition(), jCalculateCentroid2);
                long jM11103minusMKHz9U2 = Offset.m11103minusMKHz9U(position, jCalculateCentroid);
                float fM7979anglek4lQ0M = m7979anglek4lQ0M(jM11103minusMKHz9U2) - m7979anglek4lQ0M(jM11103minusMKHz9U);
                float fM11097getDistanceimpl = Offset.m11097getDistanceimpl(Offset.m11104plusMKHz9U(jM11103minusMKHz9U2, jM11103minusMKHz9U)) / 2.0f;
                if (fM7979anglek4lQ0M > 180.0f) {
                    fM7979anglek4lQ0M -= 360.0f;
                } else if (fM7979anglek4lQ0M < -180.0f) {
                    fM7979anglek4lQ0M += 360.0f;
                }
                f2 += fM7979anglek4lQ0M * fM11097getDistanceimpl;
                f += fM11097getDistanceimpl;
            }
        }
        if (f == 0.0f) {
            return 0.0f;
        }
        return f2 / f;
    }

    /* renamed from: angle-k-4lQ0M, reason: not valid java name */
    private static final float m7979anglek4lQ0M(long j) {
        if (Offset.m11099getXimpl(j) == 0.0f && Offset.m11100getYimpl(j) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Offset.m11099getXimpl(j), Offset.m11100getYimpl(j)))) * 180.0f) / 3.1415927f;
    }

    public static final float calculateZoom(@NotNull PointerEvent pointerEvent) {
        float fCalculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float fCalculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (fCalculateCentroidSize == 0.0f || fCalculateCentroidSize2 == 0.0f) {
            return 1.0f;
        }
        return fCalculateCentroidSize / fCalculateCentroidSize2;
    }

    public static final long calculatePan(@NotNull PointerEvent pointerEvent) {
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        Offset.Companion companion = Offset.INSTANCE;
        if (Offset.m11096equalsimpl0(jCalculateCentroid, companion.m11114getUnspecifiedF1C5BW0())) {
            return companion.m11115getZeroF1C5BW0();
        }
        return Offset.m11103minusMKHz9U(jCalculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static /* synthetic */ float calculateCentroidSize$default(PointerEvent pointerEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return calculateCentroidSize(pointerEvent, z);
    }

    public static final float calculateCentroidSize(@NotNull PointerEvent pointerEvent, boolean z) {
        long jCalculateCentroid = calculateCentroid(pointerEvent, z);
        float fM11097getDistanceimpl = 0.0f;
        if (Offset.m11096equalsimpl0(jCalculateCentroid, Offset.INSTANCE.m11114getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = changes.get(i2);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                fM11097getDistanceimpl += Offset.m11097getDistanceimpl(Offset.m11103minusMKHz9U(z ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition(), jCalculateCentroid));
                i++;
            }
        }
        return fM11097getDistanceimpl / i;
    }

    public static /* synthetic */ long calculateCentroid$default(PointerEvent pointerEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return calculateCentroid(pointerEvent, z);
    }

    public static final long calculateCentroid(@NotNull PointerEvent pointerEvent, boolean z) {
        long jM11115getZeroF1C5BW0 = Offset.INSTANCE.m11115getZeroF1C5BW0();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = changes.get(i2);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                jM11115getZeroF1C5BW0 = Offset.m11104plusMKHz9U(jM11115getZeroF1C5BW0, z ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition());
                i++;
            }
        }
        if (i == 0) {
            return Offset.INSTANCE.m11114getUnspecifiedF1C5BW0();
        }
        return Offset.m11094divtuRUvjQ(jM11115getZeroF1C5BW0, i);
    }
}
