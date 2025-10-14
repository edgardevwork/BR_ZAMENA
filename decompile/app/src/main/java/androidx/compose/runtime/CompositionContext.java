package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CompositionContext.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b'\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J*\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00180\u001c¢\u0006\u0002\b\u001dH ¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"H ¢\u0006\u0002\b#J\r\u0010$\u001a\u00020\u0018H\u0010¢\u0006\u0002\b%J\r\u0010&\u001a\u00020'H\u0010¢\u0006\u0002\b(J\u0015\u0010)\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"H ¢\u0006\u0002\b*J\u0015\u0010+\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH ¢\u0006\u0002\b,J\u0015\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020/H ¢\u0006\u0002\b0J\u001d\u00101\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\u0006\u00102\u001a\u000203H ¢\u0006\u0002\b4J\u0017\u00105\u001a\u0004\u0018\u0001032\u0006\u0010!\u001a\u00020\"H\u0010¢\u0006\u0002\b6J\u001b\u00107\u001a\u00020\u00182\f\u00108\u001a\b\u0012\u0004\u0012\u00020:09H\u0010¢\u0006\u0002\b;J\u0015\u0010<\u001a\u00020\u00182\u0006\u0010=\u001a\u00020>H\u0010¢\u0006\u0002\b?J\u0015\u0010@\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH ¢\u0006\u0002\bAJ\u0015\u0010B\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH ¢\u0006\u0002\bCJ\r\u0010D\u001a\u00020\u0018H\u0010¢\u0006\u0002\bEJ\u0015\u0010F\u001a\u00020\u00182\u0006\u0010=\u001a\u00020>H\u0010¢\u0006\u0002\bGJ\u0015\u0010H\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH ¢\u0006\u0002\bIR\u0012\u0010\u0003\u001a\u00020\u0004X \u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X \u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\nX \u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00128PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u000eX \u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010¨\u0006J"}, m7105d2 = {"Landroidx/compose/runtime/CompositionContext;", "", "()V", "collectingParameterInformation", "", "getCollectingParameterInformation$runtime_release", "()Z", "collectingSourceInformation", "getCollectingSourceInformation$runtime_release", "compoundHashKey", "", "getCompoundHashKey$runtime_release", "()I", "effectCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime_release", "()Landroidx/compose/runtime/CompositionObserverHolder;", "recomposeCoroutineContext", "getRecomposeCoroutineContext$runtime_release", "composeInitial", "", "composition", "Landroidx/compose/runtime/ControlledComposition;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "deletedMovableContent", "reference", "Landroidx/compose/runtime/MovableContentStateReference;", "deletedMovableContent$runtime_release", "doneComposing", "doneComposing$runtime_release", "getCompositionLocalScope", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope$runtime_release", "insertMovableContent", "insertMovableContent$runtime_release", "invalidate", "invalidate$runtime_release", "invalidateScope", PomReader.SCOPE, "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateScope$runtime_release", "movableContentStateReleased", "data", "Landroidx/compose/runtime/MovableContentState;", "movableContentStateReleased$runtime_release", "movableContentStateResolve", "movableContentStateResolve$runtime_release", "recordInspectionTable", "table", "", "Landroidx/compose/runtime/tooling/CompositionData;", "recordInspectionTable$runtime_release", "registerComposer", "composer", "Landroidx/compose/runtime/Composer;", "registerComposer$runtime_release", "registerComposition", "registerComposition$runtime_release", "reportRemovedComposition", "reportRemovedComposition$runtime_release", "startComposing", "startComposing$runtime_release", "unregisterComposer", "unregisterComposer$runtime_release", "unregisterComposition", "unregisterComposition$runtime_release", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public abstract class CompositionContext {
    public static final int $stable = 0;

    public abstract void composeInitial$runtime_release(@NotNull ControlledComposition composition, @NotNull Function2<? super Composer, ? super Integer, Unit> content);

    public abstract void deletedMovableContent$runtime_release(@NotNull MovableContentStateReference reference);

    public void doneComposing$runtime_release() {
    }

    /* renamed from: getCollectingParameterInformation$runtime_release */
    public abstract boolean getCollectingParameterInformation();

    /* renamed from: getCollectingSourceInformation$runtime_release */
    public abstract boolean getCollectingSourceInformation();

    /* renamed from: getCompoundHashKey$runtime_release */
    public abstract int getCompoundHashKey();

    @NotNull
    public abstract CoroutineContext getEffectCoroutineContext();

    @Nullable
    /* renamed from: getObserverHolder$runtime_release */
    public CompositionObserverHolder getObserverHolder() {
        return null;
    }

    @NotNull
    public abstract CoroutineContext getRecomposeCoroutineContext$runtime_release();

    public abstract void insertMovableContent$runtime_release(@NotNull MovableContentStateReference reference);

    public abstract void invalidate$runtime_release(@NotNull ControlledComposition composition);

    public abstract void invalidateScope$runtime_release(@NotNull RecomposeScopeImpl recomposeScopeImpl);

    public abstract void movableContentStateReleased$runtime_release(@NotNull MovableContentStateReference reference, @NotNull MovableContentState data);

    @Nullable
    public MovableContentState movableContentStateResolve$runtime_release(@NotNull MovableContentStateReference reference) {
        return null;
    }

    public void recordInspectionTable$runtime_release(@NotNull Set<CompositionData> table) {
    }

    public void registerComposer$runtime_release(@NotNull Composer composer) {
    }

    public abstract void registerComposition$runtime_release(@NotNull ControlledComposition composition);

    public abstract void reportRemovedComposition$runtime_release(@NotNull ControlledComposition composition);

    public void startComposing$runtime_release() {
    }

    public void unregisterComposer$runtime_release(@NotNull Composer composer) {
    }

    public abstract void unregisterComposition$runtime_release(@NotNull ControlledComposition composition);

    @NotNull
    public PersistentCompositionLocalMap getCompositionLocalScope$runtime_release() {
        return CompositionContextKt.EmptyPersistentCompositionLocalMap;
    }
}
