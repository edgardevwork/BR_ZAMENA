package io.ktor.util.pipeline;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.net.MailTo;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import io.ktor.util.Attributes;
import io.ktor.util.AttributesJvmKt;
import io.ktor.util.pipeline.PipelinePhaseRelation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Pipeline.kt */
@Metadata(m7104d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001BU\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012?\u0010\f\u001a;\u00127\u00125\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\b\u000b0\u0006ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eB\u001b\u0012\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000f\"\u00020\u0004¢\u0006\u0004\b\r\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015JQ\u0010\u0017\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00160\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\"2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b#\u0010$J%\u0010&\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010%2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010,J\u001d\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b0\u0010/J\u001f\u00103\u001a\u00020\"2\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u0004H\u0002¢\u0006\u0004\b3\u00104JS\u00106\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000429\u00105\u001a5\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b6\u00107JQ\u00108\u001a;\u00127\u00125\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\b\u000b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b8\u00109JQ\u0010;\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00160\u0006H\u0000¢\u0006\u0004\b:\u0010\u0018J!\u0010<\u001a\u00020\n2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0004\b<\u0010=J#\u0010>\u001a\u00020\n2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b>\u0010=J!\u0010?\u001a\u00020\n2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0004\b?\u0010=JY\u0010A\u001a\u00020\n2H\u0010@\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00160\u0006H\u0002¢\u0006\u0004\bA\u0010BJY\u0010D\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00160\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\bC\u00109J!\u0010E\u001a\u00020\n2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0004\bE\u0010=J\u000f\u0010F\u001a\u00020\nH\u0002¢\u0006\u0004\bF\u0010\u0015J#\u0010H\u001a\u00020\n2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\bH\u0010=J#\u0010J\u001a\u00020\n2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%H\u0002¢\u0006\u0004\bJ\u0010KJQ\u0010L\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00160\u0006H\u0002¢\u0006\u0004\bL\u0010\u0018J[\u0010M\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u00042B\u00105\u001a>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0016H\u0002¢\u0006\u0004\bM\u0010NR\u0017\u0010P\u001a\u00020O8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010T\u001a\u00020\"8\u0016X\u0096D¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR¬\u0001\u0010\f\u001aF\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0016\u0018\u00010\u00062J\u0010X\u001aF\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0016\u0018\u00010\u00068B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bY\u0010\u0018\"\u0004\bZ\u0010BR\u0016\u0010[\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010UR\u0018\u0010\\\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0011\u0010`\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b`\u0010WR\u0017\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068F¢\u0006\u0006\u001a\u0004\ba\u0010\u0018R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00010c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006f"}, m7105d2 = {"Lio/ktor/util/pipeline/Pipeline;", "", "TSubject", "TContext", "Lio/ktor/util/pipeline/PipelinePhase;", TypedValues.CycleType.S_WAVE_PHASE, "", "Lkotlin/Function3;", "Lio/ktor/util/pipeline/PipelineContext;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "interceptors", SegmentConstantPool.INITSTRING, "(Lio/ktor/util/pipeline/PipelinePhase;Ljava/util/List;)V", "", "phases", "([Lio/ktor/util/pipeline/PipelinePhase;)V", "addPhase", "(Lio/ktor/util/pipeline/PipelinePhase;)V", "afterIntercepted", "()V", "Lio/ktor/util/pipeline/PipelineInterceptorFunction;", "cacheInterceptors", "()Ljava/util/List;", "context", MailTo.SUBJECT, "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "createContext", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)Lio/ktor/util/pipeline/PipelineContext;", "execute", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "from", "", "fastPathMerge", "(Lio/ktor/util/pipeline/Pipeline;)Z", "Lio/ktor/util/pipeline/PhaseContent;", "findPhase", "(Lio/ktor/util/pipeline/PipelinePhase;)Lio/ktor/util/pipeline/PhaseContent;", "", "findPhaseIndex", "(Lio/ktor/util/pipeline/PipelinePhase;)I", "hasPhase", "(Lio/ktor/util/pipeline/PipelinePhase;)Z", "reference", "insertPhaseAfter", "(Lio/ktor/util/pipeline/PipelinePhase;Lio/ktor/util/pipeline/PipelinePhase;)V", "insertPhaseBefore", "fromPhaseOrContent", "fromPhase", "insertRelativePhase", "(Ljava/lang/Object;Lio/ktor/util/pipeline/PipelinePhase;)Z", "block", "intercept", "(Lio/ktor/util/pipeline/PipelinePhase;Lkotlin/jvm/functions/Function3;)V", "interceptorsForPhase", "(Lio/ktor/util/pipeline/PipelinePhase;)Ljava/util/List;", "interceptorsForTests$ktor_utils", "interceptorsForTests", "merge", "(Lio/ktor/util/pipeline/Pipeline;)V", "mergeInterceptors", "mergePhases", IFramePlayerOptions.Builder.LIST, "notSharedInterceptorsList", "(Ljava/util/List;)V", "phaseInterceptors$ktor_utils", "phaseInterceptors", "resetFrom", "resetInterceptorsList", "pipeline", "setInterceptorsListFromAnotherPipeline", "phaseContent", "setInterceptorsListFromPhase", "(Lio/ktor/util/pipeline/PhaseContent;)V", "sharedInterceptorsList", "tryAddToPhaseFastPath", "(Lio/ktor/util/pipeline/PipelinePhase;Lkotlin/jvm/functions/Function3;)Z", "Lio/ktor/util/Attributes;", "attributes", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", "developmentMode", "Z", "getDevelopmentMode", "()Z", "value", "getInterceptors", "setInterceptors", "interceptorsListShared", "interceptorsListSharedPhase", "Lio/ktor/util/pipeline/PipelinePhase;", "interceptorsQuantity", "I", "isEmpty", "getItems", FirebaseAnalytics.Param.ITEMS, "", "phasesRaw", "Ljava/util/List;", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPipeline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipeline.kt\nio/ktor/util/pipeline/Pipeline\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,503:1\n1549#2:504\n1620#2,3:505\n1855#2,2:508\n800#2,11:510\n288#2,2:521\n1855#2,2:523\n*S KotlinDebug\n*F\n+ 1 Pipeline.kt\nio/ktor/util/pipeline/Pipeline\n*L\n43#1:504\n43#1:505,3\n70#1:508,2\n173#1:510,11\n174#1:521,2\n214#1:523,2\n*E\n"})
/* loaded from: classes8.dex */
public class Pipeline<TSubject, TContext> {

    @NotNull
    private volatile /* synthetic */ Object _interceptors;

    @NotNull
    public final Attributes attributes;
    public final boolean developmentMode;
    public boolean interceptorsListShared;

    @Nullable
    public Phase interceptorsListSharedPhase;
    public int interceptorsQuantity;

    @NotNull
    public final List<Object> phasesRaw;

    public void afterIntercepted() {
    }

    public Pipeline(@NotNull Phase... phases) {
        Intrinsics.checkNotNullParameter(phases, "phases");
        this.attributes = AttributesJvmKt.Attributes(true);
        this.phasesRaw = CollectionsKt__CollectionsKt.mutableListOf(Arrays.copyOf(phases, phases.length));
        this._interceptors = null;
    }

    @NotNull
    public final Attributes getAttributes() {
        return this.attributes;
    }

    public boolean getDevelopmentMode() {
        return this.developmentMode;
    }

    @NotNull
    public final List<Phase> getItems() {
        List<Object> list = this.phasesRaw;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Object obj : list) {
            Phase phase = obj instanceof Phase ? (Phase) obj : null;
            if (phase == null) {
                PhaseContent phaseContent = obj instanceof PhaseContent ? (PhaseContent) obj : null;
                Phase phase2 = phaseContent != null ? phaseContent.getPhase() : null;
                Intrinsics.checkNotNull(phase2);
                phase = phase2;
            }
            arrayList.add(phase);
        }
        return arrayList;
    }

    public final boolean isEmpty() {
        return this.interceptorsQuantity == 0;
    }

    public final List<Function3<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object>> getInterceptors() {
        return (List) this._interceptors;
    }

    public final void setInterceptors(List<? extends Function3<? super PipelineContext<TSubject, TContext>, ? super TSubject, ? super Continuation<? super Unit>, ? extends Object>> list) {
        this._interceptors = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pipeline(@NotNull Phase phase, @NotNull List<? extends Function3<? super PipelineContext<TSubject, TContext>, ? super TSubject, ? super Continuation<? super Unit>, ? extends Object>> interceptors) {
        this(phase);
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Iterator<T> it = interceptors.iterator();
        while (it.hasNext()) {
            intercept(phase, (Function3) it.next());
        }
    }

    @Nullable
    public final Object execute(@NotNull TContext tcontext, @NotNull TSubject tsubject, @NotNull Continuation<? super TSubject> continuation) {
        return createContext(tcontext, tsubject, continuation.getContext()).execute$ktor_utils(tsubject, continuation);
    }

    public final void addPhase(@NotNull Phase phase) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        if (hasPhase(phase)) {
            return;
        }
        this.phasesRaw.add(phase);
    }

    public final void insertPhaseAfter(@NotNull Phase reference, @NotNull Phase phase) throws InvalidPhaseException {
        PipelinePhaseRelation relation;
        Phase relativeTo;
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(phase, "phase");
        if (hasPhase(phase)) {
            return;
        }
        int iFindPhaseIndex = findPhaseIndex(reference);
        if (iFindPhaseIndex == -1) {
            throw new InvalidPhaseException("Phase " + reference + " was not registered for this pipeline");
        }
        int i = iFindPhaseIndex + 1;
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this.phasesRaw);
        if (i <= lastIndex) {
            while (true) {
                Object obj = this.phasesRaw.get(i);
                PhaseContent phaseContent = obj instanceof PhaseContent ? (PhaseContent) obj : null;
                if (phaseContent != null && (relation = phaseContent.getRelation()) != null) {
                    PipelinePhaseRelation.After after = relation instanceof PipelinePhaseRelation.After ? (PipelinePhaseRelation.After) relation : null;
                    if (after != null && (relativeTo = after.getRelativeTo()) != null && Intrinsics.areEqual(relativeTo, reference)) {
                        iFindPhaseIndex = i;
                    }
                    if (i == lastIndex) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    break;
                }
            }
        }
        this.phasesRaw.add(iFindPhaseIndex + 1, new PhaseContent(phase, new PipelinePhaseRelation.After(reference)));
    }

    public final void insertPhaseBefore(@NotNull Phase reference, @NotNull Phase phase) throws InvalidPhaseException {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(phase, "phase");
        if (hasPhase(phase)) {
            return;
        }
        int iFindPhaseIndex = findPhaseIndex(reference);
        if (iFindPhaseIndex == -1) {
            throw new InvalidPhaseException("Phase " + reference + " was not registered for this pipeline");
        }
        this.phasesRaw.add(iFindPhaseIndex, new PhaseContent(phase, new PipelinePhaseRelation.Before(reference)));
    }

    public final void intercept(@NotNull Phase phase, @NotNull Function3<? super PipelineContext<TSubject, TContext>, ? super TSubject, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(block, "block");
        PhaseContent<TSubject, TContext> phaseContentFindPhase = findPhase(phase);
        if (phaseContentFindPhase == null) {
            throw new InvalidPhaseException("Phase " + phase + " was not registered for this pipeline");
        }
        if (tryAddToPhaseFastPath(phase, block)) {
            this.interceptorsQuantity++;
            return;
        }
        phaseContentFindPhase.addInterceptor(block);
        this.interceptorsQuantity++;
        resetInterceptorsList();
        afterIntercepted();
    }

    @NotNull
    public final List<Function3<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object>> interceptorsForPhase(@NotNull Phase phase) {
        Object next;
        Intrinsics.checkNotNullParameter(phase, "phase");
        List<Object> list = this.phasesRaw;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof PhaseContent) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((PhaseContent) next).getPhase(), phase)) {
                break;
            }
        }
        PhaseContent phaseContent = (PhaseContent) next;
        List<Function3<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object>> listSharedInterceptors = phaseContent != null ? phaseContent.sharedInterceptors() : null;
        return listSharedInterceptors == null ? CollectionsKt__CollectionsKt.emptyList() : listSharedInterceptors;
    }

    public final void mergePhases(@NotNull Pipeline<TSubject, TContext> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) from.phasesRaw);
        while (!mutableList.isEmpty()) {
            Iterator it = mutableList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Phase phase = next instanceof Phase ? (Phase) next : null;
                if (phase == null) {
                    Intrinsics.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.pipeline.PhaseContent<*, *>");
                    phase = ((PhaseContent) next).getPhase();
                }
                if (hasPhase(phase)) {
                    it.remove();
                } else if (insertRelativePhase(next, phase)) {
                    it.remove();
                }
            }
        }
    }

    public final void mergeInterceptors(Pipeline<TSubject, TContext> from) {
        if (this.interceptorsQuantity == 0) {
            setInterceptorsListFromAnotherPipeline(from);
        } else {
            resetInterceptorsList();
        }
        for (Object obj : from.phasesRaw) {
            Phase phase = obj instanceof Phase ? (Phase) obj : null;
            if (phase == null) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.pipeline.PhaseContent<*, *>");
                phase = ((PhaseContent) obj).getPhase();
            }
            if (obj instanceof PhaseContent) {
                PhaseContent phaseContent = (PhaseContent) obj;
                if (!phaseContent.isEmpty()) {
                    PhaseContent<TSubject, TContext> phaseContentFindPhase = findPhase(phase);
                    Intrinsics.checkNotNull(phaseContentFindPhase);
                    phaseContent.addTo(phaseContentFindPhase);
                    this.interceptorsQuantity += phaseContent.getSize();
                }
            }
        }
    }

    public final void merge(@NotNull Pipeline<TSubject, TContext> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        if (fastPathMerge(from)) {
            return;
        }
        mergePhases(from);
        mergeInterceptors(from);
    }

    public final void resetFrom(@NotNull Pipeline<TSubject, TContext> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.phasesRaw.clear();
        if (this.interceptorsQuantity != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        fastPathMerge(from);
    }

    @NotNull
    public final List<Function3<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object>> phaseInterceptors$ktor_utils(@NotNull Phase phase) {
        List<Function3<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object>> listSharedInterceptors;
        Intrinsics.checkNotNullParameter(phase, "phase");
        PhaseContent<TSubject, TContext> phaseContentFindPhase = findPhase(phase);
        return (phaseContentFindPhase == null || (listSharedInterceptors = phaseContentFindPhase.sharedInterceptors()) == null) ? CollectionsKt__CollectionsKt.emptyList() : listSharedInterceptors;
    }

    @NotNull
    public final List<Function3<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object>> interceptorsForTests$ktor_utils() {
        List<Function3<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object>> interceptors = getInterceptors();
        return interceptors == null ? cacheInterceptors() : interceptors;
    }

    public final PipelineContext<TSubject, TContext> createContext(TContext context, TSubject subject, CoroutineContext coroutineContext) {
        return PipelineContextKt.pipelineContextFor(context, sharedInterceptorsList(), subject, coroutineContext, getDevelopmentMode());
    }

    public final PhaseContent<TSubject, TContext> findPhase(Phase phase) {
        List<Object> list = this.phasesRaw;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj == phase) {
                PhaseContent<TSubject, TContext> phaseContent = new PhaseContent<>(phase, PipelinePhaseRelation.Last.INSTANCE);
                list.set(i, phaseContent);
                return phaseContent;
            }
            if (obj instanceof PhaseContent) {
                PhaseContent<TSubject, TContext> phaseContent2 = (PhaseContent) obj;
                if (phaseContent2.getPhase() == phase) {
                    return phaseContent2;
                }
            }
        }
        return null;
    }

    public final int findPhaseIndex(Phase phase) {
        List<Object> list = this.phasesRaw;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj == phase || ((obj instanceof PhaseContent) && ((PhaseContent) obj).getPhase() == phase)) {
                return i;
            }
        }
        return -1;
    }

    public final boolean hasPhase(Phase phase) {
        List<Object> list = this.phasesRaw;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj == phase) {
                return true;
            }
            if ((obj instanceof PhaseContent) && ((PhaseContent) obj).getPhase() == phase) {
                return true;
            }
        }
        return false;
    }

    public final List<Function3<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object>> cacheInterceptors() {
        int lastIndex;
        int i = this.interceptorsQuantity;
        if (i == 0) {
            notSharedInterceptorsList(CollectionsKt__CollectionsKt.emptyList());
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Object> list = this.phasesRaw;
        int i2 = 0;
        if (i == 1 && (lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list)) >= 0) {
            int i3 = 0;
            while (true) {
                Object obj = list.get(i3);
                PhaseContent<TSubject, TContext> phaseContent = obj instanceof PhaseContent ? (PhaseContent) obj : null;
                if (phaseContent != null && !phaseContent.isEmpty()) {
                    List<Function3<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object>> listSharedInterceptors = phaseContent.sharedInterceptors();
                    setInterceptorsListFromPhase(phaseContent);
                    return listSharedInterceptors;
                }
                if (i3 == lastIndex) {
                    break;
                }
                i3++;
            }
        }
        ArrayList arrayList = new ArrayList();
        int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(list);
        if (lastIndex2 >= 0) {
            while (true) {
                Object obj2 = list.get(i2);
                PhaseContent phaseContent2 = obj2 instanceof PhaseContent ? (PhaseContent) obj2 : null;
                if (phaseContent2 != null) {
                    phaseContent2.addTo(arrayList);
                }
                if (i2 == lastIndex2) {
                    break;
                }
                i2++;
            }
        }
        notSharedInterceptorsList(arrayList);
        return arrayList;
    }

    public final boolean fastPathMerge(Pipeline<TSubject, TContext> from) {
        if (from.phasesRaw.isEmpty()) {
            return true;
        }
        int i = 0;
        if (!this.phasesRaw.isEmpty()) {
            return false;
        }
        List<Object> list = from.phasesRaw;
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        if (lastIndex >= 0) {
            while (true) {
                Object obj = list.get(i);
                if (obj instanceof Phase) {
                    this.phasesRaw.add(obj);
                } else if (obj instanceof PhaseContent) {
                    PhaseContent phaseContent = (PhaseContent) obj;
                    this.phasesRaw.add(new PhaseContent(phaseContent.getPhase(), phaseContent.getRelation(), phaseContent.sharedInterceptors()));
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        this.interceptorsQuantity += from.interceptorsQuantity;
        setInterceptorsListFromAnotherPipeline(from);
        return true;
    }

    public final List<Function3<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object>> sharedInterceptorsList() {
        if (getInterceptors() == null) {
            cacheInterceptors();
        }
        this.interceptorsListShared = true;
        List<Function3<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object>> interceptors = getInterceptors();
        Intrinsics.checkNotNull(interceptors);
        return interceptors;
    }

    public final void resetInterceptorsList() {
        setInterceptors(null);
        this.interceptorsListShared = false;
        this.interceptorsListSharedPhase = null;
    }

    public final void notSharedInterceptorsList(List<? extends Function3<? super PipelineContext<TSubject, TContext>, ? super TSubject, ? super Continuation<? super Unit>, ? extends Object>> list) {
        setInterceptors(list);
        this.interceptorsListShared = false;
        this.interceptorsListSharedPhase = null;
    }

    public final void setInterceptorsListFromPhase(PhaseContent<TSubject, TContext> phaseContent) {
        setInterceptors(phaseContent.sharedInterceptors());
        this.interceptorsListShared = false;
        this.interceptorsListSharedPhase = phaseContent.getPhase();
    }

    public final void setInterceptorsListFromAnotherPipeline(Pipeline<TSubject, TContext> pipeline) {
        setInterceptors(pipeline.sharedInterceptorsList());
        this.interceptorsListShared = true;
        this.interceptorsListSharedPhase = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean tryAddToPhaseFastPath(Phase phase, Function3<? super PipelineContext<TSubject, TContext>, ? super TSubject, ? super Continuation<? super Unit>, ? extends Object> block) {
        List<Function3<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object>> interceptors = getInterceptors();
        if (this.phasesRaw.isEmpty() || interceptors == null || this.interceptorsListShared || !TypeIntrinsics.isMutableList(interceptors)) {
            return false;
        }
        if (Intrinsics.areEqual(this.interceptorsListSharedPhase, phase)) {
            interceptors.add(block);
            return true;
        }
        if (!Intrinsics.areEqual(phase, CollectionsKt___CollectionsKt.last((List) this.phasesRaw)) && findPhaseIndex(phase) != CollectionsKt__CollectionsKt.getLastIndex(this.phasesRaw)) {
            return false;
        }
        PhaseContent<TSubject, TContext> phaseContentFindPhase = findPhase(phase);
        Intrinsics.checkNotNull(phaseContentFindPhase);
        phaseContentFindPhase.addInterceptor(block);
        interceptors.add(block);
        return true;
    }

    public final boolean insertRelativePhase(Object fromPhaseOrContent, Phase fromPhase) throws InvalidPhaseException {
        PipelinePhaseRelation relation;
        if (fromPhaseOrContent == fromPhase) {
            relation = PipelinePhaseRelation.Last.INSTANCE;
        } else {
            Intrinsics.checkNotNull(fromPhaseOrContent, "null cannot be cast to non-null type io.ktor.util.pipeline.PhaseContent<*, *>");
            relation = ((PhaseContent) fromPhaseOrContent).getRelation();
        }
        if (relation instanceof PipelinePhaseRelation.Last) {
            addPhase(fromPhase);
            return true;
        }
        if (relation instanceof PipelinePhaseRelation.Before) {
            PipelinePhaseRelation.Before before = (PipelinePhaseRelation.Before) relation;
            if (hasPhase(before.getRelativeTo())) {
                insertPhaseBefore(before.getRelativeTo(), fromPhase);
                return true;
            }
        }
        if (!(relation instanceof PipelinePhaseRelation.After)) {
            return false;
        }
        insertPhaseAfter(((PipelinePhaseRelation.After) relation).getRelativeTo(), fromPhase);
        return true;
    }
}
