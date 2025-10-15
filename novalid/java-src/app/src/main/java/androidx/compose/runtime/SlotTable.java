package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.http.LinkHeader;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SlotTable.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0015J\u000e\u00105\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u0007J\u0006\u00106\u001a\u000207J=\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2&\u0010%\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u00010&j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u0001`(H\u0000¢\u0006\u0002\b<J\u007f\u00108\u001a\u0002092\u0006\u00101\u001a\u00020=2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d2\u0006\u0010#\u001a\u00020\u00152\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2&\u0010%\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u00010&j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u0001`(H\u0000¢\u0006\u0004\b<\u0010>J\u0006\u0010?\u001a\u00020\u001aJ\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00150AH\u0002J\u0012\u0010B\u001a\u0004\u0018\u00010\u00032\u0006\u0010C\u001a\u00020\u001eH\u0016J\u0012\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010F\u001a\u00020\u0015H\u0002J\u0016\u0010G\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u0007J\u000e\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00150AH\u0002J\u001d\u0010J\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010A2\u0006\u0010K\u001a\u00020\u0015H\u0000¢\u0006\u0002\bLJ\u000f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00030NH\u0096\u0002J\u000e\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00150AH\u0002J\u000e\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00150AH\u0002J\u0006\u0010Q\u001a\u00020;J\u0006\u0010R\u001a\u00020=J\u000e\u0010S\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u0007J\u000e\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00150AH\u0002J7\u0010U\u001a\u0002HV\"\u0004\b\u0000\u0010V2!\u0010W\u001a\u001d\u0012\u0013\u0012\u00110;¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(:\u0012\u0004\u0012\u0002HV0XH\u0086\b¢\u0006\u0002\u0010[Jw\u0010\\\u001a\u0002092\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d2\u0006\u0010#\u001a\u00020\u00152\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2&\u0010%\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u00010&j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u0001`(H\u0000¢\u0006\u0004\b]\u0010^J\u001f\u0010_\u001a\u0004\u0018\u00010\u001e2\u0006\u0010F\u001a\u00020\u00152\u0006\u0010`\u001a\u00020\u0015H\u0000¢\u0006\u0002\baJ\u001d\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0A2\u0006\u0010F\u001a\u00020\u0015H\u0000¢\u0006\u0002\bcJ\u0010\u0010d\u001a\u0004\u0018\u00010'2\u0006\u0010F\u001a\u00020\u0015J\u0010\u0010e\u001a\u0004\u0018\u00010\u00072\u0006\u00104\u001a\u00020\u0015J\u0006\u0010f\u001a\u000209J7\u0010g\u001a\u0002HV\"\u0004\b\u0000\u0010V2!\u0010W\u001a\u001d\u0012\u0013\u0012\u00110=¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(1\u0012\u0004\u0012\u0002HV0XH\u0086\b¢\u0006\u0002\u0010[J \u0010h\u001a\u00020\u0015*\u00060ij\u0002`j2\u0006\u00104\u001a\u00020\u00152\u0006\u0010k\u001a\u00020\u0015H\u0002R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u001e\u0010#\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R:\u0010%\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u00010&j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u0001`(X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u00100R\u001e\u00101\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u001a@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001b¨\u0006l"}, m7105d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "()V", "anchors", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "getAnchors$runtime_release", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "compositionGroups", "getCompositionGroups", "()Ljava/lang/Iterable;", "<set-?>", "", "groups", "getGroups", "()[I", "", "groupsSize", "getGroupsSize", "()I", "isEmpty", "", "()Z", "readers", "", "", "slots", "getSlots", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "slotsSize", "getSlotsSize", "sourceInformationMap", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "getSourceInformationMap$runtime_release", "()Ljava/util/HashMap;", "setSourceInformationMap$runtime_release", "(Ljava/util/HashMap;)V", "version", "getVersion$runtime_release", "setVersion$runtime_release", "(I)V", "writer", "getWriter$runtime_release", LinkHeader.Parameters.Anchor, FirebaseAnalytics.Param.INDEX, "anchorIndex", "asString", "", "close", "", "reader", "Landroidx/compose/runtime/SlotReader;", "close$runtime_release", "Landroidx/compose/runtime/SlotWriter;", "(Landroidx/compose/runtime/SlotWriter;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;)V", "containsMark", "dataIndexes", "", "find", "identityToFind", "findEffectiveRecomposeScope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "group", "groupContainsAnchor", "groupIndex", "groupSizes", "invalidateGroupsWithKey", "target", "invalidateGroupsWithKey$runtime_release", "iterator", "", "keys", "nodes", "openReader", "openWriter", "ownsAnchor", "parentIndexes", "read", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "setTo", "setTo$runtime_release", "([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;)V", "slot", "slotIndex", "slot$runtime_release", "slotsOf", "slotsOf$runtime_release", "sourceInformationOf", "tryAnchor", "verifyWellFormed", "write", "emitGroup", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "level", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 5 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 6 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3745:1\n150#1,8:3794\n166#1,4:3802\n171#1,3:3812\n4178#2,5:3746\n4178#2,5:3751\n4178#2,5:3756\n4178#2,5:3768\n4178#2,5:3773\n4178#2,5:3778\n4178#2,5:3783\n4178#2,5:3788\n1#3:3761\n3616#4,6:3762\n82#5:3793\n33#6,6:3806\n33#6,6:3815\n33#6,6:3821\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n338#1:3794,8\n367#1:3802,4\n367#1:3812,3\n194#1:3746,5\n195#1:3751,5\n211#1:3756,5\n222#1:3768,5\n233#1:3773,5\n253#1:3778,5\n254#1:3783,5\n266#1:3788,5\n213#1:3762,6\n269#1:3793\n369#1:3806,6\n500#1:3815,6\n509#1:3821,6\n*E\n"})
/* loaded from: classes2.dex */
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, KMappedMarker {
    public static final int $stable = 8;
    private int groupsSize;
    private int readers;
    private int slotsSize;

    @Nullable
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private int version;
    private boolean writer;

    @NotNull
    private int[] groups = new int[0];

    @NotNull
    private Object[] slots = new Object[0];

    @NotNull
    private ArrayList<Anchor> anchors = new ArrayList<>();

    @Override // androidx.compose.runtime.tooling.CompositionData
    @NotNull
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    @NotNull
    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    @NotNull
    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    /* renamed from: getWriter$runtime_release, reason: from getter */
    public final boolean getWriter() {
        return this.writer;
    }

    /* renamed from: getVersion$runtime_release, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final void setVersion$runtime_release(int i) {
        this.version = i;
    }

    @NotNull
    public final ArrayList<Anchor> getAnchors$runtime_release() {
        return this.anchors;
    }

    public final void setAnchors$runtime_release(@NotNull ArrayList<Anchor> arrayList) {
        this.anchors = arrayList;
    }

    @Nullable
    public final HashMap<Anchor, GroupSourceInformation> getSourceInformationMap$runtime_release() {
        return this.sourceInformationMap;
    }

    public final void setSourceInformationMap$runtime_release(@Nullable HashMap<Anchor, GroupSourceInformation> map) {
        this.sourceInformationMap = map;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    public final <T> T read(@NotNull Function1<? super SlotReader, ? extends T> block) {
        SlotReader slotReaderOpenReader = openReader();
        try {
            return block.invoke(slotReaderOpenReader);
        } finally {
            InlineMarker.finallyStart(1);
            slotReaderOpenReader.close();
            InlineMarker.finallyEnd(1);
        }
    }

    public final <T> T write(@NotNull Function1<? super SlotWriter, ? extends T> block) {
        SlotWriter slotWriterOpenWriter = openWriter();
        try {
            return block.invoke(slotWriterOpenWriter);
        } finally {
            InlineMarker.finallyStart(1);
            slotWriterOpenWriter.close();
            InlineMarker.finallyEnd(1);
        }
    }

    @NotNull
    public final SlotReader openReader() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.readers++;
        return new SlotReader(this);
    }

    @NotNull
    public final SlotWriter openWriter() {
        if (!this.writer) {
            if (this.readers <= 0) {
                this.writer = true;
                this.version++;
                return new SlotWriter(this);
            }
            ComposerKt.composeRuntimeError("Cannot start a writer when a reader is pending".toString());
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("Cannot start a writer when another writer is pending".toString());
        throw new KotlinNothingValueException();
    }

    @NotNull
    public final Anchor anchor(int i) {
        int i2;
        if (!(!this.writer)) {
            ComposerKt.composeRuntimeError("use active SlotWriter to create an anchor location instead".toString());
            throw new KotlinNothingValueException();
        }
        if (i < 0 || i >= (i2 = this.groupsSize)) {
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int iSearch = SlotTableKt.search(arrayList, i, i2);
        if (iSearch < 0) {
            Anchor anchor = new Anchor(i);
            arrayList.add(-(iSearch + 1), anchor);
            return anchor;
        }
        return arrayList.get(iSearch);
    }

    @Nullable
    public final Anchor tryAnchor(int i) {
        int i2;
        if (!(!this.writer)) {
            ComposerKt.composeRuntimeError("use active SlotWriter to crate an anchor for location instead".toString());
            throw new KotlinNothingValueException();
        }
        if (i < 0 || i >= (i2 = this.groupsSize)) {
            return null;
        }
        return SlotTableKt.find(this.anchors, i, i2);
    }

    public final int anchorIndex(@NotNull Anchor anchor) {
        if (!this.writer) {
            if (!anchor.getValid()) {
                throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
            }
            return anchor.getLocation();
        }
        ComposerKt.composeRuntimeError("Use active SlotWriter to determine anchor location instead".toString());
        throw new KotlinNothingValueException();
    }

    public final boolean ownsAnchor(@NotNull Anchor anchor) {
        int iSearch;
        return anchor.getValid() && (iSearch = SlotTableKt.search(this.anchors, anchor.getLocation(), this.groupsSize)) >= 0 && Intrinsics.areEqual(this.anchors.get(iSearch), anchor);
    }

    public final boolean groupContainsAnchor(int groupIndex, @NotNull Anchor anchor) {
        if (!this.writer) {
            if (groupIndex >= 0 && groupIndex < this.groupsSize) {
                if (ownsAnchor(anchor)) {
                    int iGroupSize = SlotTableKt.groupSize(this.groups, groupIndex) + groupIndex;
                    int location = anchor.getLocation();
                    if (groupIndex <= location && location < iGroupSize) {
                        return true;
                    }
                }
                return false;
            }
            ComposerKt.composeRuntimeError("Invalid group index".toString());
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("Writer is active".toString());
        throw new KotlinNothingValueException();
    }

    public final void close$runtime_release(@NotNull SlotReader reader, @Nullable HashMap<Anchor, GroupSourceInformation> sourceInformationMap) {
        if (reader.getTable() == this && this.readers > 0) {
            this.readers--;
            if (sourceInformationMap != null) {
                synchronized (this) {
                    try {
                        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
                        if (map != null) {
                            map.putAll(sourceInformationMap);
                        } else {
                            this.sourceInformationMap = sourceInformationMap;
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("Unexpected reader close()".toString());
        throw new KotlinNothingValueException();
    }

    public final void close$runtime_release(@NotNull SlotWriter writer, @NotNull int[] groups, int groupsSize, @NotNull Object[] slots, int slotsSize, @NotNull ArrayList<Anchor> anchors, @Nullable HashMap<Anchor, GroupSourceInformation> sourceInformationMap) {
        if (writer.getTable() != this || !this.writer) {
            throw new IllegalArgumentException("Unexpected writer close()".toString());
        }
        this.writer = false;
        setTo$runtime_release(groups, groupsSize, slots, slotsSize, anchors, sourceInformationMap);
    }

    public final void setTo$runtime_release(@NotNull int[] groups, int groupsSize, @NotNull Object[] slots, int slotsSize, @NotNull ArrayList<Anchor> anchors, @Nullable HashMap<Anchor, GroupSourceInformation> sourceInformationMap) {
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = anchors;
        this.sourceInformationMap = sourceInformationMap;
    }

    @Nullable
    public final List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release(int target) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        SlotReader slotReaderOpenReader = openReader();
        try {
            invalidateGroupsWithKey$lambda$16$scanGroup(slotReaderOpenReader, target, arrayList, booleanRef, this, arrayList2);
            Unit unit = Unit.INSTANCE;
            slotReaderOpenReader.close();
            SlotWriter slotWriterOpenWriter = openWriter();
            try {
                slotWriterOpenWriter.startGroup();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Anchor anchor = (Anchor) arrayList.get(i);
                    if (anchor.toIndexFor(slotWriterOpenWriter) >= slotWriterOpenWriter.getCurrentGroup()) {
                        slotWriterOpenWriter.seek(anchor);
                        slotWriterOpenWriter.bashCurrentGroup();
                    }
                }
                slotWriterOpenWriter.skipToGroupEnd();
                slotWriterOpenWriter.endGroup();
                slotWriterOpenWriter.close();
                if (booleanRef.element) {
                    return arrayList2;
                }
                return null;
            } catch (Throwable th) {
                slotWriterOpenWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            slotReaderOpenReader.close();
            throw th2;
        }
    }

    private static final void invalidateGroupsWithKey$lambda$16$scanGroup(SlotReader slotReader, int i, List<Anchor> list, Ref.BooleanRef booleanRef, SlotTable slotTable, List<RecomposeScopeImpl> list2) {
        int groupKey = slotReader.getGroupKey();
        if (groupKey == i || groupKey == -3) {
            if (groupKey != -3) {
                list.add(SlotReader.anchor$default(slotReader, 0, 1, null));
            }
            if (booleanRef.element) {
                RecomposeScopeImpl recomposeScopeImplFindEffectiveRecomposeScope = slotTable.findEffectiveRecomposeScope(slotReader.getCurrent());
                if (recomposeScopeImplFindEffectiveRecomposeScope != null) {
                    list2.add(recomposeScopeImplFindEffectiveRecomposeScope);
                } else {
                    booleanRef.element = false;
                    list2.clear();
                }
            }
            slotReader.skipGroup();
            return;
        }
        slotReader.startGroup();
        while (!slotReader.isGroupEnd()) {
            invalidateGroupsWithKey$lambda$16$scanGroup(slotReader, i, list, booleanRef, slotTable, list2);
        }
        slotReader.endGroup();
    }

    public final boolean containsMark() {
        return this.groupsSize > 0 && SlotTableKt.containsMark(this.groups, 0);
    }

    @Nullable
    public final GroupSourceInformation sourceInformationOf(int group) {
        Anchor anchorTryAnchor;
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null || (anchorTryAnchor = tryAnchor(group)) == null) {
            return null;
        }
        return map.get(anchorTryAnchor);
    }

    private final RecomposeScopeImpl findEffectiveRecomposeScope(int group) {
        int iParentAnchor = group;
        while (iParentAnchor > 0) {
            Iterator<Object> it = new DataIterator(this, iParentAnchor).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof RecomposeScopeImpl) {
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) next;
                    if (recomposeScopeImpl.getUsed() && iParentAnchor != group) {
                        return recomposeScopeImpl;
                    }
                    recomposeScopeImpl.setForcedRecompose(true);
                }
            }
            iParentAnchor = SlotTableKt.parentAnchor(this.groups, iParentAnchor);
        }
        return null;
    }

    public final void verifyWellFormed() {
        int i;
        int i2;
        Ref.IntRef intRef = new Ref.IntRef();
        int i3 = -1;
        if (this.groupsSize > 0) {
            while (true) {
                i = intRef.element;
                i2 = this.groupsSize;
                if (i >= i2) {
                    break;
                } else {
                    verifyWellFormed$validateGroup(intRef, this, -1, i + SlotTableKt.groupSize(this.groups, i));
                }
            }
            if (i != i2) {
                throw new IllegalStateException(("Incomplete group at root " + intRef.element + " expected to be " + this.groupsSize).toString());
            }
        }
        int length = this.slots.length;
        for (int i4 = this.slotsSize; i4 < length; i4++) {
            if (this.slots[i4] != null) {
                throw new IllegalStateException(("Non null value in the slot gap at index " + i4).toString());
            }
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            int indexFor = arrayList.get(i5).toIndexFor(this);
            if (indexFor < 0 || indexFor > this.groupsSize) {
                throw new IllegalArgumentException("Invalid anchor, location out of bound".toString());
            }
            if (i3 >= indexFor) {
                throw new IllegalArgumentException("Anchor is out of order".toString());
            }
            i5++;
            i3 = indexFor;
        }
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map != null) {
            for (Map.Entry<Anchor, GroupSourceInformation> entry : map.entrySet()) {
                Anchor key = entry.getKey();
                GroupSourceInformation value = entry.getValue();
                if (!key.getValid()) {
                    throw new IllegalArgumentException("Source map contains invalid anchor".toString());
                }
                if (!ownsAnchor(key)) {
                    throw new IllegalArgumentException("Source map anchor is not owned by the slot table".toString());
                }
                verifyWellFormed$verifySourceGroup(this, value);
            }
        }
    }

    private static final int verifyWellFormed$validateGroup(Ref.IntRef intRef, SlotTable slotTable, int i, int i2) {
        int i3 = intRef.element;
        int i4 = i3 + 1;
        intRef.element = i4;
        int iParentAnchor = SlotTableKt.parentAnchor(slotTable.groups, i3);
        if (iParentAnchor == i) {
            int iGroupSize = SlotTableKt.groupSize(slotTable.groups, i3) + i3;
            if (iGroupSize > slotTable.groupsSize) {
                throw new IllegalStateException(("A group extends past the end of the table at " + i3).toString());
            }
            if (iGroupSize <= i2) {
                int iDataAnchor = SlotTableKt.dataAnchor(slotTable.groups, i3);
                int iDataAnchor2 = i3 >= slotTable.groupsSize - 1 ? slotTable.slotsSize : SlotTableKt.dataAnchor(slotTable.groups, i4);
                if (iDataAnchor2 > slotTable.slots.length) {
                    throw new IllegalStateException(("Slots for " + i3 + " extend past the end of the slot table").toString());
                }
                if (iDataAnchor <= iDataAnchor2) {
                    if (SlotTableKt.slotAnchor(slotTable.groups, i3) > iDataAnchor2) {
                        throw new IllegalStateException(("Slots start out of range at " + i3).toString());
                    }
                    if (iDataAnchor2 - iDataAnchor >= (SlotTableKt.isNode(slotTable.groups, i3) ? 1 : 0) + (SlotTableKt.hasObjectKey(slotTable.groups, i3) ? 1 : 0) + (SlotTableKt.hasAux(slotTable.groups, i3) ? 1 : 0)) {
                        boolean zIsNode = SlotTableKt.isNode(slotTable.groups, i3);
                        if (zIsNode && slotTable.slots[SlotTableKt.nodeIndex(slotTable.groups, i3)] == null) {
                            throw new IllegalStateException(("No node recorded for a node group at " + i3).toString());
                        }
                        int iVerifyWellFormed$validateGroup = 0;
                        while (intRef.element < iGroupSize) {
                            iVerifyWellFormed$validateGroup += verifyWellFormed$validateGroup(intRef, slotTable, i3, iGroupSize);
                        }
                        int iNodeCount = SlotTableKt.nodeCount(slotTable.groups, i3);
                        int iGroupSize2 = SlotTableKt.groupSize(slotTable.groups, i3);
                        if (iNodeCount != iVerifyWellFormed$validateGroup) {
                            throw new IllegalStateException(("Incorrect node count detected at " + i3 + ", expected " + iNodeCount + ", received " + iVerifyWellFormed$validateGroup).toString());
                        }
                        int i5 = intRef.element - i3;
                        if (iGroupSize2 == i5) {
                            if (!SlotTableKt.containsAnyMark(slotTable.groups, i3) || i3 <= 0 || SlotTableKt.containsMark(slotTable.groups, i)) {
                                if (zIsNode) {
                                    return 1;
                                }
                                return iVerifyWellFormed$validateGroup;
                            }
                            throw new IllegalStateException(("Expected group " + i + " to record it contains a mark because " + i3 + " does").toString());
                        }
                        throw new IllegalStateException(("Incorrect slot count detected at " + i3 + ", expected " + iGroupSize2 + ", received " + i5).toString());
                    }
                    throw new IllegalStateException(("Not enough slots added for group " + i3).toString());
                }
                throw new IllegalStateException(("Invalid data anchor at " + i3).toString());
            }
            throw new IllegalStateException(("A group extends past its parent group at " + i3).toString());
        }
        throw new IllegalStateException(("Invalid parent index detected at " + i3 + ", expected parent index to be " + i + " found " + iParentAnchor).toString());
    }

    private static final void verifyWellFormed$verifySourceGroup(SlotTable slotTable, GroupSourceInformation groupSourceInformation) {
        ArrayList<Object> groups = groupSourceInformation.getGroups();
        if (groups != null) {
            int size = groups.size();
            for (int i = 0; i < size; i++) {
                Object obj = groups.get(i);
                if (obj instanceof Anchor) {
                    Anchor anchor = (Anchor) obj;
                    if (!anchor.getValid()) {
                        throw new IllegalArgumentException("Source map contains invalid anchor".toString());
                    }
                    if (!slotTable.ownsAnchor(anchor)) {
                        throw new IllegalArgumentException("Source map anchor is not owned by the slot table".toString());
                    }
                } else if (obj instanceof GroupSourceInformation) {
                    verifyWellFormed$verifySourceGroup(slotTable, (GroupSourceInformation) obj);
                }
            }
        }
    }

    @NotNull
    public final String asString() {
        if (this.writer) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append('\n');
        int i = this.groupsSize;
        if (i > 0) {
            int iEmitGroup = 0;
            while (iEmitGroup < i) {
                iEmitGroup += emitGroup(sb, iEmitGroup, 0);
            }
        } else {
            sb.append("<EMPTY>");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private final int emitGroup(StringBuilder sb, int i, int i2) {
        HashMap<Anchor, GroupSourceInformation> map;
        GroupSourceInformation groupSourceInformation;
        String sourceInformation;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(' ');
        }
        sb.append("Group(");
        sb.append(i);
        sb.append(")");
        Anchor anchorTryAnchor = tryAnchor(i);
        if (anchorTryAnchor != null && (map = this.sourceInformationMap) != null && (groupSourceInformation = map.get(anchorTryAnchor)) != null && (sourceInformation = groupSourceInformation.getSourceInformation()) != null && (StringsKt__StringsJVMKt.startsWith$default(sourceInformation, "C(", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(sourceInformation, "CC(", false, 2, null))) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) sourceInformation, "(", 0, false, 6, (Object) null) + 1;
            int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) sourceInformation, ')', 0, false, 6, (Object) null);
            sb.append(" ");
            String strSubstring = sourceInformation.substring(iIndexOf$default, iIndexOf$default2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(strSubstring);
            sb.append("()");
        }
        sb.append(" key=");
        sb.append(SlotTableKt.key(this.groups, i));
        int iGroupSize = SlotTableKt.groupSize(this.groups, i);
        sb.append(", nodes=");
        sb.append(SlotTableKt.nodeCount(this.groups, i));
        sb.append(", size=");
        sb.append(iGroupSize);
        if (SlotTableKt.hasMark(this.groups, i)) {
            sb.append(", mark");
        }
        if (SlotTableKt.containsMark(this.groups, i)) {
            sb.append(", contains mark");
        }
        int iEmitGroup$dataIndex = emitGroup$dataIndex(this, i);
        int iEmitGroup = i + 1;
        int iEmitGroup$dataIndex2 = emitGroup$dataIndex(this, iEmitGroup);
        if (iEmitGroup$dataIndex >= 0 && iEmitGroup$dataIndex <= iEmitGroup$dataIndex2 && iEmitGroup$dataIndex2 <= this.slotsSize) {
            if (SlotTableKt.hasObjectKey(this.groups, i)) {
                sb.append(" objectKey=" + this.slots[SlotTableKt.objectKeyIndex(this.groups, i)]);
            }
            if (SlotTableKt.isNode(this.groups, i)) {
                sb.append(" node=" + this.slots[SlotTableKt.nodeIndex(this.groups, i)]);
            }
            if (SlotTableKt.hasAux(this.groups, i)) {
                sb.append(" aux=" + this.slots[SlotTableKt.auxIndex(this.groups, i)]);
            }
            int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i);
            if (iSlotAnchor < iEmitGroup$dataIndex2) {
                sb.append(", slots=[");
                sb.append(iSlotAnchor);
                sb.append(": ");
                for (int i4 = iSlotAnchor; i4 < iEmitGroup$dataIndex2; i4++) {
                    if (i4 != iSlotAnchor) {
                        sb.append(", ");
                    }
                    sb.append(String.valueOf(this.slots[i4]));
                }
                sb.append("]");
            }
        } else {
            sb.append(", *invalid data offsets " + iEmitGroup$dataIndex + '-' + iEmitGroup$dataIndex2 + GMTDateParser.ANY);
        }
        sb.append('\n');
        int i5 = i + iGroupSize;
        while (iEmitGroup < i5) {
            iEmitGroup += emitGroup(sb, iEmitGroup, i2 + 1);
        }
        return iGroupSize;
    }

    private static final int emitGroup$dataIndex(SlotTable slotTable, int i) {
        return i >= slotTable.groupsSize ? slotTable.slotsSize : SlotTableKt.dataAnchor(slotTable.groups, i);
    }

    private final List<Integer> keys() {
        return SlotTableKt.keys(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> nodes() {
        return SlotTableKt.nodeCounts(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> parentIndexes() {
        return SlotTableKt.parentAnchors(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> dataIndexes() {
        return SlotTableKt.dataAnchors(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> groupSizes() {
        return SlotTableKt.groupSizes(this.groups, this.groupsSize * 5);
    }

    @NotNull
    public final List<Object> slotsOf$runtime_release(int group) {
        int iDataAnchor = SlotTableKt.dataAnchor(this.groups, group);
        int i = group + 1;
        return ArraysKt___ArraysKt.toList(this.slots).subList(iDataAnchor, i < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i) : this.slots.length);
    }

    @Nullable
    public final Object slot$runtime_release(int group, int slotIndex) {
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, group);
        int i = group + 1;
        return (slotIndex < 0 || slotIndex >= (i < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i) : this.slots.length) - iSlotAnchor) ? Composer.INSTANCE.getEmpty() : this.slots[iSlotAnchor + slotIndex];
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @Nullable
    public CompositionGroup find(@NotNull Object identityToFind) {
        return new SlotTableGroup(this, 0, 0, 4, null).find(identityToFind);
    }
}
