package androidx.compose.material3;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p003ui.input.pointer.PointerEvent;
import androidx.compose.p003ui.input.pointer.PointerEventKt;
import androidx.compose.p003ui.input.pointer.PointerEventPass;
import androidx.compose.p003ui.input.pointer.PointerId;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import androidx.compose.p003ui.input.pointer.PointerType;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.unit.C2046Dp;
import com.blackhub.bronline.game.gui.fractions.Const;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DragGestureDetectorCopy.kt */
@Metadata(m7104d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aa\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f26\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000eH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aW\u0010\u0016\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u0018H\u0082Hø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001e\u0010\u001c\u001a\u00020\u001d*\u00020\u001e2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u001e\u0010!\u001a\u00020\u0005*\u00020\"2\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b#\u0010$\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, m7105d2 = {"defaultTouchSlop", "Landroidx/compose/ui/unit/Dp;", "F", "mouseSlop", "mouseToTouchSlopRatio", "", "awaitHorizontalPointerSlopOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "onPointerSlopReached", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", Const.FRACTION_CONTROL_CHANGE_RANK_OR_REPRIMAND, "overSlop", "", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPointerSlopOrCancellation", "getDragDirectionValue", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "awaitPointerSlopOrCancellation-pn7EDYM", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isPointerUp", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "pointerSlop", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDragGestureDetectorCopy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material3/DragGestureDetectorCopyKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,136:1\n74#1,10:137\n84#1,4:156\n88#1,29:167\n116#2,2:147\n33#2,6:149\n118#2:155\n33#2,6:160\n118#2:166\n116#2,2:196\n33#2,6:198\n118#2:204\n116#2,2:205\n33#2,6:207\n118#2:213\n116#2,2:214\n33#2,6:216\n118#2:222\n164#3:223\n154#3:224\n81#4:225\n*S KotlinDebug\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material3/DragGestureDetectorCopyKt\n*L\n41#1:137,10\n41#1:156,4\n41#1:167,29\n41#1:147,2\n41#1:149,6\n41#1:155\n41#1:160,6\n41#1:166\n83#1:196,2\n83#1:198,6\n83#1:204\n87#1:205,2\n87#1:207,6\n87#1:213\n124#1:214,2\n124#1:216,6\n124#1:222\n126#1:223\n127#1:224\n128#1:225\n*E\n"})
/* loaded from: classes4.dex */
public final class DragGestureDetectorCopyKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x011c -> B:47:0x0127). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x015d -> B:54:0x015f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x017f -> B:47:0x0127). Please report as a decompilation issue!!! */
    @Nullable
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9426awaitHorizontalPointerSlopOrCancellationgDDlDlE(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j, int i, @NotNull Function2<? super PointerInputChange, ? super Float, Unit> function2, @NotNull Continuation<? super PointerInputChange> continuation) throws Throwable {
        C1433x2966ccbb c1433x2966ccbb;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        Ref.LongRef longRef;
        C1433x2966ccbb c1433x2966ccbb2;
        float f;
        float fM11099getXimpl;
        Ref.LongRef longRef2;
        C1433x2966ccbb c1433x2966ccbb3;
        float f2;
        float f3;
        int size;
        int i2;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        Object objAwaitPointerEvent$default;
        if (continuation instanceof C1433x2966ccbb) {
            c1433x2966ccbb = (C1433x2966ccbb) continuation;
            int i3 = c1433x2966ccbb.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1433x2966ccbb.label = i3 - Integer.MIN_VALUE;
            } else {
                c1433x2966ccbb = new C1433x2966ccbb(continuation);
            }
        }
        Object obj = c1433x2966ccbb.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c1433x2966ccbb.label;
        int i5 = 1;
        PointerEventPass pointerEventPass = null;
        if (i4 != 0) {
            if (i4 == 1) {
                float f4 = c1433x2966ccbb.F$1;
                float f5 = c1433x2966ccbb.F$0;
                Ref.LongRef longRef3 = (Ref.LongRef) c1433x2966ccbb.L$2;
                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) c1433x2966ccbb.L$1;
                Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) c1433x2966ccbb.L$0;
                ResultKt.throwOnFailure(obj);
                C1433x2966ccbb c1433x2966ccbb4 = c1433x2966ccbb;
                f3 = f4;
                awaitPointerEventScope2 = awaitPointerEventScope3;
                c1433x2966ccbb3 = c1433x2966ccbb4;
                f2 = f5;
                function22 = function23;
                longRef2 = longRef3;
                PointerEvent pointerEvent = (PointerEvent) obj;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                size = changes.size();
                int i6 = 0;
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                    }
                    i2++;
                }
                Intrinsics.checkNotNull(pointerInputChange);
                pointerInputChange2 = pointerInputChange;
                if (!pointerInputChange2.isConsumed()) {
                }
                return null;
            }
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float f6 = c1433x2966ccbb.F$1;
            float f7 = c1433x2966ccbb.F$0;
            PointerInputChange pointerInputChange4 = (PointerInputChange) c1433x2966ccbb.L$3;
            Ref.LongRef longRef4 = (Ref.LongRef) c1433x2966ccbb.L$2;
            AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) c1433x2966ccbb.L$1;
            Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) c1433x2966ccbb.L$0;
            ResultKt.throwOnFailure(obj);
            fM11099getXimpl = f6;
            awaitPointerEventScope2 = awaitPointerEventScope4;
            longRef2 = longRef4;
            c1433x2966ccbb3 = c1433x2966ccbb;
            f = f7;
            function22 = function24;
            if (!pointerInputChange4.isConsumed()) {
                c1433x2966ccbb2 = c1433x2966ccbb3;
                longRef = longRef2;
                i5 = 1;
                pointerEventPass = null;
                c1433x2966ccbb2.L$0 = function22;
                c1433x2966ccbb2.L$1 = awaitPointerEventScope2;
                c1433x2966ccbb2.L$2 = longRef;
                c1433x2966ccbb2.L$3 = pointerEventPass;
                c1433x2966ccbb2.F$0 = f;
                c1433x2966ccbb2.F$1 = fM11099getXimpl;
                c1433x2966ccbb2.label = i5;
                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, c1433x2966ccbb2, i5, pointerEventPass);
                if (objAwaitPointerEvent$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                float f8 = f;
                f3 = fM11099getXimpl;
                obj = objAwaitPointerEvent$default;
                longRef2 = longRef;
                c1433x2966ccbb3 = c1433x2966ccbb2;
                f2 = f8;
                PointerEvent pointerEvent2 = (PointerEvent) obj;
                List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                size = changes2.size();
                int i62 = 0;
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes2.get(i2);
                    if (PointerId.m12466equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                        break;
                    }
                    i2++;
                }
                Intrinsics.checkNotNull(pointerInputChange);
                pointerInputChange2 = pointerInputChange;
                if (!pointerInputChange2.isConsumed()) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        while (true) {
                            if (i62 >= size2) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes3.get(i62);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i62++;
                        }
                        PointerInputChange pointerInputChange5 = pointerInputChange3;
                        if (pointerInputChange5 != null) {
                            longRef2.element = pointerInputChange5.getId();
                            fM11099getXimpl = f3;
                            f = f2;
                            c1433x2966ccbb2 = c1433x2966ccbb3;
                            longRef = longRef2;
                        }
                    } else {
                        fM11099getXimpl = (Offset.m11099getXimpl(pointerInputChange2.getPosition()) - Offset.m11099getXimpl(pointerInputChange2.getPreviousPosition())) + f3;
                        if (Math.abs(fM11099getXimpl) < f2) {
                            PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                            c1433x2966ccbb3.L$0 = function22;
                            c1433x2966ccbb3.L$1 = awaitPointerEventScope2;
                            c1433x2966ccbb3.L$2 = longRef2;
                            c1433x2966ccbb3.L$3 = pointerInputChange2;
                            c1433x2966ccbb3.F$0 = f2;
                            c1433x2966ccbb3.F$1 = fM11099getXimpl;
                            c1433x2966ccbb3.label = 2;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, c1433x2966ccbb3) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            f = f2;
                            pointerInputChange4 = pointerInputChange2;
                            if (!pointerInputChange4.isConsumed()) {
                            }
                        } else {
                            function22.invoke(pointerInputChange2, Boxing.boxFloat(fM11099getXimpl - (Math.signum(fM11099getXimpl) * f2)));
                            if (pointerInputChange2.isConsumed()) {
                                return pointerInputChange2;
                            }
                            f = f2;
                            c1433x2966ccbb2 = c1433x2966ccbb3;
                            longRef = longRef2;
                            fM11099getXimpl = 0.0f;
                        }
                    }
                    i5 = 1;
                    pointerEventPass = null;
                    c1433x2966ccbb2.L$0 = function22;
                    c1433x2966ccbb2.L$1 = awaitPointerEventScope2;
                    c1433x2966ccbb2.L$2 = longRef;
                    c1433x2966ccbb2.L$3 = pointerEventPass;
                    c1433x2966ccbb2.F$0 = f;
                    c1433x2966ccbb2.F$1 = fM11099getXimpl;
                    c1433x2966ccbb2.label = i5;
                    objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, c1433x2966ccbb2, i5, pointerEventPass);
                    if (objAwaitPointerEvent$default == coroutine_suspended) {
                    }
                }
            }
            return null;
        }
        ResultKt.throwOnFailure(obj);
        if (m9428isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        float fM9429pointerSlopE8SPZFQ = m9429pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        Ref.LongRef longRef5 = new Ref.LongRef();
        longRef5.element = j;
        awaitPointerEventScope2 = awaitPointerEventScope;
        function22 = function2;
        longRef = longRef5;
        c1433x2966ccbb2 = c1433x2966ccbb;
        f = fM9429pointerSlopE8SPZFQ;
        fM11099getXimpl = 0.0f;
        c1433x2966ccbb2.L$0 = function22;
        c1433x2966ccbb2.L$1 = awaitPointerEventScope2;
        c1433x2966ccbb2.L$2 = longRef;
        c1433x2966ccbb2.L$3 = pointerEventPass;
        c1433x2966ccbb2.F$0 = f;
        c1433x2966ccbb2.F$1 = fM11099getXimpl;
        c1433x2966ccbb2.label = i5;
        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, c1433x2966ccbb2, i5, pointerEventPass);
        if (objAwaitPointerEvent$default == coroutine_suspended) {
        }
    }

    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM, reason: not valid java name */
    private static final Object m9427awaitPointerSlopOrCancellationpn7EDYM(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Float, Unit> function2, Function1<? super Offset, Float> function1, Continuation<? super PointerInputChange> continuation) {
        float f;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (m9428isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        float fM9429pointerSlopE8SPZFQ = m9429pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j;
        float f2 = 0.0f;
        while (true) {
            InlineMarker.mark(0);
            Object objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            InlineMarker.mark(1);
            PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    f = f2;
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i2);
                f = f2;
                if (Boolean.valueOf(PointerId.m12466equalsimpl0(pointerInputChange.getId(), longRef.element)).booleanValue()) {
                    break;
                }
                i2++;
                f2 = f;
            }
            Intrinsics.checkNotNull(pointerInputChange);
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i3);
                    if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    i3++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                longRef.element = pointerInputChange4.getId();
            } else {
                float fFloatValue = f + (function1.invoke(Offset.m11088boximpl(pointerInputChange3.getPosition())).floatValue() - function1.invoke(Offset.m11088boximpl(pointerInputChange3.getPreviousPosition())).floatValue());
                if (Math.abs(fFloatValue) < fM9429pointerSlopE8SPZFQ) {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    InlineMarker.mark(0);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
                    InlineMarker.mark(1);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                    f = fFloatValue;
                } else {
                    function2.invoke(pointerInputChange3, Float.valueOf(fFloatValue - (Math.signum(fFloatValue) * fM9429pointerSlopE8SPZFQ)));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    f = 0.0f;
                    f2 = f;
                }
            }
            f2 = f;
        }
    }

    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    private static final boolean m9428isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i);
            if (PointerId.m12466equalsimpl0(pointerInputChange.getId(), j)) {
                break;
            }
            i++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z = true;
        }
        return true ^ z;
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m9429pointerSlopE8SPZFQ(@NotNull ViewConfiguration viewConfiguration, int i) {
        return PointerType.m12556equalsimpl0(i, PointerType.INSTANCE.m12561getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }

    static {
        float fM13666constructorimpl = C2046Dp.m13666constructorimpl((float) 0.125d);
        mouseSlop = fM13666constructorimpl;
        float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(18);
        defaultTouchSlop = fM13666constructorimpl2;
        mouseToTouchSlopRatio = fM13666constructorimpl / fM13666constructorimpl2;
    }
}
