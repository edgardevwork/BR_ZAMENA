package kotlinx.coroutines.selects;

import androidx.concurrent.futures.C2081xc40028dd;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.p007ts.UserDataReader;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.selects.SelectBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Select.kt */
@Metadata(m7104d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004:\u0001HB\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0002J\u001a\u0010\u001d\u001a\u00020\u001b2\u0010\u0010\u001e\u001a\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u0011\u0010\u001f\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0016J\u0011\u0010$\u001a\u00028\u0000H\u0091@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0011\u0010%\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010 J\u001c\u0010&\u001a\u000e\u0018\u00010\nR\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001c\u001a\u00020\u000eH\u0002J\u0013\u0010'\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\u001c\u0010*\u001a\u00020\u001b2\n\u0010+\u001a\u0006\u0012\u0002\b\u00030,2\u0006\u0010-\u001a\u00020\u0014H\u0016J-\u0010.\u001a\u00028\u00002\u0010\u0010/\u001a\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0082@ø\u0001\u0000¢\u0006\u0002\u00100J\u0010\u00101\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0002J\u0012\u00102\u001a\u00020\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u00103\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u00010\u000eH\u0016J\u0018\u00105\u001a\u0002062\u0006\u0010\u001c\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u00010\u000eJ\u001a\u00107\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0002J\u0011\u00108\u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010 J3\u0010'\u001a\u00020\u001b*\u0002092\u001c\u0010:\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<\u0012\u0006\u0012\u0004\u0018\u00010\u000e0;H\u0096\u0002ø\u0001\u0000¢\u0006\u0002\u0010=JE\u0010'\u001a\u00020\u001b\"\u0004\b\u0001\u0010>*\b\u0012\u0004\u0012\u0002H>0?2\"\u0010:\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H>\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<\u0012\u0006\u0012\u0004\u0018\u00010\u000e0@H\u0096\u0002ø\u0001\u0000¢\u0006\u0002\u0010AJY\u0010'\u001a\u00020\u001b\"\u0004\b\u0001\u0010B\"\u0004\b\u0002\u0010>*\u000e\u0012\u0004\u0012\u0002HB\u0012\u0004\u0012\u0002H>0C2\u0006\u0010D\u001a\u0002HB2\"\u0010:\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H>\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<\u0012\u0006\u0012\u0004\u0018\u00010\u000e0@H\u0096\u0002ø\u0001\u0000¢\u0006\u0002\u0010EJ \u0010F\u001a\u00020\u001b*\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010G\u001a\u00020\u0010H\u0001R \u0010\b\u001a\u0014\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006I"}, m7105d2 = {"Lkotlinx/coroutines/selects/SelectImplementation;", "R", "Lkotlinx/coroutines/CancelHandler;", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "clauses", "", "Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "disposableHandleOrSegment", "", "inRegistrationPhase", "", "getInRegistrationPhase", "()Z", "indexInSegment", "", "internalResult", "isCancelled", "isSelected", "state", "Lkotlinx/atomicfu/AtomicRef;", "checkClauseObject", "", "clauseObject", "cleanup", "selectedClause", "complete", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disposeOnCompletion", "disposableHandle", "Lkotlinx/coroutines/DisposableHandle;", "doSelect", "doSelectSuspend", "findClause", "invoke", "cause", "", "invokeOnCancellation", "segment", "Lkotlinx/coroutines/internal/Segment;", FirebaseAnalytics.Param.INDEX, "processResultAndInvokeBlockRecoveringException", "clause", "(Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reregisterClause", "selectInRegistrationPhase", "trySelect", "result", "trySelectDetailed", "Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "trySelectInternal", "waitUntilSelected", "Lkotlinx/coroutines/selects/SelectClause0;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "register", "reregister", "ClauseData", "kotlinx-coroutines-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@PublishedApi
@SourceDebugExtension({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,873:1\n1#2:874\n2624#3,3:875\n1855#3,2:888\n1855#3,2:896\n1855#3,2:898\n314#4,9:878\n323#4,2:890\n19#5:887\n153#6,4:892\n*S KotlinDebug\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n*L\n505#1:875,3\n569#1:888,2\n726#1:896,2\n751#1:898,2\n545#1:878,9\n545#1:890,2\n561#1:887\n711#1:892,4\n*E\n"})
/* loaded from: classes5.dex */
public class SelectImplementation<R> extends CancelHandler implements SelectBuilder<R>, SelectInstanceInternal<R> {

    @NotNull
    public static final AtomicReferenceFieldUpdater state$FU = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state");

    @NotNull
    public final CoroutineContext context;

    @Nullable
    public Object disposableHandleOrSegment;

    @Volatile
    @Nullable
    private volatile Object state = SelectKt.STATE_REG;

    @Nullable
    public List<SelectImplementation<R>.ClauseData> clauses = new ArrayList(2);
    public int indexInSegment = -1;

    @Nullable
    public Object internalResult = SelectKt.NO_RESULT;

    /* compiled from: Select.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.selects.SelectImplementation", m7120f = "Select.kt", m7121i = {0}, m7122l = {431, UserDataReader.USER_DATA_START_CODE}, m7123m = "doSelectSuspend", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 */
    /* loaded from: classes8.dex */
    public static final class C109161 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ SelectImplementation<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109161(SelectImplementation<R> selectImplementation, Continuation<? super C109161> continuation) {
            super(continuation);
            this.this$0 = selectImplementation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.doSelectSuspend(this);
        }
    }

    /* compiled from: Select.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.selects.SelectImplementation", m7120f = "Select.kt", m7121i = {}, m7122l = {TypedValues.TransitionType.TYPE_STAGGERED}, m7123m = "processResultAndInvokeBlockRecoveringException", m7124n = {}, m7125s = {})
    /* renamed from: kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 */
    /* loaded from: classes8.dex */
    public static final class C109171 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ SelectImplementation<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109171(SelectImplementation<R> selectImplementation, Continuation<? super C109171> continuation) {
            super(continuation);
            this.this$0 = selectImplementation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.processResultAndInvokeBlockRecoveringException(null, null, this);
        }
    }

    private final void loop$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Function1<Object, Unit> function1, Object obj) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @PublishedApi
    @Nullable
    public Object doSelect(@NotNull Continuation<? super R> continuation) {
        return doSelect$suspendImpl(this, continuation);
    }

    public final void update$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Function1<Object, ? extends Object> function1, Object obj) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!C2081xc40028dd.m347m(atomicReferenceFieldUpdater, obj, obj2, function1.invoke(obj2)));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(@NotNull SelectClause2<? super P, ? extends Q> selectClause2, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        SelectBuilder.DefaultImpls.invoke(this, selectClause2, function2);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    @Deprecated(level = DeprecationLevel.ERROR, message = "Replaced with the same extension function", replaceWith = @ReplaceWith(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    @LowPriorityInOverloadResolution
    @ExperimentalCoroutinesApi
    public void onTimeout(long j, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        SelectBuilder.DefaultImpls.onTimeout(this, j, function1);
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    @NotNull
    public CoroutineContext getContext() {
        return this.context;
    }

    public SelectImplementation(@NotNull CoroutineContext coroutineContext) {
        this.context = coroutineContext;
    }

    public final boolean getInRegistrationPhase() {
        Object obj = state$FU.get(this);
        return obj == SelectKt.STATE_REG || (obj instanceof List);
    }

    private final boolean isSelected() {
        return state$FU.get(this) instanceof ClauseData;
    }

    public final boolean isCancelled() {
        return state$FU.get(this) == SelectKt.STATE_CANCELLED;
    }

    @PublishedApi
    public static /* synthetic */ <R> Object doSelect$suspendImpl(SelectImplementation<R> selectImplementation, Continuation<? super R> continuation) {
        return selectImplementation.isSelected() ? selectImplementation.complete(continuation) : selectImplementation.doSelectSuspend(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doSelectSuspend(Continuation<? super R> continuation) throws Throwable {
        C109161 c109161;
        SelectImplementation<R> selectImplementation;
        if (continuation instanceof C109161) {
            c109161 = (C109161) continuation;
            int i = c109161.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c109161.label = i - Integer.MIN_VALUE;
            } else {
                c109161 = new C109161(this, continuation);
            }
        }
        Object objComplete = c109161.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c109161.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objComplete);
            c109161.L$0 = this;
            c109161.label = 1;
            if (waitUntilSelected(c109161) == coroutine_suspended) {
                return coroutine_suspended;
            }
            selectImplementation = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(objComplete);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            selectImplementation = (SelectImplementation) c109161.L$0;
            ResultKt.throwOnFailure(objComplete);
        }
        c109161.L$0 = null;
        c109161.label = 2;
        objComplete = selectImplementation.complete(c109161);
        return objComplete == coroutine_suspended ? coroutine_suspended : objComplete;
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void invoke(@NotNull SelectClause0 selectClause0, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        register$default(this, new ClauseData(selectClause0.getClauseObject(), selectClause0.getRegFunc(), selectClause0.getProcessResFunc(), SelectKt.getPARAM_CLAUSE_0(), function1, selectClause0.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(@NotNull SelectClause1<? extends Q> selectClause1, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        register$default(this, new ClauseData(selectClause1.getClauseObject(), selectClause1.getRegFunc(), selectClause1.getProcessResFunc(), null, function2, selectClause1.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(@NotNull SelectClause2<? super P, ? extends Q> selectClause2, P p, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        register$default(this, new ClauseData(selectClause2.getClauseObject(), selectClause2.getRegFunc(), selectClause2.getProcessResFunc(), p, function2, selectClause2.getOnCancellationConstructor()), false, 1, null);
    }

    public static /* synthetic */ void register$default(SelectImplementation selectImplementation, ClauseData clauseData, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        selectImplementation.register(clauseData, z);
    }

    @JvmName(name = "register")
    public final void register(@NotNull SelectImplementation<R>.ClauseData clauseData, boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$FU;
        if (atomicReferenceFieldUpdater.get(this) instanceof ClauseData) {
            return;
        }
        if (!z) {
            checkClauseObject(clauseData.clauseObject);
        }
        if (clauseData.tryRegisterAsWaiter(this)) {
            if (!z) {
                List<SelectImplementation<R>.ClauseData> list = this.clauses;
                Intrinsics.checkNotNull(list);
                list.add(clauseData);
            }
            clauseData.disposableHandleOrSegment = this.disposableHandleOrSegment;
            clauseData.indexInSegment = this.indexInSegment;
            this.disposableHandleOrSegment = null;
            this.indexInSegment = -1;
            return;
        }
        atomicReferenceFieldUpdater.set(this, clauseData);
    }

    public final void checkClauseObject(Object clauseObject) {
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        Intrinsics.checkNotNull(list);
        List<SelectImplementation<R>.ClauseData> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((ClauseData) it.next()).clauseObject == clauseObject) {
                throw new IllegalStateException(("Cannot use select clauses on the same object: " + clauseObject).toString());
            }
        }
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void disposeOnCompletion(@NotNull DisposableHandle disposableHandle) {
        this.disposableHandleOrSegment = disposableHandle;
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(@NotNull Segment<?> segment, int i) {
        this.disposableHandleOrSegment = segment;
        this.indexInSegment = i;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void selectInRegistrationPhase(@Nullable Object internalResult) {
        this.internalResult = internalResult;
    }

    public final void reregisterClause(Object clauseObject) {
        SelectImplementation<R>.ClauseData clauseDataFindClause = findClause(clauseObject);
        Intrinsics.checkNotNull(clauseDataFindClause);
        clauseDataFindClause.disposableHandleOrSegment = null;
        clauseDataFindClause.indexInSegment = -1;
        register(clauseDataFindClause, true);
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean trySelect(@NotNull Object clauseObject, @Nullable Object result) {
        return trySelectInternal(clauseObject, result) == 0;
    }

    @NotNull
    public final TrySelectDetailedResult trySelectDetailed(@NotNull Object clauseObject, @Nullable Object result) {
        return SelectKt.TrySelectDetailedResult(trySelectInternal(clauseObject, result));
    }

    public final int trySelectInternal(Object clauseObject, Object internalResult) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$FU;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof CancellableContinuation)) {
                if (Intrinsics.areEqual(obj, SelectKt.STATE_COMPLETED) ? true : obj instanceof ClauseData) {
                    return 3;
                }
                if (Intrinsics.areEqual(obj, SelectKt.STATE_CANCELLED)) {
                    return 2;
                }
                if (Intrinsics.areEqual(obj, SelectKt.STATE_REG)) {
                    if (C2081xc40028dd.m347m(atomicReferenceFieldUpdater, this, obj, CollectionsKt__CollectionsJVMKt.listOf(clauseObject))) {
                        return 1;
                    }
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj).toString());
                    }
                    if (C2081xc40028dd.m347m(atomicReferenceFieldUpdater, this, obj, CollectionsKt___CollectionsKt.plus((Collection<? extends Object>) obj, clauseObject))) {
                        return 1;
                    }
                }
            } else {
                SelectImplementation<R>.ClauseData clauseDataFindClause = findClause(clauseObject);
                if (clauseDataFindClause == null) {
                    continue;
                } else {
                    Function1<Throwable, Unit> function1CreateOnCancellationAction = clauseDataFindClause.createOnCancellationAction(this, internalResult);
                    if (C2081xc40028dd.m347m(atomicReferenceFieldUpdater, this, obj, clauseDataFindClause)) {
                        this.internalResult = internalResult;
                        if (SelectKt.tryResume((CancellableContinuation) obj, function1CreateOnCancellationAction)) {
                            return 0;
                        }
                        this.internalResult = null;
                        return 2;
                    }
                }
            }
        }
    }

    public final SelectImplementation<R>.ClauseData findClause(Object clauseObject) {
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((ClauseData) next).clauseObject == clauseObject) {
                obj = next;
                break;
            }
        }
        SelectImplementation<R>.ClauseData clauseData = (ClauseData) obj;
        if (clauseData != null) {
            return clauseData;
        }
        throw new IllegalStateException(("Clause with object " + clauseObject + " is not found").toString());
    }

    public final Object complete(Continuation<? super R> continuation) {
        Object obj = state$FU.get(this);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        SelectImplementation<R>.ClauseData clauseData = (ClauseData) obj;
        Object obj2 = this.internalResult;
        cleanup(clauseData);
        return clauseData.invokeBlock(clauseData.processResult(obj2), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processResultAndInvokeBlockRecoveringException(SelectImplementation<R>.ClauseData clauseData, Object obj, Continuation<? super R> continuation) throws Throwable {
        C109171 c109171;
        if (continuation instanceof C109171) {
            c109171 = (C109171) continuation;
            int i = c109171.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c109171.label = i - Integer.MIN_VALUE;
            } else {
                c109171 = new C109171(this, continuation);
            }
        }
        Object objInvokeBlock = c109171.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c109171.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvokeBlock);
            Object objProcessResult = clauseData.processResult(obj);
            c109171.label = 1;
            objInvokeBlock = clauseData.invokeBlock(objProcessResult, c109171);
            if (objInvokeBlock == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvokeBlock);
        }
        return objInvokeBlock;
    }

    public final void cleanup(SelectImplementation<R>.ClauseData selectedClause) {
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        if (list == null) {
            return;
        }
        for (SelectImplementation<R>.ClauseData clauseData : list) {
            if (clauseData != selectedClause) {
                clauseData.dispose();
            }
        }
        state$FU.set(this, SelectKt.STATE_COMPLETED);
        this.internalResult = SelectKt.NO_RESULT;
        this.clauses = null;
    }

    @Override // kotlinx.coroutines.CancelHandlerBase
    /* renamed from: invoke */
    public void invoke2(@Nullable Throwable cause) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == SelectKt.STATE_COMPLETED) {
                return;
            }
        } while (!C2081xc40028dd.m347m(atomicReferenceFieldUpdater, this, obj, SelectKt.STATE_CANCELLED));
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ClauseData) it.next()).dispose();
        }
        this.internalResult = SelectKt.NO_RESULT;
        this.clauses = null;
    }

    /* compiled from: Select.kt */
    @Metadata(m7104d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B¶\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012U\u0010\u0003\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004j\u0002`\u000b\u0012U\u0010\f\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u000e\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012g\u0010\u0010\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012\u0018\u00010\u0004j\u0004\u0018\u0001`\u0014¢\u0006\u0002\u0010\u0015J*\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u00122\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u001a\u001a\u00020\nJ\u001b\u0010\u001b\u001a\u00028\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001J\u0014\u0010 \u001a\u00020!2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\"R\u000e\u0010\u000f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000Rq\u0010\u0010\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012\u0018\u00010\u0004j\u0004\u0018\u0001`\u00148\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R]\u0010\f\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R]\u0010\u0003\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004j\u0002`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m7105d2 = {"Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "", "clauseObject", "regFunc", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "param", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "processResFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "block", "onCancellationConstructor", "internalResult", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "(Lkotlinx/coroutines/selects/SelectImplementation;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "disposableHandleOrSegment", "indexInSegment", "", "createOnCancellationAction", "dispose", "invokeBlock", "argument", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processResult", "result", "tryRegisterAsWaiter", "", "Lkotlinx/coroutines/selects/SelectImplementation;", "kotlinx-coroutines-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation$ClauseData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,873:1\n1#2:874\n*E\n"})
    /* loaded from: classes6.dex */
    public final class ClauseData {

        @NotNull
        public final Object block;

        @JvmField
        @NotNull
        public final Object clauseObject;

        @JvmField
        @Nullable
        public Object disposableHandleOrSegment;

        @JvmField
        public int indexInSegment = -1;

        @JvmField
        @Nullable
        public final Function3<SelectInstance<?>, Object, Object, Function1<Throwable, Unit>> onCancellationConstructor;

        @Nullable
        public final Object param;

        @NotNull
        public final Function3<Object, Object, Object, Object> processResFunc;

        @NotNull
        public final Function3<Object, SelectInstance<?>, Object, Unit> regFunc;

        /* JADX WARN: Multi-variable type inference failed */
        public ClauseData(@NotNull Object obj, @NotNull Function3<Object, ? super SelectInstance<?>, Object, Unit> function3, @NotNull Function3<Object, Object, Object, ? extends Object> function32, @Nullable Object obj2, @NotNull Object obj3, @Nullable Function3<? super SelectInstance<?>, Object, Object, ? extends Function1<? super Throwable, Unit>> function33) {
            this.clauseObject = obj;
            this.regFunc = function3;
            this.processResFunc = function32;
            this.param = obj2;
            this.block = obj3;
            this.onCancellationConstructor = function33;
        }

        public final boolean tryRegisterAsWaiter(@NotNull SelectImplementation<R> select) {
            this.regFunc.invoke(this.clauseObject, select, this.param);
            return select.internalResult == SelectKt.NO_RESULT;
        }

        @Nullable
        public final Object processResult(@Nullable Object result) {
            return this.processResFunc.invoke(this.clauseObject, this.param, result);
        }

        @Nullable
        public final Object invokeBlock(@Nullable Object obj, @NotNull Continuation<? super R> continuation) {
            Object obj2 = this.block;
            if (this.param == SelectKt.getPARAM_CLAUSE_0()) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((Function1) obj2).invoke(continuation);
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((Function2) obj2).invoke(obj, continuation);
        }

        public final void dispose() {
            Object obj = this.disposableHandleOrSegment;
            SelectImplementation<R> selectImplementation = SelectImplementation.this;
            if (obj instanceof Segment) {
                ((Segment) obj).onCancellation(this.indexInSegment, null, selectImplementation.getContext());
                return;
            }
            DisposableHandle disposableHandle = obj instanceof DisposableHandle ? (DisposableHandle) obj : null;
            if (disposableHandle != null) {
                disposableHandle.dispose();
            }
        }

        @Nullable
        public final Function1<Throwable, Unit> createOnCancellationAction(@NotNull SelectInstance<?> select, @Nullable Object internalResult) {
            Function3<SelectInstance<?>, Object, Object, Function1<Throwable, Unit>> function3 = this.onCancellationConstructor;
            if (function3 != null) {
                return function3.invoke(select, this.param, internalResult);
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0062, code lost:
    
        r0 = r0.getResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x006a, code lost:
    
        if (r0 != kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x006c, code lost:
    
        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0073, code lost:
    
        if (r0 != kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0078, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitUntilSelected(Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == SelectKt.STATE_REG) {
                if (C2081xc40028dd.m347m(state$FU, this, obj, cancellableContinuationImpl)) {
                    cancellableContinuationImpl.invokeOnCancellation(this);
                    break;
                }
            } else if (obj instanceof List) {
                if (C2081xc40028dd.m347m(state$FU, this, obj, SelectKt.STATE_REG)) {
                    Iterator it = ((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        reregisterClause(it.next());
                    }
                }
            } else if (obj instanceof ClauseData) {
                cancellableContinuationImpl.resume(Unit.INSTANCE, ((ClauseData) obj).createOnCancellationAction(this, this.internalResult));
            } else {
                throw new IllegalStateException(("unexpected state: " + obj).toString());
            }
        }
    }
}
