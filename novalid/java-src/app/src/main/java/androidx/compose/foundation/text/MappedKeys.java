package androidx.compose.foundation.text;

import androidx.compose.p003ui.input.key.Key_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.jetbrains.annotations.NotNull;

/* compiled from: KeyMapping.android.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b2\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006R\u0019\u0010\u0014\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0015\u0010\u0006R\u0019\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0017\u0010\u0006R\u0019\u0010\u0018\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0019\u0010\u0006R\u0019\u0010\u001a\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001b\u0010\u0006R\u0019\u0010\u001c\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001d\u0010\u0006R\u0019\u0010\u001e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001f\u0010\u0006R\u0019\u0010 \u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b!\u0010\u0006R\u0019\u0010\"\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b#\u0010\u0006R\u0019\u0010$\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b%\u0010\u0006R\u0019\u0010&\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b'\u0010\u0006R\u0019\u0010(\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b)\u0010\u0006R\u0019\u0010*\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b+\u0010\u0006R\u0019\u0010,\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b-\u0010\u0006R\u0019\u0010.\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b/\u0010\u0006R\u0019\u00100\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b1\u0010\u0006R\u0019\u00102\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b3\u0010\u0006R\u0019\u00104\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b5\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, m7105d2 = {"Landroidx/compose/foundation/text/MappedKeys;", "", "()V", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroidx/compose/ui/input/key/Key;", "getA-EK5gGoQ", "()J", "J", "Backslash", "getBackslash-EK5gGoQ", "Backspace", "getBackspace-EK5gGoQ", "C", "getC-EK5gGoQ", "Copy", "getCopy-EK5gGoQ", "Cut", "getCut-EK5gGoQ", "Delete", "getDelete-EK5gGoQ", "DirectionDown", "getDirectionDown-EK5gGoQ", "DirectionLeft", "getDirectionLeft-EK5gGoQ", "DirectionRight", "getDirectionRight-EK5gGoQ", "DirectionUp", "getDirectionUp-EK5gGoQ", "Enter", "getEnter-EK5gGoQ", DurationFormatUtils.f9908H, "getH-EK5gGoQ", "Insert", "getInsert-EK5gGoQ", "MoveEnd", "getMoveEnd-EK5gGoQ", "MoveHome", "getMoveHome-EK5gGoQ", "PageDown", "getPageDown-EK5gGoQ", "PageUp", "getPageUp-EK5gGoQ", "Paste", "getPaste-EK5gGoQ", "Tab", "getTab-EK5gGoQ", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getV-EK5gGoQ", "X", "getX-EK5gGoQ", "Y", "getY-EK5gGoQ", "Z", "getZ-EK5gGoQ", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class MappedKeys {
    public static final int $stable = 0;

    @NotNull
    public static final MappedKeys INSTANCE = new MappedKeys();
    private static final long A = Key_androidKt.Key(29);
    private static final long C = Key_androidKt.Key(31);
    private static final long H = Key_androidKt.Key(36);
    private static final long V = Key_androidKt.Key(50);
    private static final long Y = Key_androidKt.Key(53);
    private static final long X = Key_androidKt.Key(52);
    private static final long Z = Key_androidKt.Key(54);
    private static final long Backslash = Key_androidKt.Key(73);
    private static final long DirectionLeft = Key_androidKt.Key(21);
    private static final long DirectionRight = Key_androidKt.Key(22);
    private static final long DirectionUp = Key_androidKt.Key(19);
    private static final long DirectionDown = Key_androidKt.Key(20);
    private static final long PageUp = Key_androidKt.Key(92);
    private static final long PageDown = Key_androidKt.Key(93);
    private static final long MoveHome = Key_androidKt.Key(122);
    private static final long MoveEnd = Key_androidKt.Key(123);
    private static final long Insert = Key_androidKt.Key(124);
    private static final long Enter = Key_androidKt.Key(66);
    private static final long Backspace = Key_androidKt.Key(67);
    private static final long Delete = Key_androidKt.Key(112);
    private static final long Paste = Key_androidKt.Key(279);
    private static final long Cut = Key_androidKt.Key(277);
    private static final long Copy = Key_androidKt.Key(278);
    private static final long Tab = Key_androidKt.Key(61);

    private MappedKeys() {
    }

    /* renamed from: getA-EK5gGoQ, reason: not valid java name */
    public final long m8434getAEK5gGoQ() {
        return A;
    }

    /* renamed from: getC-EK5gGoQ, reason: not valid java name */
    public final long m8437getCEK5gGoQ() {
        return C;
    }

    /* renamed from: getH-EK5gGoQ, reason: not valid java name */
    public final long m8446getHEK5gGoQ() {
        return H;
    }

    /* renamed from: getV-EK5gGoQ, reason: not valid java name */
    public final long m8454getVEK5gGoQ() {
        return V;
    }

    /* renamed from: getY-EK5gGoQ, reason: not valid java name */
    public final long m8456getYEK5gGoQ() {
        return Y;
    }

    /* renamed from: getX-EK5gGoQ, reason: not valid java name */
    public final long m8455getXEK5gGoQ() {
        return X;
    }

    /* renamed from: getZ-EK5gGoQ, reason: not valid java name */
    public final long m8457getZEK5gGoQ() {
        return Z;
    }

    /* renamed from: getBackslash-EK5gGoQ, reason: not valid java name */
    public final long m8435getBackslashEK5gGoQ() {
        return Backslash;
    }

    /* renamed from: getDirectionLeft-EK5gGoQ, reason: not valid java name */
    public final long m8442getDirectionLeftEK5gGoQ() {
        return DirectionLeft;
    }

    /* renamed from: getDirectionRight-EK5gGoQ, reason: not valid java name */
    public final long m8443getDirectionRightEK5gGoQ() {
        return DirectionRight;
    }

    /* renamed from: getDirectionUp-EK5gGoQ, reason: not valid java name */
    public final long m8444getDirectionUpEK5gGoQ() {
        return DirectionUp;
    }

    /* renamed from: getDirectionDown-EK5gGoQ, reason: not valid java name */
    public final long m8441getDirectionDownEK5gGoQ() {
        return DirectionDown;
    }

    /* renamed from: getPageUp-EK5gGoQ, reason: not valid java name */
    public final long m8451getPageUpEK5gGoQ() {
        return PageUp;
    }

    /* renamed from: getPageDown-EK5gGoQ, reason: not valid java name */
    public final long m8450getPageDownEK5gGoQ() {
        return PageDown;
    }

    /* renamed from: getMoveHome-EK5gGoQ, reason: not valid java name */
    public final long m8449getMoveHomeEK5gGoQ() {
        return MoveHome;
    }

    /* renamed from: getMoveEnd-EK5gGoQ, reason: not valid java name */
    public final long m8448getMoveEndEK5gGoQ() {
        return MoveEnd;
    }

    /* renamed from: getInsert-EK5gGoQ, reason: not valid java name */
    public final long m8447getInsertEK5gGoQ() {
        return Insert;
    }

    /* renamed from: getEnter-EK5gGoQ, reason: not valid java name */
    public final long m8445getEnterEK5gGoQ() {
        return Enter;
    }

    /* renamed from: getBackspace-EK5gGoQ, reason: not valid java name */
    public final long m8436getBackspaceEK5gGoQ() {
        return Backspace;
    }

    /* renamed from: getDelete-EK5gGoQ, reason: not valid java name */
    public final long m8440getDeleteEK5gGoQ() {
        return Delete;
    }

    /* renamed from: getPaste-EK5gGoQ, reason: not valid java name */
    public final long m8452getPasteEK5gGoQ() {
        return Paste;
    }

    /* renamed from: getCut-EK5gGoQ, reason: not valid java name */
    public final long m8439getCutEK5gGoQ() {
        return Cut;
    }

    /* renamed from: getCopy-EK5gGoQ, reason: not valid java name */
    public final long m8438getCopyEK5gGoQ() {
        return Copy;
    }

    /* renamed from: getTab-EK5gGoQ, reason: not valid java name */
    public final long m8453getTabEK5gGoQ() {
        return Tab;
    }
}
