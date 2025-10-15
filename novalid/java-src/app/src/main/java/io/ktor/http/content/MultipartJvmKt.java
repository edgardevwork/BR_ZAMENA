package io.ktor.http.content;

import io.ktor.http.content.PartData;
import io.ktor.util.InputJvmKt;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MultipartJvm.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"streamProvider", "Lkotlin/Function0;", "Ljava/io/InputStream;", "Lio/ktor/http/content/PartData$FileItem;", "getStreamProvider", "(Lio/ktor/http/content/PartData$FileItem;)Lkotlin/jvm/functions/Function0;", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class MultipartJvmKt {
    @NotNull
    public static final Function0<InputStream> getStreamProvider(@NotNull final PartData.FileItem fileItem) {
        Intrinsics.checkNotNullParameter(fileItem, "<this>");
        return new Function0<InputStream>() { // from class: io.ktor.http.content.MultipartJvmKt$streamProvider$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final InputStream invoke() {
                return InputJvmKt.asStream(fileItem.getProvider().invoke());
            }
        };
    }
}
