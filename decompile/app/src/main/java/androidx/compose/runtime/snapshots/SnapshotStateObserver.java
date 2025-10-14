package androidx.compose.runtime.snapshots;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.room.InvalidationTracker;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* compiled from: SnapshotStateObserver.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0001\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u00017B.\u0012'\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\tJ\u0016\u0010\u001d\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0002J\u0006\u0010\u001f\u001a\u00020\u0005J\u000e\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0001J)\u0010!\u001a\u00020\u00052!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00150\u0003J\b\u0010#\u001a\u00020\u0015H\u0002J&\u0010$\u001a\u00020\u0011\"\b\b\u0000\u0010%*\u00020\u00012\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u00020\u00050\u0003H\u0002J\u001d\u0010'\u001a\u00020\u00052\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0003H\u0082\bJ\u001e\u0010)\u001a\u00020\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010+\u001a\u00020\rH\u0007J?\u0010,\u001a\u00020\u0005\"\b\b\u0000\u0010%*\u00020\u00012\u0006\u0010 \u001a\u0002H%2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0002J\u001d\u00100\u001a\u00020\u00052\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\u0003H\u0082\bJ\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020\u0005H\u0002J\u0006\u00104\u001a\u00020\u0005J\u0006\u00105\u001a\u00020\u0005J\u0016\u00106\u001a\u00020\u00052\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007R&\u0010\n\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, m7105d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "onChangedExecutor", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "callback", "(Lkotlin/jvm/functions/Function1;)V", "applyObserver", "Lkotlin/Function2;", "", "Landroidx/compose/runtime/snapshots/Snapshot;", "applyUnsubscribe", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "currentMap", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "currentMapThreadId", "", "isPaused", "", "observedScopeMaps", "Landroidx/compose/runtime/collection/MutableVector;", "pendingChanges", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "readObserver", "sendingNotifications", "addChanges", "set", "clear", PomReader.SCOPE, "clearIf", "predicate", "drainChanges", "ensureMap", ExifInterface.GPS_DIRECTION_TRUE, "onChanged", "forEachScopeMap", "block", "notifyChanges", "changes", "snapshot", "observeReads", "onValueChangedForScope", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "removeChanges", "removeScopeMapIf", "report", "", "sendNotifications", TtmlNode.START, "stop", "withNoObservations", "ObservedScopeMap", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,652:1\n184#1,2:657\n186#1,2:670\n190#1,2:698\n192#1,2:715\n190#1,2:717\n192#1,2:734\n184#1,2:736\n186#1,2:749\n1208#2:653\n1187#2,2:654\n1#3:656\n460#4,11:659\n460#4,11:672\n838#4,15:683\n838#4,15:700\n838#4,15:719\n460#4,11:738\n366#4,12:751\n728#4,2:763\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n*L\n68#1:657,2\n68#1:670,2\n290#1:698,2\n290#1:715,2\n301#1:717,2\n301#1:734,2\n334#1:736,2\n334#1:749,2\n176#1:653\n176#1:654,2\n68#1:659,11\n185#1:672,11\n191#1:683,15\n290#1:700,15\n301#1:719,15\n334#1:738,11\n347#1:751,12\n350#1:763,2\n*E\n"})
/* loaded from: classes2.dex */
public final class SnapshotStateObserver {
    public static final int $stable = 8;

    @Nullable
    private ObserverHandle applyUnsubscribe;

    @Nullable
    private ObservedScopeMap currentMap;
    private boolean isPaused;

    @NotNull
    private final Function1<Function0<Unit>, Unit> onChangedExecutor;
    private boolean sendingNotifications;

    @NotNull
    private final AtomicReference<Object> pendingChanges = new AtomicReference<>(null);

    @NotNull
    private final Function2<Set<? extends Object>, Snapshot, Unit> applyObserver = new Function2<Set<? extends Object>, Snapshot, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1
        {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set, Snapshot snapshot) {
            invoke2(set, snapshot);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Set<? extends Object> set, @NotNull Snapshot snapshot) {
            this.this$0.addChanges(set);
            if (this.this$0.drainChanges()) {
                this.this$0.sendNotifications();
            }
        }
    };

    @NotNull
    private final Function1<Object, Unit> readObserver = new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$readObserver$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Object obj) {
            if (this.this$0.isPaused) {
                return;
            }
            MutableVector mutableVector = this.this$0.observedScopeMaps;
            SnapshotStateObserver snapshotStateObserver = this.this$0;
            synchronized (mutableVector) {
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = snapshotStateObserver.currentMap;
                Intrinsics.checkNotNull(observedScopeMap);
                observedScopeMap.recordRead(obj);
                Unit unit = Unit.INSTANCE;
            }
        }
    };

    @NotNull
    private final MutableVector<ObservedScopeMap> observedScopeMaps = new MutableVector<>(new ObservedScopeMap[16], 0);
    private long currentMapThreadId = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(@NotNull Function1<? super Function0<Unit>, Unit> function1) {
        this.onChangedExecutor = function1;
    }

    public final boolean drainChanges() {
        boolean z;
        synchronized (this.observedScopeMaps) {
            z = this.sendingNotifications;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set<? extends Object> setRemoveChanges = removeChanges();
            if (setRemoveChanges == null) {
                return z2;
            }
            synchronized (this.observedScopeMaps) {
                try {
                    MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                    int size = mutableVector.getSize();
                    if (size > 0) {
                        ObservedScopeMap[] content = mutableVector.getContent();
                        int i = 0;
                        do {
                            z2 = content[i].recordInvalidation(setRemoveChanges) || z2;
                            i++;
                        } while (i < size);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: SnapshotStateObserver.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$sendNotifications$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,652:1\n460#2,11:653\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$sendNotifications$1\n*L\n87#1:653,11\n*E\n"})
    /* renamed from: androidx.compose.runtime.snapshots.SnapshotStateObserver$sendNotifications$1 */
    /* loaded from: classes.dex */
    public static final class C18361 extends Lambda implements Function0<Unit> {
        public C18361() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            do {
                MutableVector mutableVector = SnapshotStateObserver.this.observedScopeMaps;
                SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
                synchronized (mutableVector) {
                    try {
                        if (!snapshotStateObserver.sendingNotifications) {
                            snapshotStateObserver.sendingNotifications = true;
                            try {
                                MutableVector mutableVector2 = snapshotStateObserver.observedScopeMaps;
                                int size = mutableVector2.getSize();
                                if (size > 0) {
                                    Object[] content = mutableVector2.getContent();
                                    int i = 0;
                                    do {
                                        ((ObservedScopeMap) content[i]).notifyInvalidatedScopes();
                                        i++;
                                    } while (i < size);
                                }
                                snapshotStateObserver.sendingNotifications = false;
                            } finally {
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (SnapshotStateObserver.this.drainChanges());
        }
    }

    public final void sendNotifications() {
        this.onChangedExecutor.invoke(new Function0<Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver.sendNotifications.1
            public C18361() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                do {
                    MutableVector mutableVector = SnapshotStateObserver.this.observedScopeMaps;
                    SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
                    synchronized (mutableVector) {
                        try {
                            if (!snapshotStateObserver.sendingNotifications) {
                                snapshotStateObserver.sendingNotifications = true;
                                try {
                                    MutableVector mutableVector2 = snapshotStateObserver.observedScopeMaps;
                                    int size = mutableVector2.getSize();
                                    if (size > 0) {
                                        Object[] content = mutableVector2.getContent();
                                        int i = 0;
                                        do {
                                            ((ObservedScopeMap) content[i]).notifyInvalidatedScopes();
                                            i++;
                                        } while (i < size);
                                    }
                                    snapshotStateObserver.sendingNotifications = false;
                                } finally {
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (SnapshotStateObserver.this.drainChanges());
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addChanges(Set<? extends Object> set) {
        Object obj;
        List listPlus;
        do {
            obj = this.pendingChanges.get();
            if (obj == null) {
                listPlus = set;
            } else if (obj instanceof Set) {
                listPlus = CollectionsKt__CollectionsKt.listOf((Object[]) new Set[]{obj, set});
            } else {
                if (!(obj instanceof List)) {
                    report();
                    throw new KotlinNothingValueException();
                }
                listPlus = CollectionsKt___CollectionsKt.plus((Collection) obj, (Iterable) CollectionsKt__CollectionsJVMKt.listOf(set));
            }
        } while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.pendingChanges, obj, listPlus));
    }

    private final Set<Object> removeChanges() {
        Object obj;
        Object objSubList;
        Set<Object> set;
        do {
            obj = this.pendingChanges.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else if (obj instanceof List) {
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            } else {
                report();
                throw new KotlinNothingValueException();
            }
        } while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.pendingChanges, obj, objSubList));
        return set;
    }

    private final Void report() {
        ComposerKt.composeRuntimeError("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    private final void forEachScopeMap(Function1<? super ObservedScopeMap, Unit> block) {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    ObservedScopeMap[] content = mutableVector.getContent();
                    int i = 0;
                    do {
                        block.invoke(content[i]);
                        i++;
                    } while (i < size);
                }
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
    }

    private final void removeScopeMapIf(Function1<? super ObservedScopeMap, Boolean> block) {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    if (block.invoke(mutableVector.getContent()[i2]).booleanValue()) {
                        i++;
                    } else if (i > 0) {
                        mutableVector.getContent()[i2 - i] = mutableVector.getContent()[i2];
                    }
                }
                int i3 = size - i;
                ArraysKt___ArraysJvmKt.fill(mutableVector.getContent(), (Object) null, i3, size);
                mutableVector.setSize(i3);
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
    }

    public final <T> void observeReads(@NotNull T t, @NotNull Function1<? super T, Unit> onValueChangedForScope, @NotNull Function0<Unit> block) {
        ObservedScopeMap observedScopeMapEnsureMap;
        synchronized (this.observedScopeMaps) {
            observedScopeMapEnsureMap = ensureMap(onValueChangedForScope);
        }
        boolean z = this.isPaused;
        ObservedScopeMap observedScopeMap = this.currentMap;
        long j = this.currentMapThreadId;
        if (j == -1 || j == ActualJvm_jvmKt.currentThreadId()) {
            try {
                this.isPaused = false;
                this.currentMap = observedScopeMapEnsureMap;
                this.currentMapThreadId = Thread.currentThread().getId();
                observedScopeMapEnsureMap.observe(t, this.readObserver, block);
                return;
            } finally {
                this.currentMap = observedScopeMap;
                this.isPaused = z;
                this.currentMapThreadId = j;
            }
        }
        throw new IllegalArgumentException(("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + ActualJvm_jvmKt.currentThreadId() + ", name=" + ActualJvm_jvmKt.currentThreadName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.").toString());
    }

    @Deprecated(message = "Replace with Snapshot.withoutReadObservation()", replaceWith = @ReplaceWith(expression = "Snapshot.withoutReadObservation(block)", imports = {"androidx.compose.runtime.snapshots.Snapshot"}))
    public final void withNoObservations(@NotNull Function0<Unit> block) {
        boolean z = this.isPaused;
        this.isPaused = true;
        try {
            block.invoke();
        } finally {
            this.isPaused = z;
        }
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.INSTANCE.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle != null) {
            observerHandle.dispose();
        }
    }

    @TestOnly
    public final void notifyChanges(@NotNull Set<? extends Object> changes, @NotNull Snapshot snapshot) {
        this.applyObserver.invoke(changes, snapshot);
    }

    private final <T> ObservedScopeMap ensureMap(Function1<? super T, Unit> onChanged) {
        ObservedScopeMap observedScopeMap;
        MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
        int size = mutableVector.getSize();
        if (size > 0) {
            ObservedScopeMap[] content = mutableVector.getContent();
            int i = 0;
            do {
                observedScopeMap = content[i];
                if (observedScopeMap.getOnChanged() == onChanged) {
                    break;
                }
                i++;
            } while (i < size);
            observedScopeMap = null;
        } else {
            observedScopeMap = null;
        }
        ObservedScopeMap observedScopeMap2 = observedScopeMap;
        if (observedScopeMap2 != null) {
            return observedScopeMap2;
        }
        Intrinsics.checkNotNull(onChanged, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        ObservedScopeMap observedScopeMap3 = new ObservedScopeMap((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(onChanged, 1));
        this.observedScopeMaps.add(observedScopeMap3);
        return observedScopeMap3;
    }

    /* compiled from: SnapshotStateObserver.kt */
    @Metadata(m7104d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u001f\u001a\u00020\u0004J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0001H\u0002J\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0001J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u0004J0\u0010&\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00012\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040)J\u0014\u0010*\u001a\u00020$2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010,J\u000e\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0001J.\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0002J\u0018\u00100\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001H\u0002J)\u00101\u001a\u00020\u00042!\u00102\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020$0\u0003J\u0012\u00105\u001a\u00020\u00042\n\u00106\u001a\u0006\u0012\u0002\b\u00030\rR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R6\u0010\u0017\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, m7105d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "onChanged", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "currentScope", "currentScopeReads", "Landroidx/collection/MutableObjectIntMap;", "currentToken", "", "dependencyToDerivedStates", "Landroidx/compose/runtime/collection/ScopeMap;", "Landroidx/compose/runtime/DerivedState;", "deriveStateScopeCount", "derivedStateObserver", "Landroidx/compose/runtime/DerivedStateObserver;", "getDerivedStateObserver", "()Landroidx/compose/runtime/DerivedStateObserver;", InvalidationTracker.INVALIDATED_COLUMN_NAME, "Landroidx/collection/MutableScatterSet;", "getOnChanged", "()Lkotlin/jvm/functions/Function1;", "recordedDerivedStateValues", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "scopeToValues", "Landroidx/collection/MutableScatterMap;", "statesToReread", "Landroidx/compose/runtime/collection/MutableVector;", "valueToScopes", "clear", "clearObsoleteStateReads", PomReader.SCOPE, "clearScopeObservations", "hasScopeObservations", "", "notifyInvalidatedScopes", "observe", "readObserver", "block", "Lkotlin/Function0;", "recordInvalidation", "changes", "", "recordRead", "value", "recordedValues", "removeObservation", "removeScopeIf", "predicate", "Lkotlin/ParameterName;", "name", "rereadDerivedState", "derivedState", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 6 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 9 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 10 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 11 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySetKt\n+ 12 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 13 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 14 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 15 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,652:1\n1208#2:653\n1187#2,2:654\n415#3,3:656\n373#3,6:659\n383#3,3:666\n386#3,2:670\n419#3:672\n420#3:674\n389#3,6:675\n421#3:681\n373#3,6:693\n383#3,3:700\n386#3,2:704\n389#3,6:710\n401#3,4:717\n373#3,6:721\n383#3,3:728\n386#3,2:732\n406#3,2:734\n389#3,6:736\n408#3:742\n401#3,4:758\n373#3,6:762\n383#3,3:769\n386#3,2:773\n406#3,2:775\n389#3,6:777\n408#3:783\n1810#4:665\n1672#4:669\n1810#4:699\n1672#4:703\n1810#4:727\n1672#4:731\n1810#4:750\n1672#4:754\n1810#4:768\n1672#4:772\n1810#4:818\n1672#4:822\n1810#4:842\n1672#4:846\n1810#4:887\n1672#4:891\n1810#4:924\n1672#4:928\n1672#4:961\n1810#4:981\n1672#4:985\n1810#4:1026\n1672#4:1030\n1810#4:1063\n1672#4:1067\n1810#4:1112\n1672#4:1116\n1810#4:1143\n1672#4:1147\n51#5:673\n51#5:682\n51#5:801\n388#6,6:683\n394#6,2:690\n48#7:689\n460#7,11:1085\n843#8:692\n845#8,4:706\n849#8:716\n1047#9:743\n1049#9:757\n1050#9,3:784\n1053#9:793\n363#10,6:744\n373#10,3:751\n376#10,2:755\n379#10,6:787\n396#11,2:794\n399#11:945\n401#11:1084\n108#12,5:796\n114#12:944\n70#13,5:802\n70#13,5:826\n78#13,4:858\n78#13:870\n70#13,5:871\n78#13,4:903\n81#13:907\n70#13,5:908\n78#13,4:940\n70#13,5:965\n78#13,4:997\n78#13:1009\n70#13,5:1010\n78#13,4:1042\n81#13:1046\n70#13,5:1047\n78#13,4:1079\n70#13,5:1096\n78#13,4:1128\n267#14,4:807\n237#14,7:811\n248#14,3:819\n251#14,2:823\n272#14:825\n267#14,4:831\n237#14,7:835\n248#14,3:843\n251#14,2:847\n272#14,2:849\n254#14,6:851\n274#14:857\n273#14:862\n254#14,6:863\n274#14:869\n267#14,4:876\n237#14,7:880\n248#14,3:888\n251#14,2:892\n272#14,2:894\n254#14,6:896\n274#14:902\n267#14,4:913\n237#14,7:917\n248#14,3:925\n251#14,2:929\n272#14,2:931\n254#14,6:933\n274#14:939\n237#14,14:947\n251#14,2:962\n272#14:964\n267#14,4:970\n237#14,7:974\n248#14,3:982\n251#14,2:986\n272#14,2:988\n254#14,6:990\n274#14:996\n273#14:1001\n254#14,6:1002\n274#14:1008\n267#14,4:1015\n237#14,7:1019\n248#14,3:1027\n251#14,2:1031\n272#14,2:1033\n254#14,6:1035\n274#14:1041\n267#14,4:1052\n237#14,7:1056\n248#14,3:1064\n251#14,2:1068\n272#14,2:1070\n254#14,6:1072\n274#14:1078\n267#14,4:1101\n237#14,7:1105\n248#14,3:1113\n251#14,2:1117\n272#14,2:1119\n254#14,6:1121\n274#14:1127\n267#14,4:1132\n237#14,7:1136\n248#14,3:1144\n251#14,2:1148\n272#14,2:1150\n254#14,6:1152\n274#14:1158\n1855#15:946\n1856#15:1083\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n*L\n397#1:653\n397#1:654,2\n469#1:656,3\n469#1:659,6\n469#1:666,3\n469#1:670,2\n469#1:672\n469#1:674\n469#1:675,6\n469#1:681\n512#1:693,6\n512#1:700,3\n512#1:704,2\n512#1:710,6\n526#1:717,4\n526#1:721,6\n526#1:728,3\n526#1:732,2\n526#1:734,2\n526#1:736,6\n526#1:742\n538#1:758,4\n538#1:762,6\n538#1:769,3\n538#1:773,2\n538#1:775,2\n538#1:777,6\n538#1:783\n469#1:665\n469#1:669\n512#1:699\n512#1:703\n526#1:727\n526#1:731\n535#1:750\n535#1:754\n538#1:768\n538#1:772\n588#1:818\n588#1:822\n599#1:842\n599#1:846\n599#1:887\n599#1:891\n610#1:924\n610#1:928\n588#1:961\n599#1:981\n599#1:985\n599#1:1026\n599#1:1030\n610#1:1063\n610#1:1067\n630#1:1112\n630#1:1116\n647#1:1143\n647#1:1147\n471#1:673\n479#1:682\n581#1:801\n499#1:683,6\n499#1:690,2\n499#1:689\n617#1:1085,11\n512#1:692\n512#1:706,4\n512#1:716\n535#1:743\n535#1:757\n535#1:784,3\n535#1:793\n535#1:744,6\n535#1:751,3\n535#1:755,2\n535#1:787,6\n579#1:794,2\n579#1:945\n579#1:1084\n579#1:796,5\n579#1:944\n588#1:802,5\n599#1:826,5\n599#1:858,4\n588#1:870\n599#1:871,5\n599#1:903,4\n588#1:907\n610#1:908,5\n610#1:940,4\n599#1:965,5\n599#1:997,4\n588#1:1009\n599#1:1010,5\n599#1:1042,4\n588#1:1046\n610#1:1047,5\n610#1:1079,4\n630#1:1096,5\n630#1:1128,4\n588#1:807,4\n588#1:811,7\n588#1:819,3\n588#1:823,2\n588#1:825\n599#1:831,4\n599#1:835,7\n599#1:843,3\n599#1:847,2\n599#1:849,2\n599#1:851,6\n599#1:857\n588#1:862\n588#1:863,6\n588#1:869\n599#1:876,4\n599#1:880,7\n599#1:888,3\n599#1:892,2\n599#1:894,2\n599#1:896,6\n599#1:902\n610#1:913,4\n610#1:917,7\n610#1:925,3\n610#1:929,2\n610#1:931,2\n610#1:933,6\n610#1:939\n588#1:947,14\n588#1:962,2\n588#1:964\n599#1:970,4\n599#1:974,7\n599#1:982,3\n599#1:986,2\n599#1:988,2\n599#1:990,6\n599#1:996\n588#1:1001\n588#1:1002,6\n588#1:1008\n599#1:1015,4\n599#1:1019,7\n599#1:1027,3\n599#1:1031,2\n599#1:1033,2\n599#1:1035,6\n599#1:1041\n610#1:1052,4\n610#1:1056,7\n610#1:1064,3\n610#1:1068,2\n610#1:1070,2\n610#1:1072,6\n610#1:1078\n630#1:1101,4\n630#1:1105,7\n630#1:1113,3\n630#1:1117,2\n630#1:1119,2\n630#1:1121,6\n630#1:1127\n647#1:1132,4\n647#1:1136,7\n647#1:1144,3\n647#1:1148,2\n647#1:1150,2\n647#1:1152,6\n647#1:1158\n579#1:946\n579#1:1083\n*E\n"})
    public static final class ObservedScopeMap {

        @Nullable
        public Object currentScope;

        @Nullable
        public MutableObjectIntMap<Object> currentScopeReads;
        public int deriveStateScopeCount;

        @NotNull
        public final Function1<Object, Unit> onChanged;
        public int currentToken = -1;

        @NotNull
        public final ScopeMap<Object> valueToScopes = new ScopeMap<>();

        @NotNull
        public final MutableScatterMap<Object, MutableObjectIntMap<Object>> scopeToValues = new MutableScatterMap<>(0, 1, null);

        @NotNull
        public final MutableScatterSet<Object> invalidated = new MutableScatterSet<>(0, 1, null);

        @NotNull
        public final MutableVector<DerivedState<?>> statesToReread = new MutableVector<>(new DerivedState[16], 0);

        @NotNull
        public final DerivedStateObserver derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(@NotNull DerivedState<?> derivedState) {
                this.this$0.deriveStateScopeCount++;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(@NotNull DerivedState<?> derivedState) {
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = this.this$0;
                observedScopeMap.deriveStateScopeCount--;
            }
        };

        @NotNull
        public final ScopeMap<DerivedState<?>> dependencyToDerivedStates = new ScopeMap<>();

        @NotNull
        public final HashMap<DerivedState<?>, Object> recordedDerivedStateValues = new HashMap<>();

        public ObservedScopeMap(@NotNull Function1<Object, Unit> function1) {
            this.onChanged = function1;
        }

        @NotNull
        public final Function1<Object, Unit> getOnChanged() {
            return this.onChanged;
        }

        @NotNull
        public final DerivedStateObserver getDerivedStateObserver() {
            return this.derivedStateObserver;
        }

        public final void recordRead(@NotNull Object value) {
            Object obj = this.currentScope;
            Intrinsics.checkNotNull(obj);
            int i = this.currentToken;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap == null) {
                mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
                this.currentScopeReads = mutableObjectIntMap;
                this.scopeToValues.set(obj, mutableObjectIntMap);
                Unit unit = Unit.INSTANCE;
            }
            recordRead(value, i, obj, mutableObjectIntMap);
        }

        /* JADX WARN: Removed duplicated region for block: B:66:0x008b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void recordRead(Object value, int currentToken, Object currentScope, MutableObjectIntMap<Object> recordedValues) {
            int i;
            int i2;
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            int iPut = recordedValues.put(value, currentToken, -1);
            if (!(value instanceof DerivedState) || iPut == currentToken) {
                i = -1;
            } else {
                DerivedState.Record currentRecord = ((DerivedState) value).getCurrentRecord();
                this.recordedDerivedStateValues.put(value, currentRecord.getCurrentValue());
                ObjectIntMap<StateObject> dependencies = currentRecord.getDependencies();
                ScopeMap<DerivedState<?>> scopeMap = this.dependencyToDerivedStates;
                scopeMap.removeScope(value);
                Object[] objArr = dependencies.keys;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((j & 255) < 128) {
                                    StateObject stateObject = (StateObject) objArr[(i3 << 3) + i6];
                                    if (stateObject instanceof StateObjectImpl) {
                                        ReaderKind.Companion companion = ReaderKind.INSTANCE;
                                        ((StateObjectImpl) stateObject).m10975recordReadInh_f27i8$runtime_release(ReaderKind.m10962constructorimpl(2));
                                    }
                                    scopeMap.add(stateObject, value);
                                    i2 = 8;
                                } else {
                                    i2 = i4;
                                }
                                j >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                break;
                            } else if (i3 == length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                i = -1;
            }
            if (iPut == i) {
                if (value instanceof StateObjectImpl) {
                    ReaderKind.Companion companion2 = ReaderKind.INSTANCE;
                    ((StateObjectImpl) value).m10975recordReadInh_f27i8$runtime_release(ReaderKind.m10962constructorimpl(2));
                }
                this.valueToScopes.add(value, currentScope);
            }
        }

        public final void observe(@NotNull Object obj, @NotNull Function1<Object, Unit> readObserver, @NotNull Function0<Unit> block) {
            Object obj2 = this.currentScope;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            int i = this.currentToken;
            this.currentScope = obj;
            this.currentScopeReads = this.scopeToValues.get(obj);
            if (this.currentToken == -1) {
                this.currentToken = SnapshotKt.currentSnapshot().getId();
            }
            DerivedStateObserver derivedStateObserver = this.derivedStateObserver;
            MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
            try {
                mutableVectorDerivedStateObservers.add(derivedStateObserver);
                Snapshot.INSTANCE.observe(readObserver, null, block);
                mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                Object obj3 = this.currentScope;
                Intrinsics.checkNotNull(obj3);
                clearObsoleteStateReads(obj3);
                this.currentScope = obj2;
                this.currentScopeReads = mutableObjectIntMap;
                this.currentToken = i;
            } catch (Throwable th) {
                mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                throw th;
            }
        }

        public final void clearObsoleteStateReads(Object obj) {
            int i = this.currentToken;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap == null) {
                return;
            }
            long[] jArr = mutableObjectIntMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj2 = mutableObjectIntMap.keys[i5];
                            boolean z = mutableObjectIntMap.values[i5] != i;
                            if (z) {
                                removeObservation(obj, obj2);
                            }
                            if (z) {
                                mutableObjectIntMap.removeValueAt(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        }

        public final void clearScopeObservations(@NotNull Object obj) {
            MutableObjectIntMap<Object> mutableObjectIntMapRemove = this.scopeToValues.remove(obj);
            if (mutableObjectIntMapRemove == null) {
                return;
            }
            Object[] objArr = mutableObjectIntMapRemove.keys;
            int[] iArr = mutableObjectIntMapRemove.values;
            long[] jArr = mutableObjectIntMapRemove.metadata;
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
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            int i5 = iArr[i4];
                            removeObservation(obj, obj2);
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

        public final void removeScopeIf(@NotNull Function1<Object, Boolean> predicate) {
            long[] jArr;
            int i;
            long[] jArr2;
            int i2;
            long j;
            int i3;
            long j2;
            int i4;
            MutableScatterMap<Object, MutableObjectIntMap<Object>> mutableScatterMap = this.scopeToValues;
            long[] jArr3 = mutableScatterMap.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i5 = 0;
            while (true) {
                long j3 = jArr3[i5];
                long j4 = -9187201950435737472L;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8;
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j3 & 255) < 128) {
                            int i9 = (i5 << 3) + i8;
                            Object obj = mutableScatterMap.keys[i9];
                            MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) mutableScatterMap.values[i9];
                            Boolean boolInvoke = predicate.invoke(obj);
                            if (boolInvoke.booleanValue()) {
                                Object[] objArr = mutableObjectIntMap.keys;
                                int[] iArr = mutableObjectIntMap.values;
                                long[] jArr4 = mutableObjectIntMap.metadata;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                if (length2 >= 0) {
                                    i3 = i7;
                                    int i10 = 0;
                                    while (true) {
                                        long j5 = jArr4[i10];
                                        i2 = i5;
                                        j = j3;
                                        j2 = -9187201950435737472L;
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            for (int i12 = 0; i12 < i11; i12++) {
                                                if ((j5 & 255) < 128) {
                                                    int i13 = (i10 << 3) + i12;
                                                    Object obj2 = objArr[i13];
                                                    int i14 = iArr[i13];
                                                    removeObservation(obj, obj2);
                                                }
                                                j5 >>= 8;
                                            }
                                            if (i11 != 8) {
                                                break;
                                            }
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        i5 = i2;
                                        j3 = j;
                                    }
                                } else {
                                    i2 = i5;
                                    j = j3;
                                    i3 = i7;
                                    j2 = -9187201950435737472L;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i5;
                                j = j3;
                                i3 = i7;
                                j2 = j4;
                            }
                            if (boolInvoke.booleanValue()) {
                                mutableScatterMap.removeValueAt(i9);
                            }
                            i4 = 8;
                        } else {
                            jArr2 = jArr3;
                            i2 = i5;
                            j = j3;
                            i3 = i7;
                            j2 = j4;
                            i4 = i6;
                        }
                        j3 = j >> i4;
                        i8++;
                        i6 = i4;
                        j4 = j2;
                        jArr3 = jArr2;
                        i7 = i3;
                        i5 = i2;
                    }
                    jArr = jArr3;
                    int i15 = i5;
                    if (i7 != i6) {
                        return;
                    } else {
                        i = i15;
                    }
                } else {
                    jArr = jArr3;
                    i = i5;
                }
                if (i == length) {
                    return;
                }
                i5 = i + 1;
                jArr3 = jArr;
            }
        }

        public final boolean hasScopeObservations() {
            return this.scopeToValues.isNotEmpty();
        }

        public final void removeObservation(Object obj, Object value) {
            this.valueToScopes.remove(value, obj);
            if (!(value instanceof DerivedState) || this.valueToScopes.contains(value)) {
                return;
            }
            this.dependencyToDerivedStates.removeScope(value);
            this.recordedDerivedStateValues.remove(value);
        }

        public final void clear() {
            this.valueToScopes.clear();
            this.scopeToValues.clear();
            this.dependencyToDerivedStates.clear();
            this.recordedDerivedStateValues.clear();
        }

        /* JADX WARN: Removed duplicated region for block: B:299:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:341:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:376:0x0257 A[PHI: r19
  0x0257: PHI (r19v44 boolean) = (r19v43 boolean), (r19v45 boolean) binds: [B:366:0x0227, B:375:0x0255] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:380:0x0268  */
        /* JADX WARN: Removed duplicated region for block: B:383:0x0282  */
        /* JADX WARN: Removed duplicated region for block: B:399:0x02d1 A[EDGE_INSN: B:399:0x02d1->B:537:0x02db BREAK  A[LOOP:5: B:388:0x0293->B:400:0x02d3], PHI: r19
  0x02d1: PHI (r19v38 boolean) = (r19v37 boolean), (r19v39 boolean) binds: [B:389:0x02a1, B:398:0x02cf] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:412:0x032c  */
        /* JADX WARN: Removed duplicated region for block: B:454:0x0421  */
        /* JADX WARN: Removed duplicated region for block: B:491:0x0538 A[PHI: r19
  0x0538: PHI (r19v13 boolean) = (r19v12 boolean), (r19v14 boolean) binds: [B:481:0x0508, B:490:0x0536] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:534:0x02db A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean recordInvalidation(@NotNull Set<? extends Object> changes) {
            boolean z;
            Iterator it;
            Object obj;
            HashMap<DerivedState<?>, Object> map;
            ScopeMap<DerivedState<?>> scopeMap;
            String str;
            int i;
            char c;
            Object obj2;
            char c2;
            HashMap<DerivedState<?>, Object> map2;
            long[] jArr;
            Object[] objArr;
            Iterator it2;
            Object obj3;
            HashMap<DerivedState<?>, Object> map3;
            ScopeMap<DerivedState<?>> scopeMap2;
            long[] jArr2;
            Object[] objArr2;
            int i2;
            String str2;
            long[] jArr3;
            long[] jArr4;
            char c3;
            int i3;
            ScopeMap<DerivedState<?>> scopeMap3;
            ScopeMap<Object> scopeMap4;
            Object[] objArr3;
            String str3;
            int i4;
            Object obj4;
            Object obj5;
            int i5;
            char c4;
            Object obj6;
            char c5;
            long[] jArr5;
            Object[] objArr4;
            ScopeMap<Object> scopeMap5;
            Object[] objArr5;
            String str4;
            long[] jArr6;
            int i6;
            Object obj7;
            Object[] objArr6;
            ScopeMap<Object> scopeMap6;
            char c6;
            ScopeMap<DerivedState<?>> scopeMap7 = this.dependencyToDerivedStates;
            HashMap<DerivedState<?>, Object> map4 = this.recordedDerivedStateValues;
            ScopeMap<Object> scopeMap8 = this.valueToScopes;
            MutableScatterSet<Object> mutableScatterSet = this.invalidated;
            String str5 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            char c7 = 7;
            int i7 = 2;
            int i8 = 0;
            if (changes instanceof IdentityArraySet) {
                IdentityArraySet identityArraySet = (IdentityArraySet) changes;
                Object[] values = identityArraySet.getValues();
                int size = identityArraySet.size();
                int i9 = 0;
                z = false;
                while (i9 < size) {
                    Object obj8 = values[i9];
                    Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    if (obj8 instanceof StateObjectImpl) {
                        ReaderKind.Companion companion = ReaderKind.INSTANCE;
                        if (!((StateObjectImpl) obj8).m10974isReadInh_f27i8$runtime_release(ReaderKind.m10962constructorimpl(i7))) {
                            i3 = size;
                            scopeMap3 = scopeMap7;
                            scopeMap4 = scopeMap8;
                            objArr3 = values;
                            str3 = str5;
                            i4 = i9;
                        } else if (!scopeMap7.contains(obj8) || (obj6 = scopeMap7.getMap().get(obj8)) == null) {
                            i3 = size;
                            scopeMap3 = scopeMap7;
                            scopeMap4 = scopeMap8;
                            objArr3 = values;
                            str3 = str5;
                            i4 = i9;
                            obj4 = obj8;
                            obj5 = scopeMap4.getMap().get(obj4);
                            if (obj5 != null) {
                                if (obj5 instanceof MutableScatterSet) {
                                    MutableScatterSet mutableScatterSet2 = (MutableScatterSet) obj5;
                                    Object[] objArr7 = mutableScatterSet2.elements;
                                    long[] jArr7 = mutableScatterSet2.metadata;
                                    int length = jArr7.length - 2;
                                    if (length >= 0) {
                                        while (true) {
                                            long j = jArr7[i5];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i10 = 8 - ((~(i5 - length)) >>> 31);
                                                for (int i11 = 0; i11 < i10; i11++) {
                                                    if ((j & 255) < 128) {
                                                        mutableScatterSet.add(objArr7[(i5 << 3) + i11]);
                                                        c4 = '\b';
                                                        z = true;
                                                    } else {
                                                        c4 = '\b';
                                                    }
                                                    j >>= c4;
                                                }
                                                if (i10 == 8) {
                                                    i5 = i5 != length ? i5 + 1 : 0;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    mutableScatterSet.add(obj5);
                                    z = true;
                                }
                            }
                        } else {
                            if (obj6 instanceof MutableScatterSet) {
                                MutableScatterSet mutableScatterSet3 = (MutableScatterSet) obj6;
                                Object[] objArr8 = mutableScatterSet3.elements;
                                long[] jArr8 = mutableScatterSet3.metadata;
                                int length2 = jArr8.length - i7;
                                if (length2 >= 0) {
                                    int i12 = length2;
                                    int i13 = 0;
                                    while (true) {
                                        long j2 = jArr8[i13];
                                        i3 = size;
                                        scopeMap3 = scopeMap7;
                                        if ((((~j2) << c7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i14 = 8 - ((~(i13 - i12)) >>> 31);
                                            int i15 = 0;
                                            while (i15 < i14) {
                                                if ((j2 & 255) < 128) {
                                                    DerivedState<?> derivedState = (DerivedState) objArr8[(i13 << 3) + i15];
                                                    Intrinsics.checkNotNull(derivedState, str5);
                                                    objArr5 = values;
                                                    Object obj9 = map4.get(derivedState);
                                                    SnapshotMutationPolicy<?> policy = derivedState.getPolicy();
                                                    if (policy == null) {
                                                        policy = SnapshotStateKt.structuralEqualityPolicy();
                                                    }
                                                    jArr6 = jArr8;
                                                    objArr6 = objArr8;
                                                    if (policy.equivalent(derivedState.getCurrentRecord().getCurrentValue(), obj9)) {
                                                        scopeMap5 = scopeMap8;
                                                        str4 = str5;
                                                        i6 = i9;
                                                        obj7 = obj8;
                                                        this.statesToReread.add(derivedState);
                                                    } else {
                                                        Object obj10 = scopeMap8.getMap().get(derivedState);
                                                        if (obj10 == null) {
                                                            scopeMap5 = scopeMap8;
                                                            str4 = str5;
                                                            i6 = i9;
                                                            obj7 = obj8;
                                                        } else if (obj10 instanceof MutableScatterSet) {
                                                            MutableScatterSet mutableScatterSet4 = (MutableScatterSet) obj10;
                                                            Object[] objArr9 = mutableScatterSet4.elements;
                                                            long[] jArr9 = mutableScatterSet4.metadata;
                                                            int length3 = jArr9.length - 2;
                                                            if (length3 >= 0) {
                                                                i6 = i9;
                                                                obj7 = obj8;
                                                                int i16 = 0;
                                                                while (true) {
                                                                    long j3 = jArr9[i16];
                                                                    long[] jArr10 = jArr9;
                                                                    str4 = str5;
                                                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i17 = 8 - ((~(i16 - length3)) >>> 31);
                                                                        int i18 = 0;
                                                                        while (i18 < i17) {
                                                                            if ((j3 & 255) < 128) {
                                                                                scopeMap6 = scopeMap8;
                                                                                mutableScatterSet.add(objArr9[(i16 << 3) + i18]);
                                                                                c6 = '\b';
                                                                                z = true;
                                                                            } else {
                                                                                scopeMap6 = scopeMap8;
                                                                                c6 = '\b';
                                                                            }
                                                                            j3 >>= c6;
                                                                            i18++;
                                                                            scopeMap8 = scopeMap6;
                                                                        }
                                                                        scopeMap5 = scopeMap8;
                                                                        if (i17 != 8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        scopeMap5 = scopeMap8;
                                                                    }
                                                                    if (i16 == length3) {
                                                                        break;
                                                                    }
                                                                    i16++;
                                                                    str5 = str4;
                                                                    jArr9 = jArr10;
                                                                    scopeMap8 = scopeMap5;
                                                                }
                                                            }
                                                        } else {
                                                            scopeMap5 = scopeMap8;
                                                            str4 = str5;
                                                            i6 = i9;
                                                            obj7 = obj8;
                                                            mutableScatterSet.add(obj10);
                                                            z = true;
                                                        }
                                                    }
                                                } else {
                                                    scopeMap5 = scopeMap8;
                                                    objArr5 = values;
                                                    str4 = str5;
                                                    jArr6 = jArr8;
                                                    i6 = i9;
                                                    obj7 = obj8;
                                                    objArr6 = objArr8;
                                                }
                                                j2 >>= 8;
                                                i15++;
                                                values = objArr5;
                                                i9 = i6;
                                                jArr8 = jArr6;
                                                objArr8 = objArr6;
                                                obj8 = obj7;
                                                str5 = str4;
                                                scopeMap8 = scopeMap5;
                                            }
                                            scopeMap4 = scopeMap8;
                                            objArr3 = values;
                                            str3 = str5;
                                            jArr5 = jArr8;
                                            i4 = i9;
                                            obj4 = obj8;
                                            objArr4 = objArr8;
                                            if (i14 != 8) {
                                                break;
                                            }
                                        } else {
                                            scopeMap4 = scopeMap8;
                                            objArr3 = values;
                                            str3 = str5;
                                            jArr5 = jArr8;
                                            i4 = i9;
                                            obj4 = obj8;
                                            objArr4 = objArr8;
                                        }
                                        int i19 = i12;
                                        if (i13 == i19) {
                                            break;
                                        }
                                        i13++;
                                        i12 = i19;
                                        scopeMap7 = scopeMap3;
                                        size = i3;
                                        values = objArr3;
                                        i9 = i4;
                                        jArr8 = jArr5;
                                        objArr8 = objArr4;
                                        obj8 = obj4;
                                        str5 = str3;
                                        scopeMap8 = scopeMap4;
                                        c7 = 7;
                                    }
                                }
                            } else {
                                i3 = size;
                                scopeMap3 = scopeMap7;
                                scopeMap4 = scopeMap8;
                                objArr3 = values;
                                str3 = str5;
                                i4 = i9;
                                obj4 = obj8;
                                DerivedState<?> derivedState2 = (DerivedState) obj6;
                                Object obj11 = map4.get(derivedState2);
                                SnapshotMutationPolicy<?> policy2 = derivedState2.getPolicy();
                                if (policy2 == null) {
                                    policy2 = SnapshotStateKt.structuralEqualityPolicy();
                                }
                                if (policy2.equivalent(derivedState2.getCurrentRecord().getCurrentValue(), obj11)) {
                                    this.statesToReread.add(derivedState2);
                                } else {
                                    Object obj12 = scopeMap4.getMap().get(derivedState2);
                                    if (obj12 != null) {
                                        if (obj12 instanceof MutableScatterSet) {
                                            MutableScatterSet mutableScatterSet5 = (MutableScatterSet) obj12;
                                            Object[] objArr10 = mutableScatterSet5.elements;
                                            long[] jArr11 = mutableScatterSet5.metadata;
                                            int length4 = jArr11.length - 2;
                                            if (length4 >= 0) {
                                                int i20 = 0;
                                                while (true) {
                                                    long j4 = jArr11[i20];
                                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i21 = 8 - ((~(i20 - length4)) >>> 31);
                                                        for (int i22 = 0; i22 < i21; i22++) {
                                                            if ((j4 & 255) < 128) {
                                                                mutableScatterSet.add(objArr10[(i20 << 3) + i22]);
                                                                c5 = '\b';
                                                                z = true;
                                                            } else {
                                                                c5 = '\b';
                                                            }
                                                            j4 >>= c5;
                                                        }
                                                        if (i21 != 8) {
                                                            break;
                                                        }
                                                        if (i20 == length4) {
                                                            break;
                                                        }
                                                        i20++;
                                                    }
                                                }
                                            }
                                        } else {
                                            mutableScatterSet.add(obj12);
                                            z = true;
                                        }
                                    }
                                }
                            }
                            obj5 = scopeMap4.getMap().get(obj4);
                            if (obj5 != null) {
                            }
                        }
                    }
                    i9 = i4 + 1;
                    scopeMap7 = scopeMap3;
                    size = i3;
                    values = objArr3;
                    str5 = str3;
                    scopeMap8 = scopeMap4;
                    c7 = 7;
                    i7 = 2;
                }
            } else {
                ScopeMap<DerivedState<?>> scopeMap9 = scopeMap7;
                String str6 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
                Iterator it3 = changes.iterator();
                z = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (next instanceof StateObjectImpl) {
                        ReaderKind.Companion companion2 = ReaderKind.INSTANCE;
                        if (((StateObjectImpl) next).m10974isReadInh_f27i8$runtime_release(ReaderKind.m10962constructorimpl(2))) {
                            ScopeMap<DerivedState<?>> scopeMap10 = scopeMap9;
                            if (!scopeMap10.contains(next) || (obj2 = scopeMap10.getMap().get(next)) == null) {
                                it = it3;
                                obj = next;
                                map = map4;
                                scopeMap = scopeMap10;
                                str = str6;
                            } else if (obj2 instanceof MutableScatterSet) {
                                MutableScatterSet mutableScatterSet6 = (MutableScatterSet) obj2;
                                Object[] objArr11 = mutableScatterSet6.elements;
                                long[] jArr12 = mutableScatterSet6.metadata;
                                int length5 = jArr12.length - 2;
                                if (length5 >= 0) {
                                    int i23 = 0;
                                    while (true) {
                                        long j5 = jArr12[i23];
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i24 = 8 - ((~(i23 - length5)) >>> 31);
                                            int i25 = 0;
                                            while (i25 < i24) {
                                                if ((j5 & 255) < 128) {
                                                    DerivedState<?> derivedState3 = (DerivedState) objArr11[(i23 << 3) + i25];
                                                    str2 = str6;
                                                    Intrinsics.checkNotNull(derivedState3, str2);
                                                    it2 = it3;
                                                    Object obj13 = map4.get(derivedState3);
                                                    SnapshotMutationPolicy<?> policy3 = derivedState3.getPolicy();
                                                    if (policy3 == null) {
                                                        policy3 = SnapshotStateKt.structuralEqualityPolicy();
                                                    }
                                                    scopeMap2 = scopeMap10;
                                                    jArr2 = jArr12;
                                                    if (policy3.equivalent(derivedState3.getCurrentRecord().getCurrentValue(), obj13)) {
                                                        obj3 = next;
                                                        map3 = map4;
                                                        objArr2 = objArr11;
                                                        i2 = length5;
                                                        this.statesToReread.add(derivedState3);
                                                    } else {
                                                        Object obj14 = scopeMap8.getMap().get(derivedState3);
                                                        if (obj14 == null) {
                                                            obj3 = next;
                                                            map3 = map4;
                                                            objArr2 = objArr11;
                                                            i2 = length5;
                                                        } else if (obj14 instanceof MutableScatterSet) {
                                                            MutableScatterSet mutableScatterSet7 = (MutableScatterSet) obj14;
                                                            Object[] objArr12 = mutableScatterSet7.elements;
                                                            long[] jArr13 = mutableScatterSet7.metadata;
                                                            int length6 = jArr13.length - 2;
                                                            if (length6 >= 0) {
                                                                obj3 = next;
                                                                map3 = map4;
                                                                int i26 = 0;
                                                                while (true) {
                                                                    long j6 = jArr13[i26];
                                                                    objArr2 = objArr11;
                                                                    i2 = length5;
                                                                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i27 = 8 - ((~(i26 - length6)) >>> 31);
                                                                        int i28 = 0;
                                                                        while (i28 < i27) {
                                                                            if ((j6 & 255) < 128) {
                                                                                jArr4 = jArr13;
                                                                                mutableScatterSet.add(objArr12[(i26 << 3) + i28]);
                                                                                c3 = '\b';
                                                                                z = true;
                                                                            } else {
                                                                                jArr4 = jArr13;
                                                                                c3 = '\b';
                                                                            }
                                                                            j6 >>= c3;
                                                                            i28++;
                                                                            jArr13 = jArr4;
                                                                        }
                                                                        jArr3 = jArr13;
                                                                        if (i27 != 8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr3 = jArr13;
                                                                    }
                                                                    if (i26 == length6) {
                                                                        break;
                                                                    }
                                                                    i26++;
                                                                    objArr11 = objArr2;
                                                                    length5 = i2;
                                                                    jArr13 = jArr3;
                                                                }
                                                            }
                                                        } else {
                                                            obj3 = next;
                                                            map3 = map4;
                                                            objArr2 = objArr11;
                                                            i2 = length5;
                                                            mutableScatterSet.add(obj14);
                                                            z = true;
                                                        }
                                                    }
                                                } else {
                                                    it2 = it3;
                                                    obj3 = next;
                                                    map3 = map4;
                                                    scopeMap2 = scopeMap10;
                                                    jArr2 = jArr12;
                                                    objArr2 = objArr11;
                                                    i2 = length5;
                                                    str2 = str6;
                                                }
                                                j5 >>= 8;
                                                i25++;
                                                it3 = it2;
                                                str6 = str2;
                                                map4 = map3;
                                                scopeMap10 = scopeMap2;
                                                jArr12 = jArr2;
                                                next = obj3;
                                                objArr11 = objArr2;
                                                length5 = i2;
                                            }
                                            it = it3;
                                            obj = next;
                                            map2 = map4;
                                            scopeMap = scopeMap10;
                                            jArr = jArr12;
                                            objArr = objArr11;
                                            int i29 = length5;
                                            str = str6;
                                            if (i24 != 8) {
                                                break;
                                            }
                                            length5 = i29;
                                        } else {
                                            it = it3;
                                            obj = next;
                                            map2 = map4;
                                            scopeMap = scopeMap10;
                                            jArr = jArr12;
                                            objArr = objArr11;
                                            str = str6;
                                        }
                                        if (i23 == length5) {
                                            break;
                                        }
                                        i23++;
                                        it3 = it;
                                        str6 = str;
                                        map4 = map2;
                                        scopeMap10 = scopeMap;
                                        jArr12 = jArr;
                                        next = obj;
                                        objArr11 = objArr;
                                    }
                                } else {
                                    it = it3;
                                    obj = next;
                                    map2 = map4;
                                    scopeMap = scopeMap10;
                                    str = str6;
                                }
                                map = map2;
                            } else {
                                it = it3;
                                obj = next;
                                scopeMap = scopeMap10;
                                str = str6;
                                DerivedState<?> derivedState4 = (DerivedState) obj2;
                                map = map4;
                                Object obj15 = map.get(derivedState4);
                                SnapshotMutationPolicy<?> policy4 = derivedState4.getPolicy();
                                if (policy4 == null) {
                                    policy4 = SnapshotStateKt.structuralEqualityPolicy();
                                }
                                if (policy4.equivalent(derivedState4.getCurrentRecord().getCurrentValue(), obj15)) {
                                    this.statesToReread.add(derivedState4);
                                } else {
                                    Object obj16 = scopeMap8.getMap().get(derivedState4);
                                    if (obj16 != null) {
                                        if (obj16 instanceof MutableScatterSet) {
                                            MutableScatterSet mutableScatterSet8 = (MutableScatterSet) obj16;
                                            Object[] objArr13 = mutableScatterSet8.elements;
                                            long[] jArr14 = mutableScatterSet8.metadata;
                                            int length7 = jArr14.length - 2;
                                            if (length7 >= 0) {
                                                int i30 = 0;
                                                while (true) {
                                                    long j7 = jArr14[i30];
                                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i31 = 8 - ((~(i30 - length7)) >>> 31);
                                                        for (int i32 = 0; i32 < i31; i32++) {
                                                            if ((j7 & 255) < 128) {
                                                                mutableScatterSet.add(objArr13[(i30 << 3) + i32]);
                                                                c2 = '\b';
                                                                z = true;
                                                            } else {
                                                                c2 = '\b';
                                                            }
                                                            j7 >>= c2;
                                                        }
                                                        if (i31 != 8) {
                                                            break;
                                                        }
                                                        if (i30 == length7) {
                                                            break;
                                                        }
                                                        i30++;
                                                    }
                                                }
                                            }
                                        } else {
                                            mutableScatterSet.add(obj16);
                                            z = true;
                                        }
                                    }
                                }
                            }
                            Object obj17 = scopeMap8.getMap().get(obj);
                            if (obj17 != null) {
                                if (obj17 instanceof MutableScatterSet) {
                                    MutableScatterSet mutableScatterSet9 = (MutableScatterSet) obj17;
                                    Object[] objArr14 = mutableScatterSet9.elements;
                                    long[] jArr15 = mutableScatterSet9.metadata;
                                    int length8 = jArr15.length - 2;
                                    if (length8 >= 0) {
                                        while (true) {
                                            long j8 = jArr15[i];
                                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i33 = 8 - ((~(i - length8)) >>> 31);
                                                for (int i34 = 0; i34 < i33; i34++) {
                                                    if ((j8 & 255) < 128) {
                                                        mutableScatterSet.add(objArr14[(i << 3) + i34]);
                                                        c = '\b';
                                                        z = true;
                                                    } else {
                                                        c = '\b';
                                                    }
                                                    j8 >>= c;
                                                }
                                                if (i33 == 8) {
                                                    break;
                                                }
                                            }
                                            i = i != length8 ? i + 1 : 0;
                                        }
                                    }
                                } else {
                                    mutableScatterSet.add(obj17);
                                    z = true;
                                }
                            }
                        } else {
                            it = it3;
                            map = map4;
                            scopeMap = scopeMap9;
                            str = str6;
                        }
                    }
                    map4 = map;
                    str6 = str;
                    scopeMap9 = scopeMap;
                    it3 = it;
                }
            }
            if (this.statesToReread.isNotEmpty()) {
                MutableVector<DerivedState<?>> mutableVector = this.statesToReread;
                int size2 = mutableVector.getSize();
                if (size2 > 0) {
                    DerivedState<?>[] content = mutableVector.getContent();
                    while (true) {
                        rereadDerivedState(content[i8]);
                        int i35 = i8 + 1;
                        if (i35 >= size2) {
                            break;
                        }
                        i8 = i35;
                    }
                }
                this.statesToReread.clear();
            }
            return z;
        }

        public final void rereadDerivedState(@NotNull DerivedState<?> derivedState) {
            long[] jArr;
            long[] jArr2;
            int i;
            MutableObjectIntMap<Object> mutableObjectIntMap;
            MutableScatterMap<Object, MutableObjectIntMap<Object>> mutableScatterMap = this.scopeToValues;
            int id = SnapshotKt.currentSnapshot().getId();
            Object obj = this.valueToScopes.getMap().get(derivedState);
            if (obj == null) {
                return;
            }
            if (!(obj instanceof MutableScatterSet)) {
                MutableObjectIntMap<Object> mutableObjectIntMap2 = mutableScatterMap.get(obj);
                if (mutableObjectIntMap2 == null) {
                    mutableObjectIntMap2 = new MutableObjectIntMap<>(0, 1, null);
                    mutableScatterMap.set(obj, mutableObjectIntMap2);
                    Unit unit = Unit.INSTANCE;
                }
                recordRead(derivedState, id, obj, mutableObjectIntMap2);
                return;
            }
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr3 = mutableScatterSet.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            Object obj2 = objArr[(i2 << 3) + i5];
                            MutableObjectIntMap<Object> mutableObjectIntMap3 = mutableScatterMap.get(obj2);
                            jArr2 = jArr3;
                            if (mutableObjectIntMap3 == null) {
                                mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
                                mutableScatterMap.set(obj2, mutableObjectIntMap);
                                Unit unit2 = Unit.INSTANCE;
                            } else {
                                mutableObjectIntMap = mutableObjectIntMap3;
                            }
                            recordRead(derivedState, id, obj2, mutableObjectIntMap);
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i4 != i3) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    return;
                }
                i2++;
                jArr3 = jArr;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void notifyInvalidatedScopes() {
            MutableScatterSet<Object> mutableScatterSet = this.invalidated;
            Function1<Object, Unit> function1 = this.onChanged;
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
                                function1.invoke(objArr[(i << 3) + i3]);
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
            mutableScatterSet.clear();
        }
    }

    public final void clear(@NotNull Object obj) {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    mutableVector.getContent()[i2].clearScopeObservations(obj);
                    if (!r5.hasScopeObservations()) {
                        i++;
                    } else if (i > 0) {
                        mutableVector.getContent()[i2 - i] = mutableVector.getContent()[i2];
                    }
                }
                int i3 = size - i;
                ArraysKt___ArraysJvmKt.fill(mutableVector.getContent(), (Object) null, i3, size);
                mutableVector.setSize(i3);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clearIf(@NotNull Function1<Object, Boolean> predicate) {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    mutableVector.getContent()[i2].removeScopeIf(predicate);
                    if (!r5.hasScopeObservations()) {
                        i++;
                    } else if (i > 0) {
                        mutableVector.getContent()[i2 - i] = mutableVector.getContent()[i2];
                    }
                }
                int i3 = size - i;
                ArraysKt___ArraysJvmKt.fill(mutableVector.getContent(), (Object) null, i3, size);
                mutableVector.setSize(i3);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clear() {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    ObservedScopeMap[] content = mutableVector.getContent();
                    int i = 0;
                    do {
                        content[i].clear();
                        i++;
                    } while (i < size);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
