package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SlotTable.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u0015\n\u0002\b\u0010\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010@\u001a\u00020;2\b\b\u0002\u0010A\u001a\u00020\nJ\u0006\u0010B\u001a\u00020CJ\u0006\u0010D\u001a\u00020CJ\u000e\u0010E\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\nJ\u0006\u0010F\u001a\u00020CJ\u0006\u0010G\u001a\u00020CJ\f\u0010H\u001a\b\u0012\u0004\u0012\u00020J0IJ\u0010\u0010K\u001a\u0004\u0018\u00010\u00012\u0006\u0010A\u001a\u00020\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010A\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010A\u001a\u00020\nJ\u0010\u0010L\u001a\u0004\u0018\u00010\u00012\u0006\u0010A\u001a\u00020\nJ\u0018\u0010L\u001a\u0004\u0018\u00010\u00012\u0006\u0010M\u001a\u00020\n2\u0006\u0010A\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010@\u001a\u00020;J\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010A\u001a\u00020\nJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010A\u001a\u00020\nJ\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010A\u001a\u00020\nJ\u000e\u0010N\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\nJ\u000e\u0010O\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\nJ\u000e\u0010*\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\nJ\b\u0010P\u001a\u0004\u0018\u00010\u0001J\u0010\u0010Q\u001a\u0004\u0018\u00010\u00012\u0006\u0010A\u001a\u00020\nJ\u000e\u0010+\u001a\u00020\n2\u0006\u0010A\u001a\u00020\nJ\u000e\u0010-\u001a\u00020\n2\u0006\u0010A\u001a\u00020\nJ\u000e\u0010R\u001a\u00020\n2\u0006\u0010A\u001a\u00020\nJ\u000e\u0010S\u001a\u00020C2\u0006\u0010A\u001a\u00020\nJ\u000e\u0010T\u001a\u00020C2\u0006\u0010A\u001a\u00020\nJ\u0006\u0010U\u001a\u00020\nJ\u0006\u0010V\u001a\u00020CJ\u0006\u0010W\u001a\u00020CJ\u0006\u0010X\u001a\u00020CJ\b\u0010Y\u001a\u00020ZH\u0016J\u0016\u0010[\u001a\u0004\u0018\u00010\u0001*\u00020%2\u0006\u0010A\u001a\u00020\nH\u0002J\u0016\u0010Q\u001a\u0004\u0018\u00010\u0001*\u00020%2\u0006\u0010A\u001a\u00020\nH\u0002J\u0016\u0010\\\u001a\u0004\u0018\u00010\u0001*\u00020%2\u0006\u0010A\u001a\u00020\nH\u0002R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u0018\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\rR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u001e\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\rR\u0011\u0010 \u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b!\u0010\rR\u0011\u0010\"\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b#\u0010\rR\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010'\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b(\u0010\tR\u0011\u0010)\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b)\u0010\tR\u0011\u0010*\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b*\u0010\tR\u0011\u0010+\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b,\u0010\rR\u001e\u0010-\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\rR\u0011\u0010/\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b0\u0010\rR\u0011\u00101\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b2\u0010\rR\u0011\u00103\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b4\u0010\rR\u0018\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000106X\u0082\u0004¢\u0006\u0004\n\u0002\u00107R\u000e\u00108\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R.\u00109\u001a\"\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<\u0018\u00010:j\u0010\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<\u0018\u0001`=X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?¨\u0006]"}, m7105d2 = {"Landroidx/compose/runtime/SlotReader;", "", "table", "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "<set-?>", "", "closed", "getClosed", "()Z", "", "currentEnd", "getCurrentEnd", "()I", "currentGroup", "getCurrentGroup", "currentSlot", "currentSlotEnd", "emptyCount", "groupAux", "getGroupAux", "()Ljava/lang/Object;", "groupEnd", "getGroupEnd", "groupKey", "getGroupKey", "groupNode", "getGroupNode", "groupObjectKey", "getGroupObjectKey", "groupSize", "getGroupSize", "groupSlotCount", "getGroupSlotCount", "groupSlotIndex", "getGroupSlotIndex", "groups", "", "groupsSize", "inEmpty", "getInEmpty", "isGroupEnd", "isNode", "nodeCount", "getNodeCount", "parent", "getParent", "parentNodes", "getParentNodes", "size", "getSize", "slot", "getSlot", "slots", "", "[Ljava/lang/Object;", "slotsSize", "sourceInformationMap", "Ljava/util/HashMap;", "Landroidx/compose/runtime/Anchor;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", LinkHeader.Parameters.Anchor, FirebaseAnalytics.Param.INDEX, "beginEmpty", "", "close", "containsMark", "endEmpty", "endGroup", "extractKeys", "", "Landroidx/compose/runtime/KeyInfo;", "get", "groupGet", "group", "hasMark", "hasObjectKey", LinkHeader.Rel.Next, "node", "parentOf", "reposition", "restoreParent", "skipGroup", "skipToGroupEnd", "startGroup", "startNode", "toString", "", "aux", "objectKey", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n1#1,3745:1\n1#2:3746\n4178#3,5:3747\n4178#3,5:3752\n4178#3,5:3757\n4178#3,5:3762\n4178#3,5:3767\n3616#4,6:3772\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n*L\n1130#1:3747,5\n1140#1:3752,5\n1148#1:3757,5\n1167#1:3762,5\n1181#1:3767,5\n1223#1:3772,6\n*E\n"})
/* loaded from: classes.dex */
public final class SlotReader {
    public static final int $stable = 8;
    private boolean closed;

    /* renamed from: currentEnd, reason: from kotlin metadata and from toString */
    private int end;

    /* renamed from: currentGroup, reason: from kotlin metadata and from toString */
    private int current;
    private int currentSlot;
    private int currentSlotEnd;
    private int emptyCount;

    @NotNull
    private final int[] groups;
    private final int groupsSize;
    private int parent;

    @NotNull
    private final Object[] slots;
    private final int slotsSize;

    @Nullable
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;

    @NotNull
    private final SlotTable table;

    public SlotReader(@NotNull SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        int groupsSize = slotTable.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = slotTable.getSlots();
        this.slotsSize = slotTable.getSlotsSize();
        this.end = groupsSize;
        this.parent = -1;
    }

    @NotNull
    /* renamed from: getTable$runtime_release, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    /* renamed from: getCurrentGroup, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    /* renamed from: getCurrentEnd, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    public final int getParent() {
        return this.parent;
    }

    /* renamed from: getSize, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final int getSlot() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    public final int parent(int i) {
        return SlotTableKt.parentAnchor(this.groups, i);
    }

    public final boolean isNode() {
        return SlotTableKt.isNode(this.groups, this.current);
    }

    public final boolean isNode(int i) {
        return SlotTableKt.isNode(this.groups, i);
    }

    public final int getNodeCount() {
        return SlotTableKt.nodeCount(this.groups, this.current);
    }

    public final int nodeCount(int i) {
        return SlotTableKt.nodeCount(this.groups, i);
    }

    @Nullable
    public final Object node(int i) {
        if (SlotTableKt.isNode(this.groups, i)) {
            return node(this.groups, i);
        }
        return null;
    }

    public final boolean isGroupEnd() {
        return getInEmpty() || this.current == this.end;
    }

    public final boolean getInEmpty() {
        return this.emptyCount > 0;
    }

    public final int getGroupSize() {
        return SlotTableKt.groupSize(this.groups, this.current);
    }

    public final int groupSize(int i) {
        return SlotTableKt.groupSize(this.groups, i);
    }

    public final int getGroupEnd() {
        return this.end;
    }

    public final int groupEnd(int i) {
        return i + SlotTableKt.groupSize(this.groups, i);
    }

    public final int getGroupKey() {
        int i = this.current;
        if (i < this.end) {
            return SlotTableKt.key(this.groups, i);
        }
        return 0;
    }

    public final int groupKey(int i) {
        return SlotTableKt.key(this.groups, i);
    }

    public final int getGroupSlotIndex() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    public final boolean hasObjectKey(int i) {
        return SlotTableKt.hasObjectKey(this.groups, i);
    }

    @Nullable
    public final Object getGroupObjectKey() {
        int i = this.current;
        if (i < this.end) {
            return objectKey(this.groups, i);
        }
        return null;
    }

    @Nullable
    public final Object groupObjectKey(int i) {
        return objectKey(this.groups, i);
    }

    @Nullable
    public final Object getGroupAux() {
        int i = this.current;
        if (i < this.end) {
            return aux(this.groups, i);
        }
        return 0;
    }

    @Nullable
    public final Object groupAux(int i) {
        return aux(this.groups, i);
    }

    @Nullable
    public final Object getGroupNode() {
        int i = this.current;
        if (i < this.end) {
            return node(this.groups, i);
        }
        return null;
    }

    public final int groupKey(@NotNull Anchor anchor) {
        if (anchor.getValid()) {
            return SlotTableKt.key(this.groups, this.table.anchorIndex(anchor));
        }
        return 0;
    }

    public final boolean hasMark(int i) {
        return SlotTableKt.hasMark(this.groups, i);
    }

    public final boolean containsMark(int i) {
        return SlotTableKt.containsMark(this.groups, i);
    }

    public final int getParentNodes() {
        int i = this.parent;
        if (i >= 0) {
            return SlotTableKt.nodeCount(this.groups, i);
        }
        return 0;
    }

    public final int parentOf(int i) {
        if (i >= 0 && i < this.groupsSize) {
            return SlotTableKt.parentAnchor(this.groups, i);
        }
        throw new IllegalArgumentException(("Invalid group index " + i).toString());
    }

    public final int getGroupSlotCount() {
        int i = this.current;
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i);
        int i2 = i + 1;
        return (i2 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i2) : this.slotsSize) - iSlotAnchor;
    }

    @Nullable
    public final Object get(int i) {
        int i2 = this.currentSlot + i;
        return i2 < this.currentSlotEnd ? this.slots[i2] : Composer.INSTANCE.getEmpty();
    }

    @Nullable
    public final Object groupGet(int i) {
        return groupGet(this.current, i);
    }

    @Nullable
    public final Object groupGet(int group, int i) {
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, group);
        int i2 = group + 1;
        int i3 = iSlotAnchor + i;
        return i3 < (i2 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i2) : this.slotsSize) ? this.slots[i3] : Composer.INSTANCE.getEmpty();
    }

    @Nullable
    public final Object next() {
        int i;
        if (this.emptyCount > 0 || (i = this.currentSlot) >= this.currentSlotEnd) {
            return Composer.INSTANCE.getEmpty();
        }
        Object[] objArr = this.slots;
        this.currentSlot = i + 1;
        return objArr[i];
    }

    public final void beginEmpty() {
        this.emptyCount++;
    }

    public final void endEmpty() {
        int i = this.emptyCount;
        if (i <= 0) {
            throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
        }
        this.emptyCount = i - 1;
    }

    public final void close() {
        this.closed = true;
        this.table.close$runtime_release(this, this.sourceInformationMap);
    }

    public final void startGroup() {
        int iDataAnchor;
        GroupSourceInformation groupSourceInformation;
        if (this.emptyCount <= 0) {
            int i = this.parent;
            int i2 = this.current;
            if (SlotTableKt.parentAnchor(this.groups, i2) != i) {
                throw new IllegalArgumentException("Invalid slot table detected".toString());
            }
            HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
            if (map != null && (groupSourceInformation = map.get(anchor(i))) != null) {
                groupSourceInformation.reportGroup(this.table, i2);
            }
            this.parent = i2;
            this.end = SlotTableKt.groupSize(this.groups, i2) + i2;
            int i3 = i2 + 1;
            this.current = i3;
            this.currentSlot = SlotTableKt.slotAnchor(this.groups, i2);
            if (i2 < this.groupsSize - 1) {
                iDataAnchor = SlotTableKt.dataAnchor(this.groups, i3);
            } else {
                iDataAnchor = this.slotsSize;
            }
            this.currentSlotEnd = iDataAnchor;
        }
    }

    public final void startNode() {
        if (this.emptyCount <= 0) {
            if (!SlotTableKt.isNode(this.groups, this.current)) {
                throw new IllegalArgumentException("Expected a node group".toString());
            }
            startGroup();
        }
    }

    public final int skipGroup() {
        if (this.emptyCount == 0) {
            int iNodeCount = SlotTableKt.isNode(this.groups, this.current) ? 1 : SlotTableKt.nodeCount(this.groups, this.current);
            int i = this.current;
            this.current = i + SlotTableKt.groupSize(this.groups, i);
            return iNodeCount;
        }
        ComposerKt.composeRuntimeError("Cannot skip while in an empty region".toString());
        throw new KotlinNothingValueException();
    }

    public final void skipToGroupEnd() {
        if (this.emptyCount == 0) {
            this.current = this.end;
        } else {
            ComposerKt.composeRuntimeError("Cannot skip the enclosing group while in an empty region".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void reposition(int i) {
        if (this.emptyCount == 0) {
            this.current = i;
            int iParentAnchor = i < this.groupsSize ? SlotTableKt.parentAnchor(this.groups, i) : -1;
            this.parent = iParentAnchor;
            if (iParentAnchor >= 0) {
                this.end = iParentAnchor + SlotTableKt.groupSize(this.groups, iParentAnchor);
            } else {
                this.end = this.groupsSize;
            }
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            return;
        }
        ComposerKt.composeRuntimeError("Cannot reposition while in an empty region".toString());
        throw new KotlinNothingValueException();
    }

    public final void restoreParent(int i) {
        int iGroupSize = SlotTableKt.groupSize(this.groups, i) + i;
        int i2 = this.current;
        if (!(i2 >= i && i2 <= iGroupSize)) {
            ComposerKt.composeRuntimeError(("Index " + i + " is not a parent of " + i2).toString());
            throw new KotlinNothingValueException();
        }
        this.parent = i;
        this.end = iGroupSize;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void endGroup() {
        int iGroupSize;
        if (this.emptyCount == 0) {
            if (this.current == this.end) {
                int iParentAnchor = SlotTableKt.parentAnchor(this.groups, this.parent);
                this.parent = iParentAnchor;
                if (iParentAnchor >= 0) {
                    iGroupSize = iParentAnchor + SlotTableKt.groupSize(this.groups, iParentAnchor);
                } else {
                    iGroupSize = this.groupsSize;
                }
                this.end = iGroupSize;
                return;
            }
            ComposerKt.composeRuntimeError("endGroup() not called at the end of a group".toString());
            throw new KotlinNothingValueException();
        }
    }

    @NotNull
    public final List<KeyInfo> extractKeys() {
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount > 0) {
            return arrayList;
        }
        int iGroupSize = this.current;
        int i = 0;
        while (iGroupSize < this.end) {
            arrayList.add(new KeyInfo(SlotTableKt.key(this.groups, iGroupSize), objectKey(this.groups, iGroupSize), iGroupSize, SlotTableKt.isNode(this.groups, iGroupSize) ? 1 : SlotTableKt.nodeCount(this.groups, iGroupSize), i));
            iGroupSize += SlotTableKt.groupSize(this.groups, iGroupSize);
            i++;
        }
        return arrayList;
    }

    @NotNull
    public String toString() {
        return "SlotReader(current=" + this.current + ", key=" + getGroupKey() + ", parent=" + this.parent + ", end=" + this.end + ')';
    }

    public static /* synthetic */ Anchor anchor$default(SlotReader slotReader, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotReader.current;
        }
        return slotReader.anchor(i);
    }

    @NotNull
    public final Anchor anchor(int i) {
        ArrayList<Anchor> anchors$runtime_release = this.table.getAnchors$runtime_release();
        int iSearch = SlotTableKt.search(anchors$runtime_release, i, this.groupsSize);
        if (iSearch < 0) {
            Anchor anchor = new Anchor(i);
            anchors$runtime_release.add(-(iSearch + 1), anchor);
            return anchor;
        }
        return anchors$runtime_release.get(iSearch);
    }

    private final Object node(int[] iArr, int i) {
        if (SlotTableKt.isNode(iArr, i)) {
            return this.slots[SlotTableKt.nodeIndex(iArr, i)];
        }
        return Composer.INSTANCE.getEmpty();
    }

    private final Object aux(int[] iArr, int i) {
        if (SlotTableKt.hasAux(iArr, i)) {
            return this.slots[SlotTableKt.auxIndex(iArr, i)];
        }
        return Composer.INSTANCE.getEmpty();
    }

    private final Object objectKey(int[] iArr, int i) {
        if (SlotTableKt.hasObjectKey(iArr, i)) {
            return this.slots[SlotTableKt.objectKeyIndex(iArr, i)];
        }
        return null;
    }
}
