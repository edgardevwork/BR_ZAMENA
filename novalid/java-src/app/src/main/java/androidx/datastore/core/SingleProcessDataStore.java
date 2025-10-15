package androidx.datastore.core;

import androidx.annotation.GuardedBy;
import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.exifinterface.media.ExifInterface;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.p051io.CloseableKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.apache.http.HttpStatus;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SingleProcessDataStore.kt */
@Metadata(m7104d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 F*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0003FGHB\u007f\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012?\b\u0002\u0010\b\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n0\t\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u001f\u0010+\u001a\u00020\u00102\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010.J\u001f\u0010/\u001a\u00020\u00102\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0082@ø\u0001\u0000¢\u0006\u0002\u00102J\u0011\u00103\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0002\u00104J\u0011\u00105\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0002\u00104J\u0011\u00106\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0002\u00104J\u0011\u00107\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u00104J\u0011\u00108\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u00104JL\u00109\u001a\u00028\u000021\u0010:\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(;\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n2\u0006\u0010<\u001a\u00020=H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010>JD\u0010?\u001a\u00028\u000021\u0010:\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(;\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010@J\u001b\u0010A\u001a\u00020\u00102\u0006\u0010B\u001a\u00028\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\f\u0010E\u001a\u00020\u0010*\u00020\u0005H\u0002R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0!X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b#\u0010$R\u001b\u0010%\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'RJ\u0010*\u001a;\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n\u0018\u00010\tX\u0082\u000eø\u0001\u0000¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006I"}, m7105d2 = {"Landroidx/datastore/core/SingleProcessDataStore;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/DataStore;", "produceFile", "Lkotlin/Function0;", "Ljava/io/File;", "serializer", "Landroidx/datastore/core/Serializer;", "initTasksList", "", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/ParameterName;", "name", "api", "Lkotlin/coroutines/Continuation;", "", "", "corruptionHandler", "Landroidx/datastore/core/CorruptionHandler;", PomReader.SCOPE, "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlin/jvm/functions/Function0;Landroidx/datastore/core/Serializer;Ljava/util/List;Landroidx/datastore/core/CorruptionHandler;Lkotlinx/coroutines/CoroutineScope;)V", "SCRATCH_SUFFIX", "", "actor", "Landroidx/datastore/core/SimpleActor;", "Landroidx/datastore/core/SingleProcessDataStore$Message;", "data", "Lkotlinx/coroutines/flow/Flow;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "downstreamFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/datastore/core/State;", "getDownstreamFlow$annotations", "()V", PomReader.PomProfileElement.FILE, "getFile", "()Ljava/io/File;", "file$delegate", "Lkotlin/Lazy;", "initTasks", "handleRead", "read", "Landroidx/datastore/core/SingleProcessDataStore$Message$Read;", "(Landroidx/datastore/core/SingleProcessDataStore$Message$Read;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleUpdate", "update", "Landroidx/datastore/core/SingleProcessDataStore$Message$Update;", "(Landroidx/datastore/core/SingleProcessDataStore$Message$Update;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAndInit", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAndInitOrPropagateAndThrowFailure", "readAndInitOrPropagateFailure", "readData", "readDataOrHandleCorruption", "transformAndWrite", "transform", "t", "callerContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeData", "newData", "writeData$datastore_core", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createParentDirectories", "Companion", "Message", "UncloseableOutputStream", "datastore-core"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class SingleProcessDataStore<T> implements DataStore<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @GuardedBy("activeFilesLock")
    @NotNull
    public static final Set<String> activeFiles = new LinkedHashSet();

    @NotNull
    public static final Object activeFilesLock = new Object();

    @NotNull
    public final String SCRATCH_SUFFIX;

    @NotNull
    public final SimpleActor<Message<T>> actor;

    @NotNull
    public final CorruptionHandler<T> corruptionHandler;

    @NotNull
    public final Flow<T> data;

    @NotNull
    public final MutableStateFlow<State<T>> downstreamFlow;

    /* renamed from: file$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy org.apache.ivy.plugins.parser.m2.PomReader.PomProfileElement.FILE java.lang.String;

    @Nullable
    public List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasks;

    @NotNull
    public final Function0<File> produceFile;

    @NotNull
    public final CoroutineScope scope;

    @NotNull
    public final Serializer<T> serializer;

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.datastore.core.SingleProcessDataStore", m7120f = "SingleProcessDataStore.kt", m7121i = {1, 1}, m7122l = {276, 281, 284}, m7123m = "handleUpdate", m7124n = {"update", "$this$handleUpdate_u24lambda_u2d0"}, m7125s = {"L$0", "L$1"})
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$handleUpdate$1 */
    public static final class C24121 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24121(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C24121> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.handleUpdate(null, this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.datastore.core.SingleProcessDataStore", m7120f = "SingleProcessDataStore.kt", m7121i = {0, 0, 1, 1, 1, 2}, m7122l = {322, 348, 505}, m7123m = "readAndInit", m7124n = {"updateLock", "initData", "updateLock", "initData", "initializationComplete", "$this$withLock_u24default$iv"}, m7125s = {"L$1", "L$2", "L$1", "L$2", "L$3", "L$3"})
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$readAndInit$1 */
    public static final class C24131 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24131(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C24131> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInit(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.datastore.core.SingleProcessDataStore", m7120f = "SingleProcessDataStore.kt", m7121i = {0}, m7122l = {302}, m7123m = "readAndInitOrPropagateAndThrowFailure", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 */
    public static final class C24141 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24141(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C24141> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInitOrPropagateAndThrowFailure(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.datastore.core.SingleProcessDataStore", m7120f = "SingleProcessDataStore.kt", m7121i = {0}, m7122l = {311}, m7123m = "readAndInitOrPropagateFailure", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1 */
    public static final class C24151 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24151(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C24151> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInitOrPropagateFailure(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.datastore.core.SingleProcessDataStore", m7120f = "SingleProcessDataStore.kt", m7121i = {0}, m7122l = {381}, m7123m = "readData", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$readData$1 */
    public static final class C24161 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24161(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C24161> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readData(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.datastore.core.SingleProcessDataStore", m7120f = "SingleProcessDataStore.kt", m7121i = {0, 1, 2, 2}, m7122l = {359, 362, 365}, m7123m = "readDataOrHandleCorruption", m7124n = {"this", "ex", "ex", "newData"}, m7125s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1 */
    public static final class C24171 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24171(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C24171> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataOrHandleCorruption(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.datastore.core.SingleProcessDataStore", m7120f = "SingleProcessDataStore.kt", m7121i = {0, 0, 0}, m7122l = {402, HttpStatus.SC_GONE}, m7123m = "transformAndWrite", m7124n = {"this", "curDataAndHash", "curData"}, m7125s = {"L$0", "L$1", "L$2"})
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1 */
    public static final class C24181 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24181(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C24181> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.transformAndWrite(null, null, this);
        }
    }

    public static /* synthetic */ void getDownstreamFlow$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleProcessDataStore(@NotNull Function0<? extends File> produceFile, @NotNull Serializer<T> serializer, @NotNull List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasksList, @NotNull CorruptionHandler<T> corruptionHandler, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.produceFile = produceFile;
        this.serializer = serializer;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = FlowKt.flow(new SingleProcessDataStore$data$1(this, null));
        this.SCRATCH_SUFFIX = ".tmp";
        this.org.apache.ivy.plugins.parser.m2.PomReader.PomProfileElement.FILE java.lang.String = LazyKt__LazyJVMKt.lazy(new Function0<File>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$file$2
            public final /* synthetic */ SingleProcessDataStore<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final File invoke() {
                File file = (File) this.this$0.produceFile.invoke();
                String it = file.getAbsolutePath();
                SingleProcessDataStore.Companion companion = SingleProcessDataStore.INSTANCE;
                synchronized (companion.getActiveFilesLock$datastore_core()) {
                    if (!(!companion.getActiveFiles$datastore_core().contains(it))) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    Set<String> activeFiles$datastore_core = companion.getActiveFiles$datastore_core();
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    activeFiles$datastore_core.add(it);
                }
                return file;
            }
        });
        this.downstreamFlow = StateFlowKt.MutableStateFlow(UnInitialized.INSTANCE);
        this.initTasks = CollectionsKt___CollectionsKt.toList(initTasksList);
        this.actor = new SimpleActor<>(scope, new Function1<Throwable, Unit>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$actor$1
            public final /* synthetic */ SingleProcessDataStore<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                if (th != null) {
                    this.this$0.downstreamFlow.setValue(new Final(th));
                }
                SingleProcessDataStore.Companion companion = SingleProcessDataStore.INSTANCE;
                Object activeFilesLock$datastore_core = companion.getActiveFilesLock$datastore_core();
                SingleProcessDataStore<T> singleProcessDataStore = this.this$0;
                synchronized (activeFilesLock$datastore_core) {
                    companion.getActiveFiles$datastore_core().remove(singleProcessDataStore.getFile().getAbsolutePath());
                    Unit unit = Unit.INSTANCE;
                }
            }
        }, new Function2<Message<T>, Throwable, Unit>() { // from class: androidx.datastore.core.SingleProcessDataStore$actor$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th) {
                invoke((SingleProcessDataStore.Message) obj, th);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SingleProcessDataStore.Message<T> msg, @Nullable Throwable th) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (msg instanceof SingleProcessDataStore.Message.Update) {
                    CompletableDeferred<T> ack = ((SingleProcessDataStore.Message.Update) msg).getAck();
                    if (th == null) {
                        th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                    }
                    ack.completeExceptionally(th);
                }
            }
        }, new SingleProcessDataStore$actor$3(this, null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SingleProcessDataStore(Function0 function0, Serializer serializer, List list, CorruptionHandler corruptionHandler, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List listEmptyList = (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
        CorruptionHandler noOpCorruptionHandler = (i & 8) != 0 ? new NoOpCorruptionHandler() : corruptionHandler;
        if ((i & 16) != 0) {
            Dispatchers dispatchers = Dispatchers.INSTANCE;
            coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        }
        this(function0, serializer, listEmptyList, noOpCorruptionHandler, coroutineScope);
    }

    @Override // androidx.datastore.core.DataStore
    @NotNull
    public Flow<T> getData() {
        return this.data;
    }

    @Override // androidx.datastore.core.DataStore
    @Nullable
    public Object updateData(@NotNull Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.actor.offer(new Message.Update(function2, completableDeferredCompletableDeferred$default, this.downstreamFlow.getValue(), continuation.getContext()));
        return completableDeferredCompletableDeferred$default.await(continuation);
    }

    public final File getFile() {
        return (File) this.org.apache.ivy.plugins.parser.m2.PomReader.PomProfileElement.FILE java.lang.String.getValue();
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m7105d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Message;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "lastState", "Landroidx/datastore/core/State;", "getLastState", "()Landroidx/datastore/core/State;", "Read", "Update", "Landroidx/datastore/core/SingleProcessDataStore$Message$Read;", "Landroidx/datastore/core/SingleProcessDataStore$Message$Update;", "datastore-core"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* loaded from: classes.dex */
    public static abstract class Message<T> {
        public /* synthetic */ Message(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public abstract State<T> getLastState();

        public Message() {
        }

        /* compiled from: SingleProcessDataStore.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Message$Read;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/SingleProcessDataStore$Message;", "lastState", "Landroidx/datastore/core/State;", "(Landroidx/datastore/core/State;)V", "getLastState", "()Landroidx/datastore/core/State;", "datastore-core"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
        /* loaded from: classes3.dex */
        public static final class Read<T> extends Message<T> {

            @Nullable
            public final State<T> lastState;

            @Override // androidx.datastore.core.SingleProcessDataStore.Message
            @Nullable
            public State<T> getLastState() {
                return this.lastState;
            }

            public Read(@Nullable State<T> state) {
                super(null);
                this.lastState = state;
            }
        }

        /* compiled from: SingleProcessDataStore.kt */
        @Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002Ba\u00121\u0010\u0003\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016RA\u0010\u0003\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m7105d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Message$Update;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/SingleProcessDataStore$Message;", "transform", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "t", "Lkotlin/coroutines/Continuation;", "", "ack", "Lkotlinx/coroutines/CompletableDeferred;", "lastState", "Landroidx/datastore/core/State;", "callerContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/CompletableDeferred;Landroidx/datastore/core/State;Lkotlin/coroutines/CoroutineContext;)V", "getAck", "()Lkotlinx/coroutines/CompletableDeferred;", "getCallerContext", "()Lkotlin/coroutines/CoroutineContext;", "getLastState", "()Landroidx/datastore/core/State;", "getTransform", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "datastore-core"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
        /* loaded from: classes3.dex */
        public static final class Update<T> extends Message<T> {

            @NotNull
            public final CompletableDeferred<T> ack;

            @NotNull
            public final CoroutineContext callerContext;

            @Nullable
            public final State<T> lastState;

            @NotNull
            public final Function2<T, Continuation<? super T>, Object> transform;

            @NotNull
            public final Function2<T, Continuation<? super T>, Object> getTransform() {
                return this.transform;
            }

            @NotNull
            public final CompletableDeferred<T> getAck() {
                return this.ack;
            }

            @Override // androidx.datastore.core.SingleProcessDataStore.Message
            @Nullable
            public State<T> getLastState() {
                return this.lastState;
            }

            @NotNull
            public final CoroutineContext getCallerContext() {
                return this.callerContext;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Update(@NotNull Function2<? super T, ? super Continuation<? super T>, ? extends Object> transform, @NotNull CompletableDeferred<T> ack, @Nullable State<T> state, @NotNull CoroutineContext callerContext) {
                super(null);
                Intrinsics.checkNotNullParameter(transform, "transform");
                Intrinsics.checkNotNullParameter(ack, "ack");
                Intrinsics.checkNotNullParameter(callerContext, "callerContext");
                this.transform = transform;
                this.ack = ack;
                this.lastState = state;
                this.callerContext = callerContext;
            }
        }
    }

    public final Object handleRead(Message.Read<T> read, Continuation<? super Unit> continuation) throws Throwable {
        State<T> value = this.downstreamFlow.getValue();
        if (!(value instanceof Data)) {
            if (value instanceof ReadException) {
                if (value == read.getLastState()) {
                    Object andInitOrPropagateFailure = readAndInitOrPropagateFailure(continuation);
                    return andInitOrPropagateFailure == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? andInitOrPropagateFailure : Unit.INSTANCE;
                }
            } else {
                if (Intrinsics.areEqual(value, UnInitialized.INSTANCE)) {
                    Object andInitOrPropagateFailure2 = readAndInitOrPropagateFailure(continuation);
                    return andInitOrPropagateFailure2 == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? andInitOrPropagateFailure2 : Unit.INSTANCE;
                }
                if (value instanceof Final) {
                    throw new IllegalStateException("Can't read in final state.".toString());
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleUpdate(Message.Update<T> update, Continuation<? super Unit> continuation) throws Throwable {
        C24121 c24121;
        Object objM15699constructorimpl;
        ?? r9;
        CompletableDeferred<T> ack;
        State<T> value;
        SingleProcessDataStore singleProcessDataStore;
        Object objTransformAndWrite;
        Message.Update<T> update2;
        Message.Update<T> update3;
        if (continuation instanceof C24121) {
            c24121 = (C24121) continuation;
            int i = c24121.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24121.label = i - Integer.MIN_VALUE;
            } else {
                c24121 = new C24121(this, continuation);
            }
        }
        Object obj = c24121.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c24121.label;
        boolean z = true;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ack = update.getAck();
            try {
                Result.Companion companion = Result.INSTANCE;
                value = this.downstreamFlow.getValue();
            } catch (Throwable th2) {
                th = th2;
                update = ack;
                Result.Companion companion2 = Result.INSTANCE;
                objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
                r9 = update;
                CompletableDeferredKt.completeWith(r9, objM15699constructorimpl);
                return Unit.INSTANCE;
            }
            if (value instanceof Data) {
                Function2<T, Continuation<? super T>, Object> transform = update.getTransform();
                CoroutineContext callerContext = update.getCallerContext();
                c24121.L$0 = ack;
                c24121.label = 1;
                objTransformAndWrite = transformAndWrite(transform, callerContext, c24121);
                if (objTransformAndWrite == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Message.Update<T> update4 = ack;
                obj = objTransformAndWrite;
                update = update4;
                objM15699constructorimpl = Result.m15699constructorimpl(obj);
                r9 = update;
                CompletableDeferredKt.completeWith(r9, objM15699constructorimpl);
                return Unit.INSTANCE;
            }
            if (!(value instanceof ReadException)) {
                z = value instanceof UnInitialized;
            }
            if (z) {
                if (value == update.getLastState()) {
                    c24121.L$0 = update;
                    c24121.L$1 = this;
                    c24121.L$2 = ack;
                    c24121.label = 2;
                    if (readAndInitOrPropagateAndThrowFailure(c24121) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    singleProcessDataStore = this;
                    update2 = update;
                } else {
                    throw ((ReadException) value).getReadException();
                }
            } else {
                if (value instanceof Final) {
                    throw ((Final) value).getFinalException();
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i2 == 1) {
                update3 = (CompletableDeferred) c24121.L$0;
            } else if (i2 == 2) {
                CompletableDeferred<T> completableDeferred = (CompletableDeferred) c24121.L$2;
                singleProcessDataStore = (SingleProcessDataStore) c24121.L$1;
                Message.Update<T> update5 = (Message.Update) c24121.L$0;
                ResultKt.throwOnFailure(obj);
                ack = completableDeferred;
                update2 = update5;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                update3 = (Message.Update<T>) ((CompletableDeferred) c24121.L$0);
            }
            ResultKt.throwOnFailure(obj);
            update = update3;
            objM15699constructorimpl = Result.m15699constructorimpl(obj);
            r9 = update;
            CompletableDeferredKt.completeWith(r9, objM15699constructorimpl);
            return Unit.INSTANCE;
        }
        Function2<T, Continuation<? super T>, Object> transform2 = update2.getTransform();
        CoroutineContext callerContext2 = update2.getCallerContext();
        c24121.L$0 = ack;
        c24121.L$1 = null;
        c24121.L$2 = null;
        c24121.label = 3;
        objTransformAndWrite = singleProcessDataStore.transformAndWrite(transform2, callerContext2, c24121);
        if (objTransformAndWrite == coroutine_suspended) {
            return coroutine_suspended;
        }
        Message.Update<T> update42 = ack;
        obj = objTransformAndWrite;
        update = update42;
        objM15699constructorimpl = Result.m15699constructorimpl(obj);
        r9 = update;
        CompletableDeferredKt.completeWith(r9, objM15699constructorimpl);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAndInitOrPropagateAndThrowFailure(Continuation<? super Unit> continuation) throws Throwable {
        C24141 c24141;
        SingleProcessDataStore<T> singleProcessDataStore;
        if (continuation instanceof C24141) {
            c24141 = (C24141) continuation;
            int i = c24141.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24141.label = i - Integer.MIN_VALUE;
            } else {
                c24141 = new C24141(this, continuation);
            }
        }
        Object obj = c24141.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c24141.label;
        if (i2 != 0) {
            if (i2 == 1) {
                singleProcessDataStore = (SingleProcessDataStore) c24141.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                    throw th;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            c24141.L$0 = this;
            c24141.label = 1;
            if (readAndInit(c24141) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            singleProcessDataStore = this;
            singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAndInitOrPropagateFailure(Continuation<? super Unit> continuation) throws Throwable {
        C24151 c24151;
        SingleProcessDataStore<T> singleProcessDataStore;
        if (continuation instanceof C24151) {
            c24151 = (C24151) continuation;
            int i = c24151.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24151.label = i - Integer.MIN_VALUE;
            } else {
                c24151 = new C24151(this, continuation);
            }
        }
        Object obj = c24151.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c24151.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                c24151.L$0 = this;
                c24151.label = 1;
                if (readAndInit(c24151) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th) {
                th = th;
                singleProcessDataStore = this;
                singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                return Unit.INSTANCE;
            }
        } else if (i2 == 1) {
            singleProcessDataStore = (SingleProcessDataStore) c24151.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th2) {
                th = th2;
                singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                return Unit.INSTANCE;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAndInit(Continuation<? super Unit> continuation) throws Throwable {
        C24131 c24131;
        Mutex mutexMutex$default;
        Ref.ObjectRef objectRef;
        SingleProcessDataStore<T> singleProcessDataStore;
        Ref.ObjectRef objectRef2;
        SingleProcessDataStore<T> singleProcessDataStore2;
        Ref.ObjectRef objectRef3;
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1;
        Iterator<T> it;
        Mutex mutex;
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        C24131 c241312;
        SingleProcessDataStore<T> singleProcessDataStore3;
        Ref.ObjectRef objectRef4;
        Mutex mutex2;
        if (continuation instanceof C24131) {
            c24131 = (C24131) continuation;
            int i = c24131.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24131.label = i - Integer.MIN_VALUE;
            } else {
                c24131 = new C24131(this, continuation);
            }
        }
        T t = (T) c24131.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c24131.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(t);
            if (!(Intrinsics.areEqual(this.downstreamFlow.getValue(), UnInitialized.INSTANCE) || (this.downstreamFlow.getValue() instanceof ReadException))) {
                throw new IllegalStateException("Check failed.".toString());
            }
            mutexMutex$default = MutexKt.Mutex$default(false, 1, null);
            objectRef = new Ref.ObjectRef();
            c24131.L$0 = this;
            c24131.L$1 = mutexMutex$default;
            c24131.L$2 = objectRef;
            c24131.L$3 = objectRef;
            c24131.label = 1;
            t = (T) readDataOrHandleCorruption(c24131);
            if (t == coroutine_suspended) {
                return coroutine_suspended;
            }
            singleProcessDataStore = this;
            objectRef2 = objectRef;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        mutex2 = (Mutex) c24131.L$3;
                        booleanRef2 = (Ref.BooleanRef) c24131.L$2;
                        objectRef4 = (Ref.ObjectRef) c24131.L$1;
                        singleProcessDataStore3 = (SingleProcessDataStore) c24131.L$0;
                        ResultKt.throwOnFailure(t);
                        try {
                            booleanRef2.element = true;
                            Unit unit = Unit.INSTANCE;
                            mutex2.unlock(null);
                            MutableStateFlow<State<T>> mutableStateFlow = singleProcessDataStore3.downstreamFlow;
                            T t2 = objectRef4.element;
                            mutableStateFlow.setValue(new Data(t2, t2 != null ? t2.hashCode() : 0));
                            return unit;
                        } catch (Throwable th) {
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) c24131.L$5;
                singleProcessDataStore$readAndInit$api$1 = (SingleProcessDataStore$readAndInit$api$1) c24131.L$4;
                booleanRef = (Ref.BooleanRef) c24131.L$3;
                objectRef3 = (Ref.ObjectRef) c24131.L$2;
                mutex = (Mutex) c24131.L$1;
                singleProcessDataStore2 = (SingleProcessDataStore) c24131.L$0;
                ResultKt.throwOnFailure(t);
                while (it.hasNext()) {
                    Function2 function2 = (Function2) it.next();
                    c24131.L$0 = singleProcessDataStore2;
                    c24131.L$1 = mutex;
                    c24131.L$2 = objectRef3;
                    c24131.L$3 = booleanRef;
                    c24131.L$4 = singleProcessDataStore$readAndInit$api$1;
                    c24131.L$5 = it;
                    c24131.label = 2;
                    if (function2.invoke(singleProcessDataStore$readAndInit$api$1, c24131) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                c241312 = c24131;
                booleanRef2 = booleanRef;
                objectRef2 = objectRef3;
                mutexMutex$default = mutex;
                singleProcessDataStore3 = singleProcessDataStore2;
                singleProcessDataStore3.initTasks = null;
                c241312.L$0 = singleProcessDataStore3;
                c241312.L$1 = objectRef2;
                c241312.L$2 = booleanRef2;
                c241312.L$3 = mutexMutex$default;
                c241312.L$4 = null;
                c241312.L$5 = null;
                c241312.label = 3;
                if (mutexMutex$default.lock(null, c241312) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef4 = objectRef2;
                mutex2 = mutexMutex$default;
                booleanRef2.element = true;
                Unit unit2 = Unit.INSTANCE;
                mutex2.unlock(null);
                MutableStateFlow<State<T>> mutableStateFlow2 = singleProcessDataStore3.downstreamFlow;
                T t22 = objectRef4.element;
                mutableStateFlow2.setValue(new Data(t22, t22 != null ? t22.hashCode() : 0));
                return unit2;
            }
            objectRef = (Ref.ObjectRef) c24131.L$3;
            objectRef2 = (Ref.ObjectRef) c24131.L$2;
            mutexMutex$default = (Mutex) c24131.L$1;
            singleProcessDataStore = (SingleProcessDataStore) c24131.L$0;
            ResultKt.throwOnFailure(t);
        }
        objectRef.element = t;
        Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$12 = new SingleProcessDataStore$readAndInit$api$1(mutexMutex$default, booleanRef3, objectRef2, singleProcessDataStore);
        List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> list = singleProcessDataStore.initTasks;
        if (list == null) {
            booleanRef2 = booleanRef3;
            c241312 = c24131;
            singleProcessDataStore3 = singleProcessDataStore;
            singleProcessDataStore3.initTasks = null;
            c241312.L$0 = singleProcessDataStore3;
            c241312.L$1 = objectRef2;
            c241312.L$2 = booleanRef2;
            c241312.L$3 = mutexMutex$default;
            c241312.L$4 = null;
            c241312.L$5 = null;
            c241312.label = 3;
            if (mutexMutex$default.lock(null, c241312) == coroutine_suspended) {
            }
        } else {
            singleProcessDataStore2 = singleProcessDataStore;
            objectRef3 = objectRef2;
            singleProcessDataStore$readAndInit$api$1 = singleProcessDataStore$readAndInit$api$12;
            it = list.iterator();
            mutex = mutexMutex$default;
            booleanRef = booleanRef3;
            while (it.hasNext()) {
            }
            c241312 = c24131;
            booleanRef2 = booleanRef;
            objectRef2 = objectRef3;
            mutexMutex$default = mutex;
            singleProcessDataStore3 = singleProcessDataStore2;
            singleProcessDataStore3.initTasks = null;
            c241312.L$0 = singleProcessDataStore3;
            c241312.L$1 = objectRef2;
            c241312.L$2 = booleanRef2;
            c241312.L$3 = mutexMutex$default;
            c241312.L$4 = null;
            c241312.L$5 = null;
            c241312.label = 3;
            if (mutexMutex$default.lock(null, c241312) == coroutine_suspended) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readDataOrHandleCorruption(Continuation<? super T> continuation) throws Throwable {
        C24171 c24171;
        SingleProcessDataStore singleProcessDataStore;
        Object objHandleCorruption;
        CorruptionException corruptionException;
        SingleProcessDataStore singleProcessDataStore2;
        CorruptionException corruptionException2;
        if (continuation instanceof C24171) {
            c24171 = (C24171) continuation;
            int i = c24171.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24171.label = i - Integer.MIN_VALUE;
            } else {
                c24171 = new C24171(this, continuation);
            }
        }
        Object data = c24171.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c24171.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(data);
            try {
                c24171.L$0 = this;
                c24171.label = 1;
                data = readData(c24171);
                return data == coroutine_suspended ? coroutine_suspended : data;
            } catch (CorruptionException e) {
                e = e;
                singleProcessDataStore = this;
                CorruptionHandler<T> corruptionHandler = singleProcessDataStore.corruptionHandler;
                c24171.L$0 = singleProcessDataStore;
                c24171.L$1 = e;
                c24171.label = 2;
                objHandleCorruption = corruptionHandler.handleCorruption(e, c24171);
                if (objHandleCorruption != coroutine_suspended) {
                }
            }
        } else if (i2 == 1) {
            singleProcessDataStore = (SingleProcessDataStore) c24171.L$0;
            try {
                ResultKt.throwOnFailure(data);
            } catch (CorruptionException e2) {
                e = e2;
                CorruptionHandler<T> corruptionHandler2 = singleProcessDataStore.corruptionHandler;
                c24171.L$0 = singleProcessDataStore;
                c24171.L$1 = e;
                c24171.label = 2;
                objHandleCorruption = corruptionHandler2.handleCorruption(e, c24171);
                if (objHandleCorruption != coroutine_suspended) {
                    return coroutine_suspended;
                }
                SingleProcessDataStore singleProcessDataStore3 = singleProcessDataStore;
                corruptionException = e;
                data = objHandleCorruption;
                singleProcessDataStore2 = singleProcessDataStore3;
                c24171.L$0 = corruptionException;
                c24171.L$1 = data;
                c24171.label = 3;
                if (singleProcessDataStore2.writeData$datastore_core(data, c24171) != coroutine_suspended) {
                }
            }
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    Object obj = c24171.L$1;
                    corruptionException2 = (CorruptionException) c24171.L$0;
                    try {
                        ResultKt.throwOnFailure(data);
                        return obj;
                    } catch (IOException e3) {
                        e = e3;
                        ExceptionsKt__ExceptionsKt.addSuppressed(corruptionException2, e);
                        throw corruptionException2;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            corruptionException = (CorruptionException) c24171.L$1;
            SingleProcessDataStore singleProcessDataStore4 = (SingleProcessDataStore) c24171.L$0;
            ResultKt.throwOnFailure(data);
            singleProcessDataStore2 = singleProcessDataStore4;
        }
        try {
            c24171.L$0 = corruptionException;
            c24171.L$1 = data;
            c24171.label = 3;
            return singleProcessDataStore2.writeData$datastore_core(data, c24171) != coroutine_suspended ? coroutine_suspended : data;
        } catch (IOException e4) {
            e = e4;
            corruptionException2 = corruptionException;
            ExceptionsKt__ExceptionsKt.addSuppressed(corruptionException2, e);
            throw corruptionException2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.SingleProcessDataStore$readData$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.datastore.core.Serializer, androidx.datastore.core.Serializer<T>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readData(Continuation<? super T> continuation) throws Throwable {
        ?? c24161;
        ?? fileInputStream;
        Throwable th;
        Closeable closeable;
        if (continuation instanceof C24161) {
            C24161 c241612 = (C24161) continuation;
            int i = c241612.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c241612.label = i - Integer.MIN_VALUE;
                c24161 = c241612;
            } else {
                c24161 = new C24161(this, continuation);
            }
        }
        Object from = c24161.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c24161.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) c24161.L$2;
                fileInputStream = (Closeable) c24161.L$1;
                c24161 = (SingleProcessDataStore) c24161.L$0;
                try {
                    ResultKt.throwOnFailure(from);
                    closeable = fileInputStream;
                    return from;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } finally {
                        CloseableKt.closeFinally(fileInputStream, th);
                    }
                }
            }
            ResultKt.throwOnFailure(from);
            try {
                fileInputStream = new FileInputStream(getFile());
                try {
                    Serializer<T> serializer = this.serializer;
                    c24161.L$0 = this;
                    c24161.L$1 = fileInputStream;
                    c24161.L$2 = null;
                    c24161.label = 1;
                    from = serializer.readFrom(fileInputStream, c24161);
                    if (from == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    th = null;
                    closeable = fileInputStream;
                    return from;
                } catch (Throwable th3) {
                    th = th3;
                    c24161 = this;
                    throw th;
                }
            } catch (FileNotFoundException e) {
                e = e;
                c24161 = this;
                if (c24161.getFile().exists()) {
                    throw e;
                }
                return c24161.serializer.getDefaultValue();
            }
        } catch (FileNotFoundException e2) {
            e = e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transformAndWrite(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, CoroutineContext coroutineContext, Continuation<? super T> continuation) throws Throwable {
        C24181 c24181;
        Data data;
        Object obj;
        SingleProcessDataStore singleProcessDataStore;
        SingleProcessDataStore singleProcessDataStore2;
        if (continuation instanceof C24181) {
            c24181 = (C24181) continuation;
            int i = c24181.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24181.label = i - Integer.MIN_VALUE;
            } else {
                c24181 = new C24181(this, continuation);
            }
        }
        Object obj2 = c24181.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c24181.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            Data data2 = (Data) this.downstreamFlow.getValue();
            data2.checkHashCode();
            Object value = data2.getValue();
            SingleProcessDataStore$transformAndWrite$newData$1 singleProcessDataStore$transformAndWrite$newData$1 = new SingleProcessDataStore$transformAndWrite$newData$1(function2, value, null);
            c24181.L$0 = this;
            c24181.L$1 = data2;
            c24181.L$2 = value;
            c24181.label = 1;
            Object objWithContext = BuildersKt.withContext(coroutineContext, singleProcessDataStore$transformAndWrite$newData$1, c24181);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            data = data2;
            obj2 = objWithContext;
            obj = value;
            singleProcessDataStore = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = c24181.L$1;
                singleProcessDataStore2 = (SingleProcessDataStore) c24181.L$0;
                ResultKt.throwOnFailure(obj2);
                singleProcessDataStore2.downstreamFlow.setValue(new Data(obj, obj == null ? obj.hashCode() : 0));
                return obj;
            }
            obj = c24181.L$2;
            data = (Data) c24181.L$1;
            SingleProcessDataStore singleProcessDataStore3 = (SingleProcessDataStore) c24181.L$0;
            ResultKt.throwOnFailure(obj2);
            singleProcessDataStore = singleProcessDataStore3;
        }
        data.checkHashCode();
        if (!Intrinsics.areEqual(obj, obj2)) {
            c24181.L$0 = singleProcessDataStore;
            c24181.L$1 = obj2;
            c24181.L$2 = null;
            c24181.label = 2;
            if (singleProcessDataStore.writeData$datastore_core(obj2, c24181) == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = obj2;
            singleProcessDataStore2 = singleProcessDataStore;
            singleProcessDataStore2.downstreamFlow.setValue(new Data(obj, obj == null ? obj.hashCode() : 0));
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ce  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.StringBuilder] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeData$datastore_core(T t, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        SingleProcessDataStore$writeData$1 singleProcessDataStore$writeData$1;
        File file;
        ?? fileOutputStream;
        SingleProcessDataStore<T> singleProcessDataStore;
        FileOutputStream fileOutputStream2;
        Throwable th;
        if (continuation instanceof SingleProcessDataStore$writeData$1) {
            singleProcessDataStore$writeData$1 = (SingleProcessDataStore$writeData$1) continuation;
            int i = singleProcessDataStore$writeData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$writeData$1.label = i - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$writeData$1 = new SingleProcessDataStore$writeData$1(this, continuation);
            }
        }
        Object obj = singleProcessDataStore$writeData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = singleProcessDataStore$writeData$1.label;
        ?? r3 = 1;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                createParentDirectories(getFile());
                file = new File(Intrinsics.stringPlus(getFile().getAbsolutePath(), this.SCRATCH_SUFFIX));
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        Serializer<T> serializer = this.serializer;
                        UncloseableOutputStream uncloseableOutputStream = new UncloseableOutputStream(fileOutputStream);
                        singleProcessDataStore$writeData$1.L$0 = this;
                        singleProcessDataStore$writeData$1.L$1 = file;
                        singleProcessDataStore$writeData$1.L$2 = fileOutputStream;
                        singleProcessDataStore$writeData$1.L$3 = null;
                        singleProcessDataStore$writeData$1.L$4 = fileOutputStream;
                        singleProcessDataStore$writeData$1.label = 1;
                        if (serializer.writeTo(t, uncloseableOutputStream, singleProcessDataStore$writeData$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        singleProcessDataStore = this;
                        r3 = file;
                        fileOutputStream2 = fileOutputStream;
                        th = null;
                        fileOutputStream = fileOutputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        r3 = file;
                        throw th;
                    }
                } catch (IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
            } else if (i2 == 1) {
                fileOutputStream2 = (FileOutputStream) singleProcessDataStore$writeData$1.L$4;
                th = (Throwable) singleProcessDataStore$writeData$1.L$3;
                fileOutputStream = (Closeable) singleProcessDataStore$writeData$1.L$2;
                r3 = (File) singleProcessDataStore$writeData$1.L$1;
                singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$writeData$1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    fileOutputStream = fileOutputStream;
                    r3 = r3;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(fileOutputStream, th);
                        throw th4;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream2.getFD().sync();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, th);
            if (r3.renameTo(singleProcessDataStore.getFile())) {
                return unit;
            }
            throw new IOException("Unable to rename " + r3 + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
        } catch (IOException e2) {
            e = e2;
            file = r3;
            if (file.exists()) {
            }
            throw e;
        }
    }

    public final void createParentDirectories(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(Intrinsics.stringPlus("Unable to create parent directories of ", file));
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\n\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m7105d2 = {"Landroidx/datastore/core/SingleProcessDataStore$UncloseableOutputStream;", "Ljava/io/OutputStream;", "fileOutputStream", "Ljava/io/FileOutputStream;", "(Ljava/io/FileOutputStream;)V", "getFileOutputStream", "()Ljava/io/FileOutputStream;", "close", "", "flush", "write", "b", "", "bytes", "off", "", "len", "datastore-core"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* loaded from: classes.dex */
    public static final class UncloseableOutputStream extends OutputStream {

        @NotNull
        public final FileOutputStream fileOutputStream;

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public UncloseableOutputStream(@NotNull FileOutputStream fileOutputStream) {
            Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
            this.fileOutputStream = fileOutputStream;
        }

        @NotNull
        public final FileOutputStream getFileOutputStream() {
            return this.fileOutputStream;
        }

        @Override // java.io.OutputStream
        public void write(int b) throws IOException {
            this.fileOutputStream.write(b);
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] b) throws IOException {
            Intrinsics.checkNotNullParameter(b, "b");
            this.fileOutputStream.write(b);
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] bytes, int off, int len) throws IOException {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            this.fileOutputStream.write(bytes, off, len);
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.fileOutputStream.flush();
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m7105d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Companion;", "", "()V", "activeFiles", "", "", "getActiveFiles$datastore_core", "()Ljava/util/Set;", "activeFilesLock", "getActiveFilesLock$datastore_core", "()Ljava/lang/Object;", "datastore-core"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final Set<String> getActiveFiles$datastore_core() {
            return SingleProcessDataStore.activeFiles;
        }

        @NotNull
        public final Object getActiveFilesLock$datastore_core() {
            return SingleProcessDataStore.activeFilesLock;
        }
    }
}
