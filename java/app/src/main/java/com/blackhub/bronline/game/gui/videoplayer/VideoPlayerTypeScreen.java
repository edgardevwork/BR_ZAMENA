package com.blackhub.bronline.game.gui.videoplayer;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoPlayerTypeScreen.kt */
/* loaded from: classes3.dex */
public final class VideoPlayerTypeScreen {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ VideoPlayerTypeScreen[] $VALUES;
    public static final VideoPlayerTypeScreen MODAL_WINDOW = new VideoPlayerTypeScreen("MODAL_WINDOW", 0);
    public static final VideoPlayerTypeScreen PLAYER = new VideoPlayerTypeScreen("PLAYER", 1);

    public static final /* synthetic */ VideoPlayerTypeScreen[] $values() {
        return new VideoPlayerTypeScreen[]{MODAL_WINDOW, PLAYER};
    }

    @NotNull
    public static EnumEntries<VideoPlayerTypeScreen> getEntries() {
        return $ENTRIES;
    }

    public static VideoPlayerTypeScreen valueOf(String str) {
        return (VideoPlayerTypeScreen) Enum.valueOf(VideoPlayerTypeScreen.class, str);
    }

    public static VideoPlayerTypeScreen[] values() {
        return (VideoPlayerTypeScreen[]) $VALUES.clone();
    }

    public VideoPlayerTypeScreen(String str, int i) {
    }

    static {
        VideoPlayerTypeScreen[] videoPlayerTypeScreenArr$values = $values();
        $VALUES = videoPlayerTypeScreenArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(videoPlayerTypeScreenArr$values);
    }
}

