package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FixupList.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ&\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u000bJ\"\u0010\u0014\u001a\u00020\u000b2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0016J>\u0010!\u001a\u00020\u000b\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010#2\u0006\u0010$\u001a\u0002H\"2\u001d\u0010%\u001a\u0019\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H\"\u0012\u0004\u0012\u00020\u000b0&¢\u0006\u0002\b'¢\u0006\u0002\u0010(R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006)"}, m7105d2 = {"Landroidx/compose/runtime/changelist/FixupList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "()V", "operations", "Landroidx/compose/runtime/changelist/Operations;", "pendingOperations", "size", "", "getSize", "()I", "clear", "", "createAndInsertNode", "factory", "Lkotlin/Function0;", "", "insertIndex", "groupAnchor", "Landroidx/compose/runtime/Anchor;", "endNodeInsert", "executeAndFlushAllPendingFixups", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "isEmpty", "", "isNotEmpty", "toDebugString", "", "linePrefix", "updateNode", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.GPS_DIRECTION_TRUE, "value", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFixupList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixupList.kt\nandroidx/compose/runtime/changelist/FixupList\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 4 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n+ 5 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n+ 6 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n1#1,91:1\n4178#2,5:92\n4178#2,5:178\n164#3,5:97\n172#3,2:105\n171#3,31:107\n164#3,5:138\n172#3,2:145\n171#3,31:147\n164#3,5:183\n172#3,2:190\n171#3,31:192\n456#4:102\n457#4:103\n458#4:104\n488#5:143\n489#5:144\n326#6:188\n327#6:189\n*S KotlinDebug\n*F\n+ 1 FixupList.kt\nandroidx/compose/runtime/changelist/FixupList\n*L\n46#1:92,5\n71#1:178,5\n58#1:97,5\n58#1:105,2\n58#1:107,31\n64#1:138,5\n64#1:145,2\n64#1:147,31\n78#1:183,5\n78#1:190,2\n78#1:192,31\n59#1:102\n60#1:103\n61#1:104\n65#1:143\n66#1:144\n79#1:188\n80#1:189\n*E\n"})
/* loaded from: classes2.dex */
public final class FixupList implements OperationsDebugStringFormattable {
    public static final int $stable = 8;

    @NotNull
    private final Operations operations = new Operations();

    @NotNull
    private final Operations pendingOperations = new Operations();

    public final int getSize() {
        return this.operations.getOpCodesSize();
    }

    public final boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.operations.isNotEmpty();
    }

    public final void clear() {
        this.pendingOperations.clear();
        this.operations.clear();
    }

    public final void executeAndFlushAllPendingFixups(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
        if (this.pendingOperations.isEmpty()) {
            this.operations.executeAndFlushAllPendingOperations(applier, slots, rememberManager);
        } else {
            ComposerKt.composeRuntimeError("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void createAndInsertNode(@NotNull Function0<? extends Object> factory, int insertIndex, @NotNull Anchor groupAnchor) {
        int i;
        Operations operations;
        Operations operations2 = this.operations;
        Operation.InsertNodeFixup insertNodeFixup = Operation.InsertNodeFixup.INSTANCE;
        operations2.pushOp(insertNodeFixup);
        Operations operationsM10947constructorimpl = Operations.WriteScope.m10947constructorimpl(operations2);
        Operations.WriteScope.m10953setObjectDKhxnng(operationsM10947constructorimpl, Operation.ObjectParameter.m10919constructorimpl(0), factory);
        Operations.WriteScope.m10952setIntA6tL2VI(operationsM10947constructorimpl, Operation.IntParameter.m10908constructorimpl(0), insertIndex);
        Operations.WriteScope.m10953setObjectDKhxnng(operationsM10947constructorimpl, Operation.ObjectParameter.m10919constructorimpl(1), groupAnchor);
        if (operations2.pushedIntMask == operations2.createExpectedArgMask(insertNodeFixup.getInts()) && operations2.pushedObjectMask == operations2.createExpectedArgMask(insertNodeFixup.getObjects())) {
            Operations operations3 = this.pendingOperations;
            Operation.PostInsertNodeFixup postInsertNodeFixup = Operation.PostInsertNodeFixup.INSTANCE;
            operations3.pushOp(postInsertNodeFixup);
            Operations operationsM10947constructorimpl2 = Operations.WriteScope.m10947constructorimpl(operations3);
            Operations.WriteScope.m10952setIntA6tL2VI(operationsM10947constructorimpl2, Operation.IntParameter.m10908constructorimpl(0), insertIndex);
            Operations.WriteScope.m10953setObjectDKhxnng(operationsM10947constructorimpl2, Operation.ObjectParameter.m10919constructorimpl(0), groupAnchor);
            if (operations3.pushedIntMask == operations3.createExpectedArgMask(postInsertNodeFixup.getInts()) && operations3.pushedObjectMask == operations3.createExpectedArgMask(postInsertNodeFixup.getObjects())) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int ints = postInsertNodeFixup.getInts();
            int i2 = 0;
            for (int i3 = 0; i3 < ints; i3++) {
                if (((1 << i3) & operations3.pushedIntMask) != 0) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(postInsertNodeFixup.mo10882intParamNamew8GmfQM(Operation.IntParameter.m10908constructorimpl(i3)));
                    i2++;
                }
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb2 = new StringBuilder();
            int objects = postInsertNodeFixup.getObjects();
            int i4 = 0;
            int i5 = 0;
            while (i5 < objects) {
                if (((1 << i5) & operations3.pushedObjectMask) != 0) {
                    if (i2 > 0) {
                        sb2.append(", ");
                    }
                    operations = operations3;
                    sb2.append(postInsertNodeFixup.mo10883objectParamName31yXWZQ(Operation.ObjectParameter.m10919constructorimpl(i5)));
                    i4++;
                } else {
                    operations = operations3;
                }
                i5++;
                operations3 = operations;
            }
            String string2 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + postInsertNodeFixup + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i4 + " object arguments (" + string2 + ").").toString());
        }
        StringBuilder sb3 = new StringBuilder();
        int ints2 = insertNodeFixup.getInts();
        int i6 = 0;
        for (int i7 = 0; i7 < ints2; i7++) {
            if ((operations2.pushedIntMask & (1 << i7)) != 0) {
                if (i6 > 0) {
                    sb3.append(", ");
                }
                sb3.append(insertNodeFixup.mo10882intParamNamew8GmfQM(Operation.IntParameter.m10908constructorimpl(i7)));
                i6++;
            }
        }
        String string3 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder();
        int objects2 = insertNodeFixup.getObjects();
        int i8 = 0;
        int i9 = 0;
        while (i8 < objects2) {
            if (((1 << i8) & operations2.pushedObjectMask) != 0) {
                if (i6 > 0) {
                    sb4.append(", ");
                }
                i = objects2;
                sb4.append(insertNodeFixup.mo10883objectParamName31yXWZQ(Operation.ObjectParameter.m10919constructorimpl(i8)));
                i9++;
            } else {
                i = objects2;
            }
            i8++;
            objects2 = i;
        }
        String string4 = sb4.toString();
        Intrinsics.checkNotNullExpressionValue(string4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + insertNodeFixup + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + string3 + ") and " + i9 + " object arguments (" + string4 + ").").toString());
    }

    public final void endNodeInsert() {
        if (this.pendingOperations.isNotEmpty()) {
            this.pendingOperations.popInto(this.operations);
        } else {
            ComposerKt.composeRuntimeError("Cannot end node insertion, there are no pending operations that can be realized.".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final <V, T> void updateNode(V value, @NotNull Function2<? super T, ? super V, Unit> block) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        Operations operationsM10947constructorimpl = Operations.WriteScope.m10947constructorimpl(operations);
        Operations.WriteScope.m10953setObjectDKhxnng(operationsM10947constructorimpl, Operation.ObjectParameter.m10919constructorimpl(0), value);
        int iM10919constructorimpl = Operation.ObjectParameter.m10919constructorimpl(1);
        Intrinsics.checkNotNull(block, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.m10953setObjectDKhxnng(operationsM10947constructorimpl, iM10919constructorimpl, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(block, 2));
        if (operations.pushedIntMask == operations.createExpectedArgMask(updateNode.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(updateNode.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = updateNode.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & operations.pushedIntMask) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(updateNode.mo10882intParamNamew8GmfQM(Operation.IntParameter.m10908constructorimpl(i2)));
                i++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = updateNode.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & operations.pushedObjectMask) != 0) {
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(updateNode.mo10883objectParamName31yXWZQ(Operation.ObjectParameter.m10919constructorimpl(i4)));
                i3++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + updateNode + ". Not all arguments were provided. Missing " + i + " int arguments (" + string + ") and " + i3 + " object arguments (" + string2 + ").").toString());
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    @NotNull
    public String toDebugString(@NotNull String linePrefix) {
        StringBuilder sb = new StringBuilder();
        sb.append("FixupList instance containing " + getSize() + " operations");
        if (sb.length() > 0) {
            sb.append(":\n" + this.operations.toDebugString(linePrefix));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
