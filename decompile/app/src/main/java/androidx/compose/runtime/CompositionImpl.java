package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NativeKeys;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.apache.ivy.osgi.p063p2.P2MetadataParser;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* compiled from: Composition.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002£\u0001B%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010X\u001a\u00020\u0019H\u0002J\u001e\u0010Y\u001a\u00020\u00192\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010[\u001a\u00020\u0012H\u0002J\b\u0010\\\u001a\u00020\u0019H\u0016J\u0010\u0010]\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010^\u001a\u00020\u0019H\u0016J\b\u0010_\u001a\u00020\u0019H\u0016J\b\u0010`\u001a\u00020\u0019H\u0002J \u0010a\u001a\u00020\u00192\u0011\u0010b\u001a\r\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001aH\u0016¢\u0006\u0002\u0010\u001eJ \u0010c\u001a\u00020\u00192\u0011\u0010b\u001a\r\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001aH\u0002¢\u0006\u0002\u0010\u001eJ\b\u0010d\u001a\u00020\u0019H\u0016J3\u0010e\u001a\u0002Hf\"\u0004\b\u0000\u0010f2\b\u0010g\u001a\u0004\u0018\u00010\u00012\u0006\u0010h\u001a\u0002072\f\u0010i\u001a\b\u0012\u0004\u0012\u0002Hf0\u0018H\u0016¢\u0006\u0002\u0010jJ\b\u0010k\u001a\u00020\u0019H\u0016J\u0010\u0010l\u001a\u00020\u00192\u0006\u0010m\u001a\u00020nH\u0016J\b\u0010o\u001a\u00020\u0019H\u0002J\b\u0010p\u001a\u00020\u0019H\u0002J#\u0010q\u001a\u0004\u0018\u0001Hr\"\u0004\b\u0000\u0010r2\f\u0010s\u001a\b\u0012\u0004\u0012\u0002Hr0tH\u0016¢\u0006\u0002\u0010uJ\"\u0010v\u001a\u0002Hr\"\u0004\b\u0000\u0010r2\f\u0010i\u001a\b\u0012\u0004\u0012\u0002Hr0\u0018H\u0082\b¢\u0006\u0002\u0010wJK\u0010x\u001a\u0002Hr\"\u0004\b\u0000\u0010r25\u0010i\u001a1\u0012'\u0012%\u0012\u0004\u0012\u00020$\u0012\f\u0012\n\u0012\u0004\u0012\u00020*\u0018\u00010:09¢\u0006\f\bz\u0012\b\b{\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u0002Hr0yH\u0082\b¢\u0006\u0002\u0010|J&\u0010}\u001a\u00020\u00192\u001c\u0010~\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0080\u00010\u007f0#H\u0016J\u001e\u0010\u0081\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0083\u0001\u001a\u00020$2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010*H\u0016J\t\u0010\u0085\u0001\u001a\u00020\u0019H\u0016J(\u0010\u0086\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0083\u0001\u001a\u00020$2\b\u0010\u0087\u0001\u001a\u00030\u0088\u00012\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010*H\u0002J\u000f\u0010\u0089\u0001\u001a\u00020\u00192\u0006\u0010s\u001a\u000207J\u0012\u0010\u008a\u0001\u001a\u00020\u00192\u0007\u0010\u008b\u0001\u001a\u00020*H\u0002J\u001a\u0010\u008c\u0001\u001a\u00030\u008d\u00012\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0000¢\u0006\u0003\b\u0090\u0001J\f\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u0001H\u0002J\u0017\u0010\u0091\u0001\u001a\u00020\u00122\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020*0)H\u0016J\u0017\u0010\u0092\u0001\u001a\u00020\u00192\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\t\u0010\u0093\u0001\u001a\u00020\u0012H\u0016J\u0012\u0010\u0094\u0001\u001a\u00020\u00192\u0007\u0010\u0083\u0001\u001a\u00020$H\u0016J\u0017\u0010\u0095\u0001\u001a\u00020\u00192\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020*0)H\u0016J\u0012\u0010\u0096\u0001\u001a\u00020\u00192\u0007\u0010\u008b\u0001\u001a\u00020*H\u0016J\u0012\u0010\u0097\u0001\u001a\u00020\u00192\u0007\u0010\u008b\u0001\u001a\u00020*H\u0016J\u001b\u0010\u0098\u0001\u001a\u00020\u00192\n\u0010m\u001a\u0006\u0012\u0002\b\u00030/H\u0000¢\u0006\u0003\b\u0099\u0001J!\u0010\u009a\u0001\u001a\u00020\u00192\u0007\u0010\u0084\u0001\u001a\u00020*2\u0007\u0010\u0083\u0001\u001a\u00020$H\u0000¢\u0006\u0003\b\u009b\u0001J!\u0010\u009c\u0001\u001a\u00020\u00192\u0011\u0010b\u001a\r\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001aH\u0016¢\u0006\u0002\u0010\u001eJ!\u0010\u009d\u0001\u001a\u00020\u00192\u0011\u0010b\u001a\r\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001aH\u0016¢\u0006\u0002\u0010\u001eJ\u001d\u0010\u009e\u0001\u001a\u0016\u0012\u0004\u0012\u00020$\u0012\f\u0012\n\u0012\u0004\u0012\u00020*\u0018\u00010:09H\u0002J#\u0010\u009f\u0001\u001a\u0002Hr\"\u0004\b\u0000\u0010r2\f\u0010i\u001a\b\u0012\u0004\u0012\u0002Hr0\u0018H\u0082\b¢\u0006\u0002\u0010wJ\u001d\u0010 \u0001\u001a\u00020\u00122\u0007\u0010\u0083\u0001\u001a\u00020$2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010*H\u0002J\u0011\u0010¡\u0001\u001a\u00020\u00192\u0006\u0010S\u001a\u00020TH\u0002J\t\u0010¢\u0001\u001a\u00020\u0019H\u0016JE\u0010Y\u001a\u0016\u0012\u0004\u0012\u00020$\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020$\u0018\u0001`\u0010*\u0016\u0012\u0004\u0012\u00020$\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020$\u0018\u0001`\u00102\u0007\u0010\u008b\u0001\u001a\u00020*2\u0006\u0010[\u001a\u00020\u0012H\u0002R\u0010\u0010\f\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001e\u0010'\u001a\u0012\u0012\u0004\u0012\u00020$0\u000ej\b\u0012\u0004\u0012\u00020$`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0018\u0010-\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030/0.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0014R\u0014\u00103\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0014R\u0010\u00105\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u00108\u001a\u0016\u0012\u0004\u0012\u00020$\u0012\f\u0012\n\u0012\u0004\u0012\u00020*\u0018\u00010:09X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0014R\u0014\u0010<\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0014R\u0011\u0010=\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0014R\u000e\u0010>\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020$0.X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020$0.X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020*0)8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bC\u0010,R\u0014\u0010D\u001a\u00020EX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010H\u001a\u00020\u0012X\u0080\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bI\u0010J\u001a\u0004\bK\u0010\u0014\"\u0004\bL\u0010MR\"\u0010N\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010*0Oj\n\u0012\u0006\u0012\u0004\u0018\u00010*`PX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u001a\u0010S\u001a\u00020TX\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bU\u0010J\u001a\u0004\bV\u0010W¨\u0006¤\u0001"}, m7105d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "Landroidx/compose/runtime/CompositionServices;", "parent", "Landroidx/compose/runtime/CompositionContext;", "applier", "Landroidx/compose/runtime/Applier;", "recomposeContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "_recomposeContext", "abandonSet", "Ljava/util/HashSet;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/collections/HashSet;", "areChildrenComposing", "", "getAreChildrenComposing", "()Z", "changes", "Landroidx/compose/runtime/changelist/ChangeList;", "composable", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "conditionalScopes", "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "getConditionalScopes$runtime_release", "()Ljava/util/List;", "conditionallyInvalidatedScopes", "derivedStateDependencies", "", "", "getDerivedStateDependencies$runtime_release", "()Ljava/util/Set;", "derivedStates", "Landroidx/compose/runtime/collection/ScopeMap;", "Landroidx/compose/runtime/DerivedState;", "disposed", "hasInvalidations", "getHasInvalidations", "hasPendingChanges", "getHasPendingChanges", "invalidationDelegate", "invalidationDelegateGroup", "", "invalidations", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "isComposing", "isDisposed", "isRoot", "lateChanges", "lock", "observations", "observationsProcessed", "observedObjects", "getObservedObjects$runtime_release", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime_release", "()Landroidx/compose/runtime/CompositionObserverHolder;", "pendingInvalidScopes", "getPendingInvalidScopes$runtime_release$annotations", "()V", "getPendingInvalidScopes$runtime_release", "setPendingInvalidScopes$runtime_release", "(Z)V", "pendingModifications", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "getRecomposeContext", "()Lkotlin/coroutines/CoroutineContext;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release$annotations", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "abandonChanges", "addPendingInvalidationsLocked", SavedStateHandle.VALUES, "forgetConditionalScopes", "applyChanges", "applyChangesInLocked", "applyLateChanges", "changesApplied", "cleanUpDerivedStateObservations", "composeContent", "content", "composeInitial", "deactivate", "delegateInvalidations", "R", "to", "groupIndex", "block", "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "dispose", "disposeUnusedMovableContent", "state", "Landroidx/compose/runtime/MovableContentState;", "drainPendingModificationsForCompositionLocked", "drainPendingModificationsLocked", "getCompositionService", ExifInterface.GPS_DIRECTION_TRUE, "key", "Landroidx/compose/runtime/CompositionServiceKey;", "(Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", "guardChanges", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "guardInvalidationsLocked", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "insertMovableContent", P2MetadataParser.ReferencesHandler.REFERENCES, "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "invalidate", "Landroidx/compose/runtime/InvalidationResult;", PomReader.SCOPE, "instance", "invalidateAll", "invalidateChecked", LinkHeader.Parameters.Anchor, "Landroidx/compose/runtime/Anchor;", "invalidateGroupsWithKey", "invalidateScopeOfLocked", "value", "observe", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observer", "Landroidx/compose/runtime/tooling/CompositionObserver;", "observe$runtime_release", "observesAnyOf", "prepareCompose", "recompose", "recomposeScopeReleased", "recordModificationsOf", "recordReadOf", "recordWriteOf", "removeDerivedStateObservation", "removeDerivedStateObservation$runtime_release", "removeObservation", "removeObservation$runtime_release", "setContent", "setContentWithReuse", "takeInvalidations", "trackAbandonedValues", "tryImminentInvalidation", "validateRecomposeScopeAnchors", "verifyConsistent", "RememberEventDispatcher", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 7 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 8 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 9 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 10 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySetKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 13 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 14 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 15 Composition.kt\nandroidx/compose/runtime/CompositionKt\n+ 16 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 17 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 18 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 19 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1381:1\n1047#1,2:1396\n1205#1,3:1398\n1037#1,6:1402\n1208#1,7:1408\n1049#1,4:1415\n1047#1,2:1850\n1205#1,3:1852\n1037#1,6:1855\n1208#1,7:1861\n1049#1,4:1868\n1047#1,2:1881\n1205#1,10:1883\n1049#1,4:1893\n1047#1,2:1988\n1205#1,10:1990\n1049#1,4:2000\n1047#1,2:2005\n1205#1,10:2007\n1049#1,4:2017\n1047#1,2:2022\n1205#1,10:2024\n1049#1,4:2034\n1205#1,10:2038\n82#2:1382\n82#2:1384\n82#2:1385\n82#2:1401\n82#2:1419\n82#2:1428\n82#2:1429\n82#2:1812\n82#2:1849\n82#2:1987\n82#2:2004\n82#2:2021\n82#2:2048\n82#2:2051\n82#2:2052\n82#2:2053\n1#3:1383\n1#3:2064\n93#4,2:1386\n33#4,4:1388\n95#4,2:1392\n38#4:1394\n97#4:1395\n110#4,2:1872\n33#4,6:1874\n112#4:1880\n33#4,6:2067\n166#5,8:1420\n166#5,8:1897\n166#5,8:1908\n166#5,8:2076\n108#6,7:1430\n108#6,5:1475\n114#6:1516\n70#7,5:1437\n78#7,4:1469\n70#7,5:1480\n78#7,4:1512\n124#7:1546\n125#7,5:1562\n130#7,5:1594\n138#7:1609\n124#7:1610\n125#7,5:1626\n130#7,5:1660\n138#7:1675\n124#7:1676\n125#7,5:1692\n130#7,5:1726\n138#7:1741\n70#7,5:1776\n78#7,4:1808\n70#7,5:1813\n78#7,4:1845\n124#7:1920\n125#7,5:1936\n130#7,5:1970\n138#7:1985\n267#8,4:1442\n237#8,7:1446\n248#8,3:1454\n251#8,2:1458\n272#8,2:1460\n254#8,6:1462\n274#8:1468\n267#8,4:1485\n237#8,7:1489\n248#8,3:1497\n251#8,2:1501\n272#8,2:1503\n254#8,6:1505\n274#8:1511\n237#8,16:1519\n272#8,2:1535\n254#8,6:1537\n274#8:1543\n237#8,7:1569\n248#8,3:1577\n251#8,2:1581\n254#8,6:1587\n237#8,16:1633\n254#8,6:1653\n237#8,16:1699\n254#8,6:1719\n267#8,4:1781\n237#8,7:1785\n248#8,3:1793\n251#8,2:1797\n272#8,2:1799\n254#8,6:1801\n274#8:1807\n267#8,4:1818\n237#8,7:1822\n248#8,3:1830\n251#8,2:1834\n272#8,2:1836\n254#8,6:1838\n274#8:1844\n237#8,16:1943\n254#8,6:1963\n1810#9:1453\n1672#9:1457\n1810#9:1496\n1672#9:1500\n1810#9:1554\n1672#9:1558\n1810#9:1576\n1672#9:1580\n1810#9:1618\n1672#9:1622\n1810#9:1684\n1672#9:1688\n1810#9:1759\n1672#9:1763\n1810#9:1792\n1672#9:1796\n1810#9:1829\n1672#9:1833\n1810#9:1928\n1672#9:1932\n396#10,2:1473\n399#10:1517\n401#10:1545\n1855#11:1518\n1856#11:1544\n1047#12:1547\n1049#12:1561\n1050#12,3:1599\n1053#12:1608\n1047#12:1611\n1049#12:1625\n1050#12,3:1665\n1053#12:1674\n1047#12:1677\n1049#12:1691\n1050#12,3:1731\n1053#12:1740\n1047#12:1921\n1049#12:1935\n1050#12,3:1975\n1053#12:1984\n363#13,6:1548\n373#13,3:1555\n376#13,2:1559\n379#13,6:1602\n363#13,6:1612\n373#13,3:1619\n376#13,2:1623\n379#13,6:1668\n363#13,6:1678\n373#13,3:1685\n376#13,2:1689\n379#13,6:1734\n363#13,6:1922\n373#13,3:1929\n376#13,2:1933\n379#13,6:1978\n842#14,2:1567\n845#14,4:1583\n849#14:1593\n842#14,2:1631\n845#14,4:1649\n849#14:1659\n842#14,2:1697\n845#14,4:1715\n849#14:1725\n842#14,2:1941\n845#14,4:1959\n849#14:1969\n1368#15,7:1742\n50#16:1749\n50#16:1767\n415#17,3:1750\n373#17,6:1753\n383#17,3:1760\n386#17,2:1764\n419#17:1766\n420#17:1768\n389#17,6:1769\n421#17:1775\n46#18,3:1905\n50#18:1916\n46#18,3:1917\n50#18:1986\n46#18,3:2073\n50#18:2084\n13579#19,2:2049\n11653#19,9:2054\n13579#19:2063\n13580#19:2065\n11662#19:2066\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n*L\n715#1:1396,2\n715#1:1398,3\n718#1:1402,6\n715#1:1408,7\n715#1:1415,4\n932#1:1850,2\n932#1:1852,3\n933#1:1855,6\n932#1:1861,7\n932#1:1868,4\n953#1:1881,2\n953#1:1883,10\n953#1:1893,4\n1004#1:1988,2\n1004#1:1990,10\n1004#1:2000,4\n1013#1:2005,2\n1013#1:2007,10\n1013#1:2017,4\n1023#1:2022,2\n1023#1:2024,10\n1023#1:2034,4\n1048#1:2038,10\n616#1:1382\n638#1:1384\n655#1:1385\n716#1:1401\n733#1:1419\n779#1:1428\n800#1:1429\n920#1:1812\n930#1:1849\n1003#1:1987\n1012#1:2004\n1022#1:2021\n1062#1:2048\n1068#1:2051\n1103#1:2052\n1130#1:2053\n1192#1:2064\n662#1:1386,2\n662#1:1388,4\n662#1:1392,2\n662#1:1394\n662#1:1395\n952#1:1872,2\n952#1:1874,6\n952#1:1880\n1193#1:2067,6\n764#1:1420,8\n961#1:1897,8\n975#1:1908,8\n1335#1:2076,8\n811#1:1430,7\n848#1:1475,5\n848#1:1516\n829#1:1437,5\n829#1:1469,4\n854#1:1480,5\n854#1:1512,4\n862#1:1546\n862#1:1562,5\n862#1:1594,5\n862#1:1609\n869#1:1610\n869#1:1626,5\n869#1:1660,5\n869#1:1675\n876#1:1676\n876#1:1692,5\n876#1:1726,5\n876#1:1741\n912#1:1776,5\n912#1:1808,4\n925#1:1813,5\n925#1:1845,4\n990#1:1920\n990#1:1936,5\n990#1:1970,5\n990#1:1985\n829#1:1442,4\n829#1:1446,7\n829#1:1454,3\n829#1:1458,2\n829#1:1460,2\n829#1:1462,6\n829#1:1468\n854#1:1485,4\n854#1:1489,7\n854#1:1497,3\n854#1:1501,2\n854#1:1503,2\n854#1:1505,6\n854#1:1511\n854#1:1519,16\n854#1:1535,2\n854#1:1537,6\n854#1:1543\n862#1:1569,7\n862#1:1577,3\n862#1:1581,2\n862#1:1587,6\n869#1:1633,16\n869#1:1653,6\n876#1:1699,16\n876#1:1719,6\n912#1:1781,4\n912#1:1785,7\n912#1:1793,3\n912#1:1797,2\n912#1:1799,2\n912#1:1801,6\n912#1:1807\n925#1:1818,4\n925#1:1822,7\n925#1:1830,3\n925#1:1834,2\n925#1:1836,2\n925#1:1838,6\n925#1:1844\n990#1:1943,16\n990#1:1963,6\n829#1:1453\n829#1:1457\n854#1:1496\n854#1:1500\n862#1:1554\n862#1:1558\n862#1:1576\n862#1:1580\n869#1:1618\n869#1:1622\n876#1:1684\n876#1:1688\n898#1:1759\n898#1:1763\n912#1:1792\n912#1:1796\n925#1:1829\n925#1:1833\n990#1:1928\n990#1:1932\n848#1:1473,2\n848#1:1517\n848#1:1545\n848#1:1518\n848#1:1544\n862#1:1547\n862#1:1561\n862#1:1599,3\n862#1:1608\n869#1:1611\n869#1:1625\n869#1:1665,3\n869#1:1674\n876#1:1677\n876#1:1691\n876#1:1731,3\n876#1:1740\n990#1:1921\n990#1:1935\n990#1:1975,3\n990#1:1984\n862#1:1548,6\n862#1:1555,3\n862#1:1559,2\n862#1:1602,6\n869#1:1612,6\n869#1:1619,3\n869#1:1623,2\n869#1:1668,6\n876#1:1678,6\n876#1:1685,3\n876#1:1689,2\n876#1:1734,6\n990#1:1922,6\n990#1:1929,3\n990#1:1933,2\n990#1:1978,6\n862#1:1567,2\n862#1:1583,4\n862#1:1593\n869#1:1631,2\n869#1:1649,4\n869#1:1659\n876#1:1697,2\n876#1:1715,4\n876#1:1725\n990#1:1941,2\n990#1:1959,4\n990#1:1969\n878#1:1742,7\n890#1:1749\n900#1:1767\n898#1:1750,3\n898#1:1753,6\n898#1:1760,3\n898#1:1764,2\n898#1:1766\n898#1:1768\n898#1:1769,6\n898#1:1775\n971#1:1905,3\n971#1:1916\n988#1:1917,3\n988#1:1986\n1331#1:2073,3\n1331#1:2084\n1063#1:2049,2\n1192#1:2054,9\n1192#1:2063\n1192#1:2065\n1192#1:2066\n*E\n"})
/* loaded from: classes4.dex */
public final class CompositionImpl implements ControlledComposition, ReusableComposition, RecomposeScopeOwner, CompositionServices {
    public static final int $stable = 8;

    @Nullable
    private final CoroutineContext _recomposeContext;

    @NotNull
    private final HashSet<RememberObserver> abandonSet;

    @NotNull
    private final Applier<?> applier;

    @NotNull
    private final ChangeList changes;

    @NotNull
    private Function2<? super Composer, ? super Integer, Unit> composable;

    @NotNull
    private final ComposerImpl composer;

    @NotNull
    private final HashSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;

    @NotNull
    private final ScopeMap<DerivedState<?>> derivedStates;
    private boolean disposed;

    @Nullable
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;

    @NotNull
    private IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidations;
    private final boolean isRoot;

    @NotNull
    private final ChangeList lateChanges;

    @NotNull
    private final Object lock;

    @NotNull
    private final ScopeMap<RecomposeScopeImpl> observations;

    @NotNull
    private final ScopeMap<RecomposeScopeImpl> observationsProcessed;

    @NotNull
    private final CompositionObserverHolder observerHolder;

    @NotNull
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;

    @NotNull
    private final AtomicReference<Object> pendingModifications;

    @NotNull
    private final SlotTable slotTable;

    public static /* synthetic */ void getPendingInvalidScopes$runtime_release$annotations() {
    }

    public static /* synthetic */ void getSlotTable$runtime_release$annotations() {
    }

    public CompositionImpl(@NotNull CompositionContext compositionContext, @NotNull Applier<?> applier, @Nullable CoroutineContext coroutineContext) {
        this.parent = compositionContext;
        this.applier = applier;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        HashSet<RememberObserver> hashSet = new HashSet<>();
        this.abandonSet = hashSet;
        SlotTable slotTable = new SlotTable();
        this.slotTable = slotTable;
        this.observations = new ScopeMap<>();
        this.conditionallyInvalidatedScopes = new HashSet<>();
        this.derivedStates = new ScopeMap<>();
        ChangeList changeList = new ChangeList();
        this.changes = changeList;
        ChangeList changeList2 = new ChangeList();
        this.lateChanges = changeList2;
        this.observationsProcessed = new ScopeMap<>();
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        this.observerHolder = new CompositionObserverHolder(null, false, 3, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, compositionContext, slotTable, hashSet, changeList, changeList2, this);
        compositionContext.registerComposer$runtime_release(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = coroutineContext;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m10845getLambda1$runtime_release();
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier, (i & 4) != 0 ? null : coroutineContext);
    }

    @NotNull
    /* renamed from: getSlotTable$runtime_release, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }

    @TestOnly
    @NotNull
    public final Set<Object> getObservedObjects$runtime_release() {
        return this.observations.getMap().asMap().keySet();
    }

    @TestOnly
    @NotNull
    public final Set<Object> getDerivedStateDependencies$runtime_release() {
        return this.derivedStates.getMap().asMap().keySet();
    }

    @TestOnly
    @NotNull
    public final List<RecomposeScopeImpl> getConditionalScopes$runtime_release() {
        return CollectionsKt___CollectionsKt.toList(this.conditionallyInvalidatedScopes);
    }

    /* renamed from: getPendingInvalidScopes$runtime_release, reason: from getter */
    public final boolean getPendingInvalidScopes() {
        return this.pendingInvalidScopes;
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z) {
        this.pendingInvalidScopes = z;
    }

    @NotNull
    /* renamed from: getObserverHolder$runtime_release, reason: from getter */
    public final CompositionObserverHolder getObserverHolder() {
        return this.observerHolder;
    }

    @NotNull
    public final CoroutineContext getRecomposeContext() {
        CoroutineContext coroutineContext = this._recomposeContext;
        return coroutineContext == null ? this.parent.getRecomposeCoroutineContext$runtime_release() : coroutineContext;
    }

    /* renamed from: isRoot, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getComposable() {
        return this.composable;
    }

    public final void setComposable(@NotNull Function2<? super Composer, ? super Integer, Unit> function2) {
        this.composable = function2;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.getIsComposing();
    }

    @Override // androidx.compose.runtime.Composition
    /* renamed from: isDisposed, reason: from getter */
    public boolean getDisposed() {
        return this.disposed;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime_release;
        synchronized (this.lock) {
            hasPendingChanges$runtime_release = this.composer.getHasPendingChanges$runtime_release();
        }
        return hasPendingChanges$runtime_release;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        composeInitial(content);
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void setContentWithReuse(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        this.composer.startReuseFromRoot();
        composeInitial(content);
        this.composer.endReuseFromRoot();
    }

    private final void composeInitial(Function2<? super Composer, ? super Integer, Unit> content) {
        if (!(!this.disposed)) {
            throw new IllegalStateException("The composition is disposed".toString());
        }
        this.composable = content;
        this.parent.composeInitial$runtime_release(this, content);
    }

    @NotNull
    public final CompositionObserverHandle observe$runtime_release(@NotNull final CompositionObserver observer) {
        synchronized (this.lock) {
            this.observerHolder.setObserver(observer);
            this.observerHolder.setRoot(true);
            Unit unit = Unit.INSTANCE;
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.CompositionImpl$observe$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                Object obj = this.this$0.lock;
                CompositionImpl compositionImpl = this.this$0;
                CompositionObserver compositionObserver = observer;
                synchronized (obj) {
                    try {
                        if (Intrinsics.areEqual(compositionImpl.getObserverHolder().getObserver(), compositionObserver)) {
                            compositionImpl.getObserverHolder().setObserver(null);
                            compositionImpl.getObserverHolder().setRoot(false);
                        }
                        Unit unit2 = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
    }

    public final void invalidateGroupsWithKey(int key) {
        List<RecomposeScopeImpl> listInvalidateGroupsWithKey$runtime_release;
        synchronized (this.lock) {
            listInvalidateGroupsWithKey$runtime_release = this.slotTable.invalidateGroupsWithKey$runtime_release(key);
        }
        if (listInvalidateGroupsWithKey$runtime_release != null) {
            int size = listInvalidateGroupsWithKey$runtime_release.size();
            for (int i = 0; i < size; i++) {
                if (listInvalidateGroupsWithKey$runtime_release.get(i).invalidateForResult(null) != InvalidationResult.IGNORED) {
                }
            }
            return;
        }
        if (this.composer.forceRecomposeScopes$runtime_release()) {
            this.parent.invalidate$runtime_release(this);
        }
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object andSet = this.pendingModifications.getAndSet(CompositionKt.PendingApplyNoModifications);
        if (andSet != null) {
            if (Intrinsics.areEqual(andSet, CompositionKt.PendingApplyNoModifications)) {
                ComposerKt.composeRuntimeError("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new KotlinNothingValueException();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, true);
            }
        }
    }

    private final void drainPendingModificationsLocked() {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (Intrinsics.areEqual(andSet, CompositionKt.PendingApplyNoModifications)) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, false);
            }
            return;
        }
        if (andSet == null) {
            ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMapTakeInvalidations;
        try {
            synchronized (this.lock) {
                try {
                    drainPendingModificationsForCompositionLocked();
                    identityArrayMapTakeInvalidations = takeInvalidations();
                    CompositionObserver compositionObserverObserver = observer();
                    if (compositionObserverObserver != null) {
                        Map<RecomposeScopeImpl, IdentityArraySet<Object>> mapAsMap = identityArrayMapTakeInvalidations.asMap();
                        Intrinsics.checkNotNull(mapAsMap, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>");
                        compositionObserverObserver.onBeginComposition(this, mapAsMap);
                    }
                    this.composer.composeContent$runtime_release(identityArrayMapTakeInvalidations, content);
                    if (compositionObserverObserver != null) {
                        compositionObserverObserver.onEndComposition(this);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception e) {
                    this.invalidations = identityArrayMapTakeInvalidations;
                    throw e;
                } finally {
                }
            }
        } finally {
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.lock) {
            try {
                if (!(!this.composer.getIsComposing())) {
                    throw new IllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.".toString());
                }
                if (!this.disposed) {
                    this.disposed = true;
                    this.composable = ComposableSingletons$CompositionKt.INSTANCE.m10846getLambda2$runtime_release();
                    ChangeList deferredChanges = this.composer.getDeferredChanges();
                    if (deferredChanges != null) {
                        applyChangesInLocked(deferredChanges);
                    }
                    boolean z = this.slotTable.getGroupsSize() > 0;
                    if (z || (true ^ this.abandonSet.isEmpty())) {
                        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                        if (z) {
                            this.applier.onBeginChanges();
                            SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                            try {
                                ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
                                Unit unit = Unit.INSTANCE;
                                slotWriterOpenWriter.close();
                                this.applier.clear();
                                this.applier.onEndChanges();
                                rememberEventDispatcher.dispatchRememberObservers();
                            } catch (Throwable th) {
                                slotWriterOpenWriter.close();
                                throw th;
                            }
                        }
                        rememberEventDispatcher.dispatchAbandons();
                    }
                    this.composer.dispose$runtime_release();
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.parent.unregisterComposition$runtime_release(this);
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z;
        synchronized (this.lock) {
            z = this.invalidations.getSize() > 0;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set[]] */
    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(@NotNull Set<? extends Object> set) {
        Object obj;
        Set<? extends Object> setPlus;
        do {
            obj = this.pendingModifications.get();
            if (obj == null ? true : Intrinsics.areEqual(obj, CompositionKt.PendingApplyNoModifications)) {
                setPlus = set;
            } else if (obj instanceof Set) {
                setPlus = new Set[]{obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                setPlus = ArraysKt___ArraysJvmKt.plus((Set<? extends Object>[]) obj, set);
            }
        } while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.pendingModifications, obj, setPlus));
        if (obj == null) {
            synchronized (this.lock) {
                drainPendingModificationsLocked();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean observesAnyOf(@NotNull Set<? extends Object> set) {
        if (set instanceof IdentityArraySet) {
            IdentityArraySet identityArraySet = (IdentityArraySet) set;
            Object[] values = identityArraySet.getValues();
            int size = identityArraySet.size();
            for (int i = 0; i < size; i++) {
                Object obj = values[i];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (this.observations.contains(obj) || this.derivedStates.contains(obj)) {
                    return true;
                }
            }
            return false;
        }
        for (Object obj2 : set) {
            if (this.observations.contains(obj2) || this.derivedStates.contains(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(@NotNull Function0<Unit> block) {
        this.composer.prepareCompose$runtime_release(block);
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x007d A[PHI: r6
  0x007d: PHI (r6v4 java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl>) = 
  (r6v3 java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl>)
  (r6v5 java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl>)
 binds: [B:66:0x0031, B:83:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final HashSet<RecomposeScopeImpl> addPendingInvalidationsLocked(HashSet<RecomposeScopeImpl> hashSet, Object obj, boolean z) {
        HashSet<RecomposeScopeImpl> hashSet2;
        Object obj2 = this.observations.getMap().get(obj);
        if (obj2 != null) {
            if (obj2 instanceof MutableScatterSet) {
                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    hashSet2 = hashSet;
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr[(i << 3) + i3];
                                    if (!this.observationsProcessed.remove(obj, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                                        if (recomposeScopeImpl.isConditional() && !z) {
                                            this.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                                        } else {
                                            if (hashSet2 == null) {
                                                hashSet2 = new HashSet<>();
                                            }
                                            hashSet2.add(recomposeScopeImpl);
                                        }
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                            if (i == length) {
                                break;
                            }
                            i++;
                        }
                    }
                } else {
                    hashSet2 = hashSet;
                }
                return hashSet2;
            }
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj2;
            if (!this.observationsProcessed.remove(obj, recomposeScopeImpl2) && recomposeScopeImpl2.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                if (recomposeScopeImpl2.isConditional() && !z) {
                    this.conditionallyInvalidatedScopes.add(recomposeScopeImpl2);
                } else {
                    HashSet<RecomposeScopeImpl> hashSet3 = hashSet == null ? new HashSet<>() : hashSet;
                    hashSet3.add(recomposeScopeImpl2);
                    return hashSet3;
                }
            }
        }
        return hashSet;
    }

    private final void cleanUpDerivedStateObservations() {
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j;
        int i3;
        boolean zIsEmpty;
        Object[] objArr;
        Object[] objArr2;
        MutableScatterMap<Object, Object> map = this.derivedStates.getMap();
        long[] jArr3 = map.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j2 = jArr3[i4];
                char c = 7;
                long j3 = -9187201950435737472L;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j2 & 255) < 128) {
                            int i8 = (i4 << 3) + i7;
                            Object obj = map.keys[i8];
                            Object obj2 = map.values[i8];
                            if (obj2 instanceof MutableScatterSet) {
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                Object[] objArr3 = mutableScatterSet.elements;
                                long[] jArr4 = mutableScatterSet.metadata;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                i = length;
                                if (length2 >= 0) {
                                    int i9 = 0;
                                    while (true) {
                                        long j4 = jArr4[i9];
                                        i2 = i6;
                                        long[] jArr5 = jArr4;
                                        j = -9187201950435737472L;
                                        if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                            int i11 = 0;
                                            while (i11 < i10) {
                                                if ((j4 & 255) < 128) {
                                                    int i12 = (i9 << 3) + i11;
                                                    objArr2 = objArr3;
                                                    if (!this.observations.contains((DerivedState) objArr3[i12])) {
                                                        mutableScatterSet.removeElementAt(i12);
                                                    }
                                                } else {
                                                    objArr2 = objArr3;
                                                }
                                                j4 >>= 8;
                                                i11++;
                                                objArr3 = objArr2;
                                            }
                                            objArr = objArr3;
                                            if (i10 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                        }
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        c = 7;
                                        i6 = i2;
                                        jArr4 = jArr5;
                                        objArr3 = objArr;
                                    }
                                } else {
                                    i2 = i6;
                                    j = -9187201950435737472L;
                                }
                                zIsEmpty = mutableScatterSet.isEmpty();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i6;
                                j = j3;
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                zIsEmpty = !this.observations.contains((DerivedState) obj2);
                            }
                            if (zIsEmpty) {
                                map.removeValueAt(i8);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i6;
                            j = j3;
                            i3 = i5;
                        }
                        j2 >>= i3;
                        i7++;
                        i5 = i3;
                        j3 = j;
                        jArr3 = jArr2;
                        length = i;
                        i6 = i2;
                        c = 7;
                    }
                    jArr = jArr3;
                    int i13 = length;
                    if (i6 != i5) {
                        break;
                    } else {
                        length = i13;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i4 == length) {
                    break;
                }
                i4++;
                jArr3 = jArr;
            }
        }
        if (!this.conditionallyInvalidatedScopes.isEmpty()) {
            Iterator<RecomposeScopeImpl> it = this.conditionallyInvalidatedScopes.iterator();
            while (it.hasNext()) {
                if (!it.next().isConditional()) {
                    it.remove();
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public void recordReadOf(@NotNull Object value) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        if (getAreChildrenComposing() || (currentRecomposeScope$runtime_release = this.composer.getCurrentRecomposeScope$runtime_release()) == null) {
            return;
        }
        currentRecomposeScope$runtime_release.setUsed(true);
        if (currentRecomposeScope$runtime_release.recordRead(value)) {
            return;
        }
        if (value instanceof StateObjectImpl) {
            ReaderKind.Companion companion = ReaderKind.INSTANCE;
            ((StateObjectImpl) value).m10975recordReadInh_f27i8$runtime_release(ReaderKind.m10962constructorimpl(1));
        }
        this.observations.add(value, currentRecomposeScope$runtime_release);
        if (!(value instanceof DerivedState)) {
            return;
        }
        this.derivedStates.removeScope(value);
        ObjectIntMap<StateObject> dependencies = ((DerivedState) value).getCurrentRecord().getDependencies();
        Object[] objArr = dependencies.keys;
        long[] jArr = dependencies.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        StateObject stateObject = (StateObject) objArr[(i << 3) + i3];
                        if (stateObject instanceof StateObjectImpl) {
                            ReaderKind.Companion companion2 = ReaderKind.INSTANCE;
                            ((StateObjectImpl) stateObject).m10975recordReadInh_f27i8$runtime_release(ReaderKind.m10962constructorimpl(1));
                        }
                        this.derivedStates.add(stateObject, value);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void invalidateScopeOfLocked(Object value) {
        Object obj = this.observations.getMap().get(value);
        if (obj == null) {
            return;
        }
        if (obj instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr[(i << 3) + i3];
                            if (recomposeScopeImpl.invalidateForResult(value) == InvalidationResult.IMMINENT) {
                                this.observationsProcessed.add(value, recomposeScopeImpl);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        } else {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj;
            if (recomposeScopeImpl2.invalidateForResult(value) == InvalidationResult.IMMINENT) {
                this.observationsProcessed.add(value, recomposeScopeImpl2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x005b  */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void recordWriteOf(@NotNull Object value) {
        synchronized (this.lock) {
            try {
                invalidateScopeOfLocked(value);
                Object obj = this.derivedStates.getMap().get(value);
                if (obj != null) {
                    if (!(obj instanceof MutableScatterSet)) {
                        invalidateScopeOfLocked((DerivedState) obj);
                    } else {
                        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
                        Object[] objArr = mutableScatterSet.elements;
                        long[] jArr = mutableScatterSet.metadata;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            invalidateScopeOfLocked((DerivedState) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i == length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean zRecompose$runtime_release;
        synchronized (this.lock) {
            try {
                drainPendingModificationsForCompositionLocked();
                try {
                    IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMapTakeInvalidations = takeInvalidations();
                    try {
                        CompositionObserver compositionObserverObserver = observer();
                        if (compositionObserverObserver != null) {
                            Map<RecomposeScopeImpl, IdentityArraySet<Object>> mapAsMap = identityArrayMapTakeInvalidations.asMap();
                            Intrinsics.checkNotNull(mapAsMap, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>");
                            compositionObserverObserver.onBeginComposition(this, mapAsMap);
                        }
                        zRecompose$runtime_release = this.composer.recompose$runtime_release(identityArrayMapTakeInvalidations);
                        if (!zRecompose$runtime_release) {
                            drainPendingModificationsLocked();
                        }
                        if (compositionObserverObserver != null) {
                            compositionObserverObserver.onEndComposition(this);
                        }
                    } catch (Exception e) {
                        this.invalidations = identityArrayMapTakeInvalidations;
                        throw e;
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zRecompose$runtime_release;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(@NotNull MovableContentState state) {
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        SlotWriter slotWriterOpenWriter = state.getSlotTable().openWriter();
        try {
            ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
            Unit unit = Unit.INSTANCE;
            slotWriterOpenWriter.close();
            rememberEventDispatcher.dispatchRememberObservers();
        } catch (Throwable th) {
            slotWriterOpenWriter.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void applyChangesInLocked(ChangeList changes) throws Throwable {
        RememberEventDispatcher rememberEventDispatcher;
        RememberEventDispatcher rememberEventDispatcher2;
        long[] jArr;
        int i;
        RememberEventDispatcher rememberEventDispatcher3;
        long[] jArr2;
        int i2;
        int i3;
        char c;
        long j;
        int i4;
        boolean zIsEmpty;
        long[] jArr3;
        long[] jArr4;
        CompositionImpl compositionImpl = this;
        RememberEventDispatcher rememberEventDispatcher4 = new RememberEventDispatcher(compositionImpl.abandonSet);
        try {
            if (changes.isEmpty()) {
                if (compositionImpl.lateChanges.isEmpty()) {
                    rememberEventDispatcher4.dispatchAbandons();
                    return;
                }
                return;
            }
            Trace trace = Trace.INSTANCE;
            Object objBeginSection = trace.beginSection("Compose:applyChanges");
            try {
                compositionImpl.applier.onBeginChanges();
                SlotWriter slotWriterOpenWriter = compositionImpl.slotTable.openWriter();
                try {
                    changes.executeAndFlushAllPendingChanges(compositionImpl.applier, slotWriterOpenWriter, rememberEventDispatcher4);
                    Unit unit = Unit.INSTANCE;
                    slotWriterOpenWriter.close();
                    compositionImpl.applier.onEndChanges();
                    trace.endSection(objBeginSection);
                    rememberEventDispatcher4.dispatchRememberObservers();
                    rememberEventDispatcher4.dispatchSideEffects();
                    if (compositionImpl.pendingInvalidScopes) {
                        try {
                            Object objBeginSection2 = trace.beginSection("Compose:unobserve");
                            int i5 = 0;
                            try {
                                try {
                                    compositionImpl.pendingInvalidScopes = false;
                                    MutableScatterMap<Object, Object> map = compositionImpl.observations.getMap();
                                    long[] jArr5 = map.metadata;
                                    int length = jArr5.length - 2;
                                    if (length >= 0) {
                                        int i6 = 0;
                                        while (true) {
                                            long j2 = jArr5[i6];
                                            char c2 = 7;
                                            long j3 = -9187201950435737472L;
                                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i7 = 8;
                                                int i8 = 8 - ((~(i6 - length)) >>> 31);
                                                int i9 = i5;
                                                while (i9 < i8) {
                                                    if ((j2 & 255) < 128) {
                                                        int i10 = (i6 << 3) + i9;
                                                        Object obj = map.keys[i10];
                                                        Object obj2 = map.values[i10];
                                                        if (obj2 instanceof MutableScatterSet) {
                                                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                                            Object[] objArr = mutableScatterSet.elements;
                                                            long[] jArr6 = mutableScatterSet.metadata;
                                                            int length2 = jArr6.length - 2;
                                                            rememberEventDispatcher3 = rememberEventDispatcher4;
                                                            jArr2 = jArr5;
                                                            if (length2 >= 0) {
                                                                int i11 = 0;
                                                                while (true) {
                                                                    try {
                                                                        long j4 = jArr6[i11];
                                                                        i2 = length;
                                                                        i3 = i6;
                                                                        c = 7;
                                                                        j = -9187201950435737472L;
                                                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                                                            int i13 = 0;
                                                                            while (i13 < i12) {
                                                                                if ((j4 & 255) < 128) {
                                                                                    jArr4 = jArr6;
                                                                                    int i14 = (i11 << 3) + i13;
                                                                                    if (!((RecomposeScopeImpl) objArr[i14]).getValid()) {
                                                                                        mutableScatterSet.removeElementAt(i14);
                                                                                    }
                                                                                } else {
                                                                                    jArr4 = jArr6;
                                                                                }
                                                                                j4 >>= 8;
                                                                                i13++;
                                                                                jArr6 = jArr4;
                                                                            }
                                                                            jArr3 = jArr6;
                                                                            if (i12 != 8) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            jArr3 = jArr6;
                                                                        }
                                                                        if (i11 == length2) {
                                                                            break;
                                                                        }
                                                                        i11++;
                                                                        length = i2;
                                                                        i6 = i3;
                                                                        jArr6 = jArr3;
                                                                    } catch (Throwable th) {
                                                                        th = th;
                                                                        Trace.INSTANCE.endSection(objBeginSection2);
                                                                        throw th;
                                                                    }
                                                                }
                                                            } else {
                                                                i2 = length;
                                                                i3 = i6;
                                                                j = -9187201950435737472L;
                                                                c = 7;
                                                            }
                                                            zIsEmpty = mutableScatterSet.isEmpty();
                                                        } else {
                                                            rememberEventDispatcher3 = rememberEventDispatcher4;
                                                            jArr2 = jArr5;
                                                            i2 = length;
                                                            i3 = i6;
                                                            c = c2;
                                                            j = -9187201950435737472L;
                                                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                                            zIsEmpty = !((RecomposeScopeImpl) obj2).getValid();
                                                        }
                                                        if (zIsEmpty) {
                                                            map.removeValueAt(i10);
                                                        }
                                                        i4 = 8;
                                                    } else {
                                                        rememberEventDispatcher3 = rememberEventDispatcher4;
                                                        jArr2 = jArr5;
                                                        i2 = length;
                                                        i3 = i6;
                                                        c = c2;
                                                        j = j3;
                                                        i4 = i7;
                                                    }
                                                    j2 >>= i4;
                                                    i9++;
                                                    i7 = i4;
                                                    j3 = j;
                                                    c2 = c;
                                                    jArr5 = jArr2;
                                                    rememberEventDispatcher4 = rememberEventDispatcher3;
                                                    length = i2;
                                                    i6 = i3;
                                                }
                                                rememberEventDispatcher2 = rememberEventDispatcher4;
                                                jArr = jArr5;
                                                int i15 = length;
                                                int i16 = i6;
                                                if (i8 != i7) {
                                                    break;
                                                }
                                                length = i15;
                                                i = i16;
                                            } else {
                                                rememberEventDispatcher2 = rememberEventDispatcher4;
                                                jArr = jArr5;
                                                i = i6;
                                            }
                                            if (i == length) {
                                                break;
                                            }
                                            i6 = i + 1;
                                            jArr5 = jArr;
                                            rememberEventDispatcher4 = rememberEventDispatcher2;
                                            i5 = 0;
                                        }
                                    } else {
                                        rememberEventDispatcher2 = rememberEventDispatcher4;
                                    }
                                    cleanUpDerivedStateObservations();
                                    Unit unit2 = Unit.INSTANCE;
                                    Trace.INSTANCE.endSection(objBeginSection2);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                compositionImpl = this;
                                if (compositionImpl.lateChanges.isEmpty()) {
                                    rememberEventDispatcher.dispatchAbandons();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            rememberEventDispatcher = rememberEventDispatcher4;
                        }
                    } else {
                        rememberEventDispatcher2 = rememberEventDispatcher4;
                    }
                    if (this.lateChanges.isEmpty()) {
                        rememberEventDispatcher2.dispatchAbandons();
                    }
                } catch (Throwable th5) {
                    rememberEventDispatcher = rememberEventDispatcher4;
                    try {
                        slotWriterOpenWriter.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th = th6;
                        try {
                            Trace.INSTANCE.endSection(objBeginSection);
                            throw th;
                        } catch (Throwable th7) {
                            th = th7;
                            if (compositionImpl.lateChanges.isEmpty()) {
                            }
                            throw th;
                        }
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                rememberEventDispatcher = rememberEventDispatcher4;
            }
        } catch (Throwable th9) {
            th = th9;
            rememberEventDispatcher = rememberEventDispatcher4;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                        }
                        throw th;
                    } catch (Exception e) {
                        abandonChanges();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.isNotEmpty()) {
                    applyChangesInLocked(this.lateChanges);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                        }
                        throw th;
                    } catch (Exception e) {
                        abandonChanges();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime_release();
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                        }
                        throw th;
                    } catch (Exception e) {
                        abandonChanges();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private final <T> T guardInvalidationsLocked(Function1<? super IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>>, ? extends T> block) throws Exception {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMapTakeInvalidations = takeInvalidations();
        try {
            return block.invoke(identityArrayMapTakeInvalidations);
        } catch (Exception e) {
            this.invalidations = identityArrayMapTakeInvalidations;
            throw e;
        }
    }

    private final void abandonChanges() {
        this.pendingModifications.set(null);
        this.changes.clear();
        this.lateChanges.clear();
        this.abandonSet.clear();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        synchronized (this.lock) {
            try {
                for (Object obj : this.slotTable.getSlots()) {
                    RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.invalidate();
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized (this.lock) {
            try {
                if (!isComposing()) {
                    this.composer.verifyConsistent$runtime_release();
                    this.slotTable.verifyWellFormed();
                    validateRecomposeScopeAnchors(this.slotTable);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(@Nullable ControlledComposition to, int groupIndex, @NotNull Function0<? extends R> block) {
        if (to != null && !Intrinsics.areEqual(to, this) && groupIndex >= 0) {
            this.invalidationDelegate = (CompositionImpl) to;
            this.invalidationDelegateGroup = groupIndex;
            try {
                return block.invoke();
            } finally {
                this.invalidationDelegate = null;
                this.invalidationDelegateGroup = 0;
            }
        }
        return block.invoke();
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    @NotNull
    public InvalidationResult invalidate(@NotNull RecomposeScopeImpl recomposeScopeImpl, @Nullable Object instance) {
        CompositionImpl compositionImpl;
        if (recomposeScopeImpl.getDefaultsInScope()) {
            recomposeScopeImpl.setDefaultsInvalid(true);
        }
        Anchor anchor = recomposeScopeImpl.getAnchor();
        if (anchor == null || !anchor.getValid()) {
            return InvalidationResult.IGNORED;
        }
        if (!this.slotTable.ownsAnchor(anchor)) {
            synchronized (this.lock) {
                compositionImpl = this.invalidationDelegate;
            }
            if (compositionImpl != null && compositionImpl.tryImminentInvalidation(recomposeScopeImpl, instance)) {
                return InvalidationResult.IMMINENT;
            }
            return InvalidationResult.IGNORED;
        }
        if (!recomposeScopeImpl.getCanRecompose()) {
            return InvalidationResult.IGNORED;
        }
        return invalidateChecked(recomposeScopeImpl, anchor, instance);
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public void recomposeScopeReleased(@NotNull RecomposeScopeImpl recomposeScopeImpl) {
        this.pendingInvalidScopes = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.CompositionServices
    @Nullable
    public <T> T getCompositionService(@NotNull CompositionServiceKey<T> key) {
        if (Intrinsics.areEqual(key, CompositionKt.getCompositionImplServiceKey())) {
            return this;
        }
        return null;
    }

    private final boolean tryImminentInvalidation(RecomposeScopeImpl recomposeScopeImpl, Object instance) {
        return isComposing() && this.composer.tryImminentInvalidation$runtime_release(recomposeScopeImpl, instance);
    }

    private final InvalidationResult invalidateChecked(RecomposeScopeImpl recomposeScopeImpl, Anchor anchor, Object instance) {
        synchronized (this.lock) {
            try {
                CompositionImpl compositionImpl = this.invalidationDelegate;
                if (compositionImpl == null || !this.slotTable.groupContainsAnchor(this.invalidationDelegateGroup, anchor)) {
                    compositionImpl = null;
                }
                if (compositionImpl == null) {
                    if (tryImminentInvalidation(recomposeScopeImpl, instance)) {
                        return InvalidationResult.IMMINENT;
                    }
                    if (instance != null) {
                        CompositionKt.addValue(this.invalidations, recomposeScopeImpl, instance);
                    } else {
                        this.invalidations.set(recomposeScopeImpl, null);
                    }
                }
                if (compositionImpl != null) {
                    return compositionImpl.invalidateChecked(recomposeScopeImpl, anchor, instance);
                }
                this.parent.invalidate$runtime_release(this);
                return isComposing() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
            } finally {
            }
        }
    }

    public final void removeObservation$runtime_release(@NotNull Object instance, @NotNull RecomposeScopeImpl recomposeScopeImpl) {
        this.observations.remove(instance, recomposeScopeImpl);
    }

    public final void removeDerivedStateObservation$runtime_release(@NotNull DerivedState<?> state) {
        if (this.observations.contains(state)) {
            return;
        }
        this.derivedStates.removeScope(state);
    }

    private final IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations() {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap = this.invalidations;
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        return identityArrayMap;
    }

    private final void validateRecomposeScopeAnchors(SlotTable slotTable) {
        Object[] slots = slotTable.getSlots();
        ArrayList arrayList = new ArrayList();
        for (Object obj : slots) {
            RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && !slotTable.slotsOf$runtime_release(anchor.toIndexFor(slotTable)).contains(recomposeScopeImpl2)) {
                throw new IllegalStateException(("Misaligned anchor " + anchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + ArraysKt___ArraysKt.indexOf((RecomposeScopeImpl[]) slotTable.getSlots(), recomposeScopeImpl2)).toString());
            }
        }
    }

    private final <T> T trackAbandonedValues(Function0<? extends T> block) {
        try {
            T tInvoke = block.invoke();
            InlineMarker.finallyStart(1);
            InlineMarker.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    private final CompositionObserver observer() {
        CompositionObserverHolder compositionObserverHolder = this.observerHolder;
        if (compositionObserverHolder.getRoot()) {
            return compositionObserverHolder.getObserver();
        }
        CompositionObserverHolder observerHolder = this.parent.getObserverHolder();
        CompositionObserver observer = observerHolder != null ? observerHolder.getObserver() : null;
        if (!Intrinsics.areEqual(observer, compositionObserverHolder.getObserver())) {
            compositionObserverHolder.setObserver(observer);
        }
        return observer;
    }

    /* compiled from: Composition.kt */
    @Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000fJ\u0010\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\u0016\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m7105d2 = {"Landroidx/compose/runtime/CompositionImpl$RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "abandoning", "", "Landroidx/compose/runtime/RememberObserver;", "(Ljava/util/Set;)V", "forgetting", "", "", "releasing", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "remembering", "sideEffects", "Lkotlin/Function0;", "", "deactivating", "instance", "dispatchAbandons", "dispatchRememberObservers", "dispatchSideEffects", "sideEffect", NativeKeys.EFFECT_QUALITY_NK, "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1381:1\n1#2:1382\n46#3,5:1383\n46#3,3:1388\n50#3:1397\n46#3,3:1398\n50#3:1407\n46#3,5:1408\n33#4,6:1391\n33#4,6:1401\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n*L\n1270#1:1383,5\n1292#1:1388,3\n1292#1:1397\n1303#1:1398,3\n1303#1:1407\n1314#1:1408,5\n1293#1:1391,6\n1304#1:1401,6\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class RememberEventDispatcher implements RememberManager {

        @NotNull
        public final Set<RememberObserver> abandoning;

        @Nullable
        public MutableScatterSet<ComposeNodeLifecycleCallback> releasing;

        @NotNull
        public final List<RememberObserver> remembering = new ArrayList();

        @NotNull
        public final List<Object> forgetting = new ArrayList();

        @NotNull
        public final List<Function0<Unit>> sideEffects = new ArrayList();

        public RememberEventDispatcher(@NotNull Set<RememberObserver> set) {
            this.abandoning = set;
        }

        @Override // androidx.compose.runtime.RememberManager
        public void remembering(@NotNull RememberObserver instance) {
            this.remembering.add(instance);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void forgetting(@NotNull RememberObserver instance) {
            this.forgetting.add(instance);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void sideEffect(@NotNull Function0<Unit> function0) {
            this.sideEffects.add(function0);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void deactivating(@NotNull ComposeNodeLifecycleCallback instance) {
            this.forgetting.add(instance);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void releasing(@NotNull ComposeNodeLifecycleCallback instance) {
            MutableScatterSet<ComposeNodeLifecycleCallback> mutableScatterSetMutableScatterSetOf = this.releasing;
            if (mutableScatterSetMutableScatterSetOf == null) {
                mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
                this.releasing = mutableScatterSetMutableScatterSetOf;
            }
            mutableScatterSetMutableScatterSetOf.plusAssign((MutableScatterSet<ComposeNodeLifecycleCallback>) instance);
            this.forgetting.add(instance);
        }

        public final void dispatchRememberObservers() {
            Object objBeginSection;
            if (!this.forgetting.isEmpty()) {
                objBeginSection = Trace.INSTANCE.beginSection("Compose:onForgotten");
                try {
                    ScatterSet scatterSet = this.releasing;
                    for (int size = this.forgetting.size() - 1; -1 < size; size--) {
                        Object obj = this.forgetting.get(size);
                        TypeIntrinsics.asMutableCollection(this.abandoning).remove(obj);
                        if (obj instanceof RememberObserver) {
                            ((RememberObserver) obj).onForgotten();
                        }
                        if (obj instanceof ComposeNodeLifecycleCallback) {
                            if (scatterSet != null && scatterSet.contains(obj)) {
                                ((ComposeNodeLifecycleCallback) obj).onRelease();
                            } else {
                                ((ComposeNodeLifecycleCallback) obj).onDeactivate();
                            }
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    Trace.INSTANCE.endSection(objBeginSection);
                } finally {
                }
            }
            if (!this.remembering.isEmpty()) {
                objBeginSection = Trace.INSTANCE.beginSection("Compose:onRemembered");
                try {
                    List<RememberObserver> list = this.remembering;
                    int size2 = list.size();
                    for (int i = 0; i < size2; i++) {
                        RememberObserver rememberObserver = list.get(i);
                        this.abandoning.remove(rememberObserver);
                        rememberObserver.onRemembered();
                    }
                    Unit unit2 = Unit.INSTANCE;
                    Trace.INSTANCE.endSection(objBeginSection);
                } finally {
                }
            }
        }

        public final void dispatchSideEffects() {
            if (!this.sideEffects.isEmpty()) {
                Object objBeginSection = Trace.INSTANCE.beginSection("Compose:sideeffects");
                try {
                    List<Function0<Unit>> list = this.sideEffects;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).invoke();
                    }
                    this.sideEffects.clear();
                    Unit unit = Unit.INSTANCE;
                    Trace.INSTANCE.endSection(objBeginSection);
                } catch (Throwable th) {
                    Trace.INSTANCE.endSection(objBeginSection);
                    throw th;
                }
            }
        }

        public final void dispatchAbandons() {
            if (!this.abandoning.isEmpty()) {
                Object objBeginSection = Trace.INSTANCE.beginSection("Compose:abandons");
                try {
                    Iterator<RememberObserver> it = this.abandoning.iterator();
                    while (it.hasNext()) {
                        RememberObserver next = it.next();
                        it.remove();
                        next.onAbandoned();
                    }
                    Unit unit = Unit.INSTANCE;
                    Trace.INSTANCE.endSection(objBeginSection);
                } catch (Throwable th) {
                    Trace.INSTANCE.endSection(objBeginSection);
                    throw th;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void deactivate() {
        boolean z = this.slotTable.getGroupsSize() > 0;
        if (z || (true ^ this.abandonSet.isEmpty())) {
            Trace trace = Trace.INSTANCE;
            Object objBeginSection = trace.beginSection("Compose:deactivate");
            try {
                RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                if (z) {
                    this.applier.onBeginChanges();
                    SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                    try {
                        ComposerKt.deactivateCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
                        Unit unit = Unit.INSTANCE;
                        slotWriterOpenWriter.close();
                        this.applier.onEndChanges();
                        rememberEventDispatcher.dispatchRememberObservers();
                    } catch (Throwable th) {
                        slotWriterOpenWriter.close();
                        throw th;
                    }
                }
                rememberEventDispatcher.dispatchAbandons();
                Unit unit2 = Unit.INSTANCE;
                trace.endSection(objBeginSection);
            } catch (Throwable th2) {
                Trace.INSTANCE.endSection(objBeginSection);
                throw th2;
            }
        }
        this.observations.clear();
        this.derivedStates.clear();
        this.invalidations.clear();
        this.changes.clear();
        this.composer.deactivate$runtime_release();
    }

    /* JADX WARN: Removed duplicated region for block: B:242:0x0091 A[PHI: r4
  0x0091: PHI (r4v37 java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl>) = 
  (r4v36 java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl>)
  (r4v38 java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl>)
 binds: [B:233:0x005c, B:241:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0127 A[PHI: r5
  0x0127: PHI (r5v3 java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl>) = 
  (r5v2 java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl>)
  (r5v4 java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl>)
 binds: [B:262:0x00fa, B:270:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void addPendingInvalidationsLocked(Set<? extends Object> set, boolean forgetConditionalScopes) {
        HashSet<RecomposeScopeImpl> hashSetAddPendingInvalidationsLocked;
        long[] jArr;
        String str;
        int i;
        long[] jArr2;
        int i2;
        int i3;
        String str2;
        int i4;
        boolean zContains;
        long[] jArr3;
        Object[] objArr;
        long[] jArr4;
        Object[] objArr2;
        String str3;
        long[] jArr5;
        int i5;
        String str4;
        long[] jArr6;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        boolean zIsEmpty;
        Object[] objArr3;
        long[] jArr7;
        Object[] objArr4;
        long[] jArr8;
        char c = 7;
        long j = -9187201950435737472L;
        Object obj = null;
        if (set instanceof IdentityArraySet) {
            IdentityArraySet identityArraySet = (IdentityArraySet) set;
            Object[] values = identityArraySet.getValues();
            int size = identityArraySet.size();
            hashSetAddPendingInvalidationsLocked = null;
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = values[i10];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (obj2 instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj2).invalidateForResult(obj);
                } else {
                    HashSet<RecomposeScopeImpl> hashSetAddPendingInvalidationsLocked2 = addPendingInvalidationsLocked(hashSetAddPendingInvalidationsLocked, obj2, forgetConditionalScopes);
                    Object obj3 = this.derivedStates.getMap().get(obj2);
                    if (obj3 != null) {
                        if (obj3 instanceof MutableScatterSet) {
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj3;
                            Object[] objArr5 = mutableScatterSet.elements;
                            long[] jArr9 = mutableScatterSet.metadata;
                            int length = jArr9.length - 2;
                            if (length >= 0) {
                                int i11 = 0;
                                while (true) {
                                    long j2 = jArr9[i11];
                                    int i12 = i11;
                                    if ((((~j2) << 7) & j2 & j) != j) {
                                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j2 & 255) < 128) {
                                                hashSetAddPendingInvalidationsLocked2 = addPendingInvalidationsLocked(hashSetAddPendingInvalidationsLocked2, (DerivedState) objArr5[(i12 << 3) + i14], forgetConditionalScopes);
                                            }
                                            j2 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                        if (i12 == length) {
                                            break;
                                        }
                                        i11 = i12 + 1;
                                        j = -9187201950435737472L;
                                    }
                                }
                            }
                        } else {
                            hashSetAddPendingInvalidationsLocked2 = addPendingInvalidationsLocked(hashSetAddPendingInvalidationsLocked2, (DerivedState) obj3, forgetConditionalScopes);
                        }
                    }
                    hashSetAddPendingInvalidationsLocked = hashSetAddPendingInvalidationsLocked2;
                }
                i10++;
                j = -9187201950435737472L;
                obj = null;
            }
        } else {
            hashSetAddPendingInvalidationsLocked = null;
            for (Object obj4 : set) {
                if (obj4 instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj4).invalidateForResult(null);
                } else {
                    HashSet<RecomposeScopeImpl> hashSetAddPendingInvalidationsLocked3 = addPendingInvalidationsLocked(hashSetAddPendingInvalidationsLocked, obj4, forgetConditionalScopes);
                    Object obj5 = this.derivedStates.getMap().get(obj4);
                    if (obj5 != null) {
                        if (obj5 instanceof MutableScatterSet) {
                            MutableScatterSet mutableScatterSet2 = (MutableScatterSet) obj5;
                            Object[] objArr6 = mutableScatterSet2.elements;
                            long[] jArr10 = mutableScatterSet2.metadata;
                            int length2 = jArr10.length - 2;
                            if (length2 >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j3 = jArr10[i15];
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                        for (int i17 = 0; i17 < i16; i17++) {
                                            if ((j3 & 255) < 128) {
                                                hashSetAddPendingInvalidationsLocked3 = addPendingInvalidationsLocked(hashSetAddPendingInvalidationsLocked3, (DerivedState) objArr6[(i15 << 3) + i17], forgetConditionalScopes);
                                            }
                                            j3 >>= 8;
                                        }
                                        if (i16 != 8) {
                                            break;
                                        } else if (i15 == length2) {
                                            break;
                                        } else {
                                            i15++;
                                        }
                                    }
                                }
                            }
                        } else {
                            hashSetAddPendingInvalidationsLocked = addPendingInvalidationsLocked(hashSetAddPendingInvalidationsLocked3, (DerivedState) obj5, forgetConditionalScopes);
                        }
                    }
                    hashSetAddPendingInvalidationsLocked = hashSetAddPendingInvalidationsLocked3;
                }
            }
        }
        String str5 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>";
        boolean z2 = true;
        if (!forgetConditionalScopes || !(!this.conditionallyInvalidatedScopes.isEmpty())) {
            String str6 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>";
            if (hashSetAddPendingInvalidationsLocked != null) {
                MutableScatterMap<Object, Object> map = this.observations.getMap();
                long[] jArr11 = map.metadata;
                int length3 = jArr11.length - 2;
                if (length3 >= 0) {
                    int i18 = 0;
                    while (true) {
                        long j4 = jArr11[i18];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i19 = 8 - ((~(i18 - length3)) >>> 31);
                            int i20 = 0;
                            while (i20 < i19) {
                                if ((j4 & 255) < 128 ? z2 : false) {
                                    int i21 = (i18 << 3) + i20;
                                    Object obj6 = map.keys[i21];
                                    Object obj7 = map.values[i21];
                                    if (obj7 instanceof MutableScatterSet) {
                                        String str7 = str6;
                                        Intrinsics.checkNotNull(obj7, str7);
                                        MutableScatterSet mutableScatterSet3 = (MutableScatterSet) obj7;
                                        Object[] objArr7 = mutableScatterSet3.elements;
                                        long[] jArr12 = mutableScatterSet3.metadata;
                                        int length4 = jArr12.length - 2;
                                        jArr2 = jArr11;
                                        i2 = length3;
                                        i4 = i18;
                                        if (length4 >= 0) {
                                            int i22 = 0;
                                            while (true) {
                                                long j5 = jArr12[i22];
                                                i3 = i19;
                                                str2 = str7;
                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i23 = 8 - ((~(i22 - length4)) >>> 31);
                                                    int i24 = 0;
                                                    while (i24 < i23) {
                                                        if ((j5 & 255) < 128) {
                                                            jArr4 = jArr12;
                                                            int i25 = (i22 << 3) + i24;
                                                            objArr2 = objArr7;
                                                            if (hashSetAddPendingInvalidationsLocked.contains((RecomposeScopeImpl) objArr7[i25])) {
                                                                mutableScatterSet3.removeElementAt(i25);
                                                            }
                                                        } else {
                                                            jArr4 = jArr12;
                                                            objArr2 = objArr7;
                                                        }
                                                        j5 >>= 8;
                                                        i24++;
                                                        jArr12 = jArr4;
                                                        objArr7 = objArr2;
                                                    }
                                                    jArr3 = jArr12;
                                                    objArr = objArr7;
                                                    if (i23 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr3 = jArr12;
                                                    objArr = objArr7;
                                                }
                                                if (i22 == length4) {
                                                    break;
                                                }
                                                i22++;
                                                i19 = i3;
                                                str7 = str2;
                                                jArr12 = jArr3;
                                                objArr7 = objArr;
                                            }
                                        } else {
                                            i3 = i19;
                                            str2 = str7;
                                        }
                                        zContains = mutableScatterSet3.isEmpty();
                                    } else {
                                        jArr2 = jArr11;
                                        i2 = length3;
                                        i3 = i19;
                                        str2 = str6;
                                        i4 = i18;
                                        Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                        zContains = hashSetAddPendingInvalidationsLocked.contains((RecomposeScopeImpl) obj7);
                                    }
                                    if (zContains) {
                                        map.removeValueAt(i21);
                                    }
                                } else {
                                    jArr2 = jArr11;
                                    i2 = length3;
                                    i3 = i19;
                                    str2 = str6;
                                    i4 = i18;
                                }
                                j4 >>= 8;
                                i20++;
                                z2 = true;
                                length3 = i2;
                                jArr11 = jArr2;
                                i18 = i4;
                                i19 = i3;
                                str6 = str2;
                            }
                            jArr = jArr11;
                            int i26 = length3;
                            str = str6;
                            int i27 = i18;
                            if (i19 != 8) {
                                break;
                            }
                            length3 = i26;
                            i = i27;
                        } else {
                            jArr = jArr11;
                            str = str6;
                            i = i18;
                        }
                        if (i == length3) {
                            break;
                        }
                        i18 = i + 1;
                        z2 = true;
                        jArr11 = jArr;
                        str6 = str;
                    }
                }
                cleanUpDerivedStateObservations();
                Unit unit = Unit.INSTANCE;
                return;
            }
            return;
        }
        MutableScatterMap<Object, Object> map2 = this.observations.getMap();
        long[] jArr13 = map2.metadata;
        int length5 = jArr13.length - 2;
        if (length5 >= 0) {
            int i28 = 0;
            while (true) {
                long j6 = jArr13[i28];
                if ((((~j6) << c) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i29 = 8 - ((~(i28 - length5)) >>> 31);
                    int i30 = 0;
                    while (i30 < i29) {
                        if ((j6 & 255) < 128) {
                            int i31 = (i28 << 3) + i30;
                            Object obj8 = map2.keys[i31];
                            Object obj9 = map2.values[i31];
                            if (obj9 instanceof MutableScatterSet) {
                                Intrinsics.checkNotNull(obj9, str5);
                                MutableScatterSet mutableScatterSet4 = (MutableScatterSet) obj9;
                                Object[] objArr8 = mutableScatterSet4.elements;
                                long[] jArr14 = mutableScatterSet4.metadata;
                                jArr6 = jArr13;
                                int length6 = jArr14.length - 2;
                                str4 = str5;
                                i6 = length5;
                                i7 = i28;
                                if (length6 >= 0) {
                                    int i32 = 0;
                                    while (true) {
                                        long j7 = jArr14[i32];
                                        i8 = i29;
                                        i9 = i30;
                                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i33 = 8 - ((~(i32 - length6)) >>> 31);
                                            int i34 = 0;
                                            while (i34 < i33) {
                                                if ((j7 & 255) < 128) {
                                                    jArr8 = jArr14;
                                                    int i35 = (i32 << 3) + i34;
                                                    objArr4 = objArr8;
                                                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr8[i35];
                                                    if (this.conditionallyInvalidatedScopes.contains(recomposeScopeImpl) || (hashSetAddPendingInvalidationsLocked != null && hashSetAddPendingInvalidationsLocked.contains(recomposeScopeImpl))) {
                                                        mutableScatterSet4.removeElementAt(i35);
                                                    }
                                                } else {
                                                    objArr4 = objArr8;
                                                    jArr8 = jArr14;
                                                }
                                                j7 >>= 8;
                                                i34++;
                                                jArr14 = jArr8;
                                                objArr8 = objArr4;
                                            }
                                            objArr3 = objArr8;
                                            jArr7 = jArr14;
                                            if (i33 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr3 = objArr8;
                                            jArr7 = jArr14;
                                        }
                                        if (i32 == length6) {
                                            break;
                                        }
                                        i32++;
                                        i29 = i8;
                                        i30 = i9;
                                        jArr14 = jArr7;
                                        objArr8 = objArr3;
                                    }
                                } else {
                                    i8 = i29;
                                    i9 = i30;
                                }
                                zIsEmpty = mutableScatterSet4.isEmpty();
                            } else {
                                str4 = str5;
                                jArr6 = jArr13;
                                i6 = length5;
                                i7 = i28;
                                i8 = i29;
                                i9 = i30;
                                Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj9;
                                if (this.conditionallyInvalidatedScopes.contains(recomposeScopeImpl2)) {
                                    z = true;
                                } else {
                                    if (hashSetAddPendingInvalidationsLocked != null) {
                                        z = true;
                                        if (hashSetAddPendingInvalidationsLocked.contains(recomposeScopeImpl2)) {
                                        }
                                    }
                                    zIsEmpty = false;
                                }
                                zIsEmpty = z;
                            }
                            if (zIsEmpty) {
                                map2.removeValueAt(i31);
                            }
                        } else {
                            str4 = str5;
                            jArr6 = jArr13;
                            i6 = length5;
                            i7 = i28;
                            i8 = i29;
                            i9 = i30;
                        }
                        j6 >>= 8;
                        i30 = i9 + 1;
                        length5 = i6;
                        jArr13 = jArr6;
                        str5 = str4;
                        i28 = i7;
                        i29 = i8;
                    }
                    str3 = str5;
                    jArr5 = jArr13;
                    int i36 = length5;
                    int i37 = i28;
                    if (i29 != 8) {
                        break;
                    }
                    length5 = i36;
                    i5 = i37;
                } else {
                    str3 = str5;
                    jArr5 = jArr13;
                    i5 = i28;
                }
                if (i5 == length5) {
                    break;
                }
                i28 = i5 + 1;
                c = 7;
                jArr13 = jArr5;
                str5 = str3;
            }
        }
        this.conditionallyInvalidatedScopes.clear();
        cleanUpDerivedStateObservations();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(@NotNull List<Pair<MovableContentStateReference, MovableContentStateReference>> list) {
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!Intrinsics.areEqual(list.get(i).getFirst().getComposition(), this)) {
                break;
            } else {
                i++;
            }
        }
        ComposerKt.runtimeCheck(z);
        try {
            this.composer.insertMovableContentReferences(list);
            Unit unit = Unit.INSTANCE;
        } finally {
        }
    }

    private final <T> T guardChanges(Function0<? extends T> block) throws Exception {
        try {
            try {
                T tInvoke = block.invoke();
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                return tInvoke;
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                InlineMarker.finallyEnd(1);
                throw th;
            }
        } catch (Exception e) {
            abandonChanges();
            throw e;
        }
    }
}
