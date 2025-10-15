package androidx.compose.foundation.gestures;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p003ui.input.pointer.PointerEvent;
import androidx.compose.p003ui.input.pointer.PointerEventKt;
import androidx.compose.p003ui.input.pointer.PointerEventPass;
import androidx.compose.p003ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.p003ui.input.pointer.PointerId;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.p003ui.input.pointer.PointerType;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.unit.C2046Dp;
import com.blackhub.bronline.game.gui.fractions.Const;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.arj.ArjArchiveInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DragGestureDetector.kt */
@Metadata(m7104d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u0015\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u0017H\u0082Hø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001b\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0014\u001aa\u0010\u001d\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f26\u0010 \u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\r¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&0!H\u0080@ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aY\u0010)\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u001226\u0010*\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\r¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&0!H\u0086@ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a!\u0010-\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b.\u0010\u0014\u001aK\u0010/\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u00012\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020&0!H\u0080Hø\u0001\u0000¢\u0006\u0004\b2\u00103\u001aY\u00104\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u001226\u0010*\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&0!H\u0086@ø\u0001\u0000¢\u0006\u0004\b5\u0010,\u001a!\u00106\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b7\u0010\u0014\u001aa\u00108\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f26\u0010*\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\r¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&0!H\u0080@ø\u0001\u0000¢\u0006\u0004\b9\u0010(\u001aY\u0010:\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u001226\u0010*\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\r¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&0!H\u0086@ø\u0001\u0000¢\u0006\u0004\b;\u0010,\u001a\u0080\u0001\u0010<\u001a\u00020&*\u00020=2\u0014\b\u0002\u0010>\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020&0\u00172\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020&0@2\u000e\b\u0002\u0010A\u001a\b\u0012\u0004\u0012\u00020&0@26\u0010B\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020&0!H\u0086@¢\u0006\u0002\u0010D\u001a\u0080\u0001\u0010E\u001a\u00020&*\u00020=2\u0014\b\u0002\u0010>\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020&0\u00172\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020&0@2\u000e\b\u0002\u0010A\u001a\b\u0012\u0004\u0012\u00020&0@26\u0010B\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020&0!H\u0086@¢\u0006\u0002\u0010D\u001a\u0080\u0001\u0010F\u001a\u00020&*\u00020=2\u0014\b\u0002\u0010>\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020&0\u00172\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020&0@2\u000e\b\u0002\u0010A\u001a\b\u0012\u0004\u0012\u00020&0@26\u0010G\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\r¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020&0!H\u0086@¢\u0006\u0002\u0010D\u001a\u0080\u0001\u0010H\u001a\u00020&*\u00020=2\u0014\b\u0002\u0010>\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020&0\u00172\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020&0@2\u000e\b\u0002\u0010A\u001a\b\u0012\u0004\u0012\u00020&0@26\u0010I\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\r¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020&0!H\u0086@¢\u0006\u0002\u0010D\u001a3\u0010J\u001a\u00020\u0018*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020&0\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\bK\u0010\u001a\u001a]\u0010J\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020&0\u00172\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u00172\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u0017H\u0080Hø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a3\u0010O\u001a\u00020\u0018*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020&0\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\bP\u0010\u001a\u001a\u001e\u0010Q\u001a\u00020\u0018*\u00020R2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\bS\u0010T\u001a\u001e\u0010U\u001a\u00020\r*\u00020V2\u0006\u0010\u001e\u001a\u00020\u001fH\u0000ø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a\f\u0010Y\u001a\u00020\u0001*\u00020ZH\u0000\u001a3\u0010[\u001a\u00020\u0018*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020&0\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b\\\u0010\u001a\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n\"\u0010\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n\"\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006]"}, m7105d2 = {"BidirectionalPointerDirectionConfig", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "getBidirectionalPointerDirectionConfig", "()Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "HorizontalPointerDirectionConfig", "getHorizontalPointerDirectionConfig", "VerticalPointerDirectionConfig", "getVerticalPointerDirectionConfig", "defaultTouchSlop", "Landroidx/compose/ui/unit/Dp;", "F", "mouseSlop", "mouseToTouchSlopRatio", "", "awaitDragOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "awaitDragOrCancellation-rnUCldI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDragOrUp", "hasDragged", "Lkotlin/Function1;", "", "awaitDragOrUp-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHorizontalDragOrCancellation", "awaitHorizontalDragOrCancellation-rnUCldI", "awaitHorizontalPointerSlopOrCancellation", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "onPointerSlopReached", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", Const.FRACTION_CONTROL_CHANGE_RANK_OR_REPRIMAND, "overSlop", "", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHorizontalTouchSlopOrCancellation", "onTouchSlopReached", "awaitHorizontalTouchSlopOrCancellation-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitLongPressOrCancellation", "awaitLongPressOrCancellation-rnUCldI", "awaitPointerSlopOrCancellation", "pointerDirectionConfig", "Landroidx/compose/ui/geometry/Offset;", "awaitPointerSlopOrCancellation-pn7EDYM", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILandroidx/compose/foundation/gestures/PointerDirectionConfig;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitTouchSlopOrCancellation", "awaitTouchSlopOrCancellation-jO51t88", "awaitVerticalDragOrCancellation", "awaitVerticalDragOrCancellation-rnUCldI", "awaitVerticalPointerSlopOrCancellation", "awaitVerticalPointerSlopOrCancellation-gDDlDlE", "awaitVerticalTouchSlopOrCancellation", "awaitVerticalTouchSlopOrCancellation-jO51t88", "detectDragGestures", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDragStart", "onDragEnd", "Lkotlin/Function0;", "onDragCancel", "onDrag", "dragAmount", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectDragGesturesAfterLongPress", "detectHorizontalDragGestures", "onHorizontalDrag", "detectVerticalDragGestures", "onVerticalDrag", "drag", "drag-jO51t88", "motionConsumed", "drag-VnAYq1g", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "horizontalDrag", "horizontalDrag-jO51t88", "isPointerUp", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "pointerSlop", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "toPointerDirectionConfig", "Landroidx/compose/foundation/gestures/Orientation;", "verticalDrag", "verticalDrag-jO51t88", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,875:1\n659#1,10:876\n669#1,4:895\n673#1,38:906\n613#1,4:944\n617#1,2:957\n619#1,8:966\n659#1,10:974\n669#1,4:993\n673#1,38:1004\n659#1,10:1042\n669#1,4:1061\n673#1,38:1072\n579#1,6:1110\n613#1,4:1116\n617#1,2:1129\n619#1,8:1138\n586#1,10:1146\n613#1,4:1156\n617#1,2:1169\n619#1,8:1178\n659#1,10:1186\n669#1,4:1205\n673#1,38:1216\n659#1,10:1254\n669#1,4:1273\n673#1,38:1284\n579#1,6:1322\n613#1,4:1328\n617#1,2:1341\n619#1,8:1350\n586#1,10:1358\n613#1,4:1368\n617#1,2:1381\n619#1,8:1390\n613#1,4:1398\n617#1,2:1411\n619#1,8:1420\n613#1,4:1428\n617#1,2:1441\n619#1,8:1450\n116#2,2:886\n33#2,6:888\n118#2:894\n33#2,6:899\n118#2:905\n116#2,2:948\n33#2,6:950\n118#2:956\n33#2,6:959\n118#2:965\n116#2,2:984\n33#2,6:986\n118#2:992\n33#2,6:997\n118#2:1003\n116#2,2:1052\n33#2,6:1054\n118#2:1060\n33#2,6:1065\n118#2:1071\n116#2,2:1120\n33#2,6:1122\n118#2:1128\n33#2,6:1131\n118#2:1137\n116#2,2:1160\n33#2,6:1162\n118#2:1168\n33#2,6:1171\n118#2:1177\n116#2,2:1196\n33#2,6:1198\n118#2:1204\n33#2,6:1209\n118#2:1215\n116#2,2:1264\n33#2,6:1266\n118#2:1272\n33#2,6:1277\n118#2:1283\n116#2,2:1332\n33#2,6:1334\n118#2:1340\n33#2,6:1343\n118#2:1349\n116#2,2:1372\n33#2,6:1374\n118#2:1380\n33#2,6:1383\n118#2:1389\n116#2,2:1402\n33#2,6:1404\n118#2:1410\n33#2,6:1413\n118#2:1419\n116#2,2:1432\n33#2,6:1434\n118#2:1440\n33#2,6:1443\n118#2:1449\n116#2,2:1458\n33#2,6:1460\n118#2:1466\n116#2,2:1467\n33#2,6:1469\n118#2:1475\n116#2,2:1476\n33#2,6:1478\n118#2:1484\n116#2,2:1485\n33#2,6:1487\n118#2:1493\n116#2,2:1494\n33#2,6:1496\n118#2:1502\n116#2,2:1503\n33#2,6:1505\n118#2:1511\n116#2,2:1512\n33#2,6:1514\n118#2:1520\n116#2,2:1521\n33#2,6:1523\n118#2:1529\n164#3:1530\n154#3:1531\n81#4:1532\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n*L\n78#1:876,10\n78#1:895,4\n78#1:906,38\n142#1:944,4\n142#1:957,2\n142#1:966,8\n287#1:974,10\n287#1:993,4\n287#1:1004,38\n298#1:1042,10\n298#1:1061,4\n298#1:1072,38\n324#1:1110,6\n324#1:1116,4\n324#1:1129,2\n324#1:1138,8\n324#1:1146,10\n354#1:1156,4\n354#1:1169,2\n354#1:1178,8\n438#1:1186,10\n438#1:1205,4\n438#1:1216,38\n449#1:1254,10\n449#1:1273,4\n449#1:1284,38\n472#1:1322,6\n472#1:1328,4\n472#1:1341,2\n472#1:1350,8\n472#1:1358,10\n502#1:1368,4\n502#1:1381,2\n502#1:1390,8\n584#1:1398,4\n584#1:1411,2\n584#1:1420,8\n584#1:1428,4\n584#1:1441,2\n584#1:1450,8\n78#1:886,2\n78#1:888,6\n78#1:894\n78#1:899,6\n78#1:905\n142#1:948,2\n142#1:950,6\n142#1:956\n142#1:959,6\n142#1:965\n287#1:984,2\n287#1:986,6\n287#1:992\n287#1:997,6\n287#1:1003\n298#1:1052,2\n298#1:1054,6\n298#1:1060\n298#1:1065,6\n298#1:1071\n324#1:1120,2\n324#1:1122,6\n324#1:1128\n324#1:1131,6\n324#1:1137\n354#1:1160,2\n354#1:1162,6\n354#1:1168\n354#1:1171,6\n354#1:1177\n438#1:1196,2\n438#1:1198,6\n438#1:1204\n438#1:1209,6\n438#1:1215\n449#1:1264,2\n449#1:1266,6\n449#1:1272\n449#1:1277,6\n449#1:1283\n472#1:1332,2\n472#1:1334,6\n472#1:1340\n472#1:1343,6\n472#1:1349\n502#1:1372,2\n502#1:1374,6\n502#1:1380\n502#1:1383,6\n502#1:1389\n584#1:1402,2\n584#1:1404,6\n584#1:1410\n584#1:1413,6\n584#1:1419\n584#1:1432,2\n584#1:1434,6\n584#1:1440\n584#1:1443,6\n584#1:1449\n616#1:1458,2\n616#1:1460,6\n616#1:1466\n618#1:1467,2\n618#1:1469,6\n618#1:1475\n668#1:1476,2\n668#1:1478,6\n668#1:1484\n672#1:1485,2\n672#1:1487,6\n672#1:1493\n668#1:1494,2\n668#1:1496,6\n668#1:1502\n672#1:1503,2\n672#1:1505,6\n672#1:1511\n802#1:1512,2\n802#1:1514,6\n802#1:1520\n855#1:1521,2\n855#1:1523,6\n855#1:1529\n861#1:1530\n862#1:1531\n863#1:1532\n*E\n"})
/* loaded from: classes2.dex */
public final class DragGestureDetectorKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    @NotNull
    private static final PointerDirectionConfig HorizontalPointerDirectionConfig = new PointerDirectionConfig() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$HorizontalPointerDirectionConfig$1
        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculateDeltaChange-k-4lQ0M */
        public float mo7914calculateDeltaChangek4lQ0M(long offset) {
            return Math.abs(Offset.m11099getXimpl(offset));
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculatePostSlopOffset-8S9VItk */
        public long mo7915calculatePostSlopOffset8S9VItk(long totalPositionChange, float touchSlop) {
            return OffsetKt.Offset(Offset.m11099getXimpl(totalPositionChange) - (Math.signum(Offset.m11099getXimpl(totalPositionChange)) * touchSlop), Offset.m11100getYimpl(totalPositionChange));
        }
    };

    @NotNull
    private static final PointerDirectionConfig VerticalPointerDirectionConfig = new PointerDirectionConfig() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$VerticalPointerDirectionConfig$1
        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculateDeltaChange-k-4lQ0M */
        public float mo7914calculateDeltaChangek4lQ0M(long offset) {
            return Math.abs(Offset.m11100getYimpl(offset));
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculatePostSlopOffset-8S9VItk */
        public long mo7915calculatePostSlopOffset8S9VItk(long totalPositionChange, float touchSlop) {
            return OffsetKt.Offset(Offset.m11099getXimpl(totalPositionChange), Offset.m11100getYimpl(totalPositionChange) - (Math.signum(Offset.m11100getYimpl(totalPositionChange)) * touchSlop));
        }
    };

    @NotNull
    private static final PointerDirectionConfig BidirectionalPointerDirectionConfig = new PointerDirectionConfig() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$BidirectionalPointerDirectionConfig$1
        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculateDeltaChange-k-4lQ0M, reason: not valid java name */
        public float mo7914calculateDeltaChangek4lQ0M(long offset) {
            return Offset.m11097getDistanceimpl(offset);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculatePostSlopOffset-8S9VItk, reason: not valid java name */
        public long mo7915calculatePostSlopOffset8S9VItk(long totalPositionChange, float touchSlop) {
            return Offset.m11103minusMKHz9U(totalPositionChange, Offset.m11106timestuRUvjQ(Offset.m11094divtuRUvjQ(totalPositionChange, mo7914calculateDeltaChangek4lQ0M(totalPositionChange)), touchSlop));
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:111:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00de  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x0139 -> B:92:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x017d -> B:128:0x0184). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:137:0x01a6 -> B:132:0x018e). Please report as a decompilation issue!!! */
    @Nullable
    /* renamed from: awaitTouchSlopOrCancellation-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7903awaitTouchSlopOrCancellationjO51t88(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j, @NotNull Function2<? super PointerInputChange, ? super Offset, Unit> function2, @NotNull Continuation<? super PointerInputChange> continuation) throws Throwable {
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
        PointerDirectionConfig pointerDirectionConfig;
        Ref.LongRef longRef;
        float f;
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
        long jM11115getZeroF1C5BW0;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2<? super PointerInputChange, ? super Offset, Unit> function22;
        Ref.LongRef longRef2;
        PointerDirectionConfig pointerDirectionConfig2;
        long j2;
        int size;
        int i;
        long j3;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        int i2;
        Object objAwaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) continuation;
            int i3 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label = i3 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitTouchSlopOrCancellation$1(continuation);
            }
        }
        Object obj = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
        int i5 = 1;
        PointerEventPass pointerEventPass = null;
        if (i4 != 0) {
            if (i4 == 1) {
                long j4 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.J$0;
                f = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0;
                Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3;
                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2;
                pointerDirectionConfig2 = (PointerDirectionConfig) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1;
                Function2<? super PointerInputChange, ? super Offset, Unit> function23 = (Function2) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0;
                ResultKt.throwOnFailure(obj);
                longRef2 = longRef3;
                awaitPointerEventScope2 = awaitPointerEventScope3;
                j2 = j4;
                function22 = function23;
                PointerEvent pointerEvent = (PointerEvent) obj;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                size = changes.size();
                int i6 = 0;
                i = 0;
                while (true) {
                    if (i < size) {
                    }
                    i = i2 + 1;
                    j2 = j3;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 != null) {
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    }
                }
                return null;
            }
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j5 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.J$0;
            f = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0;
            pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4;
            Ref.LongRef longRef4 = (Ref.LongRef) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3;
            AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2;
            PointerDirectionConfig pointerDirectionConfig3 = (PointerDirectionConfig) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1;
            Function2<? super PointerInputChange, ? super Offset, Unit> function24 = (Function2) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0;
            ResultKt.throwOnFailure(obj);
            char c = 2;
            DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
            jM11115getZeroF1C5BW0 = j5;
            awaitPointerEventScope2 = awaitPointerEventScope4;
            function22 = function24;
            longRef = longRef4;
            pointerDirectionConfig = pointerDirectionConfig3;
            if (!pointerInputChange2.isConsumed()) {
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                i5 = 1;
                pointerEventPass = null;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = longRef;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i5;
                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i5, pointerEventPass);
                if (objAwaitPointerEvent$default != coroutine_suspended) {
                    return coroutine_suspended;
                }
                long j6 = jM11115getZeroF1C5BW0;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
                obj = objAwaitPointerEvent$default;
                longRef2 = longRef;
                pointerDirectionConfig2 = pointerDirectionConfig;
                j2 = j6;
                PointerEvent pointerEvent2 = (PointerEvent) obj;
                List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                size = changes2.size();
                int i62 = 0;
                i = 0;
                while (true) {
                    if (i < size) {
                        j3 = j2;
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes2.get(i);
                    j3 = j2;
                    i2 = i;
                    if (PointerId.m12466equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                        break;
                    }
                    i = i2 + 1;
                    j2 = j3;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
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
                        PointerInputChange pointerInputChange4 = pointerInputChange3;
                        if (pointerInputChange4 != null) {
                            longRef2.element = pointerInputChange4.getId();
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                            pointerDirectionConfig = pointerDirectionConfig2;
                            longRef = longRef2;
                            i5 = 1;
                            pointerEventPass = null;
                            jM11115getZeroF1C5BW0 = j3;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = longRef;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i5;
                            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i5, pointerEventPass);
                            if (objAwaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                    } else {
                        long jM11104plusMKHz9U = Offset.m11104plusMKHz9U(j3, Offset.m11103minusMKHz9U(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition()));
                        if (pointerDirectionConfig2.mo7914calculateDeltaChangek4lQ0M(jM11104plusMKHz9U) < f) {
                            PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0 = function22;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1 = pointerDirectionConfig2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3 = longRef2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4 = pointerInputChange2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0 = f;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.J$0 = jM11104plusMKHz9U;
                            c = 2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label = 2;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitTouchSlopOrCancellation$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            pointerDirectionConfig = pointerDirectionConfig2;
                            longRef = longRef2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                            jM11115getZeroF1C5BW0 = jM11104plusMKHz9U;
                            if (!pointerInputChange2.isConsumed()) {
                            }
                        } else {
                            function22.invoke(pointerInputChange2, Offset.m11088boximpl(pointerDirectionConfig2.mo7915calculatePostSlopOffset8S9VItk(jM11104plusMKHz9U, f)));
                            if (pointerInputChange2.isConsumed()) {
                                return pointerInputChange2;
                            }
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                            jM11115getZeroF1C5BW0 = Offset.INSTANCE.m11115getZeroF1C5BW0();
                            pointerDirectionConfig = pointerDirectionConfig2;
                            longRef = longRef2;
                            i5 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = longRef;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i5;
                            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i5, pointerEventPass);
                            if (objAwaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                    }
                }
            }
            return null;
        }
        ResultKt.throwOnFailure(obj);
        int iM12563getTouchT8wyACA = PointerType.INSTANCE.m12563getTouchT8wyACA();
        PointerDirectionConfig pointerDirectionConfig4 = BidirectionalPointerDirectionConfig;
        if (m7911isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        float fM7912pointerSlopE8SPZFQ = m7912pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), iM12563getTouchT8wyACA);
        Ref.LongRef longRef5 = new Ref.LongRef();
        longRef5.element = j;
        pointerDirectionConfig = pointerDirectionConfig4;
        longRef = longRef5;
        f = fM7912pointerSlopE8SPZFQ;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
        jM11115getZeroF1C5BW0 = Offset.INSTANCE.m11115getZeroF1C5BW0();
        awaitPointerEventScope2 = awaitPointerEventScope;
        function22 = function2;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = longRef;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i5;
        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i5, pointerEventPass);
        if (objAwaitPointerEvent$default != coroutine_suspended) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0056  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0049 -> B:45:0x004c). Please report as a decompilation issue!!! */
    @Nullable
    /* renamed from: drag-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7909dragjO51t88(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j, @NotNull Function1<? super PointerInputChange, Unit> function1, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        DragGestureDetectorKt$drag$1 dragGestureDetectorKt$drag$1;
        PointerInputChange pointerInputChange;
        if (continuation instanceof DragGestureDetectorKt$drag$1) {
            dragGestureDetectorKt$drag$1 = (DragGestureDetectorKt$drag$1) continuation;
            int i = dragGestureDetectorKt$drag$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$1.label = i - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$drag$1 = new DragGestureDetectorKt$drag$1(continuation);
            }
        }
        Object objM7895awaitDragOrCancellationrnUCldI = dragGestureDetectorKt$drag$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dragGestureDetectorKt$drag$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM7895awaitDragOrCancellationrnUCldI);
            dragGestureDetectorKt$drag$1.L$0 = awaitPointerEventScope;
            dragGestureDetectorKt$drag$1.L$1 = function1;
            dragGestureDetectorKt$drag$1.label = 1;
            objM7895awaitDragOrCancellationrnUCldI = m7895awaitDragOrCancellationrnUCldI(awaitPointerEventScope, j, dragGestureDetectorKt$drag$1);
            if (objM7895awaitDragOrCancellationrnUCldI == coroutine_suspended) {
            }
            pointerInputChange = (PointerInputChange) objM7895awaitDragOrCancellationrnUCldI;
            if (pointerInputChange == null) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Function1<? super PointerInputChange, Unit> function12 = (Function1) dragGestureDetectorKt$drag$1.L$1;
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorKt$drag$1.L$0;
            ResultKt.throwOnFailure(objM7895awaitDragOrCancellationrnUCldI);
            function1 = function12;
            awaitPointerEventScope = awaitPointerEventScope2;
            pointerInputChange = (PointerInputChange) objM7895awaitDragOrCancellationrnUCldI;
            if (pointerInputChange == null) {
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    return Boxing.boxBoolean(true);
                }
                function1.invoke(pointerInputChange);
                j = pointerInputChange.getId();
                dragGestureDetectorKt$drag$1.L$0 = awaitPointerEventScope;
                dragGestureDetectorKt$drag$1.L$1 = function1;
                dragGestureDetectorKt$drag$1.label = 1;
                objM7895awaitDragOrCancellationrnUCldI = m7895awaitDragOrCancellationrnUCldI(awaitPointerEventScope, j, dragGestureDetectorKt$drag$1);
                if (objM7895awaitDragOrCancellationrnUCldI == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pointerInputChange = (PointerInputChange) objM7895awaitDragOrCancellationrnUCldI;
                if (pointerInputChange == null) {
                    return Boxing.boxBoolean(false);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00cb, code lost:
    
        if (androidx.compose.p003ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r11) != false) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0099  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0068 -> B:81:0x006d). Please report as a decompilation issue!!! */
    @Nullable
    /* renamed from: awaitDragOrCancellation-rnUCldI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7895awaitDragOrCancellationrnUCldI(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j, @NotNull Continuation<? super PointerInputChange> continuation) throws Throwable {
        DragGestureDetectorKt$awaitDragOrCancellation$1 dragGestureDetectorKt$awaitDragOrCancellation$1;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object objAwaitPointerEvent$default;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$awaitDragOrCancellation$1) {
            dragGestureDetectorKt$awaitDragOrCancellation$1 = (DragGestureDetectorKt$awaitDragOrCancellation$1) continuation;
            int i = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitDragOrCancellation$1.label = i - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitDragOrCancellation$1 = new DragGestureDetectorKt$awaitDragOrCancellation$1(continuation);
            }
        }
        Object obj = dragGestureDetectorKt$awaitDragOrCancellation$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitDragOrCancellation$1.L$1;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitDragOrCancellation$1.L$0;
            ResultKt.throwOnFailure(obj);
            Ref.LongRef longRef3 = longRef2;
            awaitPointerEventScope2 = awaitPointerEventScope3;
            PointerEvent pointerEvent = (PointerEvent) obj;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 < size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i4);
                if (PointerId.m12466equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                    break;
                }
                i4++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null) {
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    while (true) {
                        if (i3 >= size2) {
                            pointerInputChange2 = null;
                            break;
                        }
                        pointerInputChange2 = changes2.get(i3);
                        if (pointerInputChange2.getPressed()) {
                            break;
                        }
                        i3++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange2;
                    if (pointerInputChange4 != null) {
                        longRef3.element = pointerInputChange4.getId();
                        longRef = longRef3;
                    }
                }
                dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = longRef;
                dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitDragOrCancellation$1, 1, null);
                if (objAwaitPointerEvent$default != coroutine_suspended) {
                    return coroutine_suspended;
                }
                Ref.LongRef longRef4 = longRef;
                obj = objAwaitPointerEvent$default;
                longRef3 = longRef4;
                PointerEvent pointerEvent2 = (PointerEvent) obj;
                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                int size3 = changes3.size();
                int i32 = 0;
                int i42 = 0;
                while (true) {
                    if (i42 < size3) {
                    }
                    i42++;
                }
                PointerInputChange pointerInputChange32 = pointerInputChange;
                if (pointerInputChange32 == null) {
                    pointerInputChange32 = null;
                }
            }
            if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                return null;
            }
            return pointerInputChange32;
        }
        ResultKt.throwOnFailure(obj);
        if (m7911isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        longRef = new Ref.LongRef();
        longRef.element = j;
        awaitPointerEventScope2 = awaitPointerEventScope;
        dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = longRef;
        dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitDragOrCancellation$1, 1, null);
        if (objAwaitPointerEvent$default != coroutine_suspended) {
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$2 */
    /* loaded from: classes4.dex */
    public static final class C04482 extends Lambda implements Function1<Offset, Unit> {
        public static final C04482 INSTANCE = ;

        /* renamed from: invoke-k-4lQ0M */
        public final void m7916invokek4lQ0M(long j) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            m7916invokek4lQ0M(offset.getPackedValue());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$3 */
    /* loaded from: classes4.dex */
    public static final class C04493 extends Lambda implements Function0<Unit> {
        public static final C04493 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = C04482.INSTANCE;
        }
        Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = C04493.INSTANCE;
        }
        Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = C04504.INSTANCE;
        }
        return detectDragGestures(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$4 */
    /* loaded from: classes4.dex */
    public static final class C04504 extends Lambda implements Function0<Unit> {
        public static final C04504 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", m7120f = "DragGestureDetector.kt", m7121i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, m7122l = {HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, 884, 926, 192}, m7123m = "invokeSuspend", m7124n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointerDirectionConfig$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointerDirectionConfig$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, m7125s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "F$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "F$0", "J$0"})
    @SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5\n+ 2 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,875:1\n659#2,10:876\n669#2,4:895\n673#2,38:906\n116#3,2:886\n33#3,6:888\n118#3:894\n33#3,6:899\n118#3:905\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5\n*L\n179#1:876,10\n179#1:895,4\n179#1:906,38\n179#1:886,2\n179#1:888,6\n179#1:894\n179#1:899,6\n179#1:905\n*E\n"})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5 */
    /* loaded from: classes3.dex */
    public static final class C04515 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
        public final /* synthetic */ Function0<Unit> $onDragCancel;
        public final /* synthetic */ Function0<Unit> $onDragEnd;
        public final /* synthetic */ Function1<Offset, Unit> $onDragStart;
        public float F$0;
        public long J$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04515(Function1<? super Offset, Unit> function1, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super C04515> continuation) {
            super(2, continuation);
            this.$onDragStart = function1;
            this.$onDrag = function2;
            this.$onDragCancel = function0;
            this.$onDragEnd = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C04515 c04515 = new C04515(this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, continuation);
            c04515.L$0 = obj;
            return c04515;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04515) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:120:0x014f, B:121:0x0156], limit reached: 81 */
        /* JADX WARN: Path cross not found for [B:124:0x015d, B:120:0x014f], limit reached: 81 */
        /* JADX WARN: Removed duplicated region for block: B:106:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x010d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:113:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x0196  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x01d7  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x01da  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x01f4  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x0204  */
        /* JADX WARN: Removed duplicated region for block: B:162:0x0248  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x024e  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x0143 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v3 */
        /* JADX WARN: Type inference failed for: r12v4 */
        /* JADX WARN: Type inference failed for: r12v6, types: [androidx.compose.ui.input.pointer.PointerEventPass, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r12v8 */
        /* JADX WARN: Type inference failed for: r12v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x00d7 -> B:151:0x01f2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x014f -> B:151:0x01f2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x01d0 -> B:144:0x01d1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x01f1 -> B:151:0x01f2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x0256 -> B:108:0x00f3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            AwaitPointerEventScope awaitPointerEventScope;
            Object objAwaitFirstDown$default;
            PointerInputChange pointerInputChange;
            Ref.LongRef longRef;
            Object objAwaitPointerEvent$default;
            Ref.LongRef longRef2;
            AwaitPointerEventScope awaitPointerEventScope2;
            PointerDirectionConfig bidirectionalPointerDirectionConfig;
            float fM7912pointerSlopE8SPZFQ;
            long jM11104plusMKHz9U;
            List<PointerInputChange> changes;
            int size;
            int i;
            Object obj2;
            AwaitPointerEventScope awaitPointerEventScope3;
            PointerInputChange pointerInputChange2;
            PointerInputChange pointerInputChange3;
            Object obj3;
            char c;
            PointerInputChange pointerInputChange4;
            List<PointerInputChange> list;
            long id;
            Object objM7909dragjO51t88;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            char c2 = 3;
            int i3 = 2;
            int i4 = 1;
            ?? r12 = 0;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                objAwaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
                if (objAwaitFirstDown$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 == 1) {
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = awaitPointerEventScope4;
                objAwaitFirstDown$default = obj;
            } else {
                if (i2 == 2) {
                    long j = this.J$0;
                    float f = this.F$0;
                    Ref.LongRef longRef3 = (Ref.LongRef) this.L$5;
                    PointerDirectionConfig pointerDirectionConfig = (PointerDirectionConfig) this.L$4;
                    AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) this.L$3;
                    Ref.LongRef longRef4 = (Ref.LongRef) this.L$2;
                    PointerInputChange pointerInputChange5 = (PointerInputChange) this.L$1;
                    AwaitPointerEventScope awaitPointerEventScope6 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwaitPointerEvent$default = obj;
                    fM7912pointerSlopE8SPZFQ = f;
                    longRef2 = longRef3;
                    jM11104plusMKHz9U = j;
                    longRef = longRef4;
                    pointerInputChange = pointerInputChange5;
                    awaitPointerEventScope2 = awaitPointerEventScope6;
                    awaitPointerEventScope = awaitPointerEventScope5;
                    bidirectionalPointerDirectionConfig = pointerDirectionConfig;
                    PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent$default;
                    changes = pointerEvent.getChanges();
                    size = changes.size();
                    i = 0;
                    while (true) {
                        if (i < size) {
                        }
                        i++;
                        changes = list;
                        coroutine_suspended = obj2;
                        awaitPointerEventScope = awaitPointerEventScope3;
                    }
                    pointerInputChange3 = pointerInputChange2;
                    if (pointerInputChange3 != null) {
                    }
                    awaitPointerEventScope = awaitPointerEventScope2;
                    obj3 = obj2;
                    pointerInputChange3 = null;
                    c = 3;
                    if (pointerInputChange3 == null) {
                    }
                    if (pointerInputChange3 != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objM7909dragjO51t88 = obj;
                    if (((Boolean) objM7909dragjO51t88).booleanValue()) {
                        this.$onDragCancel.invoke();
                    } else {
                        this.$onDragEnd.invoke();
                    }
                    return Unit.INSTANCE;
                }
                long j2 = this.J$0;
                float f2 = this.F$0;
                PointerInputChange pointerInputChange6 = (PointerInputChange) this.L$6;
                Ref.LongRef longRef5 = (Ref.LongRef) this.L$5;
                bidirectionalPointerDirectionConfig = (PointerDirectionConfig) this.L$4;
                AwaitPointerEventScope awaitPointerEventScope7 = (AwaitPointerEventScope) this.L$3;
                Ref.LongRef longRef6 = (Ref.LongRef) this.L$2;
                PointerInputChange pointerInputChange7 = (PointerInputChange) this.L$1;
                AwaitPointerEventScope awaitPointerEventScope8 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                obj3 = coroutine_suspended;
                c = 3;
                pointerInputChange3 = pointerInputChange6;
                fM7912pointerSlopE8SPZFQ = f2;
                jM11104plusMKHz9U = j2;
                longRef = longRef6;
                pointerInputChange = pointerInputChange7;
                longRef2 = longRef5;
                awaitPointerEventScope2 = awaitPointerEventScope8;
                awaitPointerEventScope = awaitPointerEventScope7;
                if (!pointerInputChange3.isConsumed()) {
                    awaitPointerEventScope = awaitPointerEventScope2;
                    pointerInputChange3 = null;
                    if (pointerInputChange3 == null && !pointerInputChange3.isConsumed()) {
                        c2 = c;
                        coroutine_suspended = obj3;
                        i3 = 2;
                        i4 = 1;
                        r12 = 0;
                        id = pointerInputChange.getId();
                        int type = pointerInputChange.getType();
                        bidirectionalPointerDirectionConfig = DragGestureDetectorKt.getBidirectionalPointerDirectionConfig();
                        if (!DragGestureDetectorKt.m7911isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), id)) {
                            obj3 = coroutine_suspended;
                            c = c2;
                            pointerInputChange3 = r12;
                            if (pointerInputChange3 == null) {
                            }
                            if (pointerInputChange3 != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        fM7912pointerSlopE8SPZFQ = DragGestureDetectorKt.m7912pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), type);
                        Ref.LongRef longRef7 = new Ref.LongRef();
                        longRef7.element = id;
                        jM11104plusMKHz9U = Offset.INSTANCE.m11115getZeroF1C5BW0();
                        longRef2 = longRef7;
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        this.L$0 = awaitPointerEventScope2;
                        this.L$1 = pointerInputChange;
                        this.L$2 = longRef;
                        this.L$3 = awaitPointerEventScope;
                        this.L$4 = bidirectionalPointerDirectionConfig;
                        this.L$5 = longRef2;
                        this.L$6 = r12;
                        this.F$0 = fM7912pointerSlopE8SPZFQ;
                        this.J$0 = jM11104plusMKHz9U;
                        this.label = i3;
                        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, r12, this, i4, r12);
                        if (objAwaitPointerEvent$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        PointerEvent pointerEvent2 = (PointerEvent) objAwaitPointerEvent$default;
                        changes = pointerEvent2.getChanges();
                        size = changes.size();
                        i = 0;
                        while (true) {
                            if (i < size) {
                                obj2 = coroutine_suspended;
                                awaitPointerEventScope3 = awaitPointerEventScope;
                                pointerInputChange2 = null;
                                break;
                            }
                            pointerInputChange2 = changes.get(i);
                            list = changes;
                            obj2 = coroutine_suspended;
                            awaitPointerEventScope3 = awaitPointerEventScope;
                            if (PointerId.m12466equalsimpl0(pointerInputChange2.getId(), longRef2.element)) {
                                break;
                            }
                            i++;
                            changes = list;
                            coroutine_suspended = obj2;
                            awaitPointerEventScope = awaitPointerEventScope3;
                        }
                        pointerInputChange3 = pointerInputChange2;
                        if (pointerInputChange3 != null && !pointerInputChange3.isConsumed()) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                                List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                                int size2 = changes2.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size2) {
                                        pointerInputChange4 = null;
                                        break;
                                    }
                                    pointerInputChange4 = changes2.get(i5);
                                    if (pointerInputChange4.getPressed()) {
                                        break;
                                    }
                                    i5++;
                                }
                                PointerInputChange pointerInputChange8 = pointerInputChange4;
                                if (pointerInputChange8 != null) {
                                    longRef2.element = pointerInputChange8.getId();
                                    coroutine_suspended = obj2;
                                    awaitPointerEventScope = awaitPointerEventScope3;
                                    i3 = 2;
                                    i4 = 1;
                                    r12 = 0;
                                }
                            } else {
                                jM11104plusMKHz9U = Offset.m11104plusMKHz9U(jM11104plusMKHz9U, Offset.m11103minusMKHz9U(pointerInputChange3.getPosition(), pointerInputChange3.getPreviousPosition()));
                                if (bidirectionalPointerDirectionConfig.mo7914calculateDeltaChangek4lQ0M(jM11104plusMKHz9U) < fM7912pointerSlopE8SPZFQ) {
                                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                                    this.L$0 = awaitPointerEventScope2;
                                    this.L$1 = pointerInputChange;
                                    this.L$2 = longRef;
                                    AwaitPointerEventScope awaitPointerEventScope9 = awaitPointerEventScope3;
                                    this.L$3 = awaitPointerEventScope9;
                                    this.L$4 = bidirectionalPointerDirectionConfig;
                                    this.L$5 = longRef2;
                                    this.L$6 = pointerInputChange3;
                                    this.F$0 = fM7912pointerSlopE8SPZFQ;
                                    this.J$0 = jM11104plusMKHz9U;
                                    c = 3;
                                    this.label = 3;
                                    obj3 = obj2;
                                    if (awaitPointerEventScope9.awaitPointerEvent(pointerEventPass, this) == obj3) {
                                        return obj3;
                                    }
                                    awaitPointerEventScope = awaitPointerEventScope9;
                                    if (!pointerInputChange3.isConsumed()) {
                                        coroutine_suspended = obj3;
                                        i3 = 2;
                                        i4 = 1;
                                        r12 = 0;
                                    }
                                } else {
                                    obj3 = obj2;
                                    AwaitPointerEventScope awaitPointerEventScope10 = awaitPointerEventScope3;
                                    c = 3;
                                    long jMo7915calculatePostSlopOffset8S9VItk = bidirectionalPointerDirectionConfig.mo7915calculatePostSlopOffset8S9VItk(jM11104plusMKHz9U, fM7912pointerSlopE8SPZFQ);
                                    pointerInputChange3.consume();
                                    longRef.element = jMo7915calculatePostSlopOffset8S9VItk;
                                    if (pointerInputChange3.isConsumed()) {
                                        awaitPointerEventScope = awaitPointerEventScope2;
                                        if (pointerInputChange3 == null) {
                                        }
                                        if (pointerInputChange3 != null) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    r12 = 0;
                                    awaitPointerEventScope = awaitPointerEventScope10;
                                    coroutine_suspended = obj3;
                                    jM11104plusMKHz9U = Offset.INSTANCE.m11115getZeroF1C5BW0();
                                    i3 = 2;
                                    i4 = 1;
                                }
                            }
                            this.L$0 = awaitPointerEventScope2;
                            this.L$1 = pointerInputChange;
                            this.L$2 = longRef;
                            this.L$3 = awaitPointerEventScope;
                            this.L$4 = bidirectionalPointerDirectionConfig;
                            this.L$5 = longRef2;
                            this.L$6 = r12;
                            this.F$0 = fM7912pointerSlopE8SPZFQ;
                            this.J$0 = jM11104plusMKHz9U;
                            this.label = i3;
                            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, r12, this, i4, r12);
                            if (objAwaitPointerEvent$default == coroutine_suspended) {
                            }
                            PointerEvent pointerEvent22 = (PointerEvent) objAwaitPointerEvent$default;
                            changes = pointerEvent22.getChanges();
                            size = changes.size();
                            i = 0;
                            while (true) {
                                if (i < size) {
                                }
                                i++;
                                changes = list;
                                coroutine_suspended = obj2;
                                awaitPointerEventScope = awaitPointerEventScope3;
                            }
                            pointerInputChange3 = pointerInputChange2;
                            if (pointerInputChange3 != null) {
                                if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                                }
                                this.L$0 = awaitPointerEventScope2;
                                this.L$1 = pointerInputChange;
                                this.L$2 = longRef;
                                this.L$3 = awaitPointerEventScope;
                                this.L$4 = bidirectionalPointerDirectionConfig;
                                this.L$5 = longRef2;
                                this.L$6 = r12;
                                this.F$0 = fM7912pointerSlopE8SPZFQ;
                                this.J$0 = jM11104plusMKHz9U;
                                this.label = i3;
                                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, r12, this, i4, r12);
                                if (objAwaitPointerEvent$default == coroutine_suspended) {
                                }
                                PointerEvent pointerEvent222 = (PointerEvent) objAwaitPointerEvent$default;
                                changes = pointerEvent222.getChanges();
                                size = changes.size();
                                i = 0;
                                while (true) {
                                    if (i < size) {
                                    }
                                    i++;
                                    changes = list;
                                    coroutine_suspended = obj2;
                                    awaitPointerEventScope = awaitPointerEventScope3;
                                }
                                pointerInputChange3 = pointerInputChange2;
                                if (pointerInputChange3 != null) {
                                }
                            }
                        }
                        awaitPointerEventScope = awaitPointerEventScope2;
                        obj3 = obj2;
                        pointerInputChange3 = null;
                        c = 3;
                        if (pointerInputChange3 == null) {
                        }
                        if (pointerInputChange3 != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (pointerInputChange3 != null) {
                        this.$onDragStart.invoke(Offset.m11088boximpl(pointerInputChange3.getPosition()));
                        this.$onDrag.invoke(pointerInputChange3, Offset.m11088boximpl(longRef.element));
                        long id2 = pointerInputChange3.getId();
                        AnonymousClass2 anonymousClass2 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.5.2
                            public final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public AnonymousClass2(Function2<? super PointerInputChange, ? super Offset, Unit> function2) {
                                super(1);
                                function2 = function2;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange9) {
                                invoke2(pointerInputChange9);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke */
                            public final void invoke2(@NotNull PointerInputChange pointerInputChange9) {
                                function2.invoke(pointerInputChange9, Offset.m11088boximpl(PointerEventKt.positionChange(pointerInputChange9)));
                                pointerInputChange9.consume();
                            }
                        };
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.label = 4;
                        objM7909dragjO51t88 = DragGestureDetectorKt.m7909dragjO51t88(awaitPointerEventScope, id2, anonymousClass2, this);
                        if (objM7909dragjO51t88 == obj3) {
                            return obj3;
                        }
                        if (((Boolean) objM7909dragjO51t88).booleanValue()) {
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            pointerInputChange = (PointerInputChange) objAwaitFirstDown$default;
            longRef = new Ref.LongRef();
            longRef.element = Offset.INSTANCE.m11115getZeroF1C5BW0();
            id = pointerInputChange.getId();
            int type2 = pointerInputChange.getType();
            bidirectionalPointerDirectionConfig = DragGestureDetectorKt.getBidirectionalPointerDirectionConfig();
            if (!DragGestureDetectorKt.m7911isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), id)) {
            }
        }

        /* compiled from: DragGestureDetector.kt */
        @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$2 */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2 extends Lambda implements Function1<PointerInputChange, Unit> {
            public final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(Function2<? super PointerInputChange, ? super Offset, Unit> function2) {
                super(1);
                function2 = function2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange9) {
                invoke2(pointerInputChange9);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull PointerInputChange pointerInputChange9) {
                function2.invoke(pointerInputChange9, Offset.m11088boximpl(PointerEventKt.positionChange(pointerInputChange9)));
                pointerInputChange9.consume();
            }
        }
    }

    @Nullable
    public static final Object detectDragGestures(@NotNull PointerInputScope pointerInputScope, @NotNull Function1<? super Offset, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function2<? super PointerInputChange, ? super Offset, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C04515(function1, function2, function02, function0, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$2 */
    /* loaded from: classes4.dex */
    public static final class C04522 extends Lambda implements Function1<Offset, Unit> {
        public static final C04522 INSTANCE = ;

        /* renamed from: invoke-k-4lQ0M */
        public final void m7917invokek4lQ0M(long j) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            m7917invokek4lQ0M(offset.getPackedValue());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$3 */
    /* loaded from: classes4.dex */
    public static final class C04533 extends Lambda implements Function0<Unit> {
        public static final C04533 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = C04522.INSTANCE;
        }
        Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = C04533.INSTANCE;
        }
        Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = C04544.INSTANCE;
        }
        return detectDragGesturesAfterLongPress(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$4 */
    /* loaded from: classes4.dex */
    public static final class C04544 extends Lambda implements Function0<Unit> {
        public static final C04544 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", m7120f = "DragGestureDetector.kt", m7121i = {0, 1, 2}, m7122l = {ArjArchiveInputStream.ARJ_MAGIC_2, 235, 240}, m7123m = "invokeSuspend", m7124n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "$this$awaitEachGesture"}, m7125s = {"L$0", "L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,875:1\n33#2,6:876\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n*L\n246#1:876,6\n*E\n"})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 */
    /* loaded from: classes3.dex */
    public static final class C04555 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
        public final /* synthetic */ Function0<Unit> $onDragCancel;
        public final /* synthetic */ Function0<Unit> $onDragEnd;
        public final /* synthetic */ Function1<Offset, Unit> $onDragStart;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04555(Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super C04555> continuation) {
            super(2, continuation);
            this.$onDragStart = function1;
            this.$onDragEnd = function0;
            this.$onDragCancel = function02;
            this.$onDrag = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C04555 c04555 = new C04555(this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$onDrag, continuation);
            c04555.L$0 = obj;
            return c04555;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04555) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:80:0x0063 A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:59:0x0015, B:84:0x0087, B:86:0x008f, B:88:0x009e, B:90:0x00aa, B:91:0x00ad, B:92:0x00b0, B:93:0x00b6, B:66:0x0029, B:78:0x005f, B:80:0x0063, B:69:0x0031, B:75:0x004e, B:72:0x003d), top: B:98:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x008f A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:59:0x0015, B:84:0x0087, B:86:0x008f, B:88:0x009e, B:90:0x00aa, B:91:0x00ad, B:92:0x00b0, B:93:0x00b6, B:66:0x0029, B:78:0x005f, B:80:0x0063, B:69:0x0031, B:75:0x004e, B:72:0x003d), top: B:98:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x00b6 A[Catch: CancellationException -> 0x0019, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:59:0x0015, B:84:0x0087, B:86:0x008f, B:88:0x009e, B:90:0x00aa, B:91:0x00ad, B:92:0x00b0, B:93:0x00b6, B:66:0x0029, B:78:0x005f, B:80:0x0063, B:69:0x0031, B:75:0x004e, B:72:0x003d), top: B:98:0x0009 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            AwaitPointerEventScope awaitPointerEventScope;
            PointerInputChange pointerInputChange;
            AwaitPointerEventScope awaitPointerEventScope2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    this.L$0 = awaitPointerEventScope;
                    this.label = 1;
                    obj = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            pointerInputChange = (PointerInputChange) obj;
                            if (pointerInputChange != null) {
                                this.$onDragStart.invoke(Offset.m11088boximpl(pointerInputChange.getPosition()));
                                long id = pointerInputChange.getId();
                                AnonymousClass1 anonymousClass1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.5.1
                                    public final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    public AnonymousClass1(Function2<? super PointerInputChange, ? super Offset, Unit> function2) {
                                        super(1);
                                        function2 = function2;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                                        invoke2(pointerInputChange2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke */
                                    public final void invoke2(@NotNull PointerInputChange pointerInputChange2) {
                                        function2.invoke(pointerInputChange2, Offset.m11088boximpl(PointerEventKt.positionChange(pointerInputChange2)));
                                        pointerInputChange2.consume();
                                    }
                                };
                                this.L$0 = awaitPointerEventScope;
                                this.label = 3;
                                obj = DragGestureDetectorKt.m7909dragjO51t88(awaitPointerEventScope, id, anonymousClass1, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                awaitPointerEventScope2 = awaitPointerEventScope;
                                if (!((Boolean) obj).booleanValue()) {
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            List<PointerInputChange> changes = awaitPointerEventScope2.getCurrentEvent().getChanges();
                            int size = changes.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                PointerInputChange pointerInputChange2 = changes.get(i2);
                                if (PointerEventKt.changedToUp(pointerInputChange2)) {
                                    pointerInputChange2.consume();
                                }
                            }
                            this.$onDragEnd.invoke();
                        } else {
                            this.$onDragCancel.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                long id2 = ((PointerInputChange) obj).getId();
                this.L$0 = awaitPointerEventScope;
                this.label = 2;
                obj = DragGestureDetectorKt.m7900awaitLongPressOrCancellationrnUCldI(awaitPointerEventScope, id2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange != null) {
                }
                return Unit.INSTANCE;
            } catch (CancellationException e) {
                this.$onDragCancel.invoke();
                throw e;
            }
        }

        /* compiled from: DragGestureDetector.kt */
        @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1 */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1 extends Lambda implements Function1<PointerInputChange, Unit> {
            public final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Function2<? super PointerInputChange, ? super Offset, Unit> function2) {
                super(1);
                function2 = function2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                invoke2(pointerInputChange2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull PointerInputChange pointerInputChange2) {
                function2.invoke(pointerInputChange2, Offset.m11088boximpl(PointerEventKt.positionChange(pointerInputChange2)));
                pointerInputChange2.consume();
            }
        }
    }

    @Nullable
    public static final Object detectDragGesturesAfterLongPress(@NotNull PointerInputScope pointerInputScope, @NotNull Function1<? super Offset, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function2<? super PointerInputChange, ? super Offset, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C04555(function1, function0, function02, function2, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00de  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x0139 -> B:92:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x017d -> B:128:0x0184). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:137:0x01aa -> B:132:0x018e). Please report as a decompilation issue!!! */
    @Nullable
    /* renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7906awaitVerticalTouchSlopOrCancellationjO51t88(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j, @NotNull Function2<? super PointerInputChange, ? super Float, Unit> function2, @NotNull Continuation<? super PointerInputChange> continuation) throws Throwable {
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
        PointerDirectionConfig pointerDirectionConfig;
        Ref.LongRef longRef;
        float f;
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
        long jM11115getZeroF1C5BW0;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        Ref.LongRef longRef2;
        PointerDirectionConfig pointerDirectionConfig2;
        long j2;
        int size;
        int i;
        long j3;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        int i2;
        Object objAwaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) continuation;
            int i3 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label = i3 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1(continuation);
            }
        }
        Object obj = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
        int i5 = 1;
        PointerEventPass pointerEventPass = null;
        if (i4 != 0) {
            if (i4 == 1) {
                long j4 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.J$0;
                f = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0;
                Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3;
                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2;
                pointerDirectionConfig2 = (PointerDirectionConfig) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1;
                Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0;
                ResultKt.throwOnFailure(obj);
                longRef2 = longRef3;
                awaitPointerEventScope2 = awaitPointerEventScope3;
                j2 = j4;
                function22 = function23;
                PointerEvent pointerEvent = (PointerEvent) obj;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                size = changes.size();
                int i6 = 0;
                i = 0;
                while (true) {
                    if (i < size) {
                    }
                    i = i2 + 1;
                    j2 = j3;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 != null) {
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    }
                }
                return null;
            }
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j5 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.J$0;
            f = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0;
            pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$4;
            Ref.LongRef longRef4 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3;
            AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2;
            PointerDirectionConfig pointerDirectionConfig3 = (PointerDirectionConfig) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1;
            Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0;
            ResultKt.throwOnFailure(obj);
            char c = 2;
            DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
            jM11115getZeroF1C5BW0 = j5;
            awaitPointerEventScope2 = awaitPointerEventScope4;
            function22 = function24;
            longRef = longRef4;
            pointerDirectionConfig = pointerDirectionConfig3;
            if (!pointerInputChange2.isConsumed()) {
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                i5 = 1;
                pointerEventPass = null;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = longRef;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i5;
                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i5, pointerEventPass);
                if (objAwaitPointerEvent$default != coroutine_suspended) {
                    return coroutine_suspended;
                }
                long j6 = jM11115getZeroF1C5BW0;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
                obj = objAwaitPointerEvent$default;
                longRef2 = longRef;
                pointerDirectionConfig2 = pointerDirectionConfig;
                j2 = j6;
                PointerEvent pointerEvent2 = (PointerEvent) obj;
                List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                size = changes2.size();
                int i62 = 0;
                i = 0;
                while (true) {
                    if (i < size) {
                        j3 = j2;
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes2.get(i);
                    j3 = j2;
                    i2 = i;
                    if (PointerId.m12466equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                        break;
                    }
                    i = i2 + 1;
                    j2 = j3;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
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
                        PointerInputChange pointerInputChange4 = pointerInputChange3;
                        if (pointerInputChange4 != null) {
                            longRef2.element = pointerInputChange4.getId();
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                            pointerDirectionConfig = pointerDirectionConfig2;
                            longRef = longRef2;
                            i5 = 1;
                            pointerEventPass = null;
                            jM11115getZeroF1C5BW0 = j3;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = longRef;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i5;
                            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i5, pointerEventPass);
                            if (objAwaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                    } else {
                        long jM11104plusMKHz9U = Offset.m11104plusMKHz9U(j3, Offset.m11103minusMKHz9U(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition()));
                        if (pointerDirectionConfig2.mo7914calculateDeltaChangek4lQ0M(jM11104plusMKHz9U) >= f) {
                            function22.invoke(pointerInputChange2, Boxing.boxFloat(Offset.m11100getYimpl(pointerDirectionConfig2.mo7915calculatePostSlopOffset8S9VItk(jM11104plusMKHz9U, f))));
                            if (pointerInputChange2.isConsumed()) {
                                return pointerInputChange2;
                            }
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                            jM11115getZeroF1C5BW0 = Offset.INSTANCE.m11115getZeroF1C5BW0();
                            pointerDirectionConfig = pointerDirectionConfig2;
                            longRef = longRef2;
                            i5 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = longRef;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i5;
                            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i5, pointerEventPass);
                            if (objAwaitPointerEvent$default != coroutine_suspended) {
                            }
                        } else {
                            PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1 = pointerDirectionConfig2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3 = longRef2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$4 = pointerInputChange2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0 = f;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.J$0 = jM11104plusMKHz9U;
                            c = 2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label = 2;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            pointerDirectionConfig = pointerDirectionConfig2;
                            longRef = longRef2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                            jM11115getZeroF1C5BW0 = jM11104plusMKHz9U;
                            if (!pointerInputChange2.isConsumed()) {
                            }
                        }
                    }
                }
            }
            return null;
        }
        ResultKt.throwOnFailure(obj);
        int iM12563getTouchT8wyACA = PointerType.INSTANCE.m12563getTouchT8wyACA();
        PointerDirectionConfig pointerDirectionConfig4 = VerticalPointerDirectionConfig;
        if (m7911isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        float fM7912pointerSlopE8SPZFQ = m7912pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), iM12563getTouchT8wyACA);
        Ref.LongRef longRef5 = new Ref.LongRef();
        longRef5.element = j;
        pointerDirectionConfig = pointerDirectionConfig4;
        longRef = longRef5;
        f = fM7912pointerSlopE8SPZFQ;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
        jM11115getZeroF1C5BW0 = Offset.INSTANCE.m11115getZeroF1C5BW0();
        awaitPointerEventScope2 = awaitPointerEventScope;
        function22 = function2;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = longRef;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i5;
        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i5, pointerEventPass);
        if (objAwaitPointerEvent$default != coroutine_suspended) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00e0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x013b -> B:92:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x017f -> B:128:0x0186). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:137:0x01ac -> B:132:0x0190). Please report as a decompilation issue!!! */
    @Nullable
    /* renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7905awaitVerticalPointerSlopOrCancellationgDDlDlE(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j, int i, @NotNull Function2<? super PointerInputChange, ? super Float, Unit> function2, @NotNull Continuation<? super PointerInputChange> continuation) throws Throwable {
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
        float f;
        Ref.LongRef longRef;
        PointerDirectionConfig pointerDirectionConfig;
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
        long jM11115getZeroF1C5BW0;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        Ref.LongRef longRef2;
        float f2;
        long j2;
        int size;
        int i2;
        long j3;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        int i3;
        Object objAwaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) continuation;
            int i4 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i4 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1(continuation);
            }
        }
        Object obj = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
        int i6 = 1;
        PointerEventPass pointerEventPass = null;
        if (i5 != 0) {
            if (i5 == 1) {
                long j4 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.J$0;
                float f3 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                PointerDirectionConfig pointerDirectionConfig2 = (PointerDirectionConfig) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                ResultKt.throwOnFailure(obj);
                f2 = f3;
                pointerDirectionConfig = pointerDirectionConfig2;
                longRef2 = longRef3;
                awaitPointerEventScope2 = awaitPointerEventScope3;
                j2 = j4;
                function22 = function23;
                PointerEvent pointerEvent = (PointerEvent) obj;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                size = changes.size();
                int i7 = 0;
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                    }
                    i2 = i3 + 1;
                    j2 = j3;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 != null) {
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    }
                }
                return null;
            }
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j5 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.J$0;
            float f4 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
            pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4;
            Ref.LongRef longRef4 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
            AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
            PointerDirectionConfig pointerDirectionConfig3 = (PointerDirectionConfig) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
            Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
            ResultKt.throwOnFailure(obj);
            char c = 2;
            DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
            jM11115getZeroF1C5BW0 = j5;
            awaitPointerEventScope2 = awaitPointerEventScope4;
            function22 = function24;
            longRef = longRef4;
            f = f4;
            pointerDirectionConfig = pointerDirectionConfig3;
            if (!pointerInputChange2.isConsumed()) {
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13;
                i6 = 1;
                pointerEventPass = null;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$3 = longRef;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.label = i6;
                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12, i6, pointerEventPass);
                if (objAwaitPointerEvent$default != coroutine_suspended) {
                    return coroutine_suspended;
                }
                long j6 = jM11115getZeroF1C5BW0;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
                obj = objAwaitPointerEvent$default;
                longRef2 = longRef;
                f2 = f;
                j2 = j6;
                PointerEvent pointerEvent2 = (PointerEvent) obj;
                List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                size = changes2.size();
                int i72 = 0;
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                        j3 = j2;
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes2.get(i2);
                    j3 = j2;
                    i3 = i2;
                    if (PointerId.m12466equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                        break;
                    }
                    i2 = i3 + 1;
                    j2 = j3;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        while (true) {
                            if (i72 >= size2) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes3.get(i72);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i72++;
                        }
                        PointerInputChange pointerInputChange4 = pointerInputChange3;
                        if (pointerInputChange4 != null) {
                            longRef2.element = pointerInputChange4.getId();
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                            f = f2;
                            longRef = longRef2;
                            i6 = 1;
                            pointerEventPass = null;
                            jM11115getZeroF1C5BW0 = j3;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$3 = longRef;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.label = i6;
                            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12, i6, pointerEventPass);
                            if (objAwaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                    } else {
                        long jM11104plusMKHz9U = Offset.m11104plusMKHz9U(j3, Offset.m11103minusMKHz9U(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition()));
                        if (pointerDirectionConfig.mo7914calculateDeltaChangek4lQ0M(jM11104plusMKHz9U) >= f2) {
                            function22.invoke(pointerInputChange2, Boxing.boxFloat(Offset.m11100getYimpl(pointerDirectionConfig.mo7915calculatePostSlopOffset8S9VItk(jM11104plusMKHz9U, f2))));
                            if (pointerInputChange2.isConsumed()) {
                                return pointerInputChange2;
                            }
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                            jM11115getZeroF1C5BW0 = Offset.INSTANCE.m11115getZeroF1C5BW0();
                            f = f2;
                            longRef = longRef2;
                            i6 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$3 = longRef;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.label = i6;
                            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12, i6, pointerEventPass);
                            if (objAwaitPointerEvent$default != coroutine_suspended) {
                            }
                        } else {
                            PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = pointerDirectionConfig;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = longRef2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = pointerInputChange2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = f2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.J$0 = jM11104plusMKHz9U;
                            c = 2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = 2;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            f = f2;
                            longRef = longRef2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                            jM11115getZeroF1C5BW0 = jM11104plusMKHz9U;
                            if (!pointerInputChange2.isConsumed()) {
                            }
                        }
                    }
                }
            }
            return null;
        }
        ResultKt.throwOnFailure(obj);
        PointerDirectionConfig pointerDirectionConfig4 = VerticalPointerDirectionConfig;
        if (m7911isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        float fM7912pointerSlopE8SPZFQ = m7912pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        Ref.LongRef longRef5 = new Ref.LongRef();
        longRef5.element = j;
        f = fM7912pointerSlopE8SPZFQ;
        longRef = longRef5;
        pointerDirectionConfig = pointerDirectionConfig4;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
        jM11115getZeroF1C5BW0 = Offset.INSTANCE.m11115getZeroF1C5BW0();
        awaitPointerEventScope2 = awaitPointerEventScope;
        function22 = function2;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$0 = function22;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$3 = longRef;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$0 = f;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.label = i6;
        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12, i6, pointerEventPass);
        if (objAwaitPointerEvent$default != coroutine_suspended) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x00eb, code lost:
    
        if ((!r0) != false) goto L123;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:117:0x00da, B:106:0x00b1], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x007a -> B:94:0x007f). Please report as a decompilation issue!!! */
    @Nullable
    /* renamed from: verticalDrag-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7913verticalDragjO51t88(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j, @NotNull Function1<? super PointerInputChange, Unit> function1, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$1;
        long id;
        AwaitPointerEventScope awaitPointerEventScope2;
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$12;
        Function1<? super PointerInputChange, Unit> function12;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope3;
        Object objAwaitPointerEvent$default;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        if (continuation instanceof DragGestureDetectorKt$verticalDrag$1) {
            dragGestureDetectorKt$verticalDrag$1 = (DragGestureDetectorKt$verticalDrag$1) continuation;
            int i = dragGestureDetectorKt$verticalDrag$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$verticalDrag$1.label = i - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$verticalDrag$1 = new DragGestureDetectorKt$verticalDrag$1(continuation);
            }
        }
        Object obj = dragGestureDetectorKt$verticalDrag$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dragGestureDetectorKt$verticalDrag$1.label;
        PointerEventPass pointerEventPass = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            id = j;
            if (!m7911isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), id)) {
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
                function12 = function1;
                longRef = new Ref.LongRef();
                longRef.element = id;
                awaitPointerEventScope3 = awaitPointerEventScope2;
                dragGestureDetectorKt$verticalDrag$12.L$0 = function12;
                dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$verticalDrag$12.L$2 = awaitPointerEventScope3;
                dragGestureDetectorKt$verticalDrag$12.L$3 = longRef;
                dragGestureDetectorKt$verticalDrag$12.label = 1;
                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, 1, pointerEventPass);
                if (objAwaitPointerEvent$default == coroutine_suspended) {
                }
            }
            return Boxing.boxBoolean(pointerEventPass == null);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$verticalDrag$1.L$3;
        awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$verticalDrag$1.L$2;
        AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$verticalDrag$1.L$1;
        Function1<? super PointerInputChange, Unit> function13 = (Function1) dragGestureDetectorKt$verticalDrag$1.L$0;
        ResultKt.throwOnFailure(obj);
        dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
        function12 = function13;
        longRef = longRef2;
        PointerEvent pointerEvent = (PointerEvent) obj;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i3);
            if (PointerId.m12466equalsimpl0(pointerInputChange.getId(), longRef.element)) {
                break;
            }
            i3++;
        }
        PointerInputChange pointerInputChange4 = pointerInputChange;
        if (pointerInputChange4 == null) {
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i4);
                    if (pointerInputChange2.getPressed()) {
                        break;
                    }
                    i4++;
                }
                PointerInputChange pointerInputChange5 = pointerInputChange2;
                pointerInputChange3 = pointerInputChange4;
                if (pointerInputChange5 != null) {
                    longRef.element = pointerInputChange5.getId();
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    pointerEventPass = null;
                    dragGestureDetectorKt$verticalDrag$12.L$0 = function12;
                    dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$verticalDrag$12.L$2 = awaitPointerEventScope3;
                    dragGestureDetectorKt$verticalDrag$12.L$3 = longRef;
                    dragGestureDetectorKt$verticalDrag$12.label = 1;
                    objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, 1, pointerEventPass);
                    if (objAwaitPointerEvent$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope4 = awaitPointerEventScope2;
                    obj = objAwaitPointerEvent$default;
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                    int size3 = changes3.size();
                    int i32 = 0;
                    while (true) {
                        if (i32 < size3) {
                        }
                        i32++;
                    }
                    PointerInputChange pointerInputChange42 = pointerInputChange;
                    if (pointerInputChange42 == null) {
                        pointerInputChange3 = 0;
                    }
                }
            } else {
                boolean z = Offset.m11100getYimpl(PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange42)) == 0.0f;
                pointerInputChange3 = pointerInputChange42;
            }
        }
        if (pointerInputChange3 == 0 || pointerInputChange3.isConsumed()) {
            pointerEventPass = null;
        } else if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
            pointerEventPass = pointerInputChange3;
        } else {
            function12.invoke(pointerInputChange3);
            awaitPointerEventScope2 = awaitPointerEventScope4;
            id = pointerInputChange3.getId();
            pointerEventPass = null;
            longRef = new Ref.LongRef();
            longRef.element = id;
            awaitPointerEventScope3 = awaitPointerEventScope2;
            dragGestureDetectorKt$verticalDrag$12.L$0 = function12;
            dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
            dragGestureDetectorKt$verticalDrag$12.L$2 = awaitPointerEventScope3;
            dragGestureDetectorKt$verticalDrag$12.L$3 = longRef;
            dragGestureDetectorKt$verticalDrag$12.label = 1;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, 1, pointerEventPass);
            if (objAwaitPointerEvent$default == coroutine_suspended) {
            }
        }
        return Boxing.boxBoolean(pointerEventPass == null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x00d7, code lost:
    
        if (((androidx.compose.p003ui.geometry.Offset.m11100getYimpl(androidx.compose.p003ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11)) == 0.0f ? 1 : 0) ^ 1) != 0) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0099  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0068 -> B:84:0x006d). Please report as a decompilation issue!!! */
    @Nullable
    /* renamed from: awaitVerticalDragOrCancellation-rnUCldI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7904awaitVerticalDragOrCancellationrnUCldI(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j, @NotNull Continuation<? super PointerInputChange> continuation) throws Throwable {
        DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 dragGestureDetectorKt$awaitVerticalDragOrCancellation$1;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object objAwaitPointerEvent$default;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalDragOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) continuation;
            int i = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label = i - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalDragOrCancellation$1(continuation);
            }
        }
        Object obj = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0;
            ResultKt.throwOnFailure(obj);
            Ref.LongRef longRef3 = longRef2;
            awaitPointerEventScope2 = awaitPointerEventScope3;
            PointerEvent pointerEvent = (PointerEvent) obj;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i3);
                if (PointerId.m12466equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                    break;
                }
                i3++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null) {
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    while (true) {
                        if (i >= size2) {
                            pointerInputChange2 = null;
                            break;
                        }
                        pointerInputChange2 = changes2.get(i);
                        if (pointerInputChange2.getPressed()) {
                            break;
                        }
                        i++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange2;
                    if (pointerInputChange4 != null) {
                        longRef3.element = pointerInputChange4.getId();
                        longRef = longRef3;
                    }
                }
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1 = longRef;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label = 1;
                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$1, 1, null);
                if (objAwaitPointerEvent$default != coroutine_suspended) {
                    return coroutine_suspended;
                }
                Ref.LongRef longRef4 = longRef;
                obj = objAwaitPointerEvent$default;
                longRef3 = longRef4;
                PointerEvent pointerEvent2 = (PointerEvent) obj;
                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                int size3 = changes3.size();
                int i32 = 0;
                while (true) {
                    if (i32 < size3) {
                    }
                    i32++;
                }
                PointerInputChange pointerInputChange32 = pointerInputChange;
                if (pointerInputChange32 == null) {
                    pointerInputChange32 = null;
                }
            }
            if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                return null;
            }
            return pointerInputChange32;
        }
        ResultKt.throwOnFailure(obj);
        if (m7911isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        longRef = new Ref.LongRef();
        longRef.element = j;
        awaitPointerEventScope2 = awaitPointerEventScope;
        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1 = longRef;
        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label = 1;
        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$1, 1, null);
        if (objAwaitPointerEvent$default != coroutine_suspended) {
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$2 */
    /* loaded from: classes4.dex */
    public static final class C04602 extends Lambda implements Function1<Offset, Unit> {
        public static final C04602 INSTANCE = ;

        /* renamed from: invoke-k-4lQ0M */
        public final void m7919invokek4lQ0M(long j) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            m7919invokek4lQ0M(offset.getPackedValue());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$3 */
    /* loaded from: classes4.dex */
    public static final class C04613 extends Lambda implements Function0<Unit> {
        public static final C04613 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object detectVerticalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = C04602.INSTANCE;
        }
        Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = C04613.INSTANCE;
        }
        Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = C04624.INSTANCE;
        }
        return detectVerticalDragGestures(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$4 */
    /* loaded from: classes4.dex */
    public static final class C04624 extends Lambda implements Function0<Unit> {
        public static final C04624 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5", m7120f = "DragGestureDetector.kt", m7121i = {0, 1, 1}, m7122l = {390, 392, 400}, m7123m = "invokeSuspend", m7124n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "overSlop"}, m7125s = {"L$0", "L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5 */
    /* loaded from: classes3.dex */
    public static final class C04635 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function0<Unit> $onDragCancel;
        public final /* synthetic */ Function0<Unit> $onDragEnd;
        public final /* synthetic */ Function1<Offset, Unit> $onDragStart;
        public final /* synthetic */ Function2<PointerInputChange, Float, Unit> $onVerticalDrag;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04635(Function1<? super Offset, Unit> function1, Function2<? super PointerInputChange, ? super Float, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super C04635> continuation) {
            super(2, continuation);
            this.$onDragStart = function1;
            this.$onVerticalDrag = function2;
            this.$onDragEnd = function0;
            this.$onDragCancel = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C04635 c04635 = new C04635(this.$onDragStart, this.$onVerticalDrag, this.$onDragEnd, this.$onDragCancel, continuation);
            c04635.L$0 = obj;
            return c04635;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04635) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            AwaitPointerEventScope awaitPointerEventScope;
            AwaitPointerEventScope awaitPointerEventScope2;
            Ref.FloatRef floatRef;
            PointerInputChange pointerInputChange;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope3;
                this.label = 1;
                Object objAwaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope3, false, null, this, 2, null);
                if (objAwaitFirstDown$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                awaitPointerEventScope = awaitPointerEventScope3;
                obj = objAwaitFirstDown$default;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            this.$onDragEnd.invoke();
                        } else {
                            this.$onDragCancel.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                    floatRef = (Ref.FloatRef) this.L$1;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        this.$onDragStart.invoke(Offset.m11088boximpl(pointerInputChange.getPosition()));
                        this.$onVerticalDrag.invoke(pointerInputChange, Boxing.boxFloat(floatRef.element));
                        long id = pointerInputChange.getId();
                        AnonymousClass1 anonymousClass1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.5.1
                            public final /* synthetic */ Function2<PointerInputChange, Float, Unit> $onVerticalDrag;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public AnonymousClass1(Function2<? super PointerInputChange, ? super Float, Unit> function2) {
                                super(1);
                                function2 = function2;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                                invoke2(pointerInputChange2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke */
                            public final void invoke2(@NotNull PointerInputChange pointerInputChange2) {
                                function2.invoke(pointerInputChange2, Float.valueOf(Offset.m11100getYimpl(PointerEventKt.positionChange(pointerInputChange2))));
                                pointerInputChange2.consume();
                            }
                        };
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                        obj = DragGestureDetectorKt.m7913verticalDragjO51t88(awaitPointerEventScope2, id, anonymousClass1, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            long id2 = pointerInputChange2.getId();
            int type = pointerInputChange2.getType();
            Function2<PointerInputChange, Float, Unit> function2 = new Function2<PointerInputChange, Float, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange3, Float f) {
                    invoke(pointerInputChange3, f.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull PointerInputChange pointerInputChange3, float f) {
                    pointerInputChange3.consume();
                    floatRef2.element = f;
                }
            };
            this.L$0 = awaitPointerEventScope;
            this.L$1 = floatRef2;
            this.label = 2;
            obj = DragGestureDetectorKt.m7905awaitVerticalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, id2, type, function2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            awaitPointerEventScope2 = awaitPointerEventScope;
            floatRef = floatRef2;
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
            }
            return Unit.INSTANCE;
        }

        /* compiled from: DragGestureDetector.kt */
        @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1 */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1 extends Lambda implements Function1<PointerInputChange, Unit> {
            public final /* synthetic */ Function2<PointerInputChange, Float, Unit> $onVerticalDrag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Function2<? super PointerInputChange, ? super Float, Unit> function2) {
                super(1);
                function2 = function2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                invoke2(pointerInputChange2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull PointerInputChange pointerInputChange2) {
                function2.invoke(pointerInputChange2, Float.valueOf(Offset.m11100getYimpl(PointerEventKt.positionChange(pointerInputChange2))));
                pointerInputChange2.consume();
            }
        }
    }

    @Nullable
    public static final Object detectVerticalDragGestures(@NotNull PointerInputScope pointerInputScope, @NotNull Function1<? super Offset, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function2<? super PointerInputChange, ? super Float, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C04635(function1, function2, function0, function02, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00de  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x0139 -> B:92:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x017d -> B:128:0x0184). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:137:0x01aa -> B:132:0x018e). Please report as a decompilation issue!!! */
    @Nullable
    /* renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7899awaitHorizontalTouchSlopOrCancellationjO51t88(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j, @NotNull Function2<? super PointerInputChange, ? super Float, Unit> function2, @NotNull Continuation<? super PointerInputChange> continuation) throws Throwable {
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
        PointerDirectionConfig pointerDirectionConfig;
        Ref.LongRef longRef;
        float f;
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
        long jM11115getZeroF1C5BW0;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        Ref.LongRef longRef2;
        PointerDirectionConfig pointerDirectionConfig2;
        long j2;
        int size;
        int i;
        long j3;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        int i2;
        Object objAwaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) continuation;
            int i3 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label = i3 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1(continuation);
            }
        }
        Object obj = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label;
        int i5 = 1;
        PointerEventPass pointerEventPass = null;
        if (i4 != 0) {
            if (i4 == 1) {
                long j4 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.J$0;
                f = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0;
                Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$3;
                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2;
                pointerDirectionConfig2 = (PointerDirectionConfig) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1;
                Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0;
                ResultKt.throwOnFailure(obj);
                longRef2 = longRef3;
                awaitPointerEventScope2 = awaitPointerEventScope3;
                j2 = j4;
                function22 = function23;
                PointerEvent pointerEvent = (PointerEvent) obj;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                size = changes.size();
                int i6 = 0;
                i = 0;
                while (true) {
                    if (i < size) {
                    }
                    i = i2 + 1;
                    j2 = j3;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 != null) {
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    }
                }
                return null;
            }
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j5 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.J$0;
            f = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0;
            pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$4;
            Ref.LongRef longRef4 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$3;
            AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2;
            PointerDirectionConfig pointerDirectionConfig3 = (PointerDirectionConfig) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1;
            Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0;
            ResultKt.throwOnFailure(obj);
            char c = 2;
            DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
            jM11115getZeroF1C5BW0 = j5;
            awaitPointerEventScope2 = awaitPointerEventScope4;
            function22 = function24;
            longRef = longRef4;
            pointerDirectionConfig = pointerDirectionConfig3;
            if (!pointerInputChange2.isConsumed()) {
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
                i5 = 1;
                pointerEventPass = null;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = longRef;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i5;
                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i5, pointerEventPass);
                if (objAwaitPointerEvent$default != coroutine_suspended) {
                    return coroutine_suspended;
                }
                long j6 = jM11115getZeroF1C5BW0;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
                obj = objAwaitPointerEvent$default;
                longRef2 = longRef;
                pointerDirectionConfig2 = pointerDirectionConfig;
                j2 = j6;
                PointerEvent pointerEvent2 = (PointerEvent) obj;
                List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                size = changes2.size();
                int i62 = 0;
                i = 0;
                while (true) {
                    if (i < size) {
                        j3 = j2;
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes2.get(i);
                    j3 = j2;
                    i2 = i;
                    if (PointerId.m12466equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                        break;
                    }
                    i = i2 + 1;
                    j2 = j3;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
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
                        PointerInputChange pointerInputChange4 = pointerInputChange3;
                        if (pointerInputChange4 != null) {
                            longRef2.element = pointerInputChange4.getId();
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                            pointerDirectionConfig = pointerDirectionConfig2;
                            longRef = longRef2;
                            i5 = 1;
                            pointerEventPass = null;
                            jM11115getZeroF1C5BW0 = j3;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = longRef;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i5;
                            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i5, pointerEventPass);
                            if (objAwaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                    } else {
                        long jM11104plusMKHz9U = Offset.m11104plusMKHz9U(j3, Offset.m11103minusMKHz9U(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition()));
                        if (pointerDirectionConfig2.mo7914calculateDeltaChangek4lQ0M(jM11104plusMKHz9U) >= f) {
                            function22.invoke(pointerInputChange2, Boxing.boxFloat(Offset.m11099getXimpl(pointerDirectionConfig2.mo7915calculatePostSlopOffset8S9VItk(jM11104plusMKHz9U, f))));
                            if (pointerInputChange2.isConsumed()) {
                                return pointerInputChange2;
                            }
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                            jM11115getZeroF1C5BW0 = Offset.INSTANCE.m11115getZeroF1C5BW0();
                            pointerDirectionConfig = pointerDirectionConfig2;
                            longRef = longRef2;
                            i5 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = longRef;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i5;
                            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i5, pointerEventPass);
                            if (objAwaitPointerEvent$default != coroutine_suspended) {
                            }
                        } else {
                            PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1 = pointerDirectionConfig2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$3 = longRef2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$4 = pointerInputChange2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0 = f;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.J$0 = jM11104plusMKHz9U;
                            c = 2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label = 2;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            pointerDirectionConfig = pointerDirectionConfig2;
                            longRef = longRef2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                            jM11115getZeroF1C5BW0 = jM11104plusMKHz9U;
                            if (!pointerInputChange2.isConsumed()) {
                            }
                        }
                    }
                }
            }
            return null;
        }
        ResultKt.throwOnFailure(obj);
        int iM12563getTouchT8wyACA = PointerType.INSTANCE.m12563getTouchT8wyACA();
        PointerDirectionConfig pointerDirectionConfig4 = HorizontalPointerDirectionConfig;
        if (m7911isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        float fM7912pointerSlopE8SPZFQ = m7912pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), iM12563getTouchT8wyACA);
        Ref.LongRef longRef5 = new Ref.LongRef();
        longRef5.element = j;
        pointerDirectionConfig = pointerDirectionConfig4;
        longRef = longRef5;
        f = fM7912pointerSlopE8SPZFQ;
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
        jM11115getZeroF1C5BW0 = Offset.INSTANCE.m11115getZeroF1C5BW0();
        awaitPointerEventScope2 = awaitPointerEventScope;
        function22 = function2;
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = longRef;
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i5;
        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i5, pointerEventPass);
        if (objAwaitPointerEvent$default != coroutine_suspended) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00e0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x013b -> B:92:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x017f -> B:128:0x0186). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:137:0x01ac -> B:132:0x0190). Please report as a decompilation issue!!! */
    @Nullable
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7898awaitHorizontalPointerSlopOrCancellationgDDlDlE(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j, int i, @NotNull Function2<? super PointerInputChange, ? super Float, Unit> function2, @NotNull Continuation<? super PointerInputChange> continuation) throws Throwable {
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
        float f;
        Ref.LongRef longRef;
        PointerDirectionConfig pointerDirectionConfig;
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
        long jM11115getZeroF1C5BW0;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        Ref.LongRef longRef2;
        float f2;
        long j2;
        int size;
        int i2;
        long j3;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        int i3;
        Object objAwaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) continuation;
            int i4 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i4 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1(continuation);
            }
        }
        Object obj = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
        int i6 = 1;
        PointerEventPass pointerEventPass = null;
        if (i5 != 0) {
            if (i5 == 1) {
                long j4 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.J$0;
                float f3 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                PointerDirectionConfig pointerDirectionConfig2 = (PointerDirectionConfig) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                ResultKt.throwOnFailure(obj);
                f2 = f3;
                pointerDirectionConfig = pointerDirectionConfig2;
                longRef2 = longRef3;
                awaitPointerEventScope2 = awaitPointerEventScope3;
                j2 = j4;
                function22 = function23;
                PointerEvent pointerEvent = (PointerEvent) obj;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                size = changes.size();
                int i7 = 0;
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                    }
                    i2 = i3 + 1;
                    j2 = j3;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 != null) {
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    }
                }
                return null;
            }
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j5 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.J$0;
            float f4 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
            pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4;
            Ref.LongRef longRef4 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
            AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
            PointerDirectionConfig pointerDirectionConfig3 = (PointerDirectionConfig) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
            Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
            ResultKt.throwOnFailure(obj);
            char c = 2;
            DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
            jM11115getZeroF1C5BW0 = j5;
            awaitPointerEventScope2 = awaitPointerEventScope4;
            function22 = function24;
            longRef = longRef4;
            f = f4;
            pointerDirectionConfig = pointerDirectionConfig3;
            if (!pointerInputChange2.isConsumed()) {
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13;
                i6 = 1;
                pointerEventPass = null;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = longRef;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = i6;
                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12, i6, pointerEventPass);
                if (objAwaitPointerEvent$default != coroutine_suspended) {
                    return coroutine_suspended;
                }
                long j6 = jM11115getZeroF1C5BW0;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
                obj = objAwaitPointerEvent$default;
                longRef2 = longRef;
                f2 = f;
                j2 = j6;
                PointerEvent pointerEvent2 = (PointerEvent) obj;
                List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                size = changes2.size();
                int i72 = 0;
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                        j3 = j2;
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes2.get(i2);
                    j3 = j2;
                    i3 = i2;
                    if (PointerId.m12466equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                        break;
                    }
                    i2 = i3 + 1;
                    j2 = j3;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        while (true) {
                            if (i72 >= size2) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes3.get(i72);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i72++;
                        }
                        PointerInputChange pointerInputChange4 = pointerInputChange3;
                        if (pointerInputChange4 != null) {
                            longRef2.element = pointerInputChange4.getId();
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                            f = f2;
                            longRef = longRef2;
                            i6 = 1;
                            pointerEventPass = null;
                            jM11115getZeroF1C5BW0 = j3;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = longRef;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = i6;
                            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12, i6, pointerEventPass);
                            if (objAwaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                    } else {
                        long jM11104plusMKHz9U = Offset.m11104plusMKHz9U(j3, Offset.m11103minusMKHz9U(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition()));
                        if (pointerDirectionConfig.mo7914calculateDeltaChangek4lQ0M(jM11104plusMKHz9U) >= f2) {
                            function22.invoke(pointerInputChange2, Boxing.boxFloat(Offset.m11099getXimpl(pointerDirectionConfig.mo7915calculatePostSlopOffset8S9VItk(jM11104plusMKHz9U, f2))));
                            if (pointerInputChange2.isConsumed()) {
                                return pointerInputChange2;
                            }
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                            jM11115getZeroF1C5BW0 = Offset.INSTANCE.m11115getZeroF1C5BW0();
                            f = f2;
                            longRef = longRef2;
                            i6 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = longRef;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = i6;
                            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12, i6, pointerEventPass);
                            if (objAwaitPointerEvent$default != coroutine_suspended) {
                            }
                        } else {
                            PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = pointerDirectionConfig;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = longRef2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = pointerInputChange2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = f2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.J$0 = jM11104plusMKHz9U;
                            c = 2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = 2;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            f = f2;
                            longRef = longRef2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                            jM11115getZeroF1C5BW0 = jM11104plusMKHz9U;
                            if (!pointerInputChange2.isConsumed()) {
                            }
                        }
                    }
                }
            }
            return null;
        }
        ResultKt.throwOnFailure(obj);
        PointerDirectionConfig pointerDirectionConfig4 = HorizontalPointerDirectionConfig;
        if (m7911isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        float fM7912pointerSlopE8SPZFQ = m7912pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        Ref.LongRef longRef5 = new Ref.LongRef();
        longRef5.element = j;
        f = fM7912pointerSlopE8SPZFQ;
        longRef = longRef5;
        pointerDirectionConfig = pointerDirectionConfig4;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
        jM11115getZeroF1C5BW0 = Offset.INSTANCE.m11115getZeroF1C5BW0();
        awaitPointerEventScope2 = awaitPointerEventScope;
        function22 = function2;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = longRef;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = i6;
        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12, i6, pointerEventPass);
        if (objAwaitPointerEvent$default != coroutine_suspended) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x00eb, code lost:
    
        if ((!r0) != false) goto L123;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:117:0x00da, B:106:0x00b1], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x007a -> B:94:0x007f). Please report as a decompilation issue!!! */
    @Nullable
    /* renamed from: horizontalDrag-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7910horizontalDragjO51t88(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j, @NotNull Function1<? super PointerInputChange, Unit> function1, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$1;
        long id;
        AwaitPointerEventScope awaitPointerEventScope2;
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$12;
        Function1<? super PointerInputChange, Unit> function12;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope3;
        Object objAwaitPointerEvent$default;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        if (continuation instanceof DragGestureDetectorKt$horizontalDrag$1) {
            dragGestureDetectorKt$horizontalDrag$1 = (DragGestureDetectorKt$horizontalDrag$1) continuation;
            int i = dragGestureDetectorKt$horizontalDrag$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$horizontalDrag$1.label = i - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$horizontalDrag$1 = new DragGestureDetectorKt$horizontalDrag$1(continuation);
            }
        }
        Object obj = dragGestureDetectorKt$horizontalDrag$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dragGestureDetectorKt$horizontalDrag$1.label;
        PointerEventPass pointerEventPass = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            id = j;
            if (!m7911isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), id)) {
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$1;
                function12 = function1;
                longRef = new Ref.LongRef();
                longRef.element = id;
                awaitPointerEventScope3 = awaitPointerEventScope2;
                dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$horizontalDrag$12.L$2 = awaitPointerEventScope3;
                dragGestureDetectorKt$horizontalDrag$12.L$3 = longRef;
                dragGestureDetectorKt$horizontalDrag$12.label = 1;
                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, 1, pointerEventPass);
                if (objAwaitPointerEvent$default == coroutine_suspended) {
                }
            }
            return Boxing.boxBoolean(pointerEventPass == null);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$horizontalDrag$1.L$3;
        awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$horizontalDrag$1.L$2;
        AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$horizontalDrag$1.L$1;
        Function1<? super PointerInputChange, Unit> function13 = (Function1) dragGestureDetectorKt$horizontalDrag$1.L$0;
        ResultKt.throwOnFailure(obj);
        dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$1;
        function12 = function13;
        longRef = longRef2;
        PointerEvent pointerEvent = (PointerEvent) obj;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i3);
            if (PointerId.m12466equalsimpl0(pointerInputChange.getId(), longRef.element)) {
                break;
            }
            i3++;
        }
        PointerInputChange pointerInputChange4 = pointerInputChange;
        if (pointerInputChange4 == null) {
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i4);
                    if (pointerInputChange2.getPressed()) {
                        break;
                    }
                    i4++;
                }
                PointerInputChange pointerInputChange5 = pointerInputChange2;
                pointerInputChange3 = pointerInputChange4;
                if (pointerInputChange5 != null) {
                    longRef.element = pointerInputChange5.getId();
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    pointerEventPass = null;
                    dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                    dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$horizontalDrag$12.L$2 = awaitPointerEventScope3;
                    dragGestureDetectorKt$horizontalDrag$12.L$3 = longRef;
                    dragGestureDetectorKt$horizontalDrag$12.label = 1;
                    objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, 1, pointerEventPass);
                    if (objAwaitPointerEvent$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope4 = awaitPointerEventScope2;
                    obj = objAwaitPointerEvent$default;
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                    int size3 = changes3.size();
                    int i32 = 0;
                    while (true) {
                        if (i32 < size3) {
                        }
                        i32++;
                    }
                    PointerInputChange pointerInputChange42 = pointerInputChange;
                    if (pointerInputChange42 == null) {
                        pointerInputChange3 = 0;
                    }
                }
            } else {
                boolean z = Offset.m11099getXimpl(PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange42)) == 0.0f;
                pointerInputChange3 = pointerInputChange42;
            }
        }
        if (pointerInputChange3 == 0 || pointerInputChange3.isConsumed()) {
            pointerEventPass = null;
        } else if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
            pointerEventPass = pointerInputChange3;
        } else {
            function12.invoke(pointerInputChange3);
            awaitPointerEventScope2 = awaitPointerEventScope4;
            id = pointerInputChange3.getId();
            pointerEventPass = null;
            longRef = new Ref.LongRef();
            longRef.element = id;
            awaitPointerEventScope3 = awaitPointerEventScope2;
            dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
            dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
            dragGestureDetectorKt$horizontalDrag$12.L$2 = awaitPointerEventScope3;
            dragGestureDetectorKt$horizontalDrag$12.L$3 = longRef;
            dragGestureDetectorKt$horizontalDrag$12.label = 1;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, 1, pointerEventPass);
            if (objAwaitPointerEvent$default == coroutine_suspended) {
            }
        }
        return Boxing.boxBoolean(pointerEventPass == null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x00d7, code lost:
    
        if (((androidx.compose.p003ui.geometry.Offset.m11099getXimpl(androidx.compose.p003ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11)) == 0.0f ? 1 : 0) ^ 1) != 0) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0099  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0068 -> B:84:0x006d). Please report as a decompilation issue!!! */
    @Nullable
    /* renamed from: awaitHorizontalDragOrCancellation-rnUCldI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7897awaitHorizontalDragOrCancellationrnUCldI(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j, @NotNull Continuation<? super PointerInputChange> continuation) throws Throwable {
        DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object objAwaitPointerEvent$default;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) continuation;
            int i = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label = i - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1(continuation);
            }
        }
        Object obj = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0;
            ResultKt.throwOnFailure(obj);
            Ref.LongRef longRef3 = longRef2;
            awaitPointerEventScope2 = awaitPointerEventScope3;
            PointerEvent pointerEvent = (PointerEvent) obj;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i3);
                if (PointerId.m12466equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                    break;
                }
                i3++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null) {
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    while (true) {
                        if (i >= size2) {
                            pointerInputChange2 = null;
                            break;
                        }
                        pointerInputChange2 = changes2.get(i);
                        if (pointerInputChange2.getPressed()) {
                            break;
                        }
                        i++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange2;
                    if (pointerInputChange4 != null) {
                        longRef3.element = pointerInputChange4.getId();
                        longRef = longRef3;
                    }
                }
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1 = longRef;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label = 1;
                objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1, 1, null);
                if (objAwaitPointerEvent$default != coroutine_suspended) {
                    return coroutine_suspended;
                }
                Ref.LongRef longRef4 = longRef;
                obj = objAwaitPointerEvent$default;
                longRef3 = longRef4;
                PointerEvent pointerEvent2 = (PointerEvent) obj;
                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                int size3 = changes3.size();
                int i32 = 0;
                while (true) {
                    if (i32 < size3) {
                    }
                    i32++;
                }
                PointerInputChange pointerInputChange32 = pointerInputChange;
                if (pointerInputChange32 == null) {
                    pointerInputChange32 = null;
                }
            }
            if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                return null;
            }
            return pointerInputChange32;
        }
        ResultKt.throwOnFailure(obj);
        if (m7911isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        longRef = new Ref.LongRef();
        longRef.element = j;
        awaitPointerEventScope2 = awaitPointerEventScope;
        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1 = longRef;
        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label = 1;
        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1, 1, null);
        if (objAwaitPointerEvent$default != coroutine_suspended) {
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$2 */
    /* loaded from: classes4.dex */
    public static final class C04562 extends Lambda implements Function1<Offset, Unit> {
        public static final C04562 INSTANCE = ;

        /* renamed from: invoke-k-4lQ0M */
        public final void m7918invokek4lQ0M(long j) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            m7918invokek4lQ0M(offset.getPackedValue());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$3 */
    /* loaded from: classes4.dex */
    public static final class C04573 extends Lambda implements Function0<Unit> {
        public static final C04573 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = C04562.INSTANCE;
        }
        Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = C04573.INSTANCE;
        }
        Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = C04584.INSTANCE;
        }
        return detectHorizontalDragGestures(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$4 */
    /* loaded from: classes4.dex */
    public static final class C04584 extends Lambda implements Function0<Unit> {
        public static final C04584 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", m7120f = "DragGestureDetector.kt", m7121i = {0, 1, 1}, m7122l = {538, 540, 551}, m7123m = "invokeSuspend", m7124n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "overSlop"}, m7125s = {"L$0", "L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5 */
    /* loaded from: classes3.dex */
    public static final class C04595 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function0<Unit> $onDragCancel;
        public final /* synthetic */ Function0<Unit> $onDragEnd;
        public final /* synthetic */ Function1<Offset, Unit> $onDragStart;
        public final /* synthetic */ Function2<PointerInputChange, Float, Unit> $onHorizontalDrag;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04595(Function1<? super Offset, Unit> function1, Function2<? super PointerInputChange, ? super Float, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super C04595> continuation) {
            super(2, continuation);
            this.$onDragStart = function1;
            this.$onHorizontalDrag = function2;
            this.$onDragEnd = function0;
            this.$onDragCancel = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C04595 c04595 = new C04595(this.$onDragStart, this.$onHorizontalDrag, this.$onDragEnd, this.$onDragCancel, continuation);
            c04595.L$0 = obj;
            return c04595;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04595) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            AwaitPointerEventScope awaitPointerEventScope;
            AwaitPointerEventScope awaitPointerEventScope2;
            Ref.FloatRef floatRef;
            PointerInputChange pointerInputChange;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope3;
                this.label = 1;
                Object objAwaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope3, false, null, this, 2, null);
                if (objAwaitFirstDown$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                awaitPointerEventScope = awaitPointerEventScope3;
                obj = objAwaitFirstDown$default;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            this.$onDragEnd.invoke();
                        } else {
                            this.$onDragCancel.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                    floatRef = (Ref.FloatRef) this.L$1;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        this.$onDragStart.invoke(Offset.m11088boximpl(pointerInputChange.getPosition()));
                        this.$onHorizontalDrag.invoke(pointerInputChange, Boxing.boxFloat(floatRef.element));
                        long id = pointerInputChange.getId();
                        AnonymousClass1 anonymousClass1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.5.1
                            public final /* synthetic */ Function2<PointerInputChange, Float, Unit> $onHorizontalDrag;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public AnonymousClass1(Function2<? super PointerInputChange, ? super Float, Unit> function2) {
                                super(1);
                                function2 = function2;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                                invoke2(pointerInputChange2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke */
                            public final void invoke2(@NotNull PointerInputChange pointerInputChange2) {
                                function2.invoke(pointerInputChange2, Float.valueOf(Offset.m11099getXimpl(PointerEventKt.positionChange(pointerInputChange2))));
                                pointerInputChange2.consume();
                            }
                        };
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                        obj = DragGestureDetectorKt.m7910horizontalDragjO51t88(awaitPointerEventScope2, id, anonymousClass1, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            long id2 = pointerInputChange2.getId();
            int type = pointerInputChange2.getType();
            Function2<PointerInputChange, Float, Unit> function2 = new Function2<PointerInputChange, Float, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange3, Float f) {
                    invoke(pointerInputChange3, f.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull PointerInputChange pointerInputChange3, float f) {
                    pointerInputChange3.consume();
                    floatRef2.element = f;
                }
            };
            this.L$0 = awaitPointerEventScope;
            this.L$1 = floatRef2;
            this.label = 2;
            obj = DragGestureDetectorKt.m7898awaitHorizontalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, id2, type, function2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            awaitPointerEventScope2 = awaitPointerEventScope;
            floatRef = floatRef2;
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
            }
            return Unit.INSTANCE;
        }

        /* compiled from: DragGestureDetector.kt */
        @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1 */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1 extends Lambda implements Function1<PointerInputChange, Unit> {
            public final /* synthetic */ Function2<PointerInputChange, Float, Unit> $onHorizontalDrag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Function2<? super PointerInputChange, ? super Float, Unit> function2) {
                super(1);
                function2 = function2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                invoke2(pointerInputChange2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull PointerInputChange pointerInputChange2) {
                function2.invoke(pointerInputChange2, Float.valueOf(Offset.m11099getXimpl(PointerEventKt.positionChange(pointerInputChange2))));
                pointerInputChange2.consume();
            }
        }
    }

    @Nullable
    public static final Object detectHorizontalDragGestures(@NotNull PointerInputScope pointerInputScope, @NotNull Function1<? super Offset, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function2<? super PointerInputChange, ? super Float, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C04595(function1, function2, function0, function02, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x00fe, code lost:
    
        if (r3.invoke(r15).booleanValue() != false) goto L113;
     */
    /* JADX WARN: Path cross not found for [B:111:0x00f4, B:99:0x00ca], limit reached: 60 */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00c4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x008e -> B:87:0x0094). Please report as a decompilation issue!!! */
    @Nullable
    /* renamed from: drag-VnAYq1g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7907dragVnAYq1g(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j, @NotNull Function1<? super PointerInputChange, Unit> function1, @NotNull Function1<? super PointerInputChange, Boolean> function12, @NotNull Function1<? super PointerInputChange, Boolean> function13, @NotNull Continuation<? super PointerInputChange> continuation) throws Throwable {
        DragGestureDetectorKt$drag$2 dragGestureDetectorKt$drag$2;
        long id;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function1<? super PointerInputChange, Boolean> function14;
        Function1<? super PointerInputChange, Boolean> function15;
        DragGestureDetectorKt$drag$2 dragGestureDetectorKt$drag$22;
        Function1<? super PointerInputChange, Unit> function16;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope3;
        Object objAwaitPointerEvent$default;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        int i;
        if (continuation instanceof DragGestureDetectorKt$drag$2) {
            dragGestureDetectorKt$drag$2 = (DragGestureDetectorKt$drag$2) continuation;
            int i2 = dragGestureDetectorKt$drag$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$2.label = i2 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$drag$2 = new DragGestureDetectorKt$drag$2(continuation);
            }
        }
        Object obj = dragGestureDetectorKt$drag$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dragGestureDetectorKt$drag$2.label;
        int i4 = 1;
        PointerEventPass pointerEventPass = null;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            id = j;
            if (m7911isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), id)) {
                return null;
            }
            awaitPointerEventScope2 = awaitPointerEventScope;
            function14 = function12;
            function15 = function13;
            dragGestureDetectorKt$drag$22 = dragGestureDetectorKt$drag$2;
            function16 = function1;
            longRef = new Ref.LongRef();
            longRef.element = id;
            awaitPointerEventScope3 = awaitPointerEventScope2;
            dragGestureDetectorKt$drag$22.L$0 = awaitPointerEventScope2;
            dragGestureDetectorKt$drag$22.L$1 = function16;
            dragGestureDetectorKt$drag$22.L$2 = function14;
            dragGestureDetectorKt$drag$22.L$3 = function15;
            dragGestureDetectorKt$drag$22.L$4 = awaitPointerEventScope3;
            dragGestureDetectorKt$drag$22.L$5 = longRef;
            dragGestureDetectorKt$drag$22.label = i4;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$drag$22, i4, pointerEventPass);
            if (objAwaitPointerEvent$default == coroutine_suspended) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$drag$2.L$5;
            awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$drag$2.L$4;
            Function1<? super PointerInputChange, Boolean> function17 = (Function1) dragGestureDetectorKt$drag$2.L$3;
            Function1<? super PointerInputChange, Boolean> function18 = (Function1) dragGestureDetectorKt$drag$2.L$2;
            Function1<? super PointerInputChange, Unit> function19 = (Function1) dragGestureDetectorKt$drag$2.L$1;
            AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$drag$2.L$0;
            ResultKt.throwOnFailure(obj);
            dragGestureDetectorKt$drag$22 = dragGestureDetectorKt$drag$2;
            function16 = function19;
            Ref.LongRef longRef3 = longRef2;
            function14 = function18;
            function15 = function17;
            PointerEvent pointerEvent = (PointerEvent) obj;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i5 = 0;
            while (true) {
                if (i5 < size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i5);
                i = i5;
                if (PointerId.m12466equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                    break;
                }
                i5 = i + 1;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null) {
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size2) {
                            pointerInputChange2 = null;
                            break;
                        }
                        pointerInputChange2 = changes2.get(i6);
                        if (pointerInputChange2.getPressed()) {
                            break;
                        }
                        i6++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange2;
                    if (pointerInputChange4 != null) {
                        longRef3.element = pointerInputChange4.getId();
                        pointerEventPass = null;
                        awaitPointerEventScope2 = awaitPointerEventScope4;
                        i4 = 1;
                        longRef = longRef3;
                        dragGestureDetectorKt$drag$22.L$0 = awaitPointerEventScope2;
                        dragGestureDetectorKt$drag$22.L$1 = function16;
                        dragGestureDetectorKt$drag$22.L$2 = function14;
                        dragGestureDetectorKt$drag$22.L$3 = function15;
                        dragGestureDetectorKt$drag$22.L$4 = awaitPointerEventScope3;
                        dragGestureDetectorKt$drag$22.L$5 = longRef;
                        dragGestureDetectorKt$drag$22.label = i4;
                        objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$drag$22, i4, pointerEventPass);
                        if (objAwaitPointerEvent$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Ref.LongRef longRef4 = longRef;
                        awaitPointerEventScope4 = awaitPointerEventScope2;
                        obj = objAwaitPointerEvent$default;
                        longRef3 = longRef4;
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i52 = 0;
                        while (true) {
                            if (i52 < size3) {
                            }
                            i52 = i + 1;
                        }
                        PointerInputChange pointerInputChange32 = pointerInputChange;
                        if (pointerInputChange32 == null) {
                            pointerInputChange32 = null;
                        }
                    }
                }
            }
            if (pointerInputChange32 == null || function15.invoke(pointerInputChange32).booleanValue()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange32)) {
                return pointerInputChange32;
            }
            function16.invoke(pointerInputChange32);
            id = pointerInputChange32.getId();
            pointerEventPass = null;
            awaitPointerEventScope2 = awaitPointerEventScope4;
            i4 = 1;
            longRef = new Ref.LongRef();
            longRef.element = id;
            awaitPointerEventScope3 = awaitPointerEventScope2;
            dragGestureDetectorKt$drag$22.L$0 = awaitPointerEventScope2;
            dragGestureDetectorKt$drag$22.L$1 = function16;
            dragGestureDetectorKt$drag$22.L$2 = function14;
            dragGestureDetectorKt$drag$22.L$3 = function15;
            dragGestureDetectorKt$drag$22.L$4 = awaitPointerEventScope3;
            dragGestureDetectorKt$drag$22.L$5 = longRef;
            dragGestureDetectorKt$drag$22.label = i4;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$drag$22, i4, pointerEventPass);
            if (objAwaitPointerEvent$default == coroutine_suspended) {
            }
        }
    }

    /* renamed from: drag-VnAYq1g$$forInline */
    private static final Object m7908dragVnAYq1g$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Function1<? super PointerInputChange, Boolean> function12, Function1<? super PointerInputChange, Boolean> function13, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        long id = j;
        if (m7911isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), id)) {
            return null;
        }
        while (true) {
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.element = id;
            while (true) {
                int i = 0;
                InlineMarker.mark(0);
                Object objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
                InlineMarker.mark(1);
                PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent$default;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i2);
                    if (Boolean.valueOf(PointerId.m12466equalsimpl0(pointerInputChange.getId(), longRef.element)).booleanValue()) {
                        break;
                    }
                    i2++;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 == null) {
                    pointerInputChange2 = null;
                    break;
                }
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    while (true) {
                        if (i >= size2) {
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = changes2.get(i);
                        if (Boolean.valueOf(pointerInputChange3.getPressed()).booleanValue()) {
                            break;
                        }
                        i++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 == null) {
                        break;
                    }
                    longRef.element = pointerInputChange4.getId();
                } else if (function12.invoke(pointerInputChange2).booleanValue()) {
                    break;
                }
            }
            if (pointerInputChange2 == null || function13.invoke(pointerInputChange2).booleanValue()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                return pointerInputChange2;
            }
            function1.invoke(pointerInputChange2);
            id = pointerInputChange2.getId();
        }
    }

    /* renamed from: awaitDragOrUp-jO51t88 */
    private static final Object m7896awaitDragOrUpjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Boolean> function1, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j;
        while (true) {
            int i = 0;
            InlineMarker.mark(0);
            PointerInputChange pointerInputChange2 = null;
            Object objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            InlineMarker.mark(1);
            PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i2);
                if (Boolean.valueOf(PointerId.m12466equalsimpl0(pointerInputChange.getId(), longRef.element)).booleanValue()) {
                    break;
                }
                i2++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i >= size2) {
                        break;
                    }
                    PointerInputChange pointerInputChange4 = changes2.get(i);
                    if (Boolean.valueOf(pointerInputChange4.getPressed()).booleanValue()) {
                        pointerInputChange2 = pointerInputChange4;
                        break;
                    }
                    i++;
                }
                PointerInputChange pointerInputChange5 = pointerInputChange2;
                if (pointerInputChange5 == null) {
                    return pointerInputChange3;
                }
                longRef.element = pointerInputChange5.getId();
            } else if (function1.invoke(pointerInputChange3).booleanValue()) {
                return pointerInputChange3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00e2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x017f -> B:127:0x0185). Please report as a decompilation issue!!! */
    @Nullable
    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7901awaitPointerSlopOrCancellationpn7EDYM(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j, int i, @NotNull PointerDirectionConfig pointerDirectionConfig, @NotNull Function2<? super PointerInputChange, ? super Offset, Unit> function2, @NotNull Continuation<? super PointerInputChange> continuation) throws Throwable {
        DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
        long jM11115getZeroF1C5BW0;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        PointerDirectionConfig pointerDirectionConfig2;
        DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$12;
        float f;
        Function2<? super PointerInputChange, ? super Offset, Unit> function22;
        long j2;
        Function2<? super PointerInputChange, ? super Offset, Unit> function23;
        Ref.LongRef longRef2;
        List<PointerInputChange> changes;
        int size;
        int i2;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        int i3;
        List<PointerInputChange> list;
        int i4;
        Object objAwaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) continuation;
            int i5 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label = i5 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(continuation);
            }
        }
        Object obj3 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label;
        int i7 = 1;
        PointerEventPass pointerEventPass = null;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj3);
            if (m7911isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                return null;
            }
            float fM7912pointerSlopE8SPZFQ = m7912pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
            Ref.LongRef longRef3 = new Ref.LongRef();
            longRef3.element = j;
            jM11115getZeroF1C5BW0 = Offset.INSTANCE.m11115getZeroF1C5BW0();
            longRef = longRef3;
            awaitPointerEventScope2 = awaitPointerEventScope;
            pointerDirectionConfig2 = pointerDirectionConfig;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
            f = fM7912pointerSlopE8SPZFQ;
            function22 = function2;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig2;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = function22;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = longRef;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = pointerEventPass;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = f;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = i7;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i7, pointerEventPass);
            if (objAwaitPointerEvent$default != coroutine_suspended) {
            }
        } else if (i6 == 1) {
            long j3 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.J$0;
            float f2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$0;
            longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$3;
            function23 = (Function2) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$2;
            PointerDirectionConfig pointerDirectionConfig3 = (PointerDirectionConfig) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$1;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$0;
            ResultKt.throwOnFailure(obj3);
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
            f = f2;
            pointerDirectionConfig2 = pointerDirectionConfig3;
            awaitPointerEventScope2 = awaitPointerEventScope3;
            j2 = j3;
            PointerEvent pointerEvent = (PointerEvent) obj3;
            changes = pointerEvent.getChanges();
            size = changes.size();
            int i8 = 0;
            i2 = 0;
            while (true) {
                if (i2 < size) {
                }
                i2 = i3 + 1;
                changes = list;
                size = i4;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
                return pointerEventPass;
            }
            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            }
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig2;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = function22;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = longRef;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = pointerEventPass;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = f;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = i7;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i7, pointerEventPass);
            if (objAwaitPointerEvent$default != coroutine_suspended) {
            }
        } else {
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j4 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.J$0;
            float f3 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$0;
            PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$4;
            Ref.LongRef longRef4 = (Ref.LongRef) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$3;
            Function2<? super PointerInputChange, ? super Offset, Unit> function24 = (Function2) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$2;
            PointerDirectionConfig pointerDirectionConfig4 = (PointerDirectionConfig) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$1;
            AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$0;
            ResultKt.throwOnFailure(obj3);
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
            f = f3;
            char c = 2;
            long j5 = j4;
            pointerDirectionConfig2 = pointerDirectionConfig4;
            awaitPointerEventScope2 = awaitPointerEventScope4;
            longRef = longRef4;
            function23 = function24;
            if (!pointerInputChange2.isConsumed()) {
                return null;
            }
            pointerEventPass = null;
            function22 = function23;
            jM11115getZeroF1C5BW0 = j5;
            i7 = 1;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig2;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = function22;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = longRef;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = pointerEventPass;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = f;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = i7;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i7, pointerEventPass);
            if (objAwaitPointerEvent$default != coroutine_suspended) {
                return coroutine_suspended;
            }
            long j6 = jM11115getZeroF1C5BW0;
            function23 = function22;
            longRef2 = longRef;
            obj3 = objAwaitPointerEvent$default;
            j2 = j6;
            PointerEvent pointerEvent2 = (PointerEvent) obj3;
            changes = pointerEvent2.getChanges();
            size = changes.size();
            int i82 = 0;
            i2 = 0;
            while (true) {
                if (i2 < size) {
                    obj = pointerEventPass;
                    break;
                }
                obj = changes.get(i2);
                i3 = i2;
                list = changes;
                i4 = size;
                if (PointerId.m12466equalsimpl0(((PointerInputChange) obj).getId(), longRef2.element)) {
                    break;
                }
                i2 = i3 + 1;
                changes = list;
                size = i4;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null || pointerInputChange.isConsumed()) {
                return pointerEventPass;
            }
            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i82 >= size2) {
                        obj2 = pointerEventPass;
                        break;
                    }
                    obj2 = changes2.get(i82);
                    if (((PointerInputChange) obj2).getPressed()) {
                        break;
                    }
                    i82++;
                }
                PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                if (pointerInputChange3 == null) {
                    return pointerEventPass;
                }
                longRef2.element = pointerInputChange3.getId();
                function22 = function23;
                i7 = 1;
                long j7 = j2;
                longRef = longRef2;
                jM11115getZeroF1C5BW0 = j7;
            } else {
                Ref.LongRef longRef5 = longRef2;
                long jM11104plusMKHz9U = Offset.m11104plusMKHz9U(j2, Offset.m11103minusMKHz9U(pointerInputChange.getPosition(), pointerInputChange.getPreviousPosition()));
                if (pointerDirectionConfig2.mo7914calculateDeltaChangek4lQ0M(jM11104plusMKHz9U) < f) {
                    PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = function23;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = longRef5;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = pointerInputChange;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = f;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.J$0 = jM11104plusMKHz9U;
                    c = 2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = 2;
                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    longRef = longRef5;
                    pointerInputChange2 = pointerInputChange;
                    j5 = jM11104plusMKHz9U;
                    if (!pointerInputChange2.isConsumed()) {
                    }
                } else {
                    function23.invoke(pointerInputChange, Offset.m11088boximpl(pointerDirectionConfig2.mo7915calculatePostSlopOffset8S9VItk(jM11104plusMKHz9U, f)));
                    if (pointerInputChange.isConsumed()) {
                        return pointerInputChange;
                    }
                    longRef = longRef5;
                    i7 = 1;
                    pointerEventPass = null;
                    function22 = function23;
                    jM11115getZeroF1C5BW0 = Offset.INSTANCE.m11115getZeroF1C5BW0();
                }
            }
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig2;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = function22;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = longRef;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = pointerEventPass;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = f;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.J$0 = jM11115getZeroF1C5BW0;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = i7;
            objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i7, pointerEventPass);
            if (objAwaitPointerEvent$default != coroutine_suspended) {
            }
        }
    }

    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM$$forInline */
    private static final Object m7902awaitPointerSlopOrCancellationpn7EDYM$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j, int i, PointerDirectionConfig pointerDirectionConfig, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        long jM11115getZeroF1C5BW0;
        PointerInputChange pointerInputChange2;
        if (m7911isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        float fM7912pointerSlopE8SPZFQ = m7912pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j;
        long jM11115getZeroF1C5BW02 = Offset.INSTANCE.m11115getZeroF1C5BW0();
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
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i2);
                List<PointerInputChange> list = changes;
                int i3 = size;
                if (Boolean.valueOf(PointerId.m12466equalsimpl0(pointerInputChange.getId(), longRef.element)).booleanValue()) {
                    break;
                }
                i2++;
                changes = list;
                size = i3;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i4);
                    if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    i4++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                longRef.element = pointerInputChange4.getId();
            } else {
                jM11115getZeroF1C5BW02 = Offset.m11104plusMKHz9U(jM11115getZeroF1C5BW02, Offset.m11103minusMKHz9U(pointerInputChange3.getPosition(), pointerInputChange3.getPreviousPosition()));
                if (pointerDirectionConfig.mo7914calculateDeltaChangek4lQ0M(jM11115getZeroF1C5BW02) < fM7912pointerSlopE8SPZFQ) {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    InlineMarker.mark(0);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
                    InlineMarker.mark(1);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                } else {
                    function2.invoke(pointerInputChange3, Offset.m11088boximpl(pointerDirectionConfig.mo7915calculatePostSlopOffset8S9VItk(jM11115getZeroF1C5BW02, fM7912pointerSlopE8SPZFQ)));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    jM11115getZeroF1C5BW0 = Offset.INSTANCE.m11115getZeroF1C5BW0();
                    jM11115getZeroF1C5BW02 = jM11115getZeroF1C5BW0;
                }
            }
            jM11115getZeroF1C5BW0 = jM11115getZeroF1C5BW02;
            jM11115getZeroF1C5BW02 = jM11115getZeroF1C5BW0;
        }
    }

    static {
        float fM13666constructorimpl = C2046Dp.m13666constructorimpl((float) 0.125d);
        mouseSlop = fM13666constructorimpl;
        float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(18);
        defaultTouchSlop = fM13666constructorimpl2;
        mouseToTouchSlopRatio = fM13666constructorimpl / fM13666constructorimpl2;
    }

    @NotNull
    public static final PointerDirectionConfig getHorizontalPointerDirectionConfig() {
        return HorizontalPointerDirectionConfig;
    }

    @NotNull
    public static final PointerDirectionConfig getVerticalPointerDirectionConfig() {
        return VerticalPointerDirectionConfig;
    }

    @NotNull
    public static final PointerDirectionConfig getBidirectionalPointerDirectionConfig() {
        return BidirectionalPointerDirectionConfig;
    }

    @NotNull
    public static final PointerDirectionConfig toPointerDirectionConfig(@NotNull Orientation orientation) {
        return orientation == Orientation.Vertical ? VerticalPointerDirectionConfig : HorizontalPointerDirectionConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0013  */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6, types: [androidx.compose.ui.input.pointer.PointerInputChange] */
    @Nullable
    /* renamed from: awaitLongPressOrCancellation-rnUCldI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7900awaitLongPressOrCancellationrnUCldI(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j, @NotNull Continuation<? super PointerInputChange> continuation) throws Throwable {
        DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1;
        PointerInputChange pointerInputChange;
        Object obj;
        Ref.ObjectRef objectRef;
        if (continuation instanceof DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (DragGestureDetectorKt$awaitLongPressOrCancellation$1) continuation;
            int i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = i - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(continuation);
            }
        }
        Object obj2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            if (m7911isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                return null;
            }
            List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
            int size = changes.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i3);
                if (PointerId.m12466equalsimpl0(pointerInputChange.getId(), j)) {
                    break;
                }
                i3++;
            }
            obj = pointerInputChange;
            if (obj == 0) {
                return null;
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            objectRef3.element = obj;
            long longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
            try {
                DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(objectRef3, objectRef2, null);
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0 = obj;
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1 = objectRef2;
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = 1;
                if (awaitPointerEventScope.withTimeout(longPressTimeoutMillis, dragGestureDetectorKt$awaitLongPressOrCancellation$2, dragGestureDetectorKt$awaitLongPressOrCancellation$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return null;
            } catch (PointerEventTimeoutCancellationException unused) {
                objectRef = objectRef2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1;
            obj = (PointerInputChange) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0;
            try {
                ResultKt.throwOnFailure(obj2);
                return null;
            } catch (PointerEventTimeoutCancellationException unused2) {
            }
        }
        PointerInputChange pointerInputChange2 = (PointerInputChange) objectRef.element;
        return pointerInputChange2 == null ? obj : pointerInputChange2;
    }

    /* renamed from: isPointerUp-DmW0f2w */
    public static final boolean m7911isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
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

    /* renamed from: pointerSlop-E8SPZFQ */
    public static final float m7912pointerSlopE8SPZFQ(@NotNull ViewConfiguration viewConfiguration, int i) {
        return PointerType.m12556equalsimpl0(i, PointerType.INSTANCE.m12561getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }
}
