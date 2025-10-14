package com.blackhub.bronline.game.gui.fishing.data.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.ivy.ant.IvyCleanCache;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioType.kt */
/* loaded from: classes.dex */
public final class AudioType {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ AudioType[] $VALUES;
    public static final AudioType NONE = new AudioType(IvyCleanCache.NONE, 0);
    public static final AudioType FISHING_FISH_BIT = new AudioType("FISHING_FISH_BIT", 1);

    public static final /* synthetic */ AudioType[] $values() {
        return new AudioType[]{NONE, FISHING_FISH_BIT};
    }

    @NotNull
    public static EnumEntries<AudioType> getEntries() {
        return $ENTRIES;
    }

    public static AudioType valueOf(String str) {
        return (AudioType) Enum.valueOf(AudioType.class, str);
    }

    public static AudioType[] values() {
        return (AudioType[]) $VALUES.clone();
    }

    public AudioType(String str, int i) {
    }

    static {
        AudioType[] audioTypeArr$values = $values();
        $VALUES = audioTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(audioTypeArr$values);
    }
}

