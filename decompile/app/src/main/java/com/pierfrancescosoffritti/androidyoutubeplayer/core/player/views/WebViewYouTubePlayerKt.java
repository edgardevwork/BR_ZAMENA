package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import androidx.annotation.VisibleForTesting;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p051io.CloseableKt;
import kotlin.p051io.TextStreamsKt;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

/* compiled from: WebViewYouTubePlayer.kt */
@Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\u0004"}, m7105d2 = {"readHTMLFromUTF8File", "", "inputStream", "Ljava/io/InputStream;", "core_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class WebViewYouTubePlayerKt {
    @VisibleForTesting
    @NotNull
    public static final String readHTMLFromUTF8File(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        try {
            try {
                String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(TextStreamsKt.readLines(new BufferedReader(new InputStreamReader(inputStream, "utf-8"))), StringUtils.f9903LF, null, null, 0, null, null, 62, null);
                CloseableKt.closeFinally(inputStream, null);
                return strJoinToString$default;
            } finally {
            }
        } catch (Exception unused) {
            throw new RuntimeException("Can't parse HTML file.");
        }
    }
}
