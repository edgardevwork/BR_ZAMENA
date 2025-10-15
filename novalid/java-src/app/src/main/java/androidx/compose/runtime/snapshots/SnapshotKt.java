package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.AtomicInt;
import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.WeakReference;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.exifinterface.media.ExifInterface;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: Snapshot.kt */
@Metadata(m7104d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\n\u001a\b\u0010)\u001a\u00020\bH\u0002\u001a6\u0010)\u001a\u0002H*\"\u0004\b\u0000\u0010*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u0002H*0\u000fH\u0002¢\u0006\u0002\u0010,\u001a\b\u0010-\u001a\u00020\bH\u0002\u001a4\u0010.\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\b\b\u0002\u00101\u001a\u000202H\u0002\u001a\u001f\u00103\u001a\u0002H*\"\b\b\u0000\u0010**\u0002042\u0006\u00105\u001a\u0002H*H\u0001¢\u0006\u0002\u00106\u001a'\u00103\u001a\u0002H*\"\b\b\u0000\u0010**\u0002042\u0006\u00105\u001a\u0002H*2\u0006\u00107\u001a\u00020\u0007H\u0001¢\u0006\u0002\u00108\u001a\b\u00109\u001a\u00020\u0007H\u0000\u001aL\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\b\b\u0002\u0010<\u001a\u000202H\u0002\u001aB\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\u0014\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000fH\u0002\u001a\u0018\u0010?\u001a\u00020\b2\u0006\u00107\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u0016H\u0001\u001a.\u0010A\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000204\u0018\u00010B2\u0006\u00109\u001a\u00020C2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020\u0010H\u0002\u001a\u0010\u0010F\u001a\u0002022\u0006\u0010@\u001a\u00020\u0016H\u0002\u001a\u0010\u0010G\u001a\u00020\b2\u0006\u0010@\u001a\u00020\u0016H\u0002\u001a\b\u0010H\u001a\u00020IH\u0002\u001a1\u0010J\u001a\u0004\u0018\u0001H*\"\b\b\u0000\u0010**\u0002042\u0006\u00105\u001a\u0002H*2\u0006\u0010K\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0002\u0010L\u001a\u0010\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\u0001H\u0000\u001a\b\u0010O\u001a\u00020IH\u0002\u001a\"\u0010P\u001a\u0002H*\"\u0004\b\u0000\u0010*2\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H*0QH\u0081\b¢\u0006\u0002\u0010R\u001a>\u0010S\u001a\u0002H*\"\u0004\b\u0000\u0010*2\u0006\u0010T\u001a\u00020\u00072!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u0002H*0\u000fH\u0002¢\u0006\u0002\u0010U\u001a:\u0010V\u001a\u0002H*\"\b\b\u0000\u0010**\u00020\u00072!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u0002H*0\u000fH\u0002¢\u0006\u0002\u0010W\u001a\u0018\u0010X\u001a\u00020\u00012\u0006\u0010K\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0010H\u0000\u001a\u0012\u0010Y\u001a\u0004\u0018\u0001042\u0006\u0010@\u001a\u00020\u0016H\u0002\u001a \u0010Z\u001a\u0002022\u0006\u0010[\u001a\u0002042\u0006\u00107\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0010H\u0002\u001a \u0010Z\u001a\u0002022\u0006\u00109\u001a\u00020\u00012\u0006\u0010\\\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0010H\u0002\u001a\u0010\u0010]\u001a\u00020\b2\u0006\u00107\u001a\u00020\u0007H\u0002\u001a\u001c\u0010^\u001a\u00020\u0010*\u00020\u00102\u0006\u0010_\u001a\u00020\u00012\u0006\u0010`\u001a\u00020\u0001H\u0000\u001a!\u0010a\u001a\u000204*\u0002042\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002020\u000fH\u0082\b\u001a#\u0010c\u001a\u0002H*\"\b\b\u0000\u0010**\u000204*\u0002H*2\u0006\u0010@\u001a\u00020\u0016H\u0000¢\u0006\u0002\u0010d\u001a+\u0010e\u001a\u0002H*\"\b\b\u0000\u0010**\u000204*\u0002H*2\u0006\u0010@\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010f\u001a+\u0010g\u001a\u0002H*\"\b\b\u0000\u0010**\u000204*\u0002H*2\u0006\u0010@\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010f\u001aK\u0010h\u001a\u0002Hi\"\b\b\u0000\u0010**\u000204\"\u0004\b\u0001\u0010i*\u0002H*2\u0006\u0010@\u001a\u00020\u00162\u0006\u0010j\u001a\u0002H*2\u0017\u0010+\u001a\u0013\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u0002Hi0\u000f¢\u0006\u0002\bkH\u0080\b¢\u0006\u0002\u0010l\u001a3\u0010m\u001a\u0002H*\"\b\b\u0000\u0010**\u000204*\u0002H*2\u0006\u0010@\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u00072\u0006\u0010j\u001a\u0002H*H\u0000¢\u0006\u0002\u0010n\u001a!\u0010J\u001a\u0002H*\"\b\b\u0000\u0010**\u000204*\u0002H*2\u0006\u0010@\u001a\u00020\u0016¢\u0006\u0002\u0010d\u001a)\u0010J\u001a\u0002H*\"\b\b\u0000\u0010**\u000204*\u0002H*2\u0006\u0010@\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u0007¢\u0006\u0002\u0010f\u001aE\u0010o\u001a\u0002Hi\"\b\b\u0000\u0010**\u000204\"\u0004\b\u0001\u0010i*\u0002H*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u0011H*¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(5\u0012\u0004\u0012\u0002Hi0\u000fH\u0086\b¢\u0006\u0002\u0010p\u001aC\u0010q\u001a\u0002Hi\"\b\b\u0000\u0010**\u000204\"\u0004\b\u0001\u0010i*\u0002H*2\u0006\u0010@\u001a\u00020\u00162\u0017\u0010+\u001a\u0013\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u0002Hi0\u000f¢\u0006\u0002\bkH\u0086\b¢\u0006\u0002\u0010r\u001aK\u0010q\u001a\u0002Hi\"\b\b\u0000\u0010**\u000204\"\u0004\b\u0001\u0010i*\u0002H*2\u0006\u0010@\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u00072\u0017\u0010+\u001a\u0013\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u0002Hi0\u000f¢\u0006\u0002\bkH\u0086\b¢\u0006\u0002\u0010s\u001a+\u0010t\u001a\u0002H*\"\b\b\u0000\u0010**\u000204*\u0002H*2\u0006\u0010@\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\",\u0010\u0002\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00040\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\".\u0010\t\u001a\"\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nj\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b`\rX\u0082\u0004¢\u0006\u0002\n\u0000\")\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000f0\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001c\u0010\u0018\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010#\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010&\"\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070(X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006u"}, m7105d2 = {"INVALID_SNAPSHOT", "", "applyObservers", "", "Lkotlin/Function2;", "", "", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "currentGlobalSnapshot", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "emptyLambda", "Lkotlin/Function1;", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "Lkotlin/ParameterName;", "name", "invalid", "extraStateObjects", "Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "globalWriteObservers", "lock", "getLock$annotations", "()V", "getLock", "()Ljava/lang/Object;", "nextSnapshotId", "openSnapshots", "pendingApplyObserverCount", "Landroidx/compose/runtime/AtomicInt;", "pinningTable", "Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "snapshotInitializer", "getSnapshotInitializer$annotations", "getSnapshotInitializer", "()Landroidx/compose/runtime/snapshots/Snapshot;", "threadSnapshot", "Landroidx/compose/runtime/SnapshotThreadLocal;", "advanceGlobalSnapshot", ExifInterface.GPS_DIRECTION_TRUE, "block", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "checkAndOverwriteUnusedRecordsLocked", "createTransparentSnapshotWithNoParentReadObserver", "previousSnapshot", "readObserver", "ownsPreviousSnapshot", "", "current", "Landroidx/compose/runtime/snapshots/StateRecord;", "r", "(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "snapshot", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "currentSnapshot", "mergedReadObserver", "parentObserver", "mergeReadObserver", "mergedWriteObserver", "writeObserver", "notifyWrite", "state", "optimisticMerges", "", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "applyingSnapshot", "invalidSnapshots", "overwriteUnusedRecordsLocked", "processForUnusedRecordsLocked", "readError", "", "readable", "id", "(Landroidx/compose/runtime/snapshots/StateRecord;ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/StateRecord;", "releasePinningLocked", "handle", "reportReadonlySnapshotWrite", "sync", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "takeNewGlobalSnapshot", "previousGlobalSnapshot", "(Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "takeNewSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "trackPinning", "usedLocked", "valid", "data", "candidateSnapshot", "validateOpen", "addRange", "from", "until", "findYoungestOr", "predicate", "newOverwritableRecordLocked", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "newWritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "newWritableRecordLocked", "overwritable", "R", "candidate", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/StateRecord;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "overwritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "withCurrent", "(Landroidx/compose/runtime/snapshots/StateRecord;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writableRecord", "runtime_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 5 SnapshotWeakSet.kt\nandroidx/compose/runtime/snapshots/SnapshotWeakSet\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2294:1\n1714#1:2295\n1714#1:2298\n1714#1:2300\n1714#1:2308\n1714#1:2317\n1714#1:2319\n2033#1,9:2321\n1714#1:2358\n1714#1:2360\n1714#1:2362\n1714#1:2365\n1714#1:2367\n1714#1:2376\n82#2:2296\n82#2:2297\n82#2:2299\n82#2:2301\n82#2:2309\n82#2:2318\n82#2:2320\n82#2:2359\n82#2:2361\n82#2:2363\n82#2:2366\n82#2:2368\n82#2:2377\n33#3,6:2302\n108#4,7:2310\n108#4,7:2369\n125#5,28:2330\n1#6:2364\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n611#1:2295\n1774#1:2298\n1800#1:2300\n1822#1:2308\n1852#1:2317\n1905#1:2319\n2015#1:2321,9\n2088#1:2358\n2097#1:2360\n2165#1:2362\n2177#1:2365\n2205#1:2367\n2270#1:2376\n611#1:2296\n1714#1:2297\n1774#1:2299\n1800#1:2301\n1822#1:2309\n1852#1:2318\n1905#1:2320\n2088#1:2359\n2097#1:2361\n2165#1:2363\n2177#1:2366\n2205#1:2368\n2270#1:2377\n1814#1:2302,6\n1824#1:2310,7\n2228#1:2369,7\n2045#1:2330,28\n*E\n"})
/* loaded from: classes2.dex */
public final class SnapshotKt {
    private static final int INVALID_SNAPSHOT = 0;

    @NotNull
    private static List<? extends Function2<? super Set<? extends Object>, ? super Snapshot, Unit>> applyObservers;

    @NotNull
    private static final AtomicReference<GlobalSnapshot> currentGlobalSnapshot;

    @NotNull
    private static final SnapshotWeakSet<StateObject> extraStateObjects;

    @NotNull
    private static List<? extends Function1<Object, Unit>> globalWriteObservers;
    private static int nextSnapshotId;

    @NotNull
    private static SnapshotIdSet openSnapshots;

    @NotNull
    private static AtomicInt pendingApplyObserverCount;

    @NotNull
    private static final SnapshotDoubleIndexHeap pinningTable;

    @NotNull
    private static final Snapshot snapshotInitializer;

    @NotNull
    private static final Function1<SnapshotIdSet, Unit> emptyLambda = new Function1<SnapshotIdSet, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$emptyLambda$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SnapshotIdSet snapshotIdSet) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SnapshotIdSet snapshotIdSet) {
            invoke2(snapshotIdSet);
            return Unit.INSTANCE;
        }
    };

    @NotNull
    private static final SnapshotThreadLocal<Snapshot> threadSnapshot = new SnapshotThreadLocal<>();

    @NotNull
    private static final Object lock = new Object();

    @PublishedApi
    public static /* synthetic */ void getLock$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getSnapshotInitializer$annotations() {
    }

    public static final int trackPinning(int i, @NotNull SnapshotIdSet snapshotIdSet) {
        int iAdd;
        int iLowest = snapshotIdSet.lowest(i);
        synchronized (getLock()) {
            iAdd = pinningTable.add(iLowest);
        }
        return iAdd;
    }

    public static final void releasePinningLocked(int i) {
        pinningTable.remove(i);
    }

    @NotNull
    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = threadSnapshot.get();
        return snapshot == null ? currentGlobalSnapshot.get() : snapshot;
    }

    static {
        SnapshotIdSet.Companion companion = SnapshotIdSet.INSTANCE;
        openSnapshots = companion.getEMPTY();
        nextSnapshotId = 1;
        pinningTable = new SnapshotDoubleIndexHeap();
        extraStateObjects = new SnapshotWeakSet<>();
        applyObservers = CollectionsKt__CollectionsKt.emptyList();
        globalWriteObservers = CollectionsKt__CollectionsKt.emptyList();
        int i = nextSnapshotId;
        nextSnapshotId = i + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i, companion.getEMPTY());
        openSnapshots = openSnapshots.set(globalSnapshot.getId());
        AtomicReference<GlobalSnapshot> atomicReference = new AtomicReference<>(globalSnapshot);
        currentGlobalSnapshot = atomicReference;
        snapshotInitializer = atomicReference.get();
        pendingApplyObserverCount = new AtomicInt(0);
    }

    public static /* synthetic */ Snapshot createTransparentSnapshotWithNoParentReadObserver$default(Snapshot snapshot, Function1 function1, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return createTransparentSnapshotWithNoParentReadObserver(snapshot, function1, z);
    }

    public static final Snapshot createTransparentSnapshotWithNoParentReadObserver(Snapshot snapshot, Function1<Object, Unit> function1, boolean z) {
        boolean z2 = snapshot instanceof MutableSnapshot;
        if (z2 || snapshot == null) {
            return new TransparentObserverMutableSnapshot(z2 ? (MutableSnapshot) snapshot : null, function1, null, false, z);
        }
        return new TransparentObserverSnapshot(snapshot, function1, false, z);
    }

    public static /* synthetic */ Function1 mergedReadObserver$default(Function1 function1, Function1 function12, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return mergedReadObserver(function1, function12, z);
    }

    /* compiled from: Snapshot.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "state", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.runtime.snapshots.SnapshotKt$mergedReadObserver$1 */
    /* loaded from: classes.dex */
    public static final class C18311 extends Lambda implements Function1<Object, Unit> {
        public final /* synthetic */ Function1<Object, Unit> $parentObserver;
        public final /* synthetic */ Function1<Object, Unit> $readObserver;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18311(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
            super(1);
            function1 = function1;
            function1 = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull Object obj) {
            function1.invoke(obj);
            function1.invoke(obj);
        }
    }

    public static final Function1<Object, Unit> mergedReadObserver(Function1<Object, Unit> function1, Function1<Object, Unit> function12, boolean z) {
        if (!z) {
            function12 = null;
        }
        if (function1 == null || function12 == null || Intrinsics.areEqual(function1, function12)) {
            return function1 == null ? function12 : function1;
        }
        return new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.mergedReadObserver.1
            public final /* synthetic */ Function1<Object, Unit> $parentObserver;
            public final /* synthetic */ Function1<Object, Unit> $readObserver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C18311(Function1<Object, Unit> function13, Function1<Object, Unit> function122) {
                super(1);
                function1 = function13;
                function1 = function122;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull Object obj) {
                function1.invoke(obj);
                function1.invoke(obj);
            }
        };
    }

    /* compiled from: Snapshot.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "state", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.runtime.snapshots.SnapshotKt$mergedWriteObserver$1 */
    /* loaded from: classes.dex */
    public static final class C18321 extends Lambda implements Function1<Object, Unit> {
        public final /* synthetic */ Function1<Object, Unit> $parentObserver;
        public final /* synthetic */ Function1<Object, Unit> $writeObserver;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18321(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
            super(1);
            function1 = function1;
            function1 = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull Object obj) {
            function1.invoke(obj);
            function1.invoke(obj);
        }
    }

    public static final Function1<Object, Unit> mergedWriteObserver(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        if (function1 == null || function12 == null || Intrinsics.areEqual(function1, function12)) {
            return function1 == null ? function12 : function1;
        }
        return new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.mergedWriteObserver.1
            public final /* synthetic */ Function1<Object, Unit> $parentObserver;
            public final /* synthetic */ Function1<Object, Unit> $writeObserver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C18321(Function1<Object, Unit> function13, Function1<Object, Unit> function122) {
                super(1);
                function1 = function13;
                function1 = function122;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull Object obj) {
                function1.invoke(obj);
                function1.invoke(obj);
            }
        };
    }

    @NotNull
    public static final Object getLock() {
        return lock;
    }

    @PublishedApi
    public static final <T> T sync(@NotNull Function0<? extends T> function0) {
        T tInvoke;
        synchronized (getLock()) {
            try {
                tInvoke = function0.invoke();
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        return tInvoke;
    }

    @NotNull
    public static final Snapshot getSnapshotInitializer() {
        return snapshotInitializer;
    }

    public static final <T> T takeNewGlobalSnapshot(Snapshot snapshot, Function1<? super SnapshotIdSet, ? extends T> function1) {
        T tInvoke = function1.invoke(openSnapshots.clear(snapshot.getId()));
        synchronized (getLock()) {
            int i = nextSnapshotId;
            nextSnapshotId = i + 1;
            openSnapshots = openSnapshots.clear(snapshot.getId());
            currentGlobalSnapshot.set(new GlobalSnapshot(i, openSnapshots));
            snapshot.dispose();
            openSnapshots = openSnapshots.set(i);
            Unit unit = Unit.INSTANCE;
        }
        return tInvoke;
    }

    public static final <T> T advanceGlobalSnapshot(Function1<? super SnapshotIdSet, ? extends T> function1) {
        GlobalSnapshot globalSnapshot;
        IdentityArraySet<StateObject> modified$runtime_release;
        T t;
        Snapshot snapshot = snapshotInitializer;
        Intrinsics.checkNotNull(snapshot, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (getLock()) {
            try {
                globalSnapshot = currentGlobalSnapshot.get();
                modified$runtime_release = globalSnapshot.getModified$runtime_release();
                if (modified$runtime_release != null) {
                    pendingApplyObserverCount.add(1);
                }
                t = (T) takeNewGlobalSnapshot(globalSnapshot, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (modified$runtime_release != null) {
            try {
                List<? extends Function2<? super Set<? extends Object>, ? super Snapshot, Unit>> list = applyObservers;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).invoke(modified$runtime_release, globalSnapshot);
                }
            } finally {
                pendingApplyObserverCount.add(-1);
            }
        }
        synchronized (getLock()) {
            try {
                checkAndOverwriteUnusedRecordsLocked();
                if (modified$runtime_release != null) {
                    Object[] values = modified$runtime_release.getValues();
                    int size2 = modified$runtime_release.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Object obj = values[i2];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        processForUnusedRecordsLocked((StateObject) obj);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t;
    }

    /* compiled from: Snapshot.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.runtime.snapshots.SnapshotKt$advanceGlobalSnapshot$3 */
    /* loaded from: classes.dex */
    public static final class C18303 extends Lambda implements Function1<SnapshotIdSet, Unit> {
        public static final C18303 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2(@NotNull SnapshotIdSet snapshotIdSet) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SnapshotIdSet snapshotIdSet) {
            invoke2(snapshotIdSet);
            return Unit.INSTANCE;
        }
    }

    public static final void advanceGlobalSnapshot() {
        advanceGlobalSnapshot(C18303.INSTANCE);
    }

    /* compiled from: Snapshot.kt */
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/snapshots/Snapshot;", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invoke", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/Snapshot;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt$takeNewSnapshot$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2294:1\n1714#2:2295\n82#3:2296\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt$takeNewSnapshot$1\n*L\n1835#1:2295\n1835#1:2296\n*E\n"})
    /* renamed from: androidx.compose.runtime.snapshots.SnapshotKt$takeNewSnapshot$1 */
    /* loaded from: classes.dex */
    public static final class C18331<T> extends Lambda implements Function1<SnapshotIdSet, T> {
        public final /* synthetic */ Function1<SnapshotIdSet, T> $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C18331(Function1<? super SnapshotIdSet, ? extends T> function1) {
            super(1);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Snapshot invoke(@NotNull SnapshotIdSet snapshotIdSet) {
            Snapshot snapshot = (Snapshot) function1.invoke(snapshotIdSet);
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(snapshot.getId());
                Unit unit = Unit.INSTANCE;
            }
            return snapshot;
        }
    }

    public static final <T extends Snapshot> T takeNewSnapshot(Function1<? super SnapshotIdSet, ? extends T> function1) {
        return (T) advanceGlobalSnapshot(new Function1<SnapshotIdSet, T>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.takeNewSnapshot.1
            public final /* synthetic */ Function1<SnapshotIdSet, T> $block;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C18331(Function1<? super SnapshotIdSet, ? extends T> function12) {
                super(1);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Snapshot invoke(@NotNull SnapshotIdSet snapshotIdSet) {
                Snapshot snapshot = (Snapshot) function1.invoke(snapshotIdSet);
                synchronized (SnapshotKt.getLock()) {
                    SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(snapshot.getId());
                    Unit unit = Unit.INSTANCE;
                }
                return snapshot;
            }
        });
    }

    public static final void validateOpen(Snapshot snapshot) {
        int iLowestOrDefault;
        if (openSnapshots.get(snapshot.getId())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Snapshot is not open: id=");
        sb.append(snapshot.getId());
        sb.append(", disposed=");
        sb.append(snapshot.getDisposed());
        sb.append(", applied=");
        MutableSnapshot mutableSnapshot = snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null;
        sb.append(mutableSnapshot != null ? Boolean.valueOf(mutableSnapshot.getApplied()) : "read-only");
        sb.append(", lowestPin=");
        synchronized (getLock()) {
            iLowestOrDefault = pinningTable.lowestOrDefault(-1);
        }
        sb.append(iLowestOrDefault);
        throw new IllegalStateException(sb.toString().toString());
    }

    private static final boolean valid(int i, int i2, SnapshotIdSet snapshotIdSet) {
        return (i2 == 0 || i2 > i || snapshotIdSet.get(i2)) ? false : true;
    }

    private static final boolean valid(StateRecord stateRecord, int i, SnapshotIdSet snapshotIdSet) {
        return valid(i, stateRecord.getSnapshotId(), snapshotIdSet);
    }

    public static final <T extends StateRecord> T readable(T t, int i, SnapshotIdSet snapshotIdSet) {
        T t2 = null;
        while (t != null) {
            if (valid(t, i, snapshotIdSet) && (t2 == null || t2.getSnapshotId() < t.getSnapshotId())) {
                t2 = t;
            }
            t = (T) t.getNext();
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    @NotNull
    public static final <T extends StateRecord> T readable(@NotNull T t, @NotNull StateObject stateObject) {
        T t2;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot current = companion.getCurrent();
        Function1<Object, Unit> readObserver$runtime_release = current.getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(stateObject);
        }
        T t3 = (T) readable(t, current.getId(), current.getInvalid());
        if (t3 != null) {
            return t3;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            t2 = (T) readable(firstStateRecord, current2.getId(), current2.getInvalid());
            if (t2 == null) {
                readError();
                throw new KotlinNothingValueException();
            }
        }
        return t2;
    }

    @NotNull
    public static final <T extends StateRecord> T readable(@NotNull T t, @NotNull StateObject stateObject, @NotNull Snapshot snapshot) {
        Function1<Object, Unit> readObserver$runtime_release = snapshot.getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(stateObject);
        }
        T t2 = (T) readable(t, snapshot.getId(), snapshot.getInvalid());
        if (t2 != null) {
            return t2;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    public static final Void readError() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    private static final StateRecord usedLocked(StateObject stateObject) {
        int iLowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId) - 1;
        SnapshotIdSet empty = SnapshotIdSet.INSTANCE.getEMPTY();
        StateRecord stateRecord = null;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
            if (firstStateRecord.getSnapshotId() == 0) {
                return firstStateRecord;
            }
            if (valid(firstStateRecord, iLowestOrDefault, empty)) {
                if (stateRecord != null) {
                    return firstStateRecord.getSnapshotId() < stateRecord.getSnapshotId() ? firstStateRecord : stateRecord;
                }
                stateRecord = firstStateRecord;
            }
        }
        return null;
    }

    private static final boolean overwriteUnusedRecordsLocked(StateObject stateObject) {
        StateRecord stateRecord;
        int iLowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId);
        StateRecord stateRecord2 = null;
        StateRecord firstStateRecord = null;
        int i = 0;
        for (StateRecord firstStateRecord2 = stateObject.getFirstStateRecord(); firstStateRecord2 != null; firstStateRecord2 = firstStateRecord2.getNext()) {
            int snapshotId = firstStateRecord2.getSnapshotId();
            if (snapshotId != 0) {
                if (snapshotId >= iLowestOrDefault) {
                    i++;
                } else if (stateRecord2 == null) {
                    i++;
                    stateRecord2 = firstStateRecord2;
                } else {
                    if (firstStateRecord2.getSnapshotId() < stateRecord2.getSnapshotId()) {
                        stateRecord = stateRecord2;
                        stateRecord2 = firstStateRecord2;
                    } else {
                        stateRecord = firstStateRecord2;
                    }
                    if (firstStateRecord == null) {
                        firstStateRecord = stateObject.getFirstStateRecord();
                        StateRecord stateRecord3 = firstStateRecord;
                        while (true) {
                            if (firstStateRecord == null) {
                                firstStateRecord = stateRecord3;
                                break;
                            }
                            if (firstStateRecord.getSnapshotId() >= iLowestOrDefault) {
                                break;
                            }
                            if (stateRecord3.getSnapshotId() < firstStateRecord.getSnapshotId()) {
                                stateRecord3 = firstStateRecord;
                            }
                            firstStateRecord = firstStateRecord.getNext();
                        }
                    }
                    stateRecord2.setSnapshotId$runtime_release(0);
                    stateRecord2.assign(firstStateRecord);
                    stateRecord2 = stateRecord;
                }
            }
        }
        return i > 1;
    }

    private static final StateRecord findYoungestOr(StateRecord stateRecord, Function1<? super StateRecord, Boolean> function1) {
        StateRecord stateRecord2 = stateRecord;
        while (stateRecord != null) {
            if (function1.invoke(stateRecord).booleanValue()) {
                return stateRecord;
            }
            if (stateRecord2.getSnapshotId() < stateRecord.getSnapshotId()) {
                stateRecord2 = stateRecord;
            }
            stateRecord = stateRecord.getNext();
        }
        return stateRecord2;
    }

    public static final void checkAndOverwriteUnusedRecordsLocked() {
        SnapshotWeakSet<StateObject> snapshotWeakSet = extraStateObjects;
        int size = snapshotWeakSet.getSize();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            WeakReference<StateObject> weakReference = snapshotWeakSet.getValues$runtime_release()[i];
            if ((weakReference != null ? weakReference.get() : null) != null && !(!overwriteUnusedRecordsLocked(r5))) {
                if (i2 != i) {
                    snapshotWeakSet.getValues$runtime_release()[i2] = weakReference;
                    snapshotWeakSet.getHashes()[i2] = snapshotWeakSet.getHashes()[i];
                }
                i2++;
            }
            i++;
        }
        for (int i3 = i2; i3 < size; i3++) {
            snapshotWeakSet.getValues$runtime_release()[i3] = null;
            snapshotWeakSet.getHashes()[i3] = 0;
        }
        if (i2 != size) {
            snapshotWeakSet.setSize$runtime_release(i2);
        }
    }

    public static final void processForUnusedRecordsLocked(StateObject stateObject) {
        if (overwriteUnusedRecordsLocked(stateObject)) {
            extraStateObjects.add(stateObject);
        }
    }

    @PublishedApi
    @NotNull
    public static final <T extends StateRecord> T writableRecord(@NotNull T t, @NotNull StateObject stateObject, @NotNull Snapshot snapshot) {
        if (snapshot.getReadOnly()) {
            snapshot.mo10960recordModified$runtime_release(stateObject);
        }
        T t2 = (T) readable(t, snapshot.getId(), snapshot.getInvalid());
        if (t2 == null) {
            readError();
            throw new KotlinNothingValueException();
        }
        if (t2.getSnapshotId() == snapshot.getId()) {
            return t2;
        }
        T t3 = (T) newWritableRecord(t2, stateObject, snapshot);
        snapshot.mo10960recordModified$runtime_release(stateObject);
        return t3;
    }

    @NotNull
    public static final <T extends StateRecord> T overwritableRecord(@NotNull T t, @NotNull StateObject stateObject, @NotNull Snapshot snapshot, @NotNull T t2) {
        T t3;
        if (snapshot.getReadOnly()) {
            snapshot.mo10960recordModified$runtime_release(stateObject);
        }
        int id = snapshot.getId();
        if (t2.getSnapshotId() == id) {
            return t2;
        }
        synchronized (getLock()) {
            t3 = (T) newOverwritableRecordLocked(t, stateObject);
        }
        t3.setSnapshotId$runtime_release(id);
        snapshot.mo10960recordModified$runtime_release(stateObject);
        return t3;
    }

    private static final <T extends StateRecord> T newWritableRecordLocked(T t, StateObject stateObject, Snapshot snapshot) {
        T t2 = (T) newOverwritableRecordLocked(t, stateObject);
        t2.assign(t);
        t2.setSnapshotId$runtime_release(snapshot.getId());
        return t2;
    }

    @NotNull
    public static final <T extends StateRecord> T newOverwritableRecordLocked(@NotNull T t, @NotNull StateObject stateObject) {
        T t2 = (T) usedLocked(stateObject);
        if (t2 != null) {
            t2.setSnapshotId$runtime_release(Integer.MAX_VALUE);
            return t2;
        }
        T t3 = (T) t.create();
        t3.setSnapshotId$runtime_release(Integer.MAX_VALUE);
        t3.setNext$runtime_release(stateObject.getFirstStateRecord());
        Intrinsics.checkNotNull(t3, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$15");
        stateObject.prependStateRecord(t3);
        Intrinsics.checkNotNull(t3, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return t3;
    }

    @PublishedApi
    public static final void notifyWrite(@NotNull Snapshot snapshot, @NotNull StateObject stateObject) {
        snapshot.setWriteCount$runtime_release(snapshot.getWriteCount() + 1);
        Function1<Object, Unit> writeObserver$runtime_release = snapshot.getWriteObserver$runtime_release();
        if (writeObserver$runtime_release != null) {
            writeObserver$runtime_release.invoke(stateObject);
        }
    }

    public static final <T extends StateRecord, R> R writable(@NotNull T t, @NotNull StateObject stateObject, @NotNull Function1<? super T, ? extends R> function1) {
        Snapshot current;
        R rInvoke;
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.INSTANCE.getCurrent();
                rInvoke = function1.invoke(writableRecord(t, stateObject, current));
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        notifyWrite(current, stateObject);
        return rInvoke;
    }

    public static final <T extends StateRecord, R> R overwritable(@NotNull T t, @NotNull StateObject stateObject, @NotNull T t2, @NotNull Function1<? super T, ? extends R> function1) {
        Snapshot current;
        R rInvoke;
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.INSTANCE.getCurrent();
                rInvoke = function1.invoke(overwritableRecord(t, stateObject, current, t2));
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        notifyWrite(current, stateObject);
        return rInvoke;
    }

    public static final Map<StateRecord, StateRecord> optimisticMerges(MutableSnapshot mutableSnapshot, MutableSnapshot mutableSnapshot2, SnapshotIdSet snapshotIdSet) {
        StateRecord stateRecord;
        IdentityArraySet<StateObject> modified$runtime_release = mutableSnapshot2.getModified$runtime_release();
        int id = mutableSnapshot.getId();
        if (modified$runtime_release == null) {
            return null;
        }
        SnapshotIdSet snapshotIdSetM100or = mutableSnapshot2.getInvalid().set(mutableSnapshot2.getId()).m100or(mutableSnapshot2.getPreviousIds());
        Object[] values = modified$runtime_release.getValues();
        int size = modified$runtime_release.size();
        HashMap map = null;
        for (int i = 0; i < size; i++) {
            Object obj = values[i];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            StateObject stateObject = (StateObject) obj;
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            StateRecord stateRecord2 = readable(firstStateRecord, id, snapshotIdSet);
            if (stateRecord2 != null && (stateRecord = readable(firstStateRecord, id, snapshotIdSetM100or)) != null && !Intrinsics.areEqual(stateRecord2, stateRecord)) {
                StateRecord stateRecord3 = readable(firstStateRecord, mutableSnapshot2.getId(), mutableSnapshot2.getInvalid());
                if (stateRecord3 == null) {
                    readError();
                    throw new KotlinNothingValueException();
                }
                StateRecord stateRecordMergeRecords = stateObject.mergeRecords(stateRecord, stateRecord2, stateRecord3);
                if (stateRecordMergeRecords == null) {
                    return null;
                }
                if (map == null) {
                    map = new HashMap();
                }
                map.put(stateRecord2, stateRecordMergeRecords);
                map = map;
            }
        }
        return map;
    }

    public static final Void reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @PublishedApi
    @NotNull
    public static final <T extends StateRecord> T current(@NotNull T t, @NotNull Snapshot snapshot) {
        T t2 = (T) readable(t, snapshot.getId(), snapshot.getInvalid());
        if (t2 != null) {
            return t2;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    @PublishedApi
    @NotNull
    public static final <T extends StateRecord> T current(@NotNull T t) {
        T t2;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot current = companion.getCurrent();
        T t3 = (T) readable(t, current.getId(), current.getInvalid());
        if (t3 != null) {
            return t3;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            t2 = (T) readable(t, current2.getId(), current2.getInvalid());
        }
        if (t2 != null) {
            return t2;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    public static final <T extends StateRecord, R> R withCurrent(@NotNull T t, @NotNull Function1<? super T, ? extends R> function1) {
        return function1.invoke(current(t));
    }

    @NotNull
    public static final SnapshotIdSet addRange(@NotNull SnapshotIdSet snapshotIdSet, int i, int i2) {
        while (i < i2) {
            snapshotIdSet = snapshotIdSet.set(i);
            i++;
        }
        return snapshotIdSet;
    }

    @NotNull
    public static final <T extends StateRecord> T newWritableRecord(@NotNull T t, @NotNull StateObject stateObject, @NotNull Snapshot snapshot) {
        T t2;
        synchronized (getLock()) {
            t2 = (T) newWritableRecordLocked(t, stateObject, snapshot);
        }
        return t2;
    }

    public static final <T extends StateRecord, R> R writable(@NotNull T t, @NotNull StateObject stateObject, @NotNull Snapshot snapshot, @NotNull Function1<? super T, ? extends R> function1) {
        R rInvoke;
        synchronized (getLock()) {
            try {
                rInvoke = function1.invoke(writableRecord(t, stateObject, snapshot));
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        notifyWrite(snapshot, stateObject);
        return rInvoke;
    }
}
