package androidx.compose.p003ui.platform;

import android.view.DragEvent;
import android.view.View;
import androidx.collection.ArraySet;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draganddrop.DragAndDropEvent;
import androidx.compose.p003ui.draganddrop.DragAndDropManager;
import androidx.compose.p003ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.p003ui.draganddrop.DragAndDropNode;
import androidx.compose.p003ui.draganddrop.DragAndDropTarget;
import androidx.compose.p003ui.draganddrop.DragAndDropTransferData;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.node.ModifierNodeElement;
import com.caverock.androidsvg.SVG;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(m7104d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002Bc\u0012\\\u0010\u0003\u001aX\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012$\u0012\"\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\u0002\u0010\u0011J;\u0010\u001b\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0014H\u0016J\u0018\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0014H\u0016R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000Rd\u0010\u0003\u001aX\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012$\u0012\"\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, m7105d2 = {"Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;", "Landroid/view/View$OnDragListener;", "Landroidx/compose/ui/draganddrop/DragAndDropManager;", "startDrag", "Lkotlin/Function3;", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "Lkotlin/ParameterName;", "name", "transferData", "Landroidx/compose/ui/geometry/Size;", "decorationSize", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "drawDragDecoration", "", "(Lkotlin/jvm/functions/Function3;)V", "interestedNodes", "Landroidx/collection/ArraySet;", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "rootDragAndDropNode", "Landroidx/compose/ui/draganddrop/DragAndDropNode;", "drag", "drag-12SF9DM", "(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", "isInterestedNode", "node", "onDrag", SVG.View.NODE_NAME, "Landroid/view/View;", "event", "Landroid/view/DragEvent;", "registerNodeInterest", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/DragAndDropModifierOnDragListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2348:1\n1855#2,2:2349\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/DragAndDropModifierOnDragListener\n*L\n2300#1:2349,2\n*E\n"})
/* loaded from: classes3.dex */
public final class DragAndDropModifierOnDragListener implements View.OnDragListener, DragAndDropManager {

    @NotNull
    public final Function3<DragAndDropTransferData, Size, Function1<? super DrawScope, Unit>, Boolean> startDrag;

    @NotNull
    public final DragAndDropNode rootDragAndDropNode = new DragAndDropNode(new Function1<DragAndDropEvent, DragAndDropTarget>() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$rootDragAndDropNode$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final DragAndDropTarget invoke(@NotNull DragAndDropEvent dragAndDropEvent) {
            return null;
        }
    });

    @NotNull
    public final ArraySet<DragAndDropModifierNode> interestedNodes = new ArraySet<>(0, 1, null);

    @NotNull
    public final Modifier modifier = new ModifierNodeElement<DragAndDropNode>() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        @Override // androidx.compose.p003ui.node.ModifierNodeElement
        public boolean equals(@Nullable Object other) {
            return other == this;
        }

        @Override // androidx.compose.p003ui.node.ModifierNodeElement
        public void update(@NotNull DragAndDropNode node) {
        }

        @Override // androidx.compose.p003ui.node.ModifierNodeElement
        @NotNull
        public DragAndDropNode create() {
            return this.this$0.rootDragAndDropNode;
        }

        @Override // androidx.compose.p003ui.node.ModifierNodeElement
        public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootDragAndDropNode");
        }

        @Override // androidx.compose.p003ui.node.ModifierNodeElement
        public int hashCode() {
            return this.this$0.rootDragAndDropNode.hashCode();
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropModifierOnDragListener(@NotNull Function3<? super DragAndDropTransferData, ? super Size, ? super Function1<? super DrawScope, Unit>, Boolean> function3) {
        this.startDrag = function3;
    }

    @Override // androidx.compose.p003ui.draganddrop.DragAndDropManager
    @NotNull
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(@NotNull View view, @NotNull DragEvent event) {
        DragAndDropEvent dragAndDropEvent = new DragAndDropEvent(event);
        switch (event.getAction()) {
            case 1:
                boolean zAcceptDragAndDropTransfer = this.rootDragAndDropNode.acceptDragAndDropTransfer(dragAndDropEvent);
                Iterator<DragAndDropModifierNode> it = this.interestedNodes.iterator();
                while (it.hasNext()) {
                    it.next().onStarted(dragAndDropEvent);
                }
                break;
            case 2:
                this.rootDragAndDropNode.onMoved(dragAndDropEvent);
                break;
            case 4:
                this.rootDragAndDropNode.onEnded(dragAndDropEvent);
                break;
            case 5:
                this.rootDragAndDropNode.onEntered(dragAndDropEvent);
                break;
            case 6:
                this.rootDragAndDropNode.onExited(dragAndDropEvent);
                break;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.draganddrop.DragAndDropManager
    /* renamed from: drag-12SF9DM */
    public boolean mo10988drag12SF9DM(@NotNull DragAndDropTransferData transferData, long decorationSize, @NotNull Function1<? super DrawScope, Unit> drawDragDecoration) {
        return this.startDrag.invoke(transferData, Size.m11156boximpl(decorationSize), drawDragDecoration).booleanValue();
    }

    @Override // androidx.compose.p003ui.draganddrop.DragAndDropManager
    public void registerNodeInterest(@NotNull DragAndDropModifierNode node) {
        this.interestedNodes.add(node);
    }

    @Override // androidx.compose.p003ui.draganddrop.DragAndDropManager
    public boolean isInterestedNode(@NotNull DragAndDropModifierNode node) {
        return this.interestedNodes.contains(node);
    }
}
