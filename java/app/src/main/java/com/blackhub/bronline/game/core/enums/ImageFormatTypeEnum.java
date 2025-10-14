package com.blackhub.bronline.game.core.enums;

import com.blackhub.bronline.game.core.constants.FileFormats;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageFormatTypeEnum.kt */

public final class ImageFormatTypeEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ ImageFormatTypeEnum[] $VALUES;
    public static final ImageFormatTypeEnum PNG = new ImageFormatTypeEnum("PNG", 0, ".png");
    public static final ImageFormatTypeEnum SVG = new ImageFormatTypeEnum("SVG", 1, FileFormats.SVG_FORMAT);

    @NotNull
    public final String dotType;

    public static final /* synthetic */ ImageFormatTypeEnum[] $values() {
        return new ImageFormatTypeEnum[]{PNG, SVG};
    }

    @NotNull
    public static EnumEntries<ImageFormatTypeEnum> getEntries() {
        return $ENTRIES;
    }

    public static ImageFormatTypeEnum valueOf(String str) {
        return (ImageFormatTypeEnum) Enum.valueOf(ImageFormatTypeEnum.class, str);
    }

    public static ImageFormatTypeEnum[] values() {
        return (ImageFormatTypeEnum[]) $VALUES.clone();
    }

    public ImageFormatTypeEnum(String str, int i, String str2) {
        this.dotType = str2;
    }

    @NotNull
    public final String getDotType() {
        return this.dotType;
    }

    static {
        ImageFormatTypeEnum[] imageFormatTypeEnumArr$values = $values();
        $VALUES = imageFormatTypeEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(imageFormatTypeEnumArr$values);
    }
}

