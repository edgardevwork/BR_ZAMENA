package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.apache.ivy.osgi.p063p2.P2MetadataParser;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Recomposer.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 ¹\u00012\u00020\u0001:\n¹\u0001º\u0001»\u0001¼\u0001½\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010]\u001a\u00020\\2\u0006\u0010^\u001a\u00020\u0007H\u0002J\u0010\u0010_\u001a\u00020\\2\u0006\u0010`\u001a\u00020aH\u0002J\u0006\u0010b\u001a\u00020cJ\u000e\u0010d\u001a\u00020\\H\u0086@¢\u0006\u0002\u0010eJ\u000e\u0010f\u001a\u00020\\H\u0082@¢\u0006\u0002\u0010eJ\u0006\u0010g\u001a\u00020\\J\b\u0010h\u001a\u00020\\H\u0002J\u0006\u0010i\u001a\u00020\\J*\u0010j\u001a\u00020\\2\u0006\u0010^\u001a\u00020\u00072\u0011\u0010k\u001a\r\u0012\u0004\u0012\u00020\\0l¢\u0006\u0002\bmH\u0010¢\u0006\u0004\bn\u0010oJ:\u0010p\u001a\u0002Hq\"\u0004\b\u0000\u0010q2\u0006\u0010^\u001a\u00020\u00072\u000e\u0010r\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010R2\f\u0010s\u001a\b\u0012\u0004\u0012\u0002Hq0lH\u0082\b¢\u0006\u0002\u0010tJ\u0015\u0010u\u001a\u00020\\2\u0006\u0010v\u001a\u00020\u001fH\u0010¢\u0006\u0002\bwJ\u0010\u0010x\u001a\n\u0012\u0004\u0012\u00020\\\u0018\u00010[H\u0002J\b\u0010y\u001a\u00020\\H\u0002J\u0015\u0010z\u001a\u00020\\2\u0006\u0010v\u001a\u00020\u001fH\u0010¢\u0006\u0002\b{J\u0015\u0010|\u001a\u00020\\2\u0006\u0010^\u001a\u00020\u0007H\u0010¢\u0006\u0002\b}J\u0017\u0010~\u001a\u00020\\2\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0010¢\u0006\u0003\b\u0081\u0001J\u000f\u0010\u0082\u0001\u001a\u00020\\H\u0086@¢\u0006\u0002\u0010eJ \u0010\u0083\u0001\u001a\u00020\\2\u0006\u0010v\u001a\u00020\u001f2\u0007\u0010\u0084\u0001\u001a\u00020 H\u0010¢\u0006\u0003\b\u0085\u0001J\u0019\u0010\u0086\u0001\u001a\u0004\u0018\u00010 2\u0006\u0010v\u001a\u00020\u001fH\u0010¢\u0006\u0003\b\u0087\u0001J\u0007\u0010\u0088\u0001\u001a\u00020\\J\u0011\u0010\u0089\u0001\u001a\u00020\\2\u0006\u0010^\u001a\u00020\u0007H\u0002J.\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\r\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u001f0\t2\u000e\u0010r\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010RH\u0002J#\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00072\u0006\u0010^\u001a\u00020\u00072\u000e\u0010r\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010RH\u0002J0\u0010\u008d\u0001\u001a\u00020\\2\r\u0010\u008e\u0001\u001a\b0\u008f\u0001j\u0003`\u0090\u00012\u000b\b\u0002\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00072\t\b\u0002\u0010\u0092\u0001\u001a\u00020\u0017H\u0002J\u001e\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\\0\u0094\u00012\u0006\u0010^\u001a\u00020\u0007H\u0002JV\u0010\u0095\u0001\u001a\u00020\\2D\u0010s\u001a@\b\u0001\u0012\u0005\u0012\u00030\u0097\u0001\u0012\u0017\u0012\u00150\u0098\u0001¢\u0006\u000f\b\u0099\u0001\u0012\n\b\u009a\u0001\u0012\u0005\b\b(\u009b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\\0\u009c\u0001\u0012\u0006\u0012\u0004\u0018\u00010$0\u0096\u0001¢\u0006\u0003\b\u009d\u0001H\u0082@¢\u0006\u0003\u0010\u009e\u0001J\t\u0010\u009f\u0001\u001a\u00020\u0017H\u0002J \u0010\u009f\u0001\u001a\u00020\\2\u0014\u0010 \u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\\0\u0094\u0001H\u0082\bJ\u001f\u0010¡\u0001\u001a\u00020\\2\u000e\u0010¢\u0001\u001a\t\u0012\u0005\u0012\u00030£\u00010'H\u0010¢\u0006\u0003\b¤\u0001J\u0017\u0010¥\u0001\u001a\u00020\\2\u0006\u0010^\u001a\u00020\u0007H\u0010¢\u0006\u0003\b¦\u0001J\u0012\u0010§\u0001\u001a\u00020\\2\u0007\u0010¨\u0001\u001a\u00020NH\u0002J\u0011\u0010©\u0001\u001a\u00020\\2\u0006\u0010^\u001a\u00020\u0007H\u0002J\u0017\u0010ª\u0001\u001a\u00020\\2\u0006\u0010^\u001a\u00020\u0007H\u0010¢\u0006\u0003\b«\u0001J\u000b\u0010¬\u0001\u001a\u0004\u0018\u000106H\u0002J\u0007\u0010\u00ad\u0001\u001a\u00020\\J\t\u0010®\u0001\u001a\u00020\\H\u0002J$\u0010¯\u0001\u001a\u00020\\2\b\u0010\u009b\u0001\u001a\u00030\u0098\u00012\b\u0010°\u0001\u001a\u00030±\u0001H\u0082@¢\u0006\u0003\u0010²\u0001J\u000f\u0010³\u0001\u001a\u00020\\H\u0086@¢\u0006\u0002\u0010eJ\u0018\u0010´\u0001\u001a\u00020\\2\u0006\u0010I\u001a\u00020\u0003H\u0087@¢\u0006\u0003\u0010µ\u0001J\u0017\u0010¶\u0001\u001a\u00020\\2\u0006\u0010^\u001a\u00020\u0007H\u0010¢\u0006\u0003\b·\u0001J.\u0010¸\u0001\u001a\u000f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\\0\u0094\u00012\u0006\u0010^\u001a\u00020\u00072\u000e\u0010r\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010RH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\"\u001a\u001c\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010$0#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00060\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020)8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00107\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0019R\u0014\u0010;\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0019R\u0014\u0010=\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0019R\u0014\u0010?\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0019R\u0011\u0010A\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\bB\u0010\u0019R\u0014\u0010C\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0019R\u000e\u0010E\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00070\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u00038PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bJ\u00102R\u0012\u0010K\u001a\u00060LR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010M\u001a\u0004\u0018\u00010NX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010O\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u0019R\u0014\u0010Q\u001a\b\u0012\u0004\u0012\u00020$0RX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010S\u001a\b\u0012\u0004\u0012\u00020\f0T8FX\u0087\u0004¢\u0006\f\u0012\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u000e\u0010Y\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010Z\u001a\n\u0012\u0004\u0012\u00020\\\u0018\u00010[X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006¾\u0001"}, m7105d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/CompositionContext;", "effectCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "_knownCompositions", "", "Landroidx/compose/runtime/ControlledComposition;", "_knownCompositionsCache", "", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/Recomposer$State;", "broadcastFrameClock", "Landroidx/compose/runtime/BroadcastFrameClock;", "<set-?>", "", "changeCount", "getChangeCount", "()J", "closeCause", "", "collectingParameterInformation", "", "getCollectingParameterInformation$runtime_release", "()Z", "collectingSourceInformation", "getCollectingSourceInformation$runtime_release", "compositionInvalidations", "compositionValueStatesAvailable", "", "Landroidx/compose/runtime/MovableContentStateReference;", "Landroidx/compose/runtime/MovableContentState;", "compositionValuesAwaitingInsert", "compositionValuesRemoved", "Landroidx/compose/runtime/MovableContent;", "", "compositionsAwaitingApply", "compositionsRemoved", "", "compoundHashKey", "", "getCompoundHashKey$runtime_release", "()I", "concurrentCompositionsOutstanding", "currentState", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentState", "()Lkotlinx/coroutines/flow/StateFlow;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "effectJob", "Lkotlinx/coroutines/CompletableJob;", "errorState", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "failedCompositions", "frameClockPaused", "hasBroadcastFrameClockAwaiters", "getHasBroadcastFrameClockAwaiters", "hasBroadcastFrameClockAwaitersLocked", "getHasBroadcastFrameClockAwaitersLocked", "hasConcurrentFrameWorkLocked", "getHasConcurrentFrameWorkLocked", "hasFrameWorkLocked", "getHasFrameWorkLocked", "hasPendingWork", "getHasPendingWork", "hasSchedulingWork", "getHasSchedulingWork", "isClosed", "knownCompositions", "getKnownCompositions", "()Ljava/util/List;", "recomposeCoroutineContext", "getRecomposeCoroutineContext$runtime_release", "recomposerInfo", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "runnerJob", "Lkotlinx/coroutines/Job;", "shouldKeepRecomposing", "getShouldKeepRecomposing", "snapshotInvalidations", "Landroidx/compose/runtime/collection/IdentityArraySet;", "state", "Lkotlinx/coroutines/flow/Flow;", "getState$annotations", "()V", "getState", "()Lkotlinx/coroutines/flow/Flow;", "stateLock", "workContinuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "addKnownCompositionLocked", "composition", "applyAndCheck", "snapshot", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "asRecomposerInfo", "Landroidx/compose/runtime/RecomposerInfo;", "awaitIdle", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitWorkAvailable", "cancel", "clearKnownCompositionsLocked", "close", "composeInitial", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composing", ExifInterface.GPS_DIRECTION_TRUE, "modifiedValues", "block", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "deletedMovableContent", "reference", "deletedMovableContent$runtime_release", "deriveStateLocked", "discardUnusedValues", "insertMovableContent", "insertMovableContent$runtime_release", "invalidate", "invalidate$runtime_release", "invalidateScope", PomReader.SCOPE, "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateScope$runtime_release", "join", "movableContentStateReleased", "data", "movableContentStateReleased$runtime_release", "movableContentStateResolve", "movableContentStateResolve$runtime_release", "pauseCompositionFrameClock", "performInitialMovableContentInserts", "performInsertValues", P2MetadataParser.ReferencesHandler.REFERENCES, "performRecompose", "processCompositionError", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "failedInitialComposition", "recoverable", "readObserverOf", "Lkotlin/Function1;", "recompositionRunner", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/ParameterName;", "name", "parentFrameClock", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordComposerModifications", "onEachInvalidComposition", "recordInspectionTable", "table", "Landroidx/compose/runtime/tooling/CompositionData;", "recordInspectionTable$runtime_release", "registerComposition", "registerComposition$runtime_release", "registerRunnerJob", "callingJob", "removeKnownCompositionLocked", "reportRemovedComposition", "reportRemovedComposition$runtime_release", "resetErrorState", "resumeCompositionFrameClock", "retryFailedCompositions", "runFrameLoop", "frameSignal", "Landroidx/compose/runtime/ProduceFrameSignal;", "(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runRecomposeAndApplyChanges", "runRecomposeConcurrentlyAndApplyChanges", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unregisterComposition", "unregisterComposition$runtime_release", "writeObserverOf", "Companion", "HotReloadable", "RecomposerErrorState", "RecomposerInfoImpl", "State", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1564:1\n1220#1,5:1613\n1226#1:1623\n1220#1,5:1636\n1226#1:1646\n1220#1,5:1667\n1226#1:1688\n82#2:1565\n82#2:1566\n82#2:1569\n82#2:1571\n82#2:1578\n82#2:1579\n82#2:1592\n82#2:1593\n82#2:1594\n82#2:1595\n82#2:1596\n82#2:1597\n82#2:1598\n82#2:1608\n82#2:1611\n82#2:1612\n82#2:1624\n82#2:1625\n82#2:1675\n82#2:1689\n82#2:1712\n82#2:1713\n82#2:1714\n82#2:1715\n82#2:1716\n82#2:1717\n82#2:1718\n82#2:1719\n82#2:1720\n82#2:1721\n82#2:1722\n82#2:1723\n1229#3,2:1567\n1#4:1570\n33#5,6:1572\n33#5,6:1580\n33#5,6:1586\n93#5,2:1626\n33#5,4:1628\n95#5,2:1632\n38#5:1634\n97#5:1635\n120#5,3:1647\n33#5,4:1650\n123#5,2:1654\n125#5,2:1663\n38#5:1665\n127#5:1666\n82#5,3:1676\n33#5,4:1679\n85#5,2:1683\n38#5:1685\n87#5:1686\n82#5,3:1690\n33#5,4:1693\n85#5,2:1697\n38#5:1699\n87#5:1700\n33#5,6:1701\n314#6,9:1599\n323#6,2:1609\n129#7,5:1618\n129#7,5:1641\n129#7,3:1672\n133#7:1687\n129#7,5:1707\n361#8,7:1656\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n*L\n1070#1:1613,5\n1070#1:1623\n1147#1:1636,5\n1147#1:1646\n1167#1:1667,5\n1167#1:1688\n292#1:1565\n342#1:1566\n436#1:1569\n440#1:1571\n461#1:1578\n466#1:1579\n492#1:1592\n705#1:1593\n743#1:1594\n774#1:1595\n786#1:1596\n803#1:1597\n939#1:1598\n951#1:1608\n1035#1:1611\n1051#1:1612\n1083#1:1624\n1114#1:1625\n1170#1:1675\n1183#1:1689\n1250#1:1712\n1287#1:1713\n1302#1:1714\n1331#1:1715\n1339#1:1716\n1348#1:1717\n1355#1:1718\n1362#1:1719\n1371#1:1720\n1377#1:1721\n1389#1:1722\n1120#1:1723\n343#1:1567,2\n446#1:1572,6\n479#1:1580,6\n484#1:1586,6\n1115#1:1626,2\n1115#1:1628,4\n1115#1:1632,2\n1115#1:1634\n1115#1:1635\n1164#1:1647,3\n1164#1:1650,4\n1164#1:1654,2\n1164#1:1663,2\n1164#1:1665\n1164#1:1666\n1171#1:1676,3\n1171#1:1679,4\n1171#1:1683,2\n1171#1:1685\n1171#1:1686\n1187#1:1690,3\n1187#1:1693,4\n1187#1:1697,2\n1187#1:1699\n1187#1:1700\n1194#1:1701,6\n950#1:1599,9\n950#1:1609,2\n1070#1:1618,5\n1147#1:1641,5\n1167#1:1672,3\n1167#1:1687\n1224#1:1707,5\n1164#1:1656,7\n*E\n"})
/* loaded from: classes2.dex */
public final class Recomposer extends CompositionContext {

    @NotNull
    private final List<ControlledComposition> _knownCompositions;

    @Nullable
    private List<? extends ControlledComposition> _knownCompositionsCache;

    @NotNull
    private final MutableStateFlow<State> _state;

    @NotNull
    private final BroadcastFrameClock broadcastFrameClock;
    private long changeCount;

    @Nullable
    private Throwable closeCause;

    @NotNull
    private final List<ControlledComposition> compositionInvalidations;

    @NotNull
    private final Map<MovableContentStateReference, MovableContentState> compositionValueStatesAvailable;

    @NotNull
    private final List<MovableContentStateReference> compositionValuesAwaitingInsert;

    @NotNull
    private final Map<MovableContent<Object>, List<MovableContentStateReference>> compositionValuesRemoved;

    @NotNull
    private final List<ControlledComposition> compositionsAwaitingApply;

    @Nullable
    private Set<ControlledComposition> compositionsRemoved;
    private int concurrentCompositionsOutstanding;

    @NotNull
    private final CoroutineContext effectCoroutineContext;

    @NotNull
    private final CompletableJob effectJob;

    @Nullable
    private RecomposerErrorState errorState;

    @Nullable
    private List<ControlledComposition> failedCompositions;
    private boolean frameClockPaused;
    private boolean isClosed;

    @NotNull
    private final RecomposerInfoImpl recomposerInfo;

    @Nullable
    private Job runnerJob;

    @NotNull
    private IdentityArraySet<Object> snapshotInvalidations;

    @NotNull
    private final Object stateLock;

    @Nullable
    private CancellableContinuation<? super Unit> workContinuation;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final MutableStateFlow<PersistentSet<RecomposerInfoImpl>> _runningRecomposers = StateFlowKt.MutableStateFlow(ExtensionsKt.persistentSetOf());

    @NotNull
    private static final AtomicReference<Boolean> _hotReloadEnabled = new AtomicReference<>(Boolean.FALSE);

    /* compiled from: Recomposer.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m7105d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes.dex */
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    /* compiled from: Recomposer.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.runtime.Recomposer", m7120f = "Recomposer.kt", m7121i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, m7122l = {871, 878}, m7123m = "runFrameLoop", m7124n = {"this", "parentFrameClock", "frameSignal", "toRecompose", "toApply", "this", "parentFrameClock", "frameSignal", "toRecompose", "toApply"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: androidx.compose.runtime.Recomposer$runFrameLoop$1 */
    public static final class C17641 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C17641(Continuation<? super C17641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Recomposer.this.runFrameLoop(null, null, this);
        }
    }

    @Deprecated(message = "Replaced by currentState as a StateFlow", replaceWith = @ReplaceWith(expression = "currentState", imports = {}))
    public static /* synthetic */ void getState$annotations() {
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* renamed from: getCollectingParameterInformation$runtime_release */
    public boolean getCollectingParameterInformation() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* renamed from: getCollectingSourceInformation$runtime_release */
    public boolean getCollectingSourceInformation() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* renamed from: getCompoundHashKey$runtime_release */
    public int getCompoundHashKey() {
        return 1000;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime_release(@NotNull Set<CompositionData> table) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void registerComposition$runtime_release(@NotNull ControlledComposition composition) {
    }

    public Recomposer(@NotNull CoroutineContext coroutineContext) {
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Function0<Unit>() { // from class: androidx.compose.runtime.Recomposer$broadcastFrameClock$1
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
                CancellableContinuation cancellableContinuationDeriveStateLocked;
                Object obj = this.this$0.stateLock;
                Recomposer recomposer = this.this$0;
                synchronized (obj) {
                    cancellableContinuationDeriveStateLocked = recomposer.deriveStateLocked();
                    if (((Recomposer.State) recomposer._state.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                        throw ExceptionsKt.CancellationException("Recomposer shutdown; frame clock awaiter will never resume", recomposer.closeCause);
                    }
                }
                if (cancellableContinuationDeriveStateLocked != null) {
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuationDeriveStateLocked.resumeWith(Result.m15699constructorimpl(Unit.INSTANCE));
                }
            }
        });
        this.broadcastFrameClock = broadcastFrameClock;
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new IdentityArraySet<>();
        this.compositionInvalidations = new ArrayList();
        this.compositionsAwaitingApply = new ArrayList();
        this.compositionValuesAwaitingInsert = new ArrayList();
        this.compositionValuesRemoved = new LinkedHashMap();
        this.compositionValueStatesAvailable = new LinkedHashMap();
        this._state = StateFlowKt.MutableStateFlow(State.Inactive);
        CompletableJob completableJobJob = JobKt.Job((Job) coroutineContext.get(Job.INSTANCE));
        completableJobJob.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable final Throwable th) {
                CancellableContinuation cancellableContinuation;
                CancellableContinuation cancellableContinuation2;
                CancellationException CancellationException = ExceptionsKt.CancellationException("Recomposer effect job completed", th);
                Object obj = this.this$0.stateLock;
                final Recomposer recomposer = this.this$0;
                synchronized (obj) {
                    try {
                        Job job = recomposer.runnerJob;
                        cancellableContinuation = null;
                        if (job != null) {
                            recomposer._state.setValue(Recomposer.State.ShuttingDown);
                            if (recomposer.isClosed) {
                                if (recomposer.workContinuation != null) {
                                    cancellableContinuation2 = recomposer.workContinuation;
                                }
                                recomposer.workContinuation = null;
                                job.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                                        invoke2(th2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Throwable th2) {
                                        Object obj2 = recomposer.stateLock;
                                        Recomposer recomposer2 = recomposer;
                                        Throwable th3 = th;
                                        synchronized (obj2) {
                                            if (th3 == null) {
                                                th3 = null;
                                            } else if (th2 != null) {
                                                try {
                                                    if (th2 instanceof CancellationException) {
                                                        th2 = null;
                                                    }
                                                    if (th2 != null) {
                                                        ExceptionsKt__ExceptionsKt.addSuppressed(th3, th2);
                                                    }
                                                } catch (Throwable th4) {
                                                    throw th4;
                                                }
                                            }
                                            recomposer2.closeCause = th3;
                                            recomposer2._state.setValue(Recomposer.State.ShutDown);
                                            Unit unit = Unit.INSTANCE;
                                        }
                                    }
                                });
                                cancellableContinuation = cancellableContinuation2;
                            } else {
                                job.cancel(CancellationException);
                            }
                            cancellableContinuation2 = null;
                            recomposer.workContinuation = null;
                            job.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                                    invoke2(th2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Throwable th2) {
                                    Object obj2 = recomposer.stateLock;
                                    Recomposer recomposer2 = recomposer;
                                    Throwable th3 = th;
                                    synchronized (obj2) {
                                        if (th3 == null) {
                                            th3 = null;
                                        } else if (th2 != null) {
                                            try {
                                                if (th2 instanceof CancellationException) {
                                                    th2 = null;
                                                }
                                                if (th2 != null) {
                                                    ExceptionsKt__ExceptionsKt.addSuppressed(th3, th2);
                                                }
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                        }
                                        recomposer2.closeCause = th3;
                                        recomposer2._state.setValue(Recomposer.State.ShutDown);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                }
                            });
                            cancellableContinuation = cancellableContinuation2;
                        } else {
                            recomposer.closeCause = CancellationException;
                            recomposer._state.setValue(Recomposer.State.ShutDown);
                            Unit unit = Unit.INSTANCE;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (cancellableContinuation != null) {
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m15699constructorimpl(Unit.INSTANCE));
                }
            }
        });
        this.effectJob = completableJobJob;
        this.effectCoroutineContext = coroutineContext.plus(broadcastFrameClock).plus(completableJobJob);
        this.recomposerInfo = new RecomposerInfoImpl();
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<ControlledComposition> getKnownCompositions() {
        List list = this._knownCompositionsCache;
        List list2 = list;
        if (list == null) {
            List<ControlledComposition> list3 = this._knownCompositions;
            List listEmptyList = list3.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : new ArrayList(list3);
            this._knownCompositionsCache = listEmptyList;
            list2 = listEmptyList;
        }
        return list2;
    }

    @Override // androidx.compose.runtime.CompositionContext
    @NotNull
    public CoroutineContext getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    @Override // androidx.compose.runtime.CompositionContext
    @NotNull
    public CoroutineContext getRecomposeCoroutineContext$runtime_release() {
        return EmptyCoroutineContext.INSTANCE;
    }

    private final boolean getHasBroadcastFrameClockAwaitersLocked() {
        return !this.frameClockPaused && this.broadcastFrameClock.getHasAwaiters();
    }

    public final boolean getHasBroadcastFrameClockAwaiters() {
        boolean hasBroadcastFrameClockAwaitersLocked;
        synchronized (this.stateLock) {
            hasBroadcastFrameClockAwaitersLocked = getHasBroadcastFrameClockAwaitersLocked();
        }
        return hasBroadcastFrameClockAwaitersLocked;
    }

    public final CancellableContinuation<Unit> deriveStateLocked() {
        State state;
        if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
            clearKnownCompositionsLocked();
            this.snapshotInvalidations = new IdentityArraySet<>();
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.compositionValuesAwaitingInsert.clear();
            this.failedCompositions = null;
            CancellableContinuation<? super Unit> cancellableContinuation = this.workContinuation;
            if (cancellableContinuation != null) {
                CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            state = State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new IdentityArraySet<>();
            this.compositionInvalidations.clear();
            state = getHasBroadcastFrameClockAwaitersLocked() ? State.InactivePendingWork : State.Inactive;
        } else if ((!this.compositionInvalidations.isEmpty()) || this.snapshotInvalidations.isNotEmpty() || (!this.compositionsAwaitingApply.isEmpty()) || (!this.compositionValuesAwaitingInsert.isEmpty()) || this.concurrentCompositionsOutstanding > 0 || getHasBroadcastFrameClockAwaitersLocked()) {
            state = State.PendingWork;
        } else {
            state = State.Idle;
        }
        this._state.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        CancellableContinuation cancellableContinuation2 = this.workContinuation;
        this.workContinuation = null;
        return cancellableContinuation2;
    }

    public final boolean getShouldKeepRecomposing() {
        boolean z;
        synchronized (this.stateLock) {
            z = !this.isClosed;
        }
        if (z) {
            return true;
        }
        Iterator<Job> it = this.effectJob.getChildren().iterator();
        while (it.hasNext()) {
            if (it.next().isActive()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final Flow<State> getState() {
        return getCurrentState();
    }

    @NotNull
    public final StateFlow<State> getCurrentState() {
        return this._state;
    }

    /* compiled from: Recomposer.kt */
    @Metadata(m7104d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0006\u0010\u001a\u001a\u00020\u0015J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cR\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m7105d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/RecomposerInfo;", "(Landroidx/compose/runtime/Recomposer;)V", "changeCount", "", "getChangeCount", "()J", "currentError", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentError", "()Landroidx/compose/runtime/RecomposerErrorInfo;", "hasPendingWork", "", "getHasPendingWork", "()Z", "state", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/compose/runtime/Recomposer$State;", "getState", "()Lkotlinx/coroutines/flow/Flow;", "invalidateGroupsWithKey", "", "key", "", "resetErrorState", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "retryFailedCompositions", "saveStateAndDisposeForHotReload", "", "Landroidx/compose/runtime/Recomposer$HotReloadable;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1564:1\n82#2:1565\n82#2:1566\n82#2:1585\n211#3,3:1567\n33#3,4:1570\n214#3:1574\n215#3:1576\n38#3:1577\n216#3:1578\n33#3,6:1579\n211#3,3:1586\n33#3,4:1589\n214#3:1593\n215#3:1595\n38#3:1596\n216#3:1597\n82#3,3:1598\n33#3,4:1601\n85#3:1605\n86#3:1607\n38#3:1608\n87#3:1609\n1#4:1575\n1#4:1594\n1#4:1606\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n*L\n368#1:1565\n373#1:1566\n381#1:1585\n377#1:1567,3\n377#1:1570,4\n377#1:1574\n377#1:1576\n377#1:1577\n377#1:1578\n378#1:1579,6\n385#1:1586,3\n385#1:1589,4\n385#1:1593\n385#1:1595\n385#1:1596\n385#1:1597\n386#1:1598,3\n386#1:1601,4\n386#1:1605\n386#1:1607\n386#1:1608\n386#1:1609\n377#1:1575\n385#1:1594\n*E\n"})
    public final class RecomposerInfoImpl implements RecomposerInfo {
        public RecomposerInfoImpl() {
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        @NotNull
        public Flow<State> getState() {
            return Recomposer.this.getCurrentState();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public boolean getHasPendingWork() {
            return Recomposer.this.getHasPendingWork();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public long getChangeCount() {
            return Recomposer.this.getChangeCount();
        }

        @Nullable
        public final RecomposerErrorInfo getCurrentError() {
            RecomposerErrorState recomposerErrorState;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                recomposerErrorState = recomposer.errorState;
            }
            return recomposerErrorState;
        }

        public final void invalidateGroupsWithKey(int key) {
            List knownCompositions;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                knownCompositions = recomposer.getKnownCompositions();
            }
            ArrayList arrayList = new ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i = 0; i < size; i++) {
                ControlledComposition controlledComposition = (ControlledComposition) knownCompositions.get(i);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((CompositionImpl) arrayList.get(i2)).invalidateGroupsWithKey(key);
            }
        }

        @NotNull
        public final List<HotReloadable> saveStateAndDisposeForHotReload() {
            List knownCompositions;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                knownCompositions = recomposer.getKnownCompositions();
            }
            ArrayList arrayList = new ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i = 0; i < size; i++) {
                ControlledComposition controlledComposition = (ControlledComposition) knownCompositions.get(i);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                HotReloadable hotReloadable = new HotReloadable((CompositionImpl) arrayList.get(i2));
                hotReloadable.clearContent();
                arrayList2.add(hotReloadable);
            }
            return arrayList2;
        }

        @Nullable
        public final RecomposerErrorState resetErrorState() {
            return Recomposer.this.resetErrorState();
        }

        public final void retryFailedCompositions() {
            Recomposer.this.retryFailedCompositions();
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0007R\u001b\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m7105d2 = {"Landroidx/compose/runtime/Recomposer$HotReloadable;", "", "composition", "Landroidx/compose/runtime/CompositionImpl;", "(Landroidx/compose/runtime/CompositionImpl;)V", "composable", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/jvm/functions/Function2;", "clearContent", "recompose", "resetContent", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes.dex */
    public static final class HotReloadable {

        @NotNull
        public Function2<? super Composer, ? super Integer, Unit> composable;

        @NotNull
        public final CompositionImpl composition;

        public HotReloadable(@NotNull CompositionImpl compositionImpl) {
            this.composition = compositionImpl;
            this.composable = compositionImpl.getComposable();
        }

        public final void clearContent() {
            if (this.composition.getIsRoot()) {
                this.composition.setContent(ComposableSingletons$RecomposerKt.INSTANCE.m10847getLambda1$runtime_release());
            }
        }

        public final void resetContent() {
            this.composition.setComposable(this.composable);
        }

        public final void recompose() {
            if (this.composition.getIsRoot()) {
                this.composition.setContent(this.composable);
            }
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007R\u0018\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m7105d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "Landroidx/compose/runtime/RecomposerErrorInfo;", "recoverable", "", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(ZLjava/lang/Exception;)V", "getCause", "()Ljava/lang/Exception;", "getRecoverable", "()Z", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class RecomposerErrorState implements RecomposerErrorInfo {

        @NotNull
        public final Exception cause;
        public final boolean recoverable;

        public RecomposerErrorState(boolean z, @NotNull Exception exc) {
            this.recoverable = z;
            this.cause = exc;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public boolean getRecoverable() {
            return this.recoverable;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        @NotNull
        public Exception getCause() {
            return this.cause;
        }
    }

    @NotNull
    public final RecomposerInfo asRecomposerInfo() {
        return this.recomposerInfo;
    }

    public final boolean recordComposerModifications() {
        List<ControlledComposition> knownCompositions;
        boolean hasFrameWorkLocked;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.isEmpty()) {
                return getHasFrameWorkLocked();
            }
            IdentityArraySet<Object> identityArraySet = this.snapshotInvalidations;
            this.snapshotInvalidations = new IdentityArraySet<>();
            synchronized (this.stateLock) {
                knownCompositions = getKnownCompositions();
            }
            try {
                int size = knownCompositions.size();
                for (int i = 0; i < size; i++) {
                    knownCompositions.get(i).recordModificationsOf(identityArraySet);
                    if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                this.snapshotInvalidations = new IdentityArraySet<>();
                synchronized (this.stateLock) {
                    if (deriveStateLocked() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                    }
                    hasFrameWorkLocked = getHasFrameWorkLocked();
                }
                return hasFrameWorkLocked;
            } catch (Throwable th) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.addAll((Collection<? extends Object>) identityArraySet);
                    Unit unit = Unit.INSTANCE;
                    throw th;
                }
            }
        }
    }

    private final void recordComposerModifications(Function1<? super ControlledComposition, Unit> onEachInvalidComposition) {
        IdentityArraySet identityArraySet = this.snapshotInvalidations;
        if (identityArraySet.isNotEmpty()) {
            List knownCompositions = getKnownCompositions();
            int size = knownCompositions.size();
            for (int i = 0; i < size; i++) {
                ((ControlledComposition) knownCompositions.get(i)).recordModificationsOf(identityArraySet);
            }
            this.snapshotInvalidations = new IdentityArraySet();
        }
        List list = this.compositionInvalidations;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            onEachInvalidComposition.invoke(list.get(i2));
        }
        this.compositionInvalidations.clear();
        if (deriveStateLocked() != null) {
            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
        }
    }

    public final void registerRunnerJob(Job callingJob) {
        synchronized (this.stateLock) {
            Throwable th = this.closeCause;
            if (th != null) {
                throw th;
            }
            if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down".toString());
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running".toString());
            }
            this.runnerJob = callingJob;
            deriveStateLocked();
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", m7120f = "Recomposer.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, m7122l = {540, 551}, m7123m = "invokeSuspend", m7124n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "alreadyComposed"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"})
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1564:1\n82#2:1565\n33#3,6:1566\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n*L\n533#1:1565\n534#1:1566,6\n*E\n"})
    /* renamed from: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2 */
    public static final class C17662 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        public C17662(Continuation<? super C17662> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @NotNull MonotonicFrameClock monotonicFrameClock, @Nullable Continuation<? super Unit> continuation) {
            C17662 c17662 = Recomposer.this.new C17662(continuation);
            c17662.L$0 = monotonicFrameClock;
            return c17662.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
        /* JADX WARN: Type inference failed for: r10v11, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v10, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r6v12, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r7v10, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r7v12, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r8v11, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r9v13, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0116 -> B:51:0x011a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0126 -> B:52:0x0122). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MonotonicFrameClock monotonicFrameClock;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            LinkedHashSet linkedHashSet;
            LinkedHashSet linkedHashSet2;
            IdentityArraySet identityArraySet;
            IdentityArraySet identityArraySet2;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            LinkedHashSet linkedHashSet3;
            LinkedHashSet linkedHashSet4;
            IdentityArraySet identityArraySet3;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            char c = 2;
            int i2 = 1;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                monotonicFrameClock = (MonotonicFrameClock) this.L$0;
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                arrayList3 = new ArrayList();
                linkedHashSet = new LinkedHashSet();
                linkedHashSet2 = new LinkedHashSet();
                identityArraySet = new IdentityArraySet();
                identityArraySet2 = new IdentityArraySet();
                if (!Recomposer.this.getShouldKeepRecomposing()) {
                }
            } else if (i == 1) {
                IdentityArraySet identityArraySet4 = (IdentityArraySet) this.L$7;
                IdentityArraySet identityArraySet5 = (IdentityArraySet) this.L$6;
                ?? r6 = (Set) this.L$5;
                ?? r7 = (Set) this.L$4;
                ?? r8 = (List) this.L$3;
                ?? r9 = (List) this.L$2;
                ?? r10 = (List) this.L$1;
                MonotonicFrameClock monotonicFrameClock2 = (MonotonicFrameClock) this.L$0;
                ResultKt.throwOnFailure(obj);
                linkedHashSet3 = r7;
                arrayList6 = r8;
                arrayList4 = r9;
                arrayList5 = r10;
                identityArraySet3 = identityArraySet4;
                identityArraySet = identityArraySet5;
                monotonicFrameClock = monotonicFrameClock2;
                linkedHashSet4 = r6;
                if (Recomposer.this.recordComposerModifications()) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                IdentityArraySet identityArraySet6 = (IdentityArraySet) this.L$7;
                IdentityArraySet identityArraySet7 = (IdentityArraySet) this.L$6;
                ?? r62 = (Set) this.L$5;
                ?? r72 = (Set) this.L$4;
                ?? r82 = (List) this.L$3;
                ?? r92 = (List) this.L$2;
                ?? r102 = (List) this.L$1;
                MonotonicFrameClock monotonicFrameClock3 = (MonotonicFrameClock) this.L$0;
                ResultKt.throwOnFailure(obj);
                LinkedHashSet linkedHashSet5 = r72;
                arrayList3 = r82;
                arrayList5 = r102;
                Object obj2 = coroutine_suspended;
                identityArraySet = identityArraySet7;
                char c2 = 2;
                identityArraySet2 = identityArraySet6;
                monotonicFrameClock = monotonicFrameClock3;
                linkedHashSet2 = r62;
                arrayList2 = r92;
                Recomposer.this.discardUnusedValues();
                c = c2;
                coroutine_suspended = obj2;
                arrayList = arrayList5;
                linkedHashSet = linkedHashSet5;
                i2 = 1;
                if (!Recomposer.this.getShouldKeepRecomposing()) {
                    Recomposer recomposer = Recomposer.this;
                    this.L$0 = monotonicFrameClock;
                    this.L$1 = arrayList;
                    this.L$2 = arrayList2;
                    this.L$3 = arrayList3;
                    this.L$4 = linkedHashSet;
                    this.L$5 = linkedHashSet2;
                    this.L$6 = identityArraySet;
                    this.L$7 = identityArraySet2;
                    this.label = i2;
                    if (recomposer.awaitWorkAvailable(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    arrayList5 = arrayList;
                    arrayList4 = arrayList2;
                    arrayList6 = arrayList3;
                    linkedHashSet3 = linkedHashSet;
                    IdentityArraySet identityArraySet8 = identityArraySet2;
                    linkedHashSet4 = linkedHashSet2;
                    identityArraySet3 = identityArraySet8;
                    if (Recomposer.this.recordComposerModifications()) {
                        LinkedHashSet linkedHashSet6 = linkedHashSet4;
                        linkedHashSet5 = linkedHashSet3;
                        identityArraySet2 = identityArraySet3;
                        arrayList3 = arrayList6;
                        c = c;
                        linkedHashSet2 = linkedHashSet6;
                        coroutine_suspended = coroutine_suspended;
                        arrayList = arrayList5;
                        arrayList2 = arrayList4;
                        linkedHashSet = linkedHashSet5;
                        i2 = 1;
                        if (!Recomposer.this.getShouldKeepRecomposing()) {
                        }
                    } else {
                        Object obj3 = coroutine_suspended;
                        IdentityArraySet identityArraySet9 = identityArraySet;
                        LinkedHashSet linkedHashSet7 = linkedHashSet4;
                        linkedHashSet5 = linkedHashSet3;
                        ArrayList arrayList7 = arrayList6;
                        AnonymousClass1 anonymousClass1 = new Function1<Long, Unit>() { // from class: androidx.compose.runtime.Recomposer.runRecomposeAndApplyChanges.2.1
                            public final /* synthetic */ IdentityArraySet<ControlledComposition> $alreadyComposed;
                            public final /* synthetic */ IdentityArraySet<Object> $modifiedValues;
                            public final /* synthetic */ List<ControlledComposition> $toApply;
                            public final /* synthetic */ Set<ControlledComposition> $toComplete;
                            public final /* synthetic */ List<MovableContentStateReference> $toInsert;
                            public final /* synthetic */ Set<ControlledComposition> $toLateApply;
                            public final /* synthetic */ List<ControlledComposition> $toRecompose;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(IdentityArraySet<Object> identityArraySet10, IdentityArraySet<ControlledComposition> identityArraySet32, List<ControlledComposition> arrayList52, List<MovableContentStateReference> arrayList42, Set<ControlledComposition> linkedHashSet32, List<ControlledComposition> arrayList62, Set<ControlledComposition> linkedHashSet72) {
                                super(1);
                                identityArraySet = identityArraySet10;
                                identityArraySet = identityArraySet32;
                                list = arrayList52;
                                list = arrayList42;
                                set = linkedHashSet32;
                                list = arrayList62;
                                set = linkedHashSet72;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                invoke(l.longValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:259:0x0142 A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #10 {all -> 0x00d8, blocks: (B:200:0x0047, B:201:0x004e, B:208:0x0075, B:209:0x0076, B:210:0x007c, B:212:0x0087, B:215:0x0094, B:217:0x009f, B:229:0x00d4, B:238:0x00f3, B:239:0x00f6, B:235:0x00ea, B:240:0x00f7, B:252:0x0127, B:259:0x0142, B:271:0x0169, B:278:0x0185, B:279:0x0189, B:281:0x018d, B:282:0x018e, B:287:0x01a7, B:288:0x01a8, B:276:0x0181, B:277:0x0184, B:275:0x017c, B:257:0x013e, B:258:0x0141, B:256:0x013a, B:300:0x01d0, B:302:0x01d9, B:303:0x01dd, B:315:0x0209, B:317:0x020b, B:318:0x020c, B:319:0x020d, B:321:0x0213, B:322:0x0216, B:324:0x0221, B:328:0x0237, B:333:0x0258, B:334:0x025b, B:332:0x0253, B:335:0x025c, B:336:0x025d, B:304:0x01de, B:306:0x01e9, B:308:0x01f5, B:310:0x01fb, B:313:0x0204, B:314:0x0207, B:243:0x0102, B:244:0x0112, B:246:0x0118, B:255:0x012f, B:262:0x014d, B:263:0x0154, B:265:0x015a, B:274:0x0171, B:280:0x018a, B:289:0x01a9, B:291:0x01b0, B:293:0x01bf, B:331:0x0248, B:202:0x004f, B:204:0x005a, B:207:0x006c, B:218:0x00a9, B:220:0x00b0, B:225:0x00c1, B:227:0x00c8, B:234:0x00df), top: B:356:0x0047, inners: #0, #1, #2, #3, #4, #7, #8, #9, #13 }] */
                            /* JADX WARN: Removed duplicated region for block: B:343:0x018a A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:357:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:359:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void invoke(long j) {
                                Object objBeginSection;
                                if (recomposer.getHasBroadcastFrameClockAwaiters()) {
                                    Recomposer recomposer2 = recomposer;
                                    Trace trace = Trace.INSTANCE;
                                    objBeginSection = trace.beginSection("Recomposer:animation");
                                    try {
                                        recomposer2.broadcastFrameClock.sendFrame(j);
                                        Snapshot.INSTANCE.sendApplyNotifications();
                                        Unit unit = Unit.INSTANCE;
                                        trace.endSection(objBeginSection);
                                    } finally {
                                    }
                                }
                                Recomposer recomposer3 = recomposer;
                                IdentityArraySet<Object> identityArraySet10 = identityArraySet;
                                IdentityArraySet<ControlledComposition> identityArraySet11 = identityArraySet;
                                List<ControlledComposition> list = list;
                                List<MovableContentStateReference> list2 = list;
                                Set<ControlledComposition> set = set;
                                List<ControlledComposition> list3 = list;
                                Set<ControlledComposition> set2 = set;
                                objBeginSection = Trace.INSTANCE.beginSection("Recomposer:recompose");
                                try {
                                    recomposer3.recordComposerModifications();
                                    synchronized (recomposer3.stateLock) {
                                        try {
                                            List list4 = recomposer3.compositionInvalidations;
                                            int size = list4.size();
                                            for (int i3 = 0; i3 < size; i3++) {
                                                list.add((ControlledComposition) list4.get(i3));
                                            }
                                            recomposer3.compositionInvalidations.clear();
                                            Unit unit2 = Unit.INSTANCE;
                                        } finally {
                                        }
                                    }
                                    identityArraySet10.clear();
                                    identityArraySet11.clear();
                                    while (true) {
                                        if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
                                            break;
                                        }
                                        try {
                                            try {
                                                int size2 = list.size();
                                                for (int i4 = 0; i4 < size2; i4++) {
                                                    ControlledComposition controlledComposition = list.get(i4);
                                                    identityArraySet11.add(controlledComposition);
                                                    ControlledComposition controlledCompositionPerformRecompose = recomposer3.performRecompose(controlledComposition, identityArraySet10);
                                                    if (controlledCompositionPerformRecompose != null) {
                                                        list3.add(controlledCompositionPerformRecompose);
                                                    }
                                                }
                                                list.clear();
                                                if (identityArraySet10.isNotEmpty()) {
                                                    synchronized (recomposer3.stateLock) {
                                                        try {
                                                            List knownCompositions = recomposer3.getKnownCompositions();
                                                            int size3 = knownCompositions.size();
                                                            for (int i5 = 0; i5 < size3; i5++) {
                                                                ControlledComposition controlledComposition2 = (ControlledComposition) knownCompositions.get(i5);
                                                                if (!identityArraySet11.contains(controlledComposition2) && controlledComposition2.observesAnyOf(identityArraySet10)) {
                                                                    list.add(controlledComposition2);
                                                                }
                                                            }
                                                            Unit unit3 = Unit.INSTANCE;
                                                        } finally {
                                                        }
                                                    }
                                                }
                                                if (list.isEmpty()) {
                                                    try {
                                                        C17662.invokeSuspend$fillToInsert(list2, recomposer3);
                                                        while (!list2.isEmpty()) {
                                                            CollectionsKt__MutableCollectionsKt.addAll(set, recomposer3.performInsertValues(list2, identityArraySet10));
                                                            C17662.invokeSuspend$fillToInsert(list2, recomposer3);
                                                        }
                                                    } catch (Exception e) {
                                                        Recomposer.processCompositionError$default(recomposer3, e, null, true, 2, null);
                                                        C17662.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet10, identityArraySet11);
                                                    }
                                                }
                                            } catch (Exception e2) {
                                                Recomposer.processCompositionError$default(recomposer3, e2, null, true, 2, null);
                                                C17662.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet10, identityArraySet11);
                                                list.clear();
                                            }
                                        } catch (Throwable th) {
                                            list.clear();
                                            throw th;
                                        }
                                    }
                                    if (!list3.isEmpty()) {
                                        recomposer3.changeCount = recomposer3.getChangeCount() + 1;
                                        try {
                                            try {
                                                int size4 = list3.size();
                                                for (int i6 = 0; i6 < size4; i6++) {
                                                    set2.add(list3.get(i6));
                                                }
                                                int size5 = list3.size();
                                                for (int i7 = 0; i7 < size5; i7++) {
                                                    list3.get(i7).applyChanges();
                                                }
                                                list3.clear();
                                                try {
                                                    if (!(!set.isEmpty())) {
                                                        try {
                                                            CollectionsKt__MutableCollectionsKt.addAll(set2, set);
                                                            Iterator<T> it = set.iterator();
                                                            while (it.hasNext()) {
                                                                ((ControlledComposition) it.next()).applyLateChanges();
                                                            }
                                                            try {
                                                                if (!set2.isEmpty()) {
                                                                    try {
                                                                        Iterator<T> it2 = set2.iterator();
                                                                        while (it2.hasNext()) {
                                                                            ((ControlledComposition) it2.next()).changesApplied();
                                                                        }
                                                                    } catch (Exception e3) {
                                                                        Recomposer.processCompositionError$default(recomposer3, e3, null, false, 6, null);
                                                                        C17662.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet10, identityArraySet11);
                                                                        set2.clear();
                                                                    }
                                                                }
                                                                synchronized (recomposer3.stateLock) {
                                                                    recomposer3.deriveStateLocked();
                                                                }
                                                                Snapshot.INSTANCE.notifyObjectsInitialized();
                                                                identityArraySet11.clear();
                                                                identityArraySet10.clear();
                                                                recomposer3.compositionsRemoved = null;
                                                                Unit unit4 = Unit.INSTANCE;
                                                            } finally {
                                                                set2.clear();
                                                            }
                                                        } catch (Exception e4) {
                                                            Recomposer.processCompositionError$default(recomposer3, e4, null, false, 6, null);
                                                            C17662.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet10, identityArraySet11);
                                                            set.clear();
                                                        }
                                                    } else {
                                                        if (!set2.isEmpty()) {
                                                        }
                                                        synchronized (recomposer3.stateLock) {
                                                        }
                                                    }
                                                } finally {
                                                    set.clear();
                                                }
                                            } finally {
                                                list3.clear();
                                            }
                                        } catch (Exception e5) {
                                            Recomposer.processCompositionError$default(recomposer3, e5, null, false, 6, null);
                                            C17662.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet10, identityArraySet11);
                                            list3.clear();
                                        }
                                    } else if (!(!set.isEmpty())) {
                                    }
                                } finally {
                                }
                            }
                        };
                        this.L$0 = monotonicFrameClock;
                        this.L$1 = arrayList52;
                        this.L$2 = arrayList42;
                        this.L$3 = arrayList7;
                        this.L$4 = linkedHashSet5;
                        this.L$5 = linkedHashSet72;
                        this.L$6 = identityArraySet9;
                        identityArraySet2 = identityArraySet32;
                        this.L$7 = identityArraySet2;
                        c2 = 2;
                        this.label = 2;
                        Object objWithFrameNanos = monotonicFrameClock.withFrameNanos(anonymousClass1, this);
                        obj2 = obj3;
                        if (objWithFrameNanos == obj2) {
                            return obj2;
                        }
                        identityArraySet10 = identityArraySet9;
                        arrayList3 = arrayList7;
                        linkedHashSet2 = linkedHashSet72;
                        arrayList2 = arrayList42;
                        Recomposer.this.discardUnusedValues();
                        c = c2;
                        coroutine_suspended = obj2;
                        arrayList = arrayList52;
                        linkedHashSet = linkedHashSet5;
                        i2 = 1;
                        if (!Recomposer.this.getShouldKeepRecomposing()) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }

        public static final void invokeSuspend$clearRecompositionState(List<ControlledComposition> list, List<MovableContentStateReference> list2, List<ControlledComposition> list3, Set<ControlledComposition> set, Set<ControlledComposition> set2, IdentityArraySet<Object> identityArraySet, IdentityArraySet<ControlledComposition> identityArraySet2) {
            list.clear();
            list2.clear();
            list3.clear();
            set.clear();
            set2.clear();
            identityArraySet.clear();
            identityArraySet2.clear();
        }

        public static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
            list.clear();
            synchronized (recomposer.stateLock) {
                try {
                    List list2 = recomposer.compositionValuesAwaitingInsert;
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        list.add((MovableContentStateReference) list2.get(i));
                    }
                    recomposer.compositionValuesAwaitingInsert.clear();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* compiled from: Recomposer.kt */
        @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "frameTime", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1564:1\n46#2,5:1565\n46#2,3:1570\n50#2:1586\n82#3:1573\n82#3:1587\n82#3:1610\n33#4,6:1574\n33#4,6:1580\n33#4,6:1588\n33#4,6:1594\n33#4,6:1600\n1855#5,2:1606\n1855#5,2:1608\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1\n*L\n555#1:1565,5\n565#1:1570,3\n565#1:1586\n569#1:1573\n600#1:1587\n679#1:1610\n570#1:1574,6\n581#1:1580,6\n601#1:1588,6\n635#1:1594,6\n638#1:1600,6\n653#1:1606,2\n667#1:1608,2\n*E\n"})
        /* renamed from: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$1 */
        public static final class AnonymousClass1 extends Lambda implements Function1<Long, Unit> {
            public final /* synthetic */ IdentityArraySet<ControlledComposition> $alreadyComposed;
            public final /* synthetic */ IdentityArraySet<Object> $modifiedValues;
            public final /* synthetic */ List<ControlledComposition> $toApply;
            public final /* synthetic */ Set<ControlledComposition> $toComplete;
            public final /* synthetic */ List<MovableContentStateReference> $toInsert;
            public final /* synthetic */ Set<ControlledComposition> $toLateApply;
            public final /* synthetic */ List<ControlledComposition> $toRecompose;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(IdentityArraySet<Object> identityArraySet10, IdentityArraySet<ControlledComposition> identityArraySet32, List<ControlledComposition> arrayList52, List<MovableContentStateReference> arrayList42, Set<ControlledComposition> linkedHashSet32, List<ControlledComposition> arrayList62, Set<ControlledComposition> linkedHashSet72) {
                super(1);
                identityArraySet = identityArraySet10;
                identityArraySet = identityArraySet32;
                list = arrayList52;
                list = arrayList42;
                set = linkedHashSet32;
                list = arrayList62;
                set = linkedHashSet72;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke(l.longValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:259:0x0142 A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #10 {all -> 0x00d8, blocks: (B:200:0x0047, B:201:0x004e, B:208:0x0075, B:209:0x0076, B:210:0x007c, B:212:0x0087, B:215:0x0094, B:217:0x009f, B:229:0x00d4, B:238:0x00f3, B:239:0x00f6, B:235:0x00ea, B:240:0x00f7, B:252:0x0127, B:259:0x0142, B:271:0x0169, B:278:0x0185, B:279:0x0189, B:281:0x018d, B:282:0x018e, B:287:0x01a7, B:288:0x01a8, B:276:0x0181, B:277:0x0184, B:275:0x017c, B:257:0x013e, B:258:0x0141, B:256:0x013a, B:300:0x01d0, B:302:0x01d9, B:303:0x01dd, B:315:0x0209, B:317:0x020b, B:318:0x020c, B:319:0x020d, B:321:0x0213, B:322:0x0216, B:324:0x0221, B:328:0x0237, B:333:0x0258, B:334:0x025b, B:332:0x0253, B:335:0x025c, B:336:0x025d, B:304:0x01de, B:306:0x01e9, B:308:0x01f5, B:310:0x01fb, B:313:0x0204, B:314:0x0207, B:243:0x0102, B:244:0x0112, B:246:0x0118, B:255:0x012f, B:262:0x014d, B:263:0x0154, B:265:0x015a, B:274:0x0171, B:280:0x018a, B:289:0x01a9, B:291:0x01b0, B:293:0x01bf, B:331:0x0248, B:202:0x004f, B:204:0x005a, B:207:0x006c, B:218:0x00a9, B:220:0x00b0, B:225:0x00c1, B:227:0x00c8, B:234:0x00df), top: B:356:0x0047, inners: #0, #1, #2, #3, #4, #7, #8, #9, #13 }] */
            /* JADX WARN: Removed duplicated region for block: B:343:0x018a A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:357:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:359:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(long j) {
                Object objBeginSection;
                if (recomposer.getHasBroadcastFrameClockAwaiters()) {
                    Recomposer recomposer2 = recomposer;
                    Trace trace = Trace.INSTANCE;
                    objBeginSection = trace.beginSection("Recomposer:animation");
                    try {
                        recomposer2.broadcastFrameClock.sendFrame(j);
                        Snapshot.INSTANCE.sendApplyNotifications();
                        Unit unit = Unit.INSTANCE;
                        trace.endSection(objBeginSection);
                    } finally {
                    }
                }
                Recomposer recomposer3 = recomposer;
                IdentityArraySet<Object> identityArraySet10 = identityArraySet;
                IdentityArraySet<ControlledComposition> identityArraySet11 = identityArraySet;
                List<ControlledComposition> list = list;
                List<MovableContentStateReference> list2 = list;
                Set<ControlledComposition> set = set;
                List<ControlledComposition> list3 = list;
                Set<ControlledComposition> set2 = set;
                objBeginSection = Trace.INSTANCE.beginSection("Recomposer:recompose");
                try {
                    recomposer3.recordComposerModifications();
                    synchronized (recomposer3.stateLock) {
                        try {
                            List list4 = recomposer3.compositionInvalidations;
                            int size = list4.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                list.add((ControlledComposition) list4.get(i3));
                            }
                            recomposer3.compositionInvalidations.clear();
                            Unit unit2 = Unit.INSTANCE;
                        } finally {
                        }
                    }
                    identityArraySet10.clear();
                    identityArraySet11.clear();
                    while (true) {
                        if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
                            break;
                        }
                        try {
                            try {
                                int size2 = list.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    ControlledComposition controlledComposition = list.get(i4);
                                    identityArraySet11.add(controlledComposition);
                                    ControlledComposition controlledCompositionPerformRecompose = recomposer3.performRecompose(controlledComposition, identityArraySet10);
                                    if (controlledCompositionPerformRecompose != null) {
                                        list3.add(controlledCompositionPerformRecompose);
                                    }
                                }
                                list.clear();
                                if (identityArraySet10.isNotEmpty()) {
                                    synchronized (recomposer3.stateLock) {
                                        try {
                                            List knownCompositions = recomposer3.getKnownCompositions();
                                            int size3 = knownCompositions.size();
                                            for (int i5 = 0; i5 < size3; i5++) {
                                                ControlledComposition controlledComposition2 = (ControlledComposition) knownCompositions.get(i5);
                                                if (!identityArraySet11.contains(controlledComposition2) && controlledComposition2.observesAnyOf(identityArraySet10)) {
                                                    list.add(controlledComposition2);
                                                }
                                            }
                                            Unit unit3 = Unit.INSTANCE;
                                        } finally {
                                        }
                                    }
                                }
                                if (list.isEmpty()) {
                                    try {
                                        C17662.invokeSuspend$fillToInsert(list2, recomposer3);
                                        while (!list2.isEmpty()) {
                                            CollectionsKt__MutableCollectionsKt.addAll(set, recomposer3.performInsertValues(list2, identityArraySet10));
                                            C17662.invokeSuspend$fillToInsert(list2, recomposer3);
                                        }
                                    } catch (Exception e) {
                                        Recomposer.processCompositionError$default(recomposer3, e, null, true, 2, null);
                                        C17662.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet10, identityArraySet11);
                                    }
                                }
                            } catch (Exception e2) {
                                Recomposer.processCompositionError$default(recomposer3, e2, null, true, 2, null);
                                C17662.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet10, identityArraySet11);
                                list.clear();
                            }
                        } catch (Throwable th) {
                            list.clear();
                            throw th;
                        }
                    }
                    if (!list3.isEmpty()) {
                        recomposer3.changeCount = recomposer3.getChangeCount() + 1;
                        try {
                            try {
                                int size4 = list3.size();
                                for (int i6 = 0; i6 < size4; i6++) {
                                    set2.add(list3.get(i6));
                                }
                                int size5 = list3.size();
                                for (int i7 = 0; i7 < size5; i7++) {
                                    list3.get(i7).applyChanges();
                                }
                                list3.clear();
                                try {
                                    if (!(!set.isEmpty())) {
                                        try {
                                            CollectionsKt__MutableCollectionsKt.addAll(set2, set);
                                            Iterator<T> it = set.iterator();
                                            while (it.hasNext()) {
                                                ((ControlledComposition) it.next()).applyLateChanges();
                                            }
                                            try {
                                                if (!set2.isEmpty()) {
                                                    try {
                                                        Iterator<T> it2 = set2.iterator();
                                                        while (it2.hasNext()) {
                                                            ((ControlledComposition) it2.next()).changesApplied();
                                                        }
                                                    } catch (Exception e3) {
                                                        Recomposer.processCompositionError$default(recomposer3, e3, null, false, 6, null);
                                                        C17662.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet10, identityArraySet11);
                                                        set2.clear();
                                                    }
                                                }
                                                synchronized (recomposer3.stateLock) {
                                                    recomposer3.deriveStateLocked();
                                                }
                                                Snapshot.INSTANCE.notifyObjectsInitialized();
                                                identityArraySet11.clear();
                                                identityArraySet10.clear();
                                                recomposer3.compositionsRemoved = null;
                                                Unit unit4 = Unit.INSTANCE;
                                            } finally {
                                                set2.clear();
                                            }
                                        } catch (Exception e4) {
                                            Recomposer.processCompositionError$default(recomposer3, e4, null, false, 6, null);
                                            C17662.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet10, identityArraySet11);
                                            set.clear();
                                        }
                                    } else {
                                        if (!set2.isEmpty()) {
                                        }
                                        synchronized (recomposer3.stateLock) {
                                        }
                                    }
                                } finally {
                                    set.clear();
                                }
                            } finally {
                                list3.clear();
                            }
                        } catch (Exception e5) {
                            Recomposer.processCompositionError$default(recomposer3, e5, null, false, 6, null);
                            C17662.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet10, identityArraySet11);
                            list3.clear();
                        }
                    } else if (!(!set.isEmpty())) {
                    }
                } finally {
                }
            }
        }
    }

    @Nullable
    public final Object runRecomposeAndApplyChanges(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objRecompositionRunner = recompositionRunner(new C17662(null), continuation);
        return objRecompositionRunner == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRecompositionRunner : Unit.INSTANCE;
    }

    public static /* synthetic */ void processCompositionError$default(Recomposer recomposer, Exception exc, ControlledComposition controlledComposition, boolean z, int i, Object obj) throws Exception {
        if ((i & 2) != 0) {
            controlledComposition = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        recomposer.processCompositionError(exc, controlledComposition, z);
    }

    private final void processCompositionError(Exception e, ControlledComposition failedInitialComposition, boolean recoverable) throws Exception {
        if (_hotReloadEnabled.get().booleanValue() && !(e instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                try {
                    ActualAndroid_androidKt.logError("Error was captured in composition while live edit was enabled.", e);
                    this.compositionsAwaitingApply.clear();
                    this.compositionInvalidations.clear();
                    this.snapshotInvalidations = new IdentityArraySet<>();
                    this.compositionValuesAwaitingInsert.clear();
                    this.compositionValuesRemoved.clear();
                    this.compositionValueStatesAvailable.clear();
                    this.errorState = new RecomposerErrorState(recoverable, e);
                    if (failedInitialComposition != null) {
                        List arrayList = this.failedCompositions;
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            this.failedCompositions = arrayList;
                        }
                        if (!arrayList.contains(failedInitialComposition)) {
                            arrayList.add(failedInitialComposition);
                        }
                        removeKnownCompositionLocked(failedInitialComposition);
                    }
                    deriveStateLocked();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        synchronized (this.stateLock) {
            RecomposerErrorState recomposerErrorState = this.errorState;
            if (recomposerErrorState == null) {
                this.errorState = new RecomposerErrorState(false, e);
                Unit unit = Unit.INSTANCE;
            } else {
                throw recomposerErrorState.getCause();
            }
        }
        throw e;
    }

    private final void clearKnownCompositionsLocked() {
        this._knownCompositions.clear();
        this._knownCompositionsCache = CollectionsKt__CollectionsKt.emptyList();
    }

    private final void removeKnownCompositionLocked(ControlledComposition composition) {
        this._knownCompositions.remove(composition);
        this._knownCompositionsCache = null;
    }

    private final void addKnownCompositionLocked(ControlledComposition composition) {
        this._knownCompositions.add(composition);
        this._knownCompositionsCache = null;
    }

    public final RecomposerErrorState resetErrorState() {
        RecomposerErrorState recomposerErrorState;
        synchronized (this.stateLock) {
            recomposerErrorState = this.errorState;
            if (recomposerErrorState != null) {
                this.errorState = null;
                deriveStateLocked();
            }
        }
        return recomposerErrorState;
    }

    public final void retryFailedCompositions() {
        List<ControlledComposition> list;
        synchronized (this.stateLock) {
            list = this.failedCompositions;
            this.failedCompositions = null;
        }
        if (list == null) {
            return;
        }
        while (!list.isEmpty()) {
            try {
                ControlledComposition controlledComposition = (ControlledComposition) CollectionsKt__MutableCollectionsKt.removeLast(list);
                if (controlledComposition instanceof CompositionImpl) {
                    controlledComposition.invalidateAll();
                    controlledComposition.setContent(((CompositionImpl) controlledComposition).getComposable());
                    if (this.errorState != null) {
                        break;
                    }
                }
            } catch (Throwable th) {
                if (!list.isEmpty()) {
                    synchronized (this.stateLock) {
                        try {
                            List<ControlledComposition> list2 = this.failedCompositions;
                            if (list2 != null) {
                                list2.addAll(list);
                                list = list2;
                            }
                            this.failedCompositions = list;
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                throw th;
            }
        }
        if (!list.isEmpty()) {
            synchronized (this.stateLock) {
                try {
                    List<ControlledComposition> list3 = this.failedCompositions;
                    if (list3 != null) {
                        list3.addAll(list);
                        list = list3;
                    }
                    this.failedCompositions = list;
                    Unit unit2 = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", m7120f = "Recomposer.kt", m7121i = {0, 0, 0, 1}, m7122l = {840, 860, 861}, m7123m = "invokeSuspend", m7124n = {"recomposeCoroutineScope", "frameSignal", "frameLoop", "frameLoop"}, m7125s = {"L$0", "L$1", "L$2", "L$0"})
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n+ 2 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1564:1\n477#2,3:1565\n480#2,2:1572\n482#2,3:1575\n485#2,5:1579\n33#3,4:1568\n38#3:1574\n82#4:1578\n82#4:1584\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n*L\n843#1:1565,3\n843#1:1572,2\n843#1:1575,3\n843#1:1579,5\n843#1:1568,4\n843#1:1574\n844#1:1578\n856#1:1584\n*E\n"})
    /* renamed from: androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 */
    public static final class C17672 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
        public final /* synthetic */ CoroutineContext $recomposeCoroutineContext;
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public Object L$2;
        public int label;
        public final /* synthetic */ Recomposer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17672(CoroutineContext coroutineContext, Recomposer recomposer, Continuation<? super C17672> continuation) {
            super(3, continuation);
            this.$recomposeCoroutineContext = coroutineContext;
            this.this$0 = recomposer;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @NotNull MonotonicFrameClock monotonicFrameClock, @Nullable Continuation<? super Unit> continuation) {
            C17672 c17672 = new C17672(this.$recomposeCoroutineContext, this.this$0, continuation);
            c17672.L$0 = coroutineScope;
            c17672.L$1 = monotonicFrameClock;
            return c17672.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x0182 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0094  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x00a2 -> B:88:0x0039). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Job jobLaunch$default;
            CoroutineScope coroutineScope;
            ProduceFrameSignal produceFrameSignal;
            Continuation<Unit> continuationRequestFrameLocked;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) this.L$1;
                CoroutineContext coroutineContext = this.$recomposeCoroutineContext;
                Job.Companion companion = Job.INSTANCE;
                boolean z = coroutineContext.get(companion) == null;
                CoroutineContext coroutineContext2 = this.$recomposeCoroutineContext;
                if (!z) {
                    throw new IllegalArgumentException(("recomposeCoroutineContext may not contain a Job; found " + coroutineContext2.get(companion)).toString());
                }
                CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineScope2.getCoroutineContext().plus(this.$recomposeCoroutineContext).plus(JobKt.Job(JobKt.getJob(coroutineScope2.getCoroutineContext()))));
                ProduceFrameSignal produceFrameSignal2 = new ProduceFrameSignal();
                jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1(this.this$0, monotonicFrameClock, produceFrameSignal2, null), 3, null);
                coroutineScope = CoroutineScope;
                produceFrameSignal = produceFrameSignal2;
                if (!this.this$0.getShouldKeepRecomposing()) {
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    jobLaunch$default = (Job) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 3;
                    if (JobKt.cancelAndJoin(jobLaunch$default, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                jobLaunch$default = (Job) this.L$2;
                produceFrameSignal = (ProduceFrameSignal) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope3 = coroutineScope;
                Recomposer recomposer = this.this$0;
                IdentityArraySet identityArraySet = recomposer.snapshotInvalidations;
                if (identityArraySet.isNotEmpty()) {
                    List knownCompositions = recomposer.getKnownCompositions();
                    int size = knownCompositions.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((ControlledComposition) knownCompositions.get(i2)).recordModificationsOf(identityArraySet);
                    }
                    recomposer.snapshotInvalidations = new IdentityArraySet();
                }
                List list = recomposer.compositionInvalidations;
                int i3 = 0;
                for (int size2 = list.size(); i3 < size2; size2 = size2) {
                    ControlledComposition controlledComposition = (ControlledComposition) list.get(i3);
                    synchronized (recomposer.stateLock) {
                        recomposer.concurrentCompositionsOutstanding++;
                    }
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope3, CompositionKt.getRecomposeCoroutineContext(controlledComposition), null, new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(recomposer, controlledComposition, null), 2, null);
                    i3++;
                    list = list;
                    recomposer = recomposer;
                }
                Recomposer recomposer2 = recomposer;
                recomposer2.compositionInvalidations.clear();
                if (recomposer2.deriveStateLocked() != null) {
                    Object obj2 = this.this$0.stateLock;
                    Recomposer recomposer3 = this.this$0;
                    synchronized (obj2) {
                        continuationRequestFrameLocked = recomposer3.getHasConcurrentFrameWorkLocked() ? produceFrameSignal.requestFrameLocked() : null;
                    }
                    if (continuationRequestFrameLocked != null) {
                        Result.Companion companion2 = Result.INSTANCE;
                        continuationRequestFrameLocked.resumeWith(Result.m15699constructorimpl(Unit.INSTANCE));
                    }
                    coroutineScope = coroutineScope3;
                    if (!this.this$0.getShouldKeepRecomposing()) {
                        Recomposer recomposer4 = this.this$0;
                        this.L$0 = coroutineScope;
                        this.L$1 = produceFrameSignal;
                        this.L$2 = jobLaunch$default;
                        this.label = 1;
                        if (recomposer4.awaitWorkAvailable(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        CoroutineScope coroutineScope32 = coroutineScope;
                        Recomposer recomposer5 = this.this$0;
                        IdentityArraySet identityArraySet2 = recomposer5.snapshotInvalidations;
                        if (identityArraySet2.isNotEmpty()) {
                        }
                        List list2 = recomposer5.compositionInvalidations;
                        int i32 = 0;
                        while (i32 < size2) {
                        }
                        Recomposer recomposer22 = recomposer5;
                        recomposer22.compositionInvalidations.clear();
                        if (recomposer22.deriveStateLocked() != null) {
                            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                        }
                    } else {
                        Job job = JobKt.getJob(coroutineScope.getCoroutineContext());
                        this.L$0 = jobLaunch$default;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 2;
                        if (JobKt.cancelAndJoin(job, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.L$0 = null;
                        this.label = 3;
                        if (JobKt.cancelAndJoin(jobLaunch$default, this) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    @ExperimentalComposeApi
    @Nullable
    public final Object runRecomposeConcurrentlyAndApplyChanges(@NotNull CoroutineContext coroutineContext, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objRecompositionRunner = recompositionRunner(new C17672(coroutineContext, this, null), continuation);
        return objRecompositionRunner == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRecompositionRunner : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4 A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00a2 -> B:38:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object runFrameLoop(MonotonicFrameClock monotonicFrameClock, ProduceFrameSignal produceFrameSignal, Continuation<? super Unit> continuation) throws Throwable {
        C17641 c17641;
        ArrayList arrayList;
        ArrayList arrayList2;
        Recomposer recomposer;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Recomposer recomposer2;
        MonotonicFrameClock monotonicFrameClock2;
        ProduceFrameSignal produceFrameSignal2;
        C17652 c17652;
        Object obj;
        ArrayList arrayList5;
        ArrayList arrayList6;
        if (continuation instanceof C17641) {
            c17641 = (C17641) continuation;
            int i = c17641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17641.label = i - Integer.MIN_VALUE;
            } else {
                c17641 = new C17641(continuation);
            }
        }
        Object obj2 = c17641.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17641.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            recomposer = this;
            obj = recomposer.stateLock;
            c17641.L$0 = recomposer;
            c17641.L$1 = monotonicFrameClock;
            c17641.L$2 = produceFrameSignal;
            c17641.L$3 = arrayList;
            c17641.L$4 = arrayList2;
            c17641.label = 1;
            if (produceFrameSignal.awaitFrameRequest(obj, c17641) != coroutine_suspended) {
            }
        } else if (i2 == 1) {
            ?? r8 = (List) c17641.L$4;
            ?? r9 = (List) c17641.L$3;
            produceFrameSignal2 = (ProduceFrameSignal) c17641.L$2;
            monotonicFrameClock2 = (MonotonicFrameClock) c17641.L$1;
            recomposer2 = (Recomposer) c17641.L$0;
            ResultKt.throwOnFailure(obj2);
            arrayList4 = r8;
            arrayList3 = r9;
            c17652 = new Function1<Long, CancellableContinuation<? super Unit>>() { // from class: androidx.compose.runtime.Recomposer.runFrameLoop.2
                public final /* synthetic */ ProduceFrameSignal $frameSignal;
                public final /* synthetic */ List<ControlledComposition> $toApply;
                public final /* synthetic */ List<ControlledComposition> $toRecompose;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C17652(List<ControlledComposition> arrayList32, List<ControlledComposition> arrayList42, ProduceFrameSignal produceFrameSignal22) {
                    super(1);
                    list = arrayList32;
                    list = arrayList42;
                    produceFrameSignal = produceFrameSignal22;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ CancellableContinuation<? super Unit> invoke(Long l) {
                    return invoke(l.longValue());
                }

                @Nullable
                public final CancellableContinuation<Unit> invoke(long j) {
                    Object objBeginSection;
                    int i3;
                    CancellableContinuation<Unit> cancellableContinuationDeriveStateLocked;
                    if (Recomposer.this.getHasBroadcastFrameClockAwaiters()) {
                        Recomposer recomposer3 = Recomposer.this;
                        Trace trace = Trace.INSTANCE;
                        objBeginSection = trace.beginSection("Recomposer:animation");
                        try {
                            recomposer3.broadcastFrameClock.sendFrame(j);
                            Snapshot.INSTANCE.sendApplyNotifications();
                            Unit unit = Unit.INSTANCE;
                            trace.endSection(objBeginSection);
                        } finally {
                        }
                    }
                    Recomposer recomposer4 = Recomposer.this;
                    List<ControlledComposition> list = list;
                    List<ControlledComposition> list2 = list;
                    ProduceFrameSignal produceFrameSignal3 = produceFrameSignal;
                    objBeginSection = Trace.INSTANCE.beginSection("Recomposer:recompose");
                    try {
                        recomposer4.recordComposerModifications();
                        synchronized (recomposer4.stateLock) {
                            try {
                                List list3 = recomposer4.compositionsAwaitingApply;
                                int size = list3.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    list2.add((ControlledComposition) list3.get(i4));
                                }
                                recomposer4.compositionsAwaitingApply.clear();
                                List list4 = recomposer4.compositionInvalidations;
                                int size2 = list4.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    list.add((ControlledComposition) list4.get(i5));
                                }
                                recomposer4.compositionInvalidations.clear();
                                produceFrameSignal3.takeFrameRequestLocked();
                                Unit unit2 = Unit.INSTANCE;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        IdentityArraySet identityArraySet = new IdentityArraySet();
                        try {
                            int size3 = list.size();
                            for (int i6 = 0; i6 < size3; i6++) {
                                ControlledComposition controlledCompositionPerformRecompose = recomposer4.performRecompose(list.get(i6), identityArraySet);
                                if (controlledCompositionPerformRecompose != null) {
                                    list2.add(controlledCompositionPerformRecompose);
                                }
                            }
                            list.clear();
                            if (!list2.isEmpty()) {
                                recomposer4.changeCount = recomposer4.getChangeCount() + 1;
                            }
                            try {
                                int size4 = list2.size();
                                for (i3 = 0; i3 < size4; i3++) {
                                    list2.get(i3).applyChanges();
                                }
                                list2.clear();
                                synchronized (recomposer4.stateLock) {
                                    cancellableContinuationDeriveStateLocked = recomposer4.deriveStateLocked();
                                }
                                return cancellableContinuationDeriveStateLocked;
                            } catch (Throwable th2) {
                                list2.clear();
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            list.clear();
                            throw th3;
                        }
                    } finally {
                    }
                }
            };
            c17641.L$0 = recomposer2;
            c17641.L$1 = monotonicFrameClock2;
            c17641.L$2 = produceFrameSignal22;
            c17641.L$3 = arrayList32;
            c17641.L$4 = arrayList42;
            c17641.label = 2;
            arrayList6 = arrayList42;
            arrayList5 = arrayList32;
            if (monotonicFrameClock2.withFrameNanos(c17652, c17641) == coroutine_suspended) {
            }
            arrayList = arrayList5;
            produceFrameSignal = produceFrameSignal22;
            arrayList2 = arrayList6;
            monotonicFrameClock = monotonicFrameClock2;
            recomposer = recomposer2;
            obj = recomposer.stateLock;
            c17641.L$0 = recomposer;
            c17641.L$1 = monotonicFrameClock;
            c17641.L$2 = produceFrameSignal;
            c17641.L$3 = arrayList;
            c17641.L$4 = arrayList2;
            c17641.label = 1;
            if (produceFrameSignal.awaitFrameRequest(obj, c17641) != coroutine_suspended) {
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ?? r82 = (List) c17641.L$4;
            ?? r92 = (List) c17641.L$3;
            produceFrameSignal22 = (ProduceFrameSignal) c17641.L$2;
            monotonicFrameClock2 = (MonotonicFrameClock) c17641.L$1;
            recomposer2 = (Recomposer) c17641.L$0;
            ResultKt.throwOnFailure(obj2);
            arrayList6 = r82;
            arrayList5 = r92;
            arrayList = arrayList5;
            produceFrameSignal = produceFrameSignal22;
            arrayList2 = arrayList6;
            monotonicFrameClock = monotonicFrameClock2;
            recomposer = recomposer2;
            obj = recomposer.stateLock;
            c17641.L$0 = recomposer;
            c17641.L$1 = monotonicFrameClock;
            c17641.L$2 = produceFrameSignal;
            c17641.L$3 = arrayList;
            c17641.L$4 = arrayList2;
            c17641.label = 1;
            if (produceFrameSignal.awaitFrameRequest(obj, c17641) != coroutine_suspended) {
                return coroutine_suspended;
            }
            recomposer2 = recomposer;
            monotonicFrameClock2 = monotonicFrameClock;
            arrayList42 = arrayList2;
            produceFrameSignal22 = produceFrameSignal;
            arrayList32 = arrayList;
            c17652 = new Function1<Long, CancellableContinuation<? super Unit>>() { // from class: androidx.compose.runtime.Recomposer.runFrameLoop.2
                public final /* synthetic */ ProduceFrameSignal $frameSignal;
                public final /* synthetic */ List<ControlledComposition> $toApply;
                public final /* synthetic */ List<ControlledComposition> $toRecompose;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C17652(List<ControlledComposition> arrayList32, List<ControlledComposition> arrayList42, ProduceFrameSignal produceFrameSignal22) {
                    super(1);
                    list = arrayList32;
                    list = arrayList42;
                    produceFrameSignal = produceFrameSignal22;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ CancellableContinuation<? super Unit> invoke(Long l) {
                    return invoke(l.longValue());
                }

                @Nullable
                public final CancellableContinuation<Unit> invoke(long j) {
                    Object objBeginSection;
                    int i3;
                    CancellableContinuation<Unit> cancellableContinuationDeriveStateLocked;
                    if (Recomposer.this.getHasBroadcastFrameClockAwaiters()) {
                        Recomposer recomposer3 = Recomposer.this;
                        Trace trace = Trace.INSTANCE;
                        objBeginSection = trace.beginSection("Recomposer:animation");
                        try {
                            recomposer3.broadcastFrameClock.sendFrame(j);
                            Snapshot.INSTANCE.sendApplyNotifications();
                            Unit unit = Unit.INSTANCE;
                            trace.endSection(objBeginSection);
                        } finally {
                        }
                    }
                    Recomposer recomposer4 = Recomposer.this;
                    List<ControlledComposition> list = list;
                    List<ControlledComposition> list2 = list;
                    ProduceFrameSignal produceFrameSignal3 = produceFrameSignal;
                    objBeginSection = Trace.INSTANCE.beginSection("Recomposer:recompose");
                    try {
                        recomposer4.recordComposerModifications();
                        synchronized (recomposer4.stateLock) {
                            try {
                                List list3 = recomposer4.compositionsAwaitingApply;
                                int size = list3.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    list2.add((ControlledComposition) list3.get(i4));
                                }
                                recomposer4.compositionsAwaitingApply.clear();
                                List list4 = recomposer4.compositionInvalidations;
                                int size2 = list4.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    list.add((ControlledComposition) list4.get(i5));
                                }
                                recomposer4.compositionInvalidations.clear();
                                produceFrameSignal3.takeFrameRequestLocked();
                                Unit unit2 = Unit.INSTANCE;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        IdentityArraySet identityArraySet = new IdentityArraySet();
                        try {
                            int size3 = list.size();
                            for (int i6 = 0; i6 < size3; i6++) {
                                ControlledComposition controlledCompositionPerformRecompose = recomposer4.performRecompose(list.get(i6), identityArraySet);
                                if (controlledCompositionPerformRecompose != null) {
                                    list2.add(controlledCompositionPerformRecompose);
                                }
                            }
                            list.clear();
                            if (!list2.isEmpty()) {
                                recomposer4.changeCount = recomposer4.getChangeCount() + 1;
                            }
                            try {
                                int size4 = list2.size();
                                for (i3 = 0; i3 < size4; i3++) {
                                    list2.get(i3).applyChanges();
                                }
                                list2.clear();
                                synchronized (recomposer4.stateLock) {
                                    cancellableContinuationDeriveStateLocked = recomposer4.deriveStateLocked();
                                }
                                return cancellableContinuationDeriveStateLocked;
                            } catch (Throwable th2) {
                                list2.clear();
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            list.clear();
                            throw th3;
                        }
                    } finally {
                    }
                }
            };
            c17641.L$0 = recomposer2;
            c17641.L$1 = monotonicFrameClock2;
            c17641.L$2 = produceFrameSignal22;
            c17641.L$3 = arrayList32;
            c17641.L$4 = arrayList42;
            c17641.label = 2;
            arrayList6 = arrayList42;
            arrayList5 = arrayList32;
            if (monotonicFrameClock2.withFrameNanos(c17652, c17641) == coroutine_suspended) {
                return coroutine_suspended;
            }
            arrayList = arrayList5;
            produceFrameSignal = produceFrameSignal22;
            arrayList2 = arrayList6;
            monotonicFrameClock = monotonicFrameClock2;
            recomposer = recomposer2;
            obj = recomposer.stateLock;
            c17641.L$0 = recomposer;
            c17641.L$1 = monotonicFrameClock;
            c17641.L$2 = produceFrameSignal;
            c17641.L$3 = arrayList;
            c17641.L$4 = arrayList2;
            c17641.label = 1;
            if (produceFrameSignal.awaitFrameRequest(obj, c17641) != coroutine_suspended) {
            }
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "Lkotlinx/coroutines/CancellableContinuation;", "", "frameTime", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runFrameLoop$2\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1564:1\n46#2,5:1565\n46#2,3:1570\n50#2:1599\n82#3:1573\n82#3:1598\n33#4,6:1574\n33#4,6:1580\n33#4,6:1586\n33#4,6:1592\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runFrameLoop$2\n*L\n882#1:1565,5\n892#1:1570,3\n892#1:1599\n897#1:1573\n930#1:1598\n898#1:1574,6\n900#1:1580,6\n908#1:1586,6\n923#1:1592,6\n*E\n"})
    /* renamed from: androidx.compose.runtime.Recomposer$runFrameLoop$2 */
    public static final class C17652 extends Lambda implements Function1<Long, CancellableContinuation<? super Unit>> {
        public final /* synthetic */ ProduceFrameSignal $frameSignal;
        public final /* synthetic */ List<ControlledComposition> $toApply;
        public final /* synthetic */ List<ControlledComposition> $toRecompose;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17652(List<ControlledComposition> arrayList32, List<ControlledComposition> arrayList42, ProduceFrameSignal produceFrameSignal22) {
            super(1);
            list = arrayList32;
            list = arrayList42;
            produceFrameSignal = produceFrameSignal22;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CancellableContinuation<? super Unit> invoke(Long l) {
            return invoke(l.longValue());
        }

        @Nullable
        public final CancellableContinuation<Unit> invoke(long j) {
            Object objBeginSection;
            int i3;
            CancellableContinuation<Unit> cancellableContinuationDeriveStateLocked;
            if (Recomposer.this.getHasBroadcastFrameClockAwaiters()) {
                Recomposer recomposer3 = Recomposer.this;
                Trace trace = Trace.INSTANCE;
                objBeginSection = trace.beginSection("Recomposer:animation");
                try {
                    recomposer3.broadcastFrameClock.sendFrame(j);
                    Snapshot.INSTANCE.sendApplyNotifications();
                    Unit unit = Unit.INSTANCE;
                    trace.endSection(objBeginSection);
                } finally {
                }
            }
            Recomposer recomposer4 = Recomposer.this;
            List<ControlledComposition> list = list;
            List<ControlledComposition> list2 = list;
            ProduceFrameSignal produceFrameSignal3 = produceFrameSignal;
            objBeginSection = Trace.INSTANCE.beginSection("Recomposer:recompose");
            try {
                recomposer4.recordComposerModifications();
                synchronized (recomposer4.stateLock) {
                    try {
                        List list3 = recomposer4.compositionsAwaitingApply;
                        int size = list3.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            list2.add((ControlledComposition) list3.get(i4));
                        }
                        recomposer4.compositionsAwaitingApply.clear();
                        List list4 = recomposer4.compositionInvalidations;
                        int size2 = list4.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            list.add((ControlledComposition) list4.get(i5));
                        }
                        recomposer4.compositionInvalidations.clear();
                        produceFrameSignal3.takeFrameRequestLocked();
                        Unit unit2 = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                IdentityArraySet identityArraySet = new IdentityArraySet();
                try {
                    int size3 = list.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        ControlledComposition controlledCompositionPerformRecompose = recomposer4.performRecompose(list.get(i6), identityArraySet);
                        if (controlledCompositionPerformRecompose != null) {
                            list2.add(controlledCompositionPerformRecompose);
                        }
                    }
                    list.clear();
                    if (!list2.isEmpty()) {
                        recomposer4.changeCount = recomposer4.getChangeCount() + 1;
                    }
                    try {
                        int size4 = list2.size();
                        for (i3 = 0; i3 < size4; i3++) {
                            list2.get(i3).applyChanges();
                        }
                        list2.clear();
                        synchronized (recomposer4.stateLock) {
                            cancellableContinuationDeriveStateLocked = recomposer4.deriveStateLocked();
                        }
                        return cancellableContinuationDeriveStateLocked;
                    } catch (Throwable th2) {
                        list2.clear();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    list.clear();
                    throw th3;
                }
            } finally {
            }
        }
    }

    public final boolean getHasSchedulingWork() {
        boolean z;
        synchronized (this.stateLock) {
            z = true;
            if (!this.snapshotInvalidations.isNotEmpty() && !(!this.compositionInvalidations.isEmpty())) {
                if (!getHasBroadcastFrameClockAwaitersLocked()) {
                    z = false;
                }
            }
        }
        return z;
    }

    public final Object awaitWorkAvailable(Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl;
        if (getHasSchedulingWork()) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl2.initCancellability();
        synchronized (this.stateLock) {
            if (getHasSchedulingWork()) {
                cancellableContinuationImpl = cancellableContinuationImpl2;
            } else {
                this.workContinuation = cancellableContinuationImpl2;
                cancellableContinuationImpl = null;
            }
        }
        if (cancellableContinuationImpl != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m15699constructorimpl(Unit.INSTANCE));
        }
        Object result = cancellableContinuationImpl2.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    /* compiled from: Recomposer.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", m7120f = "Recomposer.kt", m7121i = {0, 0}, m7122l = {1003}, m7123m = "invokeSuspend", m7124n = {"callingJob", "unregisterApplyObserver"}, m7125s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1564:1\n82#2:1565\n82#2:1572\n33#3,6:1566\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n*L\n999#1:1565\n1008#1:1572\n1001#1:1566,6\n*E\n"})
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2 */
    public static final class C17632 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> $block;
        public final /* synthetic */ MonotonicFrameClock $parentFrameClock;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C17632(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, MonotonicFrameClock monotonicFrameClock, Continuation<? super C17632> continuation) {
            super(2, continuation);
            this.$block = function3;
            this.$parentFrameClock = monotonicFrameClock;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C17632 c17632 = Recomposer.this.new C17632(this.$block, this.$parentFrameClock, continuation);
            c17632.L$0 = obj;
            return c17632;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C17632) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:121:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:123:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Job job;
            ObserverHandle observerHandle;
            Throwable th;
            List knownCompositions;
            Object obj2;
            Object obj3;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                job = JobKt.getJob(((CoroutineScope) this.L$0).getCoroutineContext());
                Recomposer.this.registerRunnerJob(job);
                Snapshot.Companion companion = Snapshot.INSTANCE;
                final Recomposer recomposer = Recomposer.this;
                ObserverHandle observerHandleRegisterApplyObserver = companion.registerApplyObserver(new Function2<Set<? extends Object>, Snapshot, Unit>() { // from class: androidx.compose.runtime.Recomposer$recompositionRunner$2$unregisterApplyObserver$1
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set, Snapshot snapshot) {
                        invoke2(set, snapshot);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:4:0x0009, B:6:0x001b, B:8:0x0020, B:10:0x002d, B:12:0x0039, B:18:0x0052, B:17:0x004b, B:28:0x0081, B:19:0x0055, B:20:0x005b, B:22:0x0061, B:24:0x0069, B:27:0x0079), top: B:37:0x0009 }] */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke2(@NotNull Set<? extends Object> set, @NotNull Snapshot snapshot) {
                        CancellableContinuation cancellableContinuationDeriveStateLocked;
                        Object obj4 = recomposer.stateLock;
                        Recomposer recomposer2 = recomposer;
                        synchronized (obj4) {
                            try {
                                if (((Recomposer.State) recomposer2._state.getValue()).compareTo(Recomposer.State.Idle) >= 0) {
                                    if (set instanceof IdentityArraySet) {
                                        IdentityArraySet identityArraySet = (IdentityArraySet) set;
                                        Object[] values = identityArraySet.getValues();
                                        int size = identityArraySet.size();
                                        for (int i2 = 0; i2 < size; i2++) {
                                            Object obj5 = values[i2];
                                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                            if (obj5 instanceof StateObjectImpl) {
                                                ReaderKind.Companion companion2 = ReaderKind.INSTANCE;
                                                if (((StateObjectImpl) obj5).m10974isReadInh_f27i8$runtime_release(ReaderKind.m10962constructorimpl(1))) {
                                                    recomposer2.snapshotInvalidations.add(obj5);
                                                }
                                            }
                                        }
                                    } else {
                                        for (Object obj6 : set) {
                                            if (obj6 instanceof StateObjectImpl) {
                                                ReaderKind.Companion companion3 = ReaderKind.INSTANCE;
                                                if (!((StateObjectImpl) obj6).m10974isReadInh_f27i8$runtime_release(ReaderKind.m10962constructorimpl(1))) {
                                                }
                                            }
                                            recomposer2.snapshotInvalidations.add(obj6);
                                        }
                                    }
                                    cancellableContinuationDeriveStateLocked = recomposer2.deriveStateLocked();
                                } else {
                                    cancellableContinuationDeriveStateLocked = null;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (cancellableContinuationDeriveStateLocked != null) {
                            Result.Companion companion4 = Result.INSTANCE;
                            cancellableContinuationDeriveStateLocked.resumeWith(Result.m15699constructorimpl(Unit.INSTANCE));
                        }
                    }
                });
                Recomposer.INSTANCE.addRunning(Recomposer.this.recomposerInfo);
                try {
                    Object obj4 = Recomposer.this.stateLock;
                    Recomposer recomposer2 = Recomposer.this;
                    synchronized (obj4) {
                        knownCompositions = recomposer2.getKnownCompositions();
                    }
                    int size = knownCompositions.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((ControlledComposition) knownCompositions.get(i2)).invalidateAll();
                    }
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$block, this.$parentFrameClock, null);
                    this.L$0 = job;
                    this.L$1 = observerHandleRegisterApplyObserver;
                    this.label = 1;
                    if (CoroutineScopeKt.coroutineScope(anonymousClass3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    observerHandle = observerHandleRegisterApplyObserver;
                    observerHandle.dispose();
                    obj3 = Recomposer.this.stateLock;
                    Recomposer recomposer3 = Recomposer.this;
                    synchronized (obj3) {
                    }
                } catch (Throwable th2) {
                    observerHandle = observerHandleRegisterApplyObserver;
                    th = th2;
                    observerHandle.dispose();
                    obj2 = Recomposer.this.stateLock;
                    Recomposer recomposer4 = Recomposer.this;
                    synchronized (obj2) {
                        try {
                            if (recomposer4.runnerJob == job) {
                                recomposer4.runnerJob = null;
                            }
                            recomposer4.deriveStateLocked();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    Recomposer.INSTANCE.removeRunning(Recomposer.this.recomposerInfo);
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                observerHandle = (ObserverHandle) this.L$1;
                job = (Job) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    observerHandle.dispose();
                    obj3 = Recomposer.this.stateLock;
                    Recomposer recomposer32 = Recomposer.this;
                    synchronized (obj3) {
                        try {
                            if (recomposer32.runnerJob == job) {
                                recomposer32.runnerJob = null;
                            }
                            recomposer32.deriveStateLocked();
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    Recomposer.INSTANCE.removeRunning(Recomposer.this.recomposerInfo);
                    return Unit.INSTANCE;
                } catch (Throwable th5) {
                    th = th5;
                    observerHandle.dispose();
                    obj2 = Recomposer.this.stateLock;
                    Recomposer recomposer42 = Recomposer.this;
                    synchronized (obj2) {
                    }
                }
            }
        }

        /* compiled from: Recomposer.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", m7120f = "Recomposer.kt", m7121i = {}, m7122l = {1004}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$3 */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> $block;
            public final /* synthetic */ MonotonicFrameClock $parentFrameClock;
            public /* synthetic */ Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass3(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, MonotonicFrameClock monotonicFrameClock, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$block = function3;
                this.$parentFrameClock = monotonicFrameClock;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$block, this.$parentFrameClock, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> function3 = this.$block;
                    MonotonicFrameClock monotonicFrameClock = this.$parentFrameClock;
                    this.label = 1;
                    if (function3.invoke(coroutineScope, monotonicFrameClock, this) == coroutine_suspended) {
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

    public final Object recompositionRunner(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(this.broadcastFrameClock, new C17632(function3, MonotonicFrameClockKt.getMonotonicFrameClock(continuation.get$context()), null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            try {
                if (this._state.getValue().compareTo(State.Idle) >= 0) {
                    this._state.setValue(State.ShuttingDown);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Job.DefaultImpls.cancel$default((Job) this.effectJob, (CancellationException) null, 1, (Object) null);
    }

    public final void close() {
        if (this.effectJob.complete()) {
            synchronized (this.stateLock) {
                this.isClosed = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.runtime.Recomposer$join$2", m7120f = "Recomposer.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.runtime.Recomposer$join$2 */
    public static final class C17612 extends SuspendLambda implements Function2<State, Continuation<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public C17612(Continuation<? super C17612> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C17612 c17612 = new C17612(continuation);
            c17612.L$0 = obj;
            return c17612;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull State state, @Nullable Continuation<? super Boolean> continuation) {
            return ((C17612) create(state, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((State) this.L$0) == State.ShutDown);
        }
    }

    @Nullable
    public final Object join(@NotNull Continuation<? super Unit> continuation) {
        Object objFirst = FlowKt.first(getCurrentState(), new C17612(null), continuation);
        return objFirst == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFirst : Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.CompositionContext
    @ComposableInferredTarget(scheme = "[0[0]]")
    public void composeInitial$runtime_release(@NotNull ControlledComposition composition, @NotNull Function2<? super Composer, ? super Integer, Unit> content) throws Exception {
        boolean zIsComposing = composition.isComposing();
        try {
            Snapshot.Companion companion = Snapshot.INSTANCE;
            MutableSnapshot mutableSnapshotTakeMutableSnapshot = companion.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, null));
            try {
                Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
                try {
                    composition.composeContent(content);
                    Unit unit = Unit.INSTANCE;
                    if (!zIsComposing) {
                        companion.notifyObjectsInitialized();
                    }
                    synchronized (this.stateLock) {
                        if (this._state.getValue().compareTo(State.ShuttingDown) > 0 && !getKnownCompositions().contains(composition)) {
                            addKnownCompositionLocked(composition);
                        }
                    }
                    try {
                        performInitialMovableContentInserts(composition);
                        try {
                            composition.applyChanges();
                            composition.applyLateChanges();
                            if (zIsComposing) {
                                return;
                            }
                            companion.notifyObjectsInitialized();
                        } catch (Exception e) {
                            processCompositionError$default(this, e, null, false, 6, null);
                        }
                    } catch (Exception e2) {
                        processCompositionError(e2, composition, true);
                    }
                } finally {
                    mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                }
            } finally {
                applyAndCheck(mutableSnapshotTakeMutableSnapshot);
            }
        } catch (Exception e3) {
            processCompositionError(e3, composition, true);
        }
    }

    private final void performInitialMovableContentInserts(ControlledComposition composition) {
        synchronized (this.stateLock) {
            List<MovableContentStateReference> list = this.compositionValuesAwaitingInsert;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (Intrinsics.areEqual(list.get(i).getComposition(), composition)) {
                    Unit unit = Unit.INSTANCE;
                    ArrayList arrayList = new ArrayList();
                    performInitialMovableContentInserts$fillToInsert(arrayList, this, composition);
                    while (!arrayList.isEmpty()) {
                        performInsertValues(arrayList, null);
                        performInitialMovableContentInserts$fillToInsert(arrayList, this, composition);
                    }
                    return;
                }
            }
        }
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                Iterator<MovableContentStateReference> it = recomposer.compositionValuesAwaitingInsert.iterator();
                while (it.hasNext()) {
                    MovableContentStateReference next = it.next();
                    if (Intrinsics.areEqual(next.getComposition(), controlledComposition)) {
                        list.add(next);
                        it.remove();
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ControlledComposition performRecompose(final ControlledComposition composition, final IdentityArraySet<Object> modifiedValues) {
        Set<ControlledComposition> set;
        if (composition.isComposing() || composition.getDisposed() || ((set = this.compositionsRemoved) != null && set.contains(composition))) {
            return null;
        }
        MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, modifiedValues));
        try {
            Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
            if (modifiedValues != null) {
                try {
                    if (modifiedValues.isNotEmpty()) {
                        composition.prepareCompose(new Function0<Unit>() { // from class: androidx.compose.runtime.Recomposer$performRecompose$1$1
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
                                IdentityArraySet<Object> identityArraySet = modifiedValues;
                                ControlledComposition controlledComposition = composition;
                                Object[] values = identityArraySet.getValues();
                                int size = identityArraySet.size();
                                for (int i = 0; i < size; i++) {
                                    Object obj = values[i];
                                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    controlledComposition.recordWriteOf(obj);
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th;
                }
            }
            boolean zRecompose = composition.recompose();
            mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
            if (zRecompose) {
                return composition;
            }
            return null;
        } finally {
            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
        }
    }

    public final void discardUnusedValues() {
        int i;
        List listEmptyList;
        synchronized (this.stateLock) {
            try {
                if (!this.compositionValuesRemoved.isEmpty()) {
                    List listFlatten = CollectionsKt__IterablesKt.flatten(this.compositionValuesRemoved.values());
                    this.compositionValuesRemoved.clear();
                    listEmptyList = new ArrayList(listFlatten.size());
                    int size = listFlatten.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        MovableContentStateReference movableContentStateReference = (MovableContentStateReference) listFlatten.get(i2);
                        listEmptyList.add(TuplesKt.m7112to(movableContentStateReference, this.compositionValueStatesAvailable.get(movableContentStateReference)));
                    }
                    this.compositionValueStatesAvailable.clear();
                } else {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size2 = listEmptyList.size();
        for (i = 0; i < size2; i++) {
            Pair pair = (Pair) listEmptyList.get(i);
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.component1();
            MovableContentState movableContentState = (MovableContentState) pair.component2();
            if (movableContentState != null) {
                movableContentStateReference2.getComposition().disposeUnusedMovableContent(movableContentState);
            }
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "value", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.runtime.Recomposer$readObserverOf$1 */
    public static final class C17621 extends Lambda implements Function1<Object, Unit> {
        public C17621() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull Object obj) {
            controlledComposition.recordReadOf(obj);
        }
    }

    private final Function1<Object, Unit> readObserverOf(ControlledComposition composition) {
        return new Function1<Object, Unit>() { // from class: androidx.compose.runtime.Recomposer.readObserverOf.1
            public C17621() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull Object obj) {
                controlledComposition.recordReadOf(obj);
            }
        };
    }

    /* compiled from: Recomposer.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "value", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.runtime.Recomposer$writeObserverOf$1 */
    public static final class C17681 extends Lambda implements Function1<Object, Unit> {
        public final /* synthetic */ IdentityArraySet<Object> $modifiedValues;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17681(IdentityArraySet<Object> identityArraySet) {
            super(1);
            identityArraySet = identityArraySet;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull Object obj) {
            controlledComposition.recordWriteOf(obj);
            IdentityArraySet<Object> identityArraySet = identityArraySet;
            if (identityArraySet != null) {
                identityArraySet.add(obj);
            }
        }
    }

    private final Function1<Object, Unit> writeObserverOf(ControlledComposition composition, IdentityArraySet<Object> modifiedValues) {
        return new Function1<Object, Unit>() { // from class: androidx.compose.runtime.Recomposer.writeObserverOf.1
            public final /* synthetic */ IdentityArraySet<Object> $modifiedValues;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17681(IdentityArraySet<Object> modifiedValues2) {
                super(1);
                identityArraySet = modifiedValues2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull Object obj) {
                controlledComposition.recordWriteOf(obj);
                IdentityArraySet<Object> identityArraySet = identityArraySet;
                if (identityArraySet != null) {
                    identityArraySet.add(obj);
                }
            }
        };
    }

    private final <T> T composing(ControlledComposition composition, IdentityArraySet<Object> modifiedValues, Function0<? extends T> block) {
        MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, modifiedValues));
        try {
            Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
            try {
                return block.invoke();
            } finally {
                InlineMarker.finallyStart(1);
                mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                InlineMarker.finallyEnd(1);
            }
        } finally {
            InlineMarker.finallyStart(1);
            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
            InlineMarker.finallyEnd(1);
        }
    }

    private final void applyAndCheck(MutableSnapshot snapshot) {
        try {
            if (snapshot.apply() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            snapshot.dispose();
        }
    }

    public final boolean getHasPendingWork() {
        boolean z;
        synchronized (this.stateLock) {
            z = true;
            if (!this.snapshotInvalidations.isNotEmpty() && !(!this.compositionInvalidations.isEmpty()) && this.concurrentCompositionsOutstanding <= 0 && !(!this.compositionsAwaitingApply.isEmpty())) {
                if (!getHasBroadcastFrameClockAwaitersLocked()) {
                    z = false;
                }
            }
        }
        return z;
    }

    private final boolean getHasFrameWorkLocked() {
        return (this.compositionInvalidations.isEmpty() ^ true) || getHasBroadcastFrameClockAwaitersLocked();
    }

    public final boolean getHasConcurrentFrameWorkLocked() {
        return (this.compositionsAwaitingApply.isEmpty() ^ true) || getHasBroadcastFrameClockAwaitersLocked();
    }

    /* compiled from: Recomposer.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.runtime.Recomposer$awaitIdle$2", m7120f = "Recomposer.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.runtime.Recomposer$awaitIdle$2 */
    public static final class C17602 extends SuspendLambda implements Function2<State, Continuation<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public C17602(Continuation<? super C17602> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C17602 c17602 = new C17602(continuation);
            c17602.L$0 = obj;
            return c17602;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull State state, @Nullable Continuation<? super Boolean> continuation) {
            return ((C17602) create(state, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((State) this.L$0).compareTo(State.Idle) > 0);
        }
    }

    @Nullable
    public final Object awaitIdle(@NotNull Continuation<? super Unit> continuation) {
        Object objCollect = FlowKt.collect(FlowKt.takeWhile(getCurrentState(), new C17602(null)), continuation);
        return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public final void pauseCompositionFrameClock() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void resumeCompositionFrameClock() {
        CancellableContinuation<Unit> cancellableContinuationDeriveStateLocked;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                cancellableContinuationDeriveStateLocked = deriveStateLocked();
            } else {
                cancellableContinuationDeriveStateLocked = null;
            }
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationDeriveStateLocked.resumeWith(Result.m15699constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime_release(@NotNull ControlledComposition composition) {
        synchronized (this.stateLock) {
            removeKnownCompositionLocked(composition);
            this.compositionInvalidations.remove(composition);
            this.compositionsAwaitingApply.remove(composition);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime_release(@NotNull ControlledComposition composition) {
        CancellableContinuation<Unit> cancellableContinuationDeriveStateLocked;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.contains(composition)) {
                cancellableContinuationDeriveStateLocked = null;
            } else {
                this.compositionInvalidations.add(composition);
                cancellableContinuationDeriveStateLocked = deriveStateLocked();
            }
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationDeriveStateLocked.resumeWith(Result.m15699constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidateScope$runtime_release(@NotNull RecomposeScopeImpl recomposeScopeImpl) {
        CancellableContinuation<Unit> cancellableContinuationDeriveStateLocked;
        synchronized (this.stateLock) {
            this.snapshotInvalidations.add(recomposeScopeImpl);
            cancellableContinuationDeriveStateLocked = deriveStateLocked();
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationDeriveStateLocked.resumeWith(Result.m15699constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime_release(@NotNull MovableContentStateReference reference) {
        CancellableContinuation<Unit> cancellableContinuationDeriveStateLocked;
        synchronized (this.stateLock) {
            this.compositionValuesAwaitingInsert.add(reference);
            cancellableContinuationDeriveStateLocked = deriveStateLocked();
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationDeriveStateLocked.resumeWith(Result.m15699constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void deletedMovableContent$runtime_release(@NotNull MovableContentStateReference reference) {
        synchronized (this.stateLock) {
            RecomposerKt.addMultiValue(this.compositionValuesRemoved, reference.getContent$runtime_release(), reference);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void movableContentStateReleased$runtime_release(@NotNull MovableContentStateReference reference, @NotNull MovableContentState data) {
        synchronized (this.stateLock) {
            this.compositionValueStatesAvailable.put(reference, data);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportRemovedComposition$runtime_release(@NotNull ControlledComposition composition) {
        synchronized (this.stateLock) {
            try {
                Set linkedHashSet = this.compositionsRemoved;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.compositionsRemoved = linkedHashSet;
                }
                linkedHashSet.add(composition);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @Nullable
    public MovableContentState movableContentStateResolve$runtime_release(@NotNull MovableContentStateReference reference) {
        MovableContentState movableContentStateRemove;
        synchronized (this.stateLock) {
            movableContentStateRemove = this.compositionValueStatesAvailable.remove(reference);
        }
        return movableContentStateRemove;
    }

    /* compiled from: Recomposer.kt */
    @Metadata(m7104d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u000bR\u00020\fH\u0002J\r\u0010\u0016\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0017J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0000¢\u0006\u0002\b\u001bJ\u0015\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJ\u0015\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0001H\u0000¢\u0006\u0002\b\"J\u0014\u0010#\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u000bR\u00020\fH\u0002J\r\u0010$\u001a\u00020\u0001H\u0000¢\u0006\u0002\b%J\u0015\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0005H\u0000¢\u0006\u0002\b(R.\u0010\u0003\u001a\"\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004j\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u000bR\u00020\f0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006)"}, m7105d2 = {"Landroidx/compose/runtime/Recomposer$Companion;", "", "()V", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "_runningRecomposers", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/Recomposer;", "runningRecomposers", "Lkotlinx/coroutines/flow/StateFlow;", "", "Landroidx/compose/runtime/RecomposerInfo;", "getRunningRecomposers", "()Lkotlinx/coroutines/flow/StateFlow;", "addRunning", "", "info", "clearErrors", "clearErrors$runtime_release", "getCurrentErrors", "", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentErrors$runtime_release", "invalidateGroupsWithKey", "key", "", "invalidateGroupsWithKey$runtime_release", "loadStateAndComposeForHotReload", "token", "loadStateAndComposeForHotReload$runtime_release", "removeRunning", "saveStateAndDisposeForHotReload", "saveStateAndDisposeForHotReload$runtime_release", "setHotReloadEnabled", "value", "setHotReloadEnabled$runtime_release", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1564:1\n1360#2:1565\n1446#2,5:1566\n1855#2,2:1571\n1855#2,2:1585\n1855#2,2:1587\n1603#2,9:1589\n1855#2:1598\n1856#2:1600\n1612#2:1601\n1603#2,9:1602\n1855#2:1611\n1856#2:1613\n1612#2:1614\n33#3,6:1573\n33#3,6:1579\n1#4:1599\n1#4:1612\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n*L\n1440#1:1565\n1440#1:1566,5\n1448#1:1571,2\n1457#1:1585,2\n1464#1:1587,2\n1478#1:1589,9\n1478#1:1598\n1478#1:1600\n1478#1:1601\n1483#1:1602,9\n1483#1:1611\n1483#1:1613\n1483#1:1614\n1454#1:1573,6\n1455#1:1579,6\n1478#1:1599\n1483#1:1612\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final StateFlow<Set<RecomposerInfo>> getRunningRecomposers() {
            return Recomposer._runningRecomposers;
        }

        public final void setHotReloadEnabled$runtime_release(boolean value) {
            Recomposer._hotReloadEnabled.set(Boolean.valueOf(value));
        }

        public final void addRunning(RecomposerInfoImpl info) {
            PersistentSet persistentSet;
            PersistentSet persistentSetAdd;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                persistentSetAdd = persistentSet.add((PersistentSet) info);
                if (persistentSet == persistentSetAdd) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.compareAndSet(persistentSet, persistentSetAdd));
        }

        public final void removeRunning(RecomposerInfoImpl info) {
            PersistentSet persistentSet;
            PersistentSet persistentSetRemove;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                persistentSetRemove = persistentSet.remove((PersistentSet) info);
                if (persistentSet == persistentSetRemove) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.compareAndSet(persistentSet, persistentSetRemove));
        }

        @NotNull
        public final Object saveStateAndDisposeForHotReload$runtime_release() {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((RecomposerInfoImpl) it.next()).saveStateAndDisposeForHotReload());
            }
            return arrayList;
        }

        public final void loadStateAndComposeForHotReload$runtime_release(@NotNull Object token) {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            Iterator it = ((Iterable) Recomposer._runningRecomposers.getValue()).iterator();
            while (it.hasNext()) {
                ((RecomposerInfoImpl) it.next()).resetErrorState();
            }
            Intrinsics.checkNotNull(token, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.runtime.Recomposer.HotReloadable>");
            List list = (List) token;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((HotReloadable) list.get(i)).resetContent();
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((HotReloadable) list.get(i2)).recompose();
            }
            Iterator it2 = ((Iterable) Recomposer._runningRecomposers.getValue()).iterator();
            while (it2.hasNext()) {
                ((RecomposerInfoImpl) it2.next()).retryFailedCompositions();
            }
        }

        public final void invalidateGroupsWithKey$runtime_release(int key) {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            for (RecomposerInfoImpl recomposerInfoImpl : (Iterable) Recomposer._runningRecomposers.getValue()) {
                RecomposerErrorInfo currentError = recomposerInfoImpl.getCurrentError();
                if (currentError == null || currentError.getRecoverable()) {
                    recomposerInfoImpl.resetErrorState();
                    recomposerInfoImpl.invalidateGroupsWithKey(key);
                    recomposerInfoImpl.retryFailedCompositions();
                }
            }
        }

        @NotNull
        public final List<RecomposerErrorInfo> getCurrentErrors$runtime_release() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorInfo currentError = ((RecomposerInfoImpl) it.next()).getCurrentError();
                if (currentError != null) {
                    arrayList.add(currentError);
                }
            }
            return arrayList;
        }

        public final void clearErrors$runtime_release() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorState recomposerErrorStateResetErrorState = ((RecomposerInfoImpl) it.next()).resetErrorState();
                if (recomposerErrorStateResetErrorState != null) {
                    arrayList.add(recomposerErrorStateResetErrorState);
                }
            }
        }
    }

    public final List<ControlledComposition> performInsertValues(List<MovableContentStateReference> list, IdentityArraySet<Object> modifiedValues) {
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            MovableContentStateReference movableContentStateReference = list.get(i);
            ControlledComposition composition = movableContentStateReference.getComposition();
            Object arrayList2 = map.get(composition);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(composition, arrayList2);
            }
            ((ArrayList) arrayList2).add(movableContentStateReference);
        }
        for (Map.Entry entry : map.entrySet()) {
            ControlledComposition controlledComposition = (ControlledComposition) entry.getKey();
            List list2 = (List) entry.getValue();
            ComposerKt.runtimeCheck(!controlledComposition.isComposing());
            MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, modifiedValues));
            try {
                Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
                try {
                    synchronized (this.stateLock) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) list2.get(i2);
                            arrayList.add(TuplesKt.m7112to(movableContentStateReference2, RecomposerKt.removeLastMultiValue(this.compositionValuesRemoved, movableContentStateReference2.getContent$runtime_release())));
                        }
                    }
                    controlledComposition.insertMovableContent(arrayList);
                    Unit unit = Unit.INSTANCE;
                } finally {
                    mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                }
            } finally {
                applyAndCheck(mutableSnapshotTakeMutableSnapshot);
            }
        }
        return CollectionsKt___CollectionsKt.toList(map.keySet());
    }
}
