package io.ktor.websocket;

import com.blackhub.bronline.game.gui.tutorialhints.TutorialKeys;
import kotlin.Metadata;

/* compiled from: Utils.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0080\b\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0080\f¨\u0006\u0007"}, m7105d2 = {"flagAt", "", "", TutorialKeys.TUTORIAL_ADDITIONAL_TASK_PROGRESS_LIST_KEY, "xor", "", "other", "ktor-websockets"}, m7106k = 5, m7107mv = {1, 8, 0}, m7109xi = 48, m7110xs = "io/ktor/websocket/UtilsKt")
/* loaded from: classes7.dex */
public final /* synthetic */ class UtilsKt__UtilsKt {
    public static final int flagAt(boolean z, int i) {
        if (z) {
            return 1 << i;
        }
        return 0;
    }

    public static final byte xor(byte b, byte b2) {
        return (byte) (b ^ b2);
    }
}
