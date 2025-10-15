package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.OffsetApplier;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NativeKeys;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

/* compiled from: Operation.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:!\u001f !\"#$%&'()*+,-./0123456789:;<=>?B\u001b\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u001a\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\t2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011J\b\u0010\u0015\u001a\u00020\tH\u0016J(\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007\u0082\u0001\u001f@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006_"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation;", "", "ints", "", "objects", "(II)V", "getInts", "()I", "name", "", "getName", "()Ljava/lang/String;", "getObjects", "intParamName", "parameter", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "objectParamName-31yXWZQ", "toString", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "AdvanceSlotsBy", "ApplyChangeList", "CopyNodesToNewAnchorLocation", "CopySlotTableToAnchorLocation", "DeactivateCurrentGroup", "DetermineMovableContentNodeIndex", "Downs", "EndCompositionScope", "EndCurrentGroup", "EndMovableContentPlacement", "EnsureGroupStarted", "EnsureRootGroupStarted", "InsertNodeFixup", "InsertSlots", "InsertSlotsWithFixups", "IntParameter", "MoveCurrentGroup", "MoveNode", "ObjectParameter", "PostInsertNodeFixup", "ReleaseMovableGroupAtCurrent", "Remember", "RemoveCurrentGroup", "RemoveNode", "ResetSlots", "SideEffect", "SkipToEndOfCurrentGroup", "TestOperation", "UpdateAuxData", "UpdateNode", "UpdateValue", "Ups", "UseCurrentNode", "Landroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy;", "Landroidx/compose/runtime/changelist/Operation$ApplyChangeList;", "Landroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation$DeactivateCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex;", "Landroidx/compose/runtime/changelist/Operation$Downs;", "Landroidx/compose/runtime/changelist/Operation$EndCompositionScope;", "Landroidx/compose/runtime/changelist/Operation$EndCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$EndMovableContentPlacement;", "Landroidx/compose/runtime/changelist/Operation$EnsureGroupStarted;", "Landroidx/compose/runtime/changelist/Operation$EnsureRootGroupStarted;", "Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation$InsertSlots;", "Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;", "Landroidx/compose/runtime/changelist/Operation$MoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$MoveNode;", "Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;", "Landroidx/compose/runtime/changelist/Operation$Remember;", "Landroidx/compose/runtime/changelist/Operation$RemoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$RemoveNode;", "Landroidx/compose/runtime/changelist/Operation$ResetSlots;", "Landroidx/compose/runtime/changelist/Operation$SideEffect;", "Landroidx/compose/runtime/changelist/Operation$SkipToEndOfCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$TestOperation;", "Landroidx/compose/runtime/changelist/Operation$UpdateAuxData;", "Landroidx/compose/runtime/changelist/Operation$UpdateNode;", "Landroidx/compose/runtime/changelist/Operation$UpdateValue;", "Landroidx/compose/runtime/changelist/Operation$Ups;", "Landroidx/compose/runtime/changelist/Operation$UseCurrentNode;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public abstract class Operation {
    public static final int $stable = 0;
    private final int ints;
    private final int objects;

    public /* synthetic */ Operation(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    public abstract void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager);

    private Operation(int i, int i2) {
        this.ints = i;
        this.objects = i2;
    }

    public /* synthetic */ Operation(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, null);
    }

    public final int getInts() {
        return this.ints;
    }

    public final int getObjects() {
        return this.objects;
    }

    @NotNull
    public final String getName() {
        String simpleName = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        return simpleName == null ? "" : simpleName;
    }

    @NotNull
    /* renamed from: intParamName-w8GmfQM */
    public String mo10882intParamNamew8GmfQM(int parameter) {
        return "IntParameter(" + parameter + ')';
    }

    @NotNull
    /* renamed from: objectParamName-31yXWZQ */
    public String mo10883objectParamName31yXWZQ(int parameter) {
        return "ObjectParameter(" + parameter + ')';
    }

    @NotNull
    public String toString() {
        return getName();
    }

    /* compiled from: Operation.kt */
    @Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0013"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$IntParameter;", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "constructor-impl", "(I)I", "getOffset", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @JvmInline
    public static final class IntParameter {
        private final int offset;

        /* renamed from: box-impl */
        public static final /* synthetic */ IntParameter m10907boximpl(int i) {
            return new IntParameter(i);
        }

        /* renamed from: constructor-impl */
        public static int m10908constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl */
        public static boolean m10909equalsimpl(int i, Object obj) {
            return (obj instanceof IntParameter) && i == ((IntParameter) obj).m10913unboximpl();
        }

        /* renamed from: equals-impl0 */
        public static final boolean m10910equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl */
        public static int m10911hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl */
        public static String m10912toStringimpl(int i) {
            return "IntParameter(offset=" + i + ')';
        }

        public boolean equals(Object obj) {
            return m10909equalsimpl(this.offset, obj);
        }

        public int hashCode() {
            return m10911hashCodeimpl(this.offset);
        }

        public String toString() {
            return m10912toStringimpl(this.offset);
        }

        /* renamed from: unbox-impl */
        public final /* synthetic */ int m10913unboximpl() {
            return this.offset;
        }

        private /* synthetic */ IntParameter(int i) {
            this.offset = i;
        }

        public final int getOffset() {
            return this.offset;
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0003¨\u0006\u0014"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", ExifInterface.GPS_DIRECTION_TRUE, "", TypedValues.CycleType.S_WAVE_OFFSET, "", "constructor-impl", "(I)I", "getOffset", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @JvmInline
    public static final class ObjectParameter<T> {
        private final int offset;

        /* renamed from: box-impl */
        public static final /* synthetic */ ObjectParameter m10918boximpl(int i) {
            return new ObjectParameter(i);
        }

        /* renamed from: constructor-impl */
        public static <T> int m10919constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl */
        public static boolean m10920equalsimpl(int i, Object obj) {
            return (obj instanceof ObjectParameter) && i == ((ObjectParameter) obj).m10924unboximpl();
        }

        /* renamed from: equals-impl0 */
        public static final boolean m10921equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl */
        public static int m10922hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl */
        public static String m10923toStringimpl(int i) {
            return "ObjectParameter(offset=" + i + ')';
        }

        public boolean equals(Object obj) {
            return m10920equalsimpl(this.offset, obj);
        }

        public int hashCode() {
            return m10922hashCodeimpl(this.offset);
        }

        public String toString() {
            return m10923toStringimpl(this.offset);
        }

        /* renamed from: unbox-impl */
        public final /* synthetic */ int m10924unboximpl() {
            return this.offset;
        }

        private /* synthetic */ ObjectParameter(int i) {
            this.offset = i;
        }

        public final int getOffset() {
            return this.offset;
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\r*\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0018\u0010\u0003\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$Ups;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Count", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getCount-jn0FJLE", "()I", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,879:1\n77#1:880\n77#1:881\n1#2:882\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n*L\n80#1:880\n89#1:881\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class Ups extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final Ups INSTANCE = new Ups();

        private Ups() {
            super(1, 0, 2, null);
        }

        /* renamed from: getCount-jn0FJLE */
        public final int m10939getCountjn0FJLE() {
            return IntParameter.m10908constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: intParamName-w8GmfQM */
        public String mo10882intParamNamew8GmfQM(int parameter) {
            return IntParameter.m10910equalsimpl0(parameter, IntParameter.m10908constructorimpl(0)) ? CatchStreamerKeys.COUNT_KEY : super.mo10882intParamNamew8GmfQM(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            int iMo10940getIntw8GmfQM = operationArgContainer.mo10940getIntw8GmfQM(IntParameter.m10908constructorimpl(0));
            for (int i = 0; i < iMo10940getIntw8GmfQM; i++) {
                applier.mo97up();
            }
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R&\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$Downs;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Nodes", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "", "", "getNodes-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n*L\n1#1,879:1\n94#1:880\n94#1:881\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n*L\n97#1:880\n108#1:881\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class Downs extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final Downs INSTANCE = new Downs();

        private Downs() {
            super(0, 1, 1, null);
        }

        /* renamed from: getNodes-HpuvwBQ */
        public final int m10895getNodesHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(0))) {
                applier.down(obj);
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: objectParamName-31yXWZQ */
        public String mo10883objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(0)) ? "nodes" : super.mo10883objectParamName31yXWZQ(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\r*\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0018\u0010\u0003\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Distance", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getDistance-jn0FJLE", "()I", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n*L\n1#1,879:1\n116#1:880\n116#1:881\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n*L\n119#1:880\n128#1:881\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class AdvanceSlotsBy extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final AdvanceSlotsBy INSTANCE = new AdvanceSlotsBy();

        private AdvanceSlotsBy() {
            super(1, 0, 2, null);
        }

        /* renamed from: getDistance-jn0FJLE */
        public final int m10884getDistancejn0FJLE() {
            return IntParameter.m10908constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: intParamName-w8GmfQM */
        public String mo10882intParamNamew8GmfQM(int parameter) {
            return IntParameter.m10910equalsimpl0(parameter, IntParameter.m10908constructorimpl(0)) ? "distance" : super.mo10882intParamNamew8GmfQM(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            slotWriter.advanceBy(operationArgContainer.mo10940getIntw8GmfQM(IntParameter.m10908constructorimpl(0)));
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u00020\u0006*\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R$\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$SideEffect;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Effect", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Lkotlin/Function0;", "", "getEffect-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n*L\n1#1,879:1\n135#1:880\n135#1:881\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n*L\n138#1:880\n147#1:881\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class SideEffect extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final SideEffect INSTANCE = new SideEffect();

        private SideEffect() {
            super(0, 1, 1, null);
        }

        /* renamed from: getEffect-HpuvwBQ */
        public final int m10933getEffectHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: objectParamName-31yXWZQ */
        public String mo10883objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(0)) ? NativeKeys.EFFECT_QUALITY_NK : super.mo10883objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            rememberManager.sideEffect((Function0) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(0)));
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u000e*\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$Remember;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Value", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/RememberObserver;", "getValue-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n*L\n1#1,879:1\n152#1:880\n152#1:881\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n*L\n155#1:880\n164#1:881\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class Remember extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final Remember INSTANCE = new Remember();

        private Remember() {
            super(0, 1, 1, null);
        }

        /* renamed from: getValue-HpuvwBQ */
        public final int m10930getValueHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: objectParamName-31yXWZQ */
        public String mo10883objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(0)) ? "value" : super.mo10883objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            rememberManager.remembering((RememberObserver) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(0)));
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ(\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0018\u0010\u0003\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateValue;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "GroupSlotIndex", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getGroupSlotIndex-jn0FJLE", "()I", "Value", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "", "getValue-HpuvwBQ", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "objectParamName", "objectParamName-31yXWZQ", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n*L\n1#1,879:1\n170#1:880\n169#1:881\n169#1:882\n170#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n*L\n173#1:880\n178#1:881\n187#1:882\n188#1:883\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class UpdateValue extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final UpdateValue INSTANCE = new UpdateValue();

        private UpdateValue() {
            super(1, 1, null);
        }

        /* renamed from: getValue-HpuvwBQ */
        public final int m10938getValueHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(0);
        }

        /* renamed from: getGroupSlotIndex-jn0FJLE */
        public final int m10937getGroupSlotIndexjn0FJLE() {
            return IntParameter.m10908constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: intParamName-w8GmfQM */
        public String mo10882intParamNamew8GmfQM(int parameter) {
            return IntParameter.m10910equalsimpl0(parameter, IntParameter.m10908constructorimpl(0)) ? "groupSlotIndex" : super.mo10882intParamNamew8GmfQM(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: objectParamName-31yXWZQ */
        public String mo10883objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(0)) ? "value" : super.mo10883objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            Object objMo10941getObject31yXWZQ = operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(0));
            int iMo10940getIntw8GmfQM = operationArgContainer.mo10940getIntw8GmfQM(IntParameter.m10908constructorimpl(0));
            if (objMo10941getObject31yXWZQ instanceof RememberObserverHolder) {
                rememberManager.remembering(((RememberObserverHolder) objMo10941getObject31yXWZQ).getWrapped());
            }
            Object obj = slotWriter.set(iMo10940getIntw8GmfQM, objMo10941getObject31yXWZQ);
            if (obj instanceof RememberObserverHolder) {
                rememberManager.forgetting(((RememberObserverHolder) obj).getWrapped());
            } else if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).release();
            }
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u000e*\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R \u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateAuxData;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Data", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "", "getData-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n*L\n1#1,879:1\n203#1:880\n203#1:881\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n*L\n206#1:880\n215#1:881\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class UpdateAuxData extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final UpdateAuxData INSTANCE = new UpdateAuxData();

        private UpdateAuxData() {
            super(0, 1, 1, null);
        }

        /* renamed from: getData-HpuvwBQ */
        public final int m10934getDataHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: objectParamName-31yXWZQ */
        public String mo10883objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(0)) ? "data" : super.mo10883objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            slotWriter.updateAux(operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(0)));
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$EnsureRootGroupStarted;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes2.dex */
    public static final class EnsureRootGroupStarted extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final EnsureRootGroupStarted INSTANCE = new EnsureRootGroupStarted();

        private EnsureRootGroupStarted() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            slotWriter.ensureStarted(0);
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u000e*\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$EnsureGroupStarted;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n*L\n1#1,879:1\n230#1:880\n230#1:881\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n*L\n233#1:880\n242#1:881\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class EnsureGroupStarted extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final EnsureGroupStarted INSTANCE = new EnsureGroupStarted();

        private EnsureGroupStarted() {
            super(0, 1, 1, null);
        }

        /* renamed from: getAnchor-HpuvwBQ */
        public final int m10898getAnchorHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: objectParamName-31yXWZQ */
        public String mo10883objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(0)) ? LinkHeader.Parameters.Anchor : super.mo10883objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            slotWriter.ensureStarted((Anchor) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(0)));
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$RemoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes2.dex */
    public static final class RemoveCurrentGroup extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final RemoveCurrentGroup INSTANCE = new RemoveCurrentGroup();

        private RemoveCurrentGroup() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            ComposerKt.removeCurrentGroup(slotWriter, rememberManager);
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\r*\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0018\u0010\u0003\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$MoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Offset", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getOffset-jn0FJLE", "()I", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n*L\n1#1,879:1\n257#1:880\n257#1:881\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n*L\n260#1:880\n269#1:881\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class MoveCurrentGroup extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final MoveCurrentGroup INSTANCE = new MoveCurrentGroup();

        private MoveCurrentGroup() {
            super(1, 0, 2, null);
        }

        /* renamed from: getOffset-jn0FJLE */
        public final int m10914getOffsetjn0FJLE() {
            return IntParameter.m10908constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: intParamName-w8GmfQM */
        public String mo10882intParamNamew8GmfQM(int parameter) {
            return IntParameter.m10910equalsimpl0(parameter, IntParameter.m10908constructorimpl(0)) ? TypedValues.CycleType.S_WAVE_OFFSET : super.mo10882intParamNamew8GmfQM(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            slotWriter.moveGroup(operationArgContainer.mo10940getIntw8GmfQM(IntParameter.m10908constructorimpl(0)));
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$EndCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes2.dex */
    public static final class EndCurrentGroup extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final EndCurrentGroup INSTANCE = new EndCurrentGroup();

        private EndCurrentGroup() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            slotWriter.endGroup();
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$SkipToEndOfCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes2.dex */
    public static final class SkipToEndOfCurrentGroup extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final SkipToEndOfCurrentGroup INSTANCE = new SkipToEndOfCurrentGroup();

        private SkipToEndOfCurrentGroup() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            slotWriter.skipToGroupEnd();
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\u0007*\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R*\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$EndCompositionScope;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Action", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "", "getAction-HpuvwBQ", "()I", "Composition", "getComposition-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n*L\n1#1,879:1\n294#1:880\n295#1:881\n294#1:882\n295#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n*L\n298#1:880\n299#1:881\n308#1:882\n309#1:883\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class EndCompositionScope extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final EndCompositionScope INSTANCE = new EndCompositionScope();

        private EndCompositionScope() {
            super(0, 2, 1, null);
        }

        /* renamed from: getAction-HpuvwBQ */
        public final int m10896getActionHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(0);
        }

        /* renamed from: getComposition-HpuvwBQ */
        public final int m10897getCompositionHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: objectParamName-31yXWZQ */
        public String mo10883objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(0)) ? LinkHeader.Parameters.Anchor : ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(1)) ? "composition" : super.mo10883objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            ((Function1) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(0))).invoke((Composition) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(1)));
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$UseCurrentNode;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes2.dex */
    public static final class UseCurrentNode extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final UseCurrentNode INSTANCE = new UseCurrentNode();

        private UseCurrentNode() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            Object current = applier.getCurrent();
            Intrinsics.checkNotNull(current, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((ComposeNodeLifecycleCallback) current).onReuse();
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0012\u001a\u00020\u0007*\u00020\u00132\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R9\u0010\u0003\u001a#\u0012\u001f\u0012\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateNode;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Block", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getBlock-HpuvwBQ", "()I", "Value", "getValue-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n1#1,879:1\n326#1:880\n327#1:881\n326#1:882\n327#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n330#1:880\n331#1:881\n340#1:882\n341#1:883\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class UpdateNode extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final UpdateNode INSTANCE = new UpdateNode();

        private UpdateNode() {
            super(0, 2, 1, null);
        }

        /* renamed from: getValue-HpuvwBQ */
        public final int m10936getValueHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(0);
        }

        /* renamed from: getBlock-HpuvwBQ */
        public final int m10935getBlockHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: objectParamName-31yXWZQ */
        public String mo10883objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(0)) ? "value" : ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(1)) ? "block" : super.mo10883objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            ((Function2) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(1))).invoke(applier.getCurrent(), operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(0)));
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0018\u0010\u0003\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$RemoveNode;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Count", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getCount-jn0FJLE", "()I", "RemoveIndex", "getRemoveIndex-jn0FJLE", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n*L\n1#1,879:1\n347#1:880\n348#1:881\n347#1:882\n348#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n*L\n351#1:880\n352#1:881\n362#1:882\n363#1:883\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class RemoveNode extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final RemoveNode INSTANCE = new RemoveNode();

        private RemoveNode() {
            super(2, 0, 2, null);
        }

        /* renamed from: getRemoveIndex-jn0FJLE */
        public final int m10932getRemoveIndexjn0FJLE() {
            return IntParameter.m10908constructorimpl(0);
        }

        /* renamed from: getCount-jn0FJLE */
        public final int m10931getCountjn0FJLE() {
            return IntParameter.m10908constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: intParamName-w8GmfQM */
        public String mo10882intParamNamew8GmfQM(int parameter) {
            return IntParameter.m10910equalsimpl0(parameter, IntParameter.m10908constructorimpl(0)) ? "removeIndex" : IntParameter.m10910equalsimpl0(parameter, IntParameter.m10908constructorimpl(1)) ? CatchStreamerKeys.COUNT_KEY : super.mo10882intParamNamew8GmfQM(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            applier.remove(operationArgContainer.mo10940getIntw8GmfQM(IntParameter.m10908constructorimpl(0)), operationArgContainer.mo10940getIntw8GmfQM(IntParameter.m10908constructorimpl(1)));
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0018\u0010\u0003\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$MoveNode;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Count", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getCount-jn0FJLE", "()I", "From", "getFrom-jn0FJLE", "To", "getTo-jn0FJLE", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n*L\n1#1,879:1\n369#1:880\n370#1:881\n371#1:882\n369#1:883\n370#1:884\n371#1:885\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n*L\n374#1:880\n375#1:881\n376#1:882\n386#1:883\n387#1:884\n388#1:885\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class MoveNode extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final MoveNode INSTANCE = new MoveNode();

        private MoveNode() {
            super(3, 0, 2, null);
        }

        /* renamed from: getFrom-jn0FJLE */
        public final int m10916getFromjn0FJLE() {
            return IntParameter.m10908constructorimpl(0);
        }

        /* renamed from: getTo-jn0FJLE */
        public final int m10917getTojn0FJLE() {
            return IntParameter.m10908constructorimpl(1);
        }

        /* renamed from: getCount-jn0FJLE */
        public final int m10915getCountjn0FJLE() {
            return IntParameter.m10908constructorimpl(2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: intParamName-w8GmfQM */
        public String mo10882intParamNamew8GmfQM(int parameter) {
            return IntParameter.m10910equalsimpl0(parameter, IntParameter.m10908constructorimpl(0)) ? "from" : IntParameter.m10910equalsimpl0(parameter, IntParameter.m10908constructorimpl(1)) ? "to" : IntParameter.m10910equalsimpl0(parameter, IntParameter.m10908constructorimpl(2)) ? CatchStreamerKeys.COUNT_KEY : super.mo10882intParamNamew8GmfQM(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            applier.move(operationArgContainer.mo10940getIntw8GmfQM(IntParameter.m10908constructorimpl(0)), operationArgContainer.mo10940getIntw8GmfQM(IntParameter.m10908constructorimpl(1)), operationArgContainer.mo10940getIntw8GmfQM(IntParameter.m10908constructorimpl(2)));
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertSlots;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "FromSlotTable", "Landroidx/compose/runtime/SlotTable;", "getFromSlotTable-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n*L\n1#1,879:1\n394#1:880\n395#1:881\n395#1:882\n394#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n*L\n398#1:880\n399#1:881\n408#1:882\n409#1:883\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class InsertSlots extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final InsertSlots INSTANCE = new InsertSlots();

        private InsertSlots() {
            super(0, 2, 1, null);
        }

        /* renamed from: getAnchor-HpuvwBQ */
        public final int m10902getAnchorHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(0);
        }

        /* renamed from: getFromSlotTable-HpuvwBQ */
        public final int m10903getFromSlotTableHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: objectParamName-31yXWZQ */
        public String mo10883objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(0)) ? LinkHeader.Parameters.Anchor : ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(1)) ? "from" : super.mo10883objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            SlotTable slotTable = (SlotTable) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(1));
            Anchor anchor = (Anchor) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(0));
            slotWriter.beginInsert();
            slotWriter.moveFrom(slotTable, anchor.toIndexFor(slotTable), false);
            slotWriter.endInsert();
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "Fixups", "Landroidx/compose/runtime/changelist/FixupList;", "getFixups-HpuvwBQ", "FromSlotTable", "Landroidx/compose/runtime/SlotTable;", "getFromSlotTable-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,879:1\n422#1:880\n423#1:881\n424#1:882\n423#1:883\n422#1:884\n424#1:885\n166#2,8:886\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n*L\n427#1:880\n428#1:881\n429#1:882\n438#1:883\n439#1:884\n440#1:885\n442#1:886,8\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class InsertSlotsWithFixups extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final InsertSlotsWithFixups INSTANCE = new InsertSlotsWithFixups();

        private InsertSlotsWithFixups() {
            super(0, 3, 1, null);
        }

        /* renamed from: getAnchor-HpuvwBQ */
        public final int m10904getAnchorHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(0);
        }

        /* renamed from: getFromSlotTable-HpuvwBQ */
        public final int m10906getFromSlotTableHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(1);
        }

        /* renamed from: getFixups-HpuvwBQ */
        public final int m10905getFixupsHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: objectParamName-31yXWZQ */
        public String mo10883objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(0)) ? LinkHeader.Parameters.Anchor : ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(1)) ? "from" : ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(2)) ? "fixups" : super.mo10883objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            SlotTable slotTable = (SlotTable) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(1));
            Anchor anchor = (Anchor) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(0));
            FixupList fixupList = (FixupList) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(2));
            SlotWriter slotWriterOpenWriter = slotTable.openWriter();
            try {
                fixupList.executeAndFlushAllPendingFixups(applier, slotWriterOpenWriter, rememberManager);
                Unit unit = Unit.INSTANCE;
                slotWriterOpenWriter.close();
                slotWriter.beginInsert();
                slotWriter.moveFrom(slotTable, anchor.toIndexFor(slotTable), false);
                slotWriter.endInsert();
            } catch (Throwable th) {
                slotWriterOpenWriter.close();
                throw th;
            }
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013J(\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R&\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u0018\u0010\f\u001a\u00020\r8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Factory", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Lkotlin/Function0;", "", "getFactory-HpuvwBQ", "()I", "GroupAnchor", "Landroidx/compose/runtime/Anchor;", "getGroupAnchor-HpuvwBQ", "InsertIndex", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getInsertIndex-jn0FJLE", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "objectParamName", "objectParamName-31yXWZQ", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n*L\n1#1,879:1\n457#1:880\n456#1:881\n458#1:882\n456#1:883\n458#1:884\n457#1:885\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n*L\n461#1:880\n466#1:881\n467#1:882\n476#1:883\n477#1:884\n478#1:885\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class InsertNodeFixup extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final InsertNodeFixup INSTANCE = new InsertNodeFixup();

        private InsertNodeFixup() {
            super(1, 2, null);
        }

        /* renamed from: getFactory-HpuvwBQ */
        public final int m10899getFactoryHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(0);
        }

        /* renamed from: getInsertIndex-jn0FJLE */
        public final int m10901getInsertIndexjn0FJLE() {
            return IntParameter.m10908constructorimpl(0);
        }

        /* renamed from: getGroupAnchor-HpuvwBQ */
        public final int m10900getGroupAnchorHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: intParamName-w8GmfQM */
        public String mo10882intParamNamew8GmfQM(int parameter) {
            return IntParameter.m10910equalsimpl0(parameter, IntParameter.m10908constructorimpl(0)) ? "insertIndex" : super.mo10882intParamNamew8GmfQM(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: objectParamName-31yXWZQ */
        public String mo10883objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(0)) ? "factory" : ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(1)) ? "groupAnchor" : super.mo10883objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            Object objInvoke = ((Function0) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(0))).invoke();
            Anchor anchor = (Anchor) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(1));
            int iMo10940getIntw8GmfQM = operationArgContainer.mo10940getIntw8GmfQM(IntParameter.m10908constructorimpl(0));
            Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            slotWriter.updateNode(anchor, objInvoke);
            applier.insertTopDown(iMo10940getIntw8GmfQM, objInvoke);
            applier.down(objInvoke);
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ(\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\t8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "GroupAnchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getGroupAnchor-HpuvwBQ", "()I", "InsertIndex", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getInsertIndex-jn0FJLE", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "objectParamName", "objectParamName-31yXWZQ", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n*L\n1#1,879:1\n488#1:880\n489#1:881\n489#1:882\n488#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n*L\n492#1:880\n497#1:881\n506#1:882\n507#1:883\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class PostInsertNodeFixup extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final PostInsertNodeFixup INSTANCE = new PostInsertNodeFixup();

        private PostInsertNodeFixup() {
            super(1, 1, null);
        }

        /* renamed from: getInsertIndex-jn0FJLE */
        public final int m10926getInsertIndexjn0FJLE() {
            return IntParameter.m10908constructorimpl(0);
        }

        /* renamed from: getGroupAnchor-HpuvwBQ */
        public final int m10925getGroupAnchorHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: intParamName-w8GmfQM */
        public String mo10882intParamNamew8GmfQM(int parameter) {
            return IntParameter.m10910equalsimpl0(parameter, IntParameter.m10908constructorimpl(0)) ? "insertIndex" : super.mo10882intParamNamew8GmfQM(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: objectParamName-31yXWZQ */
        public String mo10883objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(0)) ? "groupAnchor" : super.mo10883objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            Anchor anchor = (Anchor) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(0));
            int iMo10940getIntw8GmfQM = operationArgContainer.mo10940getIntw8GmfQM(IntParameter.m10908constructorimpl(0));
            applier.mo97up();
            Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            applier.insertBottomUp(iMo10940getIntw8GmfQM, slotWriter.node(anchor));
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$DeactivateCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes2.dex */
    public static final class DeactivateCurrentGroup extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final DeactivateCurrentGroup INSTANCE = new DeactivateCurrentGroup();

        private DeactivateCurrentGroup() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            ComposerKt.deactivateCurrentGroup(slotWriter, rememberManager);
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$ResetSlots;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes2.dex */
    public static final class ResetSlots extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final ResetSlots INSTANCE = new ResetSlots();

        private ResetSlots() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            slotWriter.reset();
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "EffectiveNodeIndexOut", "Landroidx/compose/runtime/internal/IntRef;", "getEffectiveNodeIndexOut-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n*L\n1#1,879:1\n539#1:880\n540#1:881\n539#1:882\n540#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n*L\n543#1:880\n544#1:881\n554#1:882\n558#1:883\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class DetermineMovableContentNodeIndex extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final DetermineMovableContentNodeIndex INSTANCE = new DetermineMovableContentNodeIndex();

        private DetermineMovableContentNodeIndex() {
            super(0, 2, 1, null);
        }

        /* renamed from: getEffectiveNodeIndexOut-HpuvwBQ */
        public final int m10894getEffectiveNodeIndexOutHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(0);
        }

        /* renamed from: getAnchor-HpuvwBQ */
        public final int m10893getAnchorHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: objectParamName-31yXWZQ */
        public String mo10883objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(0)) ? "effectiveNodeIndexOut" : ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(1)) ? LinkHeader.Parameters.Anchor : super.mo10883objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            IntRef intRef = (IntRef) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(0));
            Anchor anchor = (Anchor) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(1));
            Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            intRef.setElement(OperationKt.positionToInsert(slotWriter, anchor, applier));
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R&\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "EffectiveNodeIndex", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/internal/IntRef;", "getEffectiveNodeIndex-HpuvwBQ", "()I", "Nodes", "", "", "getNodes-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,879:1\n567#1:880\n568#1:881\n567#1:882\n568#1:883\n64#2,6:884\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n*L\n571#1:880\n572#1:881\n581#1:882\n582#1:883\n584#1:884,6\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class CopyNodesToNewAnchorLocation extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final CopyNodesToNewAnchorLocation INSTANCE = new CopyNodesToNewAnchorLocation();

        private CopyNodesToNewAnchorLocation() {
            super(0, 2, 1, null);
        }

        /* renamed from: getEffectiveNodeIndex-HpuvwBQ */
        public final int m10887getEffectiveNodeIndexHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(0);
        }

        /* renamed from: getNodes-HpuvwBQ */
        public final int m10888getNodesHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: objectParamName-31yXWZQ */
        public String mo10883objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(0)) ? "effectiveNodeIndex" : ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(1)) ? "nodes" : super.mo10883objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            int element = ((IntRef) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(0))).getElement();
            List list = (List) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(1));
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i2 = element + i;
                applier.insertBottomUp(i2, obj);
                applier.insertTopDown(i2, obj);
            }
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R \u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "From", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/MovableContentStateReference;", "getFrom-HpuvwBQ", "()I", "ParentCompositionContext", "Landroidx/compose/runtime/CompositionContext;", "getParentCompositionContext-HpuvwBQ", "ResolvedState", "Landroidx/compose/runtime/MovableContentState;", "getResolvedState-HpuvwBQ", "To", "getTo-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n*L\n1#1,879:1\n594#1:880\n595#1:881\n596#1:882\n597#1:883\n596#1:884\n597#1:885\n595#1:886\n594#1:887\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n*L\n600#1:880\n601#1:881\n602#1:882\n603#1:883\n612#1:884\n613#1:885\n615#1:886\n617#1:887\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class CopySlotTableToAnchorLocation extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final CopySlotTableToAnchorLocation INSTANCE = new CopySlotTableToAnchorLocation();

        private CopySlotTableToAnchorLocation() {
            super(0, 4, 1, null);
        }

        /* renamed from: getResolvedState-HpuvwBQ */
        public final int m10891getResolvedStateHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(0);
        }

        /* renamed from: getParentCompositionContext-HpuvwBQ */
        public final int m10890getParentCompositionContextHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(1);
        }

        /* renamed from: getFrom-HpuvwBQ */
        public final int m10889getFromHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(2);
        }

        /* renamed from: getTo-HpuvwBQ */
        public final int m10892getToHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: objectParamName-31yXWZQ */
        public String mo10883objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(0)) ? "resolvedState" : ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(1)) ? "resolvedCompositionContext" : ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(2)) ? "from" : ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(3)) ? "to" : super.mo10883objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            MovableContentStateReference movableContentStateReference = (MovableContentStateReference) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(2));
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(3));
            CompositionContext compositionContext = (CompositionContext) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(1));
            MovableContentState movableContentStateMovableContentStateResolve$runtime_release = (MovableContentState) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(0));
            if (movableContentStateMovableContentStateResolve$runtime_release == null && (movableContentStateMovableContentStateResolve$runtime_release = compositionContext.movableContentStateResolve$runtime_release(movableContentStateReference)) == null) {
                ComposerKt.composeRuntimeError("Could not resolve state for movable content");
                throw new KotlinNothingValueException();
            }
            List<Anchor> listMoveIntoGroupFrom = slotWriter.moveIntoGroupFrom(1, movableContentStateMovableContentStateResolve$runtime_release.getSlotTable(), 2);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.INSTANCE;
            ControlledComposition composition = movableContentStateReference2.getComposition();
            Intrinsics.checkNotNull(composition, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
            companion.adoptAnchoredScopes$runtime_release(slotWriter, listMoveIntoGroupFrom, (RecomposeScopeOwner) composition);
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$EndMovableContentPlacement;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes2.dex */
    public static final class EndMovableContentPlacement extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final EndMovableContentPlacement INSTANCE = new EndMovableContentPlacement();

        private EndMovableContentPlacement() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            OperationKt.positionToParentOf(slotWriter, applier, 0);
            slotWriter.endGroup();
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Composition", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/ControlledComposition;", "getComposition-HpuvwBQ", "()I", "ParentCompositionContext", "Landroidx/compose/runtime/CompositionContext;", "getParentCompositionContext-HpuvwBQ", "Reference", "Landroidx/compose/runtime/MovableContentStateReference;", "getReference-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n*L\n1#1,879:1\n655#1:880\n656#1:881\n657#1:882\n655#1:883\n656#1:884\n657#1:885\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n*L\n660#1:880\n661#1:881\n662#1:882\n672#1:883\n673#1:884\n674#1:885\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class ReleaseMovableGroupAtCurrent extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final ReleaseMovableGroupAtCurrent INSTANCE = new ReleaseMovableGroupAtCurrent();

        private ReleaseMovableGroupAtCurrent() {
            super(0, 3, 1, null);
        }

        /* renamed from: getComposition-HpuvwBQ */
        public final int m10927getCompositionHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(0);
        }

        /* renamed from: getParentCompositionContext-HpuvwBQ */
        public final int m10928getParentCompositionContextHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(1);
        }

        /* renamed from: getReference-HpuvwBQ */
        public final int m10929getReferenceHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: objectParamName-31yXWZQ */
        public String mo10883objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(0)) ? "composition" : ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(1)) ? "parentCompositionContext" : ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(2)) ? "reference" : super.mo10883objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            OperationKt.releaseMovableGroupAtCurrent((ControlledComposition) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(0)), (CompositionContext) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(1)), (MovableContentStateReference) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(2)), slotWriter);
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$ApplyChangeList;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Changes", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/changelist/ChangeList;", "getChanges-HpuvwBQ", "()I", "EffectiveNodeIndex", "Landroidx/compose/runtime/internal/IntRef;", "getEffectiveNodeIndex-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n1#1,879:1\n681#1:880\n682#1:881\n682#1:882\n681#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n685#1:880\n686#1:881\n695#1:882\n697#1:883\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class ApplyChangeList extends Operation {
        public static final int $stable = 0;

        @NotNull
        public static final ApplyChangeList INSTANCE = new ApplyChangeList();

        private ApplyChangeList() {
            super(0, 2, 1, null);
        }

        /* renamed from: getChanges-HpuvwBQ */
        public final int m10885getChangesHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(0);
        }

        /* renamed from: getEffectiveNodeIndex-HpuvwBQ */
        public final int m10886getEffectiveNodeIndexHpuvwBQ() {
            return ObjectParameter.m10919constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        /* renamed from: objectParamName-31yXWZQ */
        public String mo10883objectParamName31yXWZQ(int parameter) {
            return ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(0)) ? "changes" : ObjectParameter.m10921equalsimpl0(parameter, ObjectParameter.m10919constructorimpl(1)) ? "effectiveNodeIndex" : super.mo10883objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            IntRef intRef = (IntRef) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(1));
            int element = intRef != null ? intRef.getElement() : 0;
            ChangeList changeList = (ChangeList) operationArgContainer.mo10941getObject31yXWZQ(ObjectParameter.m10919constructorimpl(0));
            if (element > 0) {
                applier = new OffsetApplier(applier, element);
            }
            changeList.executeAndFlushAllPendingChanges(applier, slotWriter, rememberManager);
        }
    }

    /* compiled from: Operation.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(m7104d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012$\b\u0002\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0002\u0010\u000bJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J(\u0010\u0019\u001a\u00020\n*\u00020\u001a2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\tH\u0016R-\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00140\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u001e"}, m7105d2 = {"Landroidx/compose/runtime/changelist/Operation$TestOperation;", "Landroidx/compose/runtime/changelist/Operation;", "ints", "", "objects", "block", "Lkotlin/Function3;", "Landroidx/compose/runtime/Applier;", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "", "(IILkotlin/jvm/functions/Function3;)V", "getBlock", "()Lkotlin/jvm/functions/Function3;", "intParams", "", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getIntParams", "()Ljava/util/List;", "objParams", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "", "getObjParams", "toString", "", "execute", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "slots", "rememberManager", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TestOperation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,879:1\n1#2:880\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class TestOperation extends Operation {
        public static final int $stable = 8;

        @NotNull
        private final Function3<Applier<?>, SlotWriter, RememberManager, Unit> block;

        @NotNull
        private final List<IntParameter> intParams;

        @NotNull
        private final List<ObjectParameter<Object>> objParams;

        @TestOnly
        public TestOperation() {
            this(0, 0, null, 7, null);
        }

        /* compiled from: Operation.kt */
        @Metadata(m7104d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, m7105d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/compose/runtime/Applier;", "<anonymous parameter 1>", "Landroidx/compose/runtime/SlotWriter;", "<anonymous parameter 2>", "Landroidx/compose/runtime/RememberManager;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.runtime.changelist.Operation$TestOperation$1 */
        public static final class C17851 extends Lambda implements Function3<Applier<?>, SlotWriter, RememberManager, Unit> {
            public static final C17851 INSTANCE = ;

            /* renamed from: invoke */
            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.INSTANCE;
            }
        }

        public /* synthetic */ TestOperation(int i, int i2, Function3 function3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? C17851.INSTANCE : function3);
        }

        @NotNull
        public final Function3<Applier<?>, SlotWriter, RememberManager, Unit> getBlock() {
            return this.block;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @TestOnly
        public TestOperation(int i, int i2, @NotNull Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function3) {
            super(i, i2, null);
            this.block = function3;
            ArrayList arrayList = new ArrayList(i);
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(IntParameter.m10907boximpl(IntParameter.m10908constructorimpl(i3)));
            }
            this.intParams = arrayList;
            ArrayList arrayList2 = new ArrayList(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList2.add(ObjectParameter.m10918boximpl(ObjectParameter.m10919constructorimpl(i4)));
            }
            this.objParams = arrayList2;
        }

        @NotNull
        public final List<IntParameter> getIntParams() {
            return this.intParams;
        }

        @NotNull
        public final List<ObjectParameter<Object>> getObjParams() {
            return this.objParams;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer, @NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
            this.block.invoke(applier, slotWriter, rememberManager);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String toString() {
            return "TestOperation(ints = " + getInts() + ", objects = " + getObjects() + ")@" + System.identityHashCode(this);
        }
    }
}
