package androidx.compose.p003ui.platform;

import androidx.compose.p003ui.text.AnnotatedString;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ClipboardManager.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m7105d2 = {"Landroidx/compose/ui/platform/ClipboardManager;", "", "getText", "Landroidx/compose/ui/text/AnnotatedString;", "hasText", "", "setText", "", "annotatedString", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public interface ClipboardManager {
    @Nullable
    AnnotatedString getText();

    void setText(@NotNull AnnotatedString annotatedString);

    default boolean hasText() {
        AnnotatedString text = getText();
        return text != null && text.length() > 0;
    }
}
