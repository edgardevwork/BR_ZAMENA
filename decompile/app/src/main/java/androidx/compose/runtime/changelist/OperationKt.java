package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.InvalidationResult;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.collection.IdentityArraySet;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.http.LinkHeader;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Operation.kt */
@Metadata(m7104d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a(\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002\u001a(\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\f\u001a\u00020\u0001H\u0002\u001a(\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0014"}, m7105d2 = {"currentNodeIndex", "", "slots", "Landroidx/compose/runtime/SlotWriter;", "positionToInsert", LinkHeader.Parameters.Anchor, "Landroidx/compose/runtime/Anchor;", "applier", "Landroidx/compose/runtime/Applier;", "", "positionToParentOf", "", FirebaseAnalytics.Param.INDEX, "releaseMovableGroupAtCurrent", "composition", "Landroidx/compose/runtime/ControlledComposition;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "reference", "Landroidx/compose/runtime/MovableContentStateReference;", "runtime_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,879:1\n166#2,8:880\n166#2,8:888\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n*L\n809#1:880,8\n869#1:888,8\n*E\n"})
/* loaded from: classes.dex */
public final class OperationKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void positionToParentOf(SlotWriter slotWriter, Applier<Object> applier, int i) {
        while (!slotWriter.indexInParent(i)) {
            slotWriter.skipToGroupEnd();
            if (slotWriter.isNode(slotWriter.getParent())) {
                applier.mo97up();
            }
            slotWriter.endGroup();
        }
    }

    private static final int currentNodeIndex(SlotWriter slotWriter) {
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.isNode(parent)) {
            parent = slotWriter.parent(parent);
        }
        int iGroupSize = parent + 1;
        int iNodeCount = 0;
        while (iGroupSize < currentGroup) {
            if (slotWriter.indexInGroup(currentGroup, iGroupSize)) {
                if (slotWriter.isNode(iGroupSize)) {
                    iNodeCount = 0;
                }
                iGroupSize++;
            } else {
                iNodeCount += slotWriter.isNode(iGroupSize) ? 1 : slotWriter.nodeCount(iGroupSize);
                iGroupSize += slotWriter.groupSize(iGroupSize);
            }
        }
        return iNodeCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int positionToInsert(SlotWriter slotWriter, Anchor anchor, Applier<Object> applier) {
        int iAnchorIndex = slotWriter.anchorIndex(anchor);
        ComposerKt.runtimeCheck(slotWriter.getCurrentGroup() < iAnchorIndex);
        positionToParentOf(slotWriter, applier, iAnchorIndex);
        int iCurrentNodeIndex = currentNodeIndex(slotWriter);
        while (slotWriter.getCurrentGroup() < iAnchorIndex) {
            if (slotWriter.indexInCurrentGroup(iAnchorIndex)) {
                if (slotWriter.isNode()) {
                    applier.down(slotWriter.node(slotWriter.getCurrentGroup()));
                    iCurrentNodeIndex = 0;
                }
                slotWriter.startGroup();
            } else {
                iCurrentNodeIndex += slotWriter.skipGroup();
            }
        }
        ComposerKt.runtimeCheck(slotWriter.getCurrentGroup() == iAnchorIndex);
        return iCurrentNodeIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void releaseMovableGroupAtCurrent(final ControlledComposition controlledComposition, CompositionContext compositionContext, final MovableContentStateReference movableContentStateReference, SlotWriter slotWriter) {
        SlotTable slotTable = new SlotTable();
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        try {
            slotWriterOpenWriter.beginInsert();
            slotWriterOpenWriter.startGroup(MovableContentKt.movableContentKey, movableContentStateReference.getContent$runtime_release());
            SlotWriter.markGroup$default(slotWriterOpenWriter, 0, 1, null);
            slotWriterOpenWriter.update(movableContentStateReference.getParameter());
            List<Anchor> listMoveTo = slotWriter.moveTo(movableContentStateReference.getAnchor(), 1, slotWriterOpenWriter);
            slotWriterOpenWriter.skipGroup();
            slotWriterOpenWriter.endGroup();
            slotWriterOpenWriter.endInsert();
            slotWriterOpenWriter.close();
            MovableContentState movableContentState = new MovableContentState(slotTable);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.INSTANCE;
            if (companion.hasAnchoredRecomposeScopes$runtime_release(slotTable, listMoveTo)) {
                try {
                    companion.adoptAnchoredScopes$runtime_release(slotTable.openWriter(), listMoveTo, new RecomposeScopeOwner() { // from class: androidx.compose.runtime.changelist.OperationKt$releaseMovableGroupAtCurrent$movableContentRecomposeScopeOwner$1
                        @Override // androidx.compose.runtime.RecomposeScopeOwner
                        public void recomposeScopeReleased(@NotNull RecomposeScopeImpl scope) {
                        }

                        @Override // androidx.compose.runtime.RecomposeScopeOwner
                        public void recordReadOf(@NotNull Object value) {
                        }

                        @Override // androidx.compose.runtime.RecomposeScopeOwner
                        @NotNull
                        public InvalidationResult invalidate(@NotNull RecomposeScopeImpl scope, @Nullable Object instance) {
                            InvalidationResult invalidationResultInvalidate;
                            ControlledComposition controlledComposition2 = controlledComposition;
                            IdentityArraySet identityArraySet = null;
                            RecomposeScopeOwner recomposeScopeOwner = controlledComposition2 instanceof RecomposeScopeOwner ? (RecomposeScopeOwner) controlledComposition2 : null;
                            if (recomposeScopeOwner == null || (invalidationResultInvalidate = recomposeScopeOwner.invalidate(scope, instance)) == null) {
                                invalidationResultInvalidate = InvalidationResult.IGNORED;
                            }
                            if (invalidationResultInvalidate != InvalidationResult.IGNORED) {
                                return invalidationResultInvalidate;
                            }
                            MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
                            List<Pair<RecomposeScopeImpl, IdentityArraySet<Object>>> invalidations$runtime_release = movableContentStateReference2.getInvalidations$runtime_release();
                            if (instance != null) {
                                identityArraySet = new IdentityArraySet();
                                identityArraySet.add(identityArraySet);
                            }
                            movableContentStateReference2.setInvalidations$runtime_release(CollectionsKt___CollectionsKt.plus((Collection<? extends Pair>) invalidations$runtime_release, TuplesKt.m7112to(scope, identityArraySet)));
                            return InvalidationResult.SCHEDULED;
                        }
                    });
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            }
            compositionContext.movableContentStateReleased$runtime_release(movableContentStateReference, movableContentState);
        } finally {
        }
    }
}
