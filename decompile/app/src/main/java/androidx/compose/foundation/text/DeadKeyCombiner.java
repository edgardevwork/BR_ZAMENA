package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.p003ui.input.key.KeyEvent_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeadKeyCombiner.android.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, m7105d2 = {"Landroidx/compose/foundation/text/DeadKeyCombiner;", "", "()V", "deadKeyCode", "", "Ljava/lang/Integer;", "consume", "event", "Landroidx/compose/ui/input/key/KeyEvent;", "consume-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Integer;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDeadKeyCombiner.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeadKeyCombiner.android.kt\nandroidx/compose/foundation/text/DeadKeyCombiner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* loaded from: classes2.dex */
public final class DeadKeyCombiner {
    public static final int $stable = 8;

    @Nullable
    private Integer deadKeyCode;

    @Nullable
    /* renamed from: consume-ZmokQxo, reason: not valid java name */
    public final Integer m8418consumeZmokQxo(@NotNull KeyEvent event) {
        int iM12350getUtf16CodePointZmokQxo = KeyEvent_androidKt.m12350getUtf16CodePointZmokQxo(event);
        if ((Integer.MIN_VALUE & iM12350getUtf16CodePointZmokQxo) != 0) {
            this.deadKeyCode = Integer.valueOf(iM12350getUtf16CodePointZmokQxo & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.deadKeyCode;
        if (num != null) {
            this.deadKeyCode = null;
            Integer numValueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), iM12350getUtf16CodePointZmokQxo));
            Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
            return num2 == null ? Integer.valueOf(iM12350getUtf16CodePointZmokQxo) : num2;
        }
        return Integer.valueOf(iM12350getUtf16CodePointZmokQxo);
    }
}
