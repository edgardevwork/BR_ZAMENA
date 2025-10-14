package com.blackhub.bronline.game.gui.electric.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.ivy.ant.IvyCleanCache;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ColorTrafficLight.kt */
/* loaded from: classes3.dex */
public final class ColorTrafficLight {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ ColorTrafficLight[] $VALUES;
    public static final ColorTrafficLight NONE = new ColorTrafficLight(IvyCleanCache.NONE, 0);
    public static final ColorTrafficLight RED = new ColorTrafficLight("RED", 1);
    public static final ColorTrafficLight YELLOW = new ColorTrafficLight("YELLOW", 2);
    public static final ColorTrafficLight GREEN = new ColorTrafficLight("GREEN", 3);

    public static final /* synthetic */ ColorTrafficLight[] $values() {
        return new ColorTrafficLight[]{NONE, RED, YELLOW, GREEN};
    }

    @NotNull
    public static EnumEntries<ColorTrafficLight> getEntries() {
        return $ENTRIES;
    }

    public static ColorTrafficLight valueOf(String str) {
        return (ColorTrafficLight) Enum.valueOf(ColorTrafficLight.class, str);
    }

    public static ColorTrafficLight[] values() {
        return (ColorTrafficLight[]) $VALUES.clone();
    }

    public ColorTrafficLight(String str, int i) {
    }

    static {
        ColorTrafficLight[] colorTrafficLightArr$values = $values();
        $VALUES = colorTrafficLightArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(colorTrafficLightArr$values);
    }
}

