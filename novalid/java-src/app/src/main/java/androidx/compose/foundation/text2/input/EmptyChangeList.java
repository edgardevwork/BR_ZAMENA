package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.text2.input.TextFieldBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextFieldBuffer.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/EmptyChangeList;", "Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;", "()V", "changeCount", "", "getChangeCount", "()I", "getOriginalRange", "Landroidx/compose/ui/text/TextRange;", "changeIndex", "getOriginalRange--jx7JFs", "(I)J", "getRange", "getRange--jx7JFs", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class EmptyChangeList implements TextFieldBuffer.ChangeList {

    @NotNull
    public static final EmptyChangeList INSTANCE = new EmptyChangeList();

    @Override // androidx.compose.foundation.text2.input.TextFieldBuffer.ChangeList
    public int getChangeCount() {
        return 0;
    }

    @Override // androidx.compose.foundation.text2.input.TextFieldBuffer.ChangeList
    /* renamed from: getRange--jx7JFs */
    public long mo8635getRangejx7JFs(int changeIndex) {
        throw new IndexOutOfBoundsException();
    }

    @Override // androidx.compose.foundation.text2.input.TextFieldBuffer.ChangeList
    /* renamed from: getOriginalRange--jx7JFs */
    public long mo8634getOriginalRangejx7JFs(int changeIndex) {
        throw new IndexOutOfBoundsException();
    }
}
