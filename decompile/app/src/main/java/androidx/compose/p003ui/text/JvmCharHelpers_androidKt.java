package androidx.compose.p003ui.text;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.text.BreakIterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: JvmCharHelpers.android.kt */
@Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, m7105d2 = {"findFollowingBreak", "", "", FirebaseAnalytics.Param.INDEX, "findPrecedingBreak", "ui-text_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class JvmCharHelpers_androidKt {
    public static final int findPrecedingBreak(@NotNull String str, int i) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final int findFollowingBreak(@NotNull String str, int i) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i);
    }
}
