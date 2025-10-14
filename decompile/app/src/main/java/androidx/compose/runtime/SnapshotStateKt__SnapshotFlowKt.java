package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SnapshotFlow.kt */
@Metadata(m7104d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0000\u0010\u0002*\u0002H\u0007\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\b\u001a\u0002H\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\r\u001a%\u0010\u000e\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0002\b\u0014¨\u0006\u0015"}, m7105d2 = {"snapshotFlow", "Lkotlinx/coroutines/flow/Flow;", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function0;", "collectAsState", "Landroidx/compose/runtime/State;", "R", "initial", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Lkotlinx/coroutines/flow/StateFlow;", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "intersects", "", "Landroidx/collection/MutableScatterSet;", "", "set", "", "intersects$SnapshotStateKt__SnapshotFlowKt", "runtime_release"}, m7106k = 5, m7107mv = {1, 8, 0}, m7109xi = 48, m7110xs = "androidx/compose/runtime/SnapshotStateKt")
@SourceDebugExtension({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,181:1\n296#2,2:182\n267#2,4:184\n237#2,7:188\n248#2,3:196\n251#2,2:200\n272#2:202\n298#2,2:203\n273#2:205\n254#2,6:206\n274#2:212\n300#2:213\n1810#3:195\n1672#3:199\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n*L\n180#1:182,2\n180#1:184,4\n180#1:188,7\n180#1:196,3\n180#1:200,2\n180#1:202\n180#1:203,2\n180#1:205\n180#1:206,6\n180#1:212\n180#1:213\n180#1:195\n180#1:199\n*E\n"})
/* loaded from: classes.dex */
public final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {
    @Composable
    @NotNull
    public static final <T> State<T> collectAsState(@NotNull StateFlow<? extends T> stateFlow, @Nullable CoroutineContext coroutineContext, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1439883919);
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1439883919, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:46)");
        }
        State<T> stateCollectAsState = SnapshotStateKt.collectAsState(stateFlow, stateFlow.getValue(), coroutineContext2, composer, 520, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateCollectAsState;
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SnapshotFlow.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u0002H\u0003\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "Landroidx/compose/runtime/ProduceStateScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", m7120f = "SnapshotFlow.kt", m7121i = {}, m7122l = {64, 65}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1 */
    /* loaded from: classes2.dex */
    public static final class C17821<R> extends SuspendLambda implements Function2<ProduceStateScope<R>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ CoroutineContext $context;
        public final /* synthetic */ Flow<T> $this_collectAsState;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C17821(CoroutineContext coroutineContext, Flow<? extends T> flow, Continuation<? super C17821> continuation) {
            super(2, continuation);
            this.$context = coroutineContext;
            this.$this_collectAsState = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C17821 c17821 = new C17821(this.$context, this.$this_collectAsState, continuation);
            c17821.L$0 = obj;
            return c17821;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ProduceStateScope<R> produceStateScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C17821) create(produceStateScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                if (Intrinsics.areEqual(this.$context, EmptyCoroutineContext.INSTANCE)) {
                    Flow<T> flow = this.$this_collectAsState;
                    FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
                            produceStateScope.setValue(t);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flow.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    CoroutineContext coroutineContext = this.$context;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_collectAsState, produceStateScope, null);
                    this.label = 2;
                    if (BuildersKt.withContext(coroutineContext, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: SnapshotFlow.kt */
        @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u0002H\u0003\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", m7120f = "SnapshotFlow.kt", m7121i = {}, m7122l = {66}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ ProduceStateScope<R> $$this$produceState;
            public final /* synthetic */ Flow<T> $this_collectAsState;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(Flow<? extends T> flow, ProduceStateScope<R> produceStateScope, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$this_collectAsState = flow;
                this.$$this$produceState = produceStateScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.$this_collectAsState, this.$$this$produceState, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<T> flow = this.$this_collectAsState;
                    final ProduceStateScope<R> produceStateScope = this.$$this$produceState;
                    FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState.1.2.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
                            produceStateScope.setValue(t);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flow.collect(flowCollector, this) == coroutine_suspended) {
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

    @Composable
    @NotNull
    public static final <T extends R, R> State<R> collectAsState(@NotNull Flow<? extends T> flow, R r, @Nullable CoroutineContext coroutineContext, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-606625098);
        if ((i2 & 2) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-606625098, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:61)");
        }
        int i3 = i >> 3;
        State<R> stateProduceState = SnapshotStateKt.produceState(r, flow, coroutineContext2, new C17821(coroutineContext2, flow, null), composer, (i3 & 8) | 4672 | (i3 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateProduceState;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SnapshotFlow.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", m7120f = "SnapshotFlow.kt", m7121i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, m7122l = {Cea708Decoder.COMMAND_SPA, TarConstants.CHKSUM_OFFSET, 170}, m7123m = "invokeSuspend", m7124n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    @SourceDebugExtension({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,181:1\n129#2,5:182\n129#2,5:187\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n*L\n139#1:182,5\n162#1:187,5\n*E\n"})
    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 */
    /* loaded from: classes2.dex */
    public static final class C17831<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function0<T> $block;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C17831(Function0<? extends T> function0, Continuation<? super C17831> continuation) {
            super(2, continuation);
            this.$block = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C17831 c17831 = new C17831(this.$block, continuation);
            c17831.L$0 = obj;
            return c17831;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super T> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((C17831) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:34:0x00e1, B:38:0x00ea], limit reached: 76 */
        /* JADX WARN: Path cross not found for [B:42:0x00f9, B:58:0x0138], limit reached: 76 */
        /* JADX WARN: Path cross not found for [B:58:0x0138, B:42:0x00f9], limit reached: 76 */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00d5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00f9 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:32:0x00dd, B:34:0x00e1, B:39:0x00eb, B:42:0x00f9, B:46:0x010f, B:48:0x0118, B:56:0x0134, B:57:0x0137, B:15:0x0050, B:43:0x0104, B:45:0x010c, B:54:0x0130, B:55:0x0133), top: B:71:0x0050, inners: #2 }] */
        /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r10v14 */
        /* JADX WARN: Type inference failed for: r10v15 */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v5 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ObserverHandle observerHandleRegisterApplyObserver;
            ?? r10;
            final MutableScatterSet mutableScatterSet;
            Function1<Object, Unit> function1;
            final Channel channelChannel$default;
            Object objInvoke;
            ObserverHandle observerHandle;
            ?? r11;
            MutableScatterSet mutableScatterSet2;
            Function1<Object, Unit> function12;
            Channel channel;
            Object obj2;
            int i;
            Set set;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        objInvoke = this.L$5;
                        observerHandleRegisterApplyObserver = (ObserverHandle) this.L$4;
                        channelChannel$default = (Channel) this.L$3;
                        function1 = (Function1) this.L$2;
                        mutableScatterSet = (MutableScatterSet) this.L$1;
                        r10 = (FlowCollector) this.L$0;
                    } else if (i2 == 2) {
                        i = this.I$0;
                        obj2 = this.L$5;
                        observerHandle = (ObserverHandle) this.L$4;
                        channel = (Channel) this.L$3;
                        function12 = (Function1) this.L$2;
                        mutableScatterSet2 = (MutableScatterSet) this.L$1;
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            r11 = flowCollector;
                            set = (Set) obj;
                            do {
                                i = (i == 0 || SnapshotStateKt__SnapshotFlowKt.intersects$SnapshotStateKt__SnapshotFlowKt(mutableScatterSet2, set)) ? 1 : 0;
                                set = (Set) ChannelResult.m17216getOrNullimpl(channel.mo17206tryReceivePtdJZtk());
                            } while (set != null);
                            if (i != 0) {
                                mutableScatterSet2.clear();
                                Snapshot snapshotTakeSnapshot = Snapshot.INSTANCE.takeSnapshot(function12);
                                Function0<T> function0 = this.$block;
                                try {
                                    try {
                                        objInvoke = function0.invoke();
                                        snapshotTakeSnapshot.dispose();
                                        if (!Intrinsics.areEqual(objInvoke, obj2)) {
                                            this.L$0 = r11;
                                            this.L$1 = mutableScatterSet2;
                                            this.L$2 = function12;
                                            this.L$3 = channel;
                                            this.L$4 = observerHandle;
                                            this.L$5 = objInvoke;
                                            this.label = 3;
                                            if (r11.emit(objInvoke, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            observerHandleRegisterApplyObserver = observerHandle;
                                            channelChannel$default = channel;
                                            function1 = function12;
                                            mutableScatterSet = mutableScatterSet2;
                                            r10 = r11;
                                        }
                                    } finally {
                                    }
                                    Snapshot snapshotMakeCurrent = snapshotTakeSnapshot.makeCurrent();
                                } finally {
                                }
                            }
                            objInvoke = obj2;
                            observerHandleRegisterApplyObserver = observerHandle;
                            channelChannel$default = channel;
                            function1 = function12;
                            mutableScatterSet = mutableScatterSet2;
                            r10 = r11;
                        } catch (Throwable th) {
                            th = th;
                            observerHandleRegisterApplyObserver = observerHandle;
                            observerHandleRegisterApplyObserver.dispose();
                            throw th;
                        }
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        objInvoke = this.L$5;
                        observerHandleRegisterApplyObserver = (ObserverHandle) this.L$4;
                        channelChannel$default = (Channel) this.L$3;
                        function1 = (Function1) this.L$2;
                        mutableScatterSet = (MutableScatterSet) this.L$1;
                        r10 = (FlowCollector) this.L$0;
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    r10 = (FlowCollector) this.L$0;
                    mutableScatterSet = new MutableScatterSet(0, 1, null);
                    function1 = new Function1<Object, Unit>() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Object obj3) {
                            invoke2(obj3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Object obj3) {
                            if (obj3 instanceof StateObjectImpl) {
                                ReaderKind.Companion companion = ReaderKind.INSTANCE;
                                ((StateObjectImpl) obj3).m10975recordReadInh_f27i8$runtime_release(ReaderKind.m10962constructorimpl(4));
                            }
                            mutableScatterSet.add(obj3);
                        }
                    };
                    channelChannel$default = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    observerHandleRegisterApplyObserver = companion.registerApplyObserver(new Function2<Set<? extends Object>, Snapshot, Unit>() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set2, Snapshot snapshot) {
                            invoke2(set2, snapshot);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Set<? extends Object> set2, @NotNull Snapshot snapshot) {
                            Set<? extends Object> set3 = set2;
                            if ((set3 instanceof Collection) && set3.isEmpty()) {
                                return;
                            }
                            for (Object obj3 : set3) {
                                if (obj3 instanceof StateObjectImpl) {
                                    ReaderKind.Companion companion2 = ReaderKind.INSTANCE;
                                    if (((StateObjectImpl) obj3).m10974isReadInh_f27i8$runtime_release(ReaderKind.m10962constructorimpl(4))) {
                                    }
                                }
                                channelChannel$default.mo17201trySendJP2dKIU(set2);
                                return;
                            }
                        }
                    });
                    Snapshot snapshotTakeSnapshot2 = companion.takeSnapshot(function1);
                    Function0<T> function02 = this.$block;
                    try {
                        Snapshot snapshotMakeCurrent2 = snapshotTakeSnapshot2.makeCurrent();
                        try {
                            objInvoke = function02.invoke();
                            snapshotTakeSnapshot2.dispose();
                            this.L$0 = r10;
                            this.L$1 = mutableScatterSet;
                            this.L$2 = function1;
                            this.L$3 = channelChannel$default;
                            this.L$4 = observerHandleRegisterApplyObserver;
                            this.L$5 = objInvoke;
                            this.label = 1;
                            if (r10.emit(objInvoke, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } finally {
                        }
                    } finally {
                    }
                }
                this.L$0 = r10;
                this.L$1 = mutableScatterSet;
                this.L$2 = function1;
                this.L$3 = channelChannel$default;
                this.L$4 = observerHandleRegisterApplyObserver;
                this.L$5 = objInvoke;
                this.I$0 = 0;
                this.label = 2;
                obj = channelChannel$default.receive(this);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                r11 = r10;
                mutableScatterSet2 = mutableScatterSet;
                function12 = function1;
                channel = channelChannel$default;
                observerHandle = observerHandleRegisterApplyObserver;
                obj2 = objInvoke;
                i = 0;
                set = (Set) obj;
                do {
                    if (i == 0) {
                    }
                    set = (Set) ChannelResult.m17216getOrNullimpl(channel.mo17206tryReceivePtdJZtk());
                } while (set != null);
                if (i != 0) {
                }
                objInvoke = obj2;
                observerHandleRegisterApplyObserver = observerHandle;
                channelChannel$default = channel;
                function1 = function12;
                mutableScatterSet = mutableScatterSet2;
                r10 = r11;
                this.L$0 = r10;
                this.L$1 = mutableScatterSet;
                this.L$2 = function1;
                this.L$3 = channelChannel$default;
                this.L$4 = observerHandleRegisterApplyObserver;
                this.L$5 = objInvoke;
                this.I$0 = 0;
                this.label = 2;
                obj = channelChannel$default.receive(this);
                if (obj != coroutine_suspended) {
                }
            } catch (Throwable th2) {
                th = th2;
                observerHandleRegisterApplyObserver.dispose();
                throw th;
            }
        }
    }

    @NotNull
    public static final <T> Flow<T> snapshotFlow(@NotNull Function0<? extends T> function0) {
        return FlowKt.flow(new C17831(function0, null));
    }

    public static final boolean intersects$SnapshotStateKt__SnapshotFlowKt(MutableScatterSet<Object> mutableScatterSet, Set<? extends Object> set) {
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && set.contains(objArr[(i << 3) + i3])) {
                        return true;
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return false;
                }
            }
            if (i == length) {
                return false;
            }
            i++;
        }
    }
}
