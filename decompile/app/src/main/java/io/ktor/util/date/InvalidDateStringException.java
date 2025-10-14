package io.ktor.util.date;

import com.blackhub.bronline.game.gui.tutorialhints.TutorialKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: GMTDateParser.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0002\u0010\b¨\u0006\t"}, m7105d2 = {"Lio/ktor/util/date/InvalidDateStringException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "data", "", TutorialKeys.TUTORIAL_ADDITIONAL_TASK_PROGRESS_LIST_KEY, "", "pattern", "(Ljava/lang/String;ILjava/lang/String;)V", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class InvalidDateStringException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidDateStringException(@NotNull String data, int i, @NotNull String pattern) {
        super("Failed to parse date string: \"" + data + "\" at index " + i + ". Pattern: \"" + pattern + '\"');
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
    }
}
