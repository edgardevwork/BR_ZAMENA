package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.apache.http.protocol.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SlotTable.kt */
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0012\u0010&\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020\rH\u0016J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020+H\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0016\u0010\u001f\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0010¨\u0006,"}, m7105d2 = {"Landroidx/compose/runtime/SlotTableGroup;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", "table", "Landroidx/compose/runtime/SlotTable;", "group", "", "version", "(Landroidx/compose/runtime/SlotTable;II)V", "compositionGroups", "getCompositionGroups", "()Ljava/lang/Iterable;", "data", "", "getData", "getGroup", "()I", "groupSize", "getGroupSize", HTTP.IDENTITY_CODING, "getIdentity", "()Ljava/lang/Object;", "isEmpty", "", "()Z", "key", "getKey", "node", "getNode", "slotsSize", "getSlotsSize", "sourceInfo", "", "getSourceInfo", "()Ljava/lang/String;", "getTable", "()Landroidx/compose/runtime/SlotTable;", "getVersion", "find", "identityToFind", "iterator", "", "validateRead", "", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3745:1\n150#2,8:3746\n1#3:3754\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n*L\n3277#1:3746,8\n*E\n"})
/* loaded from: classes4.dex */
public final class SlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, KMappedMarker {
    public final int group;

    @NotNull
    public final SlotTable table;
    public final int version;

    @Override // androidx.compose.runtime.tooling.CompositionData
    @NotNull
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    public SlotTableGroup(@NotNull SlotTable slotTable, int i, int i2) {
        this.table = slotTable;
        this.group = i;
        this.version = i2;
    }

    @NotNull
    public final SlotTable getTable() {
        return this.table;
    }

    public final int getGroup() {
        return this.group;
    }

    public /* synthetic */ SlotTableGroup(SlotTable slotTable, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(slotTable, i, (i3 & 4) != 0 ? slotTable.getVersion() : i2);
    }

    public final int getVersion() {
        return this.version;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return SlotTableKt.groupSize(this.table.getGroups(), this.group) == 0;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @NotNull
    public Object getKey() {
        if (SlotTableKt.hasObjectKey(this.table.getGroups(), this.group)) {
            Object obj = this.table.getSlots()[SlotTableKt.objectKeyIndex(this.table.getGroups(), this.group)];
            Intrinsics.checkNotNull(obj);
            return obj;
        }
        return Integer.valueOf(SlotTableKt.key(this.table.getGroups(), this.group));
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @Nullable
    public String getSourceInfo() {
        HashMap<Anchor, GroupSourceInformation> sourceInformationMap$runtime_release;
        GroupSourceInformation groupSourceInformation;
        if (SlotTableKt.hasAux(this.table.getGroups(), this.group)) {
            Object obj = this.table.getSlots()[SlotTableKt.auxIndex(this.table.getGroups(), this.group)];
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }
        Anchor anchorTryAnchor = this.table.tryAnchor(this.group);
        if (anchorTryAnchor == null || (sourceInformationMap$runtime_release = this.table.getSourceInformationMap$runtime_release()) == null || (groupSourceInformation = sourceInformationMap$runtime_release.get(anchorTryAnchor)) == null) {
            return null;
        }
        return groupSourceInformation.getSourceInformation();
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @Nullable
    public Object getNode() {
        if (SlotTableKt.isNode(this.table.getGroups(), this.group)) {
            return this.table.getSlots()[SlotTableKt.nodeIndex(this.table.getGroups(), this.group)];
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @NotNull
    public Iterable<Object> getData() {
        return new DataIterator(this.table, this.group);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @NotNull
    public Object getIdentity() {
        validateRead();
        SlotReader slotReaderOpenReader = this.table.openReader();
        try {
            return slotReaderOpenReader.anchor(this.group);
        } finally {
            slotReaderOpenReader.close();
        }
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<CompositionGroup> iterator() {
        validateRead();
        GroupSourceInformation groupSourceInformationSourceInformationOf = this.table.sourceInformationOf(this.group);
        if (groupSourceInformationSourceInformationOf != null) {
            return new SourceInformationGroupIterator(this.table, groupSourceInformationSourceInformationOf);
        }
        SlotTable slotTable = this.table;
        int i = this.group;
        return new GroupIterator(slotTable, i + 1, i + SlotTableKt.groupSize(slotTable.getGroups(), this.group));
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getGroupSize() {
        return SlotTableKt.groupSize(this.table.getGroups(), this.group);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getSlotsSize() {
        int slotsSize;
        int groupSize = this.group + getGroupSize();
        if (groupSize < this.table.getGroupsSize()) {
            slotsSize = SlotTableKt.dataAnchor(this.table.getGroups(), groupSize);
        } else {
            slotsSize = this.table.getSlotsSize();
        }
        return slotsSize - SlotTableKt.dataAnchor(this.table.getGroups(), this.group);
    }

    private final void validateRead() {
        if (this.table.getVersion() != this.version) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @Nullable
    public CompositionGroup find(@NotNull Object identityToFind) {
        int iAnchorIndex;
        int i;
        Anchor anchor = identityToFind instanceof Anchor ? (Anchor) identityToFind : null;
        if (anchor == null || !this.table.ownsAnchor(anchor) || (iAnchorIndex = this.table.anchorIndex(anchor)) < (i = this.group) || iAnchorIndex - i >= SlotTableKt.groupSize(this.table.getGroups(), this.group)) {
            return null;
        }
        return new SlotTableGroup(this.table, iAnchorIndex, this.version);
    }
}
