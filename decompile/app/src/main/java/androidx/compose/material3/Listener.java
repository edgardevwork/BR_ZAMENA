package androidx.compose.material3;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import com.blackhub.bronline.game.GUIManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: TouchExplorationStateProvider.android.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004H\u0016J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bR+\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, m7105d2 = {"Landroidx/compose/material3/Listener;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "Landroidx/compose/runtime/State;", "", "()V", "<set-?>", "accessibilityEnabled", "getAccessibilityEnabled", "()Z", "setAccessibilityEnabled", "(Z)V", "accessibilityEnabled$delegate", "Landroidx/compose/runtime/MutableState;", "touchExplorationEnabled", "getTouchExplorationEnabled", "setTouchExplorationEnabled", "touchExplorationEnabled$delegate", "value", "getValue", "()Ljava/lang/Boolean;", "onAccessibilityStateChanged", "", "it", "onTouchExplorationStateChanged", "register", GUIManagerKt.APPMETRICA_DEVICE_ID_KEY, "Landroid/view/accessibility/AccessibilityManager;", "unregister", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTouchExplorationStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/Listener\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,108:1\n81#2:109\n107#2,2:110\n81#2:112\n107#2,2:113\n*S KotlinDebug\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/Listener\n*L\n81#1:109\n81#1:110,2\n82#1:112\n82#1:113,2\n*E\n"})
/* loaded from: classes4.dex */
public final class Listener implements AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener, State<Boolean> {

    /* renamed from: accessibilityEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    public final MutableState accessibilityEnabled;

    /* renamed from: touchExplorationEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    public final MutableState touchExplorationEnabled;

    public Listener() {
        Boolean bool = Boolean.FALSE;
        this.accessibilityEnabled = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.touchExplorationEnabled = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getAccessibilityEnabled() {
        return ((Boolean) this.accessibilityEnabled.getValue()).booleanValue();
    }

    public final void setAccessibilityEnabled(boolean z) {
        this.accessibilityEnabled.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getTouchExplorationEnabled() {
        return ((Boolean) this.touchExplorationEnabled.getValue()).booleanValue();
    }

    public final void setTouchExplorationEnabled(boolean z) {
        this.touchExplorationEnabled.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    @NotNull
    public Boolean getValue() {
        return Boolean.valueOf(getAccessibilityEnabled() && getTouchExplorationEnabled());
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean it) {
        setAccessibilityEnabled(it);
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean it) {
        setTouchExplorationEnabled(it);
    }

    public final void register(@NotNull AccessibilityManager am) {
        setAccessibilityEnabled(am.isEnabled());
        setTouchExplorationEnabled(am.isTouchExplorationEnabled());
        am.addTouchExplorationStateChangeListener(this);
        am.addAccessibilityStateChangeListener(this);
    }

    public final void unregister(@NotNull AccessibilityManager am) {
        am.removeTouchExplorationStateChangeListener(this);
        am.removeAccessibilityStateChangeListener(this);
    }
}
