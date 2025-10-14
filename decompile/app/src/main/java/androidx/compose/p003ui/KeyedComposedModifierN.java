package androidx.compose.p003ui;

import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ComposedModifier.kt */
@Stable
@Metadata(m7104d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001BV\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b\u0012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000b¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, m7105d2 = {"Landroidx/compose/ui/KeyedComposedModifierN;", "Landroidx/compose/ui/ComposedModifier;", "fqName", "", "keys", "", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "factory", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/String;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "getFqName", "()Ljava/lang/String;", "getKeys", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "equals", "", "other", "hashCode", "", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class KeyedComposedModifierN extends ComposedModifier {

    @NotNull
    public final String fqName;

    @NotNull
    public final Object[] keys;

    @NotNull
    public final String getFqName() {
        return this.fqName;
    }

    @NotNull
    public final Object[] getKeys() {
        return this.keys;
    }

    public KeyedComposedModifierN(@NotNull String str, @NotNull Object[] objArr, @NotNull Function1<? super InspectorInfo, Unit> function1, @NotNull Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> function3) {
        super(function1, function3);
        this.fqName = str;
        this.keys = objArr;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof KeyedComposedModifierN) {
            KeyedComposedModifierN keyedComposedModifierN = (KeyedComposedModifierN) other;
            if (Intrinsics.areEqual(this.fqName, keyedComposedModifierN.fqName) && Arrays.equals(this.keys, keyedComposedModifierN.keys)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.fqName.hashCode() * 31) + Arrays.hashCode(this.keys);
    }
}
