package androidx.compose.p003ui.input.nestedscroll;

import androidx.compose.p003ui.modifier.ModifierLocalKt;
import androidx.compose.p003ui.modifier.ProvidableModifierLocal;
import androidx.compose.p003ui.node.DelegatableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.http2.Http2ExchangeCodec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NestedScrollNode.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n\"\u001c\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, m7105d2 = {"ModifierLocalNestedScroll", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "getModifierLocalNestedScroll", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "nestedScrollModifierNode", "Landroidx/compose/ui/node/DelegatableNode;", Http2ExchangeCodec.CONNECTION, "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class NestedScrollNodeKt {

    @NotNull
    private static final ProvidableModifierLocal<NestedScrollNode> ModifierLocalNestedScroll = ModifierLocalKt.modifierLocalOf(new Function0<NestedScrollNode>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt$ModifierLocalNestedScroll$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final NestedScrollNode invoke() {
            return null;
        }
    });

    @NotNull
    public static final ProvidableModifierLocal<NestedScrollNode> getModifierLocalNestedScroll() {
        return ModifierLocalNestedScroll;
    }

    @NotNull
    public static final DelegatableNode nestedScrollModifierNode(@NotNull NestedScrollConnection nestedScrollConnection, @Nullable NestedScrollDispatcher nestedScrollDispatcher) {
        return new NestedScrollNode(nestedScrollConnection, nestedScrollDispatcher);
    }
}
