package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SlotTable.kt */
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001fH\u0096\u0002R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, m7105d2 = {"Landroidx/compose/runtime/SourceInformationSlotTableGroup;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", "table", "Landroidx/compose/runtime/SlotTable;", "sourceInformation", "Landroidx/compose/runtime/GroupSourceInformation;", "(Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/GroupSourceInformation;)V", "compositionGroups", "getCompositionGroups", "()Ljava/lang/Iterable;", "data", "", "getData", "isEmpty", "", "()Z", "key", "getKey", "()Ljava/lang/Object;", "node", "getNode", "sourceInfo", "", "getSourceInfo", "()Ljava/lang/String;", "getSourceInformation", "()Landroidx/compose/runtime/GroupSourceInformation;", "getTable", "()Landroidx/compose/runtime/SlotTable;", "iterator", "", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class SourceInformationSlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, KMappedMarker {

    @NotNull
    public final Object key;

    @NotNull
    public final GroupSourceInformation sourceInformation;

    @NotNull
    public final SlotTable table;

    @NotNull
    public final Iterable<Object> data = CollectionsKt__CollectionsKt.emptyList();

    @NotNull
    public final Iterable<CompositionGroup> compositionGroups = this;

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @Nullable
    public Object getNode() {
        return null;
    }

    public SourceInformationSlotTableGroup(@NotNull SlotTable slotTable, @NotNull GroupSourceInformation groupSourceInformation) {
        this.table = slotTable;
        this.sourceInformation = groupSourceInformation;
        this.key = Integer.valueOf(groupSourceInformation.getKey());
    }

    @NotNull
    public final SlotTable getTable() {
        return this.table;
    }

    @NotNull
    public final GroupSourceInformation getSourceInformation() {
        return this.sourceInformation;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @NotNull
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @Nullable
    public String getSourceInfo() {
        return this.sourceInformation.getSourceInformation();
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @NotNull
    public Iterable<Object> getData() {
        return this.data;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @NotNull
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this.compositionGroups;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        ArrayList<Object> groups = this.sourceInformation.getGroups();
        boolean z = false;
        if (groups != null && !groups.isEmpty()) {
            z = true;
        }
        return !z;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<CompositionGroup> iterator() {
        return new SourceInformationGroupIterator(this.table, this.sourceInformation);
    }
}
