package androidx.compose.p003ui.res;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PainterResources.android.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m7105d2 = {"Landroidx/compose/ui/res/ResourceResolutionException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ResourceResolutionException extends RuntimeException {
    public static final int $stable = 0;

    public ResourceResolutionException(@NotNull String str, @NotNull Throwable th) {
        super(str, th);
    }
}
