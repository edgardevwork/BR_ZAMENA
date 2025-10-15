package com.blackhub.bronline.game.model.remote.response.videoplayer;

import android.content.Context;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.videoplayer.VideoConfiguration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlayerResponse.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m7105d2 = {"THOUSAND_FLOAT", "", "VIDEO_FORMAT_POSTFIX", "", "toVideoConfiguration", "Lcom/blackhub/bronline/game/gui/videoplayer/VideoConfiguration;", "Lcom/blackhub/bronline/game/model/remote/response/videoplayer/PlayerResponse;", "context", "Landroid/content/Context;", "videoName", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPlayerResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayerResponse.kt\ncom/blackhub/bronline/game/model/remote/response/videoplayer/PlayerResponseKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
/* loaded from: classes.dex */
public final class PlayerResponseKt {
    public static final float THOUSAND_FLOAT = 1000.0f;

    @NotNull
    public static final String VIDEO_FORMAT_POSTFIX = ".mp4";

    @NotNull
    public static final VideoConfiguration toVideoConfiguration(@NotNull PlayerResponse playerResponse, @NotNull Context context, @NotNull String videoName) {
        VideoConfiguration videoConfiguration;
        Object next;
        Intrinsics.checkNotNullParameter(playerResponse, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoName, "videoName");
        long waitTimeDuration = (long) (playerResponse.getWaitTimeDuration() * 1000.0f);
        String str = videoName + ".mp4";
        Iterator<T> it = playerResponse.getVideos().iterator();
        while (true) {
            videoConfiguration = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((PlayerVideoItem) next).getVideoName(), videoName)) {
                break;
            }
        }
        PlayerVideoItem playerVideoItem = (PlayerVideoItem) next;
        if (playerVideoItem != null) {
            videoConfiguration = new VideoConfiguration(UtilsKt.getVideoFromZip(str, context), waitTimeDuration, playerVideoItem.getSkipFlag() == 1);
        }
        return videoConfiguration == null ? new VideoConfiguration(null, 0L, false, 7, null) : videoConfiguration;
    }
}
